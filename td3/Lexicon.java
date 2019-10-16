import java.io.*;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;

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

    private List<String> wordProcessing(String word) {
        static int THRESHOLD = 4;
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
            }

            // Get best candidates

            if (candidates.size() == 0) { 
                // test levenshtein is positive
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
