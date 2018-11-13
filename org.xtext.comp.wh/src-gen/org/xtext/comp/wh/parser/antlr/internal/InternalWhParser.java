package org.xtext.comp.wh.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.comp.wh.services.WhGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CR", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'while'", "'do'", "'od'", "'for'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
    };
    public static final int RULE_CR=4;
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
    public static final int RULE_VARIABLE=6;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SYMBOL=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalWhParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWh.g"; }



     	private WhGrammarAccess grammarAccess;

        public InternalWhParser(TokenStream input, WhGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected WhGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalWh.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalWh.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalWh.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalWh.g:71:1: ruleModel returns [EObject current=null] : ( (lv_text_0_0= ruleProgram ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_text_0_0 = null;



        	enterRule();

        try {
            // InternalWh.g:77:2: ( ( (lv_text_0_0= ruleProgram ) ) )
            // InternalWh.g:78:2: ( (lv_text_0_0= ruleProgram ) )
            {
            // InternalWh.g:78:2: ( (lv_text_0_0= ruleProgram ) )
            // InternalWh.g:79:3: (lv_text_0_0= ruleProgram )
            {
            // InternalWh.g:79:3: (lv_text_0_0= ruleProgram )
            // InternalWh.g:80:4: lv_text_0_0= ruleProgram
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getModelAccess().getTextProgramParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_text_0_0=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getModelRule());
              				}
              				set(
              					current,
              					"text",
              					lv_text_0_0,
              					"org.xtext.comp.wh.Wh.Program");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgram"
    // InternalWh.g:100:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWh.g:100:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWh.g:101:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWh.g:107:1: ruleProgram returns [EObject current=null] : ( ( (lv_f_0_0= ruleFunction ) )* (this_CR_1= RULE_CR ( (lv_p_2_0= ruleProgram ) ) )? ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token this_CR_1=null;
        EObject lv_f_0_0 = null;

        EObject lv_p_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:113:2: ( ( ( (lv_f_0_0= ruleFunction ) )* (this_CR_1= RULE_CR ( (lv_p_2_0= ruleProgram ) ) )? ) )
            // InternalWh.g:114:2: ( ( (lv_f_0_0= ruleFunction ) )* (this_CR_1= RULE_CR ( (lv_p_2_0= ruleProgram ) ) )? )
            {
            // InternalWh.g:114:2: ( ( (lv_f_0_0= ruleFunction ) )* (this_CR_1= RULE_CR ( (lv_p_2_0= ruleProgram ) ) )? )
            // InternalWh.g:115:3: ( (lv_f_0_0= ruleFunction ) )* (this_CR_1= RULE_CR ( (lv_p_2_0= ruleProgram ) ) )?
            {
            // InternalWh.g:115:3: ( (lv_f_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWh.g:116:4: (lv_f_0_0= ruleFunction )
            	    {
            	    // InternalWh.g:116:4: (lv_f_0_0= ruleFunction )
            	    // InternalWh.g:117:5: lv_f_0_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getFFunctionParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_f_0_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"f",
            	      						lv_f_0_0,
            	      						"org.xtext.comp.wh.Wh.Function");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalWh.g:134:3: (this_CR_1= RULE_CR ( (lv_p_2_0= ruleProgram ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_CR) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalWh.g:135:4: this_CR_1= RULE_CR ( (lv_p_2_0= ruleProgram ) )
                    {
                    this_CR_1=(Token)match(input,RULE_CR,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CR_1, grammarAccess.getProgramAccess().getCRTerminalRuleCall_1_0());
                      			
                    }
                    // InternalWh.g:139:4: ( (lv_p_2_0= ruleProgram ) )
                    // InternalWh.g:140:5: (lv_p_2_0= ruleProgram )
                    {
                    // InternalWh.g:140:5: (lv_p_2_0= ruleProgram )
                    // InternalWh.g:141:6: lv_p_2_0= ruleProgram
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProgramAccess().getPProgramParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_p_2_0=ruleProgram();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProgramRule());
                      						}
                      						set(
                      							current,
                      							"p",
                      							lv_p_2_0,
                      							"org.xtext.comp.wh.Wh.Program");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalWh.g:163:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalWh.g:163:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalWh.g:164:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalWh.g:170:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_function_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_d_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_function_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_d_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:176:2: ( (otherlv_0= 'function' ( (lv_function_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_d_3_0= ruleDefinition ) ) ) )
            // InternalWh.g:177:2: (otherlv_0= 'function' ( (lv_function_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_d_3_0= ruleDefinition ) ) )
            {
            // InternalWh.g:177:2: (otherlv_0= 'function' ( (lv_function_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_d_3_0= ruleDefinition ) ) )
            // InternalWh.g:178:3: otherlv_0= 'function' ( (lv_function_name_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_d_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalWh.g:182:3: ( (lv_function_name_1_0= RULE_SYMBOL ) )
            // InternalWh.g:183:4: (lv_function_name_1_0= RULE_SYMBOL )
            {
            // InternalWh.g:183:4: (lv_function_name_1_0= RULE_SYMBOL )
            // InternalWh.g:184:5: lv_function_name_1_0= RULE_SYMBOL
            {
            lv_function_name_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_function_name_1_0, grammarAccess.getFunctionAccess().getFunction_nameSYMBOLTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"function_name",
              						lv_function_name_1_0,
              						"org.xtext.comp.wh.Wh.SYMBOL");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
              		
            }
            // InternalWh.g:204:3: ( (lv_d_3_0= ruleDefinition ) )
            // InternalWh.g:205:4: (lv_d_3_0= ruleDefinition )
            {
            // InternalWh.g:205:4: (lv_d_3_0= ruleDefinition )
            // InternalWh.g:206:5: lv_d_3_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getDDefinitionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_d_3_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"d",
              						lv_d_3_0,
              						"org.xtext.comp.wh.Wh.Definition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // InternalWh.g:227:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWh.g:227:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWh.g:228:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalWh.g:234:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ( (lv_i_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_o_6_0= ruleOutput ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_i_1_0 = null;

        EObject lv_c_3_0 = null;

        EObject lv_o_6_0 = null;



        	enterRule();

        try {
            // InternalWh.g:240:2: ( (otherlv_0= 'read' ( (lv_i_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_o_6_0= ruleOutput ) ) ) )
            // InternalWh.g:241:2: (otherlv_0= 'read' ( (lv_i_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_o_6_0= ruleOutput ) ) )
            {
            // InternalWh.g:241:2: (otherlv_0= 'read' ( (lv_i_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_o_6_0= ruleOutput ) ) )
            // InternalWh.g:242:3: otherlv_0= 'read' ( (lv_i_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_o_6_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
              		
            }
            // InternalWh.g:246:3: ( (lv_i_1_0= ruleInput ) )
            // InternalWh.g:247:4: (lv_i_1_0= ruleInput )
            {
            // InternalWh.g:247:4: (lv_i_1_0= ruleInput )
            // InternalWh.g:248:5: lv_i_1_0= ruleInput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getIInputParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_i_1_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"i",
              						lv_i_1_0,
              						"org.xtext.comp.wh.Wh.Input");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
              		
            }
            // InternalWh.g:269:3: ( (lv_c_3_0= ruleCommands ) )
            // InternalWh.g:270:4: (lv_c_3_0= ruleCommands )
            {
            // InternalWh.g:270:4: (lv_c_3_0= ruleCommands )
            // InternalWh.g:271:5: lv_c_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getCCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_c_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"c",
              						lv_c_3_0,
              						"org.xtext.comp.wh.Wh.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
              		
            }
            // InternalWh.g:296:3: ( (lv_o_6_0= ruleOutput ) )
            // InternalWh.g:297:4: (lv_o_6_0= ruleOutput )
            {
            // InternalWh.g:297:4: (lv_o_6_0= ruleOutput )
            // InternalWh.g:298:5: lv_o_6_0= ruleOutput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getOOutputParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_o_6_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"o",
              						lv_o_6_0,
              						"org.xtext.comp.wh.Wh.Output");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalWh.g:319:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalWh.g:319:46: (iv_ruleInput= ruleInput EOF )
            // InternalWh.g:320:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalWh.g:326:1: ruleInput returns [EObject current=null] : ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_v_0_0=null;
        Token otherlv_1=null;
        Token lv_v2_2_0=null;


        	enterRule();

        try {
            // InternalWh.g:332:2: ( ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWh.g:333:2: ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWh.g:333:2: ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* )
            // InternalWh.g:334:3: ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWh.g:334:3: ( (lv_v_0_0= RULE_VARIABLE ) )
            // InternalWh.g:335:4: (lv_v_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:335:4: (lv_v_0_0= RULE_VARIABLE )
            // InternalWh.g:336:5: lv_v_0_0= RULE_VARIABLE
            {
            lv_v_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_v_0_0, grammarAccess.getInputAccess().getVVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"v",
              						lv_v_0_0,
              						"org.xtext.comp.wh.Wh.VARIABLE");
              				
            }

            }


            }

            // InternalWh.g:352:3: (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWh.g:353:4: otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:357:4: ( (lv_v2_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:358:5: (lv_v2_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:358:5: (lv_v2_2_0= RULE_VARIABLE )
            	    // InternalWh.g:359:6: lv_v2_2_0= RULE_VARIABLE
            	    {
            	    lv_v2_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_v2_2_0, grammarAccess.getInputAccess().getV2VARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getInputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"v2",
            	      							lv_v2_2_0,
            	      							"org.xtext.comp.wh.Wh.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalWh.g:380:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalWh.g:380:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalWh.g:381:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalWh.g:387:1: ruleOutput returns [EObject current=null] : ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_v_0_0=null;
        Token otherlv_1=null;
        Token lv_v2_2_0=null;


        	enterRule();

        try {
            // InternalWh.g:393:2: ( ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWh.g:394:2: ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWh.g:394:2: ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* )
            // InternalWh.g:395:3: ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWh.g:395:3: ( (lv_v_0_0= RULE_VARIABLE ) )
            // InternalWh.g:396:4: (lv_v_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:396:4: (lv_v_0_0= RULE_VARIABLE )
            // InternalWh.g:397:5: lv_v_0_0= RULE_VARIABLE
            {
            lv_v_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_v_0_0, grammarAccess.getOutputAccess().getVVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOutputRule());
              					}
              					setWithLastConsumed(
              						current,
              						"v",
              						lv_v_0_0,
              						"org.xtext.comp.wh.Wh.VARIABLE");
              				
            }

            }


            }

            // InternalWh.g:413:3: (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWh.g:414:4: otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:418:4: ( (lv_v2_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:419:5: (lv_v2_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:419:5: (lv_v2_2_0= RULE_VARIABLE )
            	    // InternalWh.g:420:6: lv_v2_2_0= RULE_VARIABLE
            	    {
            	    lv_v2_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_v2_2_0, grammarAccess.getOutputAccess().getV2VARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOutputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"v2",
            	      							lv_v2_2_0,
            	      							"org.xtext.comp.wh.Wh.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // InternalWh.g:441:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWh.g:441:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWh.g:442:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalWh.g:448:1: ruleCommands returns [EObject current=null] : ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_c2_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_c_0_0 = null;

        EObject lv_c2_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:454:2: ( ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_c2_2_0= ruleCommand ) ) )* ) )
            // InternalWh.g:455:2: ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_c2_2_0= ruleCommand ) ) )* )
            {
            // InternalWh.g:455:2: ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_c2_2_0= ruleCommand ) ) )* )
            // InternalWh.g:456:3: ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_c2_2_0= ruleCommand ) ) )*
            {
            // InternalWh.g:456:3: ( (lv_c_0_0= ruleCommand ) )
            // InternalWh.g:457:4: (lv_c_0_0= ruleCommand )
            {
            // InternalWh.g:457:4: (lv_c_0_0= ruleCommand )
            // InternalWh.g:458:5: lv_c_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_c_0_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCommandsRule());
              					}
              					add(
              						current,
              						"c",
              						lv_c_0_0,
              						"org.xtext.comp.wh.Wh.Command");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:475:3: (otherlv_1= ';' ( (lv_c2_2_0= ruleCommand ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalWh.g:476:4: otherlv_1= ';' ( (lv_c2_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:480:4: ( (lv_c2_2_0= ruleCommand ) )
            	    // InternalWh.g:481:5: (lv_c2_2_0= ruleCommand )
            	    {
            	    // InternalWh.g:481:5: (lv_c2_2_0= ruleCommand )
            	    // InternalWh.g:482:6: lv_c2_2_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCommandsAccess().getC2CommandParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_c2_2_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"c2",
            	      							lv_c2_2_0,
            	      							"org.xtext.comp.wh.Wh.Command");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalWh.g:504:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWh.g:504:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWh.g:505:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalWh.g:511:1: ruleCommand returns [EObject current=null] : ( ( (lv_nop_0_0= 'nop' ) ) | ( (lv_assign_1_0= ruleAssign ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_for_3_0= ruleFor ) ) | ( (lv_if_4_0= ruleIf ) ) | ( (lv_foreach_5_0= ruleForeach ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;
        EObject lv_assign_1_0 = null;

        EObject lv_while_2_0 = null;

        EObject lv_for_3_0 = null;

        EObject lv_if_4_0 = null;

        EObject lv_foreach_5_0 = null;



        	enterRule();

        try {
            // InternalWh.g:517:2: ( ( ( (lv_nop_0_0= 'nop' ) ) | ( (lv_assign_1_0= ruleAssign ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_for_3_0= ruleFor ) ) | ( (lv_if_4_0= ruleIf ) ) | ( (lv_foreach_5_0= ruleForeach ) ) ) )
            // InternalWh.g:518:2: ( ( (lv_nop_0_0= 'nop' ) ) | ( (lv_assign_1_0= ruleAssign ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_for_3_0= ruleFor ) ) | ( (lv_if_4_0= ruleIf ) ) | ( (lv_foreach_5_0= ruleForeach ) ) )
            {
            // InternalWh.g:518:2: ( ( (lv_nop_0_0= 'nop' ) ) | ( (lv_assign_1_0= ruleAssign ) ) | ( (lv_while_2_0= ruleWhile ) ) | ( (lv_for_3_0= ruleFor ) ) | ( (lv_if_4_0= ruleIf ) ) | ( (lv_foreach_5_0= ruleForeach ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 27:
                {
                alt6=5;
                }
                break;
            case 31:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalWh.g:519:3: ( (lv_nop_0_0= 'nop' ) )
                    {
                    // InternalWh.g:519:3: ( (lv_nop_0_0= 'nop' ) )
                    // InternalWh.g:520:4: (lv_nop_0_0= 'nop' )
                    {
                    // InternalWh.g:520:4: (lv_nop_0_0= 'nop' )
                    // InternalWh.g:521:5: lv_nop_0_0= 'nop'
                    {
                    lv_nop_0_0=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nop_0_0, grammarAccess.getCommandAccess().getNopNopKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getCommandRule());
                      					}
                      					setWithLastConsumed(current, "nop", lv_nop_0_0, "nop");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:534:3: ( (lv_assign_1_0= ruleAssign ) )
                    {
                    // InternalWh.g:534:3: ( (lv_assign_1_0= ruleAssign ) )
                    // InternalWh.g:535:4: (lv_assign_1_0= ruleAssign )
                    {
                    // InternalWh.g:535:4: (lv_assign_1_0= ruleAssign )
                    // InternalWh.g:536:5: lv_assign_1_0= ruleAssign
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getAssignAssignParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_assign_1_0=ruleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"assign",
                      						lv_assign_1_0,
                      						"org.xtext.comp.wh.Wh.Assign");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWh.g:554:3: ( (lv_while_2_0= ruleWhile ) )
                    {
                    // InternalWh.g:554:3: ( (lv_while_2_0= ruleWhile ) )
                    // InternalWh.g:555:4: (lv_while_2_0= ruleWhile )
                    {
                    // InternalWh.g:555:4: (lv_while_2_0= ruleWhile )
                    // InternalWh.g:556:5: lv_while_2_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getWhileWhileParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_while_2_0=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"while",
                      						lv_while_2_0,
                      						"org.xtext.comp.wh.Wh.While");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWh.g:574:3: ( (lv_for_3_0= ruleFor ) )
                    {
                    // InternalWh.g:574:3: ( (lv_for_3_0= ruleFor ) )
                    // InternalWh.g:575:4: (lv_for_3_0= ruleFor )
                    {
                    // InternalWh.g:575:4: (lv_for_3_0= ruleFor )
                    // InternalWh.g:576:5: lv_for_3_0= ruleFor
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getForForParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_for_3_0=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"for",
                      						lv_for_3_0,
                      						"org.xtext.comp.wh.Wh.For");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalWh.g:594:3: ( (lv_if_4_0= ruleIf ) )
                    {
                    // InternalWh.g:594:3: ( (lv_if_4_0= ruleIf ) )
                    // InternalWh.g:595:4: (lv_if_4_0= ruleIf )
                    {
                    // InternalWh.g:595:4: (lv_if_4_0= ruleIf )
                    // InternalWh.g:596:5: lv_if_4_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getIfIfParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_if_4_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"if",
                      						lv_if_4_0,
                      						"org.xtext.comp.wh.Wh.If");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalWh.g:614:3: ( (lv_foreach_5_0= ruleForeach ) )
                    {
                    // InternalWh.g:614:3: ( (lv_foreach_5_0= ruleForeach ) )
                    // InternalWh.g:615:4: (lv_foreach_5_0= ruleForeach )
                    {
                    // InternalWh.g:615:4: (lv_foreach_5_0= ruleForeach )
                    // InternalWh.g:616:5: lv_foreach_5_0= ruleForeach
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCommandAccess().getForeachForeachParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_foreach_5_0=ruleForeach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCommandRule());
                      					}
                      					set(
                      						current,
                      						"foreach",
                      						lv_foreach_5_0,
                      						"org.xtext.comp.wh.Wh.Foreach");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleAssign"
    // InternalWh.g:637:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalWh.g:637:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalWh.g:638:2: iv_ruleAssign= ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssign=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalWh.g:644:1: ruleAssign returns [EObject current=null] : ( ( (lv_v_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_e_2_0= ruleExprs ) ) ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_v_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:650:2: ( ( ( (lv_v_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_e_2_0= ruleExprs ) ) ) )
            // InternalWh.g:651:2: ( ( (lv_v_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_e_2_0= ruleExprs ) ) )
            {
            // InternalWh.g:651:2: ( ( (lv_v_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_e_2_0= ruleExprs ) ) )
            // InternalWh.g:652:3: ( (lv_v_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_e_2_0= ruleExprs ) )
            {
            // InternalWh.g:652:3: ( (lv_v_0_0= ruleVars ) )
            // InternalWh.g:653:4: (lv_v_0_0= ruleVars )
            {
            // InternalWh.g:653:4: (lv_v_0_0= ruleVars )
            // InternalWh.g:654:5: lv_v_0_0= ruleVars
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignAccess().getVVarsParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_v_0_0=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignRule());
              					}
              					set(
              						current,
              						"v",
              						lv_v_0_0,
              						"org.xtext.comp.wh.Wh.Vars");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssignAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalWh.g:675:3: ( (lv_e_2_0= ruleExprs ) )
            // InternalWh.g:676:4: (lv_e_2_0= ruleExprs )
            {
            // InternalWh.g:676:4: (lv_e_2_0= ruleExprs )
            // InternalWh.g:677:5: lv_e_2_0= ruleExprs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignAccess().getEExprsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_e_2_0=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_2_0,
              						"org.xtext.comp.wh.Wh.Exprs");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleWhile"
    // InternalWh.g:698:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalWh.g:698:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalWh.g:699:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalWh.g:705:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_e_1_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:711:2: ( (otherlv_0= 'while' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWh.g:712:2: (otherlv_0= 'while' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWh.g:712:2: (otherlv_0= 'while' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWh.g:713:3: otherlv_0= 'while' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            // InternalWh.g:717:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalWh.g:718:4: (lv_e_1_0= ruleExpr )
            {
            // InternalWh.g:718:4: (lv_e_1_0= ruleExpr )
            // InternalWh.g:719:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_e_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_1_0,
              						"org.xtext.comp.wh.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
              		
            }
            // InternalWh.g:740:3: ( (lv_c_3_0= ruleCommands ) )
            // InternalWh.g:741:4: (lv_c_3_0= ruleCommands )
            {
            // InternalWh.g:741:4: (lv_c_3_0= ruleCommands )
            // InternalWh.g:742:5: lv_c_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileAccess().getCCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_c_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileRule());
              					}
              					set(
              						current,
              						"c",
              						lv_c_3_0,
              						"org.xtext.comp.wh.Wh.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getOdKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleFor"
    // InternalWh.g:767:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalWh.g:767:44: (iv_ruleFor= ruleFor EOF )
            // InternalWh.g:768:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalWh.g:774:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_e_1_0 = null;

        EObject lv_c_3_0 = null;



        	enterRule();

        try {
            // InternalWh.g:780:2: ( (otherlv_0= 'for' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWh.g:781:2: (otherlv_0= 'for' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWh.g:781:2: (otherlv_0= 'for' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWh.g:782:3: otherlv_0= 'for' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_c_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
              		
            }
            // InternalWh.g:786:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalWh.g:787:4: (lv_e_1_0= ruleExpr )
            {
            // InternalWh.g:787:4: (lv_e_1_0= ruleExpr )
            // InternalWh.g:788:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_e_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_1_0,
              						"org.xtext.comp.wh.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForAccess().getDoKeyword_2());
              		
            }
            // InternalWh.g:809:3: ( (lv_c_3_0= ruleCommands ) )
            // InternalWh.g:810:4: (lv_c_3_0= ruleCommands )
            {
            // InternalWh.g:810:4: (lv_c_3_0= ruleCommands )
            // InternalWh.g:811:5: lv_c_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForAccess().getCCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_c_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForRule());
              					}
              					set(
              						current,
              						"c",
              						lv_c_3_0,
              						"org.xtext.comp.wh.Wh.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForAccess().getOdKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleIf"
    // InternalWh.g:836:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalWh.g:836:43: (iv_ruleIf= ruleIf EOF )
            // InternalWh.g:837:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalWh.g:843:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_c_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_c2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_e_1_0 = null;

        EObject lv_c_3_0 = null;

        EObject lv_c2_5_0 = null;



        	enterRule();

        try {
            // InternalWh.g:849:2: ( (otherlv_0= 'if' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_c_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_c2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // InternalWh.g:850:2: (otherlv_0= 'if' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_c_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_c2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // InternalWh.g:850:2: (otherlv_0= 'if' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_c_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_c2_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // InternalWh.g:851:3: otherlv_0= 'if' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_c_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_c2_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalWh.g:855:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalWh.g:856:4: (lv_e_1_0= ruleExpr )
            {
            // InternalWh.g:856:4: (lv_e_1_0= ruleExpr )
            // InternalWh.g:857:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_e_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_1_0,
              						"org.xtext.comp.wh.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getThenKeyword_2());
              		
            }
            // InternalWh.g:878:3: ( (lv_c_3_0= ruleCommands ) )
            // InternalWh.g:879:4: (lv_c_3_0= ruleCommands )
            {
            // InternalWh.g:879:4: (lv_c_3_0= ruleCommands )
            // InternalWh.g:880:5: lv_c_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getCCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_c_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"c",
              						lv_c_3_0,
              						"org.xtext.comp.wh.Wh.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:897:3: (otherlv_4= 'else' ( (lv_c2_5_0= ruleCommands ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalWh.g:898:4: otherlv_4= 'else' ( (lv_c2_5_0= ruleCommands ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalWh.g:902:4: ( (lv_c2_5_0= ruleCommands ) )
                    // InternalWh.g:903:5: (lv_c2_5_0= ruleCommands )
                    {
                    // InternalWh.g:903:5: (lv_c2_5_0= ruleCommands )
                    // InternalWh.g:904:6: lv_c2_5_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfAccess().getC2CommandsParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_c2_5_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfRule());
                      						}
                      						set(
                      							current,
                      							"c2",
                      							lv_c2_5_0,
                      							"org.xtext.comp.wh.Wh.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getFiKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleForeach"
    // InternalWh.g:930:1: entryRuleForeach returns [EObject current=null] : iv_ruleForeach= ruleForeach EOF ;
    public final EObject entryRuleForeach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeach = null;


        try {
            // InternalWh.g:930:48: (iv_ruleForeach= ruleForeach EOF )
            // InternalWh.g:931:2: iv_ruleForeach= ruleForeach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForeach=ruleForeach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeach; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeach"


    // $ANTLR start "ruleForeach"
    // InternalWh.g:937:1: ruleForeach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_e2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_c_5_0= ruleCommands ) ) otherlv_6= 'od' ) ;
    public final EObject ruleForeach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_e_1_0 = null;

        EObject lv_e2_3_0 = null;

        EObject lv_c_5_0 = null;



        	enterRule();

        try {
            // InternalWh.g:943:2: ( (otherlv_0= 'foreach' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_e2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_c_5_0= ruleCommands ) ) otherlv_6= 'od' ) )
            // InternalWh.g:944:2: (otherlv_0= 'foreach' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_e2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_c_5_0= ruleCommands ) ) otherlv_6= 'od' )
            {
            // InternalWh.g:944:2: (otherlv_0= 'foreach' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_e2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_c_5_0= ruleCommands ) ) otherlv_6= 'od' )
            // InternalWh.g:945:3: otherlv_0= 'foreach' ( (lv_e_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_e2_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_c_5_0= ruleCommands ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForeachAccess().getForeachKeyword_0());
              		
            }
            // InternalWh.g:949:3: ( (lv_e_1_0= ruleExpr ) )
            // InternalWh.g:950:4: (lv_e_1_0= ruleExpr )
            {
            // InternalWh.g:950:4: (lv_e_1_0= ruleExpr )
            // InternalWh.g:951:5: lv_e_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getEExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_e_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_1_0,
              						"org.xtext.comp.wh.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForeachAccess().getInKeyword_2());
              		
            }
            // InternalWh.g:972:3: ( (lv_e2_3_0= ruleExpr ) )
            // InternalWh.g:973:4: (lv_e2_3_0= ruleExpr )
            {
            // InternalWh.g:973:4: (lv_e2_3_0= ruleExpr )
            // InternalWh.g:974:5: lv_e2_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getE2ExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_e2_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"e2",
              						lv_e2_3_0,
              						"org.xtext.comp.wh.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForeachAccess().getDoKeyword_4());
              		
            }
            // InternalWh.g:995:3: ( (lv_c_5_0= ruleCommands ) )
            // InternalWh.g:996:4: (lv_c_5_0= ruleCommands )
            {
            // InternalWh.g:996:4: (lv_c_5_0= ruleCommands )
            // InternalWh.g:997:5: lv_c_5_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachAccess().getCCommandsParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_c_5_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachRule());
              					}
              					set(
              						current,
              						"c",
              						lv_c_5_0,
              						"org.xtext.comp.wh.Wh.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForeachAccess().getOdKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeach"


    // $ANTLR start "entryRuleVars"
    // InternalWh.g:1022:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalWh.g:1022:45: (iv_ruleVars= ruleVars EOF )
            // InternalWh.g:1023:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalWh.g:1029:1: ruleVars returns [EObject current=null] : ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_v_0_0=null;
        Token otherlv_1=null;
        Token lv_v2_2_0=null;


        	enterRule();

        try {
            // InternalWh.g:1035:2: ( ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWh.g:1036:2: ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWh.g:1036:2: ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )* )
            // InternalWh.g:1037:3: ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWh.g:1037:3: ( (lv_v_0_0= RULE_VARIABLE ) )
            // InternalWh.g:1038:4: (lv_v_0_0= RULE_VARIABLE )
            {
            // InternalWh.g:1038:4: (lv_v_0_0= RULE_VARIABLE )
            // InternalWh.g:1039:5: lv_v_0_0= RULE_VARIABLE
            {
            lv_v_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_v_0_0, grammarAccess.getVarsAccess().getVVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"v",
              						lv_v_0_0,
              						"org.xtext.comp.wh.Wh.VARIABLE");
              				
            }

            }


            }

            // InternalWh.g:1055:3: (otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWh.g:1056:4: otherlv_1= ',' ( (lv_v2_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:1060:4: ( (lv_v2_2_0= RULE_VARIABLE ) )
            	    // InternalWh.g:1061:5: (lv_v2_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWh.g:1061:5: (lv_v2_2_0= RULE_VARIABLE )
            	    // InternalWh.g:1062:6: lv_v2_2_0= RULE_VARIABLE
            	    {
            	    lv_v2_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_v2_2_0, grammarAccess.getVarsAccess().getV2VARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getVarsRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"v2",
            	      							lv_v2_2_0,
            	      							"org.xtext.comp.wh.Wh.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // InternalWh.g:1083:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalWh.g:1083:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalWh.g:1084:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalWh.g:1090:1: ruleExprs returns [EObject current=null] : ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_e2_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e2_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1096:2: ( ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_e2_2_0= ruleExpr ) ) )* ) )
            // InternalWh.g:1097:2: ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_e2_2_0= ruleExpr ) ) )* )
            {
            // InternalWh.g:1097:2: ( ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_e2_2_0= ruleExpr ) ) )* )
            // InternalWh.g:1098:3: ( (lv_e_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_e2_2_0= ruleExpr ) ) )*
            {
            // InternalWh.g:1098:3: ( (lv_e_0_0= ruleExpr ) )
            // InternalWh.g:1099:4: (lv_e_0_0= ruleExpr )
            {
            // InternalWh.g:1099:4: (lv_e_0_0= ruleExpr )
            // InternalWh.g:1100:5: lv_e_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprsAccess().getEExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_e_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprsRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_0_0,
              						"org.xtext.comp.wh.Wh.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:1117:3: (otherlv_1= ',' ( (lv_e2_2_0= ruleExpr ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWh.g:1118:4: otherlv_1= ',' ( (lv_e2_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:1122:4: ( (lv_e2_2_0= ruleExpr ) )
            	    // InternalWh.g:1123:5: (lv_e2_2_0= ruleExpr )
            	    {
            	    // InternalWh.g:1123:5: (lv_e2_2_0= ruleExpr )
            	    // InternalWh.g:1124:6: lv_e2_2_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprsAccess().getE2ExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_e2_2_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e2",
            	      							lv_e2_2_0,
            	      							"org.xtext.comp.wh.Wh.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // InternalWh.g:1146:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWh.g:1146:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWh.g:1147:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalWh.g:1153:1: ruleExpr returns [EObject current=null] : ( (lv_ea_0_0= ruleExprAnd ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_ea_0_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1159:2: ( ( (lv_ea_0_0= ruleExprAnd ) ) )
            // InternalWh.g:1160:2: ( (lv_ea_0_0= ruleExprAnd ) )
            {
            // InternalWh.g:1160:2: ( (lv_ea_0_0= ruleExprAnd ) )
            // InternalWh.g:1161:3: (lv_ea_0_0= ruleExprAnd )
            {
            // InternalWh.g:1161:3: (lv_ea_0_0= ruleExprAnd )
            // InternalWh.g:1162:4: lv_ea_0_0= ruleExprAnd
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getExprAccess().getEaExprAndParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ea_0_0=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getExprRule());
              				}
              				set(
              					current,
              					"ea",
              					lv_ea_0_0,
              					"org.xtext.comp.wh.Wh.ExprAnd");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // InternalWh.g:1182:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // InternalWh.g:1182:51: (iv_ruleExprSimple= ruleExprSimple EOF )
            // InternalWh.g:1183:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // InternalWh.g:1189:1: ruleExprSimple returns [EObject current=null] : ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_var_1_0= RULE_VARIABLE ) ) | ( (lv_sym_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' otherlv_4= 'cons' ( (lv_e3_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' otherlv_8= 'list' ( (lv_e4_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' otherlv_12= 'hd' ( (lv_e5_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' otherlv_16= 'tl' ( (lv_e6_17_0= ruleExpr ) ) otherlv_18= ')' ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token lv_nil_0_0=null;
        Token lv_var_1_0=null;
        Token lv_sym_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_e3_5_0 = null;

        EObject lv_e4_9_0 = null;

        EObject lv_e5_13_0 = null;

        EObject lv_e6_17_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1195:2: ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_var_1_0= RULE_VARIABLE ) ) | ( (lv_sym_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' otherlv_4= 'cons' ( (lv_e3_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' otherlv_8= 'list' ( (lv_e4_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' otherlv_12= 'hd' ( (lv_e5_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' otherlv_16= 'tl' ( (lv_e6_17_0= ruleExpr ) ) otherlv_18= ')' ) ) )
            // InternalWh.g:1196:2: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_var_1_0= RULE_VARIABLE ) ) | ( (lv_sym_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' otherlv_4= 'cons' ( (lv_e3_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' otherlv_8= 'list' ( (lv_e4_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' otherlv_12= 'hd' ( (lv_e5_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' otherlv_16= 'tl' ( (lv_e6_17_0= ruleExpr ) ) otherlv_18= ')' ) )
            {
            // InternalWh.g:1196:2: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_var_1_0= RULE_VARIABLE ) ) | ( (lv_sym_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' otherlv_4= 'cons' ( (lv_e3_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' otherlv_8= 'list' ( (lv_e4_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' otherlv_12= 'hd' ( (lv_e5_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' otherlv_16= 'tl' ( (lv_e6_17_0= ruleExpr ) ) otherlv_18= ')' ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt10=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                switch ( input.LA(2) ) {
                case 35:
                    {
                    alt10=4;
                    }
                    break;
                case 39:
                    {
                    alt10=7;
                    }
                    break;
                case 37:
                    {
                    alt10=5;
                    }
                    break;
                case 38:
                    {
                    alt10=6;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalWh.g:1197:3: ( (lv_nil_0_0= 'nil' ) )
                    {
                    // InternalWh.g:1197:3: ( (lv_nil_0_0= 'nil' ) )
                    // InternalWh.g:1198:4: (lv_nil_0_0= 'nil' )
                    {
                    // InternalWh.g:1198:4: (lv_nil_0_0= 'nil' )
                    // InternalWh.g:1199:5: lv_nil_0_0= 'nil'
                    {
                    lv_nil_0_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nil_0_0, grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(current, "nil", lv_nil_0_0, "nil");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:1212:3: ( (lv_var_1_0= RULE_VARIABLE ) )
                    {
                    // InternalWh.g:1212:3: ( (lv_var_1_0= RULE_VARIABLE ) )
                    // InternalWh.g:1213:4: (lv_var_1_0= RULE_VARIABLE )
                    {
                    // InternalWh.g:1213:4: (lv_var_1_0= RULE_VARIABLE )
                    // InternalWh.g:1214:5: lv_var_1_0= RULE_VARIABLE
                    {
                    lv_var_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_var_1_0, grammarAccess.getExprSimpleAccess().getVarVARIABLETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"var",
                      						lv_var_1_0,
                      						"org.xtext.comp.wh.Wh.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWh.g:1231:3: ( (lv_sym_2_0= RULE_SYMBOL ) )
                    {
                    // InternalWh.g:1231:3: ( (lv_sym_2_0= RULE_SYMBOL ) )
                    // InternalWh.g:1232:4: (lv_sym_2_0= RULE_SYMBOL )
                    {
                    // InternalWh.g:1232:4: (lv_sym_2_0= RULE_SYMBOL )
                    // InternalWh.g:1233:5: lv_sym_2_0= RULE_SYMBOL
                    {
                    lv_sym_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_sym_2_0, grammarAccess.getExprSimpleAccess().getSymSYMBOLTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprSimpleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"sym",
                      						lv_sym_2_0,
                      						"org.xtext.comp.wh.Wh.SYMBOL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWh.g:1250:3: (otherlv_3= '(' otherlv_4= 'cons' ( (lv_e3_5_0= ruleLExpr ) ) otherlv_6= ')' )
                    {
                    // InternalWh.g:1250:3: (otherlv_3= '(' otherlv_4= 'cons' ( (lv_e3_5_0= ruleLExpr ) ) otherlv_6= ')' )
                    // InternalWh.g:1251:4: otherlv_3= '(' otherlv_4= 'cons' ( (lv_e3_5_0= ruleLExpr ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,35,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getExprSimpleAccess().getConsKeyword_3_1());
                      			
                    }
                    // InternalWh.g:1259:4: ( (lv_e3_5_0= ruleLExpr ) )
                    // InternalWh.g:1260:5: (lv_e3_5_0= ruleLExpr )
                    {
                    // InternalWh.g:1260:5: (lv_e3_5_0= ruleLExpr )
                    // InternalWh.g:1261:6: lv_e3_5_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getE3LExprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_e3_5_0=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"e3",
                      							lv_e3_5_0,
                      							"org.xtext.comp.wh.Wh.LExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalWh.g:1284:3: (otherlv_7= '(' otherlv_8= 'list' ( (lv_e4_9_0= ruleLExpr ) ) otherlv_10= ')' )
                    {
                    // InternalWh.g:1284:3: (otherlv_7= '(' otherlv_8= 'list' ( (lv_e4_9_0= ruleLExpr ) ) otherlv_10= ')' )
                    // InternalWh.g:1285:4: otherlv_7= '(' otherlv_8= 'list' ( (lv_e4_9_0= ruleLExpr ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    otherlv_8=(Token)match(input,37,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getExprSimpleAccess().getListKeyword_4_1());
                      			
                    }
                    // InternalWh.g:1293:4: ( (lv_e4_9_0= ruleLExpr ) )
                    // InternalWh.g:1294:5: (lv_e4_9_0= ruleLExpr )
                    {
                    // InternalWh.g:1294:5: (lv_e4_9_0= ruleLExpr )
                    // InternalWh.g:1295:6: lv_e4_9_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getE4LExprParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_e4_9_0=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"e4",
                      							lv_e4_9_0,
                      							"org.xtext.comp.wh.Wh.LExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalWh.g:1318:3: (otherlv_11= '(' otherlv_12= 'hd' ( (lv_e5_13_0= ruleExpr ) ) otherlv_14= ')' )
                    {
                    // InternalWh.g:1318:3: (otherlv_11= '(' otherlv_12= 'hd' ( (lv_e5_13_0= ruleExpr ) ) otherlv_14= ')' )
                    // InternalWh.g:1319:4: otherlv_11= '(' otherlv_12= 'hd' ( (lv_e5_13_0= ruleExpr ) ) otherlv_14= ')'
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    otherlv_12=(Token)match(input,38,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getExprSimpleAccess().getHdKeyword_5_1());
                      			
                    }
                    // InternalWh.g:1327:4: ( (lv_e5_13_0= ruleExpr ) )
                    // InternalWh.g:1328:5: (lv_e5_13_0= ruleExpr )
                    {
                    // InternalWh.g:1328:5: (lv_e5_13_0= ruleExpr )
                    // InternalWh.g:1329:6: lv_e5_13_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getE5ExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_e5_13_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"e5",
                      							lv_e5_13_0,
                      							"org.xtext.comp.wh.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalWh.g:1352:3: (otherlv_15= '(' otherlv_16= 'tl' ( (lv_e6_17_0= ruleExpr ) ) otherlv_18= ')' )
                    {
                    // InternalWh.g:1352:3: (otherlv_15= '(' otherlv_16= 'tl' ( (lv_e6_17_0= ruleExpr ) ) otherlv_18= ')' )
                    // InternalWh.g:1353:4: otherlv_15= '(' otherlv_16= 'tl' ( (lv_e6_17_0= ruleExpr ) ) otherlv_18= ')'
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    otherlv_16=(Token)match(input,39,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getExprSimpleAccess().getTlKeyword_6_1());
                      			
                    }
                    // InternalWh.g:1361:4: ( (lv_e6_17_0= ruleExpr ) )
                    // InternalWh.g:1362:5: (lv_e6_17_0= ruleExpr )
                    {
                    // InternalWh.g:1362:5: (lv_e6_17_0= ruleExpr )
                    // InternalWh.g:1363:6: lv_e6_17_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprSimpleAccess().getE6ExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_e6_17_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      						}
                      						set(
                      							current,
                      							"e6",
                      							lv_e6_17_0,
                      							"org.xtext.comp.wh.Wh.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_6_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleExprAnd"
    // InternalWh.g:1389:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // InternalWh.g:1389:48: (iv_ruleExprAnd= ruleExprAnd EOF )
            // InternalWh.g:1390:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // InternalWh.g:1396:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_eo_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_eo2_2_0= ruleExprOr ) ) )* ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_eo_0_0 = null;

        EObject lv_eo2_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1402:2: ( ( ( (lv_eo_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_eo2_2_0= ruleExprOr ) ) )* ) )
            // InternalWh.g:1403:2: ( ( (lv_eo_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_eo2_2_0= ruleExprOr ) ) )* )
            {
            // InternalWh.g:1403:2: ( ( (lv_eo_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_eo2_2_0= ruleExprOr ) ) )* )
            // InternalWh.g:1404:3: ( (lv_eo_0_0= ruleExprOr ) ) (otherlv_1= 'and' ( (lv_eo2_2_0= ruleExprOr ) ) )*
            {
            // InternalWh.g:1404:3: ( (lv_eo_0_0= ruleExprOr ) )
            // InternalWh.g:1405:4: (lv_eo_0_0= ruleExprOr )
            {
            // InternalWh.g:1405:4: (lv_eo_0_0= ruleExprOr )
            // InternalWh.g:1406:5: lv_eo_0_0= ruleExprOr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprAndAccess().getEoExprOrParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_eo_0_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprAndRule());
              					}
              					set(
              						current,
              						"eo",
              						lv_eo_0_0,
              						"org.xtext.comp.wh.Wh.ExprOr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:1423:3: (otherlv_1= 'and' ( (lv_eo2_2_0= ruleExprOr ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==40) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalWh.g:1424:4: otherlv_1= 'and' ( (lv_eo2_2_0= ruleExprOr ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprAndAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:1428:4: ( (lv_eo2_2_0= ruleExprOr ) )
            	    // InternalWh.g:1429:5: (lv_eo2_2_0= ruleExprOr )
            	    {
            	    // InternalWh.g:1429:5: (lv_eo2_2_0= ruleExprOr )
            	    // InternalWh.g:1430:6: lv_eo2_2_0= ruleExprOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprAndAccess().getEo2ExprOrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_eo2_2_0=ruleExprOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprAndRule());
            	      						}
            	      						add(
            	      							current,
            	      							"eo2",
            	      							lv_eo2_2_0,
            	      							"org.xtext.comp.wh.Wh.ExprOr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // InternalWh.g:1452:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // InternalWh.g:1452:47: (iv_ruleExprOr= ruleExprOr EOF )
            // InternalWh.g:1453:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // InternalWh.g:1459:1: ruleExprOr returns [EObject current=null] : ( ( (lv_en_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_en2_2_0= ruleExprNot ) ) )* ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_en_0_0 = null;

        EObject lv_en2_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1465:2: ( ( ( (lv_en_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_en2_2_0= ruleExprNot ) ) )* ) )
            // InternalWh.g:1466:2: ( ( (lv_en_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_en2_2_0= ruleExprNot ) ) )* )
            {
            // InternalWh.g:1466:2: ( ( (lv_en_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_en2_2_0= ruleExprNot ) ) )* )
            // InternalWh.g:1467:3: ( (lv_en_0_0= ruleExprNot ) ) (otherlv_1= 'or' ( (lv_en2_2_0= ruleExprNot ) ) )*
            {
            // InternalWh.g:1467:3: ( (lv_en_0_0= ruleExprNot ) )
            // InternalWh.g:1468:4: (lv_en_0_0= ruleExprNot )
            {
            // InternalWh.g:1468:4: (lv_en_0_0= ruleExprNot )
            // InternalWh.g:1469:5: lv_en_0_0= ruleExprNot
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprOrAccess().getEnExprNotParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_en_0_0=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprOrRule());
              					}
              					set(
              						current,
              						"en",
              						lv_en_0_0,
              						"org.xtext.comp.wh.Wh.ExprNot");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWh.g:1486:3: (otherlv_1= 'or' ( (lv_en2_2_0= ruleExprNot ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalWh.g:1487:4: otherlv_1= 'or' ( (lv_en2_2_0= ruleExprNot ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprOrAccess().getOrKeyword_1_0());
            	      			
            	    }
            	    // InternalWh.g:1491:4: ( (lv_en2_2_0= ruleExprNot ) )
            	    // InternalWh.g:1492:5: (lv_en2_2_0= ruleExprNot )
            	    {
            	    // InternalWh.g:1492:5: (lv_en2_2_0= ruleExprNot )
            	    // InternalWh.g:1493:6: lv_en2_2_0= ruleExprNot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprOrAccess().getEn2ExprNotParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_en2_2_0=ruleExprNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprOrRule());
            	      						}
            	      						add(
            	      							current,
            	      							"en2",
            	      							lv_en2_2_0,
            	      							"org.xtext.comp.wh.Wh.ExprNot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // InternalWh.g:1515:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // InternalWh.g:1515:48: (iv_ruleExprNot= ruleExprNot EOF )
            // InternalWh.g:1516:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // InternalWh.g:1522:1: ruleExprNot returns [EObject current=null] : ( (otherlv_0= 'not' ( (lv_e_1_0= ruleExprEq ) ) ) | ( (lv_e2_2_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_e_1_0 = null;

        EObject lv_e2_2_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1528:2: ( ( (otherlv_0= 'not' ( (lv_e_1_0= ruleExprEq ) ) ) | ( (lv_e2_2_0= ruleExprEq ) ) ) )
            // InternalWh.g:1529:2: ( (otherlv_0= 'not' ( (lv_e_1_0= ruleExprEq ) ) ) | ( (lv_e2_2_0= ruleExprEq ) ) )
            {
            // InternalWh.g:1529:2: ( (otherlv_0= 'not' ( (lv_e_1_0= ruleExprEq ) ) ) | ( (lv_e2_2_0= ruleExprEq ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_SYMBOL && LA13_0<=RULE_VARIABLE)||(LA13_0>=33 && LA13_0<=34)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalWh.g:1530:3: (otherlv_0= 'not' ( (lv_e_1_0= ruleExprEq ) ) )
                    {
                    // InternalWh.g:1530:3: (otherlv_0= 'not' ( (lv_e_1_0= ruleExprEq ) ) )
                    // InternalWh.g:1531:4: otherlv_0= 'not' ( (lv_e_1_0= ruleExprEq ) )
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getExprNotAccess().getNotKeyword_0_0());
                      			
                    }
                    // InternalWh.g:1535:4: ( (lv_e_1_0= ruleExprEq ) )
                    // InternalWh.g:1536:5: (lv_e_1_0= ruleExprEq )
                    {
                    // InternalWh.g:1536:5: (lv_e_1_0= ruleExprEq )
                    // InternalWh.g:1537:6: lv_e_1_0= ruleExprEq
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprNotAccess().getEExprEqParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_e_1_0=ruleExprEq();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprNotRule());
                      						}
                      						set(
                      							current,
                      							"e",
                      							lv_e_1_0,
                      							"org.xtext.comp.wh.Wh.ExprEq");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:1556:3: ( (lv_e2_2_0= ruleExprEq ) )
                    {
                    // InternalWh.g:1556:3: ( (lv_e2_2_0= ruleExprEq ) )
                    // InternalWh.g:1557:4: (lv_e2_2_0= ruleExprEq )
                    {
                    // InternalWh.g:1557:4: (lv_e2_2_0= ruleExprEq )
                    // InternalWh.g:1558:5: lv_e2_2_0= ruleExprEq
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getExprNotAccess().getE2ExprEqParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_e2_2_0=ruleExprEq();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getExprNotRule());
                      					}
                      					set(
                      						current,
                      						"e2",
                      						lv_e2_2_0,
                      						"org.xtext.comp.wh.Wh.ExprEq");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // InternalWh.g:1579:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // InternalWh.g:1579:47: (iv_ruleExprEq= ruleExprEq EOF )
            // InternalWh.g:1580:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // InternalWh.g:1586:1: ruleExprEq returns [EObject current=null] : ( ( ( (lv_e_0_0= ruleExprSimple ) ) (otherlv_1= '=?' ( (lv_e2_2_0= ruleExprSimple ) ) )? ) | ( ( ( '(' )=>otherlv_3= '(' ) (this_SYMBOL_4= RULE_SYMBOL )? this_LExpr_5= ruleLExpr otherlv_6= ')' ) ) ;
    public final EObject ruleExprEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_SYMBOL_4=null;
        Token otherlv_6=null;
        EObject lv_e_0_0 = null;

        EObject lv_e2_2_0 = null;

        EObject this_LExpr_5 = null;



        	enterRule();

        try {
            // InternalWh.g:1592:2: ( ( ( ( (lv_e_0_0= ruleExprSimple ) ) (otherlv_1= '=?' ( (lv_e2_2_0= ruleExprSimple ) ) )? ) | ( ( ( '(' )=>otherlv_3= '(' ) (this_SYMBOL_4= RULE_SYMBOL )? this_LExpr_5= ruleLExpr otherlv_6= ')' ) ) )
            // InternalWh.g:1593:2: ( ( ( (lv_e_0_0= ruleExprSimple ) ) (otherlv_1= '=?' ( (lv_e2_2_0= ruleExprSimple ) ) )? ) | ( ( ( '(' )=>otherlv_3= '(' ) (this_SYMBOL_4= RULE_SYMBOL )? this_LExpr_5= ruleLExpr otherlv_6= ')' ) )
            {
            // InternalWh.g:1593:2: ( ( ( (lv_e_0_0= ruleExprSimple ) ) (otherlv_1= '=?' ( (lv_e2_2_0= ruleExprSimple ) ) )? ) | ( ( ( '(' )=>otherlv_3= '(' ) (this_SYMBOL_4= RULE_SYMBOL )? this_LExpr_5= ruleLExpr otherlv_6= ')' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_SYMBOL && LA16_0<=RULE_VARIABLE)||LA16_0==33) ) {
                alt16=1;
            }
            else if ( (LA16_0==34) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==35||(LA16_2>=37 && LA16_2<=39)) ) {
                    alt16=1;
                }
                else if ( (LA16_2==RULE_SYMBOL) && (synpred1_InternalWh())) {
                    alt16=2;
                }
                else if ( (LA16_2==42) && (synpred1_InternalWh())) {
                    alt16=2;
                }
                else if ( (LA16_2==33) && (synpred1_InternalWh())) {
                    alt16=2;
                }
                else if ( (LA16_2==RULE_VARIABLE) && (synpred1_InternalWh())) {
                    alt16=2;
                }
                else if ( (LA16_2==34) && (synpred1_InternalWh())) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalWh.g:1594:3: ( ( (lv_e_0_0= ruleExprSimple ) ) (otherlv_1= '=?' ( (lv_e2_2_0= ruleExprSimple ) ) )? )
                    {
                    // InternalWh.g:1594:3: ( ( (lv_e_0_0= ruleExprSimple ) ) (otherlv_1= '=?' ( (lv_e2_2_0= ruleExprSimple ) ) )? )
                    // InternalWh.g:1595:4: ( (lv_e_0_0= ruleExprSimple ) ) (otherlv_1= '=?' ( (lv_e2_2_0= ruleExprSimple ) ) )?
                    {
                    // InternalWh.g:1595:4: ( (lv_e_0_0= ruleExprSimple ) )
                    // InternalWh.g:1596:5: (lv_e_0_0= ruleExprSimple )
                    {
                    // InternalWh.g:1596:5: (lv_e_0_0= ruleExprSimple )
                    // InternalWh.g:1597:6: lv_e_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprEqAccess().getEExprSimpleParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
                    lv_e_0_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprEqRule());
                      						}
                      						set(
                      							current,
                      							"e",
                      							lv_e_0_0,
                      							"org.xtext.comp.wh.Wh.ExprSimple");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWh.g:1614:4: (otherlv_1= '=?' ( (lv_e2_2_0= ruleExprSimple ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==43) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalWh.g:1615:5: otherlv_1= '=?' ( (lv_e2_2_0= ruleExprSimple ) )
                            {
                            otherlv_1=(Token)match(input,43,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1_0());
                              				
                            }
                            // InternalWh.g:1619:5: ( (lv_e2_2_0= ruleExprSimple ) )
                            // InternalWh.g:1620:6: (lv_e2_2_0= ruleExprSimple )
                            {
                            // InternalWh.g:1620:6: (lv_e2_2_0= ruleExprSimple )
                            // InternalWh.g:1621:7: lv_e2_2_0= ruleExprSimple
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExprEqAccess().getE2ExprSimpleParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_e2_2_0=ruleExprSimple();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExprEqRule());
                              							}
                              							set(
                              								current,
                              								"e2",
                              								lv_e2_2_0,
                              								"org.xtext.comp.wh.Wh.ExprSimple");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWh.g:1641:3: ( ( ( '(' )=>otherlv_3= '(' ) (this_SYMBOL_4= RULE_SYMBOL )? this_LExpr_5= ruleLExpr otherlv_6= ')' )
                    {
                    // InternalWh.g:1641:3: ( ( ( '(' )=>otherlv_3= '(' ) (this_SYMBOL_4= RULE_SYMBOL )? this_LExpr_5= ruleLExpr otherlv_6= ')' )
                    // InternalWh.g:1642:4: ( ( '(' )=>otherlv_3= '(' ) (this_SYMBOL_4= RULE_SYMBOL )? this_LExpr_5= ruleLExpr otherlv_6= ')'
                    {
                    // InternalWh.g:1642:4: ( ( '(' )=>otherlv_3= '(' )
                    // InternalWh.g:1643:5: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0());
                      				
                    }

                    }

                    // InternalWh.g:1649:4: (this_SYMBOL_4= RULE_SYMBOL )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_SYMBOL) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalWh.g:1650:5: this_SYMBOL_4= RULE_SYMBOL
                            {
                            this_SYMBOL_4=(Token)match(input,RULE_SYMBOL,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_SYMBOL_4, grammarAccess.getExprEqAccess().getSYMBOLTerminalRuleCall_1_1());
                              				
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExprEqAccess().getLExprParserRuleCall_1_2());
                      			
                    }
                    pushFollow(FOLLOW_23);
                    this_LExpr_5=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_LExpr_5;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_6=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprEq"


    // $ANTLR start "entryRuleLExpr"
    // InternalWh.g:1672:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // InternalWh.g:1672:46: (iv_ruleLExpr= ruleLExpr EOF )
            // InternalWh.g:1673:2: iv_ruleLExpr= ruleLExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // InternalWh.g:1679:1: ruleLExpr returns [EObject current=null] : ( (lv_e1_0_0= ruleExpr ) )+ ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_e1_0_0 = null;



        	enterRule();

        try {
            // InternalWh.g:1685:2: ( ( (lv_e1_0_0= ruleExpr ) )+ )
            // InternalWh.g:1686:2: ( (lv_e1_0_0= ruleExpr ) )+
            {
            // InternalWh.g:1686:2: ( (lv_e1_0_0= ruleExpr ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_SYMBOL && LA17_0<=RULE_VARIABLE)||(LA17_0>=33 && LA17_0<=34)||LA17_0==42) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalWh.g:1687:3: (lv_e1_0_0= ruleExpr )
            	    {
            	    // InternalWh.g:1687:3: (lv_e1_0_0= ruleExpr )
            	    // InternalWh.g:1688:4: lv_e1_0_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLExprAccess().getE1ExprParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_e1_0_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getLExprRule());
            	      				}
            	      				add(
            	      					current,
            	      					"e1",
            	      					lv_e1_0_0,
            	      					"org.xtext.comp.wh.Wh.Expr");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLExpr"

    // $ANTLR start synpred1_InternalWh
    public final void synpred1_InternalWh_fragment() throws RecognitionException {   
        // InternalWh.g:1643:5: ( '(' )
        // InternalWh.g:1643:6: '('
        {
        match(input,34,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalWh

    // Delegated rules

    public final boolean synpred1_InternalWh() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalWh_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000008CA00040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040600000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600000060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040600000062L});

}