// Generated from /Users/Natan/Developer/search_engine_lo17/server/src/com/lo17/syntaxer/SQL.g4 by ANTLR 4.7.2
package com.lo17.syntaxer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#requete}.
	 * @param ctx the parse tree
	 */
	void enterRequete(SQLParser.RequeteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#requete}.
	 * @param ctx the parse tree
	 */
	void exitRequete(SQLParser.RequeteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SQLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SQLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SQLParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SQLParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SQLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SQLParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#conj}.
	 * @param ctx the parse tree
	 */
	void enterConj(SQLParser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#conj}.
	 * @param ctx the parse tree
	 */
	void exitConj(SQLParser.ConjContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_date}.
	 * @param ctx the parse tree
	 */
	void enterVar_date(SQLParser.Var_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_date}.
	 * @param ctx the parse tree
	 */
	void exitVar_date(SQLParser.Var_dateContext ctx);
}