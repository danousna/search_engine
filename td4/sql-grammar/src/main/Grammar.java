package main;

import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class Grammar {	
	public String postProcessing(ANTLRReaderStream antlrStream) {
		String select = "select ";
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
						select += fils.mot;
						fils = fils.frere;
					} while (fils != null);
				}
				else if (tree.categorie == "params") {
					Arbre fils = tree.fils;
					do {
						if (fils.categorie == "param") {
							Arbre param = fils.fils;
							do {
								if (param.categorie == "table") {
									tables += param.mot + ", ";
								} else if (param.categorie == "conj") {
									
								} else {
									params += param.categorie + param.mot;
								}
								
								param = param.frere;
							} while (param != null);
						} else if (fils.categorie == "conj") {
							
						}
						
						fils = fils.frere;
					} while (fils != null);
				}
				
				tree = tree.frere;
			}
			
			// Remove last ','
			tables = tables.substring(0, tables.length() - 2);
			if (params != "") {
				params = " where " + params;
			}
			
			return select + tables + params;
		} catch (Exception e) {
			return e.toString();
		}
	}
	
	public static void main(String args[]) {
		Grammar g = new Grammar();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Texte : ");
		String s = scanner.nextLine();
		while (!s.equals("*")) {
			try {
				String sql = g.postProcessing(new ANTLRReaderStream(new StringReader(s)));
				System.out.println(sql);
			} catch (IOException e) {
				
			}
			s = scanner.nextLine();
		}
	}

}
