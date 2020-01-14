// Generated from /Users/Natan/Developer/search_engine_lo17/server/src/com/lo17/syntaxer/SQL.g4 by ANTLR 4.7.2
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
		SELECT=1, SELECT_FICHIER=2, SELECT_NUMERO=3, SELECT_SHORT_DATE=4, COUNT=5, 
		CONJ_OR=6, CONJ_AND=7, MOT=8, MOT_TITRE=9, MOT_TEXTE=10, RUBRIQUE=11, 
		DATE=12, DATE_TO=13, DATE_BEFORE=14, DATE_FROM=15, DATE_AFTER=16, DATE_BETWEEN=17, 
		VAR_JOUR=18, VAR_ANNEE=19, VAR_DATE=20, VAR_MOIS_JANVIER=21, VAR_MOIS_FEVRIER=22, 
		VAR_MOIS_MARS=23, VAR_MOIS_AVRIL=24, VAR_MOIS_MAI=25, VAR_MOIS_JUIN=26, 
		VAR_MOIS_JUILLET=27, VAR_MOIS_AOUT=28, VAR_MOIS_SEPTEMBRE=29, VAR_MOIS_OCTOBRE=30, 
		VAR_MOIS_NOVEMBRE=31, VAR_MOIS_DECEMBRE=32, VAR_MOT=33, WS=34, POINT=35;
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
			null, null, "'fichier'", "'bulletin'", "'quand'", "'combien'", "'ou'", 
			null, null, "'titre'", "'texte'", "'rubrique'", "'date'", "'jusque'", 
			"'avant'", "'depuis'", "'apres'", "'entre'", null, null, null, "'janvier'", 
			"'f\u00E9vrier'", "'mars'", "'avril'", "'mai'", "'juin'", "'juillet'", 
			"'ao\u00FBt'", "'septembre'", "'octobre'", "'novembre'", "'d\u00E9cembre'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "SELECT_FICHIER", "SELECT_NUMERO", "SELECT_SHORT_DATE", 
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
		public List<TerminalNode> SELECT_FICHIER() { return getTokens(SQLParser.SELECT_FICHIER); }
		public TerminalNode SELECT_FICHIER(int i) {
			return getToken(SQLParser.SELECT_FICHIER, i);
		}
		public List<TerminalNode> SELECT_NUMERO() { return getTokens(SQLParser.SELECT_NUMERO); }
		public TerminalNode SELECT_NUMERO(int i) {
			return getToken(SQLParser.SELECT_NUMERO, i);
		}
		public List<TerminalNode> DATE() { return getTokens(SQLParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(SQLParser.DATE, i);
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
				case SELECT_FICHIER:
					{
					setState(20);
					match(SELECT_FICHIER);
					 _localctx.arbre.ajouteFils(new Arbre("", "distinct fichier")); 
					}
					break;
				case SELECT_NUMERO:
					{
					setState(22);
					match(SELECT_NUMERO);
					 _localctx.arbre.ajouteFils(new Arbre("", "distinct numero")); 
					}
					break;
				case DATE:
					{
					setState(24);
					match(DATE);
					 _localctx.arbre.ajouteFils(new Arbre("", "distinct date")); 
					}
					break;
				case RUBRIQUE:
					{
					setState(26);
					match(RUBRIQUE);
					 _localctx.arbre.ajouteFils(new Arbre("", "distinct rubrique")); 
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
					case SELECT_FICHIER:
						{
						setState(31);
						match(SELECT_FICHIER);
						 _localctx.arbre.ajouteFils(new Arbre("", ", fichier")); 
						}
						break;
					case SELECT_NUMERO:
						{
						setState(33);
						match(SELECT_NUMERO);
						 _localctx.arbre.ajouteFils(new Arbre("", ", numero")); 
						}
						break;
					case DATE:
						{
						setState(35);
						match(DATE);
						 _localctx.arbre.ajouteFils(new Arbre("", ", date")); 
						}
						break;
					case RUBRIQUE:
						{
						setState(37);
						match(RUBRIQUE);
						 _localctx.arbre.ajouteFils(new Arbre("", ", rubrique")); 
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
				case SELECT_FICHIER:
					{
					setState(49);
					match(SELECT_FICHIER);
					 _localctx.arbre.ajouteFils(new Arbre("", "count(distinct fichier)")); 
					}
					break;
				case SELECT_NUMERO:
					{
					setState(51);
					match(SELECT_NUMERO);
					 _localctx.arbre.ajouteFils(new Arbre("", "count(distinct numero)")); 
					}
					break;
				case RUBRIQUE:
					{
					setState(53);
					match(RUBRIQUE);
					 _localctx.arbre.ajouteFils(new Arbre("", "count(distinct rubrique)")); 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONJ_OR) | (1L << CONJ_AND) | (1L << MOT) | (1L << MOT_TITRE) | (1L << MOT_TEXTE) | (1L << RUBRIQUE) | (1L << DATE) | (1L << DATE_TO) | (1L << DATE_BEFORE) | (1L << DATE_FROM) | (1L << DATE_AFTER) | (1L << DATE_BETWEEN))) != 0)) {
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
		public TerminalNode MOT_TEXTE() { return getToken(SQLParser.MOT_TEXTE, 0); }
		public List<TerminalNode> VAR_MOT() { return getTokens(SQLParser.VAR_MOT); }
		public TerminalNode VAR_MOT(int i) {
			return getToken(SQLParser.VAR_MOT, i);
		}
		public TerminalNode MOT() { return getToken(SQLParser.MOT, 0); }
		public List<ConjContext> conj() {
			return getRuleContexts(ConjContext.class);
		}
		public ConjContext conj(int i) {
			return getRuleContext(ConjContext.class,i);
		}
		public TerminalNode MOT_TITRE() { return getToken(SQLParser.MOT_TITRE, 0); }
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(74);
				match(MOT_TEXTE);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MOT) {
					{
					setState(75);
					match(MOT);
					}
				}


							_localctx.arbre.ajouteFils(new Arbre("table", "texte"));
						
				setState(79);
				((ParamContext)_localctx).var_mot_1 = match(VAR_MOT);
				 _localctx.arbre.ajouteFils(new Arbre("mot=", "'"+((ParamContext)_localctx).var_mot_1.getText()+"'")); 
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						((ParamContext)_localctx).conj1 = conj();
						 _localctx.arbre.ajouteFils(((ParamContext)_localctx).conj1.arbre); 
						setState(83);
						((ParamContext)_localctx).var_mot_2 = match(VAR_MOT);
						 _localctx.arbre.ajouteFils(new Arbre("mot=", "'"+((ParamContext)_localctx).var_mot_2.getText()+"'")); 
						}
						} 
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(91);
				match(MOT_TITRE);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MOT) {
					{
					setState(92);
					match(MOT);
					}
				}


							_localctx.arbre.ajouteFils(new Arbre("table", "titre"));
						
				setState(96);
				((ParamContext)_localctx).var_mot_1 = match(VAR_MOT);
				 _localctx.arbre.ajouteFils(new Arbre("mot=", "'"+((ParamContext)_localctx).var_mot_1.getText()+"'")); 
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						((ParamContext)_localctx).conj1 = conj();
						 _localctx.arbre.ajouteFils(((ParamContext)_localctx).conj1.arbre); 
						setState(100);
						((ParamContext)_localctx).var_mot_2 = match(VAR_MOT);
						 _localctx.arbre.ajouteFils(new Arbre("mot=", "'"+((ParamContext)_localctx).var_mot_2.getText()+"'")); 
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(108);
				match(MOT);
				 _localctx.arbre.ajouteFils(new Arbre("table", "titretexte")); 
				setState(110);
				((ParamContext)_localctx).var_mot_1 = match(VAR_MOT);

				            _localctx.arbre.ajouteFils(new Arbre("mot=", "'" + ((ParamContext)_localctx).var_mot_1.getText() + "'"));
				        
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

						                _localctx.arbre.ajouteFils(new Arbre("mot=", "'" + ((ParamContext)_localctx).var_mot_2.getText() + "'"));
						            
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
			case 4:
				enterOuterAlt(_localctx, 4);
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
			case 5:
				enterOuterAlt(_localctx, 5);
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
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(170);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DATE) {
						{
						setState(150);
						match(DATE);
						}
					}

					setState(153);
					match(DATE_TO);

									_localctx.arbre.ajouteFils(new Arbre("table", "date"));
									_localctx.arbre.ajouteFils(new Arbre("comp", "<="));
								
					}
					break;
				case 2:
					{
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DATE) {
						{
						setState(155);
						match(DATE);
						}
					}

					setState(158);
					match(DATE_BEFORE);

									_localctx.arbre.ajouteFils(new Arbre("table", "date"));
									_localctx.arbre.ajouteFils(new Arbre("comp", "<"));
								
					}
					break;
				case 3:
					{
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DATE) {
						{
						setState(160);
						match(DATE);
						}
					}

					setState(163);
					match(DATE_FROM);

									_localctx.arbre.ajouteFils(new Arbre("table", "date"));
									_localctx.arbre.ajouteFils(new Arbre("comp", ">="));
								
					}
					break;
				case 4:
					{
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DATE) {
						{
						setState(165);
						match(DATE);
						}
					}

					setState(168);
					match(DATE_AFTER);

									_localctx.arbre.ajouteFils(new Arbre("table", "date"));
									_localctx.arbre.ajouteFils(new Arbre("comp", ">"));
								
					}
					break;
				}
				setState(172);
				((ParamContext)_localctx).var_date_1 = var_date();

							_localctx.arbre.ajouteFils(((ParamContext)_localctx).var_date_1.arbre);
						
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DATE) {
					{
					setState(175);
					match(DATE);
					}
				}

				setState(178);
				((ParamContext)_localctx).var_date_comp = match(DATE_BETWEEN);
				setState(179);
				((ParamContext)_localctx).var_date_1 = var_date();
				setState(180);
				((ParamContext)_localctx).conj1 = conj();
				setState(181);
				((ParamContext)_localctx).var_date_2 = var_date();

							_localctx.arbre.ajouteFils(new Arbre("table", "date"));
							_localctx.arbre.ajouteFils(new Arbre("comp", ">="));
							_localctx.arbre.ajouteFils(((ParamContext)_localctx).var_date_1.arbre);
							_localctx.arbre.ajouteFils(((ParamContext)_localctx).conj1.arbre);
							_localctx.arbre.ajouteFils(new Arbre("comp", "<"));
							_localctx.arbre.ajouteFils(((ParamContext)_localctx).var_date_2.arbre);
						
				}
				}
				break;
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
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONJ_OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(CONJ_OR);

						_localctx.arbre.ajouteFils(new Arbre("", "or"));
					
				}
				break;
			case CONJ_AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
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
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_ANNEE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(192);
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
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR_JOUR) {
					{
					setState(194);
					((Var_dateContext)_localctx).var1 = match(VAR_JOUR);

									_localctx.arbre.ajouteFils(new Arbre("jour=", "'"+((Var_dateContext)_localctx).var1.getText()+"'"));
								
					}
				}

				setState(222);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_MOIS_JANVIER:
					{
					setState(198);
					match(VAR_MOIS_JANVIER);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'01'")); 
					}
					break;
				case VAR_MOIS_FEVRIER:
					{
					setState(200);
					match(VAR_MOIS_FEVRIER);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'02'")); 
					}
					break;
				case VAR_MOIS_MARS:
					{
					setState(202);
					match(VAR_MOIS_MARS);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'03'")); 
					}
					break;
				case VAR_MOIS_AVRIL:
					{
					setState(204);
					match(VAR_MOIS_AVRIL);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'04'")); 
					}
					break;
				case VAR_MOIS_MAI:
					{
					setState(206);
					match(VAR_MOIS_MAI);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'05'")); 
					}
					break;
				case VAR_MOIS_JUIN:
					{
					setState(208);
					match(VAR_MOIS_JUIN);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'06'")); 
					}
					break;
				case VAR_MOIS_JUILLET:
					{
					setState(210);
					match(VAR_MOIS_JUILLET);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'07'")); 
					}
					break;
				case VAR_MOIS_AOUT:
					{
					setState(212);
					match(VAR_MOIS_AOUT);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'08'")); 
					}
					break;
				case VAR_MOIS_SEPTEMBRE:
					{
					setState(214);
					match(VAR_MOIS_SEPTEMBRE);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'09'")); 
					}
					break;
				case VAR_MOIS_OCTOBRE:
					{
					setState(216);
					match(VAR_MOIS_OCTOBRE);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'10'")); 
					}
					break;
				case VAR_MOIS_NOVEMBRE:
					{
					setState(218);
					match(VAR_MOIS_NOVEMBRE);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'11'")); 
					}
					break;
				case VAR_MOIS_DECEMBRE:
					{
					setState(220);
					match(VAR_MOIS_DECEMBRE);
					 _localctx.arbre.ajouteFils(new Arbre("mois=", "'12'")); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(224);
				((Var_dateContext)_localctx).var1 = match(VAR_ANNEE);

							_localctx.arbre.ajouteFils(new Arbre("annee=", "'"+((Var_dateContext)_localctx).var1.getText()+"'"));
						
				}
				}
				break;
			case VAR_DATE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(226);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3:\n\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\4\3\4"+
		"\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\5\5O\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\5\5`\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0086"+
		"\n\5\f\5\16\5\u0089\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0094"+
		"\n\5\f\5\16\5\u0097\13\5\3\5\5\5\u009a\n\5\3\5\3\5\3\5\5\5\u009f\n\5\3"+
		"\5\3\5\3\5\5\5\u00a4\n\5\3\5\3\5\3\5\5\5\u00a9\n\5\3\5\3\5\5\5\u00ad\n"+
		"\5\3\5\3\5\3\5\3\5\5\5\u00b3\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00bb\n\5"+
		"\3\6\3\6\3\6\3\6\5\6\u00c1\n\6\3\7\3\7\3\7\3\7\5\7\u00c7\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u00e1\n\7\3\7\3\7\3\7\3\7\5\7\u00e7\n\7\3\7\2\2\b"+
		"\2\4\6\b\n\f\2\2\2\u0114\2\16\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\b\u00ba\3"+
		"\2\2\2\n\u00c0\3\2\2\2\f\u00e6\3\2\2\2\16\17\5\4\3\2\17\20\b\2\1\2\20"+
		"\21\5\6\4\2\21\23\b\2\1\2\22\24\7%\2\2\23\22\3\2\2\2\23\24\3\2\2\2\24"+
		"\3\3\2\2\2\25\36\7\3\2\2\26\27\7\4\2\2\27\37\b\3\1\2\30\31\7\5\2\2\31"+
		"\37\b\3\1\2\32\33\7\16\2\2\33\37\b\3\1\2\34\35\7\r\2\2\35\37\b\3\1\2\36"+
		"\26\3\2\2\2\36\30\3\2\2\2\36\32\3\2\2\2\36\34\3\2\2\2\37-\3\2\2\2 )\7"+
		"\t\2\2!\"\7\4\2\2\"*\b\3\1\2#$\7\5\2\2$*\b\3\1\2%&\7\16\2\2&*\b\3\1\2"+
		"\'(\7\r\2\2(*\b\3\1\2)!\3\2\2\2)#\3\2\2\2)%\3\2\2\2)\'\3\2\2\2*,\3\2\2"+
		"\2+ \3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.<\3\2\2\2/-\3\2\2\2\60\61\7"+
		"\6\2\2\61<\b\3\1\2\629\7\7\2\2\63\64\7\4\2\2\64:\b\3\1\2\65\66\7\5\2\2"+
		"\66:\b\3\1\2\678\7\r\2\28:\b\3\1\29\63\3\2\2\29\65\3\2\2\29\67\3\2\2\2"+
		":<\3\2\2\2;\25\3\2\2\2;\60\3\2\2\2;\62\3\2\2\2<\5\3\2\2\2=>\5\b\5\2>I"+
		"\b\4\1\2?@\5\n\6\2@A\b\4\1\2AC\3\2\2\2B?\3\2\2\2BC\3\2\2\2CD\3\2\2\2D"+
		"E\5\b\5\2EF\b\4\1\2FH\3\2\2\2GB\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"J\7\3\2\2\2KI\3\2\2\2LN\7\f\2\2MO\7\n\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2"+
		"\2PQ\b\5\1\2QR\7#\2\2RZ\b\5\1\2ST\5\n\6\2TU\b\5\1\2UV\7#\2\2VW\b\5\1\2"+
		"WY\3\2\2\2XS\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\u00bb\3\2\2\2\\Z"+
		"\3\2\2\2]_\7\13\2\2^`\7\n\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\b\5\1\2"+
		"bc\7#\2\2ck\b\5\1\2de\5\n\6\2ef\b\5\1\2fg\7#\2\2gh\b\5\1\2hj\3\2\2\2i"+
		"d\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\u00bb\3\2\2\2mk\3\2\2\2no\7\n"+
		"\2\2op\b\5\1\2pq\7#\2\2qy\b\5\1\2rs\5\n\6\2st\b\5\1\2tu\7#\2\2uv\b\5\1"+
		"\2vx\3\2\2\2wr\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u00bb\3\2\2\2{y"+
		"\3\2\2\2|}\7\r\2\2}~\b\5\1\2~\177\7#\2\2\177\u0087\b\5\1\2\u0080\u0081"+
		"\5\n\6\2\u0081\u0082\b\5\1\2\u0082\u0083\7#\2\2\u0083\u0084\b\5\1\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u00bb\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\7\16\2\2\u008b\u008c\b\5\1\2\u008c\u008d\5\f\7\2\u008d\u0095\b"+
		"\5\1\2\u008e\u008f\5\n\6\2\u008f\u0090\b\5\1\2\u0090\u0091\5\f\7\2\u0091"+
		"\u0092\b\5\1\2\u0092\u0094\3\2\2\2\u0093\u008e\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00bb\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009a\7\16\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u00ad\b\5\1\2\u009d"+
		"\u009f\7\16\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00ad\b\5\1\2\u00a2\u00a4\7\16\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\21"+
		"\2\2\u00a6\u00ad\b\5\1\2\u00a7\u00a9\7\16\2\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\22\2\2\u00ab\u00ad\b"+
		"\5\1\2\u00ac\u0099\3\2\2\2\u00ac\u009e\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac"+
		"\u00a8\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\f\7\2\u00af\u00b0\b\5"+
		"\1\2\u00b0\u00bb\3\2\2\2\u00b1\u00b3\7\16\2\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6\5"+
		"\f\7\2\u00b6\u00b7\5\n\6\2\u00b7\u00b8\5\f\7\2\u00b8\u00b9\b\5\1\2\u00b9"+
		"\u00bb\3\2\2\2\u00baL\3\2\2\2\u00ba]\3\2\2\2\u00ban\3\2\2\2\u00ba|\3\2"+
		"\2\2\u00ba\u008a\3\2\2\2\u00ba\u00ac\3\2\2\2\u00ba\u00b2\3\2\2\2\u00bb"+
		"\t\3\2\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00c1\b\6\1\2\u00be\u00bf\7\t\2\2"+
		"\u00bf\u00c1\b\6\1\2\u00c0\u00bc\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\13"+
		"\3\2\2\2\u00c2\u00c3\7\25\2\2\u00c3\u00e7\b\7\1\2\u00c4\u00c5\7\24\2\2"+
		"\u00c5\u00c7\b\7\1\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00e0"+
		"\3\2\2\2\u00c8\u00c9\7\27\2\2\u00c9\u00e1\b\7\1\2\u00ca\u00cb\7\30\2\2"+
		"\u00cb\u00e1\b\7\1\2\u00cc\u00cd\7\31\2\2\u00cd\u00e1\b\7\1\2\u00ce\u00cf"+
		"\7\32\2\2\u00cf\u00e1\b\7\1\2\u00d0\u00d1\7\33\2\2\u00d1\u00e1\b\7\1\2"+
		"\u00d2\u00d3\7\34\2\2\u00d3\u00e1\b\7\1\2\u00d4\u00d5\7\35\2\2\u00d5\u00e1"+
		"\b\7\1\2\u00d6\u00d7\7\36\2\2\u00d7\u00e1\b\7\1\2\u00d8\u00d9\7\37\2\2"+
		"\u00d9\u00e1\b\7\1\2\u00da\u00db\7 \2\2\u00db\u00e1\b\7\1\2\u00dc\u00dd"+
		"\7!\2\2\u00dd\u00e1\b\7\1\2\u00de\u00df\7\"\2\2\u00df\u00e1\b\7\1\2\u00e0"+
		"\u00c8\3\2\2\2\u00e0\u00ca\3\2\2\2\u00e0\u00cc\3\2\2\2\u00e0\u00ce\3\2"+
		"\2\2\u00e0\u00d0\3\2\2\2\u00e0\u00d2\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0"+
		"\u00d6\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00da\3\2\2\2\u00e0\u00dc\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\25\2\2\u00e3"+
		"\u00e7\b\7\1\2\u00e4\u00e5\7\26\2\2\u00e5\u00e7\b\7\1\2\u00e6\u00c2\3"+
		"\2\2\2\u00e6\u00c6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\r\3\2\2\2\34\23\36"+
		")-9;BINZ_ky\u0087\u0095\u0099\u009e\u00a3\u00a8\u00ac\u00b2\u00ba\u00c0"+
		"\u00c6\u00e0\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}