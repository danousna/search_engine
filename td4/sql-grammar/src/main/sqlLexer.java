// $ANTLR 3.5.1 /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g 2019-12-14 17:27:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class sqlLexer extends Lexer {
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:8:8: ( 'vouloir' | 'quels' | 'quel' )
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:8:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:8:22: 'quels'
					{
					match("quels"); 

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:8:32: 'quel'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:10:16: ( 'article' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:10:18: 'article'
			{
			match("article"); 

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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:12:17: ( 'bulletin' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:12:19: 'bulletin'
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

	// $ANTLR start "SELECT_DATE"
	public final void mSELECT_DATE() throws RecognitionException {
		try {
			int _type = SELECT_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:14:13: ( 'date' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:14:15: 'date'
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

	// $ANTLR start "SELECT_SHORT_DATE"
	public final void mSELECT_SHORT_DATE() throws RecognitionException {
		try {
			int _type = SELECT_SHORT_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:16:19: ( 'quand' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:16:21: 'quand'
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

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:18:6: ( 'combien' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:18:8: 'combien'
			{
			match("combien"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "CONJ_OR"
	public final void mCONJ_OR() throws RecognitionException {
		try {
			int _type = CONJ_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:20:9: ( 'ou' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:20:11: 'ou'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:22:10: ( 'et' | ',' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='e') ) {
				alt2=1;
			}
			else if ( (LA2_0==',') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:22:12: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:22:19: ','
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:25:5: ( 'mot' | 'contenir' | 'parler' )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt3=1;
				}
				break;
			case 'c':
				{
				alt3=2;
				}
				break;
			case 'p':
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:25:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:25:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:25:28: 'parler'
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

	// $ANTLR start "MOT_TITRE"
	public final void mMOT_TITRE() throws RecognitionException {
		try {
			int _type = MOT_TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:26:11: ( 'titre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:26:13: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT_TITRE"

	// $ANTLR start "MOT_TEXTE"
	public final void mMOT_TEXTE() throws RecognitionException {
		try {
			int _type = MOT_TEXTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:27:11: ( 'texte' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:27:13: 'texte'
			{
			match("texte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT_TEXTE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:29:9: ( 'rubrique' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:29:11: 'rubrique'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:31:6: ( 'datant' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:31:8: 'datant'
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

	// $ANTLR start "DATE_TO"
	public final void mDATE_TO() throws RecognitionException {
		try {
			int _type = DATE_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:32:9: ( 'jusque' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:32:11: 'jusque'
			{
			match("jusque"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_TO"

	// $ANTLR start "DATE_BEFORE"
	public final void mDATE_BEFORE() throws RecognitionException {
		try {
			int _type = DATE_BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:33:13: ( 'avant' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:33:15: 'avant'
			{
			match("avant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_BEFORE"

	// $ANTLR start "DATE_FROM"
	public final void mDATE_FROM() throws RecognitionException {
		try {
			int _type = DATE_FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:34:11: ( 'depuis' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:34:13: 'depuis'
			{
			match("depuis"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_FROM"

	// $ANTLR start "DATE_AFTER"
	public final void mDATE_AFTER() throws RecognitionException {
		try {
			int _type = DATE_AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:35:12: ( 'apres' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:35:14: 'apres'
			{
			match("apres"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_AFTER"

	// $ANTLR start "DATE_BETWEEN"
	public final void mDATE_BETWEEN() throws RecognitionException {
		try {
			int _type = DATE_BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:36:14: ( 'entre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:36:16: 'entre'
			{
			match("entre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_BETWEEN"

	// $ANTLR start "VAR_JOUR"
	public final void mVAR_JOUR() throws RecognitionException {
		try {
			int _type = VAR_JOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:38:10: ( ( '0' .. '9' ) ( '0' .. '9' )? )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:38:12: ( '0' .. '9' ) ( '0' .. '9' )?
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:38:23: ( '0' .. '9' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:39:11: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:39:13: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:40:10: ( VAR_JOUR '/' VAR_JOUR '/' VAR_ANNEE )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:40:12: VAR_JOUR '/' VAR_JOUR '/' VAR_ANNEE
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:17: ( 'janvier' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:19: 'janvier'
			{
			match("janvier"); 

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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:42:18: ( 'février' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:42:20: 'février'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:43:15: ( 'mars' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:43:17: 'mars'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:44:16: ( 'avril' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:44:18: 'avril'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:45:14: ( 'mai' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:45:16: 'mai'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:46:15: ( 'juin' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:46:17: 'juin'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:18: ( 'juillet' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:47:20: 'juillet'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:48:15: ( 'août' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:48:17: 'août'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:49:20: ( 'septembre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:49:22: 'septembre'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:50:18: ( 'octobre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:50:20: 'octobre'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:51:19: ( 'novembre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:51:21: 'novembre'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:52:19: ( 'décembre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:52:21: 'décembre'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:54:10: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:54:12: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:54:34: ( 'a' .. 'z' )+
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
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
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:56:62: '\\n'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:58:7: ( '.' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:58:9: '.'
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
		// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:8: ( SELECT | SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | SELECT_SHORT_DATE | COUNT | CONJ_OR | CONJ_AND | MOT | MOT_TITRE | MOT_TEXTE | RUBRIQUE | DATE | DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER | DATE_BETWEEN | VAR_JOUR | VAR_ANNEE | VAR_DATE | VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE | VAR_MOT | WS | POINT )
		int alt8=36;
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
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:48: SELECT_DATE
				{
				mSELECT_DATE(); 

				}
				break;
			case 5 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:60: SELECT_SHORT_DATE
				{
				mSELECT_SHORT_DATE(); 

				}
				break;
			case 6 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:78: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 7 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:84: CONJ_OR
				{
				mCONJ_OR(); 

				}
				break;
			case 8 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:92: CONJ_AND
				{
				mCONJ_AND(); 

				}
				break;
			case 9 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:101: MOT
				{
				mMOT(); 

				}
				break;
			case 10 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:105: MOT_TITRE
				{
				mMOT_TITRE(); 

				}
				break;
			case 11 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:115: MOT_TEXTE
				{
				mMOT_TEXTE(); 

				}
				break;
			case 12 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:125: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 13 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:134: DATE
				{
				mDATE(); 

				}
				break;
			case 14 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:139: DATE_TO
				{
				mDATE_TO(); 

				}
				break;
			case 15 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:147: DATE_BEFORE
				{
				mDATE_BEFORE(); 

				}
				break;
			case 16 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:159: DATE_FROM
				{
				mDATE_FROM(); 

				}
				break;
			case 17 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:169: DATE_AFTER
				{
				mDATE_AFTER(); 

				}
				break;
			case 18 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:180: DATE_BETWEEN
				{
				mDATE_BETWEEN(); 

				}
				break;
			case 19 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:193: VAR_JOUR
				{
				mVAR_JOUR(); 

				}
				break;
			case 20 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:202: VAR_ANNEE
				{
				mVAR_ANNEE(); 

				}
				break;
			case 21 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:212: VAR_DATE
				{
				mVAR_DATE(); 

				}
				break;
			case 22 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:221: VAR_MOIS_JANVIER
				{
				mVAR_MOIS_JANVIER(); 

				}
				break;
			case 23 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:238: VAR_MOIS_FEVRIER
				{
				mVAR_MOIS_FEVRIER(); 

				}
				break;
			case 24 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:255: VAR_MOIS_MARS
				{
				mVAR_MOIS_MARS(); 

				}
				break;
			case 25 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:269: VAR_MOIS_AVRIL
				{
				mVAR_MOIS_AVRIL(); 

				}
				break;
			case 26 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:284: VAR_MOIS_MAI
				{
				mVAR_MOIS_MAI(); 

				}
				break;
			case 27 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:297: VAR_MOIS_JUIN
				{
				mVAR_MOIS_JUIN(); 

				}
				break;
			case 28 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:311: VAR_MOIS_JUILLET
				{
				mVAR_MOIS_JUILLET(); 

				}
				break;
			case 29 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:328: VAR_MOIS_AOUT
				{
				mVAR_MOIS_AOUT(); 

				}
				break;
			case 30 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:342: VAR_MOIS_SEPTEMBRE
				{
				mVAR_MOIS_SEPTEMBRE(); 

				}
				break;
			case 31 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:361: VAR_MOIS_OCTOBRE
				{
				mVAR_MOIS_OCTOBRE(); 

				}
				break;
			case 32 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:378: VAR_MOIS_NOVEMBRE
				{
				mVAR_MOIS_NOVEMBRE(); 

				}
				break;
			case 33 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:396: VAR_MOIS_DECEMBRE
				{
				mVAR_MOIS_DECEMBRE(); 

				}
				break;
			case 34 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:414: VAR_MOT
				{
				mVAR_MOT(); 

				}
				break;
			case 35 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:422: WS
				{
				mWS(); 

				}
				break;
			case 36 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:425: POINT
				{
				mPOINT(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\17\uffff\1\60\6\uffff\11\23\1\uffff\2\23\1\104\1\23\1\11\11\23\1\uffff"+
		"\1\60\3\uffff\5\23\1\uffff\4\23\1\uffff\6\23\1\uffff\2\23\1\144\1\23\1"+
		"\146\7\23\1\uffff\3\23\1\163\6\23\1\172\2\23\1\uffff\4\23\1\uffff\1\u0081"+
		"\1\uffff\5\23\1\u0087\5\23\1\163\1\uffff\1\u008d\1\23\1\u008f\1\u0090"+
		"\1\u0091\1\23\1\uffff\5\23\1\u0098\1\uffff\1\23\1\u009a\1\u009b\2\23\1"+
		"\uffff\5\23\1\uffff\1\23\3\uffff\1\23\1\u00a5\1\u00a6\3\23\1\uffff\1\144"+
		"\2\uffff\1\23\1\u00ab\4\23\1\163\1\u00b0\1\23\2\uffff\1\u00b2\1\23\1\u00b4"+
		"\1\23\1\uffff\1\u00b6\1\u00b7\2\23\1\uffff\1\u00ba\1\uffff\1\144\1\uffff"+
		"\1\u00bb\2\uffff\1\23\1\u00bd\2\uffff\1\u00be\2\uffff";
	static final String DFA8_eofS =
		"\u00bf\uffff";
	static final String DFA8_minS =
		"\1\11\10\141\1\uffff\5\141\1\57\3\141\3\uffff\1\165\1\141\1\164\1\141"+
		"\1\162\1\u00fb\1\154\1\164\1\160\1\uffff\1\156\1\155\1\141\1\164\1\141"+
		"\2\164\1\151\1\162\1\164\1\170\1\142\1\151\1\156\1\uffff\1\57\3\uffff"+
		"\1\160\1\166\2\154\1\156\1\uffff\1\151\1\156\1\151\1\145\1\uffff\1\154"+
		"\1\141\1\165\1\164\1\142\1\164\1\uffff\1\157\1\162\1\141\1\163\1\141\1"+
		"\154\1\162\1\164\1\162\1\161\1\154\1\166\1\uffff\1\164\1\145\1\157\1\141"+
		"\1\144\1\143\1\164\1\154\1\163\1\145\1\141\1\156\1\151\1\uffff\1\151\1"+
		"\145\1\142\1\145\1\uffff\1\141\1\uffff\3\145\1\151\1\165\1\141\1\154\1"+
		"\151\1\145\1\155\1\151\1\141\1\uffff\1\141\1\154\3\141\1\164\1\uffff\1"+
		"\164\1\163\1\145\1\156\1\162\1\141\1\uffff\1\162\2\141\1\161\1\145\1\uffff"+
		"\2\145\1\155\1\142\1\162\1\uffff\1\145\3\uffff\1\151\2\141\1\156\1\151"+
		"\1\145\1\uffff\1\141\2\uffff\1\165\1\141\1\164\1\162\1\142\1\162\2\141"+
		"\1\156\2\uffff\1\141\1\162\1\141\1\145\1\uffff\2\141\1\162\1\145\1\uffff"+
		"\1\141\1\uffff\1\141\1\uffff\1\141\2\uffff\1\145\1\141\2\uffff\1\141\2"+
		"\uffff";
	static final String DFA8_maxS =
		"\5\172\1\u00e9\3\172\1\uffff\5\172\1\71\1\u00e9\2\172\3\uffff\1\165\1"+
		"\151\1\164\2\162\1\u00fb\1\154\1\164\1\160\1\uffff\2\156\1\172\1\164\1"+
		"\172\2\164\2\162\1\164\1\170\1\142\1\163\1\156\1\uffff\1\71\3\uffff\1"+
		"\160\1\166\2\154\1\156\1\uffff\1\151\1\156\1\151\1\145\1\uffff\1\154\1"+
		"\145\1\165\1\164\1\142\1\164\1\uffff\1\157\1\162\1\172\1\163\1\172\1\154"+
		"\1\162\1\164\1\162\1\161\1\156\1\166\1\uffff\1\164\1\145\1\157\1\172\1"+
		"\144\1\143\1\164\1\154\1\163\1\145\1\172\1\156\1\151\1\uffff\1\151\1\145"+
		"\1\142\1\145\1\uffff\1\172\1\uffff\3\145\1\151\1\165\1\172\1\154\1\151"+
		"\1\145\1\155\1\151\1\172\1\uffff\1\172\1\154\3\172\1\164\1\uffff\1\164"+
		"\1\163\1\145\1\156\1\162\1\172\1\uffff\1\162\2\172\1\161\1\145\1\uffff"+
		"\2\145\1\155\1\142\1\162\1\uffff\1\145\3\uffff\1\151\2\172\1\156\1\151"+
		"\1\145\1\uffff\1\172\2\uffff\1\165\1\172\1\164\1\162\1\142\1\162\2\172"+
		"\1\156\2\uffff\1\172\1\162\1\172\1\145\1\uffff\2\172\1\162\1\145\1\uffff"+
		"\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff\1\145\1\172\2\uffff\1\172\2"+
		"\uffff";
	static final String DFA8_acceptS =
		"\11\uffff\1\10\11\uffff\1\42\1\43\1\44\11\uffff\1\41\16\uffff\1\42\1\uffff"+
		"\1\23\1\25\1\27\5\uffff\1\42\4\uffff\1\35\6\uffff\1\7\14\uffff\1\24\15"+
		"\uffff\1\42\4\uffff\1\11\1\uffff\1\32\14\uffff\1\1\6\uffff\1\4\6\uffff"+
		"\1\30\5\uffff\1\33\5\uffff\1\5\1\uffff\1\17\1\31\1\21\6\uffff\1\22\1\uffff"+
		"\1\12\1\13\11\uffff\1\15\1\20\4\uffff\1\16\4\uffff\1\2\1\uffff\1\6\1\uffff"+
		"\1\37\1\uffff\1\34\1\26\2\uffff\1\3\1\14\1\uffff\1\40\1\36";
	static final String DFA8_specialS =
		"\u00bf\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\24\2\uffff\1\24\22\uffff\1\24\13\uffff\1\11\1\uffff\1\25\1\uffff\12"+
			"\17\7\uffff\32\23\6\uffff\1\3\1\4\1\6\1\5\1\10\1\20\3\23\1\16\2\23\1"+
			"\12\1\22\1\7\1\13\1\2\1\15\1\21\1\14\1\23\1\1\4\23",
			"\16\23\1\26\13\23",
			"\24\23\1\27\5\23",
			"\16\23\1\33\1\32\1\23\1\30\3\23\1\31\4\23",
			"\24\23\1\34\5\23",
			"\1\35\3\23\1\36\11\23\1\40\13\23\156\uffff\1\37",
			"\16\23\1\41\13\23",
			"\2\23\1\43\21\23\1\42\5\23",
			"\15\23\1\45\5\23\1\44\6\23",
			"",
			"\1\47\15\23\1\46\13\23",
			"\1\50\31\23",
			"\4\23\1\52\3\23\1\51\21\23",
			"\24\23\1\53\5\23",
			"\1\55\3\23\1\56\17\23\1\54\5\23",
			"\1\61\12\57",
			"\32\23\156\uffff\1\62",
			"\4\23\1\63\25\23",
			"\16\23\1\64\13\23",
			"",
			"",
			"",
			"\1\65",
			"\1\67\3\uffff\1\66\3\uffff\1\70",
			"\1\71",
			"\1\72\20\uffff\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"",
			"\1\101",
			"\1\102\1\103",
			"\32\23",
			"\1\105",
			"\32\23",
			"\1\106",
			"\1\107",
			"\1\111\10\uffff\1\110",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\117\11\uffff\1\116",
			"\1\120",
			"",
			"\1\61\12\121",
			"",
			"",
			"",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"",
			"\1\133",
			"\1\135\3\uffff\1\134",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"",
			"\1\142",
			"\1\143",
			"\32\23",
			"\1\145",
			"\32\23",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\155\1\uffff\1\154",
			"\1\156",
			"",
			"\1\157",
			"\1\160",
			"\1\161",
			"\22\23\1\162\7\23",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\32\23",
			"\1\173",
			"\1\174",
			"",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"",
			"\32\23",
			"",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\32\23",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\32\23",
			"",
			"\32\23",
			"\1\u008e",
			"\32\23",
			"\32\23",
			"\32\23",
			"\1\u0092",
			"",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\32\23",
			"",
			"\1\u0099",
			"\32\23",
			"\32\23",
			"\1\u009c",
			"\1\u009d",
			"",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"",
			"\1\u00a3",
			"",
			"",
			"",
			"\1\u00a4",
			"\32\23",
			"\32\23",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"",
			"\32\23",
			"",
			"",
			"\1\u00aa",
			"\32\23",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\32\23",
			"\32\23",
			"\1\u00b1",
			"",
			"",
			"\32\23",
			"\1\u00b3",
			"\32\23",
			"\1\u00b5",
			"",
			"\32\23",
			"\32\23",
			"\1\u00b8",
			"\1\u00b9",
			"",
			"\32\23",
			"",
			"\32\23",
			"",
			"\32\23",
			"",
			"",
			"\1\u00bc",
			"\32\23",
			"",
			"",
			"\32\23",
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
			return "1:1: Tokens : ( SELECT | SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | SELECT_SHORT_DATE | COUNT | CONJ_OR | CONJ_AND | MOT | MOT_TITRE | MOT_TEXTE | RUBRIQUE | DATE | DATE_TO | DATE_BEFORE | DATE_FROM | DATE_AFTER | DATE_BETWEEN | VAR_JOUR | VAR_ANNEE | VAR_DATE | VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE | VAR_MOT | WS | POINT );";
		}
	}

}
