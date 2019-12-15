package com.lo17.cli;

import com.lo17.database.SQLInterface;
import com.lo17.speller.SpellParser;
import com.lo17.syntaxer.SyntaxParser;

import java.io.*;

public class App {
    public static void main(String[] args) {
        SpellParser spellParser = new SpellParser();
        SyntaxParser syntaxParser = new SyntaxParser();
        SQLInterface db = new SQLInterface();
        BufferedReader br = null;

        try {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Request : ");
                String nlRequest = br.readLine();

                String correctedRequest = spellParser.process(nlRequest);
                System.out.println("Simplified : " + correctedRequest);

//                String sqlRequest = syntaxParser.analyze(correctedRequest);
//                System.out.println("SQL : " + sqlRequest);
//
//                System.out.println();
//
//                System.out.println("Results :");
//                db.query(sqlRequest);
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
