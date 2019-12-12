package main;
// $ANTLR 3.5.1 /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g 2019-12-12 19:30:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTEUR", "CONJ_AND", "CONJ_OR", 
		"DATE", "MOT", "POINT", "RUBRIQUE", "SELECT", "SELECT_ARTICLE", "SELECT_BULLETIN", 
		"SELECT_DATE", "SELECT_SHORT_DATE", "VAR_ANNEE", "VAR_DATE", "VAR_JOUR", 
		"VAR_MOIS_AOUT", "VAR_MOIS_AVRIL", "VAR_MOIS_DECEMBRE", "VAR_MOIS_FEVRIER", 
		"VAR_MOIS_JANVIER", "VAR_MOIS_JUILLET", "VAR_MOIS_JUIN", "VAR_MOIS_MAI", 
		"VAR_MOIS_MARS", "VAR_MOIS_NOVEMBRE", "VAR_MOIS_OCTOBRE", "VAR_MOIS_SEPTEMBRE", 
		"VAR_MOT", "WS"
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
	public static final int SELECT_BULLETIN=13;
	public static final int SELECT_DATE=14;
	public static final int SELECT_SHORT_DATE=15;
	public static final int VAR_ANNEE=16;
	public static final int VAR_DATE=17;
	public static final int VAR_JOUR=18;
	public static final int VAR_MOIS_AOUT=19;
	public static final int VAR_MOIS_AVRIL=20;
	public static final int VAR_MOIS_DECEMBRE=21;
	public static final int VAR_MOIS_FEVRIER=22;
	public static final int VAR_MOIS_JANVIER=23;
	public static final int VAR_MOIS_JUILLET=24;
	public static final int VAR_MOIS_JUIN=25;
	public static final int VAR_MOIS_MAI=26;
	public static final int VAR_MOIS_MARS=27;
	public static final int VAR_MOIS_NOVEMBRE=28;
	public static final int VAR_MOIS_OCTOBRE=29;
	public static final int VAR_MOIS_SEPTEMBRE=30;
	public static final int VAR_MOT=31;
	public static final int WS=32;

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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:45:1: requete returns [Arbre arbre_requete = new Arbre(\"\")] : sl= select ps= params ( POINT )? ;
	public final Arbre requete() throws RecognitionException {
		Arbre arbre_requete =  new Arbre("");


		Arbre sl =null;
		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:46:26: (sl= select ps= params ( POINT )? )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:3: sl= select ps= params ( POINT )?
			{
			pushFollow(FOLLOW_select_in_requete338);
			sl=select();
			state._fsp--;


							arbre_requete.ajouteFils(sl);
						
			pushFollow(FOLLOW_params_in_requete356);
			ps=params();
			state._fsp--;


							arbre_requete.ajouteFils(ps);
						
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:3: ( POINT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==POINT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:3: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_requete366); 
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:59:1: select returns [Arbre arbre_select = new Arbre(\"select\")] : ( ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* ) | SELECT_SHORT_DATE );
	public final Arbre select() throws RecognitionException {
		Arbre arbre_select =  new Arbre("select");


		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:59:59: ( ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* ) | SELECT_SHORT_DATE )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==SELECT) ) {
				alt5=1;
			}
			else if ( (LA5_0==SELECT_SHORT_DATE) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:60:2: ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:60:2: ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:61:3: SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )*
					{
					match(input,SELECT,FOLLOW_SELECT_in_select385); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:62:3: ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE )
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
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:63:4: SELECT_ARTICLE
							{
							match(input,SELECT_ARTICLE,FOLLOW_SELECT_ARTICLE_in_select394); 
							 arbre_select.ajouteFils(new Arbre("", "fichier")); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:65:4: SELECT_BULLETIN
							{
							match(input,SELECT_BULLETIN,FOLLOW_SELECT_BULLETIN_in_select406); 
							 arbre_select.ajouteFils(new Arbre("", "numero")); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:67:4: SELECT_DATE
							{
							match(input,SELECT_DATE,FOLLOW_SELECT_DATE_in_select418); 
							 arbre_select.ajouteFils(new Arbre("", "date")); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:69:4: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_select430); 
							 arbre_select.ajouteFils(new Arbre("", "rubrique")); 
							}
							break;

					}

					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:71:3: ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==CONJ_AND) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:72:4: CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE )
							{
							match(input,CONJ_AND,FOLLOW_CONJ_AND_in_select445); 
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:73:4: ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE )
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
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:74:5: SELECT_ARTICLE
									{
									match(input,SELECT_ARTICLE,FOLLOW_SELECT_ARTICLE_in_select456); 
									 arbre_select.ajouteFils(new Arbre("", ", fichier")); 
									}
									break;
								case 2 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:76:5: SELECT_BULLETIN
									{
									match(input,SELECT_BULLETIN,FOLLOW_SELECT_BULLETIN_in_select470); 
									 arbre_select.ajouteFils(new Arbre("", ", numero")); 
									}
									break;
								case 3 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:78:5: SELECT_DATE
									{
									match(input,SELECT_DATE,FOLLOW_SELECT_DATE_in_select484); 
									 arbre_select.ajouteFils(new Arbre("", ", date")); 
									}
									break;
								case 4 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:80:5: RUBRIQUE
									{
									match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_select498); 
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:85:2: SELECT_SHORT_DATE
					{
					match(input,SELECT_SHORT_DATE,FOLLOW_SELECT_SHORT_DATE_in_select519); 
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:88:1: params returns [Arbre arbre_params = new Arbre(\"params\")] : par1= param ( (conj1= conj )? par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre arbre_params =  new Arbre("params");


		Arbre par1 =null;
		Arbre conj1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:89:40: (par1= param ( (conj1= conj )? par2= param )* )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:90:3: par1= param ( (conj1= conj )? par2= param )*
			{
			pushFollow(FOLLOW_param_in_params547);
			par1=param();
			state._fsp--;


							arbre_params.ajouteFils(par1);
						
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:94:3: ( (conj1= conj )? par2= param )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= AUTEUR && LA7_0 <= MOT)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:95:4: (conj1= conj )? par2= param
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:95:4: (conj1= conj )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= CONJ_AND && LA6_0 <= CONJ_OR)) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:96:5: conj1= conj
							{
							pushFollow(FOLLOW_conj_in_params572);
							conj1=conj();
							state._fsp--;

							 //TODO: Ajouter la conjonction SQL valide 'or', 'and' et non pas française.
												arbre_params.ajouteFils(conj1);
											
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params589);
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:107:1: param returns [Arbre arbre_param = new Arbre(\"param\")] : ( ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) | ( AUTEUR var_auteur_1= VAR_MOT (conj1= conj var_auteur_2= VAR_MOT )* ) | ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* ) );
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:107:56: ( ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) | ( AUTEUR var_auteur_1= VAR_MOT (conj1= conj var_auteur_2= VAR_MOT )* ) | ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* ) )
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:108:2: ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:108:2: ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:109:3: MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )*
					{
					match(input,MOT,FOLLOW_MOT_in_param617); 
					 arbre_param.ajouteFils(new Arbre("table", "texte")); 
					var_mot_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param627); 
					 arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_1.getText()+"'")); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:111:3: (conj1= conj var_mot_2= VAR_MOT )*
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
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:112:4: conj1= conj var_mot_2= VAR_MOT
							{
							pushFollow(FOLLOW_conj_in_param642);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							var_mot_2=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param653); 
							 arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_2.getText()+"'")); 
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:117:2: ( AUTEUR var_auteur_1= VAR_MOT (conj1= conj var_auteur_2= VAR_MOT )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:117:2: ( AUTEUR var_auteur_1= VAR_MOT (conj1= conj var_auteur_2= VAR_MOT )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:118:3: AUTEUR var_auteur_1= VAR_MOT (conj1= conj var_auteur_2= VAR_MOT )*
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_param673); 
					 arbre_param.ajouteFils(new Arbre("table", "auteur")); 
					var_auteur_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param683); 
					 arbre_param.ajouteFils(new Arbre("auteur=", "'"+var_auteur_1.getText()+"'")); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:120:3: (conj1= conj var_auteur_2= VAR_MOT )*
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
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:121:4: conj1= conj var_auteur_2= VAR_MOT
							{
							pushFollow(FOLLOW_conj_in_param698);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							var_auteur_2=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param709); 
							 arbre_param.ajouteFils(new Arbre("auteur=", "'"+var_auteur_2.getText()+"'")); 
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:126:2: ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:126:2: ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:127:3: DATE var_date_1= var_date (conj1= conj var_date_2= var_date )*
					{
					match(input,DATE,FOLLOW_DATE_in_param729); 

								arbre_param.ajouteFils(new Arbre("table", "date"));
							
					pushFollow(FOLLOW_var_date_in_param741);
					var_date_1=var_date();
					state._fsp--;

					 arbre_param.ajouteFils(var_date_1); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:132:3: (conj1= conj var_date_2= var_date )*
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
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:133:4: conj1= conj var_date_2= var_date
							{
							pushFollow(FOLLOW_conj_in_param756);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							pushFollow(FOLLOW_var_date_in_param767);
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:139:1: conj returns [Arbre arbre_conj = new Arbre(\"conj\")] : ( CONJ_OR | CONJ_AND );
	public final Arbre conj() throws RecognitionException {
		Arbre arbre_conj =  new Arbre("conj");


		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:139:53: ( CONJ_OR | CONJ_AND )
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:140:2: CONJ_OR
					{
					match(input,CONJ_OR,FOLLOW_CONJ_OR_in_conj791); 

							arbre_conj.ajouteFils(new Arbre("", "or"));
						
					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:145:2: CONJ_AND
					{
					match(input,CONJ_AND,FOLLOW_CONJ_AND_in_conj800); 

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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:151:1: var_date returns [Arbre arbre_var = new Arbre(\"var_date\")] : ( (var1= VAR_ANNEE ) | ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE ) | (var1= VAR_DATE ) );
	public final Arbre var_date() throws RecognitionException {
		Arbre arbre_var =  new Arbre("var_date");


		Token var1=null;

		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:151:60: ( (var1= VAR_ANNEE ) | ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE ) | (var1= VAR_DATE ) )
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:152:2: (var1= VAR_ANNEE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:152:2: (var1= VAR_ANNEE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:153:3: var1= VAR_ANNEE
					{
					var1=(Token)match(input,VAR_ANNEE,FOLLOW_VAR_ANNEE_in_var_date825); 
					 
								arbre_var.ajouteFils(new Arbre("annee=", "'"+var1.getText()+"'"));
							
					}

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:159:2: ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:159:2: ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:160:3: (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:160:3: (var1= VAR_JOUR )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==VAR_JOUR) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:161:4: var1= VAR_JOUR
							{
							var1=(Token)match(input,VAR_JOUR,FOLLOW_VAR_JOUR_in_var_date851); 

											arbre_var.ajouteFils(new Arbre("jour=", "'"+var1.getText()+"'"));
										
							}
							break;

					}

					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:166:3: ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE )
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
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:167:4: VAR_MOIS_JANVIER
							{
							match(input,VAR_MOIS_JANVIER,FOLLOW_VAR_MOIS_JANVIER_in_var_date870); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'01'")); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:169:4: VAR_MOIS_FEVRIER
							{
							match(input,VAR_MOIS_FEVRIER,FOLLOW_VAR_MOIS_FEVRIER_in_var_date883); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'02'")); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:171:4: VAR_MOIS_MARS
							{
							match(input,VAR_MOIS_MARS,FOLLOW_VAR_MOIS_MARS_in_var_date896); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'03'")); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:173:4: VAR_MOIS_AVRIL
							{
							match(input,VAR_MOIS_AVRIL,FOLLOW_VAR_MOIS_AVRIL_in_var_date909); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'04'")); 
							}
							break;
						case 5 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:175:4: VAR_MOIS_MAI
							{
							match(input,VAR_MOIS_MAI,FOLLOW_VAR_MOIS_MAI_in_var_date922); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'05'")); 
							}
							break;
						case 6 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:177:4: VAR_MOIS_JUIN
							{
							match(input,VAR_MOIS_JUIN,FOLLOW_VAR_MOIS_JUIN_in_var_date935); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'06'")); 
							}
							break;
						case 7 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:179:4: VAR_MOIS_JUILLET
							{
							match(input,VAR_MOIS_JUILLET,FOLLOW_VAR_MOIS_JUILLET_in_var_date948); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'07'")); 
							}
							break;
						case 8 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:181:4: VAR_MOIS_AOUT
							{
							match(input,VAR_MOIS_AOUT,FOLLOW_VAR_MOIS_AOUT_in_var_date961); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'08'")); 
							}
							break;
						case 9 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:183:4: VAR_MOIS_SEPTEMBRE
							{
							match(input,VAR_MOIS_SEPTEMBRE,FOLLOW_VAR_MOIS_SEPTEMBRE_in_var_date974); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'09'")); 
							}
							break;
						case 10 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:185:4: VAR_MOIS_OCTOBRE
							{
							match(input,VAR_MOIS_OCTOBRE,FOLLOW_VAR_MOIS_OCTOBRE_in_var_date987); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'10'")); 
							}
							break;
						case 11 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:187:4: VAR_MOIS_NOVEMBRE
							{
							match(input,VAR_MOIS_NOVEMBRE,FOLLOW_VAR_MOIS_NOVEMBRE_in_var_date1000); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'11'")); 
							}
							break;
						case 12 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:189:4: VAR_MOIS_DECEMBRE
							{
							match(input,VAR_MOIS_DECEMBRE,FOLLOW_VAR_MOIS_DECEMBRE_in_var_date1013); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'12'")); 
							}
							break;

					}

					var1=(Token)match(input,VAR_ANNEE,FOLLOW_VAR_ANNEE_in_var_date1027); 
					 
								arbre_var.ajouteFils(new Arbre("annee=", "'"+var1.getText()+"'"));
							
					}

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:197:2: (var1= VAR_DATE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:197:2: (var1= VAR_DATE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:199:3: var1= VAR_DATE
					{
					var1=(Token)match(input,VAR_DATE,FOLLOW_VAR_DATE_in_var_date1052); 

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



	public static final BitSet FOLLOW_select_in_requete338 = new BitSet(new long[]{0x0000000000000190L});
	public static final BitSet FOLLOW_params_in_requete356 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_POINT_in_requete366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select385 = new BitSet(new long[]{0x0000000000007400L});
	public static final BitSet FOLLOW_SELECT_ARTICLE_in_select394 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_BULLETIN_in_select406 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_DATE_in_select418 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_RUBRIQUE_in_select430 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_CONJ_AND_in_select445 = new BitSet(new long[]{0x0000000000007400L});
	public static final BitSet FOLLOW_SELECT_ARTICLE_in_select456 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_BULLETIN_in_select470 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_DATE_in_select484 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_RUBRIQUE_in_select498 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_SELECT_SHORT_DATE_in_select519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params547 = new BitSet(new long[]{0x00000000000001F2L});
	public static final BitSet FOLLOW_conj_in_params572 = new BitSet(new long[]{0x0000000000000190L});
	public static final BitSet FOLLOW_param_in_params589 = new BitSet(new long[]{0x00000000000001F2L});
	public static final BitSet FOLLOW_MOT_in_param617 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param627 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_conj_in_param642 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param653 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_AUTEUR_in_param673 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param683 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_conj_in_param698 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param709 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_DATE_in_param729 = new BitSet(new long[]{0x000000007FFF0000L});
	public static final BitSet FOLLOW_var_date_in_param741 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_conj_in_param756 = new BitSet(new long[]{0x000000007FFF0000L});
	public static final BitSet FOLLOW_var_date_in_param767 = new BitSet(new long[]{0x0000000000000062L});
	public static final BitSet FOLLOW_CONJ_OR_in_conj791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_AND_in_conj800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_ANNEE_in_var_date825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_JOUR_in_var_date851 = new BitSet(new long[]{0x000000007FF80000L});
	public static final BitSet FOLLOW_VAR_MOIS_JANVIER_in_var_date870 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_FEVRIER_in_var_date883 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_MARS_in_var_date896 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_AVRIL_in_var_date909 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_MAI_in_var_date922 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_JUIN_in_var_date935 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_JUILLET_in_var_date948 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_AOUT_in_var_date961 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_SEPTEMBRE_in_var_date974 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_OCTOBRE_in_var_date987 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_NOVEMBRE_in_var_date1000 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_MOIS_DECEMBRE_in_var_date1013 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_VAR_ANNEE_in_var_date1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_DATE_in_var_date1052 = new BitSet(new long[]{0x0000000000000002L});
}
