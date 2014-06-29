package org.svlang.v0.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.svlang.v0.services.V0GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalV0Parser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g"; }



     	private V0GrammarAccess grammarAccess;
     	
        public InternalV0Parser(TokenStream input, V0GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";	
       	}
       	
       	@Override
       	protected V0GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainmodel"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:67:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:68:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:69:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainmodel85); 

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:76:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleRootElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:79:28: ( ( (lv_elements_0_0= ruleRootElement ) )* )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:80:1: ( (lv_elements_0_0= ruleRootElement ) )*
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:80:1: ( (lv_elements_0_0= ruleRootElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:81:1: (lv_elements_0_0= ruleRootElement )
            	    {
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:81:1: (lv_elements_0_0= ruleRootElement )
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:82:3: lv_elements_0_0= ruleRootElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsRootElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRootElement_in_ruleDomainmodel130);
            	    lv_elements_0_0=ruleRootElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"RootElement");
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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleRootElement"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:106:1: entryRuleRootElement returns [EObject current=null] : iv_ruleRootElement= ruleRootElement EOF ;
    public final EObject entryRuleRootElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootElement = null;


        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:107:2: (iv_ruleRootElement= ruleRootElement EOF )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:108:2: iv_ruleRootElement= ruleRootElement EOF
            {
             newCompositeNode(grammarAccess.getRootElementRule()); 
            pushFollow(FOLLOW_ruleRootElement_in_entryRuleRootElement166);
            iv_ruleRootElement=ruleRootElement();

            state._fsp--;

             current =iv_ruleRootElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootElement176); 

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
    // $ANTLR end "entryRuleRootElement"


    // $ANTLR start "ruleRootElement"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:115:1: ruleRootElement returns [EObject current=null] : ( ( (lv_main_0_0= ruleMain ) ) ( (lv_funs_1_0= ruleFun ) )* ) ;
    public final EObject ruleRootElement() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_0 = null;

        EObject lv_funs_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:118:28: ( ( ( (lv_main_0_0= ruleMain ) ) ( (lv_funs_1_0= ruleFun ) )* ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:119:1: ( ( (lv_main_0_0= ruleMain ) ) ( (lv_funs_1_0= ruleFun ) )* )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:119:1: ( ( (lv_main_0_0= ruleMain ) ) ( (lv_funs_1_0= ruleFun ) )* )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:119:2: ( (lv_main_0_0= ruleMain ) ) ( (lv_funs_1_0= ruleFun ) )*
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:119:2: ( (lv_main_0_0= ruleMain ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:120:1: (lv_main_0_0= ruleMain )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:120:1: (lv_main_0_0= ruleMain )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:121:3: lv_main_0_0= ruleMain
            {
             
            	        newCompositeNode(grammarAccess.getRootElementAccess().getMainMainParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMain_in_ruleRootElement222);
            lv_main_0_0=ruleMain();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRootElementRule());
            	        }
                   		set(
                   			current, 
                   			"main",
                    		lv_main_0_0, 
                    		"Main");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:137:2: ( (lv_funs_1_0= ruleFun ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:138:1: (lv_funs_1_0= ruleFun )
            	    {
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:138:1: (lv_funs_1_0= ruleFun )
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:139:3: lv_funs_1_0= ruleFun
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRootElementAccess().getFunsFunParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFun_in_ruleRootElement243);
            	    lv_funs_1_0=ruleFun();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRootElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"funs",
            	            		lv_funs_1_0, 
            	            		"Fun");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleRootElement"


    // $ANTLR start "entryRuleMain"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:163:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:164:2: (iv_ruleMain= ruleMain EOF )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:165:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain280);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain290); 

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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:172:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main {' ( (lv_expressions_1_0= ruleExpression ) )+ otherlv_2= '}' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:175:28: ( (otherlv_0= 'main {' ( (lv_expressions_1_0= ruleExpression ) )+ otherlv_2= '}' ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:176:1: (otherlv_0= 'main {' ( (lv_expressions_1_0= ruleExpression ) )+ otherlv_2= '}' )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:176:1: (otherlv_0= 'main {' ( (lv_expressions_1_0= ruleExpression ) )+ otherlv_2= '}' )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:176:3: otherlv_0= 'main {' ( (lv_expressions_1_0= ruleExpression ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMain327); 

                	newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
                
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:180:1: ( (lv_expressions_1_0= ruleExpression ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:181:1: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:181:1: (lv_expressions_1_0= ruleExpression )
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:182:3: lv_expressions_1_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleMain348);
            	    lv_expressions_1_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_1_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMain361); 

                	newLeafNode(otherlv_2, grammarAccess.getMainAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleFun"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:210:1: entryRuleFun returns [EObject current=null] : iv_ruleFun= ruleFun EOF ;
    public final EObject entryRuleFun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFun = null;


        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:211:2: (iv_ruleFun= ruleFun EOF )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:212:2: iv_ruleFun= ruleFun EOF
            {
             newCompositeNode(grammarAccess.getFunRule()); 
            pushFollow(FOLLOW_ruleFun_in_entryRuleFun397);
            iv_ruleFun=ruleFun();

            state._fsp--;

             current =iv_ruleFun; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFun407); 

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
    // $ANTLR end "entryRuleFun"


    // $ANTLR start "ruleFun"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:219:1: ruleFun returns [EObject current=null] : ( () otherlv_1= 'fun ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ' {' ( (lv_expressions_6_0= ruleExpression ) )* otherlv_7= '}' ) ;
    public final EObject ruleFun() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expressions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:222:28: ( ( () otherlv_1= 'fun ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ' {' ( (lv_expressions_6_0= ruleExpression ) )* otherlv_7= '}' ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:223:1: ( () otherlv_1= 'fun ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ' {' ( (lv_expressions_6_0= ruleExpression ) )* otherlv_7= '}' )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:223:1: ( () otherlv_1= 'fun ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ' {' ( (lv_expressions_6_0= ruleExpression ) )* otherlv_7= '}' )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:223:2: () otherlv_1= 'fun ' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) otherlv_5= ' {' ( (lv_expressions_6_0= ruleExpression ) )* otherlv_7= '}'
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:223:2: ()
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:224:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunAccess().getFunAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleFun453); 

                	newLeafNode(otherlv_1, grammarAccess.getFunAccess().getFunKeyword_1());
                
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:233:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:234:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:234:1: (lv_name_2_0= RULE_ID )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:235:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFun470); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFunAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleFun487); 

                	newLeafNode(otherlv_3, grammarAccess.getFunAccess().getColonKeyword_3());
                
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:255:1: ( (otherlv_4= RULE_ID ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:256:1: (otherlv_4= RULE_ID )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:256:1: (otherlv_4= RULE_ID )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:257:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFunRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFun507); 

            		newLeafNode(otherlv_4, grammarAccess.getFunAccess().getReturnTypeTypeCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleFun519); 

                	newLeafNode(otherlv_5, grammarAccess.getFunAccess().getSpaceLeftCurlyBracketKeyword_5());
                
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:272:1: ( (lv_expressions_6_0= ruleExpression ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:273:1: (lv_expressions_6_0= ruleExpression )
            	    {
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:273:1: (lv_expressions_6_0= ruleExpression )
            	    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:274:3: lv_expressions_6_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunAccess().getExpressionsExpressionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleFun540);
            	    lv_expressions_6_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_6_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleFun553); 

                	newLeafNode(otherlv_7, grammarAccess.getFunAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleFun"


    // $ANTLR start "entryRuleExpression"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:302:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:303:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:304:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression589);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression599); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:311:1: ruleExpression returns [EObject current=null] : this_Assignment_0= ruleAssignment ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Assignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:314:28: (this_Assignment_0= ruleAssignment )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:316:5: this_Assignment_0= ruleAssignment
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAssignment_in_ruleExpression645);
            this_Assignment_0=ruleAssignment();

            state._fsp--;

             
                    current = this_Assignment_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAssignment"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:332:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:333:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:334:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment679);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment689); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:341:1: ruleAssignment returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ' = ' ( (lv_value_4_0= ruleAtomic ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:344:28: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ' = ' ( (lv_value_4_0= ruleAtomic ) ) ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:345:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ' = ' ( (lv_value_4_0= ruleAtomic ) ) )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:345:1: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ' = ' ( (lv_value_4_0= ruleAtomic ) ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:345:2: () ( (otherlv_1= RULE_ID ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ' = ' ( (lv_value_4_0= ruleAtomic ) )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:345:2: ()
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:346:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssignmentAccess().getAssignmentAction_0(),
                        current);
                

            }

            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:351:2: ( (otherlv_1= RULE_ID ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:352:1: (otherlv_1= RULE_ID )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:352:1: (otherlv_1= RULE_ID )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:353:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment743); 

            		newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getTypeTypeCrossReference_1_0()); 
            	

            }


            }

            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:364:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:365:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:365:1: (lv_name_2_0= RULE_ID )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:366:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment760); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAssignment777); 

                	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getSpaceEqualsSignSpaceKeyword_3());
                
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:386:1: ( (lv_value_4_0= ruleAtomic ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:387:1: (lv_value_4_0= ruleAtomic )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:387:1: (lv_value_4_0= ruleAtomic )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:388:3: lv_value_4_0= ruleAtomic
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueAtomicParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomic_in_ruleAssignment798);
            lv_value_4_0=ruleAtomic();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"Atomic");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAtomic"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:412:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:413:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:414:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic834);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic844); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:421:1: ruleAtomic returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '()' ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:424:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '()' ) ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:425:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '()' ) )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:425:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '()' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==12) ) {
                    alt5=1;
                }
                else if ( (LA5_1==17) ) {
                    alt5=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:425:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:425:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:425:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:425:3: ()
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:426:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getSymbolRefAction_0_0(),
                                current);
                        

                    }

                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:431:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:432:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:432:1: (otherlv_1= RULE_ID )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:433:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic899); 

                    		newLeafNode(otherlv_1, grammarAccess.getAtomicAccess().getSymbolSymbolCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:445:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:445:6: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:445:7: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:445:7: ()
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:446:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getNumberLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:451:2: ( (lv_value_3_0= RULE_INT ) )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:452:1: (lv_value_3_0= RULE_INT )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:452:1: (lv_value_3_0= RULE_INT )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:453:3: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic933); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:470:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:470:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:470:7: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:470:7: ()
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:471:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getStringLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:476:2: ( (lv_value_5_0= RULE_STRING ) )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:477:1: (lv_value_5_0= RULE_STRING )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:477:1: (lv_value_5_0= RULE_STRING )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:478:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic972); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:495:6: ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '()' )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:495:6: ( () ( (otherlv_7= RULE_ID ) ) otherlv_8= '()' )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:495:7: () ( (otherlv_7= RULE_ID ) ) otherlv_8= '()'
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:495:7: ()
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:496:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAtomicAccess().getFunCallAction_3_0(),
                                current);
                        

                    }

                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:501:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:502:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:502:1: (otherlv_7= RULE_ID )
                    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:503:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic1014); 

                    		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getFunFunCrossReference_3_1_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleAtomic1026); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getLeftParenthesisRightParenthesisKeyword_3_2());
                        

                    }


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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleMyIntType"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:528:1: entryRuleMyIntType returns [EObject current=null] : iv_ruleMyIntType= ruleMyIntType EOF ;
    public final EObject entryRuleMyIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyIntType = null;


        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:529:2: (iv_ruleMyIntType= ruleMyIntType EOF )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:530:2: iv_ruleMyIntType= ruleMyIntType EOF
            {
             newCompositeNode(grammarAccess.getMyIntTypeRule()); 
            pushFollow(FOLLOW_ruleMyIntType_in_entryRuleMyIntType1065);
            iv_ruleMyIntType=ruleMyIntType();

            state._fsp--;

             current =iv_ruleMyIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyIntType1075); 

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
    // $ANTLR end "entryRuleMyIntType"


    // $ANTLR start "ruleMyIntType"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:537:1: ruleMyIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleMyIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:540:28: ( ( () otherlv_1= 'int' ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:541:1: ( () otherlv_1= 'int' )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:541:1: ( () otherlv_1= 'int' )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:541:2: () otherlv_1= 'int'
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:541:2: ()
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:542:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMyIntTypeAccess().getINTAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleMyIntType1121); 

                	newLeafNode(otherlv_1, grammarAccess.getMyIntTypeAccess().getIntKeyword_1());
                

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
    // $ANTLR end "ruleMyIntType"


    // $ANTLR start "entryRuleMyStringType"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:559:1: entryRuleMyStringType returns [EObject current=null] : iv_ruleMyStringType= ruleMyStringType EOF ;
    public final EObject entryRuleMyStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyStringType = null;


        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:560:2: (iv_ruleMyStringType= ruleMyStringType EOF )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:561:2: iv_ruleMyStringType= ruleMyStringType EOF
            {
             newCompositeNode(grammarAccess.getMyStringTypeRule()); 
            pushFollow(FOLLOW_ruleMyStringType_in_entryRuleMyStringType1157);
            iv_ruleMyStringType=ruleMyStringType();

            state._fsp--;

             current =iv_ruleMyStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyStringType1167); 

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
    // $ANTLR end "entryRuleMyStringType"


    // $ANTLR start "ruleMyStringType"
    // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:568:1: ruleMyStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleMyStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:571:28: ( ( () otherlv_1= 'string' ) )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:572:1: ( () otherlv_1= 'string' )
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:572:1: ( () otherlv_1= 'string' )
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:572:2: () otherlv_1= 'string'
            {
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:572:2: ()
            // ../org.svlang.v0/src-gen/org/svlang/v0/parser/antlr/internal/InternalV0.g:573:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMyStringTypeAccess().getSTRINGAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleMyStringType1213); 

                	newLeafNode(otherlv_1, grammarAccess.getMyStringTypeAccess().getStringKeyword_1());
                

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
    // $ANTLR end "ruleMyStringType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootElement_in_ruleDomainmodel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleRootElement_in_entryRuleRootElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMain_in_ruleRootElement222 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFun_in_ruleRootElement243 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMain327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMain348 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleMain361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFun_in_entryRuleFun397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFun407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFun453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFun470 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFun487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFun507 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFun519 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFun540 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleFun553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleExpression645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment760 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssignment777 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleAssignment798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic1014 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomic1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyIntType_in_entryRuleMyIntType1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyIntType1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMyIntType1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMyStringType_in_entryRuleMyStringType1157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyStringType1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMyStringType1213 = new BitSet(new long[]{0x0000000000000002L});

}