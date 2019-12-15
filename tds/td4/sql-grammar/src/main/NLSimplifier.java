package main;

import java.io.*;
import java.util.*;

public class NLSimplifier {
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

    public NLSimplifier() {
        storeFileInHashMap("src/main/keeplist.txt", keeplist);
        storeFileInHashMap("src/main/stoplist.txt", stoplist);
        storeFileInHashMap("src/main/structure.txt", structure);
    }

    public String process(String request) {
    	Lexicon lexicon = new Lexicon();
    	String[] words = request.split("\\s");
    	List<String> result = new ArrayList<String>();
        
    	Boolean bypass = false;

        for (int i = 0; i < words.length; i++) {
            //TODO: if first word is "qui", we keep it.
            
        	words[i] = words[i].toLowerCase();
            
            if (keeplist.containsKey(words[i])) {
                // Do nothing
            } 
            else if (stoplist.containsKey(words[i])) {
            	words[i] = stoplist.get(words[i]);
            } 
            else if (structure.containsKey(words[i]) && bypass == false) {
            	words[i] = structure.get(words[i]);
            } 
            else {
                // Check word is a valid number, if it is, we don't process it
                try { 
                    Float.parseFloat(words[i]);  
                } catch (NumberFormatException nf_e) { 
                    List<String> candidates = new ArrayList<String>();
                    try {
                        candidates = lexicon.wordProcessing(words[i]);

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

            // Si le mot courant est le mot de structure "mot", la suite
            // n'est pas passée dans la liste de structure, ce qui permet de chercher
            // des termes présent dans la liste de stucture sans qu'ils soient transformés
            // par celle-ci.
            if (words[i].equals("mot")) {
                bypass = true;
            }

            if (words[i] != "") {
                result.add(words[i]);
            }
        }

        String requestSimplified = "";
        for (int i = 0; i < result.size(); i++) {
        	requestSimplified += result.get(i);
        	if (i != result.size() - 1) {
        		requestSimplified += " ";
        	}
        }
        
        return requestSimplified;
    }

    public static void main (String[] args) {
    	NLSimplifier simplifier = new NLSimplifier();
    	BufferedReader br = null;

		try {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("Request : ");
				
				String nlRequest = br.readLine();
				System.out.println("Request : " + nlRequest);
				
				String result = simplifier.process(nlRequest);
				System.out.println("Simplified : " + result);
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
