package main;
// $ANTLR 3.5.1 /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g 2019-12-12 19:30:02

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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:5:16: ( 'article' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:5:18: 'article'
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

	// $ANTLR start "SELECT_DATE"
	public final void mSELECT_DATE() throws RecognitionException {
		try {
			int _type = SELECT_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:9:13: ( 'date' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:9:15: 'date'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:11:19: ( 'quand' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:11:21: 'quand'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:13:9: ( 'ou' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:13:11: 'ou'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:15:10: ( 'et' | ',' )
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:15:12: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:15:19: ','
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:17:5: ( 'mot' | 'contenir' | 'parler' )
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
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:17:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:17:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:17:28: 'parler'
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

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:19:9: ( 'rubrique' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:19:11: 'rubrique'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:21:6: ( 'datant' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:21:8: 'datant'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:23:10: ( ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:23:12: ( '0' .. '9' ) ( '0' .. '9' )
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:24:11: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:24:13: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' )
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:25:10: ( VAR_JOUR '/' VAR_JOUR '/' VAR_ANNEE )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:25:12: VAR_JOUR '/' VAR_JOUR '/' VAR_ANNEE
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:26:17: ( 'janvier' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:26:19: 'janvier'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:27:18: ( 'février' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:27:20: 'février'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:28:15: ( 'mars' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:28:17: 'mars'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:29:16: ( 'avril' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:29:18: 'avril'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:30:14: ( 'mai' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:30:16: 'mai'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:31:15: ( 'juin' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:31:17: 'juin'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:32:18: ( 'juillet' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:32:20: 'juillet'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:33:15: ( 'août' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:33:17: 'août'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:34:20: ( 'septembre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:34:22: 'septembre'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:35:18: ( 'octobre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:35:20: 'octobre'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:36:19: ( 'novembre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:36:21: 'novembre'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:37:19: ( 'décembre' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:37:21: 'décembre'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:39:10: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:39:12: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:39:34: ( 'a' .. 'z' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' ) | '\\n' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='\t'||LA6_0=='\r'||LA6_0==' '||LA6_0=='d'||LA6_0=='j'||LA6_0=='q') ) {
				alt6=1;
			}
			else if ( (LA6_0=='\n') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					{
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:7: ( ' ' | '\\t' | '\\r' | 'je' | 'qui' | 'dont' )
					int alt5=6;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt5=1;
						}
						break;
					case '\t':
						{
						alt5=2;
						}
						break;
					case '\r':
						{
						alt5=3;
						}
						break;
					case 'j':
						{
						alt5=4;
						}
						break;
					case 'q':
						{
						alt5=5;
						}
						break;
					case 'd':
						{
						alt5=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}
					switch (alt5) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:34: 'qui'
							{
							match("qui"); 

							}
							break;
						case 6 :
							// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:42: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:41:62: '\\n'
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
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:43:7: ( '.' )
			// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:43:9: '.'
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
		// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:8: ( SELECT | SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | SELECT_SHORT_DATE | CONJ_OR | CONJ_AND | MOT | RUBRIQUE | DATE | VAR_JOUR | VAR_ANNEE | VAR_DATE | VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE | VAR_MOT | WS | POINT )
		int alt7=28;
		alt7 = dfa7.predict(input);
		switch (alt7) {
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
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:78: CONJ_OR
				{
				mCONJ_OR(); 

				}
				break;
			case 7 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:86: CONJ_AND
				{
				mCONJ_AND(); 

				}
				break;
			case 8 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:95: MOT
				{
				mMOT(); 

				}
				break;
			case 9 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:99: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 10 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:108: DATE
				{
				mDATE(); 

				}
				break;
			case 11 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:113: VAR_JOUR
				{
				mVAR_JOUR(); 

				}
				break;
			case 12 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:122: VAR_ANNEE
				{
				mVAR_ANNEE(); 

				}
				break;
			case 13 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:132: VAR_DATE
				{
				mVAR_DATE(); 

				}
				break;
			case 14 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:141: VAR_MOIS_JANVIER
				{
				mVAR_MOIS_JANVIER(); 

				}
				break;
			case 15 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:158: VAR_MOIS_FEVRIER
				{
				mVAR_MOIS_FEVRIER(); 

				}
				break;
			case 16 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:175: VAR_MOIS_MARS
				{
				mVAR_MOIS_MARS(); 

				}
				break;
			case 17 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:189: VAR_MOIS_AVRIL
				{
				mVAR_MOIS_AVRIL(); 

				}
				break;
			case 18 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:204: VAR_MOIS_MAI
				{
				mVAR_MOIS_MAI(); 

				}
				break;
			case 19 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:217: VAR_MOIS_JUIN
				{
				mVAR_MOIS_JUIN(); 

				}
				break;
			case 20 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:231: VAR_MOIS_JUILLET
				{
				mVAR_MOIS_JUILLET(); 

				}
				break;
			case 21 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:248: VAR_MOIS_AOUT
				{
				mVAR_MOIS_AOUT(); 

				}
				break;
			case 22 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:262: VAR_MOIS_SEPTEMBRE
				{
				mVAR_MOIS_SEPTEMBRE(); 

				}
				break;
			case 23 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:281: VAR_MOIS_OCTOBRE
				{
				mVAR_MOIS_OCTOBRE(); 

				}
				break;
			case 24 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:298: VAR_MOIS_NOVEMBRE
				{
				mVAR_MOIS_NOVEMBRE(); 

				}
				break;
			case 25 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:316: VAR_MOIS_DECEMBRE
				{
				mVAR_MOIS_DECEMBRE(); 

				}
				break;
			case 26 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:334: VAR_MOT
				{
				mVAR_MOT(); 

				}
				break;
			case 27 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:342: WS
				{
				mWS(); 

				}
				break;
			case 28 :
				// /Users/Natan/Developer/lo17/td4/sql-grammar/src/main/sql.g:1:345: POINT
				{
				mPOINT(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\25\uffff\7\22\1\uffff\1\22\1\67\1\22\1\10\5\22\1\100\2\22\2\uffff\5\22"+
		"\1\uffff\2\22\1\uffff\3\22\1\uffff\1\22\1\120\1\22\1\122\3\22\3\uffff"+
		"\5\22\1\135\4\22\1\142\1\22\1\uffff\1\22\1\uffff\1\145\1\uffff\4\22\1"+
		"\152\4\22\1\135\1\uffff\1\157\1\22\1\161\1\22\1\uffff\2\22\1\uffff\4\22"+
		"\1\uffff\4\22\1\uffff\1\22\1\uffff\1\22\1\177\2\22\1\120\5\22\1\135\1"+
		"\u0087\1\22\1\uffff\1\u0089\2\22\1\u008c\1\u008d\2\22\1\uffff\1\u0090"+
		"\1\uffff\1\120\1\u0091\2\uffff\1\22\1\u0093\2\uffff\1\u0094\2\uffff";
	static final String DFA7_eofS =
		"\u0095\uffff";
	static final String DFA7_minS =
		"\1\11\7\141\1\uffff\4\141\1\60\4\141\3\uffff\1\165\1\141\1\164\1\162\1"+
		"\u00fb\1\154\1\164\1\uffff\1\156\1\141\1\164\1\141\1\164\1\151\1\156\1"+
		"\162\1\142\1\57\1\156\1\151\2\uffff\1\160\1\166\2\154\1\156\1\uffff\2"+
		"\151\1\uffff\1\154\1\141\1\164\1\uffff\1\157\1\141\1\163\1\141\1\164\1"+
		"\154\1\162\3\uffff\1\166\1\154\1\164\1\145\1\157\1\141\1\144\1\143\1\154"+
		"\1\145\1\141\1\156\1\uffff\1\142\1\uffff\1\141\1\uffff\2\145\2\151\1\141"+
		"\1\154\1\145\1\155\1\151\1\141\1\uffff\1\141\1\154\1\141\1\164\1\uffff"+
		"\1\164\1\162\1\uffff\1\156\1\162\1\161\1\145\1\uffff\1\145\1\155\1\142"+
		"\1\162\1\uffff\1\145\1\uffff\1\151\1\141\1\145\1\151\1\141\1\165\1\162"+
		"\1\164\1\142\1\162\2\141\1\156\1\uffff\1\141\1\162\1\145\2\141\1\162\1"+
		"\145\1\uffff\1\141\1\uffff\2\141\2\uffff\1\145\1\141\2\uffff\1\141\2\uffff";
	static final String DFA7_maxS =
		"\5\172\1\u00e9\2\172\1\uffff\4\172\1\71\1\172\1\u00e9\2\172\3\uffff\1"+
		"\165\1\151\1\164\1\162\1\u00fb\1\154\1\164\1\uffff\1\156\1\172\1\164\1"+
		"\172\1\164\1\162\1\156\1\162\1\142\1\71\1\156\1\151\2\uffff\1\160\1\166"+
		"\2\154\1\156\1\uffff\2\151\1\uffff\1\154\1\145\1\164\1\uffff\1\157\1\172"+
		"\1\163\1\172\1\164\1\154\1\162\3\uffff\1\166\1\156\1\164\1\145\1\157\1"+
		"\172\1\144\1\143\1\154\1\145\1\172\1\156\1\uffff\1\142\1\uffff\1\172\1"+
		"\uffff\2\145\2\151\1\172\1\154\1\145\1\155\1\151\1\172\1\uffff\1\172\1"+
		"\154\1\172\1\164\1\uffff\1\164\1\162\1\uffff\1\156\1\162\1\161\1\145\1"+
		"\uffff\1\145\1\155\1\142\1\162\1\uffff\1\145\1\uffff\1\151\1\172\1\145"+
		"\1\151\1\172\1\165\1\162\1\164\1\142\1\162\2\172\1\156\1\uffff\1\172\1"+
		"\162\1\145\2\172\1\162\1\145\1\uffff\1\172\1\uffff\2\172\2\uffff\1\145"+
		"\1\172\2\uffff\1\172\2\uffff";
	static final String DFA7_acceptS =
		"\10\uffff\1\7\11\uffff\1\32\1\33\1\34\7\uffff\1\31\14\uffff\1\32\1\17"+
		"\5\uffff\1\32\2\uffff\1\25\3\uffff\1\6\7\uffff\1\14\1\13\1\15\14\uffff"+
		"\1\32\1\uffff\1\10\1\uffff\1\22\12\uffff\1\1\4\uffff\1\4\2\uffff\1\20"+
		"\4\uffff\1\23\4\uffff\1\5\1\uffff\1\21\15\uffff\1\12\7\uffff\1\2\1\uffff"+
		"\1\27\2\uffff\1\16\1\24\2\uffff\1\3\1\11\1\uffff\1\30\1\26";
	static final String DFA7_specialS =
		"\u0095\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\23\2\uffff\1\23\22\uffff\1\23\13\uffff\1\10\1\uffff\1\24\1\uffff\12"+
			"\15\7\uffff\32\22\6\uffff\1\3\1\4\1\12\1\5\1\7\1\17\3\22\1\16\2\22\1"+
			"\11\1\21\1\6\1\13\1\2\1\14\1\20\2\22\1\1\4\22",
			"\16\22\1\25\13\22",
			"\24\22\1\26\5\22",
			"\16\22\1\31\2\22\1\27\3\22\1\30\4\22",
			"\24\22\1\32\5\22",
			"\1\33\15\22\1\35\13\22\156\uffff\1\34",
			"\2\22\1\37\21\22\1\36\5\22",
			"\23\22\1\40\6\22",
			"",
			"\1\42\15\22\1\41\13\22",
			"\16\22\1\43\13\22",
			"\1\44\31\22",
			"\24\22\1\45\5\22",
			"\12\46",
			"\1\47\3\22\1\51\17\22\1\50\5\22",
			"\32\22\156\uffff\1\52",
			"\4\22\1\53\25\22",
			"\16\22\1\54\13\22",
			"",
			"",
			"",
			"\1\55",
			"\1\57\3\uffff\1\56\3\uffff\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"\1\66",
			"\32\22",
			"\1\70",
			"\32\22",
			"\1\71",
			"\1\73\10\uffff\1\72",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\101\12\77",
			"\1\102",
			"\1\103",
			"",
			"",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"\1\111",
			"\1\112",
			"",
			"\1\113",
			"\1\115\3\uffff\1\114",
			"\1\116",
			"",
			"\1\117",
			"\32\22",
			"\1\121",
			"\32\22",
			"\1\123",
			"\1\124",
			"\1\125",
			"",
			"",
			"",
			"\1\126",
			"\1\130\1\uffff\1\127",
			"\1\131",
			"\1\132",
			"\1\133",
			"\22\22\1\134\7\22",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\32\22",
			"\1\143",
			"",
			"\1\144",
			"",
			"\32\22",
			"",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\32\22",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\32\22",
			"",
			"\32\22",
			"\1\160",
			"\32\22",
			"\1\162",
			"",
			"\1\163",
			"\1\164",
			"",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"",
			"\1\175",
			"",
			"\1\176",
			"\32\22",
			"\1\u0080",
			"\1\u0081",
			"\32\22",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\32\22",
			"\32\22",
			"\1\u0088",
			"",
			"\32\22",
			"\1\u008a",
			"\1\u008b",
			"\32\22",
			"\32\22",
			"\1\u008e",
			"\1\u008f",
			"",
			"\32\22",
			"",
			"\32\22",
			"\32\22",
			"",
			"",
			"\1\u0092",
			"\32\22",
			"",
			"",
			"\32\22",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | SELECT_ARTICLE | SELECT_BULLETIN | SELECT_DATE | SELECT_SHORT_DATE | CONJ_OR | CONJ_AND | MOT | RUBRIQUE | DATE | VAR_JOUR | VAR_ANNEE | VAR_DATE | VAR_MOIS_JANVIER | VAR_MOIS_FEVRIER | VAR_MOIS_MARS | VAR_MOIS_AVRIL | VAR_MOIS_MAI | VAR_MOIS_JUIN | VAR_MOIS_JUILLET | VAR_MOIS_AOUT | VAR_MOIS_SEPTEMBRE | VAR_MOIS_OCTOBRE | VAR_MOIS_NOVEMBRE | VAR_MOIS_DECEMBRE | VAR_MOT | WS | POINT );";
		}
	}

}
