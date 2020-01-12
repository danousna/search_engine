package com.lo17.speller;

import java.util.List;
import java.util.Map;

public class SpellParserResult {
    public String simplified;
    public Map<String, List<String>> suggestions;

    SpellParserResult(String simplified, Map<String, List<String>> suggestions) {
        this.simplified = simplified;
        this.suggestions = suggestions;
    }
}
