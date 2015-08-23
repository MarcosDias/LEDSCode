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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'{'", "'}'", "'interface'", "'HtmlView'", "'RestFull'", "'=>'", "'infrastructure'", "'basePackage'", "'='", "'projectVersion'", "'language'", "'framework'", "'orm'", "'database'", "'@version'", "':'", "','", "'@name'", "'@user'", "'@pass'", "'@host'", "'@env'", "'application'", "'composedBy'", "'domain'", "'module'", "'service'", "'abstract'", "'entity'", "'@pk'", "'@unique'", "'('", "')'", "'@null'", "'@min'", "'@max'", "'@between'", "'repository'", "'enum'", "'String'", "'int'", "'Integer'", "'long'", "'Long'", "'boolean'", "'Boolean'", "'DateTime'", "'double'", "'Double'", "'float'", "'Float'", "'Object'", "'List'", "'<'", "'>'", "'Set'", "'-'", "'private'", "'#'", "'protected'", "'.*'", "'.'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:76:1: ruleLedsCodeDSL returns [EObject current=null] : ( (lv_project_0_0= ruleProject ) ) ;
    public final EObject ruleLedsCodeDSL() throws RecognitionException {
        EObject current = null;

        EObject lv_project_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:79:28: ( ( (lv_project_0_0= ruleProject ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:80:1: ( (lv_project_0_0= ruleProject ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:80:1: ( (lv_project_0_0= ruleProject ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:81:1: (lv_project_0_0= ruleProject )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:81:1: (lv_project_0_0= ruleProject )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:82:3: lv_project_0_0= ruleProject
            {
             
            	        newCompositeNode(grammarAccess.getLedsCodeDSLAccess().getProjectProjectParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleProject_in_ruleLedsCodeDSL130);
            lv_project_0_0=ruleProject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLedsCodeDSLRule());
            	        }
                   		add(
                   			current, 
                   			"project",
                    		lv_project_0_0, 
                    		"Project");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleLedsCodeDSL"


    // $ANTLR start "entryRuleProject"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:106:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:107:2: (iv_ruleProject= ruleProject EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:108:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject165);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject175); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:115:1: ruleProject returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_infrastructureBlock_3_0= ruleInfrastructureBlock ) ) ( (lv_interfaceBlock_4_0= ruleInterfaceBlock ) )? ( (lv_applicationBlock_5_0= ruleApplicationBlock ) )* ( (lv_domainBlock_6_0= ruleDomainBlock ) )+ otherlv_7= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_infrastructureBlock_3_0 = null;

        EObject lv_interfaceBlock_4_0 = null;

        EObject lv_applicationBlock_5_0 = null;

        EObject lv_domainBlock_6_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:118:28: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_infrastructureBlock_3_0= ruleInfrastructureBlock ) ) ( (lv_interfaceBlock_4_0= ruleInterfaceBlock ) )? ( (lv_applicationBlock_5_0= ruleApplicationBlock ) )* ( (lv_domainBlock_6_0= ruleDomainBlock ) )+ otherlv_7= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:119:1: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_infrastructureBlock_3_0= ruleInfrastructureBlock ) ) ( (lv_interfaceBlock_4_0= ruleInterfaceBlock ) )? ( (lv_applicationBlock_5_0= ruleApplicationBlock ) )* ( (lv_domainBlock_6_0= ruleDomainBlock ) )+ otherlv_7= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:119:1: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_infrastructureBlock_3_0= ruleInfrastructureBlock ) ) ( (lv_interfaceBlock_4_0= ruleInterfaceBlock ) )? ( (lv_applicationBlock_5_0= ruleApplicationBlock ) )* ( (lv_domainBlock_6_0= ruleDomainBlock ) )+ otherlv_7= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:119:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_infrastructureBlock_3_0= ruleInfrastructureBlock ) ) ( (lv_interfaceBlock_4_0= ruleInterfaceBlock ) )? ( (lv_applicationBlock_5_0= ruleApplicationBlock ) )* ( (lv_domainBlock_6_0= ruleDomainBlock ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleProject212); 

                	newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:124:1: (lv_name_1_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject229); 

            			newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getProjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProject246); 

                	newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:145:1: ( (lv_infrastructureBlock_3_0= ruleInfrastructureBlock ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:146:1: (lv_infrastructureBlock_3_0= ruleInfrastructureBlock )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:146:1: (lv_infrastructureBlock_3_0= ruleInfrastructureBlock )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:147:3: lv_infrastructureBlock_3_0= ruleInfrastructureBlock
            {
             
            	        newCompositeNode(grammarAccess.getProjectAccess().getInfrastructureBlockInfrastructureBlockParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInfrastructureBlock_in_ruleProject267);
            lv_infrastructureBlock_3_0=ruleInfrastructureBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	        }
                   		set(
                   			current, 
                   			"infrastructureBlock",
                    		lv_infrastructureBlock_3_0, 
                    		"InfrastructureBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:163:2: ( (lv_interfaceBlock_4_0= ruleInterfaceBlock ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:164:1: (lv_interfaceBlock_4_0= ruleInterfaceBlock )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:164:1: (lv_interfaceBlock_4_0= ruleInterfaceBlock )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:165:3: lv_interfaceBlock_4_0= ruleInterfaceBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getProjectAccess().getInterfaceBlockInterfaceBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInterfaceBlock_in_ruleProject288);
                    lv_interfaceBlock_4_0=ruleInterfaceBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProjectRule());
                    	        }
                           		set(
                           			current, 
                           			"interfaceBlock",
                            		lv_interfaceBlock_4_0, 
                            		"InterfaceBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:181:3: ( (lv_applicationBlock_5_0= ruleApplicationBlock ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:182:1: (lv_applicationBlock_5_0= ruleApplicationBlock )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:182:1: (lv_applicationBlock_5_0= ruleApplicationBlock )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:183:3: lv_applicationBlock_5_0= ruleApplicationBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getApplicationBlockApplicationBlockParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleApplicationBlock_in_ruleProject310);
            	    lv_applicationBlock_5_0=ruleApplicationBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"applicationBlock",
            	            		lv_applicationBlock_5_0, 
            	            		"ApplicationBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:199:3: ( (lv_domainBlock_6_0= ruleDomainBlock ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:200:1: (lv_domainBlock_6_0= ruleDomainBlock )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:200:1: (lv_domainBlock_6_0= ruleDomainBlock )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:201:3: lv_domainBlock_6_0= ruleDomainBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProjectAccess().getDomainBlockDomainBlockParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDomainBlock_in_ruleProject332);
            	    lv_domainBlock_6_0=ruleDomainBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"domainBlock",
            	            		lv_domainBlock_6_0, 
            	            		"DomainBlock");
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

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleProject345); 

                	newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleInterfaceBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:229:1: entryRuleInterfaceBlock returns [EObject current=null] : iv_ruleInterfaceBlock= ruleInterfaceBlock EOF ;
    public final EObject entryRuleInterfaceBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:230:2: (iv_ruleInterfaceBlock= ruleInterfaceBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:231:2: iv_ruleInterfaceBlock= ruleInterfaceBlock EOF
            {
             newCompositeNode(grammarAccess.getInterfaceBlockRule()); 
            pushFollow(FOLLOW_ruleInterfaceBlock_in_entryRuleInterfaceBlock381);
            iv_ruleInterfaceBlock=ruleInterfaceBlock();

            state._fsp--;

             current =iv_ruleInterfaceBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceBlock391); 

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
    // $ANTLR end "entryRuleInterfaceBlock"


    // $ANTLR start "ruleInterfaceBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:238:1: ruleInterfaceBlock returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaceApplication_3_0= ruleInterfaceApplication ) )* otherlv_4= '}' ) ;
    public final EObject ruleInterfaceBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_interfaceApplication_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:241:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaceApplication_3_0= ruleInterfaceApplication ) )* otherlv_4= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:242:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaceApplication_3_0= ruleInterfaceApplication ) )* otherlv_4= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:242:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaceApplication_3_0= ruleInterfaceApplication ) )* otherlv_4= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:242:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaceApplication_3_0= ruleInterfaceApplication ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleInterfaceBlock428); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceBlockAccess().getInterfaceKeyword_0());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:246:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:247:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:247:1: (lv_name_1_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:248:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceBlock445); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterfaceBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInterfaceBlock462); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:268:1: ( (lv_interfaceApplication_3_0= ruleInterfaceApplication ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:269:1: (lv_interfaceApplication_3_0= ruleInterfaceApplication )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:269:1: (lv_interfaceApplication_3_0= ruleInterfaceApplication )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:270:3: lv_interfaceApplication_3_0= ruleInterfaceApplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceBlockAccess().getInterfaceApplicationInterfaceApplicationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterfaceApplication_in_ruleInterfaceBlock483);
            	    lv_interfaceApplication_3_0=ruleInterfaceApplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interfaceApplication",
            	            		lv_interfaceApplication_3_0, 
            	            		"InterfaceApplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleInterfaceBlock496); 

                	newLeafNode(otherlv_4, grammarAccess.getInterfaceBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleInterfaceBlock"


    // $ANTLR start "entryRuleInterfaceApplication"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:298:1: entryRuleInterfaceApplication returns [EObject current=null] : iv_ruleInterfaceApplication= ruleInterfaceApplication EOF ;
    public final EObject entryRuleInterfaceApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceApplication = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:299:2: (iv_ruleInterfaceApplication= ruleInterfaceApplication EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:300:2: iv_ruleInterfaceApplication= ruleInterfaceApplication EOF
            {
             newCompositeNode(grammarAccess.getInterfaceApplicationRule()); 
            pushFollow(FOLLOW_ruleInterfaceApplication_in_entryRuleInterfaceApplication532);
            iv_ruleInterfaceApplication=ruleInterfaceApplication();

            state._fsp--;

             current =iv_ruleInterfaceApplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceApplication542); 

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
    // $ANTLR end "entryRuleInterfaceApplication"


    // $ANTLR start "ruleInterfaceApplication"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:307:1: ruleInterfaceApplication returns [EObject current=null] : ( ( ( (lv_type_0_1= 'HtmlView' | lv_type_0_2= 'RestFull' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_nameApp_3_0= RULE_ID ) ) ) ;
    public final EObject ruleInterfaceApplication() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_nameApp_3_0=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:310:28: ( ( ( ( (lv_type_0_1= 'HtmlView' | lv_type_0_2= 'RestFull' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_nameApp_3_0= RULE_ID ) ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:311:1: ( ( ( (lv_type_0_1= 'HtmlView' | lv_type_0_2= 'RestFull' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_nameApp_3_0= RULE_ID ) ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:311:1: ( ( ( (lv_type_0_1= 'HtmlView' | lv_type_0_2= 'RestFull' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_nameApp_3_0= RULE_ID ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:311:2: ( ( (lv_type_0_1= 'HtmlView' | lv_type_0_2= 'RestFull' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=>' ( (lv_nameApp_3_0= RULE_ID ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:311:2: ( ( (lv_type_0_1= 'HtmlView' | lv_type_0_2= 'RestFull' ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:312:1: ( (lv_type_0_1= 'HtmlView' | lv_type_0_2= 'RestFull' ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:312:1: ( (lv_type_0_1= 'HtmlView' | lv_type_0_2= 'RestFull' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:313:1: (lv_type_0_1= 'HtmlView' | lv_type_0_2= 'RestFull' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:313:1: (lv_type_0_1= 'HtmlView' | lv_type_0_2= 'RestFull' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:314:3: lv_type_0_1= 'HtmlView'
                    {
                    lv_type_0_1=(Token)match(input,15,FOLLOW_15_in_ruleInterfaceApplication587); 

                            newLeafNode(lv_type_0_1, grammarAccess.getInterfaceApplicationAccess().getTypeHtmlViewKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceApplicationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:326:8: lv_type_0_2= 'RestFull'
                    {
                    lv_type_0_2=(Token)match(input,16,FOLLOW_16_in_ruleInterfaceApplication616); 

                            newLeafNode(lv_type_0_2, grammarAccess.getInterfaceApplicationAccess().getTypeRestFullKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceApplicationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:341:2: ( (lv_name_1_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:342:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:342:1: (lv_name_1_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:343:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceApplication649); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterfaceApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceApplicationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleInterfaceApplication666); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceApplicationAccess().getEqualsSignGreaterThanSignKeyword_2());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:363:1: ( (lv_nameApp_3_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:364:1: (lv_nameApp_3_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:364:1: (lv_nameApp_3_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:365:3: lv_nameApp_3_0= RULE_ID
            {
            lv_nameApp_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceApplication683); 

            			newLeafNode(lv_nameApp_3_0, grammarAccess.getInterfaceApplicationAccess().getNameAppIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceApplicationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nameApp",
                    		lv_nameApp_3_0, 
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
    // $ANTLR end "ruleInterfaceApplication"


    // $ANTLR start "entryRuleInfrastructureBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:389:1: entryRuleInfrastructureBlock returns [EObject current=null] : iv_ruleInfrastructureBlock= ruleInfrastructureBlock EOF ;
    public final EObject entryRuleInfrastructureBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfrastructureBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:390:2: (iv_ruleInfrastructureBlock= ruleInfrastructureBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:391:2: iv_ruleInfrastructureBlock= ruleInfrastructureBlock EOF
            {
             newCompositeNode(grammarAccess.getInfrastructureBlockRule()); 
            pushFollow(FOLLOW_ruleInfrastructureBlock_in_entryRuleInfrastructureBlock724);
            iv_ruleInfrastructureBlock=ruleInfrastructureBlock();

            state._fsp--;

             current =iv_ruleInfrastructureBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfrastructureBlock734); 

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
    // $ANTLR end "entryRuleInfrastructureBlock"


    // $ANTLR start "ruleInfrastructureBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:398:1: ruleInfrastructureBlock returns [EObject current=null] : (otherlv_0= 'infrastructure' otherlv_1= '{' otherlv_2= 'basePackage' otherlv_3= '=' ( (lv_basePackage_4_0= RULE_STRING ) ) otherlv_5= 'projectVersion' otherlv_6= '=' ( (lv_projectVersion_7_0= RULE_STRING ) ) otherlv_8= 'language' otherlv_9= '=' otherlv_10= '{' ( (lv_language_11_0= ruleNameVersion ) ) otherlv_12= '}' otherlv_13= 'framework' otherlv_14= '=' otherlv_15= '{' ( (lv_framework_16_0= ruleNameVersion ) ) otherlv_17= '}' otherlv_18= 'orm' otherlv_19= '=' otherlv_20= '{' ( (lv_orm_21_0= ruleNameVersion ) ) otherlv_22= '}' otherlv_23= 'database' otherlv_24= '=' otherlv_25= '{' ( (lv_database_26_0= ruleDatabase ) ) otherlv_27= '}' otherlv_28= '}' ) ;
    public final EObject ruleInfrastructureBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_basePackage_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_projectVersion_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        EObject lv_language_11_0 = null;

        EObject lv_framework_16_0 = null;

        EObject lv_orm_21_0 = null;

        EObject lv_database_26_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:401:28: ( (otherlv_0= 'infrastructure' otherlv_1= '{' otherlv_2= 'basePackage' otherlv_3= '=' ( (lv_basePackage_4_0= RULE_STRING ) ) otherlv_5= 'projectVersion' otherlv_6= '=' ( (lv_projectVersion_7_0= RULE_STRING ) ) otherlv_8= 'language' otherlv_9= '=' otherlv_10= '{' ( (lv_language_11_0= ruleNameVersion ) ) otherlv_12= '}' otherlv_13= 'framework' otherlv_14= '=' otherlv_15= '{' ( (lv_framework_16_0= ruleNameVersion ) ) otherlv_17= '}' otherlv_18= 'orm' otherlv_19= '=' otherlv_20= '{' ( (lv_orm_21_0= ruleNameVersion ) ) otherlv_22= '}' otherlv_23= 'database' otherlv_24= '=' otherlv_25= '{' ( (lv_database_26_0= ruleDatabase ) ) otherlv_27= '}' otherlv_28= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:402:1: (otherlv_0= 'infrastructure' otherlv_1= '{' otherlv_2= 'basePackage' otherlv_3= '=' ( (lv_basePackage_4_0= RULE_STRING ) ) otherlv_5= 'projectVersion' otherlv_6= '=' ( (lv_projectVersion_7_0= RULE_STRING ) ) otherlv_8= 'language' otherlv_9= '=' otherlv_10= '{' ( (lv_language_11_0= ruleNameVersion ) ) otherlv_12= '}' otherlv_13= 'framework' otherlv_14= '=' otherlv_15= '{' ( (lv_framework_16_0= ruleNameVersion ) ) otherlv_17= '}' otherlv_18= 'orm' otherlv_19= '=' otherlv_20= '{' ( (lv_orm_21_0= ruleNameVersion ) ) otherlv_22= '}' otherlv_23= 'database' otherlv_24= '=' otherlv_25= '{' ( (lv_database_26_0= ruleDatabase ) ) otherlv_27= '}' otherlv_28= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:402:1: (otherlv_0= 'infrastructure' otherlv_1= '{' otherlv_2= 'basePackage' otherlv_3= '=' ( (lv_basePackage_4_0= RULE_STRING ) ) otherlv_5= 'projectVersion' otherlv_6= '=' ( (lv_projectVersion_7_0= RULE_STRING ) ) otherlv_8= 'language' otherlv_9= '=' otherlv_10= '{' ( (lv_language_11_0= ruleNameVersion ) ) otherlv_12= '}' otherlv_13= 'framework' otherlv_14= '=' otherlv_15= '{' ( (lv_framework_16_0= ruleNameVersion ) ) otherlv_17= '}' otherlv_18= 'orm' otherlv_19= '=' otherlv_20= '{' ( (lv_orm_21_0= ruleNameVersion ) ) otherlv_22= '}' otherlv_23= 'database' otherlv_24= '=' otherlv_25= '{' ( (lv_database_26_0= ruleDatabase ) ) otherlv_27= '}' otherlv_28= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:402:3: otherlv_0= 'infrastructure' otherlv_1= '{' otherlv_2= 'basePackage' otherlv_3= '=' ( (lv_basePackage_4_0= RULE_STRING ) ) otherlv_5= 'projectVersion' otherlv_6= '=' ( (lv_projectVersion_7_0= RULE_STRING ) ) otherlv_8= 'language' otherlv_9= '=' otherlv_10= '{' ( (lv_language_11_0= ruleNameVersion ) ) otherlv_12= '}' otherlv_13= 'framework' otherlv_14= '=' otherlv_15= '{' ( (lv_framework_16_0= ruleNameVersion ) ) otherlv_17= '}' otherlv_18= 'orm' otherlv_19= '=' otherlv_20= '{' ( (lv_orm_21_0= ruleNameVersion ) ) otherlv_22= '}' otherlv_23= 'database' otherlv_24= '=' otherlv_25= '{' ( (lv_database_26_0= ruleDatabase ) ) otherlv_27= '}' otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleInfrastructureBlock771); 

                	newLeafNode(otherlv_0, grammarAccess.getInfrastructureBlockAccess().getInfrastructureKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInfrastructureBlock783); 

                	newLeafNode(otherlv_1, grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleInfrastructureBlock795); 

                	newLeafNode(otherlv_2, grammarAccess.getInfrastructureBlockAccess().getBasePackageKeyword_2());
                
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleInfrastructureBlock807); 

                	newLeafNode(otherlv_3, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_3());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:418:1: ( (lv_basePackage_4_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:419:1: (lv_basePackage_4_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:419:1: (lv_basePackage_4_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:420:3: lv_basePackage_4_0= RULE_STRING
            {
            lv_basePackage_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInfrastructureBlock824); 

            			newLeafNode(lv_basePackage_4_0, grammarAccess.getInfrastructureBlockAccess().getBasePackageSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInfrastructureBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"basePackage",
                    		lv_basePackage_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleInfrastructureBlock841); 

                	newLeafNode(otherlv_5, grammarAccess.getInfrastructureBlockAccess().getProjectVersionKeyword_5());
                
            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleInfrastructureBlock853); 

                	newLeafNode(otherlv_6, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_6());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:444:1: ( (lv_projectVersion_7_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:445:1: (lv_projectVersion_7_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:445:1: (lv_projectVersion_7_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:446:3: lv_projectVersion_7_0= RULE_STRING
            {
            lv_projectVersion_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInfrastructureBlock870); 

            			newLeafNode(lv_projectVersion_7_0, grammarAccess.getInfrastructureBlockAccess().getProjectVersionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInfrastructureBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"projectVersion",
                    		lv_projectVersion_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleInfrastructureBlock887); 

                	newLeafNode(otherlv_8, grammarAccess.getInfrastructureBlockAccess().getLanguageKeyword_8());
                
            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleInfrastructureBlock899); 

                	newLeafNode(otherlv_9, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_9());
                
            otherlv_10=(Token)match(input,12,FOLLOW_12_in_ruleInfrastructureBlock911); 

                	newLeafNode(otherlv_10, grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_10());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:474:1: ( (lv_language_11_0= ruleNameVersion ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:475:1: (lv_language_11_0= ruleNameVersion )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:475:1: (lv_language_11_0= ruleNameVersion )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:476:3: lv_language_11_0= ruleNameVersion
            {
             
            	        newCompositeNode(grammarAccess.getInfrastructureBlockAccess().getLanguageNameVersionParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleNameVersion_in_ruleInfrastructureBlock932);
            lv_language_11_0=ruleNameVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInfrastructureBlockRule());
            	        }
                   		set(
                   			current, 
                   			"language",
                    		lv_language_11_0, 
                    		"NameVersion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleInfrastructureBlock944); 

                	newLeafNode(otherlv_12, grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleInfrastructureBlock956); 

                	newLeafNode(otherlv_13, grammarAccess.getInfrastructureBlockAccess().getFrameworkKeyword_13());
                
            otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleInfrastructureBlock968); 

                	newLeafNode(otherlv_14, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_14());
                
            otherlv_15=(Token)match(input,12,FOLLOW_12_in_ruleInfrastructureBlock980); 

                	newLeafNode(otherlv_15, grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_15());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:508:1: ( (lv_framework_16_0= ruleNameVersion ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:509:1: (lv_framework_16_0= ruleNameVersion )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:509:1: (lv_framework_16_0= ruleNameVersion )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:510:3: lv_framework_16_0= ruleNameVersion
            {
             
            	        newCompositeNode(grammarAccess.getInfrastructureBlockAccess().getFrameworkNameVersionParserRuleCall_16_0()); 
            	    
            pushFollow(FOLLOW_ruleNameVersion_in_ruleInfrastructureBlock1001);
            lv_framework_16_0=ruleNameVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInfrastructureBlockRule());
            	        }
                   		set(
                   			current, 
                   			"framework",
                    		lv_framework_16_0, 
                    		"NameVersion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleInfrastructureBlock1013); 

                	newLeafNode(otherlv_17, grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_17());
                
            otherlv_18=(Token)match(input,24,FOLLOW_24_in_ruleInfrastructureBlock1025); 

                	newLeafNode(otherlv_18, grammarAccess.getInfrastructureBlockAccess().getOrmKeyword_18());
                
            otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleInfrastructureBlock1037); 

                	newLeafNode(otherlv_19, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_19());
                
            otherlv_20=(Token)match(input,12,FOLLOW_12_in_ruleInfrastructureBlock1049); 

                	newLeafNode(otherlv_20, grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_20());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:542:1: ( (lv_orm_21_0= ruleNameVersion ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:543:1: (lv_orm_21_0= ruleNameVersion )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:543:1: (lv_orm_21_0= ruleNameVersion )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:544:3: lv_orm_21_0= ruleNameVersion
            {
             
            	        newCompositeNode(grammarAccess.getInfrastructureBlockAccess().getOrmNameVersionParserRuleCall_21_0()); 
            	    
            pushFollow(FOLLOW_ruleNameVersion_in_ruleInfrastructureBlock1070);
            lv_orm_21_0=ruleNameVersion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInfrastructureBlockRule());
            	        }
                   		set(
                   			current, 
                   			"orm",
                    		lv_orm_21_0, 
                    		"NameVersion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_22=(Token)match(input,13,FOLLOW_13_in_ruleInfrastructureBlock1082); 

                	newLeafNode(otherlv_22, grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_22());
                
            otherlv_23=(Token)match(input,25,FOLLOW_25_in_ruleInfrastructureBlock1094); 

                	newLeafNode(otherlv_23, grammarAccess.getInfrastructureBlockAccess().getDatabaseKeyword_23());
                
            otherlv_24=(Token)match(input,20,FOLLOW_20_in_ruleInfrastructureBlock1106); 

                	newLeafNode(otherlv_24, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_24());
                
            otherlv_25=(Token)match(input,12,FOLLOW_12_in_ruleInfrastructureBlock1118); 

                	newLeafNode(otherlv_25, grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_25());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:576:1: ( (lv_database_26_0= ruleDatabase ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:577:1: (lv_database_26_0= ruleDatabase )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:577:1: (lv_database_26_0= ruleDatabase )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:578:3: lv_database_26_0= ruleDatabase
            {
             
            	        newCompositeNode(grammarAccess.getInfrastructureBlockAccess().getDatabaseDatabaseParserRuleCall_26_0()); 
            	    
            pushFollow(FOLLOW_ruleDatabase_in_ruleInfrastructureBlock1139);
            lv_database_26_0=ruleDatabase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInfrastructureBlockRule());
            	        }
                   		set(
                   			current, 
                   			"database",
                    		lv_database_26_0, 
                    		"Database");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_27=(Token)match(input,13,FOLLOW_13_in_ruleInfrastructureBlock1151); 

                	newLeafNode(otherlv_27, grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_27());
                
            otherlv_28=(Token)match(input,13,FOLLOW_13_in_ruleInfrastructureBlock1163); 

                	newLeafNode(otherlv_28, grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_28());
                

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
    // $ANTLR end "ruleInfrastructureBlock"


    // $ANTLR start "entryRuleDatabase"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:610:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:611:2: (iv_ruleDatabase= ruleDatabase EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:612:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase1199);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase1209); 

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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:619:1: ruleDatabase returns [EObject current=null] : (otherlv_0= '@version' otherlv_1= ':' ( (lv_versionValue_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= '@name' otherlv_5= ':' ( (lv_nameValue_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= '@user' otherlv_9= ':' ( (lv_userValue_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= '@pass' otherlv_13= ':' ( (lv_passValue_14_0= RULE_STRING ) ) otherlv_15= ',' otherlv_16= '@host' otherlv_17= ':' ( (lv_hostValue_18_0= RULE_STRING ) ) otherlv_19= ',' otherlv_20= '@env' otherlv_21= ':' ( (lv_envValue_22_0= RULE_STRING ) ) ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_versionValue_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_nameValue_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_userValue_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_passValue_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_hostValue_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_envValue_22_0=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:622:28: ( (otherlv_0= '@version' otherlv_1= ':' ( (lv_versionValue_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= '@name' otherlv_5= ':' ( (lv_nameValue_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= '@user' otherlv_9= ':' ( (lv_userValue_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= '@pass' otherlv_13= ':' ( (lv_passValue_14_0= RULE_STRING ) ) otherlv_15= ',' otherlv_16= '@host' otherlv_17= ':' ( (lv_hostValue_18_0= RULE_STRING ) ) otherlv_19= ',' otherlv_20= '@env' otherlv_21= ':' ( (lv_envValue_22_0= RULE_STRING ) ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:623:1: (otherlv_0= '@version' otherlv_1= ':' ( (lv_versionValue_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= '@name' otherlv_5= ':' ( (lv_nameValue_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= '@user' otherlv_9= ':' ( (lv_userValue_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= '@pass' otherlv_13= ':' ( (lv_passValue_14_0= RULE_STRING ) ) otherlv_15= ',' otherlv_16= '@host' otherlv_17= ':' ( (lv_hostValue_18_0= RULE_STRING ) ) otherlv_19= ',' otherlv_20= '@env' otherlv_21= ':' ( (lv_envValue_22_0= RULE_STRING ) ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:623:1: (otherlv_0= '@version' otherlv_1= ':' ( (lv_versionValue_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= '@name' otherlv_5= ':' ( (lv_nameValue_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= '@user' otherlv_9= ':' ( (lv_userValue_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= '@pass' otherlv_13= ':' ( (lv_passValue_14_0= RULE_STRING ) ) otherlv_15= ',' otherlv_16= '@host' otherlv_17= ':' ( (lv_hostValue_18_0= RULE_STRING ) ) otherlv_19= ',' otherlv_20= '@env' otherlv_21= ':' ( (lv_envValue_22_0= RULE_STRING ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:623:3: otherlv_0= '@version' otherlv_1= ':' ( (lv_versionValue_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= '@name' otherlv_5= ':' ( (lv_nameValue_6_0= RULE_STRING ) ) otherlv_7= ',' otherlv_8= '@user' otherlv_9= ':' ( (lv_userValue_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= '@pass' otherlv_13= ':' ( (lv_passValue_14_0= RULE_STRING ) ) otherlv_15= ',' otherlv_16= '@host' otherlv_17= ':' ( (lv_hostValue_18_0= RULE_STRING ) ) otherlv_19= ',' otherlv_20= '@env' otherlv_21= ':' ( (lv_envValue_22_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDatabase1246); 

                	newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getVersionKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleDatabase1258); 

                	newLeafNode(otherlv_1, grammarAccess.getDatabaseAccess().getColonKeyword_1());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:631:1: ( (lv_versionValue_2_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:632:1: (lv_versionValue_2_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:632:1: (lv_versionValue_2_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:633:3: lv_versionValue_2_0= RULE_STRING
            {
            lv_versionValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatabase1275); 

            			newLeafNode(lv_versionValue_2_0, grammarAccess.getDatabaseAccess().getVersionValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"versionValue",
                    		lv_versionValue_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleDatabase1292); 

                	newLeafNode(otherlv_3, grammarAccess.getDatabaseAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleDatabase1304); 

                	newLeafNode(otherlv_4, grammarAccess.getDatabaseAccess().getNameKeyword_4());
                
            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleDatabase1316); 

                	newLeafNode(otherlv_5, grammarAccess.getDatabaseAccess().getColonKeyword_5());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:661:1: ( (lv_nameValue_6_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:662:1: (lv_nameValue_6_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:662:1: (lv_nameValue_6_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:663:3: lv_nameValue_6_0= RULE_STRING
            {
            lv_nameValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatabase1333); 

            			newLeafNode(lv_nameValue_6_0, grammarAccess.getDatabaseAccess().getNameValueSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nameValue",
                    		lv_nameValue_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleDatabase1350); 

                	newLeafNode(otherlv_7, grammarAccess.getDatabaseAccess().getCommaKeyword_7());
                
            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleDatabase1362); 

                	newLeafNode(otherlv_8, grammarAccess.getDatabaseAccess().getUserKeyword_8());
                
            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleDatabase1374); 

                	newLeafNode(otherlv_9, grammarAccess.getDatabaseAccess().getColonKeyword_9());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:691:1: ( (lv_userValue_10_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:692:1: (lv_userValue_10_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:692:1: (lv_userValue_10_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:693:3: lv_userValue_10_0= RULE_STRING
            {
            lv_userValue_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatabase1391); 

            			newLeafNode(lv_userValue_10_0, grammarAccess.getDatabaseAccess().getUserValueSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"userValue",
                    		lv_userValue_10_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleDatabase1408); 

                	newLeafNode(otherlv_11, grammarAccess.getDatabaseAccess().getCommaKeyword_11());
                
            otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleDatabase1420); 

                	newLeafNode(otherlv_12, grammarAccess.getDatabaseAccess().getPassKeyword_12());
                
            otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleDatabase1432); 

                	newLeafNode(otherlv_13, grammarAccess.getDatabaseAccess().getColonKeyword_13());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:721:1: ( (lv_passValue_14_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:722:1: (lv_passValue_14_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:722:1: (lv_passValue_14_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:723:3: lv_passValue_14_0= RULE_STRING
            {
            lv_passValue_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatabase1449); 

            			newLeafNode(lv_passValue_14_0, grammarAccess.getDatabaseAccess().getPassValueSTRINGTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"passValue",
                    		lv_passValue_14_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_15=(Token)match(input,28,FOLLOW_28_in_ruleDatabase1466); 

                	newLeafNode(otherlv_15, grammarAccess.getDatabaseAccess().getCommaKeyword_15());
                
            otherlv_16=(Token)match(input,32,FOLLOW_32_in_ruleDatabase1478); 

                	newLeafNode(otherlv_16, grammarAccess.getDatabaseAccess().getHostKeyword_16());
                
            otherlv_17=(Token)match(input,27,FOLLOW_27_in_ruleDatabase1490); 

                	newLeafNode(otherlv_17, grammarAccess.getDatabaseAccess().getColonKeyword_17());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:751:1: ( (lv_hostValue_18_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:752:1: (lv_hostValue_18_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:752:1: (lv_hostValue_18_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:753:3: lv_hostValue_18_0= RULE_STRING
            {
            lv_hostValue_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatabase1507); 

            			newLeafNode(lv_hostValue_18_0, grammarAccess.getDatabaseAccess().getHostValueSTRINGTerminalRuleCall_18_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"hostValue",
                    		lv_hostValue_18_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_19=(Token)match(input,28,FOLLOW_28_in_ruleDatabase1524); 

                	newLeafNode(otherlv_19, grammarAccess.getDatabaseAccess().getCommaKeyword_19());
                
            otherlv_20=(Token)match(input,33,FOLLOW_33_in_ruleDatabase1536); 

                	newLeafNode(otherlv_20, grammarAccess.getDatabaseAccess().getEnvKeyword_20());
                
            otherlv_21=(Token)match(input,27,FOLLOW_27_in_ruleDatabase1548); 

                	newLeafNode(otherlv_21, grammarAccess.getDatabaseAccess().getColonKeyword_21());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:781:1: ( (lv_envValue_22_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:782:1: (lv_envValue_22_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:782:1: (lv_envValue_22_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:783:3: lv_envValue_22_0= RULE_STRING
            {
            lv_envValue_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDatabase1565); 

            			newLeafNode(lv_envValue_22_0, grammarAccess.getDatabaseAccess().getEnvValueSTRINGTerminalRuleCall_22_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"envValue",
                    		lv_envValue_22_0, 
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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleNameVersion"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:807:1: entryRuleNameVersion returns [EObject current=null] : iv_ruleNameVersion= ruleNameVersion EOF ;
    public final EObject entryRuleNameVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameVersion = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:808:2: (iv_ruleNameVersion= ruleNameVersion EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:809:2: iv_ruleNameVersion= ruleNameVersion EOF
            {
             newCompositeNode(grammarAccess.getNameVersionRule()); 
            pushFollow(FOLLOW_ruleNameVersion_in_entryRuleNameVersion1606);
            iv_ruleNameVersion=ruleNameVersion();

            state._fsp--;

             current =iv_ruleNameVersion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameVersion1616); 

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
    // $ANTLR end "entryRuleNameVersion"


    // $ANTLR start "ruleNameVersion"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:816:1: ruleNameVersion returns [EObject current=null] : (otherlv_0= '@name' otherlv_1= ':' ( (lv_nameValue_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= '@version' otherlv_5= ':' ( (lv_versionValue_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleNameVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nameValue_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_versionValue_6_0=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:819:28: ( (otherlv_0= '@name' otherlv_1= ':' ( (lv_nameValue_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= '@version' otherlv_5= ':' ( (lv_versionValue_6_0= RULE_STRING ) ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:820:1: (otherlv_0= '@name' otherlv_1= ':' ( (lv_nameValue_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= '@version' otherlv_5= ':' ( (lv_versionValue_6_0= RULE_STRING ) ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:820:1: (otherlv_0= '@name' otherlv_1= ':' ( (lv_nameValue_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= '@version' otherlv_5= ':' ( (lv_versionValue_6_0= RULE_STRING ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:820:3: otherlv_0= '@name' otherlv_1= ':' ( (lv_nameValue_2_0= RULE_STRING ) ) otherlv_3= ',' otherlv_4= '@version' otherlv_5= ':' ( (lv_versionValue_6_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleNameVersion1653); 

                	newLeafNode(otherlv_0, grammarAccess.getNameVersionAccess().getNameKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleNameVersion1665); 

                	newLeafNode(otherlv_1, grammarAccess.getNameVersionAccess().getColonKeyword_1());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:828:1: ( (lv_nameValue_2_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:829:1: (lv_nameValue_2_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:829:1: (lv_nameValue_2_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:830:3: lv_nameValue_2_0= RULE_STRING
            {
            lv_nameValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNameVersion1682); 

            			newLeafNode(lv_nameValue_2_0, grammarAccess.getNameVersionAccess().getNameValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNameVersionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nameValue",
                    		lv_nameValue_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleNameVersion1699); 

                	newLeafNode(otherlv_3, grammarAccess.getNameVersionAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleNameVersion1711); 

                	newLeafNode(otherlv_4, grammarAccess.getNameVersionAccess().getVersionKeyword_4());
                
            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleNameVersion1723); 

                	newLeafNode(otherlv_5, grammarAccess.getNameVersionAccess().getColonKeyword_5());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:858:1: ( (lv_versionValue_6_0= RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:859:1: (lv_versionValue_6_0= RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:859:1: (lv_versionValue_6_0= RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:860:3: lv_versionValue_6_0= RULE_STRING
            {
            lv_versionValue_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNameVersion1740); 

            			newLeafNode(lv_versionValue_6_0, grammarAccess.getNameVersionAccess().getVersionValueSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNameVersionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"versionValue",
                    		lv_versionValue_6_0, 
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
    // $ANTLR end "ruleNameVersion"


    // $ANTLR start "entryRuleApplicationBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:884:1: entryRuleApplicationBlock returns [EObject current=null] : iv_ruleApplicationBlock= ruleApplicationBlock EOF ;
    public final EObject entryRuleApplicationBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:885:2: (iv_ruleApplicationBlock= ruleApplicationBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:886:2: iv_ruleApplicationBlock= ruleApplicationBlock EOF
            {
             newCompositeNode(grammarAccess.getApplicationBlockRule()); 
            pushFollow(FOLLOW_ruleApplicationBlock_in_entryRuleApplicationBlock1781);
            iv_ruleApplicationBlock=ruleApplicationBlock();

            state._fsp--;

             current =iv_ruleApplicationBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationBlock1791); 

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
    // $ANTLR end "entryRuleApplicationBlock"


    // $ANTLR start "ruleApplicationBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:893:1: ruleApplicationBlock returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'composedBy' ( (lv_applicationDomain_4_0= ruleImportCompoundName ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleApplicationBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_applicationDomain_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:896:28: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'composedBy' ( (lv_applicationDomain_4_0= ruleImportCompoundName ) ) )* otherlv_5= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:897:1: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'composedBy' ( (lv_applicationDomain_4_0= ruleImportCompoundName ) ) )* otherlv_5= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:897:1: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'composedBy' ( (lv_applicationDomain_4_0= ruleImportCompoundName ) ) )* otherlv_5= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:897:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'composedBy' ( (lv_applicationDomain_4_0= ruleImportCompoundName ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleApplicationBlock1828); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationBlockAccess().getApplicationKeyword_0());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:901:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:902:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:902:1: (lv_name_1_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:903:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationBlock1845); 

            			newLeafNode(lv_name_1_0, grammarAccess.getApplicationBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleApplicationBlock1862); 

                	newLeafNode(otherlv_2, grammarAccess.getApplicationBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:923:1: (otherlv_3= 'composedBy' ( (lv_applicationDomain_4_0= ruleImportCompoundName ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==35) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:923:3: otherlv_3= 'composedBy' ( (lv_applicationDomain_4_0= ruleImportCompoundName ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleApplicationBlock1875); 

            	        	newLeafNode(otherlv_3, grammarAccess.getApplicationBlockAccess().getComposedByKeyword_3_0());
            	        
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:927:1: ( (lv_applicationDomain_4_0= ruleImportCompoundName ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:928:1: (lv_applicationDomain_4_0= ruleImportCompoundName )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:928:1: (lv_applicationDomain_4_0= ruleImportCompoundName )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:929:3: lv_applicationDomain_4_0= ruleImportCompoundName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getApplicationBlockAccess().getApplicationDomainImportCompoundNameParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportCompoundName_in_ruleApplicationBlock1896);
            	    lv_applicationDomain_4_0=ruleImportCompoundName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getApplicationBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"applicationDomain",
            	            		lv_applicationDomain_4_0, 
            	            		"ImportCompoundName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleApplicationBlock1910); 

                	newLeafNode(otherlv_5, grammarAccess.getApplicationBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleApplicationBlock"


    // $ANTLR start "entryRuleDomainBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:957:1: entryRuleDomainBlock returns [EObject current=null] : iv_ruleDomainBlock= ruleDomainBlock EOF ;
    public final EObject entryRuleDomainBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:958:2: (iv_ruleDomainBlock= ruleDomainBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:959:2: iv_ruleDomainBlock= ruleDomainBlock EOF
            {
             newCompositeNode(grammarAccess.getDomainBlockRule()); 
            pushFollow(FOLLOW_ruleDomainBlock_in_entryRuleDomainBlock1946);
            iv_ruleDomainBlock=ruleDomainBlock();

            state._fsp--;

             current =iv_ruleDomainBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainBlock1956); 

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
    // $ANTLR end "entryRuleDomainBlock"


    // $ANTLR start "ruleDomainBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:966:1: ruleDomainBlock returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_module_3_0= ruleModule ) )* otherlv_4= '}' ) ;
    public final EObject ruleDomainBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_module_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:969:28: ( (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_module_3_0= ruleModule ) )* otherlv_4= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:970:1: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_module_3_0= ruleModule ) )* otherlv_4= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:970:1: (otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_module_3_0= ruleModule ) )* otherlv_4= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:970:3: otherlv_0= 'domain' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_module_3_0= ruleModule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleDomainBlock1993); 

                	newLeafNode(otherlv_0, grammarAccess.getDomainBlockAccess().getDomainKeyword_0());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:974:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:975:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:975:1: (lv_name_1_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:976:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainBlock2010); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDomainBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDomainBlock2027); 

                	newLeafNode(otherlv_2, grammarAccess.getDomainBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:996:1: ( (lv_module_3_0= ruleModule ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==37) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:997:1: (lv_module_3_0= ruleModule )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:997:1: (lv_module_3_0= ruleModule )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:998:3: lv_module_3_0= ruleModule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainBlockAccess().getModuleModuleParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModule_in_ruleDomainBlock2048);
            	    lv_module_3_0=ruleModule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"module",
            	            		lv_module_3_0, 
            	            		"Module");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDomainBlock2061); 

                	newLeafNode(otherlv_4, grammarAccess.getDomainBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleDomainBlock"


    // $ANTLR start "entryRuleModule"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1026:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1027:2: (iv_ruleModule= ruleModule EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1028:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule2097);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule2107); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1035:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_serviceBlock_3_0= ruleServiceBlock ) ) | ( (lv_entityBlock_4_0= ruleEntityBlock ) ) | ( (lv_enumBlock_5_0= ruleEnumBlock ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_serviceBlock_3_0 = null;

        EObject lv_entityBlock_4_0 = null;

        EObject lv_enumBlock_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1038:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_serviceBlock_3_0= ruleServiceBlock ) ) | ( (lv_entityBlock_4_0= ruleEntityBlock ) ) | ( (lv_enumBlock_5_0= ruleEnumBlock ) ) )* otherlv_6= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1039:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_serviceBlock_3_0= ruleServiceBlock ) ) | ( (lv_entityBlock_4_0= ruleEntityBlock ) ) | ( (lv_enumBlock_5_0= ruleEnumBlock ) ) )* otherlv_6= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1039:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_serviceBlock_3_0= ruleServiceBlock ) ) | ( (lv_entityBlock_4_0= ruleEntityBlock ) ) | ( (lv_enumBlock_5_0= ruleEnumBlock ) ) )* otherlv_6= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1039:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_serviceBlock_3_0= ruleServiceBlock ) ) | ( (lv_entityBlock_4_0= ruleEntityBlock ) ) | ( (lv_enumBlock_5_0= ruleEnumBlock ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleModule2144); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1043:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1044:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1044:1: (lv_name_1_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1045:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule2161); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModule2178); 

                	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1065:1: ( ( (lv_serviceBlock_3_0= ruleServiceBlock ) ) | ( (lv_entityBlock_4_0= ruleEntityBlock ) ) | ( (lv_enumBlock_5_0= ruleEnumBlock ) ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    alt8=1;
                    }
                    break;
                case 39:
                case 40:
                case 68:
                case 69:
                case 70:
                case 71:
                    {
                    alt8=2;
                    }
                    break;
                case 50:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1065:2: ( (lv_serviceBlock_3_0= ruleServiceBlock ) )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1065:2: ( (lv_serviceBlock_3_0= ruleServiceBlock ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1066:1: (lv_serviceBlock_3_0= ruleServiceBlock )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1066:1: (lv_serviceBlock_3_0= ruleServiceBlock )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1067:3: lv_serviceBlock_3_0= ruleServiceBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getServiceBlockServiceBlockParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceBlock_in_ruleModule2200);
            	    lv_serviceBlock_3_0=ruleServiceBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"serviceBlock",
            	            		lv_serviceBlock_3_0, 
            	            		"ServiceBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1084:6: ( (lv_entityBlock_4_0= ruleEntityBlock ) )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1084:6: ( (lv_entityBlock_4_0= ruleEntityBlock ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1085:1: (lv_entityBlock_4_0= ruleEntityBlock )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1085:1: (lv_entityBlock_4_0= ruleEntityBlock )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1086:3: lv_entityBlock_4_0= ruleEntityBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getEntityBlockEntityBlockParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityBlock_in_ruleModule2227);
            	    lv_entityBlock_4_0=ruleEntityBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entityBlock",
            	            		lv_entityBlock_4_0, 
            	            		"EntityBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1103:6: ( (lv_enumBlock_5_0= ruleEnumBlock ) )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1103:6: ( (lv_enumBlock_5_0= ruleEnumBlock ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1104:1: (lv_enumBlock_5_0= ruleEnumBlock )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1104:1: (lv_enumBlock_5_0= ruleEnumBlock )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1105:3: lv_enumBlock_5_0= ruleEnumBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getEnumBlockEnumBlockParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumBlock_in_ruleModule2254);
            	    lv_enumBlock_5_0=ruleEnumBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enumBlock",
            	            		lv_enumBlock_5_0, 
            	            		"EnumBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleModule2268); 

                	newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleServiceBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1133:1: entryRuleServiceBlock returns [EObject current=null] : iv_ruleServiceBlock= ruleServiceBlock EOF ;
    public final EObject entryRuleServiceBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1134:2: (iv_ruleServiceBlock= ruleServiceBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1135:2: iv_ruleServiceBlock= ruleServiceBlock EOF
            {
             newCompositeNode(grammarAccess.getServiceBlockRule()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock2304);
            iv_ruleServiceBlock=ruleServiceBlock();

            state._fsp--;

             current =iv_ruleServiceBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceBlock2314); 

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
    // $ANTLR end "entryRuleServiceBlock"


    // $ANTLR start "ruleServiceBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1142:1: ruleServiceBlock returns [EObject current=null] : (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_serviceFields_3_0= ruleServiceMethod ) )* otherlv_4= '}' ) ;
    public final EObject ruleServiceBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_serviceFields_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1145:28: ( (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_serviceFields_3_0= ruleServiceMethod ) )* otherlv_4= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1146:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_serviceFields_3_0= ruleServiceMethod ) )* otherlv_4= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1146:1: (otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_serviceFields_3_0= ruleServiceMethod ) )* otherlv_4= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1146:3: otherlv_0= 'service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_serviceFields_3_0= ruleServiceMethod ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleServiceBlock2351); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceBlockAccess().getServiceKeyword_0());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1150:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1151:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1151:1: (lv_name_1_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1152:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceBlock2368); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleServiceBlock2385); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1172:1: ( (lv_serviceFields_3_0= ruleServiceMethod ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1173:1: (lv_serviceFields_3_0= ruleServiceMethod )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1173:1: (lv_serviceFields_3_0= ruleServiceMethod )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1174:3: lv_serviceFields_3_0= ruleServiceMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceBlockAccess().getServiceFieldsServiceMethodParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceMethod_in_ruleServiceBlock2406);
            	    lv_serviceFields_3_0=ruleServiceMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"serviceFields",
            	            		lv_serviceFields_3_0, 
            	            		"ServiceMethod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleServiceBlock2419); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceBlockAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleServiceBlock"


    // $ANTLR start "entryRuleServiceMethod"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1202:1: entryRuleServiceMethod returns [EObject current=null] : iv_ruleServiceMethod= ruleServiceMethod EOF ;
    public final EObject entryRuleServiceMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceMethod = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1203:2: (iv_ruleServiceMethod= ruleServiceMethod EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1204:2: iv_ruleServiceMethod= ruleServiceMethod EOF
            {
             newCompositeNode(grammarAccess.getServiceMethodRule()); 
            pushFollow(FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod2455);
            iv_ruleServiceMethod=ruleServiceMethod();

            state._fsp--;

             current =iv_ruleServiceMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethod2465); 

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
    // $ANTLR end "entryRuleServiceMethod"


    // $ANTLR start "ruleServiceMethod"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1211:1: ruleServiceMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_methodAcess_2_0= ruleCompoundName ) ) ) ;
    public final EObject ruleServiceMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_methodAcess_2_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1214:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_methodAcess_2_0= ruleCompoundName ) ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1215:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_methodAcess_2_0= ruleCompoundName ) ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1215:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_methodAcess_2_0= ruleCompoundName ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1215:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_methodAcess_2_0= ruleCompoundName ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1215:2: ( (lv_name_0_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1216:1: (lv_name_0_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1216:1: (lv_name_0_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1217:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceMethod2507); 

            			newLeafNode(lv_name_0_0, grammarAccess.getServiceMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleServiceMethod2524); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceMethodAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1237:1: ( (lv_methodAcess_2_0= ruleCompoundName ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1238:1: (lv_methodAcess_2_0= ruleCompoundName )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1238:1: (lv_methodAcess_2_0= ruleCompoundName )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1239:3: lv_methodAcess_2_0= ruleCompoundName
            {
             
            	        newCompositeNode(grammarAccess.getServiceMethodAccess().getMethodAcessCompoundNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCompoundName_in_ruleServiceMethod2545);
            lv_methodAcess_2_0=ruleCompoundName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceMethodRule());
            	        }
                   		set(
                   			current, 
                   			"methodAcess",
                    		lv_methodAcess_2_0, 
                    		"CompoundName");
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
    // $ANTLR end "ruleServiceMethod"


    // $ANTLR start "entryRuleEntityBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1263:1: entryRuleEntityBlock returns [EObject current=null] : iv_ruleEntityBlock= ruleEntityBlock EOF ;
    public final EObject entryRuleEntityBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1264:2: (iv_ruleEntityBlock= ruleEntityBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1265:2: iv_ruleEntityBlock= ruleEntityBlock EOF
            {
             newCompositeNode(grammarAccess.getEntityBlockRule()); 
            pushFollow(FOLLOW_ruleEntityBlock_in_entryRuleEntityBlock2581);
            iv_ruleEntityBlock=ruleEntityBlock();

            state._fsp--;

             current =iv_ruleEntityBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityBlock2591); 

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
    // $ANTLR end "entryRuleEntityBlock"


    // $ANTLR start "ruleEntityBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1272:1: ruleEntityBlock returns [EObject current=null] : ( ( (lv_acessModifier_0_0= ruleAccessModifier ) )? ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'entity' ( (lv_name_3_0= RULE_ID ) ) ( (lv_classExtends_4_0= ruleExtendBlock ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* ( (lv_repository_7_0= ruleRepository ) ) otherlv_8= '}' ) ;
    public final EObject ruleEntityBlock() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_acessModifier_0_0 = null;

        EObject lv_classExtends_4_0 = null;

        EObject lv_attributes_6_0 = null;

        EObject lv_repository_7_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1275:28: ( ( ( (lv_acessModifier_0_0= ruleAccessModifier ) )? ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'entity' ( (lv_name_3_0= RULE_ID ) ) ( (lv_classExtends_4_0= ruleExtendBlock ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* ( (lv_repository_7_0= ruleRepository ) ) otherlv_8= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1276:1: ( ( (lv_acessModifier_0_0= ruleAccessModifier ) )? ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'entity' ( (lv_name_3_0= RULE_ID ) ) ( (lv_classExtends_4_0= ruleExtendBlock ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* ( (lv_repository_7_0= ruleRepository ) ) otherlv_8= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1276:1: ( ( (lv_acessModifier_0_0= ruleAccessModifier ) )? ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'entity' ( (lv_name_3_0= RULE_ID ) ) ( (lv_classExtends_4_0= ruleExtendBlock ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* ( (lv_repository_7_0= ruleRepository ) ) otherlv_8= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1276:2: ( (lv_acessModifier_0_0= ruleAccessModifier ) )? ( (lv_isAbstract_1_0= 'abstract' ) )? otherlv_2= 'entity' ( (lv_name_3_0= RULE_ID ) ) ( (lv_classExtends_4_0= ruleExtendBlock ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* ( (lv_repository_7_0= ruleRepository ) ) otherlv_8= '}'
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1276:2: ( (lv_acessModifier_0_0= ruleAccessModifier ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=68 && LA10_0<=71)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1277:1: (lv_acessModifier_0_0= ruleAccessModifier )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1277:1: (lv_acessModifier_0_0= ruleAccessModifier )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1278:3: lv_acessModifier_0_0= ruleAccessModifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityBlockAccess().getAcessModifierAccessModifierParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAccessModifier_in_ruleEntityBlock2637);
                    lv_acessModifier_0_0=ruleAccessModifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"acessModifier",
                            		lv_acessModifier_0_0, 
                            		"AccessModifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1294:3: ( (lv_isAbstract_1_0= 'abstract' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1295:1: (lv_isAbstract_1_0= 'abstract' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1295:1: (lv_isAbstract_1_0= 'abstract' )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1296:3: lv_isAbstract_1_0= 'abstract'
                    {
                    lv_isAbstract_1_0=(Token)match(input,39,FOLLOW_39_in_ruleEntityBlock2656); 

                            newLeafNode(lv_isAbstract_1_0, grammarAccess.getEntityBlockAccess().getIsAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityBlockRule());
                    	        }
                           		setWithLastConsumed(current, "isAbstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleEntityBlock2682); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityBlockAccess().getEntityKeyword_2());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1313:1: ( (lv_name_3_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1314:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1314:1: (lv_name_3_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1315:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityBlock2699); 

            			newLeafNode(lv_name_3_0, grammarAccess.getEntityBlockAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1331:2: ( (lv_classExtends_4_0= ruleExtendBlock ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1332:1: (lv_classExtends_4_0= ruleExtendBlock )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1332:1: (lv_classExtends_4_0= ruleExtendBlock )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1333:3: lv_classExtends_4_0= ruleExtendBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityBlockAccess().getClassExtendsExtendBlockParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExtendBlock_in_ruleEntityBlock2725);
                    lv_classExtends_4_0=ruleExtendBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"classExtends",
                            		lv_classExtends_4_0, 
                            		"ExtendBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleEntityBlock2738); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityBlockAccess().getLeftCurlyBracketKeyword_5());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1353:1: ( (lv_attributes_6_0= ruleAttribute ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=51 && LA13_0<=64)||(LA13_0>=67 && LA13_0<=71)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1354:1: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1354:1: (lv_attributes_6_0= ruleAttribute )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1355:3: lv_attributes_6_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityBlockAccess().getAttributesAttributeParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntityBlock2759);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_6_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1371:3: ( (lv_repository_7_0= ruleRepository ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1372:1: (lv_repository_7_0= ruleRepository )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1372:1: (lv_repository_7_0= ruleRepository )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1373:3: lv_repository_7_0= ruleRepository
            {
             
            	        newCompositeNode(grammarAccess.getEntityBlockAccess().getRepositoryRepositoryParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleRepository_in_ruleEntityBlock2781);
            lv_repository_7_0=ruleRepository();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityBlockRule());
            	        }
                   		set(
                   			current, 
                   			"repository",
                    		lv_repository_7_0, 
                    		"Repository");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleEntityBlock2793); 

                	newLeafNode(otherlv_8, grammarAccess.getEntityBlockAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleEntityBlock"


    // $ANTLR start "entryRuleAttribute"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1401:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1402:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1403:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2829);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2839); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1410:1: ruleAttribute returns [EObject current=null] : ( ( (lv_acessModifier_0_0= ruleAccessModifier ) )? ( (lv_type_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_pk_3_0= '@pk' ) ) | ( (otherlv_4= '@unique' )+ otherlv_5= '(' ( (lv_unique_6_0= ruleBOOLEAN ) ) otherlv_7= ')' ) | ( (otherlv_8= '@null' )+ otherlv_9= '(' ( (lv_nullable_10_0= ruleBOOLEAN ) ) otherlv_11= ')' ) | ( (otherlv_12= '@min' )+ otherlv_13= '(' ( (lv_min_14_0= ruleINTEGER ) ) otherlv_15= ')' ) | ( (otherlv_16= '@max' )+ otherlv_17= '(' ( (lv_max_18_0= ruleINTEGER ) ) otherlv_19= ')' ) | ( (otherlv_20= '@between' )+ otherlv_21= '(' ( (lv_min_22_0= ruleINTEGER ) ) otherlv_23= ',' ( (lv_max_24_0= ruleINTEGER ) ) otherlv_25= ')' ) )* ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_pk_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_acessModifier_0_0 = null;

        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_unique_6_0 = null;

        AntlrDatatypeRuleToken lv_nullable_10_0 = null;

        AntlrDatatypeRuleToken lv_min_14_0 = null;

        AntlrDatatypeRuleToken lv_max_18_0 = null;

        AntlrDatatypeRuleToken lv_min_22_0 = null;

        AntlrDatatypeRuleToken lv_max_24_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1413:28: ( ( ( (lv_acessModifier_0_0= ruleAccessModifier ) )? ( (lv_type_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_pk_3_0= '@pk' ) ) | ( (otherlv_4= '@unique' )+ otherlv_5= '(' ( (lv_unique_6_0= ruleBOOLEAN ) ) otherlv_7= ')' ) | ( (otherlv_8= '@null' )+ otherlv_9= '(' ( (lv_nullable_10_0= ruleBOOLEAN ) ) otherlv_11= ')' ) | ( (otherlv_12= '@min' )+ otherlv_13= '(' ( (lv_min_14_0= ruleINTEGER ) ) otherlv_15= ')' ) | ( (otherlv_16= '@max' )+ otherlv_17= '(' ( (lv_max_18_0= ruleINTEGER ) ) otherlv_19= ')' ) | ( (otherlv_20= '@between' )+ otherlv_21= '(' ( (lv_min_22_0= ruleINTEGER ) ) otherlv_23= ',' ( (lv_max_24_0= ruleINTEGER ) ) otherlv_25= ')' ) )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1414:1: ( ( (lv_acessModifier_0_0= ruleAccessModifier ) )? ( (lv_type_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_pk_3_0= '@pk' ) ) | ( (otherlv_4= '@unique' )+ otherlv_5= '(' ( (lv_unique_6_0= ruleBOOLEAN ) ) otherlv_7= ')' ) | ( (otherlv_8= '@null' )+ otherlv_9= '(' ( (lv_nullable_10_0= ruleBOOLEAN ) ) otherlv_11= ')' ) | ( (otherlv_12= '@min' )+ otherlv_13= '(' ( (lv_min_14_0= ruleINTEGER ) ) otherlv_15= ')' ) | ( (otherlv_16= '@max' )+ otherlv_17= '(' ( (lv_max_18_0= ruleINTEGER ) ) otherlv_19= ')' ) | ( (otherlv_20= '@between' )+ otherlv_21= '(' ( (lv_min_22_0= ruleINTEGER ) ) otherlv_23= ',' ( (lv_max_24_0= ruleINTEGER ) ) otherlv_25= ')' ) )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1414:1: ( ( (lv_acessModifier_0_0= ruleAccessModifier ) )? ( (lv_type_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_pk_3_0= '@pk' ) ) | ( (otherlv_4= '@unique' )+ otherlv_5= '(' ( (lv_unique_6_0= ruleBOOLEAN ) ) otherlv_7= ')' ) | ( (otherlv_8= '@null' )+ otherlv_9= '(' ( (lv_nullable_10_0= ruleBOOLEAN ) ) otherlv_11= ')' ) | ( (otherlv_12= '@min' )+ otherlv_13= '(' ( (lv_min_14_0= ruleINTEGER ) ) otherlv_15= ')' ) | ( (otherlv_16= '@max' )+ otherlv_17= '(' ( (lv_max_18_0= ruleINTEGER ) ) otherlv_19= ')' ) | ( (otherlv_20= '@between' )+ otherlv_21= '(' ( (lv_min_22_0= ruleINTEGER ) ) otherlv_23= ',' ( (lv_max_24_0= ruleINTEGER ) ) otherlv_25= ')' ) )* )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1414:2: ( (lv_acessModifier_0_0= ruleAccessModifier ) )? ( (lv_type_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_pk_3_0= '@pk' ) ) | ( (otherlv_4= '@unique' )+ otherlv_5= '(' ( (lv_unique_6_0= ruleBOOLEAN ) ) otherlv_7= ')' ) | ( (otherlv_8= '@null' )+ otherlv_9= '(' ( (lv_nullable_10_0= ruleBOOLEAN ) ) otherlv_11= ')' ) | ( (otherlv_12= '@min' )+ otherlv_13= '(' ( (lv_min_14_0= ruleINTEGER ) ) otherlv_15= ')' ) | ( (otherlv_16= '@max' )+ otherlv_17= '(' ( (lv_max_18_0= ruleINTEGER ) ) otherlv_19= ')' ) | ( (otherlv_20= '@between' )+ otherlv_21= '(' ( (lv_min_22_0= ruleINTEGER ) ) otherlv_23= ',' ( (lv_max_24_0= ruleINTEGER ) ) otherlv_25= ')' ) )*
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1414:2: ( (lv_acessModifier_0_0= ruleAccessModifier ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=68 && LA14_0<=71)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1415:1: (lv_acessModifier_0_0= ruleAccessModifier )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1415:1: (lv_acessModifier_0_0= ruleAccessModifier )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1416:3: lv_acessModifier_0_0= ruleAccessModifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getAcessModifierAccessModifierParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAccessModifier_in_ruleAttribute2885);
                    lv_acessModifier_0_0=ruleAccessModifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"acessModifier",
                            		lv_acessModifier_0_0, 
                            		"AccessModifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1432:3: ( (lv_type_1_0= ruleDataType ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1433:1: (lv_type_1_0= ruleDataType )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1433:1: (lv_type_1_0= ruleDataType )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1434:3: lv_type_1_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleAttribute2907);
            lv_type_1_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1450:2: ( (lv_name_2_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1451:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1451:1: (lv_name_2_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1452:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2924); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1468:2: ( ( (lv_pk_3_0= '@pk' ) ) | ( (otherlv_4= '@unique' )+ otherlv_5= '(' ( (lv_unique_6_0= ruleBOOLEAN ) ) otherlv_7= ')' ) | ( (otherlv_8= '@null' )+ otherlv_9= '(' ( (lv_nullable_10_0= ruleBOOLEAN ) ) otherlv_11= ')' ) | ( (otherlv_12= '@min' )+ otherlv_13= '(' ( (lv_min_14_0= ruleINTEGER ) ) otherlv_15= ')' ) | ( (otherlv_16= '@max' )+ otherlv_17= '(' ( (lv_max_18_0= ruleINTEGER ) ) otherlv_19= ')' ) | ( (otherlv_20= '@between' )+ otherlv_21= '(' ( (lv_min_22_0= ruleINTEGER ) ) otherlv_23= ',' ( (lv_max_24_0= ruleINTEGER ) ) otherlv_25= ')' ) )*
            loop20:
            do {
                int alt20=7;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    alt20=1;
                    }
                    break;
                case 42:
                    {
                    alt20=2;
                    }
                    break;
                case 45:
                    {
                    alt20=3;
                    }
                    break;
                case 46:
                    {
                    alt20=4;
                    }
                    break;
                case 47:
                    {
                    alt20=5;
                    }
                    break;
                case 48:
                    {
                    alt20=6;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1468:3: ( (lv_pk_3_0= '@pk' ) )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1468:3: ( (lv_pk_3_0= '@pk' ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1469:1: (lv_pk_3_0= '@pk' )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1469:1: (lv_pk_3_0= '@pk' )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1470:3: lv_pk_3_0= '@pk'
            	    {
            	    lv_pk_3_0=(Token)match(input,41,FOLLOW_41_in_ruleAttribute2948); 

            	            newLeafNode(lv_pk_3_0, grammarAccess.getAttributeAccess().getPkPkKeyword_3_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAttributeRule());
            	    	        }
            	           		setWithLastConsumed(current, "pk", true, "@pk");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1484:6: ( (otherlv_4= '@unique' )+ otherlv_5= '(' ( (lv_unique_6_0= ruleBOOLEAN ) ) otherlv_7= ')' )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1484:6: ( (otherlv_4= '@unique' )+ otherlv_5= '(' ( (lv_unique_6_0= ruleBOOLEAN ) ) otherlv_7= ')' )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1484:7: (otherlv_4= '@unique' )+ otherlv_5= '(' ( (lv_unique_6_0= ruleBOOLEAN ) ) otherlv_7= ')'
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1484:7: (otherlv_4= '@unique' )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==42) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1484:9: otherlv_4= '@unique'
            	    	    {
            	    	    otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleAttribute2981); 

            	    	        	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getUniqueKeyword_3_1_0());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt15 >= 1 ) break loop15;
            	                EarlyExitException eee =
            	                    new EarlyExitException(15, input);
            	                throw eee;
            	        }
            	        cnt15++;
            	    } while (true);

            	    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleAttribute2995); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_3_1_1());
            	        
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1492:1: ( (lv_unique_6_0= ruleBOOLEAN ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1493:1: (lv_unique_6_0= ruleBOOLEAN )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1493:1: (lv_unique_6_0= ruleBOOLEAN )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1494:3: lv_unique_6_0= ruleBOOLEAN
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeAccess().getUniqueBOOLEANParserRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBOOLEAN_in_ruleAttribute3016);
            	    lv_unique_6_0=ruleBOOLEAN();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"unique",
            	            		lv_unique_6_0, 
            	            		"BOOLEAN");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleAttribute3028); 

            	        	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_3_1_3());
            	        

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1515:6: ( (otherlv_8= '@null' )+ otherlv_9= '(' ( (lv_nullable_10_0= ruleBOOLEAN ) ) otherlv_11= ')' )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1515:6: ( (otherlv_8= '@null' )+ otherlv_9= '(' ( (lv_nullable_10_0= ruleBOOLEAN ) ) otherlv_11= ')' )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1515:7: (otherlv_8= '@null' )+ otherlv_9= '(' ( (lv_nullable_10_0= ruleBOOLEAN ) ) otherlv_11= ')'
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1515:7: (otherlv_8= '@null' )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==45) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1515:9: otherlv_8= '@null'
            	    	    {
            	    	    otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleAttribute3049); 

            	    	        	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getNullKeyword_3_2_0());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);

            	    otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleAttribute3063); 

            	        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_3_2_1());
            	        
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1523:1: ( (lv_nullable_10_0= ruleBOOLEAN ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1524:1: (lv_nullable_10_0= ruleBOOLEAN )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1524:1: (lv_nullable_10_0= ruleBOOLEAN )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1525:3: lv_nullable_10_0= ruleBOOLEAN
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeAccess().getNullableBOOLEANParserRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBOOLEAN_in_ruleAttribute3084);
            	    lv_nullable_10_0=ruleBOOLEAN();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"nullable",
            	            		lv_nullable_10_0, 
            	            		"BOOLEAN");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleAttribute3096); 

            	        	newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_3_2_3());
            	        

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1546:6: ( (otherlv_12= '@min' )+ otherlv_13= '(' ( (lv_min_14_0= ruleINTEGER ) ) otherlv_15= ')' )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1546:6: ( (otherlv_12= '@min' )+ otherlv_13= '(' ( (lv_min_14_0= ruleINTEGER ) ) otherlv_15= ')' )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1546:7: (otherlv_12= '@min' )+ otherlv_13= '(' ( (lv_min_14_0= ruleINTEGER ) ) otherlv_15= ')'
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1546:7: (otherlv_12= '@min' )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==46) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1546:9: otherlv_12= '@min'
            	    	    {
            	    	    otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleAttribute3117); 

            	    	        	newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getMinKeyword_3_3_0());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	    otherlv_13=(Token)match(input,43,FOLLOW_43_in_ruleAttribute3131); 

            	        	newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_3_3_1());
            	        
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1554:1: ( (lv_min_14_0= ruleINTEGER ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1555:1: (lv_min_14_0= ruleINTEGER )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1555:1: (lv_min_14_0= ruleINTEGER )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1556:3: lv_min_14_0= ruleINTEGER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeAccess().getMinINTEGERParserRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleINTEGER_in_ruleAttribute3152);
            	    lv_min_14_0=ruleINTEGER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"min",
            	            		lv_min_14_0, 
            	            		"INTEGER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,44,FOLLOW_44_in_ruleAttribute3164); 

            	        	newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_3_3_3());
            	        

            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1577:6: ( (otherlv_16= '@max' )+ otherlv_17= '(' ( (lv_max_18_0= ruleINTEGER ) ) otherlv_19= ')' )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1577:6: ( (otherlv_16= '@max' )+ otherlv_17= '(' ( (lv_max_18_0= ruleINTEGER ) ) otherlv_19= ')' )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1577:7: (otherlv_16= '@max' )+ otherlv_17= '(' ( (lv_max_18_0= ruleINTEGER ) ) otherlv_19= ')'
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1577:7: (otherlv_16= '@max' )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==47) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1577:9: otherlv_16= '@max'
            	    	    {
            	    	    otherlv_16=(Token)match(input,47,FOLLOW_47_in_ruleAttribute3185); 

            	    	        	newLeafNode(otherlv_16, grammarAccess.getAttributeAccess().getMaxKeyword_3_4_0());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt18 >= 1 ) break loop18;
            	                EarlyExitException eee =
            	                    new EarlyExitException(18, input);
            	                throw eee;
            	        }
            	        cnt18++;
            	    } while (true);

            	    otherlv_17=(Token)match(input,43,FOLLOW_43_in_ruleAttribute3199); 

            	        	newLeafNode(otherlv_17, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_3_4_1());
            	        
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1585:1: ( (lv_max_18_0= ruleINTEGER ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1586:1: (lv_max_18_0= ruleINTEGER )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1586:1: (lv_max_18_0= ruleINTEGER )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1587:3: lv_max_18_0= ruleINTEGER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeAccess().getMaxINTEGERParserRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleINTEGER_in_ruleAttribute3220);
            	    lv_max_18_0=ruleINTEGER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"max",
            	            		lv_max_18_0, 
            	            		"INTEGER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,44,FOLLOW_44_in_ruleAttribute3232); 

            	        	newLeafNode(otherlv_19, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_3_4_3());
            	        

            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1608:6: ( (otherlv_20= '@between' )+ otherlv_21= '(' ( (lv_min_22_0= ruleINTEGER ) ) otherlv_23= ',' ( (lv_max_24_0= ruleINTEGER ) ) otherlv_25= ')' )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1608:6: ( (otherlv_20= '@between' )+ otherlv_21= '(' ( (lv_min_22_0= ruleINTEGER ) ) otherlv_23= ',' ( (lv_max_24_0= ruleINTEGER ) ) otherlv_25= ')' )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1608:7: (otherlv_20= '@between' )+ otherlv_21= '(' ( (lv_min_22_0= ruleINTEGER ) ) otherlv_23= ',' ( (lv_max_24_0= ruleINTEGER ) ) otherlv_25= ')'
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1608:7: (otherlv_20= '@between' )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==48) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1608:9: otherlv_20= '@between'
            	    	    {
            	    	    otherlv_20=(Token)match(input,48,FOLLOW_48_in_ruleAttribute3253); 

            	    	        	newLeafNode(otherlv_20, grammarAccess.getAttributeAccess().getBetweenKeyword_3_5_0());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	    otherlv_21=(Token)match(input,43,FOLLOW_43_in_ruleAttribute3267); 

            	        	newLeafNode(otherlv_21, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_3_5_1());
            	        
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1616:1: ( (lv_min_22_0= ruleINTEGER ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1617:1: (lv_min_22_0= ruleINTEGER )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1617:1: (lv_min_22_0= ruleINTEGER )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1618:3: lv_min_22_0= ruleINTEGER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeAccess().getMinINTEGERParserRuleCall_3_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleINTEGER_in_ruleAttribute3288);
            	    lv_min_22_0=ruleINTEGER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"min",
            	            		lv_min_22_0, 
            	            		"INTEGER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,28,FOLLOW_28_in_ruleAttribute3300); 

            	        	newLeafNode(otherlv_23, grammarAccess.getAttributeAccess().getCommaKeyword_3_5_3());
            	        
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1638:1: ( (lv_max_24_0= ruleINTEGER ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1639:1: (lv_max_24_0= ruleINTEGER )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1639:1: (lv_max_24_0= ruleINTEGER )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1640:3: lv_max_24_0= ruleINTEGER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeAccess().getMaxINTEGERParserRuleCall_3_5_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleINTEGER_in_ruleAttribute3321);
            	    lv_max_24_0=ruleINTEGER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"max",
            	            		lv_max_24_0, 
            	            		"INTEGER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_25=(Token)match(input,44,FOLLOW_44_in_ruleAttribute3333); 

            	        	newLeafNode(otherlv_25, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_3_5_5());
            	        

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRepository"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1668:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1669:2: (iv_ruleRepository= ruleRepository EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1670:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_ruleRepository_in_entryRuleRepository3372);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepository3382); 

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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1677:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'repository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleRepositoryFields ) )* otherlv_4= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_methods_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1680:28: ( (otherlv_0= 'repository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleRepositoryFields ) )* otherlv_4= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1681:1: (otherlv_0= 'repository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleRepositoryFields ) )* otherlv_4= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1681:1: (otherlv_0= 'repository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleRepositoryFields ) )* otherlv_4= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1681:3: otherlv_0= 'repository' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_methods_3_0= ruleRepositoryFields ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleRepository3419); 

                	newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1685:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1686:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1686:1: (lv_name_1_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1687:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepository3436); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRepositoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRepository3453); 

                	newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1707:1: ( (lv_methods_3_0= ruleRepositoryFields ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1708:1: (lv_methods_3_0= ruleRepositoryFields )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1708:1: (lv_methods_3_0= ruleRepositoryFields )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1709:3: lv_methods_3_0= ruleRepositoryFields
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRepositoryAccess().getMethodsRepositoryFieldsParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRepositoryFields_in_ruleRepository3474);
            	    lv_methods_3_0=ruleRepositoryFields();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_3_0, 
            	            		"RepositoryFields");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRepository3487); 

                	newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleRepositoryFields"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1737:1: entryRuleRepositoryFields returns [EObject current=null] : iv_ruleRepositoryFields= ruleRepositoryFields EOF ;
    public final EObject entryRuleRepositoryFields() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryFields = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1738:2: (iv_ruleRepositoryFields= ruleRepositoryFields EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1739:2: iv_ruleRepositoryFields= ruleRepositoryFields EOF
            {
             newCompositeNode(grammarAccess.getRepositoryFieldsRule()); 
            pushFollow(FOLLOW_ruleRepositoryFields_in_entryRuleRepositoryFields3523);
            iv_ruleRepositoryFields=ruleRepositoryFields();

            state._fsp--;

             current =iv_ruleRepositoryFields; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepositoryFields3533); 

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
    // $ANTLR end "entryRuleRepositoryFields"


    // $ANTLR start "ruleRepositoryFields"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1746:1: ruleRepositoryFields returns [EObject current=null] : ( ( (lv_nameMethod_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_methodsParameters_2_0= ruleMethodParameter ) )? otherlv_3= ')' otherlv_4= ':' ( (lv_returnType_5_0= ruleDataType ) ) ) ;
    public final EObject ruleRepositoryFields() throws RecognitionException {
        EObject current = null;

        Token lv_nameMethod_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_methodsParameters_2_0 = null;

        AntlrDatatypeRuleToken lv_returnType_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1749:28: ( ( ( (lv_nameMethod_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_methodsParameters_2_0= ruleMethodParameter ) )? otherlv_3= ')' otherlv_4= ':' ( (lv_returnType_5_0= ruleDataType ) ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1750:1: ( ( (lv_nameMethod_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_methodsParameters_2_0= ruleMethodParameter ) )? otherlv_3= ')' otherlv_4= ':' ( (lv_returnType_5_0= ruleDataType ) ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1750:1: ( ( (lv_nameMethod_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_methodsParameters_2_0= ruleMethodParameter ) )? otherlv_3= ')' otherlv_4= ':' ( (lv_returnType_5_0= ruleDataType ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1750:2: ( (lv_nameMethod_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_methodsParameters_2_0= ruleMethodParameter ) )? otherlv_3= ')' otherlv_4= ':' ( (lv_returnType_5_0= ruleDataType ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1750:2: ( (lv_nameMethod_0_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1751:1: (lv_nameMethod_0_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1751:1: (lv_nameMethod_0_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1752:3: lv_nameMethod_0_0= RULE_ID
            {
            lv_nameMethod_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepositoryFields3575); 

            			newLeafNode(lv_nameMethod_0_0, grammarAccess.getRepositoryFieldsAccess().getNameMethodIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRepositoryFieldsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nameMethod",
                    		lv_nameMethod_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleRepositoryFields3592); 

                	newLeafNode(otherlv_1, grammarAccess.getRepositoryFieldsAccess().getLeftParenthesisKeyword_1());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1772:1: ( (lv_methodsParameters_2_0= ruleMethodParameter ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=51 && LA22_0<=64)||LA22_0==67) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1773:1: (lv_methodsParameters_2_0= ruleMethodParameter )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1773:1: (lv_methodsParameters_2_0= ruleMethodParameter )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1774:3: lv_methodsParameters_2_0= ruleMethodParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepositoryFieldsAccess().getMethodsParametersMethodParameterParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMethodParameter_in_ruleRepositoryFields3613);
                    lv_methodsParameters_2_0=ruleMethodParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepositoryFieldsRule());
                    	        }
                           		set(
                           			current, 
                           			"methodsParameters",
                            		lv_methodsParameters_2_0, 
                            		"MethodParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleRepositoryFields3626); 

                	newLeafNode(otherlv_3, grammarAccess.getRepositoryFieldsAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleRepositoryFields3638); 

                	newLeafNode(otherlv_4, grammarAccess.getRepositoryFieldsAccess().getColonKeyword_4());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1798:1: ( (lv_returnType_5_0= ruleDataType ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1799:1: (lv_returnType_5_0= ruleDataType )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1799:1: (lv_returnType_5_0= ruleDataType )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1800:3: lv_returnType_5_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getRepositoryFieldsAccess().getReturnTypeDataTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleRepositoryFields3659);
            lv_returnType_5_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepositoryFieldsRule());
            	        }
                   		set(
                   			current, 
                   			"returnType",
                    		lv_returnType_5_0, 
                    		"DataType");
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
    // $ANTLR end "ruleRepositoryFields"


    // $ANTLR start "entryRuleEnumBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1824:1: entryRuleEnumBlock returns [EObject current=null] : iv_ruleEnumBlock= ruleEnumBlock EOF ;
    public final EObject entryRuleEnumBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1825:2: (iv_ruleEnumBlock= ruleEnumBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1826:2: iv_ruleEnumBlock= ruleEnumBlock EOF
            {
             newCompositeNode(grammarAccess.getEnumBlockRule()); 
            pushFollow(FOLLOW_ruleEnumBlock_in_entryRuleEnumBlock3695);
            iv_ruleEnumBlock=ruleEnumBlock();

            state._fsp--;

             current =iv_ruleEnumBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumBlock3705); 

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
    // $ANTLR end "entryRuleEnumBlock"


    // $ANTLR start "ruleEnumBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1833:1: ruleEnumBlock returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1836:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* otherlv_6= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1837:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1837:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* otherlv_6= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1837:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleEnumBlock3742); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumBlockAccess().getEnumKeyword_0());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1841:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1842:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1842:1: (lv_name_1_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1843:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumBlock3759); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnumBlock3776); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1863:1: ( (lv_values_3_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1864:1: (lv_values_3_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1864:1: (lv_values_3_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1865:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumBlock3793); 

            			newLeafNode(lv_values_3_0, grammarAccess.getEnumBlockAccess().getValuesIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumBlockRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"ID");
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1881:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==28) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1881:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleEnumBlock3811); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumBlockAccess().getCommaKeyword_4_0());
            	        
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1885:1: ( (lv_values_5_0= RULE_ID ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1886:1: (lv_values_5_0= RULE_ID )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1886:1: (lv_values_5_0= RULE_ID )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1887:3: lv_values_5_0= RULE_ID
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumBlock3828); 

            	    			newLeafNode(lv_values_5_0, grammarAccess.getEnumBlockAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumBlockRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_5_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleEnumBlock3847); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumBlockAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEnumBlock"


    // $ANTLR start "entryRuleDataType"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1915:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1916:2: (iv_ruleDataType= ruleDataType EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1917:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType3884);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType3895); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1924:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DataTypeList_0= ruleDataTypeList | this_DataTypeSet_1= ruleDataTypeSet | this_CompoundName_2= ruleCompoundName | kw= 'String' | kw= 'int' | kw= 'Integer' | kw= 'long' | kw= 'Long' | kw= 'boolean' | kw= 'Boolean' | kw= 'DateTime' | kw= 'double' | kw= 'Double' | kw= 'float' | kw= 'Float' | kw= 'Object' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DataTypeList_0 = null;

        AntlrDatatypeRuleToken this_DataTypeSet_1 = null;

        AntlrDatatypeRuleToken this_CompoundName_2 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1927:28: ( (this_DataTypeList_0= ruleDataTypeList | this_DataTypeSet_1= ruleDataTypeSet | this_CompoundName_2= ruleCompoundName | kw= 'String' | kw= 'int' | kw= 'Integer' | kw= 'long' | kw= 'Long' | kw= 'boolean' | kw= 'Boolean' | kw= 'DateTime' | kw= 'double' | kw= 'Double' | kw= 'float' | kw= 'Float' | kw= 'Object' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1928:1: (this_DataTypeList_0= ruleDataTypeList | this_DataTypeSet_1= ruleDataTypeSet | this_CompoundName_2= ruleCompoundName | kw= 'String' | kw= 'int' | kw= 'Integer' | kw= 'long' | kw= 'Long' | kw= 'boolean' | kw= 'Boolean' | kw= 'DateTime' | kw= 'double' | kw= 'Double' | kw= 'float' | kw= 'Float' | kw= 'Object' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1928:1: (this_DataTypeList_0= ruleDataTypeList | this_DataTypeSet_1= ruleDataTypeSet | this_CompoundName_2= ruleCompoundName | kw= 'String' | kw= 'int' | kw= 'Integer' | kw= 'long' | kw= 'Long' | kw= 'boolean' | kw= 'Boolean' | kw= 'DateTime' | kw= 'double' | kw= 'Double' | kw= 'float' | kw= 'Float' | kw= 'Object' )
            int alt24=16;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt24=1;
                }
                break;
            case 67:
                {
                alt24=2;
                }
                break;
            case RULE_ID:
                {
                alt24=3;
                }
                break;
            case 51:
                {
                alt24=4;
                }
                break;
            case 52:
                {
                alt24=5;
                }
                break;
            case 53:
                {
                alt24=6;
                }
                break;
            case 54:
                {
                alt24=7;
                }
                break;
            case 55:
                {
                alt24=8;
                }
                break;
            case 56:
                {
                alt24=9;
                }
                break;
            case 57:
                {
                alt24=10;
                }
                break;
            case 58:
                {
                alt24=11;
                }
                break;
            case 59:
                {
                alt24=12;
                }
                break;
            case 60:
                {
                alt24=13;
                }
                break;
            case 61:
                {
                alt24=14;
                }
                break;
            case 62:
                {
                alt24=15;
                }
                break;
            case 63:
                {
                alt24=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1929:5: this_DataTypeList_0= ruleDataTypeList
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getDataTypeListParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataTypeList_in_ruleDataType3942);
                    this_DataTypeList_0=ruleDataTypeList();

                    state._fsp--;


                    		current.merge(this_DataTypeList_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1941:5: this_DataTypeSet_1= ruleDataTypeSet
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getDataTypeSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataTypeSet_in_ruleDataType3975);
                    this_DataTypeSet_1=ruleDataTypeSet();

                    state._fsp--;


                    		current.merge(this_DataTypeSet_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1953:5: this_CompoundName_2= ruleCompoundName
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getCompoundNameParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCompoundName_in_ruleDataType4008);
                    this_CompoundName_2=ruleCompoundName();

                    state._fsp--;


                    		current.merge(this_CompoundName_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1965:2: kw= 'String'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleDataType4032); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1972:2: kw= 'int'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleDataType4051); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1979:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleDataType4070); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntegerKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1986:2: kw= 'long'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleDataType4089); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getLongKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1993:2: kw= 'Long'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleDataType4108); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getLongKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2000:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleDataType4127); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2007:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleDataType4146); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2014:2: kw= 'DateTime'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleDataType4165); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getDateTimeKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2021:2: kw= 'double'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleDataType4184); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getDoubleKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2028:2: kw= 'Double'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleDataType4203); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getDoubleKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2035:2: kw= 'float'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleDataType4222); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getFloatKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2042:2: kw= 'Float'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleDataType4241); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getFloatKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2049:2: kw= 'Object'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleDataType4260); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getObjectKeyword_15()); 
                        

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleMethodParameter"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2062:1: entryRuleMethodParameter returns [EObject current=null] : iv_ruleMethodParameter= ruleMethodParameter EOF ;
    public final EObject entryRuleMethodParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodParameter = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2063:2: (iv_ruleMethodParameter= ruleMethodParameter EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2064:2: iv_ruleMethodParameter= ruleMethodParameter EOF
            {
             newCompositeNode(grammarAccess.getMethodParameterRule()); 
            pushFollow(FOLLOW_ruleMethodParameter_in_entryRuleMethodParameter4300);
            iv_ruleMethodParameter=ruleMethodParameter();

            state._fsp--;

             current =iv_ruleMethodParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodParameter4310); 

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
    // $ANTLR end "entryRuleMethodParameter"


    // $ANTLR start "ruleMethodParameter"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2071:1: ruleMethodParameter returns [EObject current=null] : ( ( (lv_typeAndAttr_0_0= ruleTypeAndAttribute ) ) (otherlv_1= ',' ( (lv_typeAndAttr_2_0= ruleTypeAndAttribute ) ) )* ) ;
    public final EObject ruleMethodParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_typeAndAttr_0_0 = null;

        EObject lv_typeAndAttr_2_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2074:28: ( ( ( (lv_typeAndAttr_0_0= ruleTypeAndAttribute ) ) (otherlv_1= ',' ( (lv_typeAndAttr_2_0= ruleTypeAndAttribute ) ) )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2075:1: ( ( (lv_typeAndAttr_0_0= ruleTypeAndAttribute ) ) (otherlv_1= ',' ( (lv_typeAndAttr_2_0= ruleTypeAndAttribute ) ) )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2075:1: ( ( (lv_typeAndAttr_0_0= ruleTypeAndAttribute ) ) (otherlv_1= ',' ( (lv_typeAndAttr_2_0= ruleTypeAndAttribute ) ) )* )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2075:2: ( (lv_typeAndAttr_0_0= ruleTypeAndAttribute ) ) (otherlv_1= ',' ( (lv_typeAndAttr_2_0= ruleTypeAndAttribute ) ) )*
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2075:2: ( (lv_typeAndAttr_0_0= ruleTypeAndAttribute ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2076:1: (lv_typeAndAttr_0_0= ruleTypeAndAttribute )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2076:1: (lv_typeAndAttr_0_0= ruleTypeAndAttribute )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2077:3: lv_typeAndAttr_0_0= ruleTypeAndAttribute
            {
             
            	        newCompositeNode(grammarAccess.getMethodParameterAccess().getTypeAndAttrTypeAndAttributeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndAttribute_in_ruleMethodParameter4356);
            lv_typeAndAttr_0_0=ruleTypeAndAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodParameterRule());
            	        }
                   		add(
                   			current, 
                   			"typeAndAttr",
                    		lv_typeAndAttr_0_0, 
                    		"TypeAndAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2093:2: (otherlv_1= ',' ( (lv_typeAndAttr_2_0= ruleTypeAndAttribute ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2093:4: otherlv_1= ',' ( (lv_typeAndAttr_2_0= ruleTypeAndAttribute ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleMethodParameter4369); 

            	        	newLeafNode(otherlv_1, grammarAccess.getMethodParameterAccess().getCommaKeyword_1_0());
            	        
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2097:1: ( (lv_typeAndAttr_2_0= ruleTypeAndAttribute ) )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2098:1: (lv_typeAndAttr_2_0= ruleTypeAndAttribute )
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2098:1: (lv_typeAndAttr_2_0= ruleTypeAndAttribute )
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2099:3: lv_typeAndAttr_2_0= ruleTypeAndAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodParameterAccess().getTypeAndAttrTypeAndAttributeParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndAttribute_in_ruleMethodParameter4390);
            	    lv_typeAndAttr_2_0=ruleTypeAndAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodParameterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"typeAndAttr",
            	            		lv_typeAndAttr_2_0, 
            	            		"TypeAndAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleMethodParameter"


    // $ANTLR start "entryRuleTypeAndAttribute"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2123:1: entryRuleTypeAndAttribute returns [EObject current=null] : iv_ruleTypeAndAttribute= ruleTypeAndAttribute EOF ;
    public final EObject entryRuleTypeAndAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAndAttribute = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2124:2: (iv_ruleTypeAndAttribute= ruleTypeAndAttribute EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2125:2: iv_ruleTypeAndAttribute= ruleTypeAndAttribute EOF
            {
             newCompositeNode(grammarAccess.getTypeAndAttributeRule()); 
            pushFollow(FOLLOW_ruleTypeAndAttribute_in_entryRuleTypeAndAttribute4428);
            iv_ruleTypeAndAttribute=ruleTypeAndAttribute();

            state._fsp--;

             current =iv_ruleTypeAndAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeAndAttribute4438); 

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
    // $ANTLR end "entryRuleTypeAndAttribute"


    // $ANTLR start "ruleTypeAndAttribute"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2132:1: ruleTypeAndAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeAndAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2135:28: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2136:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2136:1: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2136:2: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2136:2: ( (lv_type_0_0= ruleDataType ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2137:1: (lv_type_0_0= ruleDataType )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2137:1: (lv_type_0_0= ruleDataType )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2138:3: lv_type_0_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getTypeAndAttributeAccess().getTypeDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleTypeAndAttribute4484);
            lv_type_0_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeAndAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2154:2: ( (lv_name_1_0= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2155:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2155:1: (lv_name_1_0= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2156:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeAndAttribute4501); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTypeAndAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeAndAttributeRule());
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
    // $ANTLR end "ruleTypeAndAttribute"


    // $ANTLR start "entryRuleExtendBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2180:1: entryRuleExtendBlock returns [EObject current=null] : iv_ruleExtendBlock= ruleExtendBlock EOF ;
    public final EObject entryRuleExtendBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2181:2: (iv_ruleExtendBlock= ruleExtendBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2182:2: iv_ruleExtendBlock= ruleExtendBlock EOF
            {
             newCompositeNode(grammarAccess.getExtendBlockRule()); 
            pushFollow(FOLLOW_ruleExtendBlock_in_entryRuleExtendBlock4542);
            iv_ruleExtendBlock=ruleExtendBlock();

            state._fsp--;

             current =iv_ruleExtendBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendBlock4552); 

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
    // $ANTLR end "entryRuleExtendBlock"


    // $ANTLR start "ruleExtendBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2189:1: ruleExtendBlock returns [EObject current=null] : ( ruleExtend ( (lv_values_1_0= ruleCompoundName ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleCompoundName ) ) )? ) ;
    public final EObject ruleExtendBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_values_1_0 = null;

        AntlrDatatypeRuleToken lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2192:28: ( ( ruleExtend ( (lv_values_1_0= ruleCompoundName ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleCompoundName ) ) )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2193:1: ( ruleExtend ( (lv_values_1_0= ruleCompoundName ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleCompoundName ) ) )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2193:1: ( ruleExtend ( (lv_values_1_0= ruleCompoundName ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleCompoundName ) ) )? )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2194:5: ruleExtend ( (lv_values_1_0= ruleCompoundName ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleCompoundName ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getExtendBlockAccess().getExtendParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExtend_in_ruleExtendBlock4593);
            ruleExtend();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2201:1: ( (lv_values_1_0= ruleCompoundName ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2202:1: (lv_values_1_0= ruleCompoundName )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2202:1: (lv_values_1_0= ruleCompoundName )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2203:3: lv_values_1_0= ruleCompoundName
            {
             
            	        newCompositeNode(grammarAccess.getExtendBlockAccess().getValuesCompoundNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCompoundName_in_ruleExtendBlock4613);
            lv_values_1_0=ruleCompoundName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtendBlockRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_1_0, 
                    		"CompoundName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2219:2: (otherlv_2= ',' ( (lv_values_3_0= ruleCompoundName ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2219:4: otherlv_2= ',' ( (lv_values_3_0= ruleCompoundName ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleExtendBlock4626); 

                        	newLeafNode(otherlv_2, grammarAccess.getExtendBlockAccess().getCommaKeyword_2_0());
                        
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2223:1: ( (lv_values_3_0= ruleCompoundName ) )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2224:1: (lv_values_3_0= ruleCompoundName )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2224:1: (lv_values_3_0= ruleCompoundName )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2225:3: lv_values_3_0= ruleCompoundName
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtendBlockAccess().getValuesCompoundNameParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCompoundName_in_ruleExtendBlock4647);
                    lv_values_3_0=ruleCompoundName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtendBlockRule());
                    	        }
                           		add(
                           			current, 
                           			"values",
                            		lv_values_3_0, 
                            		"CompoundName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleExtendBlock"


    // $ANTLR start "entryRuleExtend"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2249:1: entryRuleExtend returns [String current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final String entryRuleExtend() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtend = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2250:2: (iv_ruleExtend= ruleExtend EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2251:2: iv_ruleExtend= ruleExtend EOF
            {
             newCompositeNode(grammarAccess.getExtendRule()); 
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend4686);
            iv_ruleExtend=ruleExtend();

            state._fsp--;

             current =iv_ruleExtend.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend4697); 

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
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2258:1: ruleExtend returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ':' ;
    public final AntlrDatatypeRuleToken ruleExtend() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2261:28: (kw= ':' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2263:2: kw= ':'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleExtend4734); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getExtendAccess().getColonKeyword()); 
                

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
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleDataTypeList"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2276:1: entryRuleDataTypeList returns [String current=null] : iv_ruleDataTypeList= ruleDataTypeList EOF ;
    public final String entryRuleDataTypeList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypeList = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2277:2: (iv_ruleDataTypeList= ruleDataTypeList EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2278:2: iv_ruleDataTypeList= ruleDataTypeList EOF
            {
             newCompositeNode(grammarAccess.getDataTypeListRule()); 
            pushFollow(FOLLOW_ruleDataTypeList_in_entryRuleDataTypeList4774);
            iv_ruleDataTypeList=ruleDataTypeList();

            state._fsp--;

             current =iv_ruleDataTypeList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeList4785); 

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
    // $ANTLR end "entryRuleDataTypeList"


    // $ANTLR start "ruleDataTypeList"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2285:1: ruleDataTypeList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'List' kw= '<' this_DataType_2= ruleDataType kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleDataTypeList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DataType_2 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2288:28: ( (kw= 'List' kw= '<' this_DataType_2= ruleDataType kw= '>' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2289:1: (kw= 'List' kw= '<' this_DataType_2= ruleDataType kw= '>' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2289:1: (kw= 'List' kw= '<' this_DataType_2= ruleDataType kw= '>' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2290:2: kw= 'List' kw= '<' this_DataType_2= ruleDataType kw= '>'
            {
            kw=(Token)match(input,64,FOLLOW_64_in_ruleDataTypeList4823); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDataTypeListAccess().getListKeyword_0()); 
                
            kw=(Token)match(input,65,FOLLOW_65_in_ruleDataTypeList4836); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDataTypeListAccess().getLessThanSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDataTypeListAccess().getDataTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleDataType_in_ruleDataTypeList4858);
            this_DataType_2=ruleDataType();

            state._fsp--;


            		current.merge(this_DataType_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,66,FOLLOW_66_in_ruleDataTypeList4876); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDataTypeListAccess().getGreaterThanSignKeyword_3()); 
                

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
    // $ANTLR end "ruleDataTypeList"


    // $ANTLR start "entryRuleDataTypeSet"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2326:1: entryRuleDataTypeSet returns [String current=null] : iv_ruleDataTypeSet= ruleDataTypeSet EOF ;
    public final String entryRuleDataTypeSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypeSet = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2327:2: (iv_ruleDataTypeSet= ruleDataTypeSet EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2328:2: iv_ruleDataTypeSet= ruleDataTypeSet EOF
            {
             newCompositeNode(grammarAccess.getDataTypeSetRule()); 
            pushFollow(FOLLOW_ruleDataTypeSet_in_entryRuleDataTypeSet4917);
            iv_ruleDataTypeSet=ruleDataTypeSet();

            state._fsp--;

             current =iv_ruleDataTypeSet.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeSet4928); 

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
    // $ANTLR end "entryRuleDataTypeSet"


    // $ANTLR start "ruleDataTypeSet"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2335:1: ruleDataTypeSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' kw= '<' this_DataType_2= ruleDataType kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleDataTypeSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DataType_2 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2338:28: ( (kw= 'Set' kw= '<' this_DataType_2= ruleDataType kw= '>' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2339:1: (kw= 'Set' kw= '<' this_DataType_2= ruleDataType kw= '>' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2339:1: (kw= 'Set' kw= '<' this_DataType_2= ruleDataType kw= '>' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2340:2: kw= 'Set' kw= '<' this_DataType_2= ruleDataType kw= '>'
            {
            kw=(Token)match(input,67,FOLLOW_67_in_ruleDataTypeSet4966); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDataTypeSetAccess().getSetKeyword_0()); 
                
            kw=(Token)match(input,65,FOLLOW_65_in_ruleDataTypeSet4979); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDataTypeSetAccess().getLessThanSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDataTypeSetAccess().getDataTypeParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleDataType_in_ruleDataTypeSet5001);
            this_DataType_2=ruleDataType();

            state._fsp--;


            		current.merge(this_DataType_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,66,FOLLOW_66_in_ruleDataTypeSet5019); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDataTypeSetAccess().getGreaterThanSignKeyword_3()); 
                

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
    // $ANTLR end "ruleDataTypeSet"


    // $ANTLR start "entryRuleAccessModifier"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2376:1: entryRuleAccessModifier returns [String current=null] : iv_ruleAccessModifier= ruleAccessModifier EOF ;
    public final String entryRuleAccessModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAccessModifier = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2377:2: (iv_ruleAccessModifier= ruleAccessModifier EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2378:2: iv_ruleAccessModifier= ruleAccessModifier EOF
            {
             newCompositeNode(grammarAccess.getAccessModifierRule()); 
            pushFollow(FOLLOW_ruleAccessModifier_in_entryRuleAccessModifier5060);
            iv_ruleAccessModifier=ruleAccessModifier();

            state._fsp--;

             current =iv_ruleAccessModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessModifier5071); 

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
    // $ANTLR end "entryRuleAccessModifier"


    // $ANTLR start "ruleAccessModifier"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2385:1: ruleAccessModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Private_0= rulePrivate | this_Protected_1= ruleProtected ) ;
    public final AntlrDatatypeRuleToken ruleAccessModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Private_0 = null;

        AntlrDatatypeRuleToken this_Protected_1 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2388:28: ( (this_Private_0= rulePrivate | this_Protected_1= ruleProtected ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2389:1: (this_Private_0= rulePrivate | this_Protected_1= ruleProtected )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2389:1: (this_Private_0= rulePrivate | this_Protected_1= ruleProtected )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=68 && LA27_0<=69)) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=70 && LA27_0<=71)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2390:5: this_Private_0= rulePrivate
                    {
                     
                            newCompositeNode(grammarAccess.getAccessModifierAccess().getPrivateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrivate_in_ruleAccessModifier5118);
                    this_Private_0=rulePrivate();

                    state._fsp--;


                    		current.merge(this_Private_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2402:5: this_Protected_1= ruleProtected
                    {
                     
                            newCompositeNode(grammarAccess.getAccessModifierAccess().getProtectedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleProtected_in_ruleAccessModifier5151);
                    this_Protected_1=ruleProtected();

                    state._fsp--;


                    		current.merge(this_Protected_1);
                        
                     
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
    // $ANTLR end "ruleAccessModifier"


    // $ANTLR start "entryRulePrivate"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2420:1: entryRulePrivate returns [String current=null] : iv_rulePrivate= rulePrivate EOF ;
    public final String entryRulePrivate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrivate = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2421:2: (iv_rulePrivate= rulePrivate EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2422:2: iv_rulePrivate= rulePrivate EOF
            {
             newCompositeNode(grammarAccess.getPrivateRule()); 
            pushFollow(FOLLOW_rulePrivate_in_entryRulePrivate5197);
            iv_rulePrivate=rulePrivate();

            state._fsp--;

             current =iv_rulePrivate.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrivate5208); 

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
    // $ANTLR end "entryRulePrivate"


    // $ANTLR start "rulePrivate"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2429:1: rulePrivate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'private' ) ;
    public final AntlrDatatypeRuleToken rulePrivate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2432:28: ( (kw= '-' | kw= 'private' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2433:1: (kw= '-' | kw= 'private' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2433:1: (kw= '-' | kw= 'private' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==68) ) {
                alt28=1;
            }
            else if ( (LA28_0==69) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2434:2: kw= '-'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_rulePrivate5246); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrivateAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2441:2: kw= 'private'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_rulePrivate5265); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrivateAccess().getPrivateKeyword_1()); 
                        

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
    // $ANTLR end "rulePrivate"


    // $ANTLR start "entryRuleProtected"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2454:1: entryRuleProtected returns [String current=null] : iv_ruleProtected= ruleProtected EOF ;
    public final String entryRuleProtected() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtected = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2455:2: (iv_ruleProtected= ruleProtected EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2456:2: iv_ruleProtected= ruleProtected EOF
            {
             newCompositeNode(grammarAccess.getProtectedRule()); 
            pushFollow(FOLLOW_ruleProtected_in_entryRuleProtected5306);
            iv_ruleProtected=ruleProtected();

            state._fsp--;

             current =iv_ruleProtected.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtected5317); 

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
    // $ANTLR end "entryRuleProtected"


    // $ANTLR start "ruleProtected"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2463:1: ruleProtected returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleProtected() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2466:28: ( (kw= '#' | kw= 'protected' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2467:1: (kw= '#' | kw= 'protected' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2467:1: (kw= '#' | kw= 'protected' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            else if ( (LA29_0==71) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2468:2: kw= '#'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleProtected5355); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getNumberSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2475:2: kw= 'protected'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleProtected5374); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getProtectedKeyword_1()); 
                        

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
    // $ANTLR end "ruleProtected"


    // $ANTLR start "entryRuleImportCompoundName"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2488:1: entryRuleImportCompoundName returns [String current=null] : iv_ruleImportCompoundName= ruleImportCompoundName EOF ;
    public final String entryRuleImportCompoundName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportCompoundName = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2489:2: (iv_ruleImportCompoundName= ruleImportCompoundName EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2490:2: iv_ruleImportCompoundName= ruleImportCompoundName EOF
            {
             newCompositeNode(grammarAccess.getImportCompoundNameRule()); 
            pushFollow(FOLLOW_ruleImportCompoundName_in_entryRuleImportCompoundName5415);
            iv_ruleImportCompoundName=ruleImportCompoundName();

            state._fsp--;

             current =iv_ruleImportCompoundName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportCompoundName5426); 

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
    // $ANTLR end "entryRuleImportCompoundName"


    // $ANTLR start "ruleImportCompoundName"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2497:1: ruleImportCompoundName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CompoundName_0= ruleCompoundName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleImportCompoundName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CompoundName_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2500:28: ( (this_CompoundName_0= ruleCompoundName (kw= '.*' )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2501:1: (this_CompoundName_0= ruleCompoundName (kw= '.*' )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2501:1: (this_CompoundName_0= ruleCompoundName (kw= '.*' )? )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2502:5: this_CompoundName_0= ruleCompoundName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getImportCompoundNameAccess().getCompoundNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCompoundName_in_ruleImportCompoundName5473);
            this_CompoundName_0=ruleCompoundName();

            state._fsp--;


            		current.merge(this_CompoundName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2512:1: (kw= '.*' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==72) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2513:2: kw= '.*'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleImportCompoundName5492); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getImportCompoundNameAccess().getFullStopAsteriskKeyword_1()); 
                        

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
    // $ANTLR end "ruleImportCompoundName"


    // $ANTLR start "entryRuleCompoundName"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2526:1: entryRuleCompoundName returns [String current=null] : iv_ruleCompoundName= ruleCompoundName EOF ;
    public final String entryRuleCompoundName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundName = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2527:2: (iv_ruleCompoundName= ruleCompoundName EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2528:2: iv_ruleCompoundName= ruleCompoundName EOF
            {
             newCompositeNode(grammarAccess.getCompoundNameRule()); 
            pushFollow(FOLLOW_ruleCompoundName_in_entryRuleCompoundName5535);
            iv_ruleCompoundName=ruleCompoundName();

            state._fsp--;

             current =iv_ruleCompoundName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundName5546); 

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
    // $ANTLR end "entryRuleCompoundName"


    // $ANTLR start "ruleCompoundName"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2535:1: ruleCompoundName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleCompoundName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2538:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2539:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2539:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2539:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundName5586); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getCompoundNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2546:1: (kw= '.' this_ID_2= RULE_ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==73) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2547:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,73,FOLLOW_73_in_ruleCompoundName5605); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCompoundNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundName5620); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getCompoundNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleCompoundName"


    // $ANTLR start "entryRuleBOOLEAN"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2567:1: entryRuleBOOLEAN returns [String current=null] : iv_ruleBOOLEAN= ruleBOOLEAN EOF ;
    public final String entryRuleBOOLEAN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOLEAN = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2568:2: (iv_ruleBOOLEAN= ruleBOOLEAN EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2569:2: iv_ruleBOOLEAN= ruleBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getBOOLEANRule()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN5668);
            iv_ruleBOOLEAN=ruleBOOLEAN();

            state._fsp--;

             current =iv_ruleBOOLEAN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOLEAN5679); 

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
    // $ANTLR end "entryRuleBOOLEAN"


    // $ANTLR start "ruleBOOLEAN"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2576:1: ruleBOOLEAN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOLEAN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2579:28: ( (kw= 'true' | kw= 'false' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2580:1: (kw= 'true' | kw= 'false' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2580:1: (kw= 'true' | kw= 'false' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==74) ) {
                alt32=1;
            }
            else if ( (LA32_0==75) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2581:2: kw= 'true'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleBOOLEAN5717); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2588:2: kw= 'false'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleBOOLEAN5736); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBOOLEANAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "entryRuleINTEGER"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2601:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2602:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2603:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
             newCompositeNode(grammarAccess.getINTEGERRule()); 
            pushFollow(FOLLOW_ruleINTEGER_in_entryRuleINTEGER5777);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;

             current =iv_ruleINTEGER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTEGER5788); 

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
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2610:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT )+ ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2613:28: ( (this_INT_0= RULE_INT )+ )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2614:1: (this_INT_0= RULE_INT )+
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2614:1: (this_INT_0= RULE_INT )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_INT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:2614:6: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTEGER5828); 

            	    		current.merge(this_INT_0);
            	        
            	     
            	        newLeafNode(this_INT_0, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
    // $ANTLR end "ruleINTEGER"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLedsCodeDSL_in_entryRuleLedsCodeDSL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLedsCodeDSL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleLedsCodeDSL130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProject212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject246 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleInfrastructureBlock_in_ruleProject267 = new BitSet(new long[]{0x0000001400004000L});
    public static final BitSet FOLLOW_ruleInterfaceBlock_in_ruleProject288 = new BitSet(new long[]{0x0000001400004000L});
    public static final BitSet FOLLOW_ruleApplicationBlock_in_ruleProject310 = new BitSet(new long[]{0x0000001400004000L});
    public static final BitSet FOLLOW_ruleDomainBlock_in_ruleProject332 = new BitSet(new long[]{0x0000001400006000L});
    public static final BitSet FOLLOW_13_in_ruleProject345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceBlock_in_entryRuleInterfaceBlock381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceBlock391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleInterfaceBlock428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceBlock445 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterfaceBlock462 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_ruleInterfaceApplication_in_ruleInterfaceBlock483 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_13_in_ruleInterfaceBlock496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceApplication_in_entryRuleInterfaceApplication532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceApplication542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleInterfaceApplication587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceApplication616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceApplication649 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInterfaceApplication666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceApplication683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfrastructureBlock_in_entryRuleInfrastructureBlock724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfrastructureBlock734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleInfrastructureBlock771 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInfrastructureBlock783 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInfrastructureBlock795 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInfrastructureBlock807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInfrastructureBlock824 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInfrastructureBlock841 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInfrastructureBlock853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInfrastructureBlock870 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInfrastructureBlock887 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInfrastructureBlock899 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInfrastructureBlock911 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleNameVersion_in_ruleInfrastructureBlock932 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInfrastructureBlock944 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInfrastructureBlock956 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInfrastructureBlock968 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInfrastructureBlock980 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleNameVersion_in_ruleInfrastructureBlock1001 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInfrastructureBlock1013 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInfrastructureBlock1025 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInfrastructureBlock1037 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInfrastructureBlock1049 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleNameVersion_in_ruleInfrastructureBlock1070 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInfrastructureBlock1082 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleInfrastructureBlock1094 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInfrastructureBlock1106 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInfrastructureBlock1118 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleDatabase_in_ruleInfrastructureBlock1139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInfrastructureBlock1151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInfrastructureBlock1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDatabase1246 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDatabase1258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatabase1275 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDatabase1292 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDatabase1304 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDatabase1316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatabase1333 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDatabase1350 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDatabase1362 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDatabase1374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatabase1391 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDatabase1408 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDatabase1420 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDatabase1432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatabase1449 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDatabase1466 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDatabase1478 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDatabase1490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatabase1507 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDatabase1524 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDatabase1536 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDatabase1548 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDatabase1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameVersion_in_entryRuleNameVersion1606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameVersion1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleNameVersion1653 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNameVersion1665 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNameVersion1682 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNameVersion1699 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleNameVersion1711 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNameVersion1723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNameVersion1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationBlock_in_entryRuleApplicationBlock1781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationBlock1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleApplicationBlock1828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationBlock1845 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplicationBlock1862 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_35_in_ruleApplicationBlock1875 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImportCompoundName_in_ruleApplicationBlock1896 = new BitSet(new long[]{0x0000000800002000L});
    public static final BitSet FOLLOW_13_in_ruleApplicationBlock1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainBlock_in_entryRuleDomainBlock1946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainBlock1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDomainBlock1993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainBlock2010 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainBlock2027 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_ruleModule_in_ruleDomainBlock2048 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_ruleDomainBlock2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule2097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleModule2144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule2161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule2178 = new BitSet(new long[]{0x000401C000002000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_ruleModule2200 = new BitSet(new long[]{0x000401C000002000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleEntityBlock_in_ruleModule2227 = new BitSet(new long[]{0x000401C000002000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleEnumBlock_in_ruleModule2254 = new BitSet(new long[]{0x000401C000002000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_13_in_ruleModule2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock2304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceBlock2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleServiceBlock2351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceBlock2368 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleServiceBlock2385 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_ruleServiceBlock2406 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleServiceBlock2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethod2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceMethod2507 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleServiceMethod2524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleServiceMethod2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBlock_in_entryRuleEntityBlock2581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityBlock2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessModifier_in_ruleEntityBlock2637 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39_in_ruleEntityBlock2656 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEntityBlock2682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityBlock2699 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_ruleExtendBlock_in_ruleEntityBlock2725 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntityBlock2738 = new BitSet(new long[]{0xFFFA000000000010L,0x00000000000000F9L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntityBlock2759 = new BitSet(new long[]{0xFFFA000000000010L,0x00000000000000F9L});
    public static final BitSet FOLLOW_ruleRepository_in_ruleEntityBlock2781 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntityBlock2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessModifier_in_ruleAttribute2885 = new BitSet(new long[]{0xFFF8000000000010L,0x00000000000000F9L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleAttribute2907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2924 = new BitSet(new long[]{0x0001E60000000002L});
    public static final BitSet FOLLOW_41_in_ruleAttribute2948 = new BitSet(new long[]{0x0001E60000000002L});
    public static final BitSet FOLLOW_42_in_ruleAttribute2981 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_ruleAttribute2995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleAttribute3016 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAttribute3028 = new BitSet(new long[]{0x0001E60000000002L});
    public static final BitSet FOLLOW_45_in_ruleAttribute3049 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_43_in_ruleAttribute3063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleAttribute3084 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAttribute3096 = new BitSet(new long[]{0x0001E60000000002L});
    public static final BitSet FOLLOW_46_in_ruleAttribute3117 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_43_in_ruleAttribute3131 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleINTEGER_in_ruleAttribute3152 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAttribute3164 = new BitSet(new long[]{0x0001E60000000002L});
    public static final BitSet FOLLOW_47_in_ruleAttribute3185 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_43_in_ruleAttribute3199 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleINTEGER_in_ruleAttribute3220 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAttribute3232 = new BitSet(new long[]{0x0001E60000000002L});
    public static final BitSet FOLLOW_48_in_ruleAttribute3253 = new BitSet(new long[]{0x0001080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAttribute3267 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleINTEGER_in_ruleAttribute3288 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttribute3300 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleINTEGER_in_ruleAttribute3321 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAttribute3333 = new BitSet(new long[]{0x0001E60000000002L});
    public static final BitSet FOLLOW_ruleRepository_in_entryRuleRepository3372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepository3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRepository3419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepository3436 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRepository3453 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleRepositoryFields_in_ruleRepository3474 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleRepository3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepositoryFields_in_entryRuleRepositoryFields3523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepositoryFields3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepositoryFields3575 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleRepositoryFields3592 = new BitSet(new long[]{0xFFF8100000000010L,0x00000000000000F9L});
    public static final BitSet FOLLOW_ruleMethodParameter_in_ruleRepositoryFields3613 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleRepositoryFields3626 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRepositoryFields3638 = new BitSet(new long[]{0xFFF8000000000010L,0x00000000000000F9L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleRepositoryFields3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumBlock_in_entryRuleEnumBlock3695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumBlock3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEnumBlock3742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumBlock3759 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumBlock3776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumBlock3793 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_28_in_ruleEnumBlock3811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumBlock3828 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumBlock3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType3884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeList_in_ruleDataType3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeSet_in_ruleDataType3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleDataType4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDataType4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDataType4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleDataType4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDataType4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDataType4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDataType4127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleDataType4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleDataType4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleDataType4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDataType4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDataType4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDataType4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDataType4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodParameter_in_entryRuleMethodParameter4300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodParameter4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndAttribute_in_ruleMethodParameter4356 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleMethodParameter4369 = new BitSet(new long[]{0xFFF8000000000010L,0x00000000000000F9L});
    public static final BitSet FOLLOW_ruleTypeAndAttribute_in_ruleMethodParameter4390 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleTypeAndAttribute_in_entryRuleTypeAndAttribute4428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeAndAttribute4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleTypeAndAttribute4484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeAndAttribute4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendBlock_in_entryRuleExtendBlock4542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendBlock4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleExtendBlock4593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleExtendBlock4613 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleExtendBlock4626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleExtendBlock4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend4686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleExtend4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeList_in_entryRuleDataTypeList4774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeList4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDataTypeList4823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDataTypeList4836 = new BitSet(new long[]{0xFFF8000000000010L,0x00000000000000F9L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataTypeList4858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleDataTypeList4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeSet_in_entryRuleDataTypeSet4917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeSet4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDataTypeSet4966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDataTypeSet4979 = new BitSet(new long[]{0xFFF8000000000010L,0x00000000000000F9L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleDataTypeSet5001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleDataTypeSet5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessModifier_in_entryRuleAccessModifier5060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessModifier5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivate_in_ruleAccessModifier5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_ruleAccessModifier5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivate_in_entryRulePrivate5197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrivate5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePrivate5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePrivate5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_entryRuleProtected5306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtected5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleProtected5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleProtected5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportCompoundName_in_entryRuleImportCompoundName5415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportCompoundName5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleImportCompoundName5473 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleImportCompoundName5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_entryRuleCompoundName5535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundName5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundName5586 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleCompoundName5605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundName5620 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_entryRuleBOOLEAN5668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOLEAN5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBOOLEAN5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBOOLEAN5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_in_entryRuleINTEGER5777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTEGER5828 = new BitSet(new long[]{0x0000000000000042L});

}