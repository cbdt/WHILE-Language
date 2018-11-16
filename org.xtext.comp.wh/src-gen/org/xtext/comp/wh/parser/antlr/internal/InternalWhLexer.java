package org.xtext.comp.wh.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWhLexer extends Lexer {
    public static final int RULE_CR=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SYMBOL=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalWhLexer() {;} 
    public InternalWhLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWhLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalWh.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:11:7: ( 'function' )
            // InternalWh.g:11:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:12:7: ( ':' )
            // InternalWh.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:13:7: ( 'read' )
            // InternalWh.g:13:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:14:7: ( '%' )
            // InternalWh.g:14:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:15:7: ( 'write' )
            // InternalWh.g:15:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:16:7: ( ',' )
            // InternalWh.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:17:7: ( ';' )
            // InternalWh.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:18:7: ( 'nop' )
            // InternalWh.g:18:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:19:7: ( ':=' )
            // InternalWh.g:19:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:20:7: ( 'while' )
            // InternalWh.g:20:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:21:7: ( 'do' )
            // InternalWh.g:21:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:22:7: ( 'od' )
            // InternalWh.g:22:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:23:7: ( 'for' )
            // InternalWh.g:23:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:24:7: ( 'if' )
            // InternalWh.g:24:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:25:7: ( 'then' )
            // InternalWh.g:25:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:26:7: ( 'else' )
            // InternalWh.g:26:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:27:7: ( 'fi' )
            // InternalWh.g:27:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:28:7: ( 'foreach' )
            // InternalWh.g:28:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:29:7: ( 'in' )
            // InternalWh.g:29:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:30:7: ( 'nil' )
            // InternalWh.g:30:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:31:7: ( '(' )
            // InternalWh.g:31:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:32:7: ( 'cons' )
            // InternalWh.g:32:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:33:7: ( ')' )
            // InternalWh.g:33:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:34:7: ( 'list' )
            // InternalWh.g:34:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:35:7: ( 'hd' )
            // InternalWh.g:35:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:36:7: ( 'tl' )
            // InternalWh.g:36:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:37:7: ( 'and' )
            // InternalWh.g:37:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:38:7: ( 'or' )
            // InternalWh.g:38:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:39:7: ( 'not' )
            // InternalWh.g:39:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:40:7: ( '=?' )
            // InternalWh.g:40:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1757:13: ( 'a' .. 'z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )? )
            // InternalWh.g:1757:15: 'a' .. 'z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )?
            {
            matchRange('a','z'); 
            // InternalWh.g:1757:24: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWh.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalWh.g:1757:54: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='&'||LA4_0=='+'||(LA4_0>='-' && LA4_0<='/')||LA4_0=='_') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWh.g:1757:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    {
            	    // InternalWh.g:1757:55: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='-') ) {
            	        int LA2_1 = input.LA(2);

            	        if ( (LA2_1=='>') ) {
            	            alt2=2;
            	        }
            	        else if ( ((LA2_1>='0' && LA2_1<='9')||(LA2_1>='A' && LA2_1<='Z')||(LA2_1>='a' && LA2_1<='z')) ) {
            	            alt2=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 2, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA2_0=='&'||LA2_0=='+'||(LA2_0>='.' && LA2_0<='/')||LA2_0=='_') ) {
            	        alt2=1;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalWh.g:1757:56: ( '-' | '+' | '.' | '/' | '_' | '&' )
            	            {
            	            if ( input.LA(1)=='&'||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='/')||input.LA(1)=='_' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // InternalWh.g:1757:82: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // InternalWh.g:1757:88: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalWh.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalWh.g:1757:120: ( '?' | '!' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='!'||LA5_0=='?') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWh.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1759:15: ( 'A' .. 'Z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )? )
            // InternalWh.g:1759:17: 'A' .. 'Z' ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )* ( '?' | '!' )?
            {
            matchRange('A','Z'); 
            // InternalWh.g:1759:26: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalWh.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalWh.g:1759:56: ( ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+ )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='&'||LA9_0=='+'||(LA9_0>='-' && LA9_0<='/')||LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWh.g:1759:57: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    {
            	    // InternalWh.g:1759:57: ( ( '-' | '+' | '.' | '/' | '_' | '&' ) | '->' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0=='-') ) {
            	        int LA7_1 = input.LA(2);

            	        if ( (LA7_1=='>') ) {
            	            alt7=2;
            	        }
            	        else if ( ((LA7_1>='0' && LA7_1<='9')||(LA7_1>='A' && LA7_1<='Z')||(LA7_1>='a' && LA7_1<='z')) ) {
            	            alt7=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 7, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA7_0=='&'||LA7_0=='+'||(LA7_0>='.' && LA7_0<='/')||LA7_0=='_') ) {
            	        alt7=1;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalWh.g:1759:58: ( '-' | '+' | '.' | '/' | '_' | '&' )
            	            {
            	            if ( input.LA(1)=='&'||input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='/')||input.LA(1)=='_' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // InternalWh.g:1759:84: '->'
            	            {
            	            match("->"); 


            	            }
            	            break;

            	    }

            	    // InternalWh.g:1759:90: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||(LA8_0>='a' && LA8_0<='z')) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalWh.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalWh.g:1759:122: ( '?' | '!' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='!'||LA10_0=='?') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalWh.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_CR"
    public final void mRULE_CR() throws RecognitionException {
        try {
            int _type = RULE_CR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1761:9: ( '\\r' )
            // InternalWh.g:1761:11: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1763:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalWh.g:1763:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalWh.g:1763:11: ( '^' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='^') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalWh.g:1763:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalWh.g:1763:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWh.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1765:10: ( ( '0' .. '9' )+ )
            // InternalWh.g:1765:12: ( '0' .. '9' )+
            {
            // InternalWh.g:1765:12: ( '0' .. '9' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalWh.g:1765:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1767:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalWh.g:1767:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalWh.g:1767:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\"') ) {
                alt16=1;
            }
            else if ( (LA16_0=='\'') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalWh.g:1767:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalWh.g:1767:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalWh.g:1767:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWh.g:1767:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalWh.g:1767:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalWh.g:1767:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalWh.g:1767:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalWh.g:1767:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1769:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalWh.g:1769:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalWh.g:1769:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalWh.g:1769:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1771:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalWh.g:1771:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalWh.g:1771:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalWh.g:1771:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalWh.g:1771:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalWh.g:1771:41: ( '\\r' )? '\\n'
                    {
                    // InternalWh.g:1771:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalWh.g:1771:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1773:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalWh.g:1773:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalWh.g:1773:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalWh.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalWh.g:1775:16: ( . )
            // InternalWh.g:1775:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalWh.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_SYMBOL | RULE_VARIABLE | RULE_CR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt22=40;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalWh.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalWh.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalWh.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalWh.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalWh.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalWh.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalWh.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalWh.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalWh.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalWh.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalWh.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalWh.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalWh.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalWh.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalWh.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalWh.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalWh.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalWh.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalWh.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalWh.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalWh.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalWh.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalWh.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalWh.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalWh.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalWh.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalWh.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalWh.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalWh.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalWh.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalWh.g:1:190: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 32 :
                // InternalWh.g:1:202: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 33 :
                // InternalWh.g:1:216: RULE_CR
                {
                mRULE_CR(); 

                }
                break;
            case 34 :
                // InternalWh.g:1:224: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalWh.g:1:232: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalWh.g:1:241: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalWh.g:1:253: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalWh.g:1:269: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalWh.g:1:285: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalWh.g:1:293: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\1\44\1\47\1\44\1\uffff\1\44\2\uffff\6\44\1\uffff\1\44\1\uffff\3\44\1\37\1\44\1\100\1\102\1\37\2\uffff\3\37\2\uffff\2\44\1\113\1\44\1\uffff\1\104\2\uffff\1\44\1\uffff\2\44\2\uffff\2\44\1\123\1\124\1\125\1\126\1\127\1\44\1\131\1\44\1\uffff\1\44\1\uffff\1\44\1\135\1\44\1\uffff\1\100\1\uffff\1\104\7\uffff\1\44\1\142\1\uffff\4\44\1\146\1\147\1\150\5\uffff\1\44\1\uffff\3\44\1\uffff\1\155\1\100\2\44\1\uffff\1\160\2\44\3\uffff\1\163\1\164\1\165\1\166\1\uffff\2\44\1\uffff\1\171\1\172\4\uffff\2\44\2\uffff\1\44\1\176\1\177\2\uffff";
    static final String DFA22_eofS =
        "\u0080\uffff";
    static final String DFA22_minS =
        "\1\0\1\60\1\75\1\60\1\uffff\1\60\2\uffff\6\60\1\uffff\1\60\1\uffff\3\60\1\77\2\60\1\11\1\101\2\uffff\2\0\1\52\2\uffff\2\60\1\41\1\60\1\uffff\1\60\2\uffff\1\60\1\uffff\2\60\2\uffff\2\60\5\41\1\60\1\41\1\60\1\uffff\1\60\1\uffff\1\60\1\41\1\60\1\uffff\1\60\1\uffff\1\60\7\uffff\1\60\1\41\1\uffff\4\60\3\41\5\uffff\1\60\1\uffff\3\60\1\uffff\1\41\3\60\1\uffff\1\41\2\60\3\uffff\4\41\1\uffff\2\60\1\uffff\2\41\4\uffff\2\60\2\uffff\1\60\2\41\2\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\2\uffff\6\172\1\uffff\1\172\1\uffff\3\172\1\77\2\172\1\40\1\172\2\uffff\2\uffff\1\57\2\uffff\4\172\1\uffff\1\172\2\uffff\1\172\1\uffff\2\172\2\uffff\12\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\7\uffff\2\172\1\uffff\7\172\5\uffff\1\172\1\uffff\3\172\1\uffff\4\172\1\uffff\3\172\3\uffff\4\172\1\uffff\2\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA22_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\6\uffff\1\25\1\uffff\1\27\10\uffff\1\42\1\43\3\uffff\1\47\1\50\4\uffff\1\37\1\uffff\1\11\1\2\1\uffff\1\4\2\uffff\1\6\1\7\12\uffff\1\25\1\uffff\1\27\3\uffff\1\36\1\uffff\1\40\1\uffff\1\41\1\47\1\42\1\43\1\44\1\45\1\46\2\uffff\1\21\7\uffff\1\13\1\14\1\34\1\16\1\23\1\uffff\1\32\3\uffff\1\31\4\uffff\1\15\3\uffff\1\10\1\35\1\24\4\uffff\1\33\2\uffff\1\3\2\uffff\1\17\1\20\1\26\1\30\2\uffff\1\5\1\12\3\uffff\1\22\1\1";
    static final String DFA22_specialS =
        "\1\1\32\uffff\1\0\1\2\143\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\37\2\36\2\37\1\27\22\37\1\36\1\37\1\33\2\37\1\4\1\37\1\34\1\16\1\20\2\37\1\6\2\37\1\35\12\32\1\2\1\7\1\37\1\24\3\37\32\26\3\37\1\30\1\31\1\37\1\23\1\25\1\17\1\11\1\15\1\1\1\25\1\22\1\13\2\25\1\21\1\25\1\10\1\12\2\25\1\3\1\25\1\14\2\25\1\5\3\25\uff85\37",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\42\5\43\1\41\5\43\1\40\5\43",
            "\1\46",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\50\25\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\7\43\1\53\11\43\1\52\10\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\57\5\43\1\56\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\16\43\1\60\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\61\15\43\1\62\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\5\43\1\63\7\43\1\64\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\7\43\1\65\3\43\1\66\16\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\13\43\1\67\16\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\16\43\1\71\13\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\73\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\74\26\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\75\14\43",
            "\1\76",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\77\7\uffff\32\77\4\uffff\1\101\1\uffff\32\77",
            "\2\103\2\uffff\1\103\22\uffff\1\103",
            "\32\104\4\uffff\1\104\1\uffff\32\104",
            "",
            "",
            "\0\106",
            "\0\106",
            "\1\107\4\uffff\1\110",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\111\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\21\43\1\112\10\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "\12\114\7\uffff\32\114\6\uffff\32\114",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\1\115\31\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\116\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\117\21\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\17\43\1\120\3\43\1\121\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\13\43\1\122\16\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\130\25\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\22\43\1\132\7\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\133\14\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\22\43\1\134\7\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\136\26\43",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\101\1\uffff\32\77",
            "",
            "\12\137\7\uffff\32\137\6\uffff\32\137",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\2\43\1\140\27\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\141\25\43",
            "",
            "\12\114\7\uffff\32\114\4\uffff\1\45\1\uffff\32\114",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\143\26\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\23\43\1\144\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\13\43\1\145\16\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\151\14\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\152\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\22\43\1\153\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\23\43\1\154\6\43",
            "",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\137\7\uffff\32\137\4\uffff\1\101\1\uffff\32\137",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\23\43\1\156\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\1\157\31\43",
            "",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\161\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\162\25\43",
            "",
            "",
            "",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\167\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\2\43\1\170\27\43",
            "",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\16\43\1\173\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\7\43\1\174\22\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\175\14\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\1\44\4\uffff\1\44\4\uffff\1\44\1\uffff\3\44\12\43\5\uffff\1\44\1\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_SYMBOL | RULE_VARIABLE | RULE_CR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_27 = input.LA(1);

                        s = -1;
                        if ( ((LA22_27>='\u0000' && LA22_27<='\uFFFF')) ) {s = 70;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='f') ) {s = 1;}

                        else if ( (LA22_0==':') ) {s = 2;}

                        else if ( (LA22_0=='r') ) {s = 3;}

                        else if ( (LA22_0=='%') ) {s = 4;}

                        else if ( (LA22_0=='w') ) {s = 5;}

                        else if ( (LA22_0==',') ) {s = 6;}

                        else if ( (LA22_0==';') ) {s = 7;}

                        else if ( (LA22_0=='n') ) {s = 8;}

                        else if ( (LA22_0=='d') ) {s = 9;}

                        else if ( (LA22_0=='o') ) {s = 10;}

                        else if ( (LA22_0=='i') ) {s = 11;}

                        else if ( (LA22_0=='t') ) {s = 12;}

                        else if ( (LA22_0=='e') ) {s = 13;}

                        else if ( (LA22_0=='(') ) {s = 14;}

                        else if ( (LA22_0=='c') ) {s = 15;}

                        else if ( (LA22_0==')') ) {s = 16;}

                        else if ( (LA22_0=='l') ) {s = 17;}

                        else if ( (LA22_0=='h') ) {s = 18;}

                        else if ( (LA22_0=='a') ) {s = 19;}

                        else if ( (LA22_0=='=') ) {s = 20;}

                        else if ( (LA22_0=='b'||LA22_0=='g'||(LA22_0>='j' && LA22_0<='k')||LA22_0=='m'||(LA22_0>='p' && LA22_0<='q')||LA22_0=='s'||(LA22_0>='u' && LA22_0<='v')||(LA22_0>='x' && LA22_0<='z')) ) {s = 21;}

                        else if ( ((LA22_0>='A' && LA22_0<='Z')) ) {s = 22;}

                        else if ( (LA22_0=='\r') ) {s = 23;}

                        else if ( (LA22_0=='^') ) {s = 24;}

                        else if ( (LA22_0=='_') ) {s = 25;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 26;}

                        else if ( (LA22_0=='\"') ) {s = 27;}

                        else if ( (LA22_0=='\'') ) {s = 28;}

                        else if ( (LA22_0=='/') ) {s = 29;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0==' ') ) {s = 30;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='$')||LA22_0=='&'||(LA22_0>='*' && LA22_0<='+')||(LA22_0>='-' && LA22_0<='.')||LA22_0=='<'||(LA22_0>='>' && LA22_0<='@')||(LA22_0>='[' && LA22_0<=']')||LA22_0=='`'||(LA22_0>='{' && LA22_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_28 = input.LA(1);

                        s = -1;
                        if ( ((LA22_28>='\u0000' && LA22_28<='\uFFFF')) ) {s = 70;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}