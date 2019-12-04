import java.io.*;
import java.util.*;

public class NLPTransformer {
    Map<String, String> stoplist = new HashMap<String, String>();
    Map<String, String> structure = new HashMap<String, String>();
    String[] result;

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

    public NLPTransformer() {
        storeFileInHashMap("stoplist.txt", stoplist);
        storeFileInHashMap("structure.txt", structure);
    }

    public List<String> process(String[] request) {
        List<String> result = new ArrayList<String>();

        for (int i = 0; i < request.length; i++) {
            request[i] = request[i].toLowerCase();
            
            if (stoplist.containsKey(request[i])) {
                request[i] = stoplist.get(request[i]);
            } else if (structure.containsKey(request[i])) {
                request[i] = structure.get(request[i]);
            } else {
                // Lexicon.java
            }

            if (request[i] != "") {
                result.add(request[i]);
                System.out.println(request[i]);
            }
        }

        return result;
    }

    public static void main (String[] args) {
        NLPTransformer transformer = new NLPTransformer();
        transformer.process(args[0].split("\\s"));
    }
}
