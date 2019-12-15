// $ANTLR 3.5.1 /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g 2019-12-14 17:27:39

    package main;
    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONJ_AND", "CONJ_OR", "COUNT", 
		"DATE", "DATE_AFTER", "DATE_BEFORE", "DATE_BETWEEN", "DATE_FROM", "DATE_TO", 
		"MOT", "MOT_TEXTE", "MOT_TITRE", "POINT", "RUBRIQUE", "SELECT", "SELECT_ARTICLE", 
		"SELECT_BULLETIN", "SELECT_DATE", "SELECT_SHORT_DATE", "VAR_ANNEE", "VAR_DATE", 
		"VAR_JOUR", "VAR_MOIS_AOUT", "VAR_MOIS_AVRIL", "VAR_MOIS_DECEMBRE", "VAR_MOIS_FEVRIER", 
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
	public static final int MOT_TEXTE=14;
	public static final int MOT_TITRE=15;
	public static final int POINT=16;
	public static final int RUBRIQUE=17;
	public static final int SELECT=18;
	public static final int SELECT_ARTICLE=19;
	public static final int SELECT_BULLETIN=20;
	public static final int SELECT_DATE=21;
	public static final int SELECT_SHORT_DATE=22;
	public static final int VAR_ANNEE=23;
	public static final int VAR_DATE=24;
	public static final int VAR_JOUR=25;
	public static final int VAR_MOIS_AOUT=26;
	public static final int VAR_MOIS_AVRIL=27;
	public static final int VAR_MOIS_DECEMBRE=28;
	public static final int VAR_MOIS_FEVRIER=29;
	public static final int VAR_MOIS_JANVIER=30;
	public static final int VAR_MOIS_JUILLET=31;
	public static final int VAR_MOIS_JUIN=32;
	public static final int VAR_MOIS_MAI=33;
	public static final int VAR_MOIS_MARS=34;
	public static final int VAR_MOIS_NOVEMBRE=35;
	public static final int VAR_MOIS_OCTOBRE=36;
	public static final int VAR_MOIS_SEPTEMBRE=37;
	public static final int VAR_MOT=38;
	public static final int WS=39;

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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:60:1: requete returns [Arbre arbre_requete = new Arbre(\"\")] : sl= select ps= params ( POINT )? ;
	public final Arbre requete() throws RecognitionException {
		Arbre arbre_requete =  new Arbre("");


		Arbre sl =null;
		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:61:26: (sl= select ps= params ( POINT )? )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:62:3: sl= select ps= params ( POINT )?
			{
			pushFollow(FOLLOW_select_in_requete407);
			sl=select();
			state._fsp--;


							arbre_requete.ajouteFils(sl);
						
			pushFollow(FOLLOW_params_in_requete425);
			ps=params();
			state._fsp--;


							arbre_requete.ajouteFils(ps);
						
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:71:3: ( POINT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==POINT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:71:3: POINT
					{
					match(input,POINT,FOLLOW_POINT_in_requete435); 
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:74:1: select returns [Arbre arbre_select = new Arbre(\"select\")] : ( ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* ) | SELECT_SHORT_DATE | ( COUNT ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE ) ) );
	public final Arbre select() throws RecognitionException {
		Arbre arbre_select =  new Arbre("select");


		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:74:59: ( ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* ) | SELECT_SHORT_DATE | ( COUNT ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE ) ) )
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:75:2: ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:75:2: ( SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:76:3: SELECT ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )*
					{
					match(input,SELECT,FOLLOW_SELECT_in_select454); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:77:3: ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE )
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
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:78:4: SELECT_ARTICLE
							{
							match(input,SELECT_ARTICLE,FOLLOW_SELECT_ARTICLE_in_select463); 
							 arbre_select.ajouteFils(new Arbre("", "fichier")); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:80:4: SELECT_BULLETIN
							{
							match(input,SELECT_BULLETIN,FOLLOW_SELECT_BULLETIN_in_select475); 
							 arbre_select.ajouteFils(new Arbre("", "numero")); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:82:4: SELECT_DATE
							{
							match(input,SELECT_DATE,FOLLOW_SELECT_DATE_in_select487); 
							 arbre_select.ajouteFils(new Arbre("", "date")); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:84:4: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_select499); 
							 arbre_select.ajouteFils(new Arbre("", "rubrique")); 
							}
							break;

					}

					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:86:3: ( CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE ) )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==CONJ_AND) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:87:4: CONJ_AND ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE )
							{
							match(input,CONJ_AND,FOLLOW_CONJ_AND_in_select514); 
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:88:4: ( SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | RUBRIQUE )
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
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:89:5: SELECT_ARTICLE
									{
									match(input,SELECT_ARTICLE,FOLLOW_SELECT_ARTICLE_in_select525); 
									 arbre_select.ajouteFils(new Arbre("", ", fichier")); 
									}
									break;
								case 2 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:91:5: SELECT_BULLETIN
									{
									match(input,SELECT_BULLETIN,FOLLOW_SELECT_BULLETIN_in_select539); 
									 arbre_select.ajouteFils(new Arbre("", ", numero")); 
									}
									break;
								case 3 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:93:5: SELECT_DATE
									{
									match(input,SELECT_DATE,FOLLOW_SELECT_DATE_in_select553); 
									 arbre_select.ajouteFils(new Arbre("", ", date")); 
									}
									break;
								case 4 :
									// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:95:5: RUBRIQUE
									{
									match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_select567); 
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:100:2: SELECT_SHORT_DATE
					{
					match(input,SELECT_SHORT_DATE,FOLLOW_SELECT_SHORT_DATE_in_select588); 
					 arbre_select.ajouteFils(new Arbre("", "date")); 
					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:102:2: ( COUNT ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE ) )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:102:2: ( COUNT ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE ) )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:103:3: COUNT ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE )
					{
					match(input,COUNT,FOLLOW_COUNT_in_select600); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:104:3: ( SELECT_ARTICLE | SELECT_BULLETIN | RUBRIQUE )
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
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:105:4: SELECT_ARTICLE
							{
							match(input,SELECT_ARTICLE,FOLLOW_SELECT_ARTICLE_in_select610); 
							 arbre_select.ajouteFils(new Arbre("", "count(fichier)")); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:107:4: SELECT_BULLETIN
							{
							match(input,SELECT_BULLETIN,FOLLOW_SELECT_BULLETIN_in_select622); 
							 arbre_select.ajouteFils(new Arbre("", "count(numero)")); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:109:4: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_select635); 
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:114:1: params returns [Arbre arbre_params = new Arbre(\"params\")] : par1= param ( (conj1= conj )? par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre arbre_params =  new Arbre("params");


		Arbre par1 =null;
		Arbre conj1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:115:40: (par1= param ( (conj1= conj )? par2= param )* )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:116:3: par1= param ( (conj1= conj )? par2= param )*
			{
			pushFollow(FOLLOW_param_in_params670);
			par1=param();
			state._fsp--;


							arbre_params.ajouteFils(par1);
						
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:120:3: ( (conj1= conj )? par2= param )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= CONJ_AND && LA8_0 <= CONJ_OR)||(LA8_0 >= DATE && LA8_0 <= MOT)||LA8_0==RUBRIQUE) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:121:4: (conj1= conj )? par2= param
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:121:4: (conj1= conj )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= CONJ_AND && LA7_0 <= CONJ_OR)) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:122:5: conj1= conj
							{
							pushFollow(FOLLOW_conj_in_params695);
							conj1=conj();
							state._fsp--;

							 //TODO: Ajouter la conjonction SQL valide 'or', 'and' et non pas française.
												arbre_params.ajouteFils(conj1);
											
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params712);
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:133:1: param returns [Arbre arbre_param = new Arbre(\"param\")] : ( ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) ( MOT_TEXTE ( MOT )? var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) ( MOT_TITRE ( MOT )? var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) | ( RUBRIQUE var_rubrique_1= VAR_MOT (conj1= conj var_rubrique_1= VAR_MOT )* ) | ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* ) | ( ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER ) var_date_1= var_date ) | (var_date_comp= DATE_BETWEEN var_date_1= var_date CONJ_AND var_date_2= var_date ) );
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:133:56: ( ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) ( MOT_TEXTE ( MOT )? var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) ( MOT_TITRE ( MOT )? var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) | ( RUBRIQUE var_rubrique_1= VAR_MOT (conj1= conj var_rubrique_1= VAR_MOT )* ) | ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* ) | ( ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER ) var_date_1= var_date ) | (var_date_comp= DATE_BETWEEN var_date_1= var_date CONJ_AND var_date_2= var_date ) )
			int alt17=5;
			switch ( input.LA(1) ) {
			case MOT:
				{
				alt17=1;
				}
				break;
			case RUBRIQUE:
				{
				alt17=2;
				}
				break;
			case DATE:
				{
				alt17=3;
				}
				break;
			case DATE_AFTER:
			case DATE_BEFORE:
			case DATE_FROM:
			case DATE_TO:
				{
				alt17=4;
				}
				break;
			case DATE_BETWEEN:
				{
				alt17=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:134:2: ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) ( MOT_TEXTE ( MOT )? var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* ) ( MOT_TITRE ( MOT )? var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:134:2: ( MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:135:3: MOT var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )*
					{
					match(input,MOT,FOLLOW_MOT_in_param740); 
					 arbre_param.ajouteFils(new Arbre("table", "titretexte")); 
					var_mot_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param750); 
					 arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_1.getText()+"'")); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:137:3: (conj1= conj var_mot_2= VAR_MOT )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= CONJ_AND && LA9_0 <= CONJ_OR)) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:138:4: conj1= conj var_mot_2= VAR_MOT
							{
							pushFollow(FOLLOW_conj_in_param765);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							var_mot_2=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param776); 
							 arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_2.getText()+"'")); 
							}
							break;

						default :
							break loop9;
						}
					}

					}

					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:142:2: ( MOT_TEXTE ( MOT )? var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:143:3: MOT_TEXTE ( MOT )? var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )*
					{
					match(input,MOT_TEXTE,FOLLOW_MOT_TEXTE_in_param793); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:144:3: ( MOT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==MOT) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:144:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_param798); 
							}
							break;

					}

					 
								arbre_param.ajouteFils(new Arbre("table", "texte")); 
							
					var_mot_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param809); 
					 arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_1.getText()+"'")); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:148:3: (conj1= conj var_mot_2= VAR_MOT )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= CONJ_AND && LA11_0 <= CONJ_OR)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:149:4: conj1= conj var_mot_2= VAR_MOT
							{
							pushFollow(FOLLOW_conj_in_param824);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							var_mot_2=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param835); 
							 arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_2.getText()+"'")); 
							}
							break;

						default :
							break loop11;
						}
					}

					}

					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:153:2: ( MOT_TITRE ( MOT )? var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:154:3: MOT_TITRE ( MOT )? var_mot_1= VAR_MOT (conj1= conj var_mot_2= VAR_MOT )*
					{
					match(input,MOT_TITRE,FOLLOW_MOT_TITRE_in_param852); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:155:3: ( MOT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==MOT) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:155:3: MOT
							{
							match(input,MOT,FOLLOW_MOT_in_param857); 
							}
							break;

					}

					 
								arbre_param.ajouteFils(new Arbre("table", "titre")); 
							
					var_mot_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param868); 
					 arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_1.getText()+"'")); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:159:3: (conj1= conj var_mot_2= VAR_MOT )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==CONJ_OR) ) {
							int LA13_1 = input.LA(2);
							if ( (LA13_1==VAR_MOT) ) {
								alt13=1;
							}

						}
						else if ( (LA13_0==CONJ_AND) ) {
							int LA13_2 = input.LA(2);
							if ( (LA13_2==VAR_MOT) ) {
								alt13=1;
							}

						}

						switch (alt13) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:160:4: conj1= conj var_mot_2= VAR_MOT
							{
							pushFollow(FOLLOW_conj_in_param883);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							var_mot_2=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param894); 
							 arbre_param.ajouteFils(new Arbre("mot=", "'"+var_mot_2.getText()+"'")); 
							}
							break;

						default :
							break loop13;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:165:2: ( RUBRIQUE var_rubrique_1= VAR_MOT (conj1= conj var_rubrique_1= VAR_MOT )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:165:2: ( RUBRIQUE var_rubrique_1= VAR_MOT (conj1= conj var_rubrique_1= VAR_MOT )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:166:3: RUBRIQUE var_rubrique_1= VAR_MOT (conj1= conj var_rubrique_1= VAR_MOT )*
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_param914); 
					 arbre_param.ajouteFils(new Arbre("table", "rubrique")); 
					var_rubrique_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param924); 
					 arbre_param.ajouteFils(new Arbre("rubrique=", "'"+var_rubrique_1.getText()+"'")); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:168:3: (conj1= conj var_rubrique_1= VAR_MOT )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==CONJ_OR) ) {
							int LA14_1 = input.LA(2);
							if ( (LA14_1==VAR_MOT) ) {
								alt14=1;
							}

						}
						else if ( (LA14_0==CONJ_AND) ) {
							int LA14_2 = input.LA(2);
							if ( (LA14_2==VAR_MOT) ) {
								alt14=1;
							}

						}

						switch (alt14) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:169:4: conj1= conj var_rubrique_1= VAR_MOT
							{
							pushFollow(FOLLOW_conj_in_param939);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							var_rubrique_1=(Token)match(input,VAR_MOT,FOLLOW_VAR_MOT_in_param950); 
							 arbre_param.ajouteFils(new Arbre("rubrique=", "'"+var_rubrique_1.getText()+"'")); 
							}
							break;

						default :
							break loop14;
						}
					}

					}

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:174:2: ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:174:2: ( DATE var_date_1= var_date (conj1= conj var_date_2= var_date )* )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:175:3: DATE var_date_1= var_date (conj1= conj var_date_2= var_date )*
					{
					match(input,DATE,FOLLOW_DATE_in_param970); 

								arbre_param.ajouteFils(new Arbre("table", "date"));
							
					pushFollow(FOLLOW_var_date_in_param982);
					var_date_1=var_date();
					state._fsp--;

					 arbre_param.ajouteFils(var_date_1); 
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:180:3: (conj1= conj var_date_2= var_date )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==CONJ_OR) ) {
							int LA15_1 = input.LA(2);
							if ( ((LA15_1 >= VAR_ANNEE && LA15_1 <= VAR_MOIS_SEPTEMBRE)) ) {
								alt15=1;
							}

						}
						else if ( (LA15_0==CONJ_AND) ) {
							int LA15_2 = input.LA(2);
							if ( ((LA15_2 >= VAR_ANNEE && LA15_2 <= VAR_MOIS_SEPTEMBRE)) ) {
								alt15=1;
							}

						}

						switch (alt15) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:181:4: conj1= conj var_date_2= var_date
							{
							pushFollow(FOLLOW_conj_in_param997);
							conj1=conj();
							state._fsp--;

							 arbre_param.ajouteFils(conj1); 
							pushFollow(FOLLOW_var_date_in_param1008);
							var_date_2=var_date();
							state._fsp--;

							 arbre_param.ajouteFils(var_date_2); 
							}
							break;

						default :
							break loop15;
						}
					}

					}

					}
					break;
				case 4 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:186:2: ( ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER ) var_date_1= var_date )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:186:2: ( ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER ) var_date_1= var_date )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:187:3: ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER ) var_date_1= var_date
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:187:3: ( DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER )
					int alt16=4;
					switch ( input.LA(1) ) {
					case DATE_TO:
						{
						alt16=1;
						}
						break;
					case DATE_BEFORE:
						{
						alt16=2;
						}
						break;
					case DATE_FROM:
						{
						alt16=3;
						}
						break;
					case DATE_AFTER:
						{
						alt16=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}
					switch (alt16) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:188:4: DATE_TO
							{
							match(input,DATE_TO,FOLLOW_DATE_TO_in_param1033); 

											arbre_param.ajouteFils(new Arbre("table", "date"));
											arbre_param.ajouteFils(new Arbre("comp", "<="));
										
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:193:4: DATE_BEFORE
							{
							match(input,DATE_BEFORE,FOLLOW_DATE_BEFORE_in_param1045); 

											arbre_param.ajouteFils(new Arbre("table", "date"));
											arbre_param.ajouteFils(new Arbre("comp", "<"));
										
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:198:4: DATE_FROM
							{
							match(input,DATE_FROM,FOLLOW_DATE_FROM_in_param1057); 

											arbre_param.ajouteFils(new Arbre("table", "date"));
											arbre_param.ajouteFils(new Arbre("comp", ">="));
										
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:203:4: DATE_AFTER
							{
							match(input,DATE_AFTER,FOLLOW_DATE_AFTER_in_param1069); 

											arbre_param.ajouteFils(new Arbre("table", "date"));
											arbre_param.ajouteFils(new Arbre("comp", ">"));
										
							}
							break;

					}

					pushFollow(FOLLOW_var_date_in_param1083);
					var_date_1=var_date();
					state._fsp--;


								arbre_param.ajouteFils(var_date_1);
							
					}

					}
					break;
				case 5 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:213:2: (var_date_comp= DATE_BETWEEN var_date_1= var_date CONJ_AND var_date_2= var_date )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:213:2: (var_date_comp= DATE_BETWEEN var_date_1= var_date CONJ_AND var_date_2= var_date )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:214:3: var_date_comp= DATE_BETWEEN var_date_1= var_date CONJ_AND var_date_2= var_date
					{
					var_date_comp=(Token)match(input,DATE_BETWEEN,FOLLOW_DATE_BETWEEN_in_param1102); 
					pushFollow(FOLLOW_var_date_in_param1111);
					var_date_1=var_date();
					state._fsp--;

					match(input,CONJ_AND,FOLLOW_CONJ_AND_in_param1115); 
					pushFollow(FOLLOW_var_date_in_param1123);
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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:229:1: conj returns [Arbre arbre_conj = new Arbre(\"conj\")] : ( CONJ_OR | CONJ_AND );
	public final Arbre conj() throws RecognitionException {
		Arbre arbre_conj =  new Arbre("conj");


		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:229:53: ( CONJ_OR | CONJ_AND )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==CONJ_OR) ) {
				alt18=1;
			}
			else if ( (LA18_0==CONJ_AND) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:230:2: CONJ_OR
					{
					match(input,CONJ_OR,FOLLOW_CONJ_OR_in_conj1144); 

							arbre_conj.ajouteFils(new Arbre("", "or"));
						
					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:235:2: CONJ_AND
					{
					match(input,CONJ_AND,FOLLOW_CONJ_AND_in_conj1153); 

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
	// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:241:1: var_date returns [Arbre arbre_var = new Arbre(\"var_date\")] : ( (var1= VAR_ANNEE ) | ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE ) | (var1= VAR_DATE ) );
	public final Arbre var_date() throws RecognitionException {
		Arbre arbre_var =  new Arbre("var_date");


		Token var1=null;

		try {
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:241:60: ( (var1= VAR_ANNEE ) | ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE ) | (var1= VAR_DATE ) )
			int alt21=3;
			switch ( input.LA(1) ) {
			case VAR_ANNEE:
				{
				alt21=1;
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
				alt21=2;
				}
				break;
			case VAR_DATE:
				{
				alt21=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:242:2: (var1= VAR_ANNEE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:242:2: (var1= VAR_ANNEE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:243:3: var1= VAR_ANNEE
					{
					var1=(Token)match(input,VAR_ANNEE,FOLLOW_VAR_ANNEE_in_var_date1178); 
					 
								arbre_var.ajouteFils(new Arbre("annee=", "'"+var1.getText()+"'"));
							
					}

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:249:2: ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:249:2: ( (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:250:3: (var1= VAR_JOUR )? ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE ) var1= VAR_ANNEE
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:250:3: (var1= VAR_JOUR )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==VAR_JOUR) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:251:4: var1= VAR_JOUR
							{
							var1=(Token)match(input,VAR_JOUR,FOLLOW_VAR_JOUR_in_var_date1204); 

											arbre_var.ajouteFils(new Arbre("jour=", "'"+var1.getText()+"'"));
										
							}
							break;

					}

					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:256:3: ( VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE )
					int alt20=12;
					switch ( input.LA(1) ) {
					case VAR_MOIS_JANVIER:
						{
						alt20=1;
						}
						break;
					case VAR_MOIS_FEVRIER:
						{
						alt20=2;
						}
						break;
					case VAR_MOIS_MARS:
						{
						alt20=3;
						}
						break;
					case VAR_MOIS_AVRIL:
						{
						alt20=4;
						}
						break;
					case VAR_MOIS_MAI:
						{
						alt20=5;
						}
						break;
					case VAR_MOIS_JUIN:
						{
						alt20=6;
						}
						break;
					case VAR_MOIS_JUILLET:
						{
						alt20=7;
						}
						break;
					case VAR_MOIS_AOUT:
						{
						alt20=8;
						}
						break;
					case VAR_MOIS_SEPTEMBRE:
						{
						alt20=9;
						}
						break;
					case VAR_MOIS_OCTOBRE:
						{
						alt20=10;
						}
						break;
					case VAR_MOIS_NOVEMBRE:
						{
						alt20=11;
						}
						break;
					case VAR_MOIS_DECEMBRE:
						{
						alt20=12;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}
					switch (alt20) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:257:4: VAR_MOIS_JANVIER
							{
							match(input,VAR_MOIS_JANVIER,FOLLOW_VAR_MOIS_JANVIER_in_var_date1223); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'01'")); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:259:4: VAR_MOIS_FEVRIER
							{
							match(input,VAR_MOIS_FEVRIER,FOLLOW_VAR_MOIS_FEVRIER_in_var_date1236); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'02'")); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:261:4: VAR_MOIS_MARS
							{
							match(input,VAR_MOIS_MARS,FOLLOW_VAR_MOIS_MARS_in_var_date1249); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'03'")); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:263:4: VAR_MOIS_AVRIL
							{
							match(input,VAR_MOIS_AVRIL,FOLLOW_VAR_MOIS_AVRIL_in_var_date1262); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'04'")); 
							}
							break;
						case 5 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:265:4: VAR_MOIS_MAI
							{
							match(input,VAR_MOIS_MAI,FOLLOW_VAR_MOIS_MAI_in_var_date1275); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'05'")); 
							}
							break;
						case 6 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:267:4: VAR_MOIS_JUIN
							{
							match(input,VAR_MOIS_JUIN,FOLLOW_VAR_MOIS_JUIN_in_var_date1288); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'06'")); 
							}
							break;
						case 7 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:269:4: VAR_MOIS_JUILLET
							{
							match(input,VAR_MOIS_JUILLET,FOLLOW_VAR_MOIS_JUILLET_in_var_date1301); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'07'")); 
							}
							break;
						case 8 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:271:4: VAR_MOIS_AOUT
							{
							match(input,VAR_MOIS_AOUT,FOLLOW_VAR_MOIS_AOUT_in_var_date1314); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'08'")); 
							}
							break;
						case 9 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:273:4: VAR_MOIS_SEPTEMBRE
							{
							match(input,VAR_MOIS_SEPTEMBRE,FOLLOW_VAR_MOIS_SEPTEMBRE_in_var_date1327); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'09'")); 
							}
							break;
						case 10 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:275:4: VAR_MOIS_OCTOBRE
							{
							match(input,VAR_MOIS_OCTOBRE,FOLLOW_VAR_MOIS_OCTOBRE_in_var_date1340); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'10'")); 
							}
							break;
						case 11 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:277:4: VAR_MOIS_NOVEMBRE
							{
							match(input,VAR_MOIS_NOVEMBRE,FOLLOW_VAR_MOIS_NOVEMBRE_in_var_date1353); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'11'")); 
							}
							break;
						case 12 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:279:4: VAR_MOIS_DECEMBRE
							{
							match(input,VAR_MOIS_DECEMBRE,FOLLOW_VAR_MOIS_DECEMBRE_in_var_date1366); 
							 arbre_var.ajouteFils(new Arbre("mois=", "'12'")); 
							}
							break;

					}

					var1=(Token)match(input,VAR_ANNEE,FOLLOW_VAR_ANNEE_in_var_date1380); 
					 
								arbre_var.ajouteFils(new Arbre("annee=", "'"+var1.getText()+"'"));
							
					}

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:287:2: (var1= VAR_DATE )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:287:2: (var1= VAR_DATE )
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:289:3: var1= VAR_DATE
					{
					var1=(Token)match(input,VAR_DATE,FOLLOW_VAR_DATE_in_var_date1405); 

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



	public static final BitSet FOLLOW_select_in_requete407 = new BitSet(new long[]{0x0000000000023F80L});
	public static final BitSet FOLLOW_params_in_requete425 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_POINT_in_requete435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select454 = new BitSet(new long[]{0x00000000003A0000L});
	public static final BitSet FOLLOW_SELECT_ARTICLE_in_select463 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_SELECT_BULLETIN_in_select475 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_SELECT_DATE_in_select487 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_RUBRIQUE_in_select499 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_CONJ_AND_in_select514 = new BitSet(new long[]{0x00000000003A0000L});
	public static final BitSet FOLLOW_SELECT_ARTICLE_in_select525 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_SELECT_BULLETIN_in_select539 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_SELECT_DATE_in_select553 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_RUBRIQUE_in_select567 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_SELECT_SHORT_DATE_in_select588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_select600 = new BitSet(new long[]{0x00000000001A0000L});
	public static final BitSet FOLLOW_SELECT_ARTICLE_in_select610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_BULLETIN_in_select622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_select635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params670 = new BitSet(new long[]{0x0000000000023FB2L});
	public static final BitSet FOLLOW_conj_in_params695 = new BitSet(new long[]{0x0000000000023F80L});
	public static final BitSet FOLLOW_param_in_params712 = new BitSet(new long[]{0x0000000000023FB2L});
	public static final BitSet FOLLOW_MOT_in_param740 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param750 = new BitSet(new long[]{0x0000000000004030L});
	public static final BitSet FOLLOW_conj_in_param765 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param776 = new BitSet(new long[]{0x0000000000004030L});
	public static final BitSet FOLLOW_MOT_TEXTE_in_param793 = new BitSet(new long[]{0x0000004000002000L});
	public static final BitSet FOLLOW_MOT_in_param798 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param809 = new BitSet(new long[]{0x0000000000008030L});
	public static final BitSet FOLLOW_conj_in_param824 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param835 = new BitSet(new long[]{0x0000000000008030L});
	public static final BitSet FOLLOW_MOT_TITRE_in_param852 = new BitSet(new long[]{0x0000004000002000L});
	public static final BitSet FOLLOW_MOT_in_param857 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param868 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_conj_in_param883 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param894 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_RUBRIQUE_in_param914 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param924 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_conj_in_param939 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_VAR_MOT_in_param950 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_DATE_in_param970 = new BitSet(new long[]{0x0000003FFF800000L});
	public static final BitSet FOLLOW_var_date_in_param982 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_conj_in_param997 = new BitSet(new long[]{0x0000003FFF800000L});
	public static final BitSet FOLLOW_var_date_in_param1008 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_DATE_TO_in_param1033 = new BitSet(new long[]{0x0000003FFF800000L});
	public static final BitSet FOLLOW_DATE_BEFORE_in_param1045 = new BitSet(new long[]{0x0000003FFF800000L});
	public static final BitSet FOLLOW_DATE_FROM_in_param1057 = new BitSet(new long[]{0x0000003FFF800000L});
	public static final BitSet FOLLOW_DATE_AFTER_in_param1069 = new BitSet(new long[]{0x0000003FFF800000L});
	public static final BitSet FOLLOW_var_date_in_param1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_BETWEEN_in_param1102 = new BitSet(new long[]{0x0000003FFF800000L});
	public static final BitSet FOLLOW_var_date_in_param1111 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CONJ_AND_in_param1115 = new BitSet(new long[]{0x0000003FFF800000L});
	public static final BitSet FOLLOW_var_date_in_param1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_OR_in_conj1144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONJ_AND_in_conj1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_ANNEE_in_var_date1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_JOUR_in_var_date1204 = new BitSet(new long[]{0x0000003FFC000000L});
	public static final BitSet FOLLOW_VAR_MOIS_JANVIER_in_var_date1223 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_FEVRIER_in_var_date1236 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_MARS_in_var_date1249 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_AVRIL_in_var_date1262 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_MAI_in_var_date1275 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_JUIN_in_var_date1288 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_JUILLET_in_var_date1301 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_AOUT_in_var_date1314 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_SEPTEMBRE_in_var_date1327 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_OCTOBRE_in_var_date1340 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_NOVEMBRE_in_var_date1353 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_MOIS_DECEMBRE_in_var_date1366 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VAR_ANNEE_in_var_date1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_DATE_in_var_date1405 = new BitSet(new long[]{0x0000000000000002L});
}
