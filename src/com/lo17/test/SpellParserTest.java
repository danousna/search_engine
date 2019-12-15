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
        cases.put(
            "Je veux les articles qui parlent de hexa et qui datent de 2012.",
            "vouloir fichier mot hexagon et date 2012"
        );
        cases.put(
            "Je veux les articles qui parlent de hexa et d'innovation et qui datent de janvier 2012.",
            "vouloir fichier mot hexagon et innovation et date janvier 2012"
        );
        cases.put(
            "Je veux les fichiers qui parlent d'innovation ou d'hexa, qui datent de janvier 2012 et de février 2013.",
            "vouloir fichier mot innovation ou hexagon date janvier 2012 et février 2013"
        );
        cases.put(
            "Combien d'articles parlent de hexa ou d'innovation et datent du 01/01/2012 ?",
            "combien fichier mot hexagon ou innovation et date 01/01/2012"
        );
    }

    @Test
    public final void testProcess() {
        for (Map.Entry<String, String> pair : cases.entrySet()) {
            assertEquals(parser.process(pair.getKey()), pair.getValue());
        }
    }
}
