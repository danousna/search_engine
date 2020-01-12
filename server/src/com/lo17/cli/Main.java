package com.lo17.cli;

import com.lo17.database.SQLInterface;
import com.lo17.speller.SpellParser;
import com.lo17.speller.SpellParserResult;
import com.lo17.syntaxer.SyntaxParser;
import com.lo17.syntaxer.SyntaxParserResult;

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
                    SyntaxParserResult result = syntaxParser.process(spellParserResult.simplified);
                    System.out.println("SQL : " + result.sql);

                    System.out.println();

                    System.out.println("Results :");
                    List<Map<String, String>> results = sqlInterface.query(result.sql);
                    for (Map<String, String> entry : results) {
                        for (Map.Entry<String, String> subEntry : entry.entrySet()) {
                            System.out.print(subEntry.getValue());
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
