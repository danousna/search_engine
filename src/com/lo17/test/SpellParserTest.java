package com.lo17.test;

import com.lo17.speller.SpellParser;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SpellParserTest {
    SpellParser parser = new SpellParser();
    Map<String, String> cases = new HashMap<String, String>();

    public SpellParserTest() {
        Map<String, String> infoLexicon = new HashMap<String, String>();

        // The infos we can query from the DB.
        infoLexicon.put("page", "fichier");
        infoLexicon.put("article", "fichier");
        infoLexicon.put("articles", "fichier");
        infoLexicon.put("fichiers", "fichier");
        infoLexicon.put("rubrique", "rubrique");
        infoLexicon.put("rubriques", "rubrique");

        for (Map.Entry<String, String> pair : infoLexicon.entrySet()) {
            cases.put(
                    String.format("Je veux les %s qui parlent de hexa et qui datent de 2012.", pair.getKey()),
                    String.format("vouloir %s mot hexagon et date 2012", pair.getValue())
            );
            cases.put(
                    String.format("Je veux les %s qui parlent de hexa et d'innovation et qui datent de janvier 2012.", pair.getKey()),
                    String.format("vouloir %s mot hexagon et innovation et date janvier 2012", pair.getValue())
            );
            cases.put(
                    String.format("Je veux les %s qui parlent d'innovation ou d'hexa, qui datent de janvier 2012 ou de février 2013.", pair.getKey()),
                    String.format("vouloir %s mot innovation ou hexagon date janvier 2012 ou février 2013", pair.getValue())
            );
            cases.put(
                    String.format("Je veux les %s qui datent du 22/03/2012.", pair.getKey()),
                    String.format("vouloir %s date 22/03/2012", pair.getValue())
            );
            cases.put(
                    String.format("Je veux les %s et les rubriques datant d'avant 2015.", pair.getKey()),
                    String.format("vouloir %s et rubrique date avant 2015", pair.getValue())
            );
            cases.put(
                    String.format("Je veux les %s datant d'avant 2017 et d'après 2013.", pair.getKey()),
                    String.format("vouloir %s date avant 2017 et après 2013", pair.getValue())
            );
            cases.put(
                    String.format("Je veux les %s datant entre le 12/03/2012 et le 06/05/2013.", pair.getKey()),
                    String.format("vouloir %s date entre 12/03/2012 et 06/05/2013", pair.getValue())
            );
            cases.put(
                    String.format("Je veux les %s de la rubrique news.", pair.getKey()),
                    String.format("vouloir %s rubrique news", pair.getValue())
            );
            cases.put(
                    String.format("Je veux les %s et les dates des articles parlant de respect.", pair.getKey()),
                    String.format("vouloir %s et date fichier mot respect", pair.getValue())
            );
            cases.put(
                    String.format("Je veux les %s de la rubrique focus de février 2014.", pair.getKey()),
                    String.format("vouloir %s rubrique focus février 2014", pair.getValue())
            );
            cases.put(
                    String.format("Quels sont les %s qui parlent d'innovation ?", pair.getKey()),
                    String.format("vouloir %s mot innovation", pair.getValue())
            );
            cases.put(
                    String.format("Quels sont les %s qui contiennent hexa ?", pair.getKey()),
                    String.format("vouloir %s mot hexagon", pair.getValue())
            );
            cases.put(
                    String.format("Quels sont les %s qui traitent d'hexa ou d'innovation entre le 01/02/2014 et le 01/05/2014 ?", pair.getKey()),
                    String.format("vouloir %s mot hexagon ou innovation entre 01/02/2014 et 01/05/2014", pair.getValue())
            );
            cases.put(
                    String.format("Combien d'%s datent de 2012 ?", pair.getKey()),
                    String.format("combien %s date 2012", pair.getValue())
            );
            cases.put(
                    String.format("Combien d'%s parlent d'hexa ?", pair.getKey()),
                    String.format("combien %s mot hexagon", pair.getValue())
            );
            cases.put(
                    String.format("Combien d'%s contiennent les mots innovation ou hexa et ont été publiés entre 1945 et 2000 ?", pair.getKey()),
                    String.format("combien %s mot innovation ou hexagon et date entre 1945 et 2000", pair.getValue())
            );
            cases.put(
                    String.format("Combien d'%s parlent de hexa ou d'innovation et datent du 01/01/2012 ?", pair.getKey()),
                    String.format("combien %s mot hexagon ou innovation et date 01/01/2012", pair.getValue())
            );
        }
    }

    @Test
    public final void testProcess() {
        for (Map.Entry<String, String> pair : cases.entrySet()) {
            assertEquals(pair.getValue(), parser.process(pair.getKey()));
        }
    }
}
