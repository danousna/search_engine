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
        Map<String, String> structureLexicon = parser.getStructure();

        for (Map.Entry<String, String> pair : structureLexicon.entrySet()) {
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
                    String.format("Combien d'%s parlent de hexa ou d'innovation et datent du 01/01/2012 ?", pair.getKey()),
                    String.format("combien %s mot hexagon ou innovation et date 01/01/2012", pair.getValue())
            );
        }
    }

    @Test
    public final void testProcess() {
        for (Map.Entry<String, String> pair : cases.entrySet()) {
            assertEquals(parser.process(pair.getKey()), pair.getValue());
        }
    }
}
