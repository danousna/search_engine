package com.lo17.test.unit;

import com.lo17.speller.CorpusLexer;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CorpusLexerTest {
    public CorpusLexerTest() {

    }

    @Test
    public final void testProcess() {
        String word = "LARGES";
        Map<String, Double> cases = new HashMap<>();

        cases.put("LA", 0.0);
        cases.put("LARCIN", 0.0);
        cases.put("LARGE", 83.0);
        cases.put("LARGEMENT", 55.0);
        cases.put("LARGESSE", 75.0);
        cases.put("LAMENTABLEMENT", 0.0);

        for (Map.Entry<String, Double> pair : cases.entrySet()) {
            assertEquals((double) pair.getValue(), CorpusLexer.prefix(word, pair.getKey()), 0.7);
        }
    }
}
