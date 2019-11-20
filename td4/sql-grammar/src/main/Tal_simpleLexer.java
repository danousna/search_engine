package main;

//$ANTLR 3.5.1 /Users/Natan/Developer/lo17/td4/Tal_simple.g 2019-11-20 11:03:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Tal_simpleLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ADJ=4;
	public static final int CONJ=5;
	public static final int DET=6;
	public static final int NOM=7;
	public static final int POINT=8;
	public static final int VERBE=9;
	public static final int WS=10;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Tal_simpleLexer() {} 
	public Tal_simpleLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Tal_simpleLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/Natan/Developer/lo17/td4/Tal_simple.g"; }

	// $ANTLR start "NOM"
	public final void mNOM() throws RecognitionException {
		try {
			int _type = NOM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:2:5: ( 'Pierre' | 'Marie' | 'bananes' | 'pommes' | 'fils' )
			int alt1=5;
			switch ( input.LA(1) ) {
			case 'P':
				{
				alt1=1;
				}
				break;
			case 'M':
				{
				alt1=2;
				}
				break;
			case 'b':
				{
				alt1=3;
				}
				break;
			case 'p':
				{
				alt1=4;
				}
				break;
			case 'f':
				{
				alt1=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:2:7: 'Pierre'
					{
					match("Pierre"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:2:18: 'Marie'
					{
					match("Marie"); 

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:2:28: 'bananes'
					{
					match("bananes"); 

					}
					break;
				case 4 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:2:40: 'pommes'
					{
					match("pommes"); 

					}
					break;
				case 5 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:2:51: 'fils'
					{
					match("fils"); 

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
	// $ANTLR end "NOM"

	// $ANTLR start "VERBE"
	public final void mVERBE() throws RecognitionException {
		try {
			int _type = VERBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:4:7: ( 'mange' | 'mangent' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='m') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='a') ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2=='n') ) {
						int LA2_3 = input.LA(4);
						if ( (LA2_3=='g') ) {
							int LA2_4 = input.LA(5);
							if ( (LA2_4=='e') ) {
								int LA2_5 = input.LA(6);
								if ( (LA2_5=='n') ) {
									alt2=2;
								}

								else {
									alt2=1;
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
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:4:9: 'mange'
					{
					match("mange"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:4:19: 'mangent'
					{
					match("mangent"); 

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
	// $ANTLR end "VERBE"

	// $ANTLR start "DET"
	public final void mDET() throws RecognitionException {
		try {
			int _type = DET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:6:5: ( 'des' | 'de' | 'le' )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='d') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='e') ) {
					int LA3_3 = input.LA(3);
					if ( (LA3_3=='s') ) {
						alt3=1;
					}

					else {
						alt3=2;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA3_0=='l') ) {
				alt3=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:6:7: 'des'
					{
					match("des"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:6:15: 'de'
					{
					match("de"); 

					}
					break;
				case 3 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:6:22: 'le'
					{
					match("le"); 

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
	// $ANTLR end "DET"

	// $ANTLR start "ADJ"
	public final void mADJ() throws RecognitionException {
		try {
			int _type = ADJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:8:5: ( 'vertes' | 'jaunes' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='v') ) {
				alt4=1;
			}
			else if ( (LA4_0=='j') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:8:7: 'vertes'
					{
					match("vertes"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:8:18: 'jaunes'
					{
					match("jaunes"); 

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
	// $ANTLR end "ADJ"

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:10:6: ( 'et' | 'ou' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='e') ) {
				alt5=1;
			}
			else if ( (LA5_0=='o') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:10:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:10:15: 'ou'
					{
					match("ou"); 

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
	// $ANTLR end "CONJ"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:12:7: ( '.' )
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:12:9: '.'
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:14:5: ( ( ' ' | '\\t' | '\\r' ) | '\\n' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='\t'||LA6_0=='\r'||LA6_0==' ') ) {
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
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:14:7: ( ' ' | '\\t' | '\\r' )
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					skip();
					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:14:38: '\\n'
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

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/Natan/Developer/lo17/td4/Tal_simple.g:1:8: ( NOM | VERBE | DET | ADJ | CONJ | POINT | WS )
		int alt7=7;
		switch ( input.LA(1) ) {
		case 'M':
		case 'P':
		case 'b':
		case 'f':
		case 'p':
			{
			alt7=1;
			}
			break;
		case 'm':
			{
			alt7=2;
			}
			break;
		case 'd':
		case 'l':
			{
			alt7=3;
			}
			break;
		case 'j':
		case 'v':
			{
			alt7=4;
			}
			break;
		case 'e':
		case 'o':
			{
			alt7=5;
			}
			break;
		case '.':
			{
			alt7=6;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt7=7;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 7, 0, input);
			throw nvae;
		}
		switch (alt7) {
			case 1 :
				// /Users/Natan/Developer/lo17/td4/Tal_simple.g:1:10: NOM
				{
				mNOM(); 

				}
				break;
			case 2 :
				// /Users/Natan/Developer/lo17/td4/Tal_simple.g:1:14: VERBE
				{
				mVERBE(); 

				}
				break;
			case 3 :
				// /Users/Natan/Developer/lo17/td4/Tal_simple.g:1:20: DET
				{
				mDET(); 

				}
				break;
			case 4 :
				// /Users/Natan/Developer/lo17/td4/Tal_simple.g:1:24: ADJ
				{
				mADJ(); 

				}
				break;
			case 5 :
				// /Users/Natan/Developer/lo17/td4/Tal_simple.g:1:28: CONJ
				{
				mCONJ(); 

				}
				break;
			case 6 :
				// /Users/Natan/Developer/lo17/td4/Tal_simple.g:1:33: POINT
				{
				mPOINT(); 

				}
				break;
			case 7 :
				// /Users/Natan/Developer/lo17/td4/Tal_simple.g:1:39: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
