package com.lo17.test;

import com.lo17.syntaxer.SyntaxParser;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SyntaxParserTest {
    SyntaxParser parser = new SyntaxParser();
    Map<String, String> cases = new HashMap<String, String>();

    public SyntaxParserTest() {
        String[] infos = new String[]{"fichier", "rubrique"};

        for (String info : infos) {
            cases.put(
                    String.format("vouloir %s mot hexagon et date 2012", info),
                    String.format("select titretexte.%s from titretexte inner join date on (titretexte.fichier = date.fichier) where mot='hexagon' and annee='2012';", info)
            );
            cases.put(
                    String.format("vouloir %s titre mot hexagon et date 2012 et texte mot innovation", info),
                    String.format("select titre.%s from titre inner join date on (titre.fichier = date.fichier) inner join texte on (titre.fichier = texte.fichier) where mot='hexagon' and annee='2012';", info)
            );
//            cases.put(
//                    String.format("vouloir %s mot hexagon et innovation et date janvier 2012", info),
//                    String.format("Je veux les %s qui parlent de hexa et d'innovation et qui datent de janvier 2012.", info)
//            );
//            cases.put(
//                    String.format("vouloir %s mot innovation ou hexagon date janvier 2012 ou février 2013", info),
//                    String.format("Je veux les %s qui parlent d'innovation ou d'hexa, qui datent de janvier 2012 ou de février 2013.", info)
//            );
//            cases.put(
//                    String.format("vouloir %s date 22/03/2012", info),
//                    String.format("Je veux les %s qui datent du 22/03/2012.", info)
//            );
//            cases.put(
//                    String.format("vouloir %s et rubrique date avant 2015", info),
//                    String.format("Je veux les %s et les rubriques datant d'avant 2015.", info)
//            );
//            cases.put(
//                    String.format("vouloir %s date avant 2017 et après 2013", info),
//                    String.format("Je veux les %s datant d'avant 2017 et d'après 2013.", info)
//            );
//            cases.put(
//                    String.format("vouloir %s date entre 12/03/2012 et 06/05/2013", info),
//                    String.format("Je veux les %s datant entre le 12/03/2012 et le 06/05/2013.", info)
//            );
//            cases.put(
//                    String.format("vouloir %s rubrique news", info),
//                    String.format("Je veux les %s de la rubrique news.", info)
//            );
//            cases.put(
//                    String.format("vouloir %s et date fichier mot respect", info),
//                    String.format("Je veux les %s et les dates des articles parlant de respect.", info)
//            );
//            cases.put(
//                    String.format("vouloir %s rubrique focus février 2014", info),
//                    String.format("Je veux les %s de la rubrique focus de février 2014.", info)
//            );
//            cases.put(
//                    String.format("vouloir %s mot innovation", info),
//                    String.format("Quels sont les %s qui parlent d'innovation ?", info)
//            );
//            cases.put(
//                    String.format("vouloir %s mot hexagon", info),
//                    String.format("Quels sont les %s qui contiennent hexa ?", info)
//            );
//            cases.put(
//                    String.format("vouloir %s mot hexagon ou innovation entre 01/02/2014 et 01/05/2014", info),
//                    String.format("Quels sont les %s qui traitent d'hexa ou d'innovation entre le 01/02/2014 et le 01/05/2014 ?", info)
//            );
//            cases.put(
//                    String.format("combien %s date 2012", info),
//                    String.format("Combien d'%s datent de 2012 ?", info)
//            );
//            cases.put(
//                    String.format("combien %s mot hexagon", info),
//                    String.format("Combien d'%s parlent d'hexa ?", info)
//            );
//            cases.put(
//                    String.format("combien %s mot innovation ou hexagon et date entre 1945 et 2000", info),
//                    String.format("Combien d'%s contiennent les mots innovation ou hexa et ont été publiés entre 1945 et 2000 ?", info)
//            );
//            cases.put(
//                    String.format("combien %s mot hexagon ou innovation et date 01/01/2012", info),
//                    String.format("Combien d'%s parlent de hexa ou d'innovation et datent du 01/01/2012 ?", info)
//            );
        }
    }

    @Test
    public final void testProcess() {
        for (Map.Entry<String, String> pair : cases.entrySet()) {
            assertEquals(pair.getValue(), parser.process(pair.getKey()));
        }
    }
}