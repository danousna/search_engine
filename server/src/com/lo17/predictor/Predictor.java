package com.lo17.predictor;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Predictor {
    private static final Predictor instance = new Predictor();

    List<String> data = new ArrayList<>();

    private Predictor() {
        BufferedReader br = null;
        String query;

        try {
            try {
                ClassLoader classLoader = getClass().getClassLoader();
                URL queriesRes = classLoader.getResource("queries.txt");

                if (queriesRes != null) {
                    br = new BufferedReader(new FileReader(queriesRes.getFile()));
                    while ((query = br.readLine()) != null) {
                        data.add(query);
                    }
                }
            }
            catch(EOFException e) {
                br.close();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Le fichier res/queries.txt n'a pas été trouvé.");
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
    }

    public static final Predictor getInstance() {
        return instance;
    }

    public void saveQuery(String query) {
        if (!data.contains(query)) {
            try {
                File file = new File("/Users/Natan/Developer/search_engine_lo17/server/res/queries.txt");
                System.out.println(file.getAbsolutePath());
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("\n" + query);
                fileWriter.close();
                data.add(query);
            } catch (IOException e) {
                System.out.println("IO Exception");
            }
        }
    }

    public List<String> predict(String query) {
        List<String> results = new ArrayList<>();
        for (String q : data) {
            if (q.startsWith(query)) {
                results.add(q);
            }
        }
        return results;
    }
}
