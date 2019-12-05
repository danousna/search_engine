package main;

import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

public class TalMain3 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Texte : ");
		String s = scanner.nextLine();
		System.out.println(s);
		while (!s.equals("*")) {
			try{
				sqlLexer lexer = new sqlLexer(new ANTLRReaderStream(new StringReader(s)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				sqlParser parser = new sqlParser(tokens);
				String arbre = parser.requete();
	            System.out.println(arbre);
			} catch(Exception e) {  
				
			}
			System.out.print("Texte : ");
			s = scanner.nextLine();
		}
	}

}
