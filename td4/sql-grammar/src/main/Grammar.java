package main;

import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class Grammar {	
	private String postProcessing(ANTLRReaderStream antlrStream) {
		String selects = "";
		String tables = " from ";
		String params = "";
		
		sqlLexer lexer = new sqlLexer(antlrStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		sqlParser parser = new sqlParser(tokens);
		try {
			Arbre tree = parser.requete().fils;
						
			while (tree != null) {
				if (tree.categorie == "select") {
					Arbre fils = tree.fils;
					do {
						selects += fils.mot;
						fils = fils.frere;
						// Si c'est le dernier fils, on ajoute pas de "and".
						if (fils != null) {
							selects += ", ";
						}
					} while (fils != null);
				}
				else if (tree.categorie == "params") {
					Arbre fils = tree.fils;
					String firstTableName = "";
					
					do {
						if (fils.categorie == "param") {
							Arbre param = fils.fils;
							do {
								if (param.categorie == "table") {																											
									if (firstTableName == "") {
										firstTableName = param.mot;
										tables += param.mot;
										
										// We know that almost all tables have these three columns (TODO: handle those that don't)
										// so the table that is referenced for these "confusing" columns is the first one.
										selects = selects.replace("fichier", param.mot + ".fichier");
										selects = selects.replace("rubrique", param.mot + ".rubrique");
										selects = selects.replace("numero", param.mot + ".numero");
									} else {
										tables += String.format(
												" inner join %s on (%s.fichier = %s.fichier)", 
												param.mot, 
												firstTableName, 
												param.mot
										);
									}
								} else if (param.categorie == "conj") {
									params += " " + param.fils.mot + " ";
								} else {
									if (param.categorie == "var_date") {
										// on parcours les fils et on append categorie et mot en séparant par un "and"
										Arbre paramDate = param.fils;
										do {
											params += paramDate.categorie + paramDate.mot;
											paramDate = paramDate.frere;
											
											// Si c'est le dernier fils, on ajoute pas de "and".
											if (paramDate != null) {
												params += " and ";
											}
										} while (paramDate != null);
										
									} else {
										params += param.categorie + param.mot;
									}
								}
								
								param = param.frere;
							} while (param != null);
						} else if (fils.categorie == "conj") {
							params += " " + fils.fils.mot + " ";
						}
						
						fils = fils.frere;
					} while (fils != null);
				}
				
				tree = tree.frere;
			}
			
			selects = "select " + selects;
			
			if (params != "") {
				params = " where " + params;
			}
			
			return selects + tables + params + ";";
		} catch (Exception e) {
			return e.toString();
		}
	}
	
	public String analyze(String request) {
		try {
			return postProcessing(new ANTLRReaderStream(new StringReader(request)));
		} catch (IOException e) {
			return e.toString();
		}
	}
	
	public static void main(String args[]) {
		Grammar g = new Grammar();
		Scanner scanner = new Scanner(System.in);

		String stop = "";
		while (!stop.equals("stop")) {
			System.out.print("Texte : ");
			String s = scanner.nextLine();
			try {
				String sql = g.postProcessing(new ANTLRReaderStream(new StringReader(s)));
				System.out.println(sql);
			} catch (IOException e) {
				
			}
			stop = scanner.nextLine();			
		}
	}

}
