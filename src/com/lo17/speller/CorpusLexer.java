package com.lo17.speller;

import com.lo17.util.Utilities;

import java.io.*;
import java.net.URL;
import java.util.*;

public class CorpusLexer {
    Map<String, String> lexicon = new HashMap<String, String>();
    String[] result;

    public CorpusLexer() {
        BufferedReader br = null;
        String chaine;

        try {
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                URL corpusRes = classLoader.getResource("corpus.txt");

                if (corpusRes != null) {
                    br = new BufferedReader(new FileReader(corpusRes.getFile()));
                    while ((chaine = br.readLine()) != null) {
                        String[] entry = chaine.split(";");
                        lexicon.put(entry[0], entry[1]);
                    }
                }
            }
            catch(EOFException e) {
                br.close();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Le fichier res/corpus.txt n'a pas été trouvé.");
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
    }

    public static int min(int... numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }

    public static double prefix(String wordA, String wordB) {
        int MIN_LENGTH = 3; // on traite les mots supérieurs à 3 lettres.
        int MAX_DIFF_LENGTH = 4; // on accepte une différence de 4 lettres entre les deux mots au maximum.
        int MAX_COMMON_LETTERS = 4; // nombre de lettres communes pour que le résultat soit non nul.

        double result;

        // Si l'un des deux mots est trop court, pas nécessaire de continuer.
        // En effet, peu utile de comparer LARGE à LA.
        // Pareil si les deux sont petits : LA et LE, en théorie il ne sont plus là à ce niveau (stoplist)
        // Deplus, une seule lettre suffit à clairement les différencier.
        if (wordA.length() < MIN_LENGTH || wordB.length() < MIN_LENGTH) {
            result = 0;
        }
        else {
            // Si la différence de longueur entre les mots est trop grande, pas besoin de continuer
            // Logique...
            if (Math.abs(wordA.length() - wordB.length()) > MAX_DIFF_LENGTH) {
                result = 0;
            }
            else {
                int i = 0;

                // On compte le nombre de lettres communes.
                while (i < Math.min(wordA.length(), wordB.length()) && wordA.charAt(i) == wordB.charAt(i)) {
                    i = i + 1;
                }

                if (i < MAX_COMMON_LETTERS) {
                    result = 0;
                }
                else {
                    // On normalise le résultat en pourcentage.
                    result = ( (double) i / (double) (Math.max(wordA.length(), wordB.length()))) * 100;
                }
            }
        }

        return result;
    }

    public static int levenshtein(String wordA, String wordB) {
        int[][] dp = new int[wordA.length() + 1][wordB.length() + 1];
        int costOfSubstitution = 1;

        for (int i = 0; i <= wordA.length(); i++) {
            for (int j = 0; j <= wordB.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                else if (j == 0) {
                    dp[i][j] = i;
                }
                else {
                    if (wordA.charAt(i - 1) == wordB.charAt(j - 1)) {
                        costOfSubstitution = 0;
                    } else {
                        costOfSubstitution = 1;
                    }

                    dp[i][j] = CorpusLexer.min(
                            dp[i - 1][j - 1] + costOfSubstitution,
                            dp[i - 1][j] + 1,
                            dp[i][j - 1] + 1
                    );
                }
            }
        }

        return dp[wordA.length()][wordB.length()];
    }

    public List<String> process(String word) {
        int LEVENSHTEIN_THRESHOLD = 3;
        String w = word.toLowerCase();

        List<String> candidates = new ArrayList<String>();

        if (lexicon.containsKey(w)) {
            candidates.add(lexicon.get(w));
            return candidates;
        } else {
            // Recherche par préfixe.

            double maxCommonLetters = 0;

            for (String key : lexicon.keySet()) {
                double result = prefix(w, key);

                if (result == 0) {
                    continue;
                }

                // Si le resultat est supérieur à maxCommonLetters (donc 0 au début) dans la liste des candidats,
                // on change la valeur max, on vide la liste car les précédents candidats ne sont plus les meilleurs,
                // et on ajoute le lemme à la liste.
                // De cette manière, on fait directement le traitement pour trouver le meilleur candidat.
                if (result > maxCommonLetters) {
                    maxCommonLetters = result;
                    candidates.clear();
                    candidates.add(lexicon.get(key));
                }
                // Si le résultat est égal au précédent max, on ajoute juste le lemme à la liste seulement si il n'est
                // pas déjà présent.
                else if (result == maxCommonLetters && !candidates.contains(lexicon.get(key))) {
                    candidates.add(lexicon.get(key));
                }
            }

            if (!candidates.isEmpty()) {
                return candidates;
            }
            else {
                // Recherche par distance de Levenshtein.

                int minDistance = Integer.MAX_VALUE;
                for (String key : lexicon.keySet()) {
                    int result = CorpusLexer.levenshtein(w, key);

                    if (result <= key.length() / LEVENSHTEIN_THRESHOLD) {
                        if (result < minDistance) {
                            minDistance = result;
                            candidates.clear();
                            candidates.add(lexicon.get(key));
                        }
                        else if (result == minDistance && !candidates.contains(lexicon.get(key))) {
                            candidates.add(lexicon.get(key));
                        }
                    }
                }

                if (!candidates.isEmpty()) {
                    return candidates;
                }

                throw new Error("Aucun mot trouvé.");
            }
        }
    }

    public static void main (String[] args) {
        CorpusLexer corpusLexer = new CorpusLexer();
        String[] words = args[0].split("\\s");

        for (String word : words) {
            System.out.println(corpusLexer.process(word));
        }
    }
}
