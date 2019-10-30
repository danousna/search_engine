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
                    String[] entry = chaine.split("\t");
                    System.out.println(entry[0]);
                    System.out.println(entry[1]);
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
        return Arrays.stream(numbers)
          .min().orElse(Integer.MAX_VALUE);
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
        int THRESHOLD = 4;
        String w = word;
        w.toLowerCase();

        List<String> candidates = new ArrayList<String>();

        if (this.lexicon.containsKey(w)) {
            candidates.add(this.lexicon.get(w));
        } else {
            for (String key : this.lexicon.keySet()) {
                if (Lexicon.countCommonLetters(w, key) >= THRESHOLD) {
                    candidates.add(this.lexicon.get(key));
                } 
                else {
                    // test levenshtein is positive
                    System.out.println("Levenshtein is " + Lexicon.levenshtein(w, key));
                }
            }
        } 

        return candidates;
    }

    public static void main (String[] args) {
        Lexicon lexicon = new Lexicon();
        StringTokenizer st = new StringTokenizer(args[0]);

        while (st.hasMoreTokens()) {
            lexicon.wordProcessing(st.nextToken());
        }
    }
}
