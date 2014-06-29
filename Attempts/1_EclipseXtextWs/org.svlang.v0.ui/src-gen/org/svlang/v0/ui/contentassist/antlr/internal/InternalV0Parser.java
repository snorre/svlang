package org.svlang.v0.ui.contentassist.antlr.internal; 

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
import org.svlang.v0.services.V0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalV0Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main {'", "'}'", "'fun '", "':'", "' {'", "' = '", "'()'", "'int'", "'string'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalV0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalV0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalV0Parser.tokenNames; }
    public String getGrammarFileName() { return "../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g"; }


     
     	private V0GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(V0GrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDomainmodel"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:60:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:61:1: ( ruleDomainmodel EOF )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:62:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel61);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel68); 

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:69:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:73:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:74:1: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:74:1: ( ( rule__Domainmodel__ElementsAssignment )* )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:75:1: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:76:1: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:76:2: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Domainmodel__ElementsAssignment_in_ruleDomainmodel94);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleRootElement"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:88:1: entryRuleRootElement : ruleRootElement EOF ;
    public final void entryRuleRootElement() throws RecognitionException {
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:89:1: ( ruleRootElement EOF )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:90:1: ruleRootElement EOF
            {
             before(grammarAccess.getRootElementRule()); 
            pushFollow(FOLLOW_ruleRootElement_in_entryRuleRootElement122);
            ruleRootElement();

            state._fsp--;

             after(grammarAccess.getRootElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootElement129); 

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
    // $ANTLR end "entryRuleRootElement"


    // $ANTLR start "ruleRootElement"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:97:1: ruleRootElement : ( ( rule__RootElement__Group__0 ) ) ;
    public final void ruleRootElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:101:2: ( ( ( rule__RootElement__Group__0 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:102:1: ( ( rule__RootElement__Group__0 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:102:1: ( ( rule__RootElement__Group__0 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:103:1: ( rule__RootElement__Group__0 )
            {
             before(grammarAccess.getRootElementAccess().getGroup()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:104:1: ( rule__RootElement__Group__0 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:104:2: rule__RootElement__Group__0
            {
            pushFollow(FOLLOW_rule__RootElement__Group__0_in_ruleRootElement155);
            rule__RootElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootElementAccess().getGroup()); 

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
    // $ANTLR end "ruleRootElement"


    // $ANTLR start "entryRuleMain"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:116:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:117:1: ( ruleMain EOF )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:118:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain182);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain189); 

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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:125:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:129:2: ( ( ( rule__Main__Group__0 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:130:1: ( ( rule__Main__Group__0 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:130:1: ( ( rule__Main__Group__0 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:131:1: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:132:1: ( rule__Main__Group__0 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:132:2: rule__Main__Group__0
            {
            pushFollow(FOLLOW_rule__Main__Group__0_in_ruleMain215);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleFun"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:144:1: entryRuleFun : ruleFun EOF ;
    public final void entryRuleFun() throws RecognitionException {
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:145:1: ( ruleFun EOF )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:146:1: ruleFun EOF
            {
             before(grammarAccess.getFunRule()); 
            pushFollow(FOLLOW_ruleFun_in_entryRuleFun242);
            ruleFun();

            state._fsp--;

             after(grammarAccess.getFunRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFun249); 

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
    // $ANTLR end "entryRuleFun"


    // $ANTLR start "ruleFun"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:153:1: ruleFun : ( ( rule__Fun__Group__0 ) ) ;
    public final void ruleFun() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:157:2: ( ( ( rule__Fun__Group__0 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:158:1: ( ( rule__Fun__Group__0 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:158:1: ( ( rule__Fun__Group__0 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:159:1: ( rule__Fun__Group__0 )
            {
             before(grammarAccess.getFunAccess().getGroup()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:160:1: ( rule__Fun__Group__0 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:160:2: rule__Fun__Group__0
            {
            pushFollow(FOLLOW_rule__Fun__Group__0_in_ruleFun275);
            rule__Fun__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunAccess().getGroup()); 

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
    // $ANTLR end "ruleFun"


    // $ANTLR start "entryRuleExpression"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:172:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:173:1: ( ruleExpression EOF )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:174:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression302);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression309); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:181:1: ruleExpression : ( ruleAssignment ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:185:2: ( ( ruleAssignment ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:186:1: ( ruleAssignment )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:186:1: ( ruleAssignment )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:187:1: ruleAssignment
            {
             before(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
            pushFollow(FOLLOW_ruleAssignment_in_ruleExpression335);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:200:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:201:1: ( ruleAssignment EOF )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:202:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment361);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment368); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:209:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:213:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:214:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:214:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:215:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:216:1: ( rule__Assignment__Group__0 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:216:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment394);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAtomic"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:228:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:229:1: ( ruleAtomic EOF )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:230:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic421);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic428); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:237:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:241:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:242:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:242:1: ( ( rule__Atomic__Alternatives ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:243:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:244:1: ( rule__Atomic__Alternatives )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:244:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic454);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleMyIntType"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:258:1: entryRuleMyIntType : ruleMyIntType EOF ;
    public final void entryRuleMyIntType() throws RecognitionException {
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:259:1: ( ruleMyIntType EOF )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:260:1: ruleMyIntType EOF
            {
             before(grammarAccess.getMyIntTypeRule()); 
            pushFollow(FOLLOW_ruleMyIntType_in_entryRuleMyIntType483);
            ruleMyIntType();

            state._fsp--;

             after(grammarAccess.getMyIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyIntType490); 

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
    // $ANTLR end "entryRuleMyIntType"


    // $ANTLR start "ruleMyIntType"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:267:1: ruleMyIntType : ( ( rule__MyIntType__Group__0 ) ) ;
    public final void ruleMyIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:271:2: ( ( ( rule__MyIntType__Group__0 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:272:1: ( ( rule__MyIntType__Group__0 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:272:1: ( ( rule__MyIntType__Group__0 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:273:1: ( rule__MyIntType__Group__0 )
            {
             before(grammarAccess.getMyIntTypeAccess().getGroup()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:274:1: ( rule__MyIntType__Group__0 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:274:2: rule__MyIntType__Group__0
            {
            pushFollow(FOLLOW_rule__MyIntType__Group__0_in_ruleMyIntType516);
            rule__MyIntType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyIntTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleMyIntType"


    // $ANTLR start "entryRuleMyStringType"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:286:1: entryRuleMyStringType : ruleMyStringType EOF ;
    public final void entryRuleMyStringType() throws RecognitionException {
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:287:1: ( ruleMyStringType EOF )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:288:1: ruleMyStringType EOF
            {
             before(grammarAccess.getMyStringTypeRule()); 
            pushFollow(FOLLOW_ruleMyStringType_in_entryRuleMyStringType543);
            ruleMyStringType();

            state._fsp--;

             after(grammarAccess.getMyStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyStringType550); 

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
    // $ANTLR end "entryRuleMyStringType"


    // $ANTLR start "ruleMyStringType"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:295:1: ruleMyStringType : ( ( rule__MyStringType__Group__0 ) ) ;
    public final void ruleMyStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:299:2: ( ( ( rule__MyStringType__Group__0 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:300:1: ( ( rule__MyStringType__Group__0 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:300:1: ( ( rule__MyStringType__Group__0 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:301:1: ( rule__MyStringType__Group__0 )
            {
             before(grammarAccess.getMyStringTypeAccess().getGroup()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:302:1: ( rule__MyStringType__Group__0 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:302:2: rule__MyStringType__Group__0
            {
            pushFollow(FOLLOW_rule__MyStringType__Group__0_in_ruleMyStringType576);
            rule__MyStringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMyStringTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleMyStringType"


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:314:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:318:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==17) ) {
                    alt2=4;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==12) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:319:1: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:319:1: ( ( rule__Atomic__Group_0__0 ) )
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:320:1: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:321:1: ( rule__Atomic__Group_0__0 )
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:321:2: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives612);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:325:6: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:325:6: ( ( rule__Atomic__Group_1__0 ) )
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:326:1: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:327:1: ( rule__Atomic__Group_1__0 )
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:327:2: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives630);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:331:6: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:331:6: ( ( rule__Atomic__Group_2__0 ) )
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:332:1: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:333:1: ( rule__Atomic__Group_2__0 )
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:333:2: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives648);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:337:6: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:337:6: ( ( rule__Atomic__Group_3__0 ) )
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:338:1: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:339:1: ( rule__Atomic__Group_3__0 )
                    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:339:2: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives666);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__RootElement__Group__0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:351:1: rule__RootElement__Group__0 : rule__RootElement__Group__0__Impl rule__RootElement__Group__1 ;
    public final void rule__RootElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:355:1: ( rule__RootElement__Group__0__Impl rule__RootElement__Group__1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:356:2: rule__RootElement__Group__0__Impl rule__RootElement__Group__1
            {
            pushFollow(FOLLOW_rule__RootElement__Group__0__Impl_in_rule__RootElement__Group__0698);
            rule__RootElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RootElement__Group__1_in_rule__RootElement__Group__0701);
            rule__RootElement__Group__1();

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
    // $ANTLR end "rule__RootElement__Group__0"


    // $ANTLR start "rule__RootElement__Group__0__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:363:1: rule__RootElement__Group__0__Impl : ( ( rule__RootElement__MainAssignment_0 ) ) ;
    public final void rule__RootElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:367:1: ( ( ( rule__RootElement__MainAssignment_0 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:368:1: ( ( rule__RootElement__MainAssignment_0 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:368:1: ( ( rule__RootElement__MainAssignment_0 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:369:1: ( rule__RootElement__MainAssignment_0 )
            {
             before(grammarAccess.getRootElementAccess().getMainAssignment_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:370:1: ( rule__RootElement__MainAssignment_0 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:370:2: rule__RootElement__MainAssignment_0
            {
            pushFollow(FOLLOW_rule__RootElement__MainAssignment_0_in_rule__RootElement__Group__0__Impl728);
            rule__RootElement__MainAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRootElementAccess().getMainAssignment_0()); 

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
    // $ANTLR end "rule__RootElement__Group__0__Impl"


    // $ANTLR start "rule__RootElement__Group__1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:380:1: rule__RootElement__Group__1 : rule__RootElement__Group__1__Impl ;
    public final void rule__RootElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:384:1: ( rule__RootElement__Group__1__Impl )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:385:2: rule__RootElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RootElement__Group__1__Impl_in_rule__RootElement__Group__1758);
            rule__RootElement__Group__1__Impl();

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
    // $ANTLR end "rule__RootElement__Group__1"


    // $ANTLR start "rule__RootElement__Group__1__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:391:1: rule__RootElement__Group__1__Impl : ( ( rule__RootElement__FunsAssignment_1 )* ) ;
    public final void rule__RootElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:395:1: ( ( ( rule__RootElement__FunsAssignment_1 )* ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:396:1: ( ( rule__RootElement__FunsAssignment_1 )* )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:396:1: ( ( rule__RootElement__FunsAssignment_1 )* )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:397:1: ( rule__RootElement__FunsAssignment_1 )*
            {
             before(grammarAccess.getRootElementAccess().getFunsAssignment_1()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:398:1: ( rule__RootElement__FunsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:398:2: rule__RootElement__FunsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__RootElement__FunsAssignment_1_in_rule__RootElement__Group__1__Impl785);
            	    rule__RootElement__FunsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRootElementAccess().getFunsAssignment_1()); 

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
    // $ANTLR end "rule__RootElement__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:412:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:416:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:417:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__0820);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__1_in_rule__Main__Group__0823);
            rule__Main__Group__1();

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
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:424:1: rule__Main__Group__0__Impl : ( 'main {' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:428:1: ( ( 'main {' ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:429:1: ( 'main {' )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:429:1: ( 'main {' )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:430:1: 'main {'
            {
             before(grammarAccess.getMainAccess().getMainKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Main__Group__0__Impl851); 
             after(grammarAccess.getMainAccess().getMainKeyword_0()); 

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
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:443:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:447:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:448:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__1882);
            rule__Main__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__2_in_rule__Main__Group__1885);
            rule__Main__Group__2();

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
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:455:1: rule__Main__Group__1__Impl : ( ( ( rule__Main__ExpressionsAssignment_1 ) ) ( ( rule__Main__ExpressionsAssignment_1 )* ) ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:459:1: ( ( ( ( rule__Main__ExpressionsAssignment_1 ) ) ( ( rule__Main__ExpressionsAssignment_1 )* ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:460:1: ( ( ( rule__Main__ExpressionsAssignment_1 ) ) ( ( rule__Main__ExpressionsAssignment_1 )* ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:460:1: ( ( ( rule__Main__ExpressionsAssignment_1 ) ) ( ( rule__Main__ExpressionsAssignment_1 )* ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:461:1: ( ( rule__Main__ExpressionsAssignment_1 ) ) ( ( rule__Main__ExpressionsAssignment_1 )* )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:461:1: ( ( rule__Main__ExpressionsAssignment_1 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:462:1: ( rule__Main__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getMainAccess().getExpressionsAssignment_1()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:463:1: ( rule__Main__ExpressionsAssignment_1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:463:2: rule__Main__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__Main__ExpressionsAssignment_1_in_rule__Main__Group__1__Impl914);
            rule__Main__ExpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getExpressionsAssignment_1()); 

            }

            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:466:1: ( ( rule__Main__ExpressionsAssignment_1 )* )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:467:1: ( rule__Main__ExpressionsAssignment_1 )*
            {
             before(grammarAccess.getMainAccess().getExpressionsAssignment_1()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:468:1: ( rule__Main__ExpressionsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:468:2: rule__Main__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Main__ExpressionsAssignment_1_in_rule__Main__Group__1__Impl926);
            	    rule__Main__ExpressionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getExpressionsAssignment_1()); 

            }


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
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__2"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:479:1: rule__Main__Group__2 : rule__Main__Group__2__Impl ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:483:1: ( rule__Main__Group__2__Impl )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:484:2: rule__Main__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__2959);
            rule__Main__Group__2__Impl();

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
    // $ANTLR end "rule__Main__Group__2"


    // $ANTLR start "rule__Main__Group__2__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:490:1: rule__Main__Group__2__Impl : ( '}' ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:494:1: ( ( '}' ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:495:1: ( '}' )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:495:1: ( '}' )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:496:1: '}'
            {
             before(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Main__Group__2__Impl987); 
             after(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Main__Group__2__Impl"


    // $ANTLR start "rule__Fun__Group__0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:515:1: rule__Fun__Group__0 : rule__Fun__Group__0__Impl rule__Fun__Group__1 ;
    public final void rule__Fun__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:519:1: ( rule__Fun__Group__0__Impl rule__Fun__Group__1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:520:2: rule__Fun__Group__0__Impl rule__Fun__Group__1
            {
            pushFollow(FOLLOW_rule__Fun__Group__0__Impl_in_rule__Fun__Group__01024);
            rule__Fun__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fun__Group__1_in_rule__Fun__Group__01027);
            rule__Fun__Group__1();

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
    // $ANTLR end "rule__Fun__Group__0"


    // $ANTLR start "rule__Fun__Group__0__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:527:1: rule__Fun__Group__0__Impl : ( () ) ;
    public final void rule__Fun__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:531:1: ( ( () ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:532:1: ( () )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:532:1: ( () )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:533:1: ()
            {
             before(grammarAccess.getFunAccess().getFunAction_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:534:1: ()
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:536:1: 
            {
            }

             after(grammarAccess.getFunAccess().getFunAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fun__Group__0__Impl"


    // $ANTLR start "rule__Fun__Group__1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:546:1: rule__Fun__Group__1 : rule__Fun__Group__1__Impl rule__Fun__Group__2 ;
    public final void rule__Fun__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:550:1: ( rule__Fun__Group__1__Impl rule__Fun__Group__2 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:551:2: rule__Fun__Group__1__Impl rule__Fun__Group__2
            {
            pushFollow(FOLLOW_rule__Fun__Group__1__Impl_in_rule__Fun__Group__11085);
            rule__Fun__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fun__Group__2_in_rule__Fun__Group__11088);
            rule__Fun__Group__2();

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
    // $ANTLR end "rule__Fun__Group__1"


    // $ANTLR start "rule__Fun__Group__1__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:558:1: rule__Fun__Group__1__Impl : ( 'fun ' ) ;
    public final void rule__Fun__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:562:1: ( ( 'fun ' ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:563:1: ( 'fun ' )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:563:1: ( 'fun ' )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:564:1: 'fun '
            {
             before(grammarAccess.getFunAccess().getFunKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Fun__Group__1__Impl1116); 
             after(grammarAccess.getFunAccess().getFunKeyword_1()); 

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
    // $ANTLR end "rule__Fun__Group__1__Impl"


    // $ANTLR start "rule__Fun__Group__2"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:577:1: rule__Fun__Group__2 : rule__Fun__Group__2__Impl rule__Fun__Group__3 ;
    public final void rule__Fun__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:581:1: ( rule__Fun__Group__2__Impl rule__Fun__Group__3 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:582:2: rule__Fun__Group__2__Impl rule__Fun__Group__3
            {
            pushFollow(FOLLOW_rule__Fun__Group__2__Impl_in_rule__Fun__Group__21147);
            rule__Fun__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fun__Group__3_in_rule__Fun__Group__21150);
            rule__Fun__Group__3();

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
    // $ANTLR end "rule__Fun__Group__2"


    // $ANTLR start "rule__Fun__Group__2__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:589:1: rule__Fun__Group__2__Impl : ( ( rule__Fun__NameAssignment_2 ) ) ;
    public final void rule__Fun__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:593:1: ( ( ( rule__Fun__NameAssignment_2 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:594:1: ( ( rule__Fun__NameAssignment_2 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:594:1: ( ( rule__Fun__NameAssignment_2 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:595:1: ( rule__Fun__NameAssignment_2 )
            {
             before(grammarAccess.getFunAccess().getNameAssignment_2()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:596:1: ( rule__Fun__NameAssignment_2 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:596:2: rule__Fun__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Fun__NameAssignment_2_in_rule__Fun__Group__2__Impl1177);
            rule__Fun__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Fun__Group__2__Impl"


    // $ANTLR start "rule__Fun__Group__3"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:606:1: rule__Fun__Group__3 : rule__Fun__Group__3__Impl rule__Fun__Group__4 ;
    public final void rule__Fun__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:610:1: ( rule__Fun__Group__3__Impl rule__Fun__Group__4 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:611:2: rule__Fun__Group__3__Impl rule__Fun__Group__4
            {
            pushFollow(FOLLOW_rule__Fun__Group__3__Impl_in_rule__Fun__Group__31207);
            rule__Fun__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fun__Group__4_in_rule__Fun__Group__31210);
            rule__Fun__Group__4();

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
    // $ANTLR end "rule__Fun__Group__3"


    // $ANTLR start "rule__Fun__Group__3__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:618:1: rule__Fun__Group__3__Impl : ( ':' ) ;
    public final void rule__Fun__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:622:1: ( ( ':' ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:623:1: ( ':' )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:623:1: ( ':' )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:624:1: ':'
            {
             before(grammarAccess.getFunAccess().getColonKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Fun__Group__3__Impl1238); 
             after(grammarAccess.getFunAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Fun__Group__3__Impl"


    // $ANTLR start "rule__Fun__Group__4"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:637:1: rule__Fun__Group__4 : rule__Fun__Group__4__Impl rule__Fun__Group__5 ;
    public final void rule__Fun__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:641:1: ( rule__Fun__Group__4__Impl rule__Fun__Group__5 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:642:2: rule__Fun__Group__4__Impl rule__Fun__Group__5
            {
            pushFollow(FOLLOW_rule__Fun__Group__4__Impl_in_rule__Fun__Group__41269);
            rule__Fun__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fun__Group__5_in_rule__Fun__Group__41272);
            rule__Fun__Group__5();

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
    // $ANTLR end "rule__Fun__Group__4"


    // $ANTLR start "rule__Fun__Group__4__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:649:1: rule__Fun__Group__4__Impl : ( ( rule__Fun__ReturnTypeAssignment_4 ) ) ;
    public final void rule__Fun__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:653:1: ( ( ( rule__Fun__ReturnTypeAssignment_4 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:654:1: ( ( rule__Fun__ReturnTypeAssignment_4 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:654:1: ( ( rule__Fun__ReturnTypeAssignment_4 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:655:1: ( rule__Fun__ReturnTypeAssignment_4 )
            {
             before(grammarAccess.getFunAccess().getReturnTypeAssignment_4()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:656:1: ( rule__Fun__ReturnTypeAssignment_4 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:656:2: rule__Fun__ReturnTypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Fun__ReturnTypeAssignment_4_in_rule__Fun__Group__4__Impl1299);
            rule__Fun__ReturnTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFunAccess().getReturnTypeAssignment_4()); 

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
    // $ANTLR end "rule__Fun__Group__4__Impl"


    // $ANTLR start "rule__Fun__Group__5"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:666:1: rule__Fun__Group__5 : rule__Fun__Group__5__Impl rule__Fun__Group__6 ;
    public final void rule__Fun__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:670:1: ( rule__Fun__Group__5__Impl rule__Fun__Group__6 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:671:2: rule__Fun__Group__5__Impl rule__Fun__Group__6
            {
            pushFollow(FOLLOW_rule__Fun__Group__5__Impl_in_rule__Fun__Group__51329);
            rule__Fun__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fun__Group__6_in_rule__Fun__Group__51332);
            rule__Fun__Group__6();

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
    // $ANTLR end "rule__Fun__Group__5"


    // $ANTLR start "rule__Fun__Group__5__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:678:1: rule__Fun__Group__5__Impl : ( ' {' ) ;
    public final void rule__Fun__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:682:1: ( ( ' {' ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:683:1: ( ' {' )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:683:1: ( ' {' )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:684:1: ' {'
            {
             before(grammarAccess.getFunAccess().getSpaceLeftCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Fun__Group__5__Impl1360); 
             after(grammarAccess.getFunAccess().getSpaceLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Fun__Group__5__Impl"


    // $ANTLR start "rule__Fun__Group__6"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:697:1: rule__Fun__Group__6 : rule__Fun__Group__6__Impl rule__Fun__Group__7 ;
    public final void rule__Fun__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:701:1: ( rule__Fun__Group__6__Impl rule__Fun__Group__7 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:702:2: rule__Fun__Group__6__Impl rule__Fun__Group__7
            {
            pushFollow(FOLLOW_rule__Fun__Group__6__Impl_in_rule__Fun__Group__61391);
            rule__Fun__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fun__Group__7_in_rule__Fun__Group__61394);
            rule__Fun__Group__7();

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
    // $ANTLR end "rule__Fun__Group__6"


    // $ANTLR start "rule__Fun__Group__6__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:709:1: rule__Fun__Group__6__Impl : ( ( rule__Fun__ExpressionsAssignment_6 )* ) ;
    public final void rule__Fun__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:713:1: ( ( ( rule__Fun__ExpressionsAssignment_6 )* ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:714:1: ( ( rule__Fun__ExpressionsAssignment_6 )* )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:714:1: ( ( rule__Fun__ExpressionsAssignment_6 )* )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:715:1: ( rule__Fun__ExpressionsAssignment_6 )*
            {
             before(grammarAccess.getFunAccess().getExpressionsAssignment_6()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:716:1: ( rule__Fun__ExpressionsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:716:2: rule__Fun__ExpressionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Fun__ExpressionsAssignment_6_in_rule__Fun__Group__6__Impl1421);
            	    rule__Fun__ExpressionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFunAccess().getExpressionsAssignment_6()); 

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
    // $ANTLR end "rule__Fun__Group__6__Impl"


    // $ANTLR start "rule__Fun__Group__7"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:726:1: rule__Fun__Group__7 : rule__Fun__Group__7__Impl ;
    public final void rule__Fun__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:730:1: ( rule__Fun__Group__7__Impl )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:731:2: rule__Fun__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Fun__Group__7__Impl_in_rule__Fun__Group__71452);
            rule__Fun__Group__7__Impl();

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
    // $ANTLR end "rule__Fun__Group__7"


    // $ANTLR start "rule__Fun__Group__7__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:737:1: rule__Fun__Group__7__Impl : ( '}' ) ;
    public final void rule__Fun__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:741:1: ( ( '}' ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:742:1: ( '}' )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:742:1: ( '}' )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:743:1: '}'
            {
             before(grammarAccess.getFunAccess().getRightCurlyBracketKeyword_7()); 
            match(input,12,FOLLOW_12_in_rule__Fun__Group__7__Impl1480); 
             after(grammarAccess.getFunAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Fun__Group__7__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:772:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:776:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:777:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__01527);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__01530);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:784:1: rule__Assignment__Group__0__Impl : ( () ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:788:1: ( ( () ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:789:1: ( () )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:789:1: ( () )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:790:1: ()
            {
             before(grammarAccess.getAssignmentAccess().getAssignmentAction_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:791:1: ()
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:793:1: 
            {
            }

             after(grammarAccess.getAssignmentAccess().getAssignmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:803:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:807:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:808:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__11588);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__11591);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:815:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__TypeAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:819:1: ( ( ( rule__Assignment__TypeAssignment_1 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:820:1: ( ( rule__Assignment__TypeAssignment_1 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:820:1: ( ( rule__Assignment__TypeAssignment_1 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:821:1: ( rule__Assignment__TypeAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getTypeAssignment_1()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:822:1: ( rule__Assignment__TypeAssignment_1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:822:2: rule__Assignment__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Assignment__TypeAssignment_1_in_rule__Assignment__Group__1__Impl1618);
            rule__Assignment__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:832:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:836:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:837:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__21648);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__21651);
            rule__Assignment__Group__3();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:844:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__NameAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:848:1: ( ( ( rule__Assignment__NameAssignment_2 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:849:1: ( ( rule__Assignment__NameAssignment_2 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:849:1: ( ( rule__Assignment__NameAssignment_2 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:850:1: ( rule__Assignment__NameAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getNameAssignment_2()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:851:1: ( rule__Assignment__NameAssignment_2 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:851:2: rule__Assignment__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__NameAssignment_2_in_rule__Assignment__Group__2__Impl1678);
            rule__Assignment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:861:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:865:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:866:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__31708);
            rule__Assignment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__31711);
            rule__Assignment__Group__4();

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
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:873:1: rule__Assignment__Group__3__Impl : ( ' = ' ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:877:1: ( ( ' = ' ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:878:1: ( ' = ' )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:878:1: ( ' = ' )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:879:1: ' = '
            {
             before(grammarAccess.getAssignmentAccess().getSpaceEqualsSignSpaceKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__Assignment__Group__3__Impl1739); 
             after(grammarAccess.getAssignmentAccess().getSpaceEqualsSignSpaceKeyword_3()); 

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
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group__4"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:892:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:896:1: ( rule__Assignment__Group__4__Impl )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:897:2: rule__Assignment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__41770);
            rule__Assignment__Group__4__Impl();

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
    // $ANTLR end "rule__Assignment__Group__4"


    // $ANTLR start "rule__Assignment__Group__4__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:903:1: rule__Assignment__Group__4__Impl : ( ( rule__Assignment__ValueAssignment_4 ) ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:907:1: ( ( ( rule__Assignment__ValueAssignment_4 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:908:1: ( ( rule__Assignment__ValueAssignment_4 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:908:1: ( ( rule__Assignment__ValueAssignment_4 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:909:1: ( rule__Assignment__ValueAssignment_4 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_4()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:910:1: ( rule__Assignment__ValueAssignment_4 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:910:2: rule__Assignment__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_4_in_rule__Assignment__Group__4__Impl1797);
            rule__Assignment__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_4()); 

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
    // $ANTLR end "rule__Assignment__Group__4__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:930:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:934:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:935:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__01837);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__01840);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:942:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:946:1: ( ( () ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:947:1: ( () )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:947:1: ( () )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:948:1: ()
            {
             before(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:949:1: ()
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:951:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getSymbolRefAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:961:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:965:1: ( rule__Atomic__Group_0__1__Impl )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:966:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__11898);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:972:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__SymbolAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:976:1: ( ( ( rule__Atomic__SymbolAssignment_0_1 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:977:1: ( ( rule__Atomic__SymbolAssignment_0_1 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:977:1: ( ( rule__Atomic__SymbolAssignment_0_1 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:978:1: ( rule__Atomic__SymbolAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getSymbolAssignment_0_1()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:979:1: ( rule__Atomic__SymbolAssignment_0_1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:979:2: rule__Atomic__SymbolAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Atomic__SymbolAssignment_0_1_in_rule__Atomic__Group_0__1__Impl1925);
            rule__Atomic__SymbolAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getSymbolAssignment_0_1()); 

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
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:993:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:997:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:998:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__01959);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__01962);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1005:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1009:1: ( ( () ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1010:1: ( () )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1010:1: ( () )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1011:1: ()
            {
             before(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1012:1: ()
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1014:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1024:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1028:1: ( rule__Atomic__Group_1__1__Impl )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1029:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__12020);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1035:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1039:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1040:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1040:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1041:1: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1042:1: ( rule__Atomic__ValueAssignment_1_1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1042:2: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl2047);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1056:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1060:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1061:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__02081);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__02084);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1068:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1072:1: ( ( () ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1073:1: ( () )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1073:1: ( () )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1074:1: ()
            {
             before(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1075:1: ()
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1077:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1087:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1091:1: ( rule__Atomic__Group_2__1__Impl )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1092:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__12142);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1098:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1102:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1103:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1103:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1104:1: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1105:1: ( rule__Atomic__ValueAssignment_2_1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1105:2: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl2169);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1119:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1123:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1124:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__02203);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__02206);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1131:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1135:1: ( ( () ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1136:1: ( () )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1136:1: ( () )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1137:1: ()
            {
             before(grammarAccess.getAtomicAccess().getFunCallAction_3_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1138:1: ()
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1140:1: 
            {
            }

             after(grammarAccess.getAtomicAccess().getFunCallAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1150:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1154:1: ( rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1155:2: rule__Atomic__Group_3__1__Impl rule__Atomic__Group_3__2
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__12264);
            rule__Atomic__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__12267);
            rule__Atomic__Group_3__2();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1162:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__FunAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1166:1: ( ( ( rule__Atomic__FunAssignment_3_1 ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1167:1: ( ( rule__Atomic__FunAssignment_3_1 ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1167:1: ( ( rule__Atomic__FunAssignment_3_1 ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1168:1: ( rule__Atomic__FunAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getFunAssignment_3_1()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1169:1: ( rule__Atomic__FunAssignment_3_1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1169:2: rule__Atomic__FunAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Atomic__FunAssignment_3_1_in_rule__Atomic__Group_3__1__Impl2294);
            rule__Atomic__FunAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getFunAssignment_3_1()); 

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
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__2"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1179:1: rule__Atomic__Group_3__2 : rule__Atomic__Group_3__2__Impl ;
    public final void rule__Atomic__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1183:1: ( rule__Atomic__Group_3__2__Impl )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1184:2: rule__Atomic__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__22324);
            rule__Atomic__Group_3__2__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__2"


    // $ANTLR start "rule__Atomic__Group_3__2__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1190:1: rule__Atomic__Group_3__2__Impl : ( '()' ) ;
    public final void rule__Atomic__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1194:1: ( ( '()' ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1195:1: ( '()' )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1195:1: ( '()' )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1196:1: '()'
            {
             before(grammarAccess.getAtomicAccess().getLeftParenthesisRightParenthesisKeyword_3_2()); 
            match(input,17,FOLLOW_17_in_rule__Atomic__Group_3__2__Impl2352); 
             after(grammarAccess.getAtomicAccess().getLeftParenthesisRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__Atomic__Group_3__2__Impl"


    // $ANTLR start "rule__MyIntType__Group__0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1215:1: rule__MyIntType__Group__0 : rule__MyIntType__Group__0__Impl rule__MyIntType__Group__1 ;
    public final void rule__MyIntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1219:1: ( rule__MyIntType__Group__0__Impl rule__MyIntType__Group__1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1220:2: rule__MyIntType__Group__0__Impl rule__MyIntType__Group__1
            {
            pushFollow(FOLLOW_rule__MyIntType__Group__0__Impl_in_rule__MyIntType__Group__02389);
            rule__MyIntType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MyIntType__Group__1_in_rule__MyIntType__Group__02392);
            rule__MyIntType__Group__1();

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
    // $ANTLR end "rule__MyIntType__Group__0"


    // $ANTLR start "rule__MyIntType__Group__0__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1227:1: rule__MyIntType__Group__0__Impl : ( () ) ;
    public final void rule__MyIntType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1231:1: ( ( () ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1232:1: ( () )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1232:1: ( () )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1233:1: ()
            {
             before(grammarAccess.getMyIntTypeAccess().getINTAction_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1234:1: ()
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1236:1: 
            {
            }

             after(grammarAccess.getMyIntTypeAccess().getINTAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyIntType__Group__0__Impl"


    // $ANTLR start "rule__MyIntType__Group__1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1246:1: rule__MyIntType__Group__1 : rule__MyIntType__Group__1__Impl ;
    public final void rule__MyIntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1250:1: ( rule__MyIntType__Group__1__Impl )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1251:2: rule__MyIntType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MyIntType__Group__1__Impl_in_rule__MyIntType__Group__12450);
            rule__MyIntType__Group__1__Impl();

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
    // $ANTLR end "rule__MyIntType__Group__1"


    // $ANTLR start "rule__MyIntType__Group__1__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1257:1: rule__MyIntType__Group__1__Impl : ( 'int' ) ;
    public final void rule__MyIntType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1261:1: ( ( 'int' ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1262:1: ( 'int' )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1262:1: ( 'int' )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1263:1: 'int'
            {
             before(grammarAccess.getMyIntTypeAccess().getIntKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__MyIntType__Group__1__Impl2478); 
             after(grammarAccess.getMyIntTypeAccess().getIntKeyword_1()); 

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
    // $ANTLR end "rule__MyIntType__Group__1__Impl"


    // $ANTLR start "rule__MyStringType__Group__0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1280:1: rule__MyStringType__Group__0 : rule__MyStringType__Group__0__Impl rule__MyStringType__Group__1 ;
    public final void rule__MyStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1284:1: ( rule__MyStringType__Group__0__Impl rule__MyStringType__Group__1 )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1285:2: rule__MyStringType__Group__0__Impl rule__MyStringType__Group__1
            {
            pushFollow(FOLLOW_rule__MyStringType__Group__0__Impl_in_rule__MyStringType__Group__02513);
            rule__MyStringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MyStringType__Group__1_in_rule__MyStringType__Group__02516);
            rule__MyStringType__Group__1();

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
    // $ANTLR end "rule__MyStringType__Group__0"


    // $ANTLR start "rule__MyStringType__Group__0__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1292:1: rule__MyStringType__Group__0__Impl : ( () ) ;
    public final void rule__MyStringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1296:1: ( ( () ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1297:1: ( () )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1297:1: ( () )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1298:1: ()
            {
             before(grammarAccess.getMyStringTypeAccess().getSTRINGAction_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1299:1: ()
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1301:1: 
            {
            }

             after(grammarAccess.getMyStringTypeAccess().getSTRINGAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyStringType__Group__0__Impl"


    // $ANTLR start "rule__MyStringType__Group__1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1311:1: rule__MyStringType__Group__1 : rule__MyStringType__Group__1__Impl ;
    public final void rule__MyStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1315:1: ( rule__MyStringType__Group__1__Impl )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1316:2: rule__MyStringType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MyStringType__Group__1__Impl_in_rule__MyStringType__Group__12574);
            rule__MyStringType__Group__1__Impl();

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
    // $ANTLR end "rule__MyStringType__Group__1"


    // $ANTLR start "rule__MyStringType__Group__1__Impl"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1322:1: rule__MyStringType__Group__1__Impl : ( 'string' ) ;
    public final void rule__MyStringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1326:1: ( ( 'string' ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1327:1: ( 'string' )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1327:1: ( 'string' )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1328:1: 'string'
            {
             before(grammarAccess.getMyStringTypeAccess().getStringKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__MyStringType__Group__1__Impl2602); 
             after(grammarAccess.getMyStringTypeAccess().getStringKeyword_1()); 

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
    // $ANTLR end "rule__MyStringType__Group__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1346:1: rule__Domainmodel__ElementsAssignment : ( ruleRootElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1350:1: ( ( ruleRootElement ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1351:1: ( ruleRootElement )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1351:1: ( ruleRootElement )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1352:1: ruleRootElement
            {
             before(grammarAccess.getDomainmodelAccess().getElementsRootElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRootElement_in_rule__Domainmodel__ElementsAssignment2642);
            ruleRootElement();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsRootElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__RootElement__MainAssignment_0"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1361:1: rule__RootElement__MainAssignment_0 : ( ruleMain ) ;
    public final void rule__RootElement__MainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1365:1: ( ( ruleMain ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1366:1: ( ruleMain )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1366:1: ( ruleMain )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1367:1: ruleMain
            {
             before(grammarAccess.getRootElementAccess().getMainMainParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMain_in_rule__RootElement__MainAssignment_02673);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getRootElementAccess().getMainMainParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__RootElement__MainAssignment_0"


    // $ANTLR start "rule__RootElement__FunsAssignment_1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1376:1: rule__RootElement__FunsAssignment_1 : ( ruleFun ) ;
    public final void rule__RootElement__FunsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1380:1: ( ( ruleFun ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1381:1: ( ruleFun )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1381:1: ( ruleFun )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1382:1: ruleFun
            {
             before(grammarAccess.getRootElementAccess().getFunsFunParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFun_in_rule__RootElement__FunsAssignment_12704);
            ruleFun();

            state._fsp--;

             after(grammarAccess.getRootElementAccess().getFunsFunParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RootElement__FunsAssignment_1"


    // $ANTLR start "rule__Main__ExpressionsAssignment_1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1391:1: rule__Main__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__Main__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1395:1: ( ( ruleExpression ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1396:1: ( ruleExpression )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1396:1: ( ruleExpression )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1397:1: ruleExpression
            {
             before(grammarAccess.getMainAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Main__ExpressionsAssignment_12735);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMainAccess().getExpressionsExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Main__ExpressionsAssignment_1"


    // $ANTLR start "rule__Fun__NameAssignment_2"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1406:1: rule__Fun__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Fun__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1410:1: ( ( RULE_ID ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1411:1: ( RULE_ID )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1411:1: ( RULE_ID )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1412:1: RULE_ID
            {
             before(grammarAccess.getFunAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fun__NameAssignment_22766); 
             after(grammarAccess.getFunAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Fun__NameAssignment_2"


    // $ANTLR start "rule__Fun__ReturnTypeAssignment_4"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1421:1: rule__Fun__ReturnTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Fun__ReturnTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1425:1: ( ( ( RULE_ID ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1426:1: ( ( RULE_ID ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1426:1: ( ( RULE_ID ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1427:1: ( RULE_ID )
            {
             before(grammarAccess.getFunAccess().getReturnTypeTypeCrossReference_4_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1428:1: ( RULE_ID )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1429:1: RULE_ID
            {
             before(grammarAccess.getFunAccess().getReturnTypeTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fun__ReturnTypeAssignment_42801); 
             after(grammarAccess.getFunAccess().getReturnTypeTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFunAccess().getReturnTypeTypeCrossReference_4_0()); 

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
    // $ANTLR end "rule__Fun__ReturnTypeAssignment_4"


    // $ANTLR start "rule__Fun__ExpressionsAssignment_6"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1440:1: rule__Fun__ExpressionsAssignment_6 : ( ruleExpression ) ;
    public final void rule__Fun__ExpressionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1444:1: ( ( ruleExpression ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1445:1: ( ruleExpression )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1445:1: ( ruleExpression )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1446:1: ruleExpression
            {
             before(grammarAccess.getFunAccess().getExpressionsExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Fun__ExpressionsAssignment_62836);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunAccess().getExpressionsExpressionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Fun__ExpressionsAssignment_6"


    // $ANTLR start "rule__Assignment__TypeAssignment_1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1455:1: rule__Assignment__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1459:1: ( ( ( RULE_ID ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1460:1: ( ( RULE_ID ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1460:1: ( ( RULE_ID ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1461:1: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getTypeTypeCrossReference_1_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1462:1: ( RULE_ID )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1463:1: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__TypeAssignment_12871); 
             after(grammarAccess.getAssignmentAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getTypeTypeCrossReference_1_0()); 

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
    // $ANTLR end "rule__Assignment__TypeAssignment_1"


    // $ANTLR start "rule__Assignment__NameAssignment_2"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1474:1: rule__Assignment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Assignment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1478:1: ( ( RULE_ID ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1479:1: ( RULE_ID )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1479:1: ( RULE_ID )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1480:1: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__NameAssignment_22906); 
             after(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Assignment__NameAssignment_2"


    // $ANTLR start "rule__Assignment__ValueAssignment_4"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1489:1: rule__Assignment__ValueAssignment_4 : ( ruleAtomic ) ;
    public final void rule__Assignment__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1493:1: ( ( ruleAtomic ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1494:1: ( ruleAtomic )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1494:1: ( ruleAtomic )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1495:1: ruleAtomic
            {
             before(grammarAccess.getAssignmentAccess().getValueAtomicParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAtomic_in_rule__Assignment__ValueAssignment_42937);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueAtomicParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Assignment__ValueAssignment_4"


    // $ANTLR start "rule__Atomic__SymbolAssignment_0_1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1504:1: rule__Atomic__SymbolAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__SymbolAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1508:1: ( ( ( RULE_ID ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1509:1: ( ( RULE_ID ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1509:1: ( ( RULE_ID ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1510:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1511:1: ( RULE_ID )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1512:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getSymbolSymbolIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__SymbolAssignment_0_12972); 
             after(grammarAccess.getAtomicAccess().getSymbolSymbolIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0()); 

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
    // $ANTLR end "rule__Atomic__SymbolAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1523:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1527:1: ( ( RULE_INT ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1528:1: ( RULE_INT )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1528:1: ( RULE_INT )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1529:1: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_13007); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1538:1: rule__Atomic__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1542:1: ( ( RULE_STRING ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1543:1: ( RULE_STRING )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1543:1: ( RULE_STRING )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1544:1: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_13038); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__FunAssignment_3_1"
    // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1553:1: rule__Atomic__FunAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__FunAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1557:1: ( ( ( RULE_ID ) ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1558:1: ( ( RULE_ID ) )
            {
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1558:1: ( ( RULE_ID ) )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1559:1: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getFunFunCrossReference_3_1_0()); 
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1560:1: ( RULE_ID )
            // ../org.svlang.v0.ui/src-gen/org/svlang/v0/ui/contentassist/antlr/internal/InternalV0.g:1561:1: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getFunFunIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Atomic__FunAssignment_3_13073); 
             after(grammarAccess.getAtomicAccess().getFunFunIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getFunFunCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Atomic__FunAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domainmodel__ElementsAssignment_in_ruleDomainmodel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleRootElement_in_entryRuleRootElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootElement__Group__0_in_ruleRootElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0_in_ruleMain215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFun_in_entryRuleFun242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFun249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__Group__0_in_ruleFun275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleExpression335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyIntType_in_entryRuleMyIntType483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyIntType490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyIntType__Group__0_in_ruleMyIntType516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyStringType_in_entryRuleMyStringType543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyStringType550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyStringType__Group__0_in_ruleMyStringType576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0_in_rule__Atomic__Alternatives612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0_in_rule__Atomic__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0_in_rule__Atomic__Alternatives648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0_in_rule__Atomic__Alternatives666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootElement__Group__0__Impl_in_rule__RootElement__Group__0698 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RootElement__Group__1_in_rule__RootElement__Group__0701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootElement__MainAssignment_0_in_rule__RootElement__Group__0__Impl728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootElement__Group__1__Impl_in_rule__RootElement__Group__1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootElement__FunsAssignment_1_in_rule__RootElement__Group__1__Impl785 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__0820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__0823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Main__Group__0__Impl851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__1882 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Main__Group__2_in_rule__Main__Group__1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__ExpressionsAssignment_1_in_rule__Main__Group__1__Impl914 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Main__ExpressionsAssignment_1_in_rule__Main__Group__1__Impl926 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Main__Group__2__Impl987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__Group__0__Impl_in_rule__Fun__Group__01024 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Fun__Group__1_in_rule__Fun__Group__01027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__Group__1__Impl_in_rule__Fun__Group__11085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fun__Group__2_in_rule__Fun__Group__11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Fun__Group__1__Impl1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__Group__2__Impl_in_rule__Fun__Group__21147 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Fun__Group__3_in_rule__Fun__Group__21150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__NameAssignment_2_in_rule__Fun__Group__2__Impl1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__Group__3__Impl_in_rule__Fun__Group__31207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fun__Group__4_in_rule__Fun__Group__31210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Fun__Group__3__Impl1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__Group__4__Impl_in_rule__Fun__Group__41269 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Fun__Group__5_in_rule__Fun__Group__41272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__ReturnTypeAssignment_4_in_rule__Fun__Group__4__Impl1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__Group__5__Impl_in_rule__Fun__Group__51329 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Fun__Group__6_in_rule__Fun__Group__51332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Fun__Group__5__Impl1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__Group__6__Impl_in_rule__Fun__Group__61391 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_rule__Fun__Group__7_in_rule__Fun__Group__61394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fun__ExpressionsAssignment_6_in_rule__Fun__Group__6__Impl1421 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Fun__Group__7__Impl_in_rule__Fun__Group__71452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Fun__Group__7__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__01527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__01530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__11588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__TypeAssignment_1_in_rule__Assignment__Group__1__Impl1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__21648 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__21651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAssignment_2_in_rule__Assignment__Group__2__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__31708 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__31711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Assignment__Group__3__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__41770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_4_in_rule__Assignment__Group__4__Impl1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__0__Impl_in_rule__Atomic__Group_0__01837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1_in_rule__Atomic__Group_0__01840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_0__1__Impl_in_rule__Atomic__Group_0__11898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__SymbolAssignment_0_1_in_rule__Atomic__Group_0__1__Impl1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__0__Impl_in_rule__Atomic__Group_1__01959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1_in_rule__Atomic__Group_1__01962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_1__1__Impl_in_rule__Atomic__Group_1__12020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_1_1_in_rule__Atomic__Group_1__1__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__0__Impl_in_rule__Atomic__Group_2__02081 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1_in_rule__Atomic__Group_2__02084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_2__1__Impl_in_rule__Atomic__Group_2__12142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__ValueAssignment_2_1_in_rule__Atomic__Group_2__1__Impl2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__0__Impl_in_rule__Atomic__Group_3__02203 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1_in_rule__Atomic__Group_3__02206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__1__Impl_in_rule__Atomic__Group_3__12264 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2_in_rule__Atomic__Group_3__12267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__FunAssignment_3_1_in_rule__Atomic__Group_3__1__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Group_3__2__Impl_in_rule__Atomic__Group_3__22324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Atomic__Group_3__2__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyIntType__Group__0__Impl_in_rule__MyIntType__Group__02389 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MyIntType__Group__1_in_rule__MyIntType__Group__02392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyIntType__Group__1__Impl_in_rule__MyIntType__Group__12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MyIntType__Group__1__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyStringType__Group__0__Impl_in_rule__MyStringType__Group__02513 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MyStringType__Group__1_in_rule__MyStringType__Group__02516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MyStringType__Group__1__Impl_in_rule__MyStringType__Group__12574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MyStringType__Group__1__Impl2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootElement_in_rule__Domainmodel__ElementsAssignment2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_rule__RootElement__MainAssignment_02673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFun_in_rule__RootElement__FunsAssignment_12704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Main__ExpressionsAssignment_12735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fun__NameAssignment_22766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fun__ReturnTypeAssignment_42801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Fun__ExpressionsAssignment_62836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__TypeAssignment_12871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__NameAssignment_22906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__Assignment__ValueAssignment_42937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__SymbolAssignment_0_12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atomic__ValueAssignment_1_13007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Atomic__ValueAssignment_2_13038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Atomic__FunAssignment_3_13073 = new BitSet(new long[]{0x0000000000000002L});

}