package org.xtext.example.index.greetings.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.index.greetings.services.GreetingsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreetingsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "'ref'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalGreetingsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGreetingsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGreetingsParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g"; }



     	private GreetingsGrammarAccess grammarAccess;
     	
        public InternalGreetingsParser(TokenStream input, GreetingsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GreetingsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:79:28: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:82:3: lv_greetings_0_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_0_0, 
            	            		"Greeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:106:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:107:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:108:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); 

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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:115:1: ruleGreeting returns [EObject current=null] : (this_HelloGreeting_0= ruleHelloGreeting | this_RefGreeting_1= ruleRefGreeting ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        EObject this_HelloGreeting_0 = null;

        EObject this_RefGreeting_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:118:28: ( (this_HelloGreeting_0= ruleHelloGreeting | this_RefGreeting_1= ruleRefGreeting ) )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:119:1: (this_HelloGreeting_0= ruleHelloGreeting | this_RefGreeting_1= ruleRefGreeting )
            {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:119:1: (this_HelloGreeting_0= ruleHelloGreeting | this_RefGreeting_1= ruleRefGreeting )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:120:5: this_HelloGreeting_0= ruleHelloGreeting
                    {
                     
                            newCompositeNode(grammarAccess.getGreetingAccess().getHelloGreetingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleHelloGreeting_in_ruleGreeting223);
                    this_HelloGreeting_0=ruleHelloGreeting();

                    state._fsp--;

                     
                            current = this_HelloGreeting_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:130:5: this_RefGreeting_1= ruleRefGreeting
                    {
                     
                            newCompositeNode(grammarAccess.getGreetingAccess().getRefGreetingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRefGreeting_in_ruleGreeting250);
                    this_RefGreeting_1=ruleRefGreeting();

                    state._fsp--;

                     
                            current = this_RefGreeting_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleHelloGreeting"
    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:146:1: entryRuleHelloGreeting returns [EObject current=null] : iv_ruleHelloGreeting= ruleHelloGreeting EOF ;
    public final EObject entryRuleHelloGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelloGreeting = null;


        try {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:147:2: (iv_ruleHelloGreeting= ruleHelloGreeting EOF )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:148:2: iv_ruleHelloGreeting= ruleHelloGreeting EOF
            {
             newCompositeNode(grammarAccess.getHelloGreetingRule()); 
            pushFollow(FOLLOW_ruleHelloGreeting_in_entryRuleHelloGreeting285);
            iv_ruleHelloGreeting=ruleHelloGreeting();

            state._fsp--;

             current =iv_ruleHelloGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHelloGreeting295); 

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
    // $ANTLR end "entryRuleHelloGreeting"


    // $ANTLR start "ruleHelloGreeting"
    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:155:1: ruleHelloGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleHelloGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:158:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:159:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:159:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:159:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleHelloGreeting332); 

                	newLeafNode(otherlv_0, grammarAccess.getHelloGreetingAccess().getHelloKeyword_0());
                
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:163:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:164:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:164:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:165:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHelloGreeting349); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHelloGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHelloGreetingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleHelloGreeting366); 

                	newLeafNode(otherlv_2, grammarAccess.getHelloGreetingAccess().getExclamationMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHelloGreeting"


    // $ANTLR start "entryRuleRefGreeting"
    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:193:1: entryRuleRefGreeting returns [EObject current=null] : iv_ruleRefGreeting= ruleRefGreeting EOF ;
    public final EObject entryRuleRefGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefGreeting = null;


        try {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:194:2: (iv_ruleRefGreeting= ruleRefGreeting EOF )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:195:2: iv_ruleRefGreeting= ruleRefGreeting EOF
            {
             newCompositeNode(grammarAccess.getRefGreetingRule()); 
            pushFollow(FOLLOW_ruleRefGreeting_in_entryRuleRefGreeting402);
            iv_ruleRefGreeting=ruleRefGreeting();

            state._fsp--;

             current =iv_ruleRefGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefGreeting412); 

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
    // $ANTLR end "entryRuleRefGreeting"


    // $ANTLR start "ruleRefGreeting"
    // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:202:1: ruleRefGreeting returns [EObject current=null] : (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRefGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:205:28: ( (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:206:1: (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:206:1: (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:206:3: otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRefGreeting449); 

                	newLeafNode(otherlv_0, grammarAccess.getRefGreetingAccess().getRefKeyword_0());
                
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:210:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:211:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:211:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.index.greetings/src-gen/org/xtext/example/index/greetings/parser/antlr/internal/InternalGreetings.g:212:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefGreetingRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefGreeting469); 

            		newLeafNode(otherlv_1, grammarAccess.getRefGreetingAccess().getGreetingHelloGreetingCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefGreeting"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelloGreeting_in_ruleGreeting223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGreeting_in_ruleGreeting250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelloGreeting_in_entryRuleHelloGreeting285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHelloGreeting295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleHelloGreeting332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHelloGreeting349 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHelloGreeting366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGreeting_in_entryRuleRefGreeting402 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefGreeting412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRefGreeting449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefGreeting469 = new BitSet(new long[]{0x0000000000000002L});

}