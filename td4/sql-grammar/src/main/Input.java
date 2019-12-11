package main;

import java.io.*;

public class Input {
	public static void main(String args[]) {
		DAO db = new DAO();
		String request = "";
		BufferedReader br = null;

		try {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("saisie : ");
				request = br.readLine();
				db.query(request);
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