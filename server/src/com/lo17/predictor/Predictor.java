package com.lo17.predictor;

import java.io.*;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Predictor {
    private static final Predictor instance = new Predictor();

    Map<String, Integer> data = new LinkedHashMap<>();

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
                        String[] entry = query.split(";");
                        data.put(entry[0], Integer.parseInt(entry[1]));
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

    public void saveQuery(String query, Integer resultsNumber) {
        if (resultsNumber == 0) {
            return;
        }

        if (!data.containsKey(query)) {
            try {
                File file = new File("/Users/Natan/Developer/search_engine_lo17/server/res/queries.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(query + ";" + resultsNumber + "\n");
                fileWriter.close();
                data.put(query, resultsNumber);
            } catch (IOException e) {
                System.out.println("IO Exception");
            }
        }
    }

    public Map<String, Integer> predict(String query) {
        return data.entrySet().stream()
                .filter(x -> x.getKey().startsWith(query))
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
