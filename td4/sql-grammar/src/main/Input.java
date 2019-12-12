package main;

import java.io.*;

public class Input {
	public static void main(String args[]) {
		Grammar grammar = new Grammar();
		DAO db = new DAO();
		String request = "";
		BufferedReader br = null;

		try {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("Request : ");
				
				String nlRequest = br.readLine();
				System.out.println("Request : " + nlRequest);
				
				String sqlRequest = grammar.analyze(nlRequest);
				System.out.println("SQL : " + sqlRequest);
				
				System.out.println("Results :");
				db.query(sqlRequest);
			} 
			catch(EOFException e) {
				br.close();
			}
		} 
		catch(IOException e) {
			System.out.println("IO Exception");
		}
	}
}