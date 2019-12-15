// Generated from /Users/Natan/Developer/search_engine_lo17/src/com/lo17/syntaxer/SQL.g4 by ANTLR 4.7.2
package com.lo17.syntaxer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, SELECT_ARTICLE=2, SELECT_BULLETIN=3, SELECT_DATE=4, SELECT_SHORT_DATE=5, 
		COUNT=6, CONJ_OR=7, CONJ_AND=8, MOT=9, MOT_TITRE=10, MOT_TEXTE=11, RUBRIQUE=12, 
		DATE=13, DATE_TO=14, DATE_BEFORE=15, DATE_FROM=16, DATE_AFTER=17, DATE_BETWEEN=18, 
		VAR_JOUR=19, VAR_ANNEE=20, VAR_DATE=21, VAR_MOIS_JANVIER=22, VAR_MOIS_FEVRIER=23, 
		VAR_MOIS_MARS=24, VAR_MOIS_AVRIL=25, VAR_MOIS_MAI=26, VAR_MOIS_JUIN=27, 
		VAR_MOIS_JUILLET=28, VAR_MOIS_AOUT=29, VAR_MOIS_SEPTEMBRE=30, VAR_MOIS_OCTOBRE=31, 
		VAR_MOIS_NOVEMBRE=32, VAR_MOIS_DECEMBRE=33, VAR_MOT=34, WS=35, POINT=36;
	public static final int
		RULE_requete = 0, RULE_select = 1, RULE_params = 2, RULE_param = 3, RULE_conj = 4, 
		RULE_var_date = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"requete", "select", "params", "param", "conj", "var_date"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'article'", "'bulletin'", "'date'", "'quand'", "'combien'", 
			"'ou'", null, null, "'titre'", "'texte'", "'rubrique'", "'datant'", "'jusque'", 
			"'avant'", "'depuis'", "'apres'", "'entre'", null, null, null, "'janvier'", 
			"'f\u00E9vrier'", "'mars'", "'avril'", "'mai'", "'juin'", "'juillet'", 
			"'ao\u00FBt'", "'septembre'", "'octobre'", "'novembre'", "'d\u00E9cembre'", 
			null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "SELECT_ARTICLE", "SELECT_BULLETIN", "SELECT_DATE", "SELECT_SHORT_DATE", 
			"COUNT", "CONJ_OR", "CONJ_AND", "MOT", "MOT_TITRE", "MOT_TEXTE", "RUBRIQUE", 
			"DATE", "DATE_TO", "DATE_BEFORE", "DATE_FROM", "DATE_AFTER", "DATE_BETWEEN", 
			"VAR_JOUR", "VAR_ANNEE", "VAR_DATE", "VAR_MOIS_JANVIER", "VAR_MOIS_FEVRIER", 
			"VAR_MOIS_MARS", "VAR_MOIS_AVRIL", "VAR_MOIS_MAI", "VAR_MOIS_JUIN", "VAR_MOIS_JUILLET", 
			"VAR_MOIS_AOUT", "VAR_MOIS_SEPTEMBRE", "VAR_MOIS_OCTOBRE", "VAR_MOIS_NOVEMBRE", 
			"VAR_MOIS_DECEMBRE", "VAR_MOT", "WS", "POINT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RequeteContext extends ParserRuleContext {
		public Arbre arbre = new Arbre("requete");
		public SelectContext var_select;
		public ParamsContext var_params;
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode POINT() { return getToken(SQLParser.POINT, 0); }
		public RequeteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRequete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRequete(this);
		}
	}

	public final RequeteContext requete() throws RecognitionException {
		RequeteContext _localctx = new RequeteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_requete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((RequeteContext)_localctx).var_select = select();
			 _localctx.arbre.ajouteFils(((RequeteContext)_localctx).var_select.arbre); 
			setState(14);
			((RequeteContext)_localctx).var_params = params();
			 _localctx.arbre.ajouteFils(((RequeteContext)_localctx).var_params.arbre); 
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(16);
				match(POINT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public Arbre arbre = new Arbre("select");
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public List<TerminalNode> SELECT_ARTICLE() { return getTokens(SQLParser.SELECT_ARTICLE); }
		public TerminalNode SELECT_ARTICLE(int i) {
			return getToken(SQLParser.SELECT_ARTICLE, i);
		}
		public List<TerminalNode> SELECT_BULLETIN() { return getTokens(SQLParser.SELECT_BULLETIN); }
		public TerminalNode SELECT_BULLETIN(int i) {
			return getToken(SQLParser.SELECT_BULLETIN, i);
		}
		public List<TerminalNode> SELECT_DATE() { return getTokens(SQLParser.SELECT_DATE); }
		public TerminalNode SELECT_DATE(int i) {
			return getToken(SQLParser.SELECT_DATE, i);
		}
		public List<TerminalNode> RUBRIQUE() { return getTokens(SQLParser.RUBRIQUE); }
		public TerminalNode RUBRIQUE(int i) {
			return getToken(SQLParser.RUBRIQUE, i);
		}
		public List<TerminalNode> CONJ_AND() { return getTokens(SQLParser.CONJ_AND); }
		public TerminalNode CONJ_AND(int i) {
			return getToken(SQLParser.CONJ_AND, i);
		}
		public TerminalNode SELECT_SHORT_DATE() { return getToken(SQLParser.SELECT_SHORT_DATE, 0); }
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(19);
				match(SELECT);
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT_ARTICLE:
					{
					setState(20);
					match(SELECT_ARTICLE);
					 _localctx.arbre.ajouteFils(new Arbre("", "fichier")); 
					}
					break;
				case SELECT_BULLETIN:
					{
					setState(22);
					match(SELECT_BULLETIN);
					 _localctx.arbre.ajouteFils(new Arbre("", "numero")); 
					}
					break;
				case SELECT_DATE:
					{
					setState(24);
					match(SELECT_DATE);
					 _localctx.arbre.ajouteFils(new Arbre("", "date")); 
					}
					break;
				case RUBRIQUE:
					{
					setState(26);
					match(RUBRIQUE);
					 _localctx.arbre.ajouteFils(new Arbre("", "rubrique")); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONJ_AND) {
					{
					{
					setState(30);
					match(CONJ_AND);
					setState(39);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT_ARTICLE:
						{
						setState(31);
						match(SELECT_ARTICLE);
						 _localctx.arbre.ajouteFils(new Arbre("", ", fichier")); 
						}
						break;
					case SELECT_BULLETIN:
						{
						setState(33);
						match(SELECT_BULLETIN);
						 _localctx.arbre.ajouteFils(new Arbre("", ", numero")); 
						}
						break;
					case SELECT_DATE:
						{
						setState(35);
						match(SELECT_DATE);
						 _localctx.arbre.ajouteFils(new Arbre("", ", date")); 
						}
						break;
					case RUBRIQUE:
						{
						setState(37);
						match(RUBRIQUE);
						 _localctx.arbre.ajouteFils(new Arbre("", "rubrique")); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case SELECT_SHORT_DATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(SELECT_SHORT_DATE);
				 _localctx.arbre.ajouteFils(new Arbre("", "date")); 
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(48);
				match(COUNT);
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT_ARTICLE:
					{
					setState(49);
					match(SELECT_ARTICLE);
					 _localctx.arbre.ajouteFils(new Arbre("", "count(fichier)")); 
					}
					break;
				case SELECT_BULLETIN:
					{
					setState(51);
					match(SELECT_BULLETIN);
					 _localctx.arbre.ajouteFils(new Arbre("", "count(numero)")); 
					}
					break;
				case RUBRIQUE:
					{
					setState(53);
					match(RUBRIQUE);
					 _localctx.arbre.ajouteFils(new Arbre("", "count(rubrique)")); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public Arbre arbre = new Arbre("params");
		public ParamContext par1;
		public ConjContext conj1;
		public ParamContext par2;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<ConjContext> conj() {
			return getRuleContexts(ConjContext.class);
		}
		public ConjContext conj(int i) {
			return getRuleContext(ConjContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((ParamsContext)_localctx).par1 = param();

			        _localctx.arbre.ajouteFils(((ParamsContext)_localctx).par1.arbre);
			    
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONJ_OR) | (1L << CONJ_AND) | (1L << MOT) | (1L << RUBRIQUE) | (1L << DATE) | (1L << DATE_TO) | (1L << DATE_BEFORE) | (1L << DATE_FROM) | (1L << DATE_AFTER) | (1L << DATE_BETWEEN))) != 0)) {
				{
				{
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONJ_OR || _la==CONJ_AND) {
					{
					setState(61);
					((ParamsContext)_localctx).conj1 = conj();

					                _localctx.arbre.ajouteFils(((ParamsContext)_localctx).conj1.arbre);
					            
					}
				}

				setState(66);
				((ParamsContext)_localctx).par2 = param();

				            _localctx.arbre.ajouteFils(((ParamsContext)_localctx).par2.arbre);
				        
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public Arbre arbre = new Arbre("param");
		public Token var_mot_1;
		public ConjContext conj1;
		public Token var_mot_2;
		public Token var_rubrique_1;
		public Var_dateContext var_date_1;
		public Var_dateContext var_date_2;
		public Token var_date_comp;
		public List<TerminalNode> MOT() { return getTokens(SQLParser.MOT); }
		public TerminalNode MOT(int i) {
			return getToken(SQLParser.MOT, i);
		}
		public TerminalNode MOT_TEXTE() { return getToken(SQLParser.MOT_TEXTE, 0); }
		public TerminalNode MOT_TITRE() { return getToken(SQLParser.MOT_TITRE, 0); }
		public List<TerminalNode> VAR_MOT() { return getTokens(SQLParser.VAR_MOT); }
		public TerminalNode VAR_MOT(int i) {
			return getToken(SQLParser.VAR_MOT, i);
		}
		public List<ConjContext> conj() {
			return getRuleContexts(ConjContext.class);
		}
		public ConjContext conj(int i) {
			return getRuleContext(ConjContext.class,i);
		}
		public TerminalNode RUBRIQUE() { return getToken(SQLParser.RUBRIQUE, 0); }
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
		public List<Var_dateContext> var_date() {
			return getRuleContexts(Var_dateContext.class);
		}
		public Var_dateContext var_date(int i) {
			return getRuleContext(Var_dateContext.class,i);
		}
		public TerminalNode DATE_TO() { return getToken(SQLParser.DATE_TO, 0); }
		public TerminalNode DATE_BEFORE() { return getToken(SQLParser.DATE_BEFORE, 0); }
		public TerminalNode DATE_FROM() { return getToken(SQLParser.DATE_FROM, 0); }
		public TerminalNode DATE_AFTER() { return getToken(SQLParser.DATE_AFTER, 0); }
		public TerminalNode CONJ_AND() { return getToken(SQLParser.CONJ_AND, 0); }
		public TerminalNode DATE_BETWEEN() { return getToken(SQLParser.DATE_BETWEEN, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		int _la;
		try {
			int _alt;
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(74);
				match(MOT);
				 _localctx.arbre.ajouteFils(new Arbre("table", "titretexte")); 
				setState(76);
				((ParamContext)_localctx).var_mot_1 = match(VAR_MOT);

						    _localctx.arbre.ajouteFils(new Arbre("mot=", "'" + ((ParamContext)_localctx).var_mot_1.getText() + "'"));
						
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONJ_OR || _la==CONJ_AND) {
					{
					{
					setState(78);
					((ParamContext)_localctx).conj1 = conj();
					 _localctx.arbre.ajouteFils(((ParamContext)_localctx).conj1.arbre); 
					setState(80);
					((ParamContext)_localctx).var_mot_2 = match(VAR_MOT);

								    _localctx.arbre.ajouteFils(new Arbre("mot=", "'" + ((ParamContext)_localctx).var_mot_2.getText() + "'"));
								
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				{
				setState(88);
				match(MOT_TEXTE);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MOT) {
					{
					setState(89);
					match(MOT);
					}
				}


							_localctx.arbre.ajouteFils(new Arbre("table", "texte"));
						
				setState(93);
				((ParamContext)_localctx).var_mot_1 = match(VAR_MOT);
				 _localctx.arbre.ajouteFils(new Arbre("mot=", "'"+((ParamContext)_localctx).var_mot_1.getText()+"'")); 
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONJ_OR || _la==CONJ_AND) {
					{
					{
					setState(95);
					((ParamContext)_localctx).conj1 = conj();
					 _localctx.arbre.ajouteFils(((ParamContext)_localctx).conj1.arbre); 
					setState(97);
					((ParamContext)_localctx).var_mot_2 = match(VAR_MOT);
					 _localctx.arbre.ajouteFils(new Arbre("mot=", "'"+((ParamContext)_localctx).var_mot_2.getText()+"'")); 
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				{
				setState(105);
				match(MOT_TITRE);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MOT) {
					{
					setState(106);
					match(MOT);
					}
				}


							_localctx.arbre.ajouteFils(new Arbre("table", "titre"));
						
				setState(110);
				((ParamContext)_localctx).var_mot_1 = match(VAR_MOT);
				 _localctx.arbre.ajouteFils(new Arbre("mot=", "'"+((ParamContext)_localctx).var_mot_1.getText()+"'")); 
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(112);
						((ParamContext)_localctx).conj1 = conj();
						 _localctx.arbre.ajouteFils(((ParamContext)_localctx).conj1.arbre); 
						setState(114);
						((ParamContext)_localctx).var_mot_2 = match(VAR_MOT);
						 _localctx.arbre.ajouteFils(new Arbre("mot=", "'"+((ParamContext)_localctx).var_mot_2.getText()+"'")); 
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				}
				break;
			case RUBRIQUE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(122);
				match(RUBRIQUE);
				 _localctx.arbre.ajouteFils(new Arbre("table", "rubrique")); 
				setState(124);
				((ParamContext)_localctx).var_rubrique_1 = match(VAR_MOT);
				 _localctx.arbre.ajouteFils(new Arbre("rubrique=", "'"+((ParamContext)_localctx).var_rubrique_1.getText()+"'")); 
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(126);
						((ParamContext)_localctx).conj1 = conj();
						 _localctx.arbre.ajouteFils(((ParamContext)_localctx).conj1.arbre); 
						setState(128);
						((ParamContext)_localctx).var_rubrique_1 = match(VAR_MOT);
						 _localctx.arbre.ajouteFils(new Arbre("rubrique=", "'"+((ParamContext)_localctx).var_rubrique_1.getText()+"'")); 
						}
						} 
					}
					setState(135);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(136);
				match(DATE);

							_localctx.arbre.ajouteFils(new Arbre("table", "date"));
						
				setState(138);
				((ParamContext)_localctx).var_date_1 = var_date();
				 _localctx.arbre.ajouteFils(((ParamContext)_localctx).var_date_1.arbre); 
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(140);
						((ParamContext)_localctx).conj1 = conj();
						 _localctx.arbre.ajouteFils(((ParamContext)_localctx).conj1.arbre); 
						setState(142);
						((ParamContext)_localctx).var_date_2 = var_date();
						 _localctx.arbre.ajouteFils(((ParamContext)_localctx).var_date_2.arbre); 
						}
						} 
					}
					setState(149);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				}
				break;
			case DATE_TO:
			case DATE_BEFORE:
			case DATE_FROM:
			case DATE_AFTER:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATE_TO:
					{
					setState(150);
					match(DATE_TO);

									_localctx.arbre.ajouteFils(new Arbre("table", "date"));
									_localctx.arbre.ajouteFils(new Arbre("comp", "<="));
								
					}
					break;
				case DATE_BEFORE:
					{
					setState(152);
					match(DATE_BEFORE);

									_localctx.arbre.ajouteFils(new Arbre("table", "date"));
									_localctx.arbre.ajouteFils(new Arbre("comp", "<"));
								
					}
					break;
				case DATE_FROM:
					{
					setState(154);
					match(DATE_FROM);

									_localctx.arbre.ajouteFils(new Arbre("table", "date"));
									_localctx.arbre.ajouteFils(new Arbre("comp", ">="));
								
					}
					break;
				case DATE_AFTER:
					{
					setState(156);
					match(DATE_AFTER);

									_localctx.arbre.ajouteFils(new Arbre("table", "date"));
									_localctx.arbre.ajouteFils(new Arbre("comp", ">"));
								
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160);
				((ParamContext)_localctx).var_date_1 = var_date();

							_localctx.arbre.ajouteFils(((ParamContext)_localctx).var_date_1.arbre);
						
				}
				}
				break;
			case DATE_BETWEEN:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(163);
				((ParamContext)_localctx).var_date_comp = match(DATE_BETWEEN);
				setState(164);
				((ParamContext)_localctx).var_date_1 = var_date();
				setState(165);
				match(CONJ_AND);
				setState(166);
				((ParamContext)_localctx).var_date_2 = var_date();

							_localctx.arbre.ajouteFils(new Arbre("table", "date"));
							_localctx.arbre.ajouteFils(new Arbre("comp", ">="));
							_localctx.arbre.ajouteFils(((ParamContext)_localctx).var_date_1.arbre);
							_localctx.arbre.ajouteFils(new Arbre("", "and"));
							_localctx.arbre.ajouteFils(new Arbre("comp", "<"));
							_localctx.arbre.ajouteFils(((ParamContext)_localctx).var_date_2.arbre);
						
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjContext extends ParserRuleContext {
		public Arbre arbre = new Arbre("conj");
		public TerminalNode CONJ_OR() { return getToken(SQLParser.CONJ_OR, 0); }
		public TerminalNode CONJ_AND() { return getToken(SQLParser.CONJ_AND, 0); }
		public ConjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterConj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitConj(this);
		}
	}

	public final ConjContext conj() throws RecognitionException {
		ConjContext _localctx = new ConjContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conj);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONJ_OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(CONJ_OR);

						_localctx.arbre.ajouteFils(new Arbre("", "or"));
					
				}
				break;
			case CONJ_AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(CONJ_AND);

						_localctx.arbre.ajouteFils(new Arbre("", "and"));
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_dateContext extends ParserRuleContext {
		public Arbre arbre = new Arbre("var_date");
		public Token var1;
		public TerminalNode VAR_ANNEE() { return getToken(SQLParser.VAR_ANNEE, 0); }
		public TerminalNode VAR_MOIS_JANVIER() { return getToken(SQLParser.VAR_MOIS_JANVIER, 0); }
		public TerminalNode VAR_MOIS_FEVRIER() { return getToken(SQLParser.VAR_MOIS_FEVRIER, 0); }
		public TerminalNode VAR_MOIS_MARS() { return getToken(SQLParser.VAR_MOIS_MARS, 0); }
		public TerminalNode VAR_MOIS_AVRIL() { return getToken(SQLParser.VAR_MOIS_AVRIL, 0); }
		public TerminalNode VAR_MOIS_MAI() { return getToken(SQLParser.VAR_MOIS_MAI, 0); }
		public TerminalNode VAR_MOIS_JUIN() { return getToken(SQLParser.VAR_MOIS_JUIN, 0); }
		public TerminalNode VAR_MOIS_JUILLET() { return getToken(SQLParser.VAR_MOIS_JUILLET, 0); }
		public TerminalNode VAR_MOIS_AOUT() { return getToken(SQLParser.VAR_MOIS_AOUT, 0); }
		public TerminalNode VAR_MOIS_SEPTEMBRE() { return getToken(SQLParser.VAR_MOIS_SEPTEMBRE, 0); }
		public TerminalNode VAR_MOIS_OCTOBRE() { return getToken(SQLParser.VAR_MOIS_OCTOBRE, 0); }
		public TerminalNode VAR_MOIS_NOVEMBRE() { return getToken(SQLParser.VAR_MOIS_NOVEMBRE, 0); }
		public TerminalNode VAR_MOIS_DECEMBRE() { return getToken(SQLParser.VAR_MOIS_DECEMBRE, 0); }
		public TerminalNode VAR_JOUR() { return getToken(SQLParser.VAR_JOUR, 0); }
		public TerminalNode VAR_DATE() { return getToken(SQLParser.VAR_DATE, 0); }
		public Var_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_date(this);
		}
	}

	public final Var_dateContext var_date() throws RecognitionException {
		Var_dateContext _localctx = new Var_dateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_date);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_ANNEE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(177);
				((Var_dateContext)_localctx).var1 = match(VAR_ANNEE);

							_localctx.arbre.ajouteFils(new Arbre("annee=", "'" + ((Var_dateContext)_localctx).var1.getText() + "'"));
						
				}
				}
				break;
			case VAR_JOUR:
			case VAR_MOIS_JANVIER:
			case VAR_MOIS_FEVRIER:
			case VAR_MOIS_MARS:
			case VAR_MOIS_AVRIL:
			case VAR_MOIS_MAI:
			case VAR_MOIS_JUIN:
			case VAR_MOIS_JUILLET:
			case VAR_MOIS_AOUT:
			case VAR_MOIS_SEPTEMBRE:
			case VAR_MOIS_OCTOBRE:
			case VAR_MOIS_NOVEMBRE:
			case VAR_MOIS_DECEMBRE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR_JOUR) {
					{
					setState(179);
					((Var_dateContext)_localctx).var1 = match(VAR_JOUR);

									_localctx.arbre.ajouteFils(new Arbre("jour=", "'"+((Var_dateContext)_localctx).var1.getText()+"'"));
								
					}
				}

				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_MOIS_JANVIER:
					{
					setState(183);
					match(VAR_MOIS_JANVIER);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'01'")); 
					}
					break;
				case VAR_MOIS_FEVRIER:
					{
					setState(185);
					match(VAR_MOIS_FEVRIER);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'02'")); 
					}
					break;
				case VAR_MOIS_MARS:
					{
					setState(187);
					match(VAR_MOIS_MARS);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'03'")); 
					}
					break;
				case VAR_MOIS_AVRIL:
					{
					setState(189);
					match(VAR_MOIS_AVRIL);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'04'")); 
					}
					break;
				case VAR_MOIS_MAI:
					{
					setState(191);
					match(VAR_MOIS_MAI);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'05'")); 
					}
					break;
				case VAR_MOIS_JUIN:
					{
					setState(193);
					match(VAR_MOIS_JUIN);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'06'")); 
					}
					break;
				case VAR_MOIS_JUILLET:
					{
					setState(195);
					match(VAR_MOIS_JUILLET);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'07'")); 
					}
					break;
				case VAR_MOIS_AOUT:
					{
					setState(197);
					match(VAR_MOIS_AOUT);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'08'")); 
					}
					break;
				case VAR_MOIS_SEPTEMBRE:
					{
					setState(199);
					match(VAR_MOIS_SEPTEMBRE);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'09'")); 
					}
					break;
				case VAR_MOIS_OCTOBRE:
					{
					setState(201);
					match(VAR_MOIS_OCTOBRE);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'10'")); 
					}
					break;
				case VAR_MOIS_NOVEMBRE:
					{
					setState(203);
					match(VAR_MOIS_NOVEMBRE);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'11'")); 
					}
					break;
				case VAR_MOIS_DECEMBRE:
					{
					setState(205);
					match(VAR_MOIS_DECEMBRE);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'12'")); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209);
				((Var_dateContext)_localctx).var1 = match(VAR_ANNEE);

							_localctx.arbre.ajouteFils(new Arbre("annee=", "'"+((Var_dateContext)_localctx).var1.getText()+"'"));
						
				}
				}
				break;
			case VAR_DATE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(211);
				((Var_dateContext)_localctx).var1 = match(VAR_DATE);

							_localctx.arbre.ajouteFils(new Arbre("date=", "'"+((Var_dateContext)_localctx).var1.getText()+"'"));
						
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3:\n\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\4\3\4"+
		"\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5V"+
		"\n\5\f\5\16\5Y\13\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5g\n\5\f\5\16\5j\13\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0086"+
		"\n\5\f\5\16\5\u0089\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0094"+
		"\n\5\f\5\16\5\u0097\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a1\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ac\n\5\3\6\3\6\3\6\3\6\5\6"+
		"\u00b2\n\6\3\7\3\7\3\7\3\7\5\7\u00b8\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00d2\n\7\3\7\3\7\3\7\3\7\5\7\u00d8\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2\u00fe"+
		"\2\16\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\b\u00ab\3\2\2\2\n\u00b1\3\2\2\2\f"+
		"\u00d7\3\2\2\2\16\17\5\4\3\2\17\20\b\2\1\2\20\21\5\6\4\2\21\23\b\2\1\2"+
		"\22\24\7&\2\2\23\22\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\36\7\3\2\2\26"+
		"\27\7\4\2\2\27\37\b\3\1\2\30\31\7\5\2\2\31\37\b\3\1\2\32\33\7\6\2\2\33"+
		"\37\b\3\1\2\34\35\7\16\2\2\35\37\b\3\1\2\36\26\3\2\2\2\36\30\3\2\2\2\36"+
		"\32\3\2\2\2\36\34\3\2\2\2\37-\3\2\2\2 )\7\n\2\2!\"\7\4\2\2\"*\b\3\1\2"+
		"#$\7\5\2\2$*\b\3\1\2%&\7\6\2\2&*\b\3\1\2\'(\7\16\2\2(*\b\3\1\2)!\3\2\2"+
		"\2)#\3\2\2\2)%\3\2\2\2)\'\3\2\2\2*,\3\2\2\2+ \3\2\2\2,/\3\2\2\2-+\3\2"+
		"\2\2-.\3\2\2\2.<\3\2\2\2/-\3\2\2\2\60\61\7\7\2\2\61<\b\3\1\2\629\7\b\2"+
		"\2\63\64\7\4\2\2\64:\b\3\1\2\65\66\7\5\2\2\66:\b\3\1\2\678\7\16\2\28:"+
		"\b\3\1\29\63\3\2\2\29\65\3\2\2\29\67\3\2\2\2:<\3\2\2\2;\25\3\2\2\2;\60"+
		"\3\2\2\2;\62\3\2\2\2<\5\3\2\2\2=>\5\b\5\2>I\b\4\1\2?@\5\n\6\2@A\b\4\1"+
		"\2AC\3\2\2\2B?\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\b\5\2EF\b\4\1\2FH\3\2\2"+
		"\2GB\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LM\7\13"+
		"\2\2MN\b\5\1\2NO\7$\2\2OW\b\5\1\2PQ\5\n\6\2QR\b\5\1\2RS\7$\2\2ST\b\5\1"+
		"\2TV\3\2\2\2UP\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2"+
		"\2Z\\\7\r\2\2[]\7\13\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\5\1\2_`\7"+
		"$\2\2`h\b\5\1\2ab\5\n\6\2bc\b\5\1\2cd\7$\2\2de\b\5\1\2eg\3\2\2\2fa\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2km\7\f\2\2ln\7\13"+
		"\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\5\1\2pq\7$\2\2qy\b\5\1\2rs\5\n"+
		"\6\2st\b\5\1\2tu\7$\2\2uv\b\5\1\2vx\3\2\2\2wr\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z\u00ac\3\2\2\2{y\3\2\2\2|}\7\16\2\2}~\b\5\1\2~\177\7$\2"+
		"\2\177\u0087\b\5\1\2\u0080\u0081\5\n\6\2\u0081\u0082\b\5\1\2\u0082\u0083"+
		"\7$\2\2\u0083\u0084\b\5\1\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u00ac\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\17\2\2\u008b\u008c\b\5\1\2\u008c"+
		"\u008d\5\f\7\2\u008d\u0095\b\5\1\2\u008e\u008f\5\n\6\2\u008f\u0090\b\5"+
		"\1\2\u0090\u0091\5\f\7\2\u0091\u0092\b\5\1\2\u0092\u0094\3\2\2\2\u0093"+
		"\u008e\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u00ac\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\20\2\2\u0099"+
		"\u00a1\b\5\1\2\u009a\u009b\7\21\2\2\u009b\u00a1\b\5\1\2\u009c\u009d\7"+
		"\22\2\2\u009d\u00a1\b\5\1\2\u009e\u009f\7\23\2\2\u009f\u00a1\b\5\1\2\u00a0"+
		"\u0098\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\b\5\1\2\u00a4"+
		"\u00ac\3\2\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\7"+
		"\n\2\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa\b\5\1\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"L\3\2\2\2\u00ab|\3\2\2\2\u00ab\u008a\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab"+
		"\u00a5\3\2\2\2\u00ac\t\3\2\2\2\u00ad\u00ae\7\t\2\2\u00ae\u00b2\b\6\1\2"+
		"\u00af\u00b0\7\n\2\2\u00b0\u00b2\b\6\1\2\u00b1\u00ad\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\13\3\2\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00d8\b\7\1\2\u00b5"+
		"\u00b6\7\25\2\2\u00b6\u00b8\b\7\1\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3"+
		"\2\2\2\u00b8\u00d1\3\2\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00d2\b\7\1\2\u00bb"+
		"\u00bc\7\31\2\2\u00bc\u00d2\b\7\1\2\u00bd\u00be\7\32\2\2\u00be\u00d2\b"+
		"\7\1\2\u00bf\u00c0\7\33\2\2\u00c0\u00d2\b\7\1\2\u00c1\u00c2\7\34\2\2\u00c2"+
		"\u00d2\b\7\1\2\u00c3\u00c4\7\35\2\2\u00c4\u00d2\b\7\1\2\u00c5\u00c6\7"+
		"\36\2\2\u00c6\u00d2\b\7\1\2\u00c7\u00c8\7\37\2\2\u00c8\u00d2\b\7\1\2\u00c9"+
		"\u00ca\7 \2\2\u00ca\u00d2\b\7\1\2\u00cb\u00cc\7!\2\2\u00cc\u00d2\b\7\1"+
		"\2\u00cd\u00ce\7\"\2\2\u00ce\u00d2\b\7\1\2\u00cf\u00d0\7#\2\2\u00d0\u00d2"+
		"\b\7\1\2\u00d1\u00b9\3\2\2\2\u00d1\u00bb\3\2\2\2\u00d1\u00bd\3\2\2\2\u00d1"+
		"\u00bf\3\2\2\2\u00d1\u00c1\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1\u00c5\3\2"+
		"\2\2\u00d1\u00c7\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1"+
		"\u00cd\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\26"+
		"\2\2\u00d4\u00d8\b\7\1\2\u00d5\u00d6\7\27\2\2\u00d6\u00d8\b\7\1\2\u00d7"+
		"\u00b3\3\2\2\2\u00d7\u00b7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\r\3\2\2\2"+
		"\27\23\36)-9;BIW\\hmy\u0087\u0095\u00a0\u00ab\u00b1\u00b7\u00d1\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}