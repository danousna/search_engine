package com.lo17.cli;

import com.lo17.database.SQLInterface;
import com.lo17.speller.SpellParser;
import com.lo17.speller.SpellParserResult;
import com.lo17.syntaxer.SyntaxParser;

import java.io.*;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SpellParser spellParser = new SpellParser();
        SyntaxParser syntaxParser = new SyntaxParser();
        SQLInterface sqlInterface = new SQLInterface();
        BufferedReader br = null;

        try {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Request : ");
                String nlRequest = br.readLine();

                SpellParserResult spellParserResult = spellParser.process(nlRequest);
                System.out.println("Simplified : " + spellParserResult.simplified);

                try {
                    String sqlRequest = syntaxParser.process(spellParserResult.simplified);
                    System.out.println("SQL : " + sqlRequest);

                    System.out.println();

                    System.out.println("Results :");
                    List<Map<String, String>> results = sqlInterface.query(sqlRequest);
                    for (Map<String, String> result : results) {
                        for (Map.Entry<String, String> entry : result.entrySet()) {
                            System.out.print(entry.getValue());
                        }
                        System.out.println();
                    }
                } catch (Exception e) {
                    System.err.println("Expression non valide.");
                }
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
