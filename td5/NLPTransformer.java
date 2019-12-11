import java.io.*;
import java.util.*;

public class NLPTransformer {
    Map<String, String> keeplist = new HashMap<String, String>();
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
        storeFileInHashMap("keeplist.txt", keeplist);
        storeFileInHashMap("stoplist.txt", stoplist);
        storeFileInHashMap("structure.txt", structure);
    }

    public List<String> process(String[] request) {
        Lexicon lexicon = new Lexicon();
        List<String> result = new ArrayList<String>();
        Boolean bypass = false;

        for (int i = 0; i < request.length; i++) {
            //TODO: if first word is "qui", we keep it.
            
            request[i] = request[i].toLowerCase();
            
            if (keeplist.containsKey(request[i])) {
                // Do nothing
            } 
            else if (stoplist.containsKey(request[i])) {
                request[i] = stoplist.get(request[i]);
            } 
            else if (structure.containsKey(request[i]) && bypass == false) {
                request[i] = structure.get(request[i]);
            } 
            else {
                // Check word is a valid number, if it is, we don't process it
                try { 
                    Float.parseFloat(request[i]);  
                } catch (NumberFormatException nf_e) { 
                    List<String> candidates = new ArrayList<String>();
                    try {
                        candidates = lexicon.wordProcessing(request[i]);

                        if (candidates.size() == 1) {
                            request[i] = candidates.get(0);
                        }
                        else {
                            System.out.println("Plusieurs mots candidats ont été trouvés pour le mot " + request[i] + ". Faites votre choix :");
                            for (int j = 0; j < candidates.size(); j++) {
                                System.out.println("- " + candidates.get(j) + " (" + j + ")");
                            }

                            Scanner input = new Scanner(System.in);
                            int choice = input.nextInt();
                            request[i] = candidates.get(choice);
                        }
                    }
                    catch (Error e) {
                        // Do nothing, we do not replace the current word.
                    }
                }
            }

            // Si le mot courant est le mot de structure "mot", la suite
            // n'est pas passée dans la liste de structure, ce qui permet de chercher
            // des termes présent dans la liste de stucture sans qu'ils soient transformés
            // par celle-ci.
            if (request[i].equals("mot")) {
                bypass = true;
            }

            if (request[i] != "") {
                result.add(request[i]);
            }
        }

        return result;
    }

    public static void main (String[] args) {
        NLPTransformer transformer = new NLPTransformer();
        List<String> result = transformer.process(args[0].split("\\s"));
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
