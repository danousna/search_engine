package com.lo17.util;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

abstract public class Utilities {
    public static Map<String, String> csvImport(String filename) {
        Map<String, String> result = new HashMap<String, String>();
        BufferedReader br = null;
        String line;

        try {
            try {
                br = new BufferedReader(new FileReader(filename));
                while ((line = br.readLine()) != null) {
                    String[] entry = line.split(";");

                    try {
                        result.put(entry[0], entry[1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        result.put(entry[0], "");
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

        return result;
    }
}
