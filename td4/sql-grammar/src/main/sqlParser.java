package main;
// $ANTLR 3.5.1 /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g 2019-12-11 12:32:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTEUR", "CONJ_AND", "CONJ_OR", 
		"DATE", "MOT", "POINT", "RUBRIQUE", "SELECT", "SELECT_ARTICLE", "SELECT_AUTEUR", 
		"SELECT_BULLETIN", "SELECT_DATE", "SELECT_SHORT_AUTEUR", "SELECT_SHORT_DATE", 
		"VAR_ANNEE", "VAR_DATE", "VAR_JOUR", "VAR_MOIS_AOUT", "VAR_MOIS_AVRIL", 
		"VAR_MOIS_DECEMBRE", "VAR_MOIS_FEVRIER", "VAR_MOIS_JANVIER", "VAR_MOIS_JUILLET", 
		"VAR_MOIS_JUIN", "VAR_MOIS_MAI", "VAR_MOIS_MARS", "VAR_MOIS_NOVEMBRE", 
		"VAR_MOIS_OCTOBRE", "VAR_MOIS_SEPTEMBRE", "VAR_MOT", "WS"
	};
	public static final int EOF=-1;
	public static final int AUTEUR=4;
	public static final int CONJ_AND=5;
	public static final int CONJ_OR=6;
	public static final int DATE=7;
	public static final int MOT=8;
	public static final int POINT=9;
	public static final int RUBRIQUE=10;
	public static final int SELECT=11;
	public static final int SELECT_ARTICLE=12;
	public static final int SELECT_AUTEUR=13;
	public static final int SELECT_BULLETIN=14;
	public static final int SELECT_DATE=15;
	public static final int SELECT_SHORT_AUTEUR=16;
	public static final int SELECT_SHORT_DATE=17;
	public static final int VAR_ANNEE=18;
	public static final int VAR_DATE=19;
	public static final int VAR_JOUR=20;
	public static final int VAR_MOIS_AOUT=21;
	public static final int VAR_MOIS_AVRIL=22;
	public static final int VAR_MOIS_DECEMBRE=23;
	public static final int VAR_MOIS_FEVRIER=24;
	public static final int VAR_MOIS_JANVIER=25;
	public static final int VAR_MOIS_JUILLET=26;
	public static final int VAR_MOIS_JUIN=27;
	public static final int VAR_MOIS_MAI=28;
	public static final int VAR_MOIS_MARS=29;
	public static final int VAR_MOIS_NOVEMBRE=30;
	public static final int VAR_MOIS_OCTOBRE=31;
	public static final int VAR_MOIS_SEPTEMBRE=32;
	public static final int VAR_MOT=33;
	public static final int WS=34;

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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:51:1: requete returns [Arbre arbre_requete = new Arbre(\"\")] : sl= select ps= params ( POINT )? ;
	public final Arbre requete() throws RecognitionException {
		Arbre arbre_requete =  new Arbre("");


		Arbre sl =null;
		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:52:26: (sl= select ps= params ( POINT )? )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:53:3: sl= select ps= params ( POINT )?
			{
			pushFollow(FOLLOW_select_in_requete365);
			sl=select();
			state._fsp--;


							arbre_requete.ajouteFils(sl);
						
			pushFollow(FOLLOW_params_in_requete383);
			ps=params();
			state._fsp--;


							arbre_requete.ajouteFils(ps);
						
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:62:3: ( POINT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==POINT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:62:3: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_requete393); 
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:65:1: select returns [Arbre arbre_select = new Arbre(\"select\")] : ( ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) )* ) | SELECT_SHORT_AUTEUR | SELECT_SHORT_DATE );
	public final Arbre select() throws RecognitionException {
		Arbre arbre_select =  new Arbre("select");


		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:65:59: ( ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) )* ) | SELECT_SHORT_AUTEUR | SELECT_SHORT_DATE )
			int alt5=3;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				alt5=1;
				}
				break;
			case SELECT_SHORT_AUTEUR:
				{
				alt5=2;
				}
				break;
			case SELECT_SHORT_DATE:
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:66:2: ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:66:2: ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:67:3: SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) )*
					{
					match(input,SELECT,FOLLOW_SELECT_in_select412); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:68:3: ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE )
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
					case SELECT_AUTEUR:
						{
						alt2=3;
						}
						break;
					case SELECT_DATE:
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
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:69:4: SELECT_ARTICLE
							{
							match(input,SELECT_ARTICLE,FOLLOW_SELECT_ARTICLE_in_select421); 
							 arbre_select.ajouteFils(new Arbre("", "article")); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:71:4: SELECT_BULLETIN
							{
							match(input,SELECT_BULLETIN,FOLLOW_SELECT_BULLETIN_in_select433); 
							 arbre_select.ajouteFils(new Arbre("", "bulletin")); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:73:4: SELECT_AUTEUR
							{
							match(input,SELECT_AUTEUR,FOLLOW_SELECT_AUTEUR_in_select445); 
							 arbre_select.ajouteFils(new Arbre("", "auteur")); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:75:4: SELECT_DATE
							{
							match(input,SELECT_DATE,FOLLOW_SELECT_DATE_in_select457); 
							 arbre_select.ajouteFils(new Arbre("", "date")); 
							}
							break;

					}

					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:77:3: ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE ) )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==CONJ_AND) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:78:4: CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE )
							{
							match(input,CONJ_AND,FOLLOW_CONJ_AND_in_select472); 
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:79:4: ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE )
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
							case SELECT_AUTEUR:
								{
								alt3=3;
								}
								break;
							case SELECT_DATE:
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
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:80:5: SELECT_ARTICLE
									{
									match(input,SELECT_ARTICLE,FOLLOW_SELECT_ARTICLE_in_select483); 
									 arbre_select.ajouteFils(new Arbre("", ", article")); 
									}
									break;
								case 2 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:82:5: SELECT_BULLETIN
									{
									match(input,SELECT_BULLETIN,FOLLOW_SELECT_BULLETIN_in_select497); 
									 arbre_select.ajouteFils(new Arbre("", ", bulletin")); 
									}
									break;
								case 3 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:84:5: SELECT_AUTEUR
									{
									match(input,SELECT_AUTEUR,FOLLOW_SELECT_AUTEUR_in_select511); 
									 arbre_select.ajouteFils(new Arbre("", ", auteur")); 
									}
									break;
								case 4 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:86:5: SELECT_DATE
									{
									match(input,SELECT_DATE,FOLLOW_SELECT_DATE_in_select525); 
									 arbre_select.ajouteFils(new Arbre("", ", date")); 
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:91:2: SELECT_SHORT_AUTEUR
					{
					match(input,SELECT_SHORT_AUTEUR,FOLLOW_SELECT_SHORT_AUTEUR_in_select546); 
					 arbre_select.ajouteFils(new Arbre("", "auteur")); 
					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:93:2: SELECT_SHORT_DATE
					{
					match(input,SELECT_SHORT_DATE,FOLLOW_SELECT_SHORT_DATE_in_select554); 
					 arbre_select.ajouteFils(new Arbre("", "date")); 
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:96:1: params returns [Arbre arbre_params = new Arbre(\"params\")] : par1= param ( (conj1= conj )? par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre arbre_params =  new Arbre("params");


		Arbre par1 =null;
		Arbre conj1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:97:40: (par1= param ( (conj1= conj )? par2= param )* )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:98:3: par1= param ( (conj1= conj )? par2= param )*
			{
			pushFollow(FOLLOW_param_in_params582);
			par1=param();
			state._fsp--;


							arbre_params.ajouteFils(par1);
						
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:102:3: ( (conj1= conj )? par2= param )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= AUTEUR && LA7_0 <= MOT)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:103:4: (conj1= conj )? par2= param
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:103:4: (conj1= conj )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= CONJ_AND && LA6_0 <= CONJ_OR)) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:104:5: conj1= conj
							{
							pushFollow(FOLLOW_conj_in_params607);
							conj1=conj();
							state._fsp--;

							 //TODO: Ajouter la conjonction SQL valide 'or', 'and' et non pas française.
												arbre_params.ajouteFils(conj1);
											
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params624);
					par2=param();
					state._fsp--;


									arbre_params.ajouteFils(par2);
								
					}
					break;

				default :
					break loop7;
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:115:1: param returns [Arbre arbre_param = new Arbre(\"param\")] : ( ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) | ( AUTEUR var_auteur_1= VAR_MOT (conj1= conj var_auteur_2= VAR_MOT )* ) | ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* ) );
	public final Arbre param() throws RecognitionException {
		Arbre arbre_param =  new Arbre("param");


		Token var_mot_1=null;
		Token var_mot_2=null;
		Token var_auteur_1=null;
		Token var_auteur_2=null;
		Arbre conj1 =null;
		Arbre var_date_1 =null;
		Arbre var_date_2 =null;

		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:115:56: ( ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) | ( AUTEUR var_auteur_1= VAR_MOT (conj1= conj var_auteur_2= VAR_MOT )* ) | ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* ) )
			int alt11=3;
			switch ( input.LA(1) ) {
			case MOT:
				{
				alt11=1;
				}
				break;
			case AUTEUR:
				{
				alt11=2;
				}
				break;
			case DATE:
				{
				alt11=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:116:2: ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:116:2: ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:117:3: MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )*
					{
					match(input,MOT,FOLLOW_MOT_in_param652); 
					 arbre_param.ajouteFils(new Arbre("table", "texte")); 
					var_mot_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param662); 
					 arbre_param.ajouteFils(new Arbre("mot =", "'"+var_mot_1.getText()+"'")); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:119:3: (conj1= conj var_mot_2= VAR_MOT )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==CONJ_OR) ) {
							int LA8_1 = input.LA(2);
							if ( (LA8_1==VAR_MOT) ) {
								alt8=1;
							}

						}
						else if ( (LA8_0==CONJ_AND) ) {
							int LA8_2 = input.LA(2);
							if ( (LA8_2==VAR_MOT) ) {
								alt8=1;
							}

						}

						switch (alt8) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:120:4: conj1= conj var_mot_2= VAR_MOT
							{
							pushFollow(FOLLOW_conj_in_param677);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							var_mot_2=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param688); 
							 arbre_param.ajouteFils(new Arbre("mot =", "'"+var_mot_2.getText()+"'")); 
							}
							break;

						default :
							break loop8;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:125:2: ( AUTEUR var_auteur_1= VAR_MOT (conj1= conj var_auteur_2= VAR_MOT )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:125:2: ( AUTEUR var_auteur_1= VAR_MOT (conj1= conj var_auteur_2= VAR_MOT )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:126:3: AUTEUR var_auteur_1= VAR_MOT (conj1= conj var_auteur_2= VAR_MOT )*
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_param708); 
					 arbre_param.ajouteFils(new Arbre("table", "auteur")); 
					var_auteur_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param718); 
					 arbre_param.ajouteFils(new Arbre("auteur =", "'"+var_auteur_1.getText()+"'")); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:128:3: (conj1= conj var_auteur_2= VAR_MOT )*
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
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:129:4: conj1= conj var_auteur_2= VAR_MOT
							{
							pushFollow(FOLLOW_conj_in_param733);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							var_auteur_2=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param744); 
							 arbre_param.ajouteFils(new Arbre("auteur =", "'"+var_auteur_2.getText()+"'")); 
							}
							break;

						default :
							break loop9;
						}
					}

					}

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:134:2: ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:134:2: ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:135:3: DATE var_date_1= var_date (conj1= conj var_date_2= var_date )*
					{
					match(input,DATE,FOLLOW_DATE_in_param764); 

								arbre_param.ajouteFils(new Arbre("table", "date"));
							
					pushFollow(FOLLOW_var_date_in_param776);
					var_date_1=var_date();
					state._fsp--;

					 arbre_param.ajouteFils(var_date_1); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:140:3: (conj1= conj var_date_2= var_date )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==CONJ_OR) ) {
							int LA10_1 = input.LA(2);
							if ( ((LA10_1 >= VAR_ANNEE && LA10_1 <= VAR_MOIS_SEPTEMBRE)) ) {
								alt10=1;
							}

						}
						else if ( (LA10_0==CONJ_AND) ) {
							int LA10_2 = input.LA(2);
							if ( ((LA10_2 >= VAR_ANNEE && LA10_2 <= VAR_MOIS_SEPTEMBRE)) ) {
								alt10=1;
							}

						}

						switch (alt10) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:141:4: conj1= conj var_date_2= var_date
							{
							pushFollow(FOLLOW_conj_in_param791);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							pushFollow(FOLLOW_var_date_in_param802);
							var_date_2=var_date();
							state._fsp--;

							 arbre_param.ajouteFils(var_date_2); 
							}
							break;

						default :
							break loop10;
						}
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
		return arbre_param;
	}
	// $ANTLR end "param"



	// $ANTLR start "conj"
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:147:1: conj returns [Arbre arbre_conj = new Arbre(\"conj\")] : ( CONJ_OR | CONJ_AND );
	public final Arbre conj() throws RecognitionException {
		Arbre arbre_conj =  new Arbre("conj");


		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:147:53: ( CONJ_OR | CONJ_AND )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==CONJ_OR) ) {
				alt12=1;
			}
			else if ( (LA12_0==CONJ_AND) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:148:2: CONJ_OR
					{
					match(input,CONJ_OR,FOLLOW_CONJ_OR_in_conj826); 

							arbre_conj.ajouteFils(new Arbre("", "or"));
						
					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:153:2: CONJ_AND
					{
					match(input,CONJ_AND,FOLLOW_CONJ_AND_in_conj835); 

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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:159:1: var_date returns [Arbre arbre_var = new Arbre(\"\")] : ( (var1= VAR_ANNEE ) | ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE ) | (var1= VAR_DATE ) );
	public final Arbre var_date() throws RecognitionException {
		Arbre arbre_var =  new Arbre("");


		Token var1=null;

		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:159:52: ( (var1= VAR_ANNEE ) | ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE ) | (var1= VAR_DATE ) )
			int alt15=3;
			switch ( input.LA(1) ) {
			case VAR_ANNEE:
				{
				alt15=1;
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
				alt15=2;
				}
				break;
			case VAR_DATE:
				{
				alt15=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:160:2: (var1= VAR_ANNEE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:160:2: (var1= VAR_ANNEE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:161:3: var1= VAR_ANNEE
					{
					var1=(Token)match(input,VAR_ANNEE,FOLLOW_VAR_ANNEE_in_var_date860); 
					 
								arbre_var.ajouteFils(new Arbre("annee =", "'"+var1.getText()+"'"));
							
					}

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:167:2: ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:167:2: ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:168:3: (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:168:3: (var1= VAR_JOUR )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==VAR_JOUR) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:169:4: var1= VAR_JOUR
							{
							var1=(Token)match(input,VAR_JOUR,FOLLOW_VAR_JOUR_in_var_date886); 

											arbre_var.ajouteFils(new Arbre("jour =", "'"+var1.getText()+"'"));
										
							}
							break;

					}

					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:174:3: ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE )
					int alt14=12;
					switch ( input.LA(1) ) {
					case VAR_MOIS_JANVIER:
						{
						alt14=1;
						}
						break;
					case VAR_MOIS_FEVRIER:
						{
						alt14=2;
						}
						break;
					case VAR_MOIS_MARS:
						{
						alt14=3;
						}
						break;
					case VAR_MOIS_AVRIL:
						{
						alt14=4;
						}
						break;
					case VAR_MOIS_MAI:
						{
						alt14=5;
						}
						break;
					case VAR_MOIS_JUIN:
						{
						alt14=6;
						}
						break;
					case VAR_MOIS_JUILLET:
						{
						alt14=7;
						}
						break;
					case VAR_MOIS_AOUT:
						{
						alt14=8;
						}
						break;
					case VAR_MOIS_SEPTEMBRE:
						{
						alt14=9;
						}
						break;
					case VAR_MOIS_OCTOBRE:
						{
						alt14=10;
						}
						break;
					case VAR_MOIS_NOVEMBRE:
						{
						alt14=11;
						}
						break;
					case VAR_MOIS_DECEMBRE:
						{
						alt14=12;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}
					switch (alt14) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:175:4: VAR_MOIS_JANVIER
							{
							match(input,VAR_MOIS_JANVIER,FOLLOW_VAR_MOIS_JANVIER_in_var_date905); 
							 arbre_var.ajouteFils(new Arbre("mois =", "01")); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:177:4: VAR_MOIS_FEVRIER
							{
							match(input,VAR_MOIS_FEVRIER,FOLLOW_VAR_MOIS_FEVRIER_in_var_date918); 
							 arbre_var.ajouteFils(new Arbre("mois =", "02")); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:179:4: VAR_MOIS_MARS
							{
							match(input,VAR_MOIS_MARS,FOLLOW_VAR_MOIS_MARS_in_var_date931); 
							 arbre_var.ajouteFils(new Arbre("mois =", "03")); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:181:4: VAR_MOIS_AVRIL
							{
							match(input,VAR_MOIS_AVRIL,FOLLOW_VAR_MOIS_AVRIL_in_var_date944); 
							 arbre_var.ajouteFils(new Arbre("mois =", "04")); 
							}
							break;
						case 5 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:183:4: VAR_MOIS_MAI
							{
							match(input,VAR_MOIS_MAI,FOLLOW_VAR_MOIS_MAI_in_var_date957); 
							 arbre_var.ajouteFils(new Arbre("mois =", "05")); 
							}
							break;
						case 6 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:185:4: VAR_MOIS_JUIN
							{
							match(input,VAR_MOIS_JUIN,FOLLOW_VAR_MOIS_JUIN_in_var_date970); 
							 arbre_var.ajouteFils(new Arbre("mois =", "06")); 
							}
							break;
						case 7 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:187:4: VAR_MOIS_JUILLET
							{
							match(input,VAR_MOIS_JUILLET,FOLLOW_VAR_MOIS_JUILLET_in_var_date983); 
							 arbre_var.ajouteFils(new Arbre("mois =", "07")); 
							}
							break;
						case 8 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:189:4: VAR_MOIS_AOUT
							{
							match(input,VAR_MOIS_AOUT,FOLLOW_VAR_MOIS_AOUT_in_var_date996); 
							 arbre_var.ajouteFils(new Arbre("mois =", "08")); 
							}
							break;
						case 9 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:191:4: VAR_MOIS_SEPTEMBRE
							{
							match(input,VAR_MOIS_SEPTEMBRE,FOLLOW_VAR_MOIS_SEPTEMBRE_in_var_date1009); 
							 arbre_var.ajouteFils(new Arbre("mois =", "09")); 
							}
							break;
						case 10 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:193:4: VAR_MOIS_OCTOBRE
							{
							match(input,VAR_MOIS_OCTOBRE,FOLLOW_VAR_MOIS_OCTOBRE_in_var_date1022); 
							 arbre_var.ajouteFils(new Arbre("mois =", "10")); 
							}
							break;
						case 11 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:195:4: VAR_MOIS_NOVEMBRE
							{
							match(input,VAR_MOIS_NOVEMBRE,FOLLOW_VAR_MOIS_NOVEMBRE_in_var_date1035); 
							 arbre_var.ajouteFils(new Arbre("mois =", "11")); 
							}
							break;
						case 12 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:197:4: VAR_MOIS_DECEMBRE
							{
							match(input,VAR_MOIS_DECEMBRE,FOLLOW_VAR_MOIS_DECEMBRE_in_var_date1048); 
							 arbre_var.ajouteFils(new Arbre("mois =", "12")); 
							}
							break;

					}

					var1=(Token)match(input,VAR_ANNEE,FOLLOW_VAR_ANNEE_in_var_date1062); 
					 
								arbre_var.ajouteFils(new Arbre("annee =", "'"+var1.getText()+"'"));
							
					}

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:205:2: (var1= VAR_DATE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:205:2: (var1= VAR_DATE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:207:3: var1= VAR_DATE
					{
					var1=(Token)match(input,VAR_DATE,FOLLOW_VAR_DATE_in_var_date1087); 

								arbre_var.ajouteFils(new Arbre("date =", "'"+var1.getText()+"'"));
							
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



	public static final BitSet FOLLOW_select_in_requete365 = new BitSet(new long[]{0x0000000000000190L});
	public static final BitSet FOLLOW_params_in_requete383 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_POINT_in_requete393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select412 = new BitSet(new long[]{0x000000000000F000L});
	public static final BitSet FOLLOW_SELECT_ARTICLE_in_select421 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_BULLETIN_in_select433 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_AUTEUR_in_select445 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_DATE_in_select457 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_CONJ_AND_in_select472 = new BitSet(new long[]{0x000000000000F000L});
	public static final BitSet FOLLOW_SELECT_ARTICLE_in_select483 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_BULLETIN_in_select497 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_AUTEUR_in_select511 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_DATE_in_select525 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_SHORT_AUTEUR_in_select546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_SHORT_DATE_in_select554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params582 = new BitSet(new long[]{0x00000000000001F2L});
	public static final BitSet FOLLOW_conj_in_params607 = new BitSet(new long[]{0x0000000000000190L});
	public static final BitSet FOLLOW_param_in_params624 = new BitSet(new long[]{0x00000000000001F2L});
	public static final BitSet FOLLOW_MOT_in_param652 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param662 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_conj_in_param677 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param688 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_AUTEUR_in_param708 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param718 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_conj_in_param733 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param744 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_DATE_in_param764 = new BitSet(new long[]{0x00000001FFFC0000L});
	public static final BitSet FOLLOW_var_date_in_param776 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_conj_in_param791 = new BitSet(new long[]{0x00000001FFFC0000L});
	public static final BitSet FOLLOW_var_date_in_param802 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_CONJ_OR_in_conj826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_AND_in_conj835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_ANNEE_in_var_date860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_JOUR_in_var_date886 = new BitSet(new long[]{0x00000001FFE00000L});
	public static final BitSet FOLLOW_VAR_MOIS_JANVIER_in_var_date905 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_FEVRIER_in_var_date918 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_MARS_in_var_date931 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_AVRIL_in_var_date944 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_MAI_in_var_date957 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_JUIN_in_var_date970 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_JUILLET_in_var_date983 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_AOUT_in_var_date996 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_SEPTEMBRE_in_var_date1009 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_OCTOBRE_in_var_date1022 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_NOVEMBRE_in_var_date1035 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_MOIS_DECEMBRE_in_var_date1048 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_VAR_ANNEE_in_var_date1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_DATE_in_var_date1087 = new BitSet(new long[]{0x0000000000000002L});
}
