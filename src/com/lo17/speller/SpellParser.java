package com.lo17.speller;

import java.io.*;
import java.util.*;

public class SpellParser {
    Map<String, String> keeplist = new HashMap<String, String>();
    Map<String, String> stoplist = new HashMap<String, String>();
    Map<String, String> structure = new HashMap<String, String>();

    void storeFileInHashMap(String filename, Map<String, String> hashmap) {
        BufferedReader br = null;
        String chaine;

        try {
            try {
                br = new BufferedReader(new FileReader(filename));
                while ((chaine = br.readLine()) != null) {
                    String[] entry = chaine.split(";");

                    try {
                        hashmap.put(entry[0], entry[1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        hashmap.put(entry[0], "");
                    }
                }
            }
            catch(EOFException e) {
                br.close();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Le fichier " + filename + " n'a pas été trouvé.");
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
    }

    public SpellParser() {
        storeFileInHashMap("src/com/lo17/speller/lexicons/keeplist.txt", keeplist);
        storeFileInHashMap("src/com/lo17/speller/lexicons/stoplist.txt", stoplist);
        storeFileInHashMap("src/com/lo17/speller/lexicons/structure.txt", structure);
    }

    public String process(String request) {
        CorpusLexer corpusLexer = new CorpusLexer();
        String[] words = request.split("\\s+|\\,+|\\'+|[\\-\\+\\$\\?\\.@&].*");
        List<String> result = new ArrayList<String>();

        boolean structFlag;
        boolean motFlag = false;

        for (int i = 0; i < words.length; i++) {
            //TODO: if first word is "qui", we keep it.

            structFlag = false;

            words[i] = words[i].toLowerCase();

            if (keeplist.containsKey(words[i])) {
                // Do nothing, we keep it.
            }
            // Même si motFlag est à true, on veux quand même passer dans la stoplist pour supprimer les mots inutiles
            // à la recherche ("parlant de innnovation", par ex, on veut enlever "de").
            else if (stoplist.containsKey(words[i])) {
                words[i] = stoplist.get(words[i]);
            }
            else if (structure.containsKey(words[i])) {
                // Si motFlag est true, on ne cherche pas à remplacer par un mot de structure
                if (!motFlag) {
                    words[i] = structure.get(words[i]);
                }
                structFlag = true;
            }
            // On lemmatise selon le CorpusLexer uniquement si on sur une recherche de mot.
            else if (motFlag) {
                // Check word is a valid number, if it is, we don't process it
                try {
                    Float.parseFloat(words[i]);
                } catch (NumberFormatException nf_e) {
                    List<String> candidates = new ArrayList<String>();
                    try {
                        candidates = corpusLexer.wordProcessing(words[i]);

                        if (candidates.size() == 1) {
                            words[i] = candidates.get(0);
                        }
                        else {
                            System.out.println("Plusieurs mots candidats ont été trouvés pour le mot " + words[i] + ". Faites votre choix :");
                            for (int j = 0; j < candidates.size(); j++) {
                                System.out.println("- " + candidates.get(j) + " (" + j + ")");
                            }

                            Scanner input = new Scanner(System.in);
                            int choice = input.nextInt();
                            words[i] = candidates.get(choice);
                        }
                    }
                    catch (Error e) {
                        // Do nothing, we do not replace the current word.
                    }
                }
            }

            System.out.println("word: " +  words[i] + ", motFlag: " + motFlag + ", structFlag: " + structFlag);

            // Si on rencontre le terme de structure mot, on met le flag à true et on saura par la suite
            // qu'il lemmatiser selon le lexique du corpus uniquement et ce, jusqu'à rencontrer une conjonction.
            if (words[i].equals("mot")) {
                motFlag = true;
            }
            // Si on rencontre un mot de structure qui n'est pas égal à "mot", on remet motFlag = false
            // car on ne veut pas lemmatiser la suite selon le lexique du corpus (ex: ce qui suit après "datant",
            // ne doit pas être lemmatisé).
            if (!words[i].equals("mot") && structFlag) {
                motFlag = false;
            }

            if (!words[i].equals("")) {
                result.add(words[i]);
            }
        }

        StringBuilder requestSimplified = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            requestSimplified.append(result.get(i));
            if (i != result.size() - 1) {
                requestSimplified.append(" ");
            }
        }

        return requestSimplified.toString();
    }

    public static void main (String[] args) {
        SpellParser parser = new SpellParser();
        BufferedReader br = null;

        try {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Request : ");
                String nlRequest = br.readLine();

                String result = parser.process(nlRequest);
                System.out.println("Result : " + result);
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
