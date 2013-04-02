package org.xtext.example.index.greetings.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.index.greetings.services.GreetingsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGreetingsParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g"; }


     
     	private GreetingsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(GreetingsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:89:1: ( ruleGreeting EOF )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:90:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting122);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:97:1: ruleGreeting : ( ( rule__Greeting__Alternatives ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:101:2: ( ( ( rule__Greeting__Alternatives ) ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:102:1: ( ( rule__Greeting__Alternatives ) )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:102:1: ( ( rule__Greeting__Alternatives ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:103:1: ( rule__Greeting__Alternatives )
            {
             before(grammarAccess.getGreetingAccess().getAlternatives()); 
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:104:1: ( rule__Greeting__Alternatives )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:104:2: rule__Greeting__Alternatives
            {
            pushFollow(FOLLOW_rule__Greeting__Alternatives_in_ruleGreeting155);
            rule__Greeting__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleHelloGreeting"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:116:1: entryRuleHelloGreeting : ruleHelloGreeting EOF ;
    public final void entryRuleHelloGreeting() throws RecognitionException {
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:117:1: ( ruleHelloGreeting EOF )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:118:1: ruleHelloGreeting EOF
            {
             before(grammarAccess.getHelloGreetingRule()); 
            pushFollow(FOLLOW_ruleHelloGreeting_in_entryRuleHelloGreeting182);
            ruleHelloGreeting();

            state._fsp--;

             after(grammarAccess.getHelloGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHelloGreeting189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHelloGreeting"


    // $ANTLR start "ruleHelloGreeting"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:125:1: ruleHelloGreeting : ( ( rule__HelloGreeting__Group__0 ) ) ;
    public final void ruleHelloGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:129:2: ( ( ( rule__HelloGreeting__Group__0 ) ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:130:1: ( ( rule__HelloGreeting__Group__0 ) )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:130:1: ( ( rule__HelloGreeting__Group__0 ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:131:1: ( rule__HelloGreeting__Group__0 )
            {
             before(grammarAccess.getHelloGreetingAccess().getGroup()); 
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:132:1: ( rule__HelloGreeting__Group__0 )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:132:2: rule__HelloGreeting__Group__0
            {
            pushFollow(FOLLOW_rule__HelloGreeting__Group__0_in_ruleHelloGreeting215);
            rule__HelloGreeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHelloGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHelloGreeting"


    // $ANTLR start "entryRuleRefGreeting"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:144:1: entryRuleRefGreeting : ruleRefGreeting EOF ;
    public final void entryRuleRefGreeting() throws RecognitionException {
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:145:1: ( ruleRefGreeting EOF )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:146:1: ruleRefGreeting EOF
            {
             before(grammarAccess.getRefGreetingRule()); 
            pushFollow(FOLLOW_ruleRefGreeting_in_entryRuleRefGreeting242);
            ruleRefGreeting();

            state._fsp--;

             after(grammarAccess.getRefGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefGreeting249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefGreeting"


    // $ANTLR start "ruleRefGreeting"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:153:1: ruleRefGreeting : ( ( rule__RefGreeting__Group__0 ) ) ;
    public final void ruleRefGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:157:2: ( ( ( rule__RefGreeting__Group__0 ) ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:158:1: ( ( rule__RefGreeting__Group__0 ) )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:158:1: ( ( rule__RefGreeting__Group__0 ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:159:1: ( rule__RefGreeting__Group__0 )
            {
             before(grammarAccess.getRefGreetingAccess().getGroup()); 
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:160:1: ( rule__RefGreeting__Group__0 )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:160:2: rule__RefGreeting__Group__0
            {
            pushFollow(FOLLOW_rule__RefGreeting__Group__0_in_ruleRefGreeting275);
            rule__RefGreeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefGreeting"


    // $ANTLR start "rule__Greeting__Alternatives"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:172:1: rule__Greeting__Alternatives : ( ( ruleHelloGreeting ) | ( ruleRefGreeting ) );
    public final void rule__Greeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:176:1: ( ( ruleHelloGreeting ) | ( ruleRefGreeting ) )
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
                    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:177:1: ( ruleHelloGreeting )
                    {
                    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:177:1: ( ruleHelloGreeting )
                    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:178:1: ruleHelloGreeting
                    {
                     before(grammarAccess.getGreetingAccess().getHelloGreetingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHelloGreeting_in_rule__Greeting__Alternatives311);
                    ruleHelloGreeting();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getHelloGreetingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:183:6: ( ruleRefGreeting )
                    {
                    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:183:6: ( ruleRefGreeting )
                    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:184:1: ruleRefGreeting
                    {
                     before(grammarAccess.getGreetingAccess().getRefGreetingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRefGreeting_in_rule__Greeting__Alternatives328);
                    ruleRefGreeting();

                    state._fsp--;

                     after(grammarAccess.getGreetingAccess().getRefGreetingParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Alternatives"


    // $ANTLR start "rule__HelloGreeting__Group__0"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:196:1: rule__HelloGreeting__Group__0 : rule__HelloGreeting__Group__0__Impl rule__HelloGreeting__Group__1 ;
    public final void rule__HelloGreeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:200:1: ( rule__HelloGreeting__Group__0__Impl rule__HelloGreeting__Group__1 )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:201:2: rule__HelloGreeting__Group__0__Impl rule__HelloGreeting__Group__1
            {
            pushFollow(FOLLOW_rule__HelloGreeting__Group__0__Impl_in_rule__HelloGreeting__Group__0358);
            rule__HelloGreeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HelloGreeting__Group__1_in_rule__HelloGreeting__Group__0361);
            rule__HelloGreeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelloGreeting__Group__0"


    // $ANTLR start "rule__HelloGreeting__Group__0__Impl"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:208:1: rule__HelloGreeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__HelloGreeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:212:1: ( ( 'Hello' ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:213:1: ( 'Hello' )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:213:1: ( 'Hello' )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:214:1: 'Hello'
            {
             before(grammarAccess.getHelloGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__HelloGreeting__Group__0__Impl389); 
             after(grammarAccess.getHelloGreetingAccess().getHelloKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelloGreeting__Group__0__Impl"


    // $ANTLR start "rule__HelloGreeting__Group__1"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:227:1: rule__HelloGreeting__Group__1 : rule__HelloGreeting__Group__1__Impl rule__HelloGreeting__Group__2 ;
    public final void rule__HelloGreeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:231:1: ( rule__HelloGreeting__Group__1__Impl rule__HelloGreeting__Group__2 )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:232:2: rule__HelloGreeting__Group__1__Impl rule__HelloGreeting__Group__2
            {
            pushFollow(FOLLOW_rule__HelloGreeting__Group__1__Impl_in_rule__HelloGreeting__Group__1420);
            rule__HelloGreeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HelloGreeting__Group__2_in_rule__HelloGreeting__Group__1423);
            rule__HelloGreeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelloGreeting__Group__1"


    // $ANTLR start "rule__HelloGreeting__Group__1__Impl"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:239:1: rule__HelloGreeting__Group__1__Impl : ( ( rule__HelloGreeting__NameAssignment_1 ) ) ;
    public final void rule__HelloGreeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:243:1: ( ( ( rule__HelloGreeting__NameAssignment_1 ) ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:244:1: ( ( rule__HelloGreeting__NameAssignment_1 ) )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:244:1: ( ( rule__HelloGreeting__NameAssignment_1 ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:245:1: ( rule__HelloGreeting__NameAssignment_1 )
            {
             before(grammarAccess.getHelloGreetingAccess().getNameAssignment_1()); 
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:246:1: ( rule__HelloGreeting__NameAssignment_1 )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:246:2: rule__HelloGreeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__HelloGreeting__NameAssignment_1_in_rule__HelloGreeting__Group__1__Impl450);
            rule__HelloGreeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHelloGreetingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelloGreeting__Group__1__Impl"


    // $ANTLR start "rule__HelloGreeting__Group__2"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:256:1: rule__HelloGreeting__Group__2 : rule__HelloGreeting__Group__2__Impl ;
    public final void rule__HelloGreeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:260:1: ( rule__HelloGreeting__Group__2__Impl )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:261:2: rule__HelloGreeting__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HelloGreeting__Group__2__Impl_in_rule__HelloGreeting__Group__2480);
            rule__HelloGreeting__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelloGreeting__Group__2"


    // $ANTLR start "rule__HelloGreeting__Group__2__Impl"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:267:1: rule__HelloGreeting__Group__2__Impl : ( '!' ) ;
    public final void rule__HelloGreeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:271:1: ( ( '!' ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:272:1: ( '!' )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:272:1: ( '!' )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:273:1: '!'
            {
             before(grammarAccess.getHelloGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__HelloGreeting__Group__2__Impl508); 
             after(grammarAccess.getHelloGreetingAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelloGreeting__Group__2__Impl"


    // $ANTLR start "rule__RefGreeting__Group__0"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:292:1: rule__RefGreeting__Group__0 : rule__RefGreeting__Group__0__Impl rule__RefGreeting__Group__1 ;
    public final void rule__RefGreeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:296:1: ( rule__RefGreeting__Group__0__Impl rule__RefGreeting__Group__1 )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:297:2: rule__RefGreeting__Group__0__Impl rule__RefGreeting__Group__1
            {
            pushFollow(FOLLOW_rule__RefGreeting__Group__0__Impl_in_rule__RefGreeting__Group__0545);
            rule__RefGreeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RefGreeting__Group__1_in_rule__RefGreeting__Group__0548);
            rule__RefGreeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefGreeting__Group__0"


    // $ANTLR start "rule__RefGreeting__Group__0__Impl"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:304:1: rule__RefGreeting__Group__0__Impl : ( 'ref' ) ;
    public final void rule__RefGreeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:308:1: ( ( 'ref' ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:309:1: ( 'ref' )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:309:1: ( 'ref' )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:310:1: 'ref'
            {
             before(grammarAccess.getRefGreetingAccess().getRefKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__RefGreeting__Group__0__Impl576); 
             after(grammarAccess.getRefGreetingAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefGreeting__Group__0__Impl"


    // $ANTLR start "rule__RefGreeting__Group__1"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:323:1: rule__RefGreeting__Group__1 : rule__RefGreeting__Group__1__Impl ;
    public final void rule__RefGreeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:327:1: ( rule__RefGreeting__Group__1__Impl )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:328:2: rule__RefGreeting__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RefGreeting__Group__1__Impl_in_rule__RefGreeting__Group__1607);
            rule__RefGreeting__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefGreeting__Group__1"


    // $ANTLR start "rule__RefGreeting__Group__1__Impl"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:334:1: rule__RefGreeting__Group__1__Impl : ( ( rule__RefGreeting__GreetingAssignment_1 ) ) ;
    public final void rule__RefGreeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:338:1: ( ( ( rule__RefGreeting__GreetingAssignment_1 ) ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:339:1: ( ( rule__RefGreeting__GreetingAssignment_1 ) )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:339:1: ( ( rule__RefGreeting__GreetingAssignment_1 ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:340:1: ( rule__RefGreeting__GreetingAssignment_1 )
            {
             before(grammarAccess.getRefGreetingAccess().getGreetingAssignment_1()); 
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:341:1: ( rule__RefGreeting__GreetingAssignment_1 )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:341:2: rule__RefGreeting__GreetingAssignment_1
            {
            pushFollow(FOLLOW_rule__RefGreeting__GreetingAssignment_1_in_rule__RefGreeting__Group__1__Impl634);
            rule__RefGreeting__GreetingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRefGreetingAccess().getGreetingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefGreeting__Group__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:356:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:360:1: ( ( ruleGreeting ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:361:1: ( ruleGreeting )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:361:1: ( ruleGreeting )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:362:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment673);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__HelloGreeting__NameAssignment_1"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:371:1: rule__HelloGreeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HelloGreeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:375:1: ( ( RULE_ID ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:376:1: ( RULE_ID )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:376:1: ( RULE_ID )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:377:1: RULE_ID
            {
             before(grammarAccess.getHelloGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelloGreeting__NameAssignment_1704); 
             after(grammarAccess.getHelloGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelloGreeting__NameAssignment_1"


    // $ANTLR start "rule__RefGreeting__GreetingAssignment_1"
    // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:386:1: rule__RefGreeting__GreetingAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RefGreeting__GreetingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:390:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:391:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:391:1: ( ( RULE_ID ) )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:392:1: ( RULE_ID )
            {
             before(grammarAccess.getRefGreetingAccess().getGreetingHelloGreetingCrossReference_1_0()); 
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:393:1: ( RULE_ID )
            // ../org.xtext.example.index.greetings.ui/src-gen/org/xtext/example/index/greetings/ui/contentassist/antlr/internal/InternalGreetings.g:394:1: RULE_ID
            {
             before(grammarAccess.getRefGreetingAccess().getGreetingHelloGreetingIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RefGreeting__GreetingAssignment_1739); 
             after(grammarAccess.getRefGreetingAccess().getGreetingHelloGreetingIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRefGreetingAccess().getGreetingHelloGreetingCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefGreeting__GreetingAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Alternatives_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelloGreeting_in_entryRuleHelloGreeting182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHelloGreeting189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelloGreeting__Group__0_in_ruleHelloGreeting215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGreeting_in_entryRuleRefGreeting242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefGreeting249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefGreeting__Group__0_in_ruleRefGreeting275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelloGreeting_in_rule__Greeting__Alternatives311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefGreeting_in_rule__Greeting__Alternatives328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelloGreeting__Group__0__Impl_in_rule__HelloGreeting__Group__0358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HelloGreeting__Group__1_in_rule__HelloGreeting__Group__0361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__HelloGreeting__Group__0__Impl389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelloGreeting__Group__1__Impl_in_rule__HelloGreeting__Group__1420 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__HelloGreeting__Group__2_in_rule__HelloGreeting__Group__1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelloGreeting__NameAssignment_1_in_rule__HelloGreeting__Group__1__Impl450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelloGreeting__Group__2__Impl_in_rule__HelloGreeting__Group__2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__HelloGreeting__Group__2__Impl508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefGreeting__Group__0__Impl_in_rule__RefGreeting__Group__0545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RefGreeting__Group__1_in_rule__RefGreeting__Group__0548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RefGreeting__Group__0__Impl576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefGreeting__Group__1__Impl_in_rule__RefGreeting__Group__1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RefGreeting__GreetingAssignment_1_in_rule__RefGreeting__Group__1__Impl634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelloGreeting__NameAssignment_1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RefGreeting__GreetingAssignment_1739 = new BitSet(new long[]{0x0000000000000002L});

}