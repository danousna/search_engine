// $ANTLR 3.5.1 /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g 2019-12-05 18:35:38

package main;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public sqlLexer() {} 
	public sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:3:8: ( 'vouloir' | 'quels' | 'quel' )
			int alt1=3;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='v') ) {
				alt1=1;
			}
			else if ( (LA1_0=='q') ) {
				int LA1_2 = input.LA(2);
				if ( (LA1_2=='u') ) {
					int LA1_3 = input.LA(3);
					if ( (LA1_3=='e') ) {
						int LA1_4 = input.LA(4);
						if ( (LA1_4=='l') ) {
							int LA1_5 = input.LA(5);
							if ( (LA1_5=='s') ) {
								alt1=2;
							}

							else {
								alt1=3;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:3:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:3:22: 'quels'
					{
					match("quels"); 

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:3:32: 'quel'
					{
					match("quel"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "SELECT_ARTICLE"
	public final void mSELECT_ARTICLE() throws RecognitionException {
		try {
			int _type = SELECT_ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:5:16: ( 'article' | 'articles' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='a') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='r') ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2=='t') ) {
						int LA2_3 = input.LA(4);
						if ( (LA2_3=='i') ) {
							int LA2_4 = input.LA(5);
							if ( (LA2_4=='c') ) {
								int LA2_5 = input.LA(6);
								if ( (LA2_5=='l') ) {
									int LA2_6 = input.LA(7);
									if ( (LA2_6=='e') ) {
										int LA2_7 = input.LA(8);
										if ( (LA2_7=='s') ) {
											alt2=2;
										}

										else {
											alt2=1;
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 2, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:5:18: 'article'
					{
					match("article"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:5:30: 'articles'
					{
					match("articles"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT_ARTICLE"

	// $ANTLR start "SELECT_BULLETIN"
	public final void mSELECT_BULLETIN() throws RecognitionException {
		try {
			int _type = SELECT_BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:7:17: ( 'bulletin' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:7:19: 'bulletin'
			{
			match("bulletin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT_BULLETIN"

	// $ANTLR start "SELECT_AUTEUR"
	public final void mSELECT_AUTEUR() throws RecognitionException {
		try {
			int _type = SELECT_AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:9:15: ( 'auteur' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:9:17: 'auteur'
			{
			match("auteur"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT_AUTEUR"

	// $ANTLR start "SELECT_DATE"
	public final void mSELECT_DATE() throws RecognitionException {
		try {
			int _type = SELECT_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:11:13: ( 'date' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:11:15: 'date'
			{
			match("date"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT_DATE"

	// $ANTLR start "SELECT_SHORT_AUTEUR"
	public final void mSELECT_SHORT_AUTEUR() throws RecognitionException {
		try {
			int _type = SELECT_SHORT_AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:13:21: ( 'qui' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:13:23: 'qui'
			{
			match("qui"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT_SHORT_AUTEUR"

	// $ANTLR start "SELECT_SHORT_DATE"
	public final void mSELECT_SHORT_DATE() throws RecognitionException {
		try {
			int _type = SELECT_SHORT_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:15:19: ( 'quand' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:15:21: 'quand'
			{
			match("quand"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT_SHORT_DATE"

	// $ANTLR start "CONJ_OR"
	public final void mCONJ_OR() throws RecognitionException {
		try {
			int _type = CONJ_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:17:9: ( 'ou' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:17:11: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ_OR"

	// $ANTLR start "CONJ_AND"
	public final void mCONJ_AND() throws RecognitionException {
		try {
			int _type = CONJ_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:19:10: ( 'et' | ',' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='e') ) {
				alt3=1;
			}
			else if ( (LA3_0==',') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:19:12: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:19:19: ','
					{
					match(','); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ_AND"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:21:5: ( 'mot' | 'contenir' | 'parler' )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt4=1;
				}
				break;
			case 'c':
				{
				alt4=2;
				}
				break;
			case 'p':
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:21:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:21:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:21:28: 'parler'
					{
					match("parler"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:23:7: ( 'par' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:23:9: 'par'
			{
			match("par"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:25:9: ( 'rubrique' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:25:11: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:27:6: ( 'datant' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:27:8: 'datant'
			{
			match("datant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "VAR_JOUR"
	public final void mVAR_JOUR() throws RecognitionException {
		try {
			int _type = VAR_JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:29:10: ( ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:29:12: ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_JOUR"

	// $ANTLR start "VAR_ANNEE"
	public final void mVAR_ANNEE() throws RecognitionException {
		try {
			int _type = VAR_ANNEE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:30:11: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:30:13: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_ANNEE"

	// $ANTLR start "VAR_DATE"
	public final void mVAR_DATE() throws RecognitionException {
		try {
			int _type = VAR_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:31:10: ( VAR_JOUR '/' VAR_JOUR '/' VAR_ANNEE )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:31:12: VAR_JOUR '/' VAR_JOUR '/' VAR_ANNEE
			{
			mVAR_JOUR(); 

			match('/'); 
			mVAR_JOUR(); 

			match('/'); 
			mVAR_ANNEE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_DATE"

	// $ANTLR start "VAR_MOIS_JANVIER"
	public final void mVAR_MOIS_JANVIER() throws RecognitionException {
		try {
			int _type = VAR_MOIS_JANVIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:32:17: ( 'janviér' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:32:19: 'janviér'
			{
			match("janviér"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_JANVIER"

	// $ANTLR start "VAR_MOIS_FEVRIER"
	public final void mVAR_MOIS_FEVRIER() throws RecognitionException {
		try {
			int _type = VAR_MOIS_FEVRIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:33:18: ( 'février' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:33:20: 'février'
			{
			match("février"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_FEVRIER"

	// $ANTLR start "VAR_MOIS_MARS"
	public final void mVAR_MOIS_MARS() throws RecognitionException {
		try {
			int _type = VAR_MOIS_MARS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:34:15: ( 'mars' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:34:17: 'mars'
			{
			match("mars"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_MARS"

	// $ANTLR start "VAR_MOIS_AVRIL"
	public final void mVAR_MOIS_AVRIL() throws RecognitionException {
		try {
			int _type = VAR_MOIS_AVRIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:35:16: ( 'avril' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:35:18: 'avril'
			{
			match("avril"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_AVRIL"

	// $ANTLR start "VAR_MOIS_MAI"
	public final void mVAR_MOIS_MAI() throws RecognitionException {
		try {
			int _type = VAR_MOIS_MAI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:36:14: ( 'mai' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:36:16: 'mai'
			{
			match("mai"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_MAI"

	// $ANTLR start "VAR_MOIS_JUIN"
	public final void mVAR_MOIS_JUIN() throws RecognitionException {
		try {
			int _type = VAR_MOIS_JUIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:37:15: ( 'juin' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:37:17: 'juin'
			{
			match("juin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_JUIN"

	// $ANTLR start "VAR_MOIS_JUILLET"
	public final void mVAR_MOIS_JUILLET() throws RecognitionException {
		try {
			int _type = VAR_MOIS_JUILLET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:38:18: ( 'juillet' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:38:20: 'juillet'
			{
			match("juillet"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_JUILLET"

	// $ANTLR start "VAR_MOIS_AOUT"
	public final void mVAR_MOIS_AOUT() throws RecognitionException {
		try {
			int _type = VAR_MOIS_AOUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:39:15: ( 'août' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:39:17: 'août'
			{
			match("août"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_AOUT"

	// $ANTLR start "VAR_MOIS_SEPTEMBRE"
	public final void mVAR_MOIS_SEPTEMBRE() throws RecognitionException {
		try {
			int _type = VAR_MOIS_SEPTEMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:40:20: ( 'septembre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:40:22: 'septembre'
			{
			match("septembre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_SEPTEMBRE"

	// $ANTLR start "VAR_MOIS_OCTOBRE"
	public final void mVAR_MOIS_OCTOBRE() throws RecognitionException {
		try {
			int _type = VAR_MOIS_OCTOBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:18: ( 'octobre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:20: 'octobre'
			{
			match("octobre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_OCTOBRE"

	// $ANTLR start "VAR_MOIS_NOVEMBRE"
	public final void mVAR_MOIS_NOVEMBRE() throws RecognitionException {
		try {
			int _type = VAR_MOIS_NOVEMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:42:19: ( 'novembre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:42:21: 'novembre'
			{
			match("novembre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_NOVEMBRE"

	// $ANTLR start "VAR_MOIS_DECEMBRE"
	public final void mVAR_MOIS_DECEMBRE() throws RecognitionException {
		try {
			int _type = VAR_MOIS_DECEMBRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:43:19: ( 'décembre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:43:21: 'décembre'
			{
			match("décembre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOIS_DECEMBRE"

	// $ANTLR start "VAR_MOT"
	public final void mVAR_MOT() throws RecognitionException {
		try {
			int _type = VAR_MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:45:10: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:45:12: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:45:34: ( 'a' .. 'z' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR_MOT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\t'||LA7_0=='\r'||LA7_0==' '||LA7_0=='d'||LA7_0=='j'||LA7_0=='q') ) {
				alt7=1;
			}
			else if ( (LA7_0=='\n') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt6=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt6=1;
						}
						break;
					case '\t':
						{
						alt6=2;
						}
						break;
					case '\r':
						{
						alt6=3;
						}
						break;
					case 'j':
						{
						alt6=4;
						}
						break;
					case 'q':
						{
						alt6=5;
						}
						break;
					case 'd':
						{
						alt6=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:62: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:49:7: ( '.' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:49:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:8: ( SELECT | SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE | SELECT_SHORT_AUTEUR | SELECT_SHORT_DATE | CONJ_OR | CONJ_AND | MOT | AUTEUR | RUBRIQUE | DATE | VAR_JOUR | VAR_ANNEE | VAR_DATE | VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE | VAR_MOT | WS | POINT )
		int alt8=31;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:17: SELECT_ARTICLE
				{
				mSELECT_ARTICLE(); 

				}
				break;
			case 3 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:32: SELECT_BULLETIN
				{
				mSELECT_BULLETIN(); 

				}
				break;
			case 4 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:48: SELECT_AUTEUR
				{
				mSELECT_AUTEUR(); 

				}
				break;
			case 5 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:62: SELECT_DATE
				{
				mSELECT_DATE(); 

				}
				break;
			case 6 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:74: SELECT_SHORT_AUTEUR
				{
				mSELECT_SHORT_AUTEUR(); 

				}
				break;
			case 7 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:94: SELECT_SHORT_DATE
				{
				mSELECT_SHORT_DATE(); 

				}
				break;
			case 8 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:112: CONJ_OR
				{
				mCONJ_OR(); 

				}
				break;
			case 9 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:120: CONJ_AND
				{
				mCONJ_AND(); 

				}
				break;
			case 10 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:129: MOT
				{
				mMOT(); 

				}
				break;
			case 11 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:133: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 12 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:140: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 13 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:149: DATE
				{
				mDATE(); 

				}
				break;
			case 14 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:154: VAR_JOUR
				{
				mVAR_JOUR(); 

				}
				break;
			case 15 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:163: VAR_ANNEE
				{
				mVAR_ANNEE(); 

				}
				break;
			case 16 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:173: VAR_DATE
				{
				mVAR_DATE(); 

				}
				break;
			case 17 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:182: VAR_MOIS_JANVIER
				{
				mVAR_MOIS_JANVIER(); 

				}
				break;
			case 18 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:199: VAR_MOIS_FEVRIER
				{
				mVAR_MOIS_FEVRIER(); 

				}
				break;
			case 19 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:216: VAR_MOIS_MARS
				{
				mVAR_MOIS_MARS(); 

				}
				break;
			case 20 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:230: VAR_MOIS_AVRIL
				{
				mVAR_MOIS_AVRIL(); 

				}
				break;
			case 21 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:245: VAR_MOIS_MAI
				{
				mVAR_MOIS_MAI(); 

				}
				break;
			case 22 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:258: VAR_MOIS_JUIN
				{
				mVAR_MOIS_JUIN(); 

				}
				break;
			case 23 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:272: VAR_MOIS_JUILLET
				{
				mVAR_MOIS_JUILLET(); 

				}
				break;
			case 24 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:289: VAR_MOIS_AOUT
				{
				mVAR_MOIS_AOUT(); 

				}
				break;
			case 25 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:303: VAR_MOIS_SEPTEMBRE
				{
				mVAR_MOIS_SEPTEMBRE(); 

				}
				break;
			case 26 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:322: VAR_MOIS_OCTOBRE
				{
				mVAR_MOIS_OCTOBRE(); 

				}
				break;
			case 27 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:339: VAR_MOIS_NOVEMBRE
				{
				mVAR_MOIS_NOVEMBRE(); 

				}
				break;
			case 28 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:357: VAR_MOIS_DECEMBRE
				{
				mVAR_MOIS_DECEMBRE(); 

				}
				break;
			case 29 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:375: VAR_MOT
				{
				mVAR_MOT(); 

				}
				break;
			case 30 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:383: WS
				{
				mWS(); 

				}
				break;
			case 31 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:386: POINT
				{
				mPOINT(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\25\uffff\10\22\1\uffff\1\22\1\71\1\22\1\10\5\22\1\102\2\22\2\uffff\4"+
		"\22\1\112\4\22\1\uffff\3\22\1\uffff\1\22\1\124\1\22\1\126\1\22\1\131\1"+
		"\22\3\uffff\5\22\1\142\1\uffff\5\22\1\150\1\22\1\uffff\1\22\1\uffff\1"+
		"\153\1\uffff\2\22\1\uffff\2\22\1\160\4\22\1\142\1\uffff\1\165\2\22\1\170"+
		"\1\22\1\uffff\2\22\1\uffff\4\22\1\uffff\4\22\1\uffff\1\22\1\u0085\1\uffff"+
		"\1\22\1\u0087\2\22\1\124\1\22\1\uffff\3\22\1\142\1\u008f\1\uffff\1\22"+
		"\1\uffff\1\u0091\2\22\1\u0094\2\22\1\u008f\1\uffff\1\u0097\1\uffff\1\124"+
		"\1\u0098\1\uffff\1\22\1\u009a\2\uffff\1\u009b\2\uffff";
	static final String DFA8_eofS =
		"\u009c\uffff";
	static final String DFA8_minS =
		"\1\11\7\141\1\uffff\4\141\1\60\4\141\3\uffff\1\165\1\141\2\164\1\162\1"+
		"\u00fb\1\154\1\164\1\uffff\1\156\1\141\1\164\1\141\1\164\1\151\1\156\1"+
		"\162\1\142\1\57\1\156\1\151\2\uffff\1\160\1\166\2\154\1\141\1\156\1\151"+
		"\1\145\1\151\1\uffff\1\154\1\141\1\164\1\uffff\1\157\1\141\1\163\1\141"+
		"\1\164\1\141\1\162\3\uffff\1\166\1\154\1\164\1\145\1\157\1\141\1\uffff"+
		"\1\144\1\143\1\165\1\154\1\145\1\141\1\156\1\uffff\1\142\1\uffff\1\141"+
		"\1\uffff\2\145\1\uffff\2\151\1\141\1\154\1\145\1\155\1\151\1\141\1\uffff"+
		"\1\141\1\154\1\162\1\141\1\164\1\uffff\1\164\1\162\1\uffff\1\156\1\162"+
		"\1\161\1\u00e9\1\uffff\1\145\1\155\1\142\1\162\1\uffff\1\145\1\141\1\uffff"+
		"\1\151\1\141\1\145\1\151\1\141\1\165\1\uffff\1\164\1\142\1\162\2\141\1"+
		"\uffff\1\156\1\uffff\1\141\1\162\1\145\1\141\1\162\1\145\1\141\1\uffff"+
		"\1\141\1\uffff\2\141\1\uffff\1\145\1\141\2\uffff\1\141\2\uffff";
	static final String DFA8_maxS =
		"\5\172\1\u00e9\2\172\1\uffff\4\172\1\71\1\172\1\u00e9\2\172\3\uffff\1"+
		"\165\1\151\2\164\1\162\1\u00fb\1\154\1\164\1\uffff\1\156\1\172\1\164\1"+
		"\172\1\164\1\162\1\156\1\162\1\142\1\71\1\156\1\151\2\uffff\1\160\1\166"+
		"\2\154\1\172\1\156\1\151\1\145\1\151\1\uffff\1\154\1\145\1\164\1\uffff"+
		"\1\157\1\172\1\163\1\172\1\164\1\172\1\162\3\uffff\1\166\1\156\1\164\1"+
		"\145\1\157\1\172\1\uffff\1\144\1\143\1\165\1\154\1\145\1\172\1\156\1\uffff"+
		"\1\142\1\uffff\1\172\1\uffff\2\145\1\uffff\2\151\1\172\1\154\1\145\1\155"+
		"\1\151\1\172\1\uffff\1\172\1\154\1\162\1\172\1\164\1\uffff\1\164\1\162"+
		"\1\uffff\1\156\1\162\1\161\1\u00e9\1\uffff\1\145\1\155\1\142\1\162\1\uffff"+
		"\1\145\1\172\1\uffff\1\151\1\172\1\145\1\151\1\172\1\165\1\uffff\1\164"+
		"\1\142\1\162\2\172\1\uffff\1\156\1\uffff\1\172\1\162\1\145\1\172\1\162"+
		"\1\145\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\145\1\172\2\uffff\1"+
		"\172\2\uffff";
	static final String DFA8_acceptS =
		"\10\uffff\1\11\11\uffff\1\35\1\36\1\37\10\uffff\1\34\14\uffff\1\35\1\22"+
		"\11\uffff\1\30\3\uffff\1\10\7\uffff\1\17\1\16\1\20\6\uffff\1\6\7\uffff"+
		"\1\35\1\uffff\1\12\1\uffff\1\25\2\uffff\1\13\10\uffff\1\1\5\uffff\1\5"+
		"\2\uffff\1\23\4\uffff\1\26\4\uffff\1\7\2\uffff\1\24\6\uffff\1\21\5\uffff"+
		"\1\4\1\uffff\1\15\7\uffff\1\2\1\uffff\1\32\2\uffff\1\27\2\uffff\1\3\1"+
		"\14\1\uffff\1\33\1\31";
	static final String DFA8_specialS =
		"\u009c\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\23\2\uffff\1\23\22\uffff\1\23\13\uffff\1\10\1\uffff\1\24\1\uffff\12"+
			"\15\7\uffff\32\22\6\uffff\1\3\1\4\1\12\1\5\1\7\1\17\3\22\1\16\2\22\1"+
			"\11\1\21\1\6\1\13\1\2\1\14\1\20\2\22\1\1\4\22",
			"\16\22\1\25\13\22",
			"\24\22\1\26\5\22",
			"\16\22\1\32\2\22\1\27\2\22\1\30\1\31\4\22",
			"\24\22\1\33\5\22",
			"\1\34\15\22\1\36\13\22\156\uffff\1\35",
			"\2\22\1\40\21\22\1\37\5\22",
			"\23\22\1\41\6\22",
			"",
			"\1\43\15\22\1\42\13\22",
			"\16\22\1\44\13\22",
			"\1\45\31\22",
			"\24\22\1\46\5\22",
			"\12\47",
			"\1\50\3\22\1\52\17\22\1\51\5\22",
			"\32\22\156\uffff\1\53",
			"\4\22\1\54\25\22",
			"\16\22\1\55\13\22",
			"",
			"",
			"",
			"\1\56",
			"\1\61\3\uffff\1\57\3\uffff\1\60",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"",
			"\1\70",
			"\32\22",
			"\1\72",
			"\32\22",
			"\1\73",
			"\1\75\10\uffff\1\74",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\103\12\101",
			"\1\104",
			"\1\105",
			"",
			"",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\32\22",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"",
			"\1\117",
			"\1\121\3\uffff\1\120",
			"\1\122",
			"",
			"\1\123",
			"\32\22",
			"\1\125",
			"\32\22",
			"\1\127",
			"\13\22\1\130\16\22",
			"\1\132",
			"",
			"",
			"",
			"\1\133",
			"\1\135\1\uffff\1\134",
			"\1\136",
			"\1\137",
			"\1\140",
			"\22\22\1\141\7\22",
			"",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\32\22",
			"\1\151",
			"",
			"\1\152",
			"",
			"\32\22",
			"",
			"\1\154",
			"\1\155",
			"",
			"\1\156",
			"\1\157",
			"\32\22",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\32\22",
			"",
			"\32\22",
			"\1\166",
			"\1\167",
			"\32\22",
			"\1\171",
			"",
			"\1\172",
			"\1\173",
			"",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"",
			"\1\u0084",
			"\32\22",
			"",
			"\1\u0086",
			"\32\22",
			"\1\u0088",
			"\1\u0089",
			"\32\22",
			"\1\u008a",
			"",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\32\22",
			"\22\22\1\u008e\7\22",
			"",
			"\1\u0090",
			"",
			"\32\22",
			"\1\u0092",
			"\1\u0093",
			"\32\22",
			"\1\u0095",
			"\1\u0096",
			"\32\22",
			"",
			"\32\22",
			"",
			"\32\22",
			"\32\22",
			"",
			"\1\u0099",
			"\32\22",
			"",
			"",
			"\32\22",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | SELECT_ARTICLE | SELECT_BULLETIN | SELECT_AUTEUR | SELECT_DATE | SELECT_SHORT_AUTEUR | SELECT_SHORT_DATE | CONJ_OR | CONJ_AND | MOT | AUTEUR | RUBRIQUE | DATE | VAR_JOUR | VAR_ANNEE | VAR_DATE | VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE | VAR_MOT | WS | POINT );";
		}
	}

}
