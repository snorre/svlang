package org.example.domainmodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'datatype'", "'entity'", "'extends'", "'many'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g"; }



     	private DomainmodelGrammarAccess grammarAccess;
     	
        public InternalDomainmodelParser(TokenStream input, DomainmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";	
       	}
       	
       	@Override
       	protected DomainmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainmodel"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:67:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:68:2: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:69:2: iv_ruleDomainmodel= ruleDomainmodel EOF
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
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:76:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:82:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleDomainmodel130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
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


    // $ANTLR start "entryRulePackageDeclaration"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:106:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:107:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:108:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration166);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration176); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:115:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:118:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:119:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackageDeclaration213); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:123:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:124:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:124:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:125:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration234);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackageDeclaration246); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:145:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==15||(LA2_0>=17 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:146:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:146:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:147:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackageDeclaration267);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePackageDeclaration280); 

                	newLeafNode(otherlv_4, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:175:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:176:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:177:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement316);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement326); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:184:1: ruleAbstractElement returns [EObject current=null] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDeclaration_0 = null;

        EObject this_Type_1 = null;

        EObject this_Import_2 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:187:28: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:188:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:188:1: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 17:
            case 18:
                {
                alt3=2;
                }
                break;
            case 15:
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
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:189:5: this_PackageDeclaration_0= rulePackageDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleAbstractElement373);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;

                     
                            current = this_PackageDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:199:5: this_Type_1= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleAbstractElement400);
                    this_Type_1=ruleType();

                    state._fsp--;

                     
                            current = this_Type_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:209:5: this_Import_2= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleAbstractElement427);
                    this_Import_2=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_2; 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:225:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:226:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:227:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName463);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName474); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:234:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:237:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:238:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:238:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:238:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName514); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:245:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:246:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleQualifiedName533); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName548); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:266:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:267:2: (iv_ruleImport= ruleImport EOF )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:268:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport595);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport605); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:275:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:278:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:279:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:279:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:279:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport642); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:283:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:284:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:284:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:285:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport663);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:309:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:310:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:311:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard700);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard711); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:318:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:321:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:322:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:322:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:323:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard758);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:333:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:334:2: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildcard777); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:347:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:348:2: (iv_ruleType= ruleType EOF )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:349:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType819);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType829); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:356:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Entity_1 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:359:28: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:360:1: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:360:1: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:361:5: this_DataType_0= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataType_in_ruleType876);
                    this_DataType_0=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:371:5: this_Entity_1= ruleEntity
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType903);
                    this_Entity_1=ruleEntity();

                    state._fsp--;

                     
                            current = this_Entity_1; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:387:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:388:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:389:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType938);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType948); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:396:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:399:28: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:400:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:400:1: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:400:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDataType985); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
                
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:404:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:405:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:405:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:406:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataType1002); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:430:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:431:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:432:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1043);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1053); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:439:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:442:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:443:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:443:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:443:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEntity1090); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:447:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:448:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:448:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:449:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1107); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:465:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:465:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleEntity1125); 

                        	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                        
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:469:1: ( ( ruleQualifiedName ) )
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:470:1: ( ruleQualifiedName )
                    {
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:470:1: ( ruleQualifiedName )
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:471:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEntity1148);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleEntity1162); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:488:1: ( (lv_features_5_0= ruleFeature ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:489:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:489:1: (lv_features_5_0= ruleFeature )
            	    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:490:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity1183);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleEntity1196); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:518:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:519:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:520:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1232);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1242); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:527:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:530:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:531:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:531:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:531:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:531:2: ( (lv_many_0_0= 'many' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:532:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:532:1: (lv_many_0_0= 'many' )
                    // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:533:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,20,FOLLOW_20_in_ruleFeature1285); 

                            newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:546:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:547:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:547:1: (lv_name_1_0= RULE_ID )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:548:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1316); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFeature1333); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
                
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:568:1: ( ( ruleQualifiedName ) )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:569:1: ( ruleQualifiedName )
            {
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:569:1: ( ruleQualifiedName )
            // ../org.example.domainmodel/src-gen/org/example/domainmodel/parser/antlr/internal/InternalDomainmodel.g:570:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeature1356);
            ruleQualifiedName();

            state._fsp--;

             
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
    // $ANTLR end "ruleFeature"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainmodel_in_entryRuleDomainmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleDomainmodel130 = new BitSet(new long[]{0x0000000000068802L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackageDeclaration213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration234 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackageDeclaration246 = new BitSet(new long[]{0x000000000006A800L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackageDeclaration267 = new BitSet(new long[]{0x000000000006A800L});
    public static final BitSet FOLLOW_13_in_rulePackageDeclaration280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleAbstractElement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleAbstractElement400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleAbstractElement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName514 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleQualifiedName533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName548 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImport663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard758 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildcard777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleType876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDataType985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEntity1090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1107 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_19_in_ruleEntity1125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity1148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity1162 = new BitSet(new long[]{0x0000000000102010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity1183 = new BitSet(new long[]{0x0000000000102010L});
    public static final BitSet FOLLOW_13_in_ruleEntity1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFeature1285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1316 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFeature1333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeature1356 = new BitSet(new long[]{0x0000000000000002L});

}