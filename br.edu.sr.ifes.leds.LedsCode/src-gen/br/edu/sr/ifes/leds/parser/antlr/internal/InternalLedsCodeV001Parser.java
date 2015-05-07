package br.edu.sr.ifes.leds.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.edu.sr.ifes.leds.services.LedsCodeV001GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLedsCodeV001Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_UNQUOTED_STRING", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_OL_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'{'", "'}'", "'module'", "'name'", "'='", "'language'", "'framework'", "'orm'", "'database'", "','", "':'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_UNQUOTED_STRING=4;
    public static final int RULE_OL_COMMENT=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLedsCodeV001Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLedsCodeV001Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLedsCodeV001Parser.tokenNames; }
    public String getGrammarFileName() { return "../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g"; }



     	private LedsCodeV001GrammarAccess grammarAccess;
     	
        public InternalLedsCodeV001Parser(TokenStream input, LedsCodeV001GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LedsCodeDSL";	
       	}
       	
       	@Override
       	protected LedsCodeV001GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLedsCodeDSL"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:67:1: entryRuleLedsCodeDSL returns [EObject current=null] : iv_ruleLedsCodeDSL= ruleLedsCodeDSL EOF ;
    public final EObject entryRuleLedsCodeDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLedsCodeDSL = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:68:2: (iv_ruleLedsCodeDSL= ruleLedsCodeDSL EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:69:2: iv_ruleLedsCodeDSL= ruleLedsCodeDSL EOF
            {
             newCompositeNode(grammarAccess.getLedsCodeDSLRule()); 
            pushFollow(FOLLOW_ruleLedsCodeDSL_in_entryRuleLedsCodeDSL75);
            iv_ruleLedsCodeDSL=ruleLedsCodeDSL();

            state._fsp--;

             current =iv_ruleLedsCodeDSL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLedsCodeDSL85); 

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
    // $ANTLR end "entryRuleLedsCodeDSL"


    // $ANTLR start "ruleLedsCodeDSL"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:76:1: ruleLedsCodeDSL returns [EObject current=null] : ( ( (lv_application_0_0= ruleApplication ) ) | ( ruleModuleAplication )+ ) ;
    public final EObject ruleLedsCodeDSL() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:79:28: ( ( ( (lv_application_0_0= ruleApplication ) ) | ( ruleModuleAplication )+ ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:80:1: ( ( (lv_application_0_0= ruleApplication ) ) | ( ruleModuleAplication )+ )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:80:1: ( ( (lv_application_0_0= ruleApplication ) ) | ( ruleModuleAplication )+ )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:80:2: ( (lv_application_0_0= ruleApplication ) )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:80:2: ( (lv_application_0_0= ruleApplication ) )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:81:1: (lv_application_0_0= ruleApplication )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:81:1: (lv_application_0_0= ruleApplication )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:82:3: lv_application_0_0= ruleApplication
                    {
                     
                    	        newCompositeNode(grammarAccess.getLedsCodeDSLAccess().getApplicationApplicationParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleApplication_in_ruleLedsCodeDSL131);
                    lv_application_0_0=ruleApplication();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLedsCodeDSLRule());
                    	        }
                           		set(
                           			current, 
                           			"application",
                            		lv_application_0_0, 
                            		"Application");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:99:6: ( ruleModuleAplication )+
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:99:6: ( ruleModuleAplication )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:100:5: ruleModuleAplication
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getLedsCodeDSLAccess().getModuleAplicationParserRuleCall_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleModuleAplication_in_ruleLedsCodeDSL154);
                    	    ruleModuleAplication();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


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
    // $ANTLR end "ruleLedsCodeDSL"


    // $ANTLR start "entryRuleApplication"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:115:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:116:2: (iv_ruleApplication= ruleApplication EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:117:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication191);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication201); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:124:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'app' otherlv_1= '{' ( (lv_nameApplication_2_0= ruleNameApplication ) ) ( (lv_language_3_0= ruleLanguage ) ) ( (lv_framework_4_0= ruleFramework ) ) ( (lv_orm_5_0= ruleORM ) ) ( (lv_database_6_0= ruleDataBase ) ) ruleModuleAplication otherlv_8= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_8=null;
        EObject lv_nameApplication_2_0 = null;

        EObject lv_language_3_0 = null;

        EObject lv_framework_4_0 = null;

        EObject lv_orm_5_0 = null;

        EObject lv_database_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:127:28: ( (otherlv_0= 'app' otherlv_1= '{' ( (lv_nameApplication_2_0= ruleNameApplication ) ) ( (lv_language_3_0= ruleLanguage ) ) ( (lv_framework_4_0= ruleFramework ) ) ( (lv_orm_5_0= ruleORM ) ) ( (lv_database_6_0= ruleDataBase ) ) ruleModuleAplication otherlv_8= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:128:1: (otherlv_0= 'app' otherlv_1= '{' ( (lv_nameApplication_2_0= ruleNameApplication ) ) ( (lv_language_3_0= ruleLanguage ) ) ( (lv_framework_4_0= ruleFramework ) ) ( (lv_orm_5_0= ruleORM ) ) ( (lv_database_6_0= ruleDataBase ) ) ruleModuleAplication otherlv_8= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:128:1: (otherlv_0= 'app' otherlv_1= '{' ( (lv_nameApplication_2_0= ruleNameApplication ) ) ( (lv_language_3_0= ruleLanguage ) ) ( (lv_framework_4_0= ruleFramework ) ) ( (lv_orm_5_0= ruleORM ) ) ( (lv_database_6_0= ruleDataBase ) ) ruleModuleAplication otherlv_8= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:128:3: otherlv_0= 'app' otherlv_1= '{' ( (lv_nameApplication_2_0= ruleNameApplication ) ) ( (lv_language_3_0= ruleLanguage ) ) ( (lv_framework_4_0= ruleFramework ) ) ( (lv_orm_5_0= ruleORM ) ) ( (lv_database_6_0= ruleDataBase ) ) ruleModuleAplication otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleApplication238); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getAppKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleApplication250); 

                	newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_1());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:136:1: ( (lv_nameApplication_2_0= ruleNameApplication ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:137:1: (lv_nameApplication_2_0= ruleNameApplication )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:137:1: (lv_nameApplication_2_0= ruleNameApplication )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:138:3: lv_nameApplication_2_0= ruleNameApplication
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getNameApplicationNameApplicationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNameApplication_in_ruleApplication271);
            lv_nameApplication_2_0=ruleNameApplication();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"nameApplication",
                    		lv_nameApplication_2_0, 
                    		"NameApplication");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:154:2: ( (lv_language_3_0= ruleLanguage ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:155:1: (lv_language_3_0= ruleLanguage )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:155:1: (lv_language_3_0= ruleLanguage )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:156:3: lv_language_3_0= ruleLanguage
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getLanguageLanguageParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLanguage_in_ruleApplication292);
            lv_language_3_0=ruleLanguage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"language",
                    		lv_language_3_0, 
                    		"Language");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:172:2: ( (lv_framework_4_0= ruleFramework ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:173:1: (lv_framework_4_0= ruleFramework )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:173:1: (lv_framework_4_0= ruleFramework )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:174:3: lv_framework_4_0= ruleFramework
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getFrameworkFrameworkParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFramework_in_ruleApplication313);
            lv_framework_4_0=ruleFramework();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"framework",
                    		lv_framework_4_0, 
                    		"Framework");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:190:2: ( (lv_orm_5_0= ruleORM ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:191:1: (lv_orm_5_0= ruleORM )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:191:1: (lv_orm_5_0= ruleORM )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:192:3: lv_orm_5_0= ruleORM
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getOrmORMParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleORM_in_ruleApplication334);
            lv_orm_5_0=ruleORM();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"orm",
                    		lv_orm_5_0, 
                    		"ORM");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:208:2: ( (lv_database_6_0= ruleDataBase ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:209:1: (lv_database_6_0= ruleDataBase )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:209:1: (lv_database_6_0= ruleDataBase )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:210:3: lv_database_6_0= ruleDataBase
            {
             
            	        newCompositeNode(grammarAccess.getApplicationAccess().getDatabaseDataBaseParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleDataBase_in_ruleApplication355);
            lv_database_6_0=ruleDataBase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationRule());
            	        }
                   		set(
                   			current, 
                   			"database",
                    		lv_database_6_0, 
                    		"DataBase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getApplicationAccess().getModuleAplicationParserRuleCall_7()); 
                
            pushFollow(FOLLOW_ruleModuleAplication_in_ruleApplication371);
            ruleModuleAplication();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleApplication382); 

                	newLeafNode(otherlv_8, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleModuleAplication"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:246:1: entryRuleModuleAplication returns [String current=null] : iv_ruleModuleAplication= ruleModuleAplication EOF ;
    public final String entryRuleModuleAplication() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModuleAplication = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:247:2: (iv_ruleModuleAplication= ruleModuleAplication EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:248:2: iv_ruleModuleAplication= ruleModuleAplication EOF
            {
             newCompositeNode(grammarAccess.getModuleAplicationRule()); 
            pushFollow(FOLLOW_ruleModuleAplication_in_entryRuleModuleAplication419);
            iv_ruleModuleAplication=ruleModuleAplication();

            state._fsp--;

             current =iv_ruleModuleAplication.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleAplication430); 

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
    // $ANTLR end "entryRuleModuleAplication"


    // $ANTLR start "ruleModuleAplication"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:255:1: ruleModuleAplication returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'module' kw= '{' kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleModuleAplication() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:258:28: ( (kw= 'module' kw= '{' kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:259:1: (kw= 'module' kw= '{' kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:259:1: (kw= 'module' kw= '{' kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:260:2: kw= 'module' kw= '{' kw= '}'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleModuleAplication468); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getModuleAplicationAccess().getModuleKeyword_0()); 
                
            kw=(Token)match(input,14,FOLLOW_14_in_ruleModuleAplication481); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getModuleAplicationAccess().getLeftCurlyBracketKeyword_1()); 
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleModuleAplication494); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getModuleAplicationAccess().getRightCurlyBracketKeyword_2()); 
                

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
    // $ANTLR end "ruleModuleAplication"


    // $ANTLR start "entryRuleNameApplication"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:285:1: entryRuleNameApplication returns [EObject current=null] : iv_ruleNameApplication= ruleNameApplication EOF ;
    public final EObject entryRuleNameApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameApplication = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:286:2: (iv_ruleNameApplication= ruleNameApplication EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:287:2: iv_ruleNameApplication= ruleNameApplication EOF
            {
             newCompositeNode(grammarAccess.getNameApplicationRule()); 
            pushFollow(FOLLOW_ruleNameApplication_in_entryRuleNameApplication534);
            iv_ruleNameApplication=ruleNameApplication();

            state._fsp--;

             current =iv_ruleNameApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameApplication544); 

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
    // $ANTLR end "entryRuleNameApplication"


    // $ANTLR start "ruleNameApplication"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:294:1: ruleNameApplication returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= '=' ( (lv_name_2_0= RULE_UNQUOTED_STRING ) ) ) ;
    public final EObject ruleNameApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:297:28: ( (otherlv_0= 'name' otherlv_1= '=' ( (lv_name_2_0= RULE_UNQUOTED_STRING ) ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:298:1: (otherlv_0= 'name' otherlv_1= '=' ( (lv_name_2_0= RULE_UNQUOTED_STRING ) ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:298:1: (otherlv_0= 'name' otherlv_1= '=' ( (lv_name_2_0= RULE_UNQUOTED_STRING ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:298:3: otherlv_0= 'name' otherlv_1= '=' ( (lv_name_2_0= RULE_UNQUOTED_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleNameApplication581); 

                	newLeafNode(otherlv_0, grammarAccess.getNameApplicationAccess().getNameKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleNameApplication593); 

                	newLeafNode(otherlv_1, grammarAccess.getNameApplicationAccess().getEqualsSignKeyword_1());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:306:1: ( (lv_name_2_0= RULE_UNQUOTED_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:307:1: (lv_name_2_0= RULE_UNQUOTED_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:307:1: (lv_name_2_0= RULE_UNQUOTED_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:308:3: lv_name_2_0= RULE_UNQUOTED_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_UNQUOTED_STRING,FOLLOW_RULE_UNQUOTED_STRING_in_ruleNameApplication610); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNameApplicationAccess().getNameUNQUOTED_STRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNameApplicationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"UNQUOTED_STRING");
            	    

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
    // $ANTLR end "ruleNameApplication"


    // $ANTLR start "entryRuleLanguage"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:332:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:333:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:334:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage651);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage661); 

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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:341:1: ruleLanguage returns [EObject current=null] : (otherlv_0= 'language' this_Dictionary_1= ruleDictionary ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Dictionary_1 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:344:28: ( (otherlv_0= 'language' this_Dictionary_1= ruleDictionary ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:345:1: (otherlv_0= 'language' this_Dictionary_1= ruleDictionary )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:345:1: (otherlv_0= 'language' this_Dictionary_1= ruleDictionary )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:345:3: otherlv_0= 'language' this_Dictionary_1= ruleDictionary
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleLanguage698); 

                	newLeafNode(otherlv_0, grammarAccess.getLanguageAccess().getLanguageKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getLanguageAccess().getDictionaryParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleDictionary_in_ruleLanguage720);
            this_Dictionary_1=ruleDictionary();

            state._fsp--;

             
                    current = this_Dictionary_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleFramework"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:366:1: entryRuleFramework returns [EObject current=null] : iv_ruleFramework= ruleFramework EOF ;
    public final EObject entryRuleFramework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFramework = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:367:2: (iv_ruleFramework= ruleFramework EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:368:2: iv_ruleFramework= ruleFramework EOF
            {
             newCompositeNode(grammarAccess.getFrameworkRule()); 
            pushFollow(FOLLOW_ruleFramework_in_entryRuleFramework755);
            iv_ruleFramework=ruleFramework();

            state._fsp--;

             current =iv_ruleFramework; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFramework765); 

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
    // $ANTLR end "entryRuleFramework"


    // $ANTLR start "ruleFramework"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:375:1: ruleFramework returns [EObject current=null] : (otherlv_0= 'framework' this_Dictionary_1= ruleDictionary ) ;
    public final EObject ruleFramework() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Dictionary_1 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:378:28: ( (otherlv_0= 'framework' this_Dictionary_1= ruleDictionary ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:379:1: (otherlv_0= 'framework' this_Dictionary_1= ruleDictionary )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:379:1: (otherlv_0= 'framework' this_Dictionary_1= ruleDictionary )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:379:3: otherlv_0= 'framework' this_Dictionary_1= ruleDictionary
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleFramework802); 

                	newLeafNode(otherlv_0, grammarAccess.getFrameworkAccess().getFrameworkKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getFrameworkAccess().getDictionaryParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleDictionary_in_ruleFramework824);
            this_Dictionary_1=ruleDictionary();

            state._fsp--;

             
                    current = this_Dictionary_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleFramework"


    // $ANTLR start "entryRuleORM"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:400:1: entryRuleORM returns [EObject current=null] : iv_ruleORM= ruleORM EOF ;
    public final EObject entryRuleORM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORM = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:401:2: (iv_ruleORM= ruleORM EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:402:2: iv_ruleORM= ruleORM EOF
            {
             newCompositeNode(grammarAccess.getORMRule()); 
            pushFollow(FOLLOW_ruleORM_in_entryRuleORM859);
            iv_ruleORM=ruleORM();

            state._fsp--;

             current =iv_ruleORM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleORM869); 

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
    // $ANTLR end "entryRuleORM"


    // $ANTLR start "ruleORM"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:409:1: ruleORM returns [EObject current=null] : (otherlv_0= 'orm' this_Dictionary_1= ruleDictionary ) ;
    public final EObject ruleORM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Dictionary_1 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:412:28: ( (otherlv_0= 'orm' this_Dictionary_1= ruleDictionary ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:413:1: (otherlv_0= 'orm' this_Dictionary_1= ruleDictionary )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:413:1: (otherlv_0= 'orm' this_Dictionary_1= ruleDictionary )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:413:3: otherlv_0= 'orm' this_Dictionary_1= ruleDictionary
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleORM906); 

                	newLeafNode(otherlv_0, grammarAccess.getORMAccess().getOrmKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getORMAccess().getDictionaryParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleDictionary_in_ruleORM928);
            this_Dictionary_1=ruleDictionary();

            state._fsp--;

             
                    current = this_Dictionary_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleORM"


    // $ANTLR start "entryRuleDataBase"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:434:1: entryRuleDataBase returns [EObject current=null] : iv_ruleDataBase= ruleDataBase EOF ;
    public final EObject entryRuleDataBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataBase = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:435:2: (iv_ruleDataBase= ruleDataBase EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:436:2: iv_ruleDataBase= ruleDataBase EOF
            {
             newCompositeNode(grammarAccess.getDataBaseRule()); 
            pushFollow(FOLLOW_ruleDataBase_in_entryRuleDataBase963);
            iv_ruleDataBase=ruleDataBase();

            state._fsp--;

             current =iv_ruleDataBase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataBase973); 

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
    // $ANTLR end "entryRuleDataBase"


    // $ANTLR start "ruleDataBase"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:443:1: ruleDataBase returns [EObject current=null] : (otherlv_0= 'database' this_Dictionary_1= ruleDictionary ) ;
    public final EObject ruleDataBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Dictionary_1 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:446:28: ( (otherlv_0= 'database' this_Dictionary_1= ruleDictionary ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:447:1: (otherlv_0= 'database' this_Dictionary_1= ruleDictionary )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:447:1: (otherlv_0= 'database' this_Dictionary_1= ruleDictionary )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:447:3: otherlv_0= 'database' this_Dictionary_1= ruleDictionary
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleDataBase1010); 

                	newLeafNode(otherlv_0, grammarAccess.getDataBaseAccess().getDatabaseKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getDataBaseAccess().getDictionaryParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleDictionary_in_ruleDataBase1032);
            this_Dictionary_1=ruleDictionary();

            state._fsp--;

             
                    current = this_Dictionary_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleDataBase"


    // $ANTLR start "entryRuleDictionary"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:468:1: entryRuleDictionary returns [EObject current=null] : iv_ruleDictionary= ruleDictionary EOF ;
    public final EObject entryRuleDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionary = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:469:2: (iv_ruleDictionary= ruleDictionary EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:470:2: iv_ruleDictionary= ruleDictionary EOF
            {
             newCompositeNode(grammarAccess.getDictionaryRule()); 
            pushFollow(FOLLOW_ruleDictionary_in_entryRuleDictionary1067);
            iv_ruleDictionary=ruleDictionary();

            state._fsp--;

             current =iv_ruleDictionary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionary1077); 

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
    // $ANTLR end "entryRuleDictionary"


    // $ANTLR start "ruleDictionary"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:477:1: ruleDictionary returns [EObject current=null] : (otherlv_0= '{' ( (lv_elements_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleKeyValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:480:28: ( (otherlv_0= '{' ( (lv_elements_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleKeyValue ) ) )* otherlv_4= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:481:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleKeyValue ) ) )* otherlv_4= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:481:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleKeyValue ) ) )* otherlv_4= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:481:3: otherlv_0= '{' ( (lv_elements_1_0= ruleKeyValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleKeyValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDictionary1114); 

                	newLeafNode(otherlv_0, grammarAccess.getDictionaryAccess().getLeftCurlyBracketKeyword_0());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:485:1: ( (lv_elements_1_0= ruleKeyValue ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:486:1: (lv_elements_1_0= ruleKeyValue )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:486:1: (lv_elements_1_0= ruleKeyValue )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:487:3: lv_elements_1_0= ruleKeyValue
            {
             
            	        newCompositeNode(grammarAccess.getDictionaryAccess().getElementsKeyValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKeyValue_in_ruleDictionary1135);
            lv_elements_1_0=ruleKeyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDictionaryRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_1_0, 
                    		"KeyValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:503:2: (otherlv_2= ',' ( (lv_elements_3_0= ruleKeyValue ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:503:4: otherlv_2= ',' ( (lv_elements_3_0= ruleKeyValue ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleDictionary1148); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDictionaryAccess().getCommaKeyword_2_0());
            	        
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:507:1: ( (lv_elements_3_0= ruleKeyValue ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:508:1: (lv_elements_3_0= ruleKeyValue )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:508:1: (lv_elements_3_0= ruleKeyValue )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:509:3: lv_elements_3_0= ruleKeyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDictionaryAccess().getElementsKeyValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKeyValue_in_ruleDictionary1169);
            	    lv_elements_3_0=ruleKeyValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDictionaryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"KeyValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDictionary1183); 

                	newLeafNode(otherlv_4, grammarAccess.getDictionaryAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleDictionary"


    // $ANTLR start "entryRuleKeyValue"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:537:1: entryRuleKeyValue returns [EObject current=null] : iv_ruleKeyValue= ruleKeyValue EOF ;
    public final EObject entryRuleKeyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValue = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:538:2: (iv_ruleKeyValue= ruleKeyValue EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:539:2: iv_ruleKeyValue= ruleKeyValue EOF
            {
             newCompositeNode(grammarAccess.getKeyValueRule()); 
            pushFollow(FOLLOW_ruleKeyValue_in_entryRuleKeyValue1219);
            iv_ruleKeyValue=ruleKeyValue();

            state._fsp--;

             current =iv_ruleKeyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValue1229); 

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
    // $ANTLR end "entryRuleKeyValue"


    // $ANTLR start "ruleKeyValue"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:546:1: ruleKeyValue returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleKeyValue() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:549:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:550:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:550:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:550:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:550:2: ( (lv_key_0_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:551:1: (lv_key_0_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:551:1: (lv_key_0_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:552:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeyValue1271); 

            			newLeafNode(lv_key_0_0, grammarAccess.getKeyValueAccess().getKeyIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKeyValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleKeyValue1288); 

                	newLeafNode(otherlv_1, grammarAccess.getKeyValueAccess().getColonKeyword_1());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:572:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:573:1: (lv_value_2_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:573:1: (lv_value_2_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:574:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKeyValue1305); 

            			newLeafNode(lv_value_2_0, grammarAccess.getKeyValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKeyValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleKeyValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLedsCodeDSL_in_entryRuleLedsCodeDSL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLedsCodeDSL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleLedsCodeDSL131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleAplication_in_ruleLedsCodeDSL154 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleApplication238 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplication250 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleNameApplication_in_ruleApplication271 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleLanguage_in_ruleApplication292 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleFramework_in_ruleApplication313 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleORM_in_ruleApplication334 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleDataBase_in_ruleApplication355 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleModuleAplication_in_ruleApplication371 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplication382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleAplication_in_entryRuleModuleAplication419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleAplication430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleModuleAplication468 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModuleAplication481 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModuleAplication494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameApplication_in_entryRuleNameApplication534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameApplication544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNameApplication581 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNameApplication593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_UNQUOTED_STRING_in_ruleNameApplication610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleLanguage698 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDictionary_in_ruleLanguage720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFramework_in_entryRuleFramework755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFramework765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFramework802 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDictionary_in_ruleFramework824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORM_in_entryRuleORM859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleORM869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleORM906 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDictionary_in_ruleORM928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataBase_in_entryRuleDataBase963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataBase973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDataBase1010 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleDictionary_in_ruleDataBase1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_entryRuleDictionary1067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionary1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDictionary1114 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleKeyValue_in_ruleDictionary1135 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleDictionary1148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleKeyValue_in_ruleDictionary1169 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_15_in_ruleDictionary1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValue_in_entryRuleKeyValue1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValue1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeyValue1271 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleKeyValue1288 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKeyValue1305 = new BitSet(new long[]{0x0000000000000002L});

}