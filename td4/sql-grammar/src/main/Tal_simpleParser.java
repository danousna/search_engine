//$ANTLR 3.5.1 /Users/Natan/Developer/lo17/td4/Tal_simple.g 2019-11-20 11:03:34

package main;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Tal_simpleParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADJ", "CONJ", "DET", "NOM", "POINT", 
		"VERBE", "WS"
	};
	public static final int EOF=-1;
	public static final int ADJ=4;
	public static final int CONJ=5;
	public static final int DET=6;
	public static final int NOM=7;
	public static final int POINT=8;
	public static final int VERBE=9;
	public static final int WS=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Tal_simpleParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Tal_simpleParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Tal_simpleParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/Natan/Developer/lo17/td4/Tal_simple.g"; }



	// $ANTLR start "listephrases"
	// /Users/Natan/Developer/lo17/td4/Tal_simple.g:16:1: listephrases returns [String arbresort = \"\"] : t= phrase POINT ;
	public final String listephrases() throws RecognitionException {
		String arbresort =  "";


		Arbre t =null;

		Arbre p;
		try {
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:17:24: (t= phrase POINT )
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:18:17: t= phrase POINT
			{
			pushFollow(FOLLOW_phrase_in_listephrases154);
			t=phrase();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listephrases156); 
			p = t;
			                arbresort = p.sortArbre();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return arbresort;
	}
	// $ANTLR end "listephrases"



	// $ANTLR start "phrase"
	// /Users/Natan/Developer/lo17/td4/Tal_simple.g:23:1: phrase returns [Arbre phrase = new Arbre(\"PHRASE\")] : agnc= gn_c agva= gv ;
	public final Arbre phrase() throws RecognitionException {
		Arbre phrase =  new Arbre("PHRASE");


		Arbre agnc =null;
		Arbre agva =null;


		// on declare les variables de type arbre
		// qui sont utilises dans cette regle
		        Arbre gnc, gva;
		        
		try {
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:28:10: (agnc= gn_c agva= gv )
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:29:9: agnc= gn_c agva= gv
			{
			pushFollow(FOLLOW_gn_c_in_phrase210);
			agnc=gn_c();
			state._fsp--;

			pushFollow(FOLLOW_gv_in_phrase216);
			agva=gv();
			state._fsp--;


			                gnc = agnc;
			                gva = agva;
			                phrase.ajouteFils(gnc);
			                phrase.ajouteFils(gva);
			        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return phrase;
	}
	// $ANTLR end "phrase"



	// $ANTLR start "gn_c"
	// /Users/Natan/Developer/lo17/td4/Tal_simple.g:38:1: gn_c returns [Arbre gnc = new Arbre(\"GNC\")] : agn1= gn (c= CONJ agn2= gn )* ;
	public final Arbre gn_c() throws RecognitionException {
		Arbre gnc =  new Arbre("GNC");


		Token c=null;
		Arbre agn1 =null;
		Arbre agn2 =null;

		Arbre gn1, gn2;
		try {
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:39:31: (agn1= gn (c= CONJ agn2= gn )* )
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:40:17: agn1= gn (c= CONJ agn2= gn )*
			{
			pushFollow(FOLLOW_gn_in_gn_c271);
			agn1=gn();
			state._fsp--;


			                        gn1 = agn1;
			                        gnc.ajouteFils(gn1);
			                
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:45:17: (c= CONJ agn2= gn )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CONJ) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:45:18: c= CONJ agn2= gn
					{
					c=(Token)match(input,CONJ,FOLLOW_CONJ_in_gn_c313); 
					pushFollow(FOLLOW_gn_in_gn_c319);
					agn2=gn();
					state._fsp--;


					                        gnc.ajouteFils(new Arbre("CONJ",c.getText()));
					                        gn2 =agn2;
					                        gnc.ajouteFils(gn2);
					                
					}
					break;

				default :
					break loop1;
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
		return gnc;
	}
	// $ANTLR end "gn_c"



	// $ANTLR start "gn"
	// /Users/Natan/Developer/lo17/td4/Tal_simple.g:52:1: gn returns [Arbre legn = new Arbre(\"GN\")] : (d= DET n1= NOM (a= ADJ )? |n2= NOM );
	public final Arbre gn() throws RecognitionException {
		Arbre legn =  new Arbre("GN");


		Token d=null;
		Token n1=null;
		Token a=null;
		Token n2=null;

		try {
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:52:42: (d= DET n1= NOM (a= ADJ )? |n2= NOM )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==DET) ) {
				alt3=1;
			}
			else if ( (LA3_0==NOM) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:53:9: d= DET n1= NOM (a= ADJ )?
					{
					d=(Token)match(input,DET,FOLLOW_DET_in_gn360); 
					n1=(Token)match(input,NOM,FOLLOW_NOM_in_gn364); 

					                legn.ajouteFils(new Arbre("DET",d.getText()));
					                legn.ajouteFils(new Arbre("NOM",n1.getText()));
					        
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:58:9: (a= ADJ )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ADJ) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /Users/Natan/Developer/lo17/td4/Tal_simple.g:58:10: a= ADJ
							{
							a=(Token)match(input,ADJ,FOLLOW_ADJ_in_gn387); 

							                legn.ajouteFils(new Arbre("ADJ",a.getText()));
							        
							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:62:11: n2= NOM
					{
					n2=(Token)match(input,NOM,FOLLOW_NOM_in_gn414); 

					                legn.ajouteFils(new Arbre("NOM",n2.getText()));
					        
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
		return legn;
	}
	// $ANTLR end "gn"



	// $ANTLR start "gv"
	// /Users/Natan/Developer/lo17/td4/Tal_simple.g:68:1: gv returns [Arbre legv = new Arbre(\"GV\")] : v= VERBE (agnc= gn_c )? ;
	public final Arbre gv() throws RecognitionException {
		Arbre legv =  new Arbre("GV");


		Token v=null;
		Arbre agnc =null;

		Arbre gnc;
		try {
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:69:26: (v= VERBE (agnc= gn_c )? )
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:70:9: v= VERBE (agnc= gn_c )?
			{
			v=(Token)match(input,VERBE,FOLLOW_VERBE_in_gv458); 

			                legv.ajouteFils(new Arbre("VERBE",v.getText()));
			        
			// /Users/Natan/Developer/lo17/td4/Tal_simple.g:74:9: (agnc= gn_c )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= DET && LA4_0 <= NOM)) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/Natan/Developer/lo17/td4/Tal_simple.g:74:10: agnc= gn_c
					{
					pushFollow(FOLLOW_gn_c_in_gv483);
					agnc=gn_c();
					state._fsp--;


					                gnc = agnc;
					                legv.ajouteFils(gnc);
					        
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
		return legv;
	}
	// $ANTLR end "gv"

	// Delegated rules



	public static final BitSet FOLLOW_phrase_in_listephrases154 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_POINT_in_listephrases156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gn_c_in_phrase210 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_gv_in_phrase216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gn_in_gn_c271 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_CONJ_in_gn_c313 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_gn_in_gn_c319 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_DET_in_gn360 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOM_in_gn364 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADJ_in_gn387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOM_in_gn414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERBE_in_gv458 = new BitSet(new long[]{0x00000000000000C2L});
	public static final BitSet FOLLOW_gn_c_in_gv483 = new BitSet(new long[]{0x0000000000000002L});
}
