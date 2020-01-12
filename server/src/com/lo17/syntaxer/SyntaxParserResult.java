package com.lo17.syntaxer;

public class SyntaxParserResult {
    public Arbre tree;
    public String sql;

    SyntaxParserResult(Arbre tree, String sql) {
        this.tree = tree;
        this.sql = sql;
    }
}
