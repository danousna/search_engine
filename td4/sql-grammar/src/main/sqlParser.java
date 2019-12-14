package main;
// $ANTLR 3.5.1 /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g 2019-12-14 15:27:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONJ_AND", "CONJ_OR", "COUNT", 
		"DATE", "DATE_AFTER", "DATE_BEFORE", "DATE_BETWEEN", "DATE_FROM", "DATE_TO", 
		"MOT", "POINT", "RUBRIQUE", "SELECT", "SELECT_ARTICLE", "SELECT_BULLETIN", 
		"SELECT_DATE", "SELECT_SHORT_DATE", "VAR_ANNEE", "VAR_DATE", "VAR_JOUR", 
		"VAR_MOIS_AOUT", "VAR_MOIS_AVRIL", "VAR_MOIS_DECEMBRE", "VAR_MOIS_FEVRIER", 
		"VAR_MOIS_JANVIER", "VAR_MOIS_JUILLET", "VAR_MOIS_JUIN", "VAR_MOIS_MAI", 
		"VAR_MOIS_MARS", "VAR_MOIS_NOVEMBRE", "VAR_MOIS_OCTOBRE", "VAR_MOIS_SEPTEMBRE", 
		"VAR_MOT", "WS"
	};
	public static final int EOF=-1;
	public static final int CONJ_AND=4;
	public static final int CONJ_OR=5;
	public static final int COUNT=6;
	public static final int DATE=7;
	public static final int DATE_AFTER=8;
	public static final int DATE_BEFORE=9;
	public static final int DATE_BETWEEN=10;
	public static final int DATE_FROM=11;
	public static final int DATE_TO=12;
	public static final int MOT=13;
	public static final int POINT=14;
	public static final int RUBRIQUE=15;
	public static final int SELECT=16;
	public static final int SELECT_ARTICLE=17;
	public static final int SELECT_BULLETIN=18;
	public static final int SELECT_DATE=19;
	public static final int SELECT_SHORT_DATE=20;
	public static final int VAR_ANNEE=21;
	public static final int VAR_DATE=22;
	public static final int VAR_JOUR=23;
	public static final int VAR_MOIS_AOUT=24;
	public static final int VAR_MOIS_AVRIL=25;
	public static final int VAR_MOIS_DECEMBRE=26;
	public static final int VAR_MOIS_FEVRIER=27;
	public static final int VAR_MOIS_JANVIER=28;
	public static final int VAR_MOIS_JUILLET=29;
	public static final int VAR_MOIS_JUIN=30;
	public static final int VAR_MOIS_MAI=31;
	public static final int VAR_MOIS_MARS=32;
	public static final int VAR_MOIS_NOVEMBRE=33;
	public static final int VAR_MOIS_OCTOBRE=34;
	public static final int VAR_MOIS_SEPTEMBRE=35;
	public static final int VAR_MOT=36;
	public static final int WS=37;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g"; }



	// $ANTLR start "requete"
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:52:1: requete returns [Arbre arbre_requete = new Arbre(\"\")] : sl= select ps= params ( POINT )? ;
	public final Arbre requete() throws RecognitionException {
		Arbre arbre_requete =  new Arbre("");


		Arbre sl =null;
		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:53:26: (sl= select ps= params ( POINT )? )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:54:3: sl= select ps= params ( POINT )?
			{
			pushFollow(FOLLOW_select_in_requete386);
			sl=select();
			state._fsp--;


							arbre_requete.ajouteFils(sl);
						
			pushFollow(FOLLOW_params_in_requete404);
			ps=params();
			state._fsp--;


							arbre_requete.ajouteFils(ps);
						
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:63:3: ( POINT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==POINT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:63:3: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_requete414); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return arbre_requete;
	}
	// $ANTLR end "requete"



	// $ANTLR start "select"
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:66:1: select returns [Arbre arbre_select = new Arbre(\"select\")] : ( ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* ) | SELECT_SHORT_DATE | ( COUNT ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE ) ) );
	public final Arbre select() throws RecognitionException {
		Arbre arbre_select =  new Arbre("select");


		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:66:59: ( ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* ) | SELECT_SHORT_DATE | ( COUNT ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE ) ) )
			int alt6=3;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				alt6=1;
				}
				break;
			case SELECT_SHORT_DATE:
				{
				alt6=2;
				}
				break;
			case COUNT:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:67:2: ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:67:2: ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:68:3: SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )*
					{
					match(input,SELECT,FOLLOW_SELECT_in_select433); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:69:3: ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE )
					int alt2=4;
					switch ( input.LA(1) ) {
					case SELECT_ARTICLE:
						{
						alt2=1;
						}
						break;
					case SELECT_BULLETIN:
						{
						alt2=2;
						}
						break;
					case SELECT_DATE:
						{
						alt2=3;
						}
						break;
					case RUBRIQUE:
						{
						alt2=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:70:4: SELECT_ARTICLE
							{
							match(input,SELECT_ARTICLE,FOLLOW_SELECT_ARTICLE_in_select442); 
							 arbre_select.ajouteFils(new Arbre("", "fichier")); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:72:4: SELECT_BULLETIN
							{
							match(input,SELECT_BULLETIN,FOLLOW_SELECT_BULLETIN_in_select454); 
							 arbre_select.ajouteFils(new Arbre("", "numero")); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:74:4: SELECT_DATE
							{
							match(input,SELECT_DATE,FOLLOW_SELECT_DATE_in_select466); 
							 arbre_select.ajouteFils(new Arbre("", "date")); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:76:4: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_select478); 
							 arbre_select.ajouteFils(new Arbre("", "rubrique")); 
							}
							break;

					}

					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:78:3: ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==CONJ_AND) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:79:4: CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE )
							{
							match(input,CONJ_AND,FOLLOW_CONJ_AND_in_select493); 
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:80:4: ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE )
							int alt3=4;
							switch ( input.LA(1) ) {
							case SELECT_ARTICLE:
								{
								alt3=1;
								}
								break;
							case SELECT_BULLETIN:
								{
								alt3=2;
								}
								break;
							case SELECT_DATE:
								{
								alt3=3;
								}
								break;
							case RUBRIQUE:
								{
								alt3=4;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 3, 0, input);
								throw nvae;
							}
							switch (alt3) {
								case 1 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:81:5: SELECT_ARTICLE
									{
									match(input,SELECT_ARTICLE,FOLLOW_SELECT_ARTICLE_in_select504); 
									 arbre_select.ajouteFils(new Arbre("", ", fichier")); 
									}
									break;
								case 2 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:83:5: SELECT_BULLETIN
									{
									match(input,SELECT_BULLETIN,FOLLOW_SELECT_BULLETIN_in_select518); 
									 arbre_select.ajouteFils(new Arbre("", ", numero")); 
									}
									break;
								case 3 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:85:5: SELECT_DATE
									{
									match(input,SELECT_DATE,FOLLOW_SELECT_DATE_in_select532); 
									 arbre_select.ajouteFils(new Arbre("", ", date")); 
									}
									break;
								case 4 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:87:5: RUBRIQUE
									{
									match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_select546); 
									 arbre_select.ajouteFils(new Arbre("", "rubrique")); 
									}
									break;

							}

							}
							break;

						default :
							break loop4;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:92:2: SELECT_SHORT_DATE
					{
					match(input,SELECT_SHORT_DATE,FOLLOW_SELECT_SHORT_DATE_in_select567); 
					 arbre_select.ajouteFils(new Arbre("", "date")); 
					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:94:2: ( COUNT ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE ) )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:94:2: ( COUNT ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE ) )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:95:3: COUNT ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE )
					{
					match(input,COUNT,FOLLOW_COUNT_in_select579); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:96:3: ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE )
					int alt5=3;
					switch ( input.LA(1) ) {
					case SELECT_ARTICLE:
						{
						alt5=1;
						}
						break;
					case SELECT_BULLETIN:
						{
						alt5=2;
						}
						break;
					case RUBRIQUE:
						{
						alt5=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:97:4: SELECT_ARTICLE
							{
							match(input,SELECT_ARTICLE,FOLLOW_SELECT_ARTICLE_in_select589); 
							 arbre_select.ajouteFils(new Arbre("", "count(fichier)")); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:99:4: SELECT_BULLETIN
							{
							match(input,SELECT_BULLETIN,FOLLOW_SELECT_BULLETIN_in_select601); 
							 arbre_select.ajouteFils(new Arbre("", "count(numero)")); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:101:4: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_select614); 
							 arbre_select.ajouteFils(new Arbre("", "count(rubrique)")); 
							}
							break;

					}

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return arbre_select;
	}
	// $ANTLR end "select"



	// $ANTLR start "params"
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:106:1: params returns [Arbre arbre_params = new Arbre(\"params\")] : par1= param ( (conj1= conj )? par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre arbre_params =  new Arbre("params");


		Arbre par1 =null;
		Arbre conj1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:107:40: (par1= param ( (conj1= conj )? par2= param )* )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:108:3: par1= param ( (conj1= conj )? par2= param )*
			{
			pushFollow(FOLLOW_param_in_params649);
			par1=param();
			state._fsp--;


							arbre_params.ajouteFils(par1);
						
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:112:3: ( (conj1= conj )? par2= param )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= CONJ_AND && LA8_0 <= CONJ_OR)||(LA8_0 >= DATE && LA8_0 <= MOT)||LA8_0==RUBRIQUE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:113:4: (conj1= conj )? par2= param
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:113:4: (conj1= conj )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= CONJ_AND && LA7_0 <= CONJ_OR)) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:114:5: conj1= conj
							{
							pushFollow(FOLLOW_conj_in_params674);
							conj1=conj();
							state._fsp--;

							 //TODO: Ajouter la conjonction SQL valide 'or', 'and' et non pas française.
												arbre_params.ajouteFils(conj1);
											
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params691);
					par2=param();
					state._fsp--;


									arbre_params.ajouteFils(par2);
								
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return arbre_params;
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:125:1: param returns [Arbre arbre_param = new Arbre(\"param\")] : ( ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) | ( RUBRIQUE var_rubrique_1= VAR_MOT (conj1= conj var_rubrique_1= VAR_MOT )* ) | ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* ) | ( ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER ) var_date_1= var_date ) | (var_date_comp= DATE_BETWEEN var_date_1= var_date CONJ_AND var_date_2= var_date ) );
	public final Arbre param() throws RecognitionException {
		Arbre arbre_param =  new Arbre("param");


		Token var_mot_1=null;
		Token var_mot_2=null;
		Token var_rubrique_1=null;
		Token var_date_comp=null;
		Arbre conj1 =null;
		Arbre var_date_1 =null;
		Arbre var_date_2 =null;

		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:125:56: ( ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) | ( RUBRIQUE var_rubrique_1= VAR_MOT (conj1= conj var_rubrique_1= VAR_MOT )* ) | ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* ) | ( ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER ) var_date_1= var_date ) | (var_date_comp= DATE_BETWEEN var_date_1= var_date CONJ_AND var_date_2= var_date ) )
			int alt13=5;
			switch ( input.LA(1) ) {
			case MOT:
				{
				alt13=1;
				}
				break;
			case RUBRIQUE:
				{
				alt13=2;
				}
				break;
			case DATE:
				{
				alt13=3;
				}
				break;
			case DATE_AFTER:
			case DATE_BEFORE:
			case DATE_FROM:
			case DATE_TO:
				{
				alt13=4;
				}
				break;
			case DATE_BETWEEN:
				{
				alt13=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:126:2: ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:126:2: ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:127:3: MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )*
					{
					match(input,MOT,FOLLOW_MOT_in_param719); 
					 arbre_param.ajouteFils(new Arbre("table", "texte")); 
					var_mot_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param729); 
					 arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_1.getText()+"'")); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:129:3: (conj1= conj var_mot_2= VAR_MOT )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==CONJ_OR) ) {
							int LA9_1 = input.LA(2);
							if ( (LA9_1==VAR_MOT) ) {
								alt9=1;
							}

						}
						else if ( (LA9_0==CONJ_AND) ) {
							int LA9_2 = input.LA(2);
							if ( (LA9_2==VAR_MOT) ) {
								alt9=1;
							}

						}

						switch (alt9) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:130:4: conj1= conj var_mot_2= VAR_MOT
							{
							pushFollow(FOLLOW_conj_in_param744);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							var_mot_2=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param755); 
							 arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_2.getText()+"'")); 
							}
							break;

						default :
							break loop9;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:135:2: ( RUBRIQUE var_rubrique_1= VAR_MOT (conj1= conj var_rubrique_1= VAR_MOT )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:135:2: ( RUBRIQUE var_rubrique_1= VAR_MOT (conj1= conj var_rubrique_1= VAR_MOT )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:136:3: RUBRIQUE var_rubrique_1= VAR_MOT (conj1= conj var_rubrique_1= VAR_MOT )*
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_param775); 
					 arbre_param.ajouteFils(new Arbre("table", "rubrique")); 
					var_rubrique_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param785); 
					 arbre_param.ajouteFils(new Arbre("rubrique=", "'"+var_rubrique_1.getText()+"'")); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:138:3: (conj1= conj var_rubrique_1= VAR_MOT )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==CONJ_OR) ) {
							int LA10_1 = input.LA(2);
							if ( (LA10_1==VAR_MOT) ) {
								alt10=1;
							}

						}
						else if ( (LA10_0==CONJ_AND) ) {
							int LA10_2 = input.LA(2);
							if ( (LA10_2==VAR_MOT) ) {
								alt10=1;
							}

						}

						switch (alt10) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:139:4: conj1= conj var_rubrique_1= VAR_MOT
							{
							pushFollow(FOLLOW_conj_in_param800);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							var_rubrique_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param811); 
							 arbre_param.ajouteFils(new Arbre("rubrique=", "'"+var_rubrique_1.getText()+"'")); 
							}
							break;

						default :
							break loop10;
						}
					}

					}

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:144:2: ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:144:2: ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:145:3: DATE var_date_1= var_date (conj1= conj var_date_2= var_date )*
					{
					match(input,DATE,FOLLOW_DATE_in_param831); 

								arbre_param.ajouteFils(new Arbre("table", "date"));
							
					pushFollow(FOLLOW_var_date_in_param843);
					var_date_1=var_date();
					state._fsp--;

					 arbre_param.ajouteFils(var_date_1); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:150:3: (conj1= conj var_date_2= var_date )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==CONJ_OR) ) {
							int LA11_1 = input.LA(2);
							if ( ((LA11_1 >= VAR_ANNEE && LA11_1 <= VAR_MOIS_SEPTEMBRE)) ) {
								alt11=1;
							}

						}
						else if ( (LA11_0==CONJ_AND) ) {
							int LA11_2 = input.LA(2);
							if ( ((LA11_2 >= VAR_ANNEE && LA11_2 <= VAR_MOIS_SEPTEMBRE)) ) {
								alt11=1;
							}

						}

						switch (alt11) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:151:4: conj1= conj var_date_2= var_date
							{
							pushFollow(FOLLOW_conj_in_param858);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							pushFollow(FOLLOW_var_date_in_param869);
							var_date_2=var_date();
							state._fsp--;

							 arbre_param.ajouteFils(var_date_2); 
							}
							break;

						default :
							break loop11;
						}
					}

					}

					}
					break;
				case 4 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:156:2: ( ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER ) var_date_1= var_date )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:156:2: ( ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER ) var_date_1= var_date )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:157:3: ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER ) var_date_1= var_date
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:157:3: ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER )
					int alt12=4;
					switch ( input.LA(1) ) {
					case DATE_TO:
						{
						alt12=1;
						}
						break;
					case DATE_BEFORE:
						{
						alt12=2;
						}
						break;
					case DATE_FROM:
						{
						alt12=3;
						}
						break;
					case DATE_AFTER:
						{
						alt12=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}
					switch (alt12) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:158:4: DATE_TO
							{
							match(input,DATE_TO,FOLLOW_DATE_TO_in_param894); 

											arbre_param.ajouteFils(new Arbre("table", "date"));
											arbre_param.ajouteFils(new Arbre("comp", "<="));
										
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:163:4: DATE_BEFORE
							{
							match(input,DATE_BEFORE,FOLLOW_DATE_BEFORE_in_param906); 

											arbre_param.ajouteFils(new Arbre("table", "date"));
											arbre_param.ajouteFils(new Arbre("comp", "<"));
										
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:168:4: DATE_FROM
							{
							match(input,DATE_FROM,FOLLOW_DATE_FROM_in_param918); 

											arbre_param.ajouteFils(new Arbre("table", "date"));
											arbre_param.ajouteFils(new Arbre("comp", ">="));
										
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:173:4: DATE_AFTER
							{
							match(input,DATE_AFTER,FOLLOW_DATE_AFTER_in_param930); 

											arbre_param.ajouteFils(new Arbre("table", "date"));
											arbre_param.ajouteFils(new Arbre("comp", ">"));
										
							}
							break;

					}

					pushFollow(FOLLOW_var_date_in_param944);
					var_date_1=var_date();
					state._fsp--;


								arbre_param.ajouteFils(var_date_1);
							
					}

					}
					break;
				case 5 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:183:2: (var_date_comp= DATE_BETWEEN var_date_1= var_date CONJ_AND var_date_2= var_date )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:183:2: (var_date_comp= DATE_BETWEEN var_date_1= var_date CONJ_AND var_date_2= var_date )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:184:3: var_date_comp= DATE_BETWEEN var_date_1= var_date CONJ_AND var_date_2= var_date
					{
					var_date_comp=(Token)match(input,DATE_BETWEEN,FOLLOW_DATE_BETWEEN_in_param963); 
					pushFollow(FOLLOW_var_date_in_param972);
					var_date_1=var_date();
					state._fsp--;

					match(input,CONJ_AND,FOLLOW_CONJ_AND_in_param976); 
					pushFollow(FOLLOW_var_date_in_param984);
					var_date_2=var_date();
					state._fsp--;


								arbre_param.ajouteFils(new Arbre("table", "date"));
								arbre_param.ajouteFils(new Arbre("comp", ">="));
								arbre_param.ajouteFils(var_date_1);
								arbre_param.ajouteFils(new Arbre("", "and"));
								arbre_param.ajouteFils(new Arbre("comp", "<"));
								arbre_param.ajouteFils(var_date_2);
							
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return arbre_param;
	}
	// $ANTLR end "param"



	// $ANTLR start "conj"
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:199:1: conj returns [Arbre arbre_conj = new Arbre(\"conj\")] : ( CONJ_OR | CONJ_AND );
	public final Arbre conj() throws RecognitionException {
		Arbre arbre_conj =  new Arbre("conj");


		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:199:53: ( CONJ_OR | CONJ_AND )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==CONJ_OR) ) {
				alt14=1;
			}
			else if ( (LA14_0==CONJ_AND) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:200:2: CONJ_OR
					{
					match(input,CONJ_OR,FOLLOW_CONJ_OR_in_conj1005); 

							arbre_conj.ajouteFils(new Arbre("", "or"));
						
					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:205:2: CONJ_AND
					{
					match(input,CONJ_AND,FOLLOW_CONJ_AND_in_conj1014); 

							arbre_conj.ajouteFils(new Arbre("", "and"));
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return arbre_conj;
	}
	// $ANTLR end "conj"



	// $ANTLR start "var_date"
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:211:1: var_date returns [Arbre arbre_var = new Arbre(\"var_date\")] : ( (var1= VAR_ANNEE ) | ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE ) | (var1= VAR_DATE ) );
	public final Arbre var_date() throws RecognitionException {
		Arbre arbre_var =  new Arbre("var_date");


		Token var1=null;

		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:211:60: ( (var1= VAR_ANNEE ) | ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE ) | (var1= VAR_DATE ) )
			int alt17=3;
			switch ( input.LA(1) ) {
			case VAR_ANNEE:
				{
				alt17=1;
				}
				break;
			case VAR_JOUR:
			case VAR_MOIS_AOUT:
			case VAR_MOIS_AVRIL:
			case VAR_MOIS_DECEMBRE:
			case VAR_MOIS_FEVRIER:
			case VAR_MOIS_JANVIER:
			case VAR_MOIS_JUILLET:
			case VAR_MOIS_JUIN:
			case VAR_MOIS_MAI:
			case VAR_MOIS_MARS:
			case VAR_MOIS_NOVEMBRE:
			case VAR_MOIS_OCTOBRE:
			case VAR_MOIS_SEPTEMBRE:
				{
				alt17=2;
				}
				break;
			case VAR_DATE:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:212:2: (var1= VAR_ANNEE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:212:2: (var1= VAR_ANNEE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:213:3: var1= VAR_ANNEE
					{
					var1=(Token)match(input,VAR_ANNEE,FOLLOW_VAR_ANNEE_in_var_date1039); 
					 
								arbre_var.ajouteFils(new Arbre("annee=", "'"+var1.getText()+"'"));
							
					}

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:219:2: ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:219:2: ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:220:3: (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:220:3: (var1= VAR_JOUR )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==VAR_JOUR) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:221:4: var1= VAR_JOUR
							{
							var1=(Token)match(input,VAR_JOUR,FOLLOW_VAR_JOUR_in_var_date1065); 

											arbre_var.ajouteFils(new Arbre("jour=", "'"+var1.getText()+"'"));
										
							}
							break;

					}

					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:226:3: ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE )
					int alt16=12;
					switch ( input.LA(1) ) {
					case VAR_MOIS_JANVIER:
						{
						alt16=1;
						}
						break;
					case VAR_MOIS_FEVRIER:
						{
						alt16=2;
						}
						break;
					case VAR_MOIS_MARS:
						{
						alt16=3;
						}
						break;
					case VAR_MOIS_AVRIL:
						{
						alt16=4;
						}
						break;
					case VAR_MOIS_MAI:
						{
						alt16=5;
						}
						break;
					case VAR_MOIS_JUIN:
						{
						alt16=6;
						}
						break;
					case VAR_MOIS_JUILLET:
						{
						alt16=7;
						}
						break;
					case VAR_MOIS_AOUT:
						{
						alt16=8;
						}
						break;
					case VAR_MOIS_SEPTEMBRE:
						{
						alt16=9;
						}
						break;
					case VAR_MOIS_OCTOBRE:
						{
						alt16=10;
						}
						break;
					case VAR_MOIS_NOVEMBRE:
						{
						alt16=11;
						}
						break;
					case VAR_MOIS_DECEMBRE:
						{
						alt16=12;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}
					switch (alt16) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:227:4: VAR_MOIS_JANVIER
							{
							match(input,VAR_MOIS_JANVIER,FOLLOW_VAR_MOIS_JANVIER_in_var_date1084); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'01'")); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:229:4: VAR_MOIS_FEVRIER
							{
							match(input,VAR_MOIS_FEVRIER,FOLLOW_VAR_MOIS_FEVRIER_in_var_date1097); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'02'")); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:231:4: VAR_MOIS_MARS
							{
							match(input,VAR_MOIS_MARS,FOLLOW_VAR_MOIS_MARS_in_var_date1110); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'03'")); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:233:4: VAR_MOIS_AVRIL
							{
							match(input,VAR_MOIS_AVRIL,FOLLOW_VAR_MOIS_AVRIL_in_var_date1123); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'04'")); 
							}
							break;
						case 5 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:235:4: VAR_MOIS_MAI
							{
							match(input,VAR_MOIS_MAI,FOLLOW_VAR_MOIS_MAI_in_var_date1136); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'05'")); 
							}
							break;
						case 6 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:237:4: VAR_MOIS_JUIN
							{
							match(input,VAR_MOIS_JUIN,FOLLOW_VAR_MOIS_JUIN_in_var_date1149); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'06'")); 
							}
							break;
						case 7 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:239:4: VAR_MOIS_JUILLET
							{
							match(input,VAR_MOIS_JUILLET,FOLLOW_VAR_MOIS_JUILLET_in_var_date1162); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'07'")); 
							}
							break;
						case 8 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:241:4: VAR_MOIS_AOUT
							{
							match(input,VAR_MOIS_AOUT,FOLLOW_VAR_MOIS_AOUT_in_var_date1175); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'08'")); 
							}
							break;
						case 9 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:243:4: VAR_MOIS_SEPTEMBRE
							{
							match(input,VAR_MOIS_SEPTEMBRE,FOLLOW_VAR_MOIS_SEPTEMBRE_in_var_date1188); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'09'")); 
							}
							break;
						case 10 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:245:4: VAR_MOIS_OCTOBRE
							{
							match(input,VAR_MOIS_OCTOBRE,FOLLOW_VAR_MOIS_OCTOBRE_in_var_date1201); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'10'")); 
							}
							break;
						case 11 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:247:4: VAR_MOIS_NOVEMBRE
							{
							match(input,VAR_MOIS_NOVEMBRE,FOLLOW_VAR_MOIS_NOVEMBRE_in_var_date1214); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'11'")); 
							}
							break;
						case 12 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:249:4: VAR_MOIS_DECEMBRE
							{
							match(input,VAR_MOIS_DECEMBRE,FOLLOW_VAR_MOIS_DECEMBRE_in_var_date1227); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'12'")); 
							}
							break;

					}

					var1=(Token)match(input,VAR_ANNEE,FOLLOW_VAR_ANNEE_in_var_date1241); 
					 
								arbre_var.ajouteFils(new Arbre("annee=", "'"+var1.getText()+"'"));
							
					}

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:257:2: (var1= VAR_DATE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:257:2: (var1= VAR_DATE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:259:3: var1= VAR_DATE
					{
					var1=(Token)match(input,VAR_DATE,FOLLOW_VAR_DATE_in_var_date1266); 

								arbre_var.ajouteFils(new Arbre("date=", "'"+var1.getText()+"'"));
							
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return arbre_var;
	}
	// $ANTLR end "var_date"

	// Delegated rules



	public static final BitSet FOLLOW_select_in_requete386 = new BitSet(new long[]{0x000000000000BF80L});
	public static final BitSet FOLLOW_params_in_requete404 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_POINT_in_requete414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select433 = new BitSet(new long[]{0x00000000000E8000L});
	public static final BitSet FOLLOW_SELECT_ARTICLE_in_select442 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_SELECT_BULLETIN_in_select454 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_SELECT_DATE_in_select466 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_RUBRIQUE_in_select478 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_CONJ_AND_in_select493 = new BitSet(new long[]{0x00000000000E8000L});
	public static final BitSet FOLLOW_SELECT_ARTICLE_in_select504 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_SELECT_BULLETIN_in_select518 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_SELECT_DATE_in_select532 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_RUBRIQUE_in_select546 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_SELECT_SHORT_DATE_in_select567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_select579 = new BitSet(new long[]{0x0000000000068000L});
	public static final BitSet FOLLOW_SELECT_ARTICLE_in_select589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_BULLETIN_in_select601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_select614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params649 = new BitSet(new long[]{0x000000000000BFB2L});
	public static final BitSet FOLLOW_conj_in_params674 = new BitSet(new long[]{0x000000000000BF80L});
	public static final BitSet FOLLOW_param_in_params691 = new BitSet(new long[]{0x000000000000BFB2L});
	public static final BitSet FOLLOW_MOT_in_param719 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param729 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_conj_in_param744 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param755 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_RUBRIQUE_in_param775 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param785 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_conj_in_param800 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param811 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_DATE_in_param831 = new BitSet(new long[]{0x0000000FFFE00000L});
	public static final BitSet FOLLOW_var_date_in_param843 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_conj_in_param858 = new BitSet(new long[]{0x0000000FFFE00000L});
	public static final BitSet FOLLOW_var_date_in_param869 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_DATE_TO_in_param894 = new BitSet(new long[]{0x0000000FFFE00000L});
	public static final BitSet FOLLOW_DATE_BEFORE_in_param906 = new BitSet(new long[]{0x0000000FFFE00000L});
	public static final BitSet FOLLOW_DATE_FROM_in_param918 = new BitSet(new long[]{0x0000000FFFE00000L});
	public static final BitSet FOLLOW_DATE_AFTER_in_param930 = new BitSet(new long[]{0x0000000FFFE00000L});
	public static final BitSet FOLLOW_var_date_in_param944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_BETWEEN_in_param963 = new BitSet(new long[]{0x0000000FFFE00000L});
	public static final BitSet FOLLOW_var_date_in_param972 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CONJ_AND_in_param976 = new BitSet(new long[]{0x0000000FFFE00000L});
	public static final BitSet FOLLOW_var_date_in_param984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_OR_in_conj1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_AND_in_conj1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_ANNEE_in_var_date1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_JOUR_in_var_date1065 = new BitSet(new long[]{0x0000000FFF000000L});
	public static final BitSet FOLLOW_VAR_MOIS_JANVIER_in_var_date1084 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_FEVRIER_in_var_date1097 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_MARS_in_var_date1110 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_AVRIL_in_var_date1123 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_MAI_in_var_date1136 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_JUIN_in_var_date1149 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_JUILLET_in_var_date1162 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_AOUT_in_var_date1175 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_SEPTEMBRE_in_var_date1188 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_OCTOBRE_in_var_date1201 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_NOVEMBRE_in_var_date1214 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_MOIS_DECEMBRE_in_var_date1227 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VAR_ANNEE_in_var_date1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_DATE_in_var_date1266 = new BitSet(new long[]{0x0000000000000002L});
}
