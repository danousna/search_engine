import java.io.*;
import java.util.*;

public class Lexicon {
    Map<String, String> lexicon = new HashMap<String, String>();
    String[] result;

    public Lexicon() {
        BufferedReader br = null;
        String chaine;
        
        try {
            try {
                br = new BufferedReader(new FileReader("lexicon.txt"));
                while ((chaine = br.readLine()) != null) {
                    String[] entry = chaine.split(";");
                    lexicon.put(entry[0], entry[1]);
                }
            }
            catch(EOFException e) {
                br.close();
            }
        } 
        catch(FileNotFoundException e) {
            System.out.println("Le fichier lexicon.txt n'a pas été trouvé.");
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
    }

    public static int min(int... numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }

    private static int countCommonLetters(String wordA, String wordB) {
        int n = 0;
        int length = Math.min(wordA.length(), wordB.length());
        for (int i = 0; i < length; i++) {
            if (wordA.charAt(i) != wordB.charAt(i)) {
                return n;
            } else {
                n++;
            }
        }
        return n;
    }

    private static int levenshtein(String wordA, String wordB) {
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

                    dp[i][j] = Lexicon.min(
                        dp[i - 1][j - 1] + costOfSubstitution,
                        dp[i - 1][j] + 1,
                        dp[i][j - 1] + 1
                    );
                }
            }
        }

        return dp[wordA.length()][wordB.length()];
    }

    private List<String> wordProcessing(String word) {
        int COMMON_LETTERS_THRESHOLD = 4;
        int LEVENSHTEIN_THESHOLD = 3;
        String w = word;
        w.toLowerCase();

        List<String> candidates = new ArrayList<String>();

        if (this.lexicon.containsKey(w)) {
            candidates.add(this.lexicon.get(w));
            return candidates;
        } else {
            // Find best common letters candidates.
            int maxCommonLetters = 0;
            for (String key : this.lexicon.keySet()) {
                int result = Lexicon.countCommonLetters(w, key);

                if (result >= COMMON_LETTERS_THRESHOLD) {
                    // If result is greater than previous max, the previous candidates are
                    // no longer the best, so we flush the array.
                    if (result > maxCommonLetters) {
                        maxCommonLetters = result;
                        candidates.clear();
                        candidates.add(this.lexicon.get(key));
                    } 
                    // If result is equal to previous max, we just add it, only if the lemme is 
                    // not already present.
                    else if (result == maxCommonLetters && !candidates.contains(this.lexicon.get(key))) {
                        candidates.add(this.lexicon.get(key));
                    }
                }
            }

            if (candidates.isEmpty() == false) {
                return candidates;
            }
            else {
                int minDistance = Integer.MAX_VALUE;
                for (String key : this.lexicon.keySet()) {
                    int result = Lexicon.levenshtein(w, key);

                    if (result <= key.length() / LEVENSHTEIN_THESHOLD) {
                        if (result < minDistance) {
                            minDistance = result;
                            candidates.clear();
                            candidates.add(this.lexicon.get(key));
                        }
                        else if (result == minDistance && !candidates.contains(this.lexicon.get(key))) {
                            candidates.add(this.lexicon.get(key));
                        }
                    }
                }

                if (candidates.isEmpty() == false) {
                    return candidates;
                }

                throw new Error("Aucun mot trouvé.");
            }
        }
    }

    public static void main (String[] args) {
        Lexicon lexicon = new Lexicon();
        String[] words = args[0].split("\\s");

        for (int i = 0; i < words.length; i++) {
            System.out.println(lexicon.wordProcessing(words[i]));
        }
    }
}
