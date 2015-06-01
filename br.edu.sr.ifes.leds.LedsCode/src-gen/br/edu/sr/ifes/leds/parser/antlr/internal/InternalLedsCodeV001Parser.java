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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'{'", "'}'", "'interface'", "'HtmlView'", "'RestFull'", "'infrastructure'", "'basePackage'", "'='", "'projectVersion'", "'language'", "'framework'", "'orm'", "'database'", "','", "'application'", "'composedBy'", "'domain'", "'module'", "'service'", "'=>'", "'.'", "'abstract'", "'entity'", "'repository'", "'('", "')'", "':'", "'enum'", "'String'", "'int'", "'Integer'", "'long'", "'Long'", "'boolean'", "'Boolean'", "'DateTime'", "'double'", "'Double'", "'float'", "'Float'", "'Object'", "'extend'", "'ext'", "'implement'", "'imp'", "'>'", "'List'", "'<'", "'Set'", "'-'", "'#'", "'.*'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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

        AntlrDatatypeRuleToken lv_project_0_0 = null;


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
                   		set(
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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:106:1: entryRuleProject returns [String current=null] : iv_ruleProject= ruleProject EOF ;
    public final String entryRuleProject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProject = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:107:2: (iv_ruleProject= ruleProject EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:108:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject166);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject177); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:115:1: ruleProject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'project' this_ID_1= RULE_ID kw= '{' this_InfrastructureBlock_3= ruleInfrastructureBlock ) | (this_InterfaceBlock_4= ruleInterfaceBlock )? | ( (this_ApplicationBlock_5= ruleApplicationBlock | this_DomainBlock_6= ruleDomainBlock )* kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleProject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_InfrastructureBlock_3 = null;

        AntlrDatatypeRuleToken this_InterfaceBlock_4 = null;

        AntlrDatatypeRuleToken this_ApplicationBlock_5 = null;

        AntlrDatatypeRuleToken this_DomainBlock_6 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:118:28: ( ( (kw= 'project' this_ID_1= RULE_ID kw= '{' this_InfrastructureBlock_3= ruleInfrastructureBlock ) | (this_InterfaceBlock_4= ruleInterfaceBlock )? | ( (this_ApplicationBlock_5= ruleApplicationBlock | this_DomainBlock_6= ruleDomainBlock )* kw= '}' ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:119:1: ( (kw= 'project' this_ID_1= RULE_ID kw= '{' this_InfrastructureBlock_3= ruleInfrastructureBlock ) | (this_InterfaceBlock_4= ruleInterfaceBlock )? | ( (this_ApplicationBlock_5= ruleApplicationBlock | this_DomainBlock_6= ruleDomainBlock )* kw= '}' ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:119:1: ( (kw= 'project' this_ID_1= RULE_ID kw= '{' this_InfrastructureBlock_3= ruleInfrastructureBlock ) | (this_InterfaceBlock_4= ruleInterfaceBlock )? | ( (this_ApplicationBlock_5= ruleApplicationBlock | this_DomainBlock_6= ruleDomainBlock )* kw= '}' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case EOF:
            case 14:
                {
                alt3=2;
                }
                break;
            case 13:
            case 26:
            case 28:
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
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:119:2: (kw= 'project' this_ID_1= RULE_ID kw= '{' this_InfrastructureBlock_3= ruleInfrastructureBlock )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:119:2: (kw= 'project' this_ID_1= RULE_ID kw= '{' this_InfrastructureBlock_3= ruleInfrastructureBlock )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:120:2: kw= 'project' this_ID_1= RULE_ID kw= '{' this_InfrastructureBlock_3= ruleInfrastructureBlock
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleProject216); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProjectAccess().getProjectKeyword_0_0()); 
                        
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProject231); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getProjectAccess().getIDTerminalRuleCall_0_1()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleProject249); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_0_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getProjectAccess().getInfrastructureBlockParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleInfrastructureBlock_in_ruleProject271);
                    this_InfrastructureBlock_3=ruleInfrastructureBlock();

                    state._fsp--;


                    		current.merge(this_InfrastructureBlock_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:150:6: (this_InterfaceBlock_4= ruleInterfaceBlock )?
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:150:6: (this_InterfaceBlock_4= ruleInterfaceBlock )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==14) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:151:5: this_InterfaceBlock_4= ruleInterfaceBlock
                            {
                             
                                    newCompositeNode(grammarAccess.getProjectAccess().getInterfaceBlockParserRuleCall_1()); 
                                
                            pushFollow(FOLLOW_ruleInterfaceBlock_in_ruleProject306);
                            this_InterfaceBlock_4=ruleInterfaceBlock();

                            state._fsp--;


                            		current.merge(this_InterfaceBlock_4);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:162:6: ( (this_ApplicationBlock_5= ruleApplicationBlock | this_DomainBlock_6= ruleDomainBlock )* kw= '}' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:162:6: ( (this_ApplicationBlock_5= ruleApplicationBlock | this_DomainBlock_6= ruleDomainBlock )* kw= '}' )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:162:7: (this_ApplicationBlock_5= ruleApplicationBlock | this_DomainBlock_6= ruleDomainBlock )* kw= '}'
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:162:7: (this_ApplicationBlock_5= ruleApplicationBlock | this_DomainBlock_6= ruleDomainBlock )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==26) ) {
                            alt2=1;
                        }
                        else if ( (LA2_0==28) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:163:5: this_ApplicationBlock_5= ruleApplicationBlock
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getProjectAccess().getApplicationBlockParserRuleCall_2_0_0()); 
                    	        
                    	    pushFollow(FOLLOW_ruleApplicationBlock_in_ruleProject343);
                    	    this_ApplicationBlock_5=ruleApplicationBlock();

                    	    state._fsp--;


                    	    		current.merge(this_ApplicationBlock_5);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:175:5: this_DomainBlock_6= ruleDomainBlock
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getProjectAccess().getDomainBlockParserRuleCall_2_0_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleDomainBlock_in_ruleProject376);
                    	    this_DomainBlock_6=ruleDomainBlock();

                    	    state._fsp--;


                    	    		current.merge(this_DomainBlock_6);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    kw=(Token)match(input,13,FOLLOW_13_in_ruleProject396); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_2_1()); 
                        

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleInterfaceBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:199:1: entryRuleInterfaceBlock returns [String current=null] : iv_ruleInterfaceBlock= ruleInterfaceBlock EOF ;
    public final String entryRuleInterfaceBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInterfaceBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:200:2: (iv_ruleInterfaceBlock= ruleInterfaceBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:201:2: iv_ruleInterfaceBlock= ruleInterfaceBlock EOF
            {
             newCompositeNode(grammarAccess.getInterfaceBlockRule()); 
            pushFollow(FOLLOW_ruleInterfaceBlock_in_entryRuleInterfaceBlock438);
            iv_ruleInterfaceBlock=ruleInterfaceBlock();

            state._fsp--;

             current =iv_ruleInterfaceBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceBlock449); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:208:1: ruleInterfaceBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'interface' this_ID_1= RULE_ID kw= '{' ( (kw= 'HtmlView' | kw= 'RestFull' ) this_ID_5= RULE_ID )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleInterfaceBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_5=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:211:28: ( (kw= 'interface' this_ID_1= RULE_ID kw= '{' ( (kw= 'HtmlView' | kw= 'RestFull' ) this_ID_5= RULE_ID )* kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:212:1: (kw= 'interface' this_ID_1= RULE_ID kw= '{' ( (kw= 'HtmlView' | kw= 'RestFull' ) this_ID_5= RULE_ID )* kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:212:1: (kw= 'interface' this_ID_1= RULE_ID kw= '{' ( (kw= 'HtmlView' | kw= 'RestFull' ) this_ID_5= RULE_ID )* kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:213:2: kw= 'interface' this_ID_1= RULE_ID kw= '{' ( (kw= 'HtmlView' | kw= 'RestFull' ) this_ID_5= RULE_ID )* kw= '}'
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleInterfaceBlock487); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInterfaceBlockAccess().getInterfaceKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceBlock502); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getInterfaceBlockAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleInterfaceBlock520); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInterfaceBlockAccess().getLeftCurlyBracketKeyword_2()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:231:1: ( (kw= 'HtmlView' | kw= 'RestFull' ) this_ID_5= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:231:2: (kw= 'HtmlView' | kw= 'RestFull' ) this_ID_5= RULE_ID
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:231:2: (kw= 'HtmlView' | kw= 'RestFull' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==15) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==16) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:232:2: kw= 'HtmlView'
            	            {
            	            kw=(Token)match(input,15,FOLLOW_15_in_ruleInterfaceBlock535); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getInterfaceBlockAccess().getHtmlViewKeyword_3_0_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:239:2: kw= 'RestFull'
            	            {
            	            kw=(Token)match(input,16,FOLLOW_16_in_ruleInterfaceBlock554); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getInterfaceBlockAccess().getRestFullKeyword_3_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterfaceBlock570); 

            	    		current.merge(this_ID_5);
            	        
            	     
            	        newLeafNode(this_ID_5, grammarAccess.getInterfaceBlockAccess().getIDTerminalRuleCall_3_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            kw=(Token)match(input,13,FOLLOW_13_in_ruleInterfaceBlock590); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInterfaceBlockAccess().getRightCurlyBracketKeyword_4()); 
                

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


    // $ANTLR start "entryRuleInfrastructureBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:265:1: entryRuleInfrastructureBlock returns [String current=null] : iv_ruleInfrastructureBlock= ruleInfrastructureBlock EOF ;
    public final String entryRuleInfrastructureBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfrastructureBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:266:2: (iv_ruleInfrastructureBlock= ruleInfrastructureBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:267:2: iv_ruleInfrastructureBlock= ruleInfrastructureBlock EOF
            {
             newCompositeNode(grammarAccess.getInfrastructureBlockRule()); 
            pushFollow(FOLLOW_ruleInfrastructureBlock_in_entryRuleInfrastructureBlock631);
            iv_ruleInfrastructureBlock=ruleInfrastructureBlock();

            state._fsp--;

             current =iv_ruleInfrastructureBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfrastructureBlock642); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:274:1: ruleInfrastructureBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'infrastructure' kw= '{' ( (kw= 'basePackage' kw= '=' this_CompoundName_4= ruleCompoundName ) | (kw= 'projectVersion' kw= '=' this_CompoundVersion_7= ruleCompoundVersion ) | (kw= 'language' kw= '=' this_DictBlock_10= ruleDictBlock ) | (kw= 'framework' kw= '=' this_DictBlock_13= ruleDictBlock ) | (kw= 'orm' kw= '=' this_DictBlock_16= ruleDictBlock ) | (kw= 'database' kw= '=' this_DictBlock_19= ruleDictBlock ) ) kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleInfrastructureBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CompoundName_4 = null;

        AntlrDatatypeRuleToken this_CompoundVersion_7 = null;

        AntlrDatatypeRuleToken this_DictBlock_10 = null;

        AntlrDatatypeRuleToken this_DictBlock_13 = null;

        AntlrDatatypeRuleToken this_DictBlock_16 = null;

        AntlrDatatypeRuleToken this_DictBlock_19 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:277:28: ( (kw= 'infrastructure' kw= '{' ( (kw= 'basePackage' kw= '=' this_CompoundName_4= ruleCompoundName ) | (kw= 'projectVersion' kw= '=' this_CompoundVersion_7= ruleCompoundVersion ) | (kw= 'language' kw= '=' this_DictBlock_10= ruleDictBlock ) | (kw= 'framework' kw= '=' this_DictBlock_13= ruleDictBlock ) | (kw= 'orm' kw= '=' this_DictBlock_16= ruleDictBlock ) | (kw= 'database' kw= '=' this_DictBlock_19= ruleDictBlock ) ) kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:278:1: (kw= 'infrastructure' kw= '{' ( (kw= 'basePackage' kw= '=' this_CompoundName_4= ruleCompoundName ) | (kw= 'projectVersion' kw= '=' this_CompoundVersion_7= ruleCompoundVersion ) | (kw= 'language' kw= '=' this_DictBlock_10= ruleDictBlock ) | (kw= 'framework' kw= '=' this_DictBlock_13= ruleDictBlock ) | (kw= 'orm' kw= '=' this_DictBlock_16= ruleDictBlock ) | (kw= 'database' kw= '=' this_DictBlock_19= ruleDictBlock ) ) kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:278:1: (kw= 'infrastructure' kw= '{' ( (kw= 'basePackage' kw= '=' this_CompoundName_4= ruleCompoundName ) | (kw= 'projectVersion' kw= '=' this_CompoundVersion_7= ruleCompoundVersion ) | (kw= 'language' kw= '=' this_DictBlock_10= ruleDictBlock ) | (kw= 'framework' kw= '=' this_DictBlock_13= ruleDictBlock ) | (kw= 'orm' kw= '=' this_DictBlock_16= ruleDictBlock ) | (kw= 'database' kw= '=' this_DictBlock_19= ruleDictBlock ) ) kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:279:2: kw= 'infrastructure' kw= '{' ( (kw= 'basePackage' kw= '=' this_CompoundName_4= ruleCompoundName ) | (kw= 'projectVersion' kw= '=' this_CompoundVersion_7= ruleCompoundVersion ) | (kw= 'language' kw= '=' this_DictBlock_10= ruleDictBlock ) | (kw= 'framework' kw= '=' this_DictBlock_13= ruleDictBlock ) | (kw= 'orm' kw= '=' this_DictBlock_16= ruleDictBlock ) | (kw= 'database' kw= '=' this_DictBlock_19= ruleDictBlock ) ) kw= '}'
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleInfrastructureBlock680); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getInfrastructureKeyword_0()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleInfrastructureBlock693); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_1()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:290:1: ( (kw= 'basePackage' kw= '=' this_CompoundName_4= ruleCompoundName ) | (kw= 'projectVersion' kw= '=' this_CompoundVersion_7= ruleCompoundVersion ) | (kw= 'language' kw= '=' this_DictBlock_10= ruleDictBlock ) | (kw= 'framework' kw= '=' this_DictBlock_13= ruleDictBlock ) | (kw= 'orm' kw= '=' this_DictBlock_16= ruleDictBlock ) | (kw= 'database' kw= '=' this_DictBlock_19= ruleDictBlock ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:290:2: (kw= 'basePackage' kw= '=' this_CompoundName_4= ruleCompoundName )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:290:2: (kw= 'basePackage' kw= '=' this_CompoundName_4= ruleCompoundName )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:291:2: kw= 'basePackage' kw= '=' this_CompoundName_4= ruleCompoundName
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleInfrastructureBlock708); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getBasePackageKeyword_2_0_0()); 
                        
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleInfrastructureBlock721); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_2_0_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getInfrastructureBlockAccess().getCompoundNameParserRuleCall_2_0_2()); 
                        
                    pushFollow(FOLLOW_ruleCompoundName_in_ruleInfrastructureBlock743);
                    this_CompoundName_4=ruleCompoundName();

                    state._fsp--;


                    		current.merge(this_CompoundName_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:314:6: (kw= 'projectVersion' kw= '=' this_CompoundVersion_7= ruleCompoundVersion )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:314:6: (kw= 'projectVersion' kw= '=' this_CompoundVersion_7= ruleCompoundVersion )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:315:2: kw= 'projectVersion' kw= '=' this_CompoundVersion_7= ruleCompoundVersion
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleInfrastructureBlock769); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getProjectVersionKeyword_2_1_0()); 
                        
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleInfrastructureBlock782); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_2_1_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getInfrastructureBlockAccess().getCompoundVersionParserRuleCall_2_1_2()); 
                        
                    pushFollow(FOLLOW_ruleCompoundVersion_in_ruleInfrastructureBlock804);
                    this_CompoundVersion_7=ruleCompoundVersion();

                    state._fsp--;


                    		current.merge(this_CompoundVersion_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:338:6: (kw= 'language' kw= '=' this_DictBlock_10= ruleDictBlock )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:338:6: (kw= 'language' kw= '=' this_DictBlock_10= ruleDictBlock )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:339:2: kw= 'language' kw= '=' this_DictBlock_10= ruleDictBlock
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleInfrastructureBlock830); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getLanguageKeyword_2_2_0()); 
                        
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleInfrastructureBlock843); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_2_2_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getInfrastructureBlockAccess().getDictBlockParserRuleCall_2_2_2()); 
                        
                    pushFollow(FOLLOW_ruleDictBlock_in_ruleInfrastructureBlock865);
                    this_DictBlock_10=ruleDictBlock();

                    state._fsp--;


                    		current.merge(this_DictBlock_10);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:362:6: (kw= 'framework' kw= '=' this_DictBlock_13= ruleDictBlock )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:362:6: (kw= 'framework' kw= '=' this_DictBlock_13= ruleDictBlock )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:363:2: kw= 'framework' kw= '=' this_DictBlock_13= ruleDictBlock
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleInfrastructureBlock891); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getFrameworkKeyword_2_3_0()); 
                        
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleInfrastructureBlock904); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_2_3_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getInfrastructureBlockAccess().getDictBlockParserRuleCall_2_3_2()); 
                        
                    pushFollow(FOLLOW_ruleDictBlock_in_ruleInfrastructureBlock926);
                    this_DictBlock_13=ruleDictBlock();

                    state._fsp--;


                    		current.merge(this_DictBlock_13);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 5 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:386:6: (kw= 'orm' kw= '=' this_DictBlock_16= ruleDictBlock )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:386:6: (kw= 'orm' kw= '=' this_DictBlock_16= ruleDictBlock )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:387:2: kw= 'orm' kw= '=' this_DictBlock_16= ruleDictBlock
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleInfrastructureBlock952); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getOrmKeyword_2_4_0()); 
                        
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleInfrastructureBlock965); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_2_4_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getInfrastructureBlockAccess().getDictBlockParserRuleCall_2_4_2()); 
                        
                    pushFollow(FOLLOW_ruleDictBlock_in_ruleInfrastructureBlock987);
                    this_DictBlock_16=ruleDictBlock();

                    state._fsp--;


                    		current.merge(this_DictBlock_16);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 6 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:410:6: (kw= 'database' kw= '=' this_DictBlock_19= ruleDictBlock )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:410:6: (kw= 'database' kw= '=' this_DictBlock_19= ruleDictBlock )
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:411:2: kw= 'database' kw= '=' this_DictBlock_19= ruleDictBlock
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleInfrastructureBlock1013); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getDatabaseKeyword_2_5_0()); 
                        
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleInfrastructureBlock1026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_2_5_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getInfrastructureBlockAccess().getDictBlockParserRuleCall_2_5_2()); 
                        
                    pushFollow(FOLLOW_ruleDictBlock_in_ruleInfrastructureBlock1048);
                    this_DictBlock_19=ruleDictBlock();

                    state._fsp--;


                    		current.merge(this_DictBlock_19);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }

            kw=(Token)match(input,13,FOLLOW_13_in_ruleInfrastructureBlock1068); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_3()); 
                

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


    // $ANTLR start "entryRuleDictBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:447:1: entryRuleDictBlock returns [String current=null] : iv_ruleDictBlock= ruleDictBlock EOF ;
    public final String entryRuleDictBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDictBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:448:2: (iv_ruleDictBlock= ruleDictBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:449:2: iv_ruleDictBlock= ruleDictBlock EOF
            {
             newCompositeNode(grammarAccess.getDictBlockRule()); 
            pushFollow(FOLLOW_ruleDictBlock_in_entryRuleDictBlock1109);
            iv_ruleDictBlock=ruleDictBlock();

            state._fsp--;

             current =iv_ruleDictBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictBlock1120); 

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
    // $ANTLR end "entryRuleDictBlock"


    // $ANTLR start "ruleDictBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:456:1: ruleDictBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' (this_KeyValue_1= ruleKeyValue (kw= ',' this_KeyValue_3= ruleKeyValue )* )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleDictBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_KeyValue_1 = null;

        AntlrDatatypeRuleToken this_KeyValue_3 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:459:28: ( (kw= '{' (this_KeyValue_1= ruleKeyValue (kw= ',' this_KeyValue_3= ruleKeyValue )* )? kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:460:1: (kw= '{' (this_KeyValue_1= ruleKeyValue (kw= ',' this_KeyValue_3= ruleKeyValue )* )? kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:460:1: (kw= '{' (this_KeyValue_1= ruleKeyValue (kw= ',' this_KeyValue_3= ruleKeyValue )* )? kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:461:2: kw= '{' (this_KeyValue_1= ruleKeyValue (kw= ',' this_KeyValue_3= ruleKeyValue )* )? kw= '}'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleDictBlock1158); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDictBlockAccess().getLeftCurlyBracketKeyword_0()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:466:1: (this_KeyValue_1= ruleKeyValue (kw= ',' this_KeyValue_3= ruleKeyValue )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:467:5: this_KeyValue_1= ruleKeyValue (kw= ',' this_KeyValue_3= ruleKeyValue )*
                    {
                     
                            newCompositeNode(grammarAccess.getDictBlockAccess().getKeyValueParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleKeyValue_in_ruleDictBlock1181);
                    this_KeyValue_1=ruleKeyValue();

                    state._fsp--;


                    		current.merge(this_KeyValue_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:477:1: (kw= ',' this_KeyValue_3= ruleKeyValue )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==25) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:478:2: kw= ',' this_KeyValue_3= ruleKeyValue
                    	    {
                    	    kw=(Token)match(input,25,FOLLOW_25_in_ruleDictBlock1200); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getDictBlockAccess().getCommaKeyword_1_1_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getDictBlockAccess().getKeyValueParserRuleCall_1_1_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleKeyValue_in_ruleDictBlock1222);
                    	    this_KeyValue_3=ruleKeyValue();

                    	    state._fsp--;


                    	    		current.merge(this_KeyValue_3);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,13,FOLLOW_13_in_ruleDictBlock1244); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDictBlockAccess().getRightCurlyBracketKeyword_2()); 
                

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
    // $ANTLR end "ruleDictBlock"


    // $ANTLR start "entryRuleApplicationBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:508:1: entryRuleApplicationBlock returns [String current=null] : iv_ruleApplicationBlock= ruleApplicationBlock EOF ;
    public final String entryRuleApplicationBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleApplicationBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:509:2: (iv_ruleApplicationBlock= ruleApplicationBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:510:2: iv_ruleApplicationBlock= ruleApplicationBlock EOF
            {
             newCompositeNode(grammarAccess.getApplicationBlockRule()); 
            pushFollow(FOLLOW_ruleApplicationBlock_in_entryRuleApplicationBlock1285);
            iv_ruleApplicationBlock=ruleApplicationBlock();

            state._fsp--;

             current =iv_ruleApplicationBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationBlock1296); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:517:1: ruleApplicationBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'application' this_ID_1= RULE_ID kw= '{' (kw= 'composedBy' this_ImportCompoundName_4= ruleImportCompoundName )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleApplicationBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_ImportCompoundName_4 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:520:28: ( (kw= 'application' this_ID_1= RULE_ID kw= '{' (kw= 'composedBy' this_ImportCompoundName_4= ruleImportCompoundName )* kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:521:1: (kw= 'application' this_ID_1= RULE_ID kw= '{' (kw= 'composedBy' this_ImportCompoundName_4= ruleImportCompoundName )* kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:521:1: (kw= 'application' this_ID_1= RULE_ID kw= '{' (kw= 'composedBy' this_ImportCompoundName_4= ruleImportCompoundName )* kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:522:2: kw= 'application' this_ID_1= RULE_ID kw= '{' (kw= 'composedBy' this_ImportCompoundName_4= ruleImportCompoundName )* kw= '}'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleApplicationBlock1334); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getApplicationBlockAccess().getApplicationKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationBlock1349); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getApplicationBlockAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleApplicationBlock1367); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getApplicationBlockAccess().getLeftCurlyBracketKeyword_2()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:540:1: (kw= 'composedBy' this_ImportCompoundName_4= ruleImportCompoundName )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:541:2: kw= 'composedBy' this_ImportCompoundName_4= ruleImportCompoundName
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleApplicationBlock1381); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getApplicationBlockAccess().getComposedByKeyword_3_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getApplicationBlockAccess().getImportCompoundNameParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleImportCompoundName_in_ruleApplicationBlock1403);
            	    this_ImportCompoundName_4=ruleImportCompoundName();

            	    state._fsp--;


            	    		current.merge(this_ImportCompoundName_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            kw=(Token)match(input,13,FOLLOW_13_in_ruleApplicationBlock1423); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getApplicationBlockAccess().getRightCurlyBracketKeyword_4()); 
                

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:571:1: entryRuleDomainBlock returns [String current=null] : iv_ruleDomainBlock= ruleDomainBlock EOF ;
    public final String entryRuleDomainBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomainBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:572:2: (iv_ruleDomainBlock= ruleDomainBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:573:2: iv_ruleDomainBlock= ruleDomainBlock EOF
            {
             newCompositeNode(grammarAccess.getDomainBlockRule()); 
            pushFollow(FOLLOW_ruleDomainBlock_in_entryRuleDomainBlock1464);
            iv_ruleDomainBlock=ruleDomainBlock();

            state._fsp--;

             current =iv_ruleDomainBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainBlock1475); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:580:1: ruleDomainBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'domain' this_ID_1= RULE_ID kw= '{' (this_ModuleBlock_3= ruleModuleBlock )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleDomainBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_ModuleBlock_3 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:583:28: ( (kw= 'domain' this_ID_1= RULE_ID kw= '{' (this_ModuleBlock_3= ruleModuleBlock )* kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:584:1: (kw= 'domain' this_ID_1= RULE_ID kw= '{' (this_ModuleBlock_3= ruleModuleBlock )* kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:584:1: (kw= 'domain' this_ID_1= RULE_ID kw= '{' (this_ModuleBlock_3= ruleModuleBlock )* kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:585:2: kw= 'domain' this_ID_1= RULE_ID kw= '{' (this_ModuleBlock_3= ruleModuleBlock )* kw= '}'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleDomainBlock1513); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDomainBlockAccess().getDomainKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainBlock1528); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getDomainBlockAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleDomainBlock1546); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDomainBlockAccess().getLeftCurlyBracketKeyword_2()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:603:1: (this_ModuleBlock_3= ruleModuleBlock )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:604:5: this_ModuleBlock_3= ruleModuleBlock
            	    {
            	     
            	            newCompositeNode(grammarAccess.getDomainBlockAccess().getModuleBlockParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleModuleBlock_in_ruleDomainBlock1569);
            	    this_ModuleBlock_3=ruleModuleBlock();

            	    state._fsp--;


            	    		current.merge(this_ModuleBlock_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            kw=(Token)match(input,13,FOLLOW_13_in_ruleDomainBlock1589); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDomainBlockAccess().getRightCurlyBracketKeyword_4()); 
                

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


    // $ANTLR start "entryRuleModuleBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:628:1: entryRuleModuleBlock returns [String current=null] : iv_ruleModuleBlock= ruleModuleBlock EOF ;
    public final String entryRuleModuleBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModuleBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:629:2: (iv_ruleModuleBlock= ruleModuleBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:630:2: iv_ruleModuleBlock= ruleModuleBlock EOF
            {
             newCompositeNode(grammarAccess.getModuleBlockRule()); 
            pushFollow(FOLLOW_ruleModuleBlock_in_entryRuleModuleBlock1630);
            iv_ruleModuleBlock=ruleModuleBlock();

            state._fsp--;

             current =iv_ruleModuleBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleBlock1641); 

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
    // $ANTLR end "entryRuleModuleBlock"


    // $ANTLR start "ruleModuleBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:637:1: ruleModuleBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'module' this_ID_1= RULE_ID kw= '{' (this_ServiceBlock_3= ruleServiceBlock | this_EntityBlock_4= ruleEntityBlock | this_EnumBlock_5= ruleEnumBlock )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleModuleBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_ServiceBlock_3 = null;

        AntlrDatatypeRuleToken this_EntityBlock_4 = null;

        AntlrDatatypeRuleToken this_EnumBlock_5 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:640:28: ( (kw= 'module' this_ID_1= RULE_ID kw= '{' (this_ServiceBlock_3= ruleServiceBlock | this_EntityBlock_4= ruleEntityBlock | this_EnumBlock_5= ruleEnumBlock )* kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:641:1: (kw= 'module' this_ID_1= RULE_ID kw= '{' (this_ServiceBlock_3= ruleServiceBlock | this_EntityBlock_4= ruleEntityBlock | this_EnumBlock_5= ruleEnumBlock )* kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:641:1: (kw= 'module' this_ID_1= RULE_ID kw= '{' (this_ServiceBlock_3= ruleServiceBlock | this_EntityBlock_4= ruleEntityBlock | this_EnumBlock_5= ruleEnumBlock )* kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:642:2: kw= 'module' this_ID_1= RULE_ID kw= '{' (this_ServiceBlock_3= ruleServiceBlock | this_EntityBlock_4= ruleEntityBlock | this_EnumBlock_5= ruleEnumBlock )* kw= '}'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleModuleBlock1679); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getModuleBlockAccess().getModuleKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModuleBlock1694); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getModuleBlockAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleModuleBlock1712); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getModuleBlockAccess().getLeftCurlyBracketKeyword_2()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:660:1: (this_ServiceBlock_3= ruleServiceBlock | this_EntityBlock_4= ruleEntityBlock | this_EnumBlock_5= ruleEnumBlock )*
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt11=1;
                    }
                    break;
                case 33:
                case 34:
                case 61:
                case 62:
                    {
                    alt11=2;
                    }
                    break;
                case 39:
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:661:5: this_ServiceBlock_3= ruleServiceBlock
            	    {
            	     
            	            newCompositeNode(grammarAccess.getModuleBlockAccess().getServiceBlockParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_ruleServiceBlock_in_ruleModuleBlock1735);
            	    this_ServiceBlock_3=ruleServiceBlock();

            	    state._fsp--;


            	    		current.merge(this_ServiceBlock_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:673:5: this_EntityBlock_4= ruleEntityBlock
            	    {
            	     
            	            newCompositeNode(grammarAccess.getModuleBlockAccess().getEntityBlockParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleEntityBlock_in_ruleModuleBlock1768);
            	    this_EntityBlock_4=ruleEntityBlock();

            	    state._fsp--;


            	    		current.merge(this_EntityBlock_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:685:5: this_EnumBlock_5= ruleEnumBlock
            	    {
            	     
            	            newCompositeNode(grammarAccess.getModuleBlockAccess().getEnumBlockParserRuleCall_3_2()); 
            	        
            	    pushFollow(FOLLOW_ruleEnumBlock_in_ruleModuleBlock1801);
            	    this_EnumBlock_5=ruleEnumBlock();

            	    state._fsp--;


            	    		current.merge(this_EnumBlock_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            kw=(Token)match(input,13,FOLLOW_13_in_ruleModuleBlock1821); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getModuleBlockAccess().getRightCurlyBracketKeyword_4()); 
                

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
    // $ANTLR end "ruleModuleBlock"


    // $ANTLR start "entryRuleServiceBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:709:1: entryRuleServiceBlock returns [String current=null] : iv_ruleServiceBlock= ruleServiceBlock EOF ;
    public final String entryRuleServiceBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleServiceBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:710:2: (iv_ruleServiceBlock= ruleServiceBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:711:2: iv_ruleServiceBlock= ruleServiceBlock EOF
            {
             newCompositeNode(grammarAccess.getServiceBlockRule()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock1862);
            iv_ruleServiceBlock=ruleServiceBlock();

            state._fsp--;

             current =iv_ruleServiceBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceBlock1873); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:718:1: ruleServiceBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'service' this_ID_1= RULE_ID kw= '{' (this_ID_3= RULE_ID kw= '=>' this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleServiceBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;
        Token this_ID_5=null;
        Token this_ID_7=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:721:28: ( (kw= 'service' this_ID_1= RULE_ID kw= '{' (this_ID_3= RULE_ID kw= '=>' this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID )* kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:722:1: (kw= 'service' this_ID_1= RULE_ID kw= '{' (this_ID_3= RULE_ID kw= '=>' this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID )* kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:722:1: (kw= 'service' this_ID_1= RULE_ID kw= '{' (this_ID_3= RULE_ID kw= '=>' this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID )* kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:723:2: kw= 'service' this_ID_1= RULE_ID kw= '{' (this_ID_3= RULE_ID kw= '=>' this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID )* kw= '}'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleServiceBlock1911); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getServiceBlockAccess().getServiceKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceBlock1926); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getServiceBlockAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleServiceBlock1944); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getServiceBlockAccess().getLeftCurlyBracketKeyword_2()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:741:1: (this_ID_3= RULE_ID kw= '=>' this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:741:6: this_ID_3= RULE_ID kw= '=>' this_ID_5= RULE_ID kw= '.' this_ID_7= RULE_ID
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceBlock1960); 

            	    		current.merge(this_ID_3);
            	        
            	     
            	        newLeafNode(this_ID_3, grammarAccess.getServiceBlockAccess().getIDTerminalRuleCall_3_0()); 
            	        
            	    kw=(Token)match(input,31,FOLLOW_31_in_ruleServiceBlock1978); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getServiceBlockAccess().getEqualsSignGreaterThanSignKeyword_3_1()); 
            	        
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceBlock1993); 

            	    		current.merge(this_ID_5);
            	        
            	     
            	        newLeafNode(this_ID_5, grammarAccess.getServiceBlockAccess().getIDTerminalRuleCall_3_2()); 
            	        
            	    kw=(Token)match(input,32,FOLLOW_32_in_ruleServiceBlock2011); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getServiceBlockAccess().getFullStopKeyword_3_3()); 
            	        
            	    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceBlock2026); 

            	    		current.merge(this_ID_7);
            	        
            	     
            	        newLeafNode(this_ID_7, grammarAccess.getServiceBlockAccess().getIDTerminalRuleCall_3_4()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            kw=(Token)match(input,13,FOLLOW_13_in_ruleServiceBlock2046); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getServiceBlockAccess().getRightCurlyBracketKeyword_4()); 
                

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


    // $ANTLR start "entryRuleEntityBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:788:1: entryRuleEntityBlock returns [String current=null] : iv_ruleEntityBlock= ruleEntityBlock EOF ;
    public final String entryRuleEntityBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEntityBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:789:2: (iv_ruleEntityBlock= ruleEntityBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:790:2: iv_ruleEntityBlock= ruleEntityBlock EOF
            {
             newCompositeNode(grammarAccess.getEntityBlockRule()); 
            pushFollow(FOLLOW_ruleEntityBlock_in_entryRuleEntityBlock2087);
            iv_ruleEntityBlock=ruleEntityBlock();

            state._fsp--;

             current =iv_ruleEntityBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityBlock2098); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:797:1: ruleEntityBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_AccessModifier_0= ruleAccessModifier )? (kw= 'abstract' )? kw= 'entity' this_ID_3= RULE_ID (this_ExtendBlock_4= ruleExtendBlock )? (this_ImplementBlock_5= ruleImplementBlock )? kw= '{' ( (this_AccessModifier_7= ruleAccessModifier )? this_DataType_8= ruleDataType this_ID_9= RULE_ID )* (this_RepositoryBlock_10= ruleRepositoryBlock )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleEntityBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_9=null;
        AntlrDatatypeRuleToken this_AccessModifier_0 = null;

        AntlrDatatypeRuleToken this_ExtendBlock_4 = null;

        AntlrDatatypeRuleToken this_ImplementBlock_5 = null;

        AntlrDatatypeRuleToken this_AccessModifier_7 = null;

        AntlrDatatypeRuleToken this_DataType_8 = null;

        AntlrDatatypeRuleToken this_RepositoryBlock_10 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:800:28: ( ( (this_AccessModifier_0= ruleAccessModifier )? (kw= 'abstract' )? kw= 'entity' this_ID_3= RULE_ID (this_ExtendBlock_4= ruleExtendBlock )? (this_ImplementBlock_5= ruleImplementBlock )? kw= '{' ( (this_AccessModifier_7= ruleAccessModifier )? this_DataType_8= ruleDataType this_ID_9= RULE_ID )* (this_RepositoryBlock_10= ruleRepositoryBlock )? kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:801:1: ( (this_AccessModifier_0= ruleAccessModifier )? (kw= 'abstract' )? kw= 'entity' this_ID_3= RULE_ID (this_ExtendBlock_4= ruleExtendBlock )? (this_ImplementBlock_5= ruleImplementBlock )? kw= '{' ( (this_AccessModifier_7= ruleAccessModifier )? this_DataType_8= ruleDataType this_ID_9= RULE_ID )* (this_RepositoryBlock_10= ruleRepositoryBlock )? kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:801:1: ( (this_AccessModifier_0= ruleAccessModifier )? (kw= 'abstract' )? kw= 'entity' this_ID_3= RULE_ID (this_ExtendBlock_4= ruleExtendBlock )? (this_ImplementBlock_5= ruleImplementBlock )? kw= '{' ( (this_AccessModifier_7= ruleAccessModifier )? this_DataType_8= ruleDataType this_ID_9= RULE_ID )* (this_RepositoryBlock_10= ruleRepositoryBlock )? kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:801:2: (this_AccessModifier_0= ruleAccessModifier )? (kw= 'abstract' )? kw= 'entity' this_ID_3= RULE_ID (this_ExtendBlock_4= ruleExtendBlock )? (this_ImplementBlock_5= ruleImplementBlock )? kw= '{' ( (this_AccessModifier_7= ruleAccessModifier )? this_DataType_8= ruleDataType this_ID_9= RULE_ID )* (this_RepositoryBlock_10= ruleRepositoryBlock )? kw= '}'
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:801:2: (this_AccessModifier_0= ruleAccessModifier )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=61 && LA13_0<=62)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:802:5: this_AccessModifier_0= ruleAccessModifier
                    {
                     
                            newCompositeNode(grammarAccess.getEntityBlockAccess().getAccessModifierParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAccessModifier_in_ruleEntityBlock2146);
                    this_AccessModifier_0=ruleAccessModifier();

                    state._fsp--;


                    		current.merge(this_AccessModifier_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:812:3: (kw= 'abstract' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:813:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleEntityBlock2167); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEntityBlockAccess().getAbstractKeyword_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,34,FOLLOW_34_in_ruleEntityBlock2182); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEntityBlockAccess().getEntityKeyword_2()); 
                
            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityBlock2197); 

            		current.merge(this_ID_3);
                
             
                newLeafNode(this_ID_3, grammarAccess.getEntityBlockAccess().getIDTerminalRuleCall_3()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:831:1: (this_ExtendBlock_4= ruleExtendBlock )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38||(LA15_0>=53 && LA15_0<=54)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:832:5: this_ExtendBlock_4= ruleExtendBlock
                    {
                     
                            newCompositeNode(grammarAccess.getEntityBlockAccess().getExtendBlockParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleExtendBlock_in_ruleEntityBlock2225);
                    this_ExtendBlock_4=ruleExtendBlock();

                    state._fsp--;


                    		current.merge(this_ExtendBlock_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:842:3: (this_ImplementBlock_5= ruleImplementBlock )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=55 && LA16_0<=57)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:843:5: this_ImplementBlock_5= ruleImplementBlock
                    {
                     
                            newCompositeNode(grammarAccess.getEntityBlockAccess().getImplementBlockParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleImplementBlock_in_ruleEntityBlock2255);
                    this_ImplementBlock_5=ruleImplementBlock();

                    state._fsp--;


                    		current.merge(this_ImplementBlock_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,12,FOLLOW_12_in_ruleEntityBlock2275); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEntityBlockAccess().getLeftCurlyBracketKeyword_6()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:859:1: ( (this_AccessModifier_7= ruleAccessModifier )? this_DataType_8= ruleDataType this_ID_9= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=40 && LA18_0<=52)||LA18_0==58||(LA18_0>=60 && LA18_0<=62)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:859:2: (this_AccessModifier_7= ruleAccessModifier )? this_DataType_8= ruleDataType this_ID_9= RULE_ID
            	    {
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:859:2: (this_AccessModifier_7= ruleAccessModifier )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( ((LA17_0>=61 && LA17_0<=62)) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:860:5: this_AccessModifier_7= ruleAccessModifier
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getEntityBlockAccess().getAccessModifierParserRuleCall_7_0()); 
            	                
            	            pushFollow(FOLLOW_ruleAccessModifier_in_ruleEntityBlock2299);
            	            this_AccessModifier_7=ruleAccessModifier();

            	            state._fsp--;


            	            		current.merge(this_AccessModifier_7);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	     
            	            newCompositeNode(grammarAccess.getEntityBlockAccess().getDataTypeParserRuleCall_7_1()); 
            	        
            	    pushFollow(FOLLOW_ruleDataType_in_ruleEntityBlock2328);
            	    this_DataType_8=ruleDataType();

            	    state._fsp--;


            	    		current.merge(this_DataType_8);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    this_ID_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntityBlock2348); 

            	    		current.merge(this_ID_9);
            	        
            	     
            	        newLeafNode(this_ID_9, grammarAccess.getEntityBlockAccess().getIDTerminalRuleCall_7_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:888:3: (this_RepositoryBlock_10= ruleRepositoryBlock )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:889:5: this_RepositoryBlock_10= ruleRepositoryBlock
                    {
                     
                            newCompositeNode(grammarAccess.getEntityBlockAccess().getRepositoryBlockParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleRepositoryBlock_in_ruleEntityBlock2378);
                    this_RepositoryBlock_10=ruleRepositoryBlock();

                    state._fsp--;


                    		current.merge(this_RepositoryBlock_10);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,13,FOLLOW_13_in_ruleEntityBlock2398); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEntityBlockAccess().getRightCurlyBracketKeyword_9()); 
                

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


    // $ANTLR start "entryRuleRepositoryBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:913:1: entryRuleRepositoryBlock returns [String current=null] : iv_ruleRepositoryBlock= ruleRepositoryBlock EOF ;
    public final String entryRuleRepositoryBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRepositoryBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:914:2: (iv_ruleRepositoryBlock= ruleRepositoryBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:915:2: iv_ruleRepositoryBlock= ruleRepositoryBlock EOF
            {
             newCompositeNode(grammarAccess.getRepositoryBlockRule()); 
            pushFollow(FOLLOW_ruleRepositoryBlock_in_entryRuleRepositoryBlock2439);
            iv_ruleRepositoryBlock=ruleRepositoryBlock();

            state._fsp--;

             current =iv_ruleRepositoryBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepositoryBlock2450); 

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
    // $ANTLR end "entryRuleRepositoryBlock"


    // $ANTLR start "ruleRepositoryBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:922:1: ruleRepositoryBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'repository' this_ID_1= RULE_ID kw= '{' (this_ID_3= RULE_ID kw= '(' this_MethodParameter_5= ruleMethodParameter kw= ')' kw= ':' this_DataType_8= ruleDataType )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleRepositoryBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_MethodParameter_5 = null;

        AntlrDatatypeRuleToken this_DataType_8 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:925:28: ( (kw= 'repository' this_ID_1= RULE_ID kw= '{' (this_ID_3= RULE_ID kw= '(' this_MethodParameter_5= ruleMethodParameter kw= ')' kw= ':' this_DataType_8= ruleDataType )* kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:926:1: (kw= 'repository' this_ID_1= RULE_ID kw= '{' (this_ID_3= RULE_ID kw= '(' this_MethodParameter_5= ruleMethodParameter kw= ')' kw= ':' this_DataType_8= ruleDataType )* kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:926:1: (kw= 'repository' this_ID_1= RULE_ID kw= '{' (this_ID_3= RULE_ID kw= '(' this_MethodParameter_5= ruleMethodParameter kw= ')' kw= ':' this_DataType_8= ruleDataType )* kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:927:2: kw= 'repository' this_ID_1= RULE_ID kw= '{' (this_ID_3= RULE_ID kw= '(' this_MethodParameter_5= ruleMethodParameter kw= ')' kw= ':' this_DataType_8= ruleDataType )* kw= '}'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleRepositoryBlock2488); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRepositoryBlockAccess().getRepositoryKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepositoryBlock2503); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getRepositoryBlockAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleRepositoryBlock2521); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRepositoryBlockAccess().getLeftCurlyBracketKeyword_2()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:945:1: (this_ID_3= RULE_ID kw= '(' this_MethodParameter_5= ruleMethodParameter kw= ')' kw= ':' this_DataType_8= ruleDataType )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:945:6: this_ID_3= RULE_ID kw= '(' this_MethodParameter_5= ruleMethodParameter kw= ')' kw= ':' this_DataType_8= ruleDataType
            	    {
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRepositoryBlock2537); 

            	    		current.merge(this_ID_3);
            	        
            	     
            	        newLeafNode(this_ID_3, grammarAccess.getRepositoryBlockAccess().getIDTerminalRuleCall_3_0()); 
            	        
            	    kw=(Token)match(input,36,FOLLOW_36_in_ruleRepositoryBlock2555); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getRepositoryBlockAccess().getLeftParenthesisKeyword_3_1()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getRepositoryBlockAccess().getMethodParameterParserRuleCall_3_2()); 
            	        
            	    pushFollow(FOLLOW_ruleMethodParameter_in_ruleRepositoryBlock2577);
            	    this_MethodParameter_5=ruleMethodParameter();

            	    state._fsp--;


            	    		current.merge(this_MethodParameter_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleRepositoryBlock2595); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getRepositoryBlockAccess().getRightParenthesisKeyword_3_3()); 
            	        
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleRepositoryBlock2608); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getRepositoryBlockAccess().getColonKeyword_3_4()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getRepositoryBlockAccess().getDataTypeParserRuleCall_3_5()); 
            	        
            	    pushFollow(FOLLOW_ruleDataType_in_ruleRepositoryBlock2630);
            	    this_DataType_8=ruleDataType();

            	    state._fsp--;


            	    		current.merge(this_DataType_8);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            kw=(Token)match(input,13,FOLLOW_13_in_ruleRepositoryBlock2650); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRepositoryBlockAccess().getRightCurlyBracketKeyword_4()); 
                

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
    // $ANTLR end "ruleRepositoryBlock"


    // $ANTLR start "entryRuleEnumBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1006:1: entryRuleEnumBlock returns [String current=null] : iv_ruleEnumBlock= ruleEnumBlock EOF ;
    public final String entryRuleEnumBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1007:2: (iv_ruleEnumBlock= ruleEnumBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1008:2: iv_ruleEnumBlock= ruleEnumBlock EOF
            {
             newCompositeNode(grammarAccess.getEnumBlockRule()); 
            pushFollow(FOLLOW_ruleEnumBlock_in_entryRuleEnumBlock2691);
            iv_ruleEnumBlock=ruleEnumBlock();

            state._fsp--;

             current =iv_ruleEnumBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumBlock2702); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1015:1: ruleEnumBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'enum' this_ID_1= RULE_ID kw= '{' this_ID_3= RULE_ID (kw= ',' this_ID_5= RULE_ID )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleEnumBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;
        Token this_ID_5=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1018:28: ( (kw= 'enum' this_ID_1= RULE_ID kw= '{' this_ID_3= RULE_ID (kw= ',' this_ID_5= RULE_ID )* kw= '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1019:1: (kw= 'enum' this_ID_1= RULE_ID kw= '{' this_ID_3= RULE_ID (kw= ',' this_ID_5= RULE_ID )* kw= '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1019:1: (kw= 'enum' this_ID_1= RULE_ID kw= '{' this_ID_3= RULE_ID (kw= ',' this_ID_5= RULE_ID )* kw= '}' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1020:2: kw= 'enum' this_ID_1= RULE_ID kw= '{' this_ID_3= RULE_ID (kw= ',' this_ID_5= RULE_ID )* kw= '}'
            {
            kw=(Token)match(input,39,FOLLOW_39_in_ruleEnumBlock2740); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumBlockAccess().getEnumKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumBlock2755); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getEnumBlockAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,12,FOLLOW_12_in_ruleEnumBlock2773); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumBlockAccess().getLeftCurlyBracketKeyword_2()); 
                
            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumBlock2788); 

            		current.merge(this_ID_3);
                
             
                newLeafNode(this_ID_3, grammarAccess.getEnumBlockAccess().getIDTerminalRuleCall_3()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1045:1: (kw= ',' this_ID_5= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1046:2: kw= ',' this_ID_5= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleEnumBlock2807); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getEnumBlockAccess().getCommaKeyword_4_0()); 
            	        
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumBlock2822); 

            	    		current.merge(this_ID_5);
            	        
            	     
            	        newLeafNode(this_ID_5, grammarAccess.getEnumBlockAccess().getIDTerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            kw=(Token)match(input,13,FOLLOW_13_in_ruleEnumBlock2842); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnumBlockAccess().getRightCurlyBracketKeyword_5()); 
                

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1072:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1073:2: (iv_ruleDataType= ruleDataType EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1074:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType2883);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType2894); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1081:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DataTypeList_0= ruleDataTypeList | this_DataTypeSet_1= ruleDataTypeSet | this_CompoundName_2= ruleCompoundName | kw= 'String' | kw= 'int' | kw= 'Integer' | kw= 'long' | kw= 'Long' | kw= 'boolean' | kw= 'Boolean' | kw= 'DateTime' | kw= 'double' | kw= 'Double' | kw= 'float' | kw= 'Float' | kw= 'Object' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DataTypeList_0 = null;

        AntlrDatatypeRuleToken this_DataTypeSet_1 = null;

        AntlrDatatypeRuleToken this_CompoundName_2 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1084:28: ( (this_DataTypeList_0= ruleDataTypeList | this_DataTypeSet_1= ruleDataTypeSet | this_CompoundName_2= ruleCompoundName | kw= 'String' | kw= 'int' | kw= 'Integer' | kw= 'long' | kw= 'Long' | kw= 'boolean' | kw= 'Boolean' | kw= 'DateTime' | kw= 'double' | kw= 'Double' | kw= 'float' | kw= 'Float' | kw= 'Object' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1085:1: (this_DataTypeList_0= ruleDataTypeList | this_DataTypeSet_1= ruleDataTypeSet | this_CompoundName_2= ruleCompoundName | kw= 'String' | kw= 'int' | kw= 'Integer' | kw= 'long' | kw= 'Long' | kw= 'boolean' | kw= 'Boolean' | kw= 'DateTime' | kw= 'double' | kw= 'Double' | kw= 'float' | kw= 'Float' | kw= 'Object' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1085:1: (this_DataTypeList_0= ruleDataTypeList | this_DataTypeSet_1= ruleDataTypeSet | this_CompoundName_2= ruleCompoundName | kw= 'String' | kw= 'int' | kw= 'Integer' | kw= 'long' | kw= 'Long' | kw= 'boolean' | kw= 'Boolean' | kw= 'DateTime' | kw= 'double' | kw= 'Double' | kw= 'float' | kw= 'Float' | kw= 'Object' )
            int alt22=16;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt22=1;
                }
                break;
            case 60:
                {
                alt22=2;
                }
                break;
            case RULE_ID:
                {
                alt22=3;
                }
                break;
            case 40:
                {
                alt22=4;
                }
                break;
            case 41:
                {
                alt22=5;
                }
                break;
            case 42:
                {
                alt22=6;
                }
                break;
            case 43:
                {
                alt22=7;
                }
                break;
            case 44:
                {
                alt22=8;
                }
                break;
            case 45:
                {
                alt22=9;
                }
                break;
            case 46:
                {
                alt22=10;
                }
                break;
            case 47:
                {
                alt22=11;
                }
                break;
            case 48:
                {
                alt22=12;
                }
                break;
            case 49:
                {
                alt22=13;
                }
                break;
            case 50:
                {
                alt22=14;
                }
                break;
            case 51:
                {
                alt22=15;
                }
                break;
            case 52:
                {
                alt22=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1086:5: this_DataTypeList_0= ruleDataTypeList
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getDataTypeListParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDataTypeList_in_ruleDataType2941);
                    this_DataTypeList_0=ruleDataTypeList();

                    state._fsp--;


                    		current.merge(this_DataTypeList_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1098:5: this_DataTypeSet_1= ruleDataTypeSet
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getDataTypeSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataTypeSet_in_ruleDataType2974);
                    this_DataTypeSet_1=ruleDataTypeSet();

                    state._fsp--;


                    		current.merge(this_DataTypeSet_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1110:5: this_CompoundName_2= ruleCompoundName
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeAccess().getCompoundNameParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCompoundName_in_ruleDataType3007);
                    this_CompoundName_2=ruleCompoundName();

                    state._fsp--;


                    		current.merge(this_CompoundName_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1122:2: kw= 'String'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleDataType3031); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1129:2: kw= 'int'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleDataType3050); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1136:2: kw= 'Integer'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleDataType3069); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntegerKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1143:2: kw= 'long'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleDataType3088); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getLongKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1150:2: kw= 'Long'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleDataType3107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getLongKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1157:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleDataType3126); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1164:2: kw= 'Boolean'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleDataType3145); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getBooleanKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1171:2: kw= 'DateTime'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleDataType3164); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getDateTimeKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1178:2: kw= 'double'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleDataType3183); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getDoubleKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1185:2: kw= 'Double'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleDataType3202); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getDoubleKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1192:2: kw= 'float'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleDataType3221); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getFloatKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1199:2: kw= 'Float'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleDataType3240); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getFloatKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1206:2: kw= 'Object'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleDataType3259); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1219:1: entryRuleMethodParameter returns [String current=null] : iv_ruleMethodParameter= ruleMethodParameter EOF ;
    public final String entryRuleMethodParameter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMethodParameter = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1220:2: (iv_ruleMethodParameter= ruleMethodParameter EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1221:2: iv_ruleMethodParameter= ruleMethodParameter EOF
            {
             newCompositeNode(grammarAccess.getMethodParameterRule()); 
            pushFollow(FOLLOW_ruleMethodParameter_in_entryRuleMethodParameter3300);
            iv_ruleMethodParameter=ruleMethodParameter();

            state._fsp--;

             current =iv_ruleMethodParameter.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodParameter3311); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1228:1: ruleMethodParameter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DataType_0= ruleDataType this_ID_1= RULE_ID (kw= ',' this_DataType_3= ruleDataType this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleMethodParameter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_DataType_0 = null;

        AntlrDatatypeRuleToken this_DataType_3 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1231:28: ( (this_DataType_0= ruleDataType this_ID_1= RULE_ID (kw= ',' this_DataType_3= ruleDataType this_ID_4= RULE_ID )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1232:1: (this_DataType_0= ruleDataType this_ID_1= RULE_ID (kw= ',' this_DataType_3= ruleDataType this_ID_4= RULE_ID )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1232:1: (this_DataType_0= ruleDataType this_ID_1= RULE_ID (kw= ',' this_DataType_3= ruleDataType this_ID_4= RULE_ID )* )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1233:5: this_DataType_0= ruleDataType this_ID_1= RULE_ID (kw= ',' this_DataType_3= ruleDataType this_ID_4= RULE_ID )*
            {
             
                    newCompositeNode(grammarAccess.getMethodParameterAccess().getDataTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDataType_in_ruleMethodParameter3358);
            this_DataType_0=ruleDataType();

            state._fsp--;


            		current.merge(this_DataType_0);
                
             
                    afterParserOrEnumRuleCall();
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodParameter3378); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getMethodParameterAccess().getIDTerminalRuleCall_1()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1250:1: (kw= ',' this_DataType_3= ruleDataType this_ID_4= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==25) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1251:2: kw= ',' this_DataType_3= ruleDataType this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleMethodParameter3397); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getMethodParameterAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getMethodParameterAccess().getDataTypeParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleDataType_in_ruleMethodParameter3419);
            	    this_DataType_3=ruleDataType();

            	    state._fsp--;


            	    		current.merge(this_DataType_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethodParameter3439); 

            	    		current.merge(this_ID_4);
            	        
            	     
            	        newLeafNode(this_ID_4, grammarAccess.getMethodParameterAccess().getIDTerminalRuleCall_2_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
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


    // $ANTLR start "entryRuleKeyValue"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1282:1: entryRuleKeyValue returns [String current=null] : iv_ruleKeyValue= ruleKeyValue EOF ;
    public final String entryRuleKeyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyValue = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1283:2: (iv_ruleKeyValue= ruleKeyValue EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1284:2: iv_ruleKeyValue= ruleKeyValue EOF
            {
             newCompositeNode(grammarAccess.getKeyValueRule()); 
            pushFollow(FOLLOW_ruleKeyValue_in_entryRuleKeyValue3487);
            iv_ruleKeyValue=ruleKeyValue();

            state._fsp--;

             current =iv_ruleKeyValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValue3498); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1291:1: ruleKeyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= ':' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleKeyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1294:28: ( (this_ID_0= RULE_ID kw= ':' this_ID_2= RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1295:1: (this_ID_0= RULE_ID kw= ':' this_ID_2= RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1295:1: (this_ID_0= RULE_ID kw= ':' this_ID_2= RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1295:6: this_ID_0= RULE_ID kw= ':' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeyValue3538); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getKeyValueAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,38,FOLLOW_38_in_ruleKeyValue3556); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getKeyValueAccess().getColonKeyword_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKeyValue3571); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getKeyValueAccess().getIDTerminalRuleCall_2()); 
                

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


    // $ANTLR start "entryRuleExtendBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1323:1: entryRuleExtendBlock returns [String current=null] : iv_ruleExtendBlock= ruleExtendBlock EOF ;
    public final String entryRuleExtendBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1324:2: (iv_ruleExtendBlock= ruleExtendBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1325:2: iv_ruleExtendBlock= ruleExtendBlock EOF
            {
             newCompositeNode(grammarAccess.getExtendBlockRule()); 
            pushFollow(FOLLOW_ruleExtendBlock_in_entryRuleExtendBlock3617);
            iv_ruleExtendBlock=ruleExtendBlock();

            state._fsp--;

             current =iv_ruleExtendBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendBlock3628); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1332:1: ruleExtendBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Extend_0= ruleExtend this_CompoundName_1= ruleCompoundName ) ;
    public final AntlrDatatypeRuleToken ruleExtendBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Extend_0 = null;

        AntlrDatatypeRuleToken this_CompoundName_1 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1335:28: ( (this_Extend_0= ruleExtend this_CompoundName_1= ruleCompoundName ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1336:1: (this_Extend_0= ruleExtend this_CompoundName_1= ruleCompoundName )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1336:1: (this_Extend_0= ruleExtend this_CompoundName_1= ruleCompoundName )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1337:5: this_Extend_0= ruleExtend this_CompoundName_1= ruleCompoundName
            {
             
                    newCompositeNode(grammarAccess.getExtendBlockAccess().getExtendParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExtend_in_ruleExtendBlock3675);
            this_Extend_0=ruleExtend();

            state._fsp--;


            		current.merge(this_Extend_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getExtendBlockAccess().getCompoundNameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCompoundName_in_ruleExtendBlock3702);
            this_CompoundName_1=ruleCompoundName();

            state._fsp--;


            		current.merge(this_CompoundName_1);
                
             
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
    // $ANTLR end "ruleExtendBlock"


    // $ANTLR start "entryRuleExtend"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1366:1: entryRuleExtend returns [String current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final String entryRuleExtend() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtend = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1367:2: (iv_ruleExtend= ruleExtend EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1368:2: iv_ruleExtend= ruleExtend EOF
            {
             newCompositeNode(grammarAccess.getExtendRule()); 
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend3748);
            iv_ruleExtend=ruleExtend();

            state._fsp--;

             current =iv_ruleExtend.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend3759); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1375:1: ruleExtend returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'extend' | kw= 'ext' | kw= ':' ) ;
    public final AntlrDatatypeRuleToken ruleExtend() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1378:28: ( (kw= 'extend' | kw= 'ext' | kw= ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1379:1: (kw= 'extend' | kw= 'ext' | kw= ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1379:1: (kw= 'extend' | kw= 'ext' | kw= ':' )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt24=1;
                }
                break;
            case 54:
                {
                alt24=2;
                }
                break;
            case 38:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1380:2: kw= 'extend'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleExtend3797); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExtendAccess().getExtendKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1387:2: kw= 'ext'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleExtend3816); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExtendAccess().getExtKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1394:2: kw= ':'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleExtend3835); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getExtendAccess().getColonKeyword_2()); 
                        

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
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleImplementBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1407:1: entryRuleImplementBlock returns [String current=null] : iv_ruleImplementBlock= ruleImplementBlock EOF ;
    public final String entryRuleImplementBlock() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImplementBlock = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1408:2: (iv_ruleImplementBlock= ruleImplementBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1409:2: iv_ruleImplementBlock= ruleImplementBlock EOF
            {
             newCompositeNode(grammarAccess.getImplementBlockRule()); 
            pushFollow(FOLLOW_ruleImplementBlock_in_entryRuleImplementBlock3876);
            iv_ruleImplementBlock=ruleImplementBlock();

            state._fsp--;

             current =iv_ruleImplementBlock.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementBlock3887); 

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
    // $ANTLR end "entryRuleImplementBlock"


    // $ANTLR start "ruleImplementBlock"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1416:1: ruleImplementBlock returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Implement_0= ruleImplement this_CompoundName_1= ruleCompoundName (kw= ',' this_CompoundName_3= ruleCompoundName )* ) ;
    public final AntlrDatatypeRuleToken ruleImplementBlock() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Implement_0 = null;

        AntlrDatatypeRuleToken this_CompoundName_1 = null;

        AntlrDatatypeRuleToken this_CompoundName_3 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1419:28: ( (this_Implement_0= ruleImplement this_CompoundName_1= ruleCompoundName (kw= ',' this_CompoundName_3= ruleCompoundName )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1420:1: (this_Implement_0= ruleImplement this_CompoundName_1= ruleCompoundName (kw= ',' this_CompoundName_3= ruleCompoundName )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1420:1: (this_Implement_0= ruleImplement this_CompoundName_1= ruleCompoundName (kw= ',' this_CompoundName_3= ruleCompoundName )* )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1421:5: this_Implement_0= ruleImplement this_CompoundName_1= ruleCompoundName (kw= ',' this_CompoundName_3= ruleCompoundName )*
            {
             
                    newCompositeNode(grammarAccess.getImplementBlockAccess().getImplementParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleImplement_in_ruleImplementBlock3934);
            this_Implement_0=ruleImplement();

            state._fsp--;


            		current.merge(this_Implement_0);
                
             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getImplementBlockAccess().getCompoundNameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCompoundName_in_ruleImplementBlock3961);
            this_CompoundName_1=ruleCompoundName();

            state._fsp--;


            		current.merge(this_CompoundName_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1442:1: (kw= ',' this_CompoundName_3= ruleCompoundName )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1443:2: kw= ',' this_CompoundName_3= ruleCompoundName
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleImplementBlock3980); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getImplementBlockAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getImplementBlockAccess().getCompoundNameParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleCompoundName_in_ruleImplementBlock4002);
            	    this_CompoundName_3=ruleCompoundName();

            	    state._fsp--;


            	    		current.merge(this_CompoundName_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // $ANTLR end "ruleImplementBlock"


    // $ANTLR start "entryRuleImplement"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1467:1: entryRuleImplement returns [String current=null] : iv_ruleImplement= ruleImplement EOF ;
    public final String entryRuleImplement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImplement = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1468:2: (iv_ruleImplement= ruleImplement EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1469:2: iv_ruleImplement= ruleImplement EOF
            {
             newCompositeNode(grammarAccess.getImplementRule()); 
            pushFollow(FOLLOW_ruleImplement_in_entryRuleImplement4050);
            iv_ruleImplement=ruleImplement();

            state._fsp--;

             current =iv_ruleImplement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplement4061); 

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
    // $ANTLR end "entryRuleImplement"


    // $ANTLR start "ruleImplement"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1476:1: ruleImplement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'implement' | kw= 'imp' | kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleImplement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1479:28: ( (kw= 'implement' | kw= 'imp' | kw= '>' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1480:1: (kw= 'implement' | kw= 'imp' | kw= '>' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1480:1: (kw= 'implement' | kw= 'imp' | kw= '>' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt26=1;
                }
                break;
            case 56:
                {
                alt26=2;
                }
                break;
            case 57:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1481:2: kw= 'implement'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleImplement4099); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getImplementAccess().getImplementKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1488:2: kw= 'imp'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleImplement4118); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getImplementAccess().getImpKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1495:2: kw= '>'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleImplement4137); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getImplementAccess().getGreaterThanSignKeyword_2()); 
                        

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
    // $ANTLR end "ruleImplement"


    // $ANTLR start "entryRuleDataTypeList"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1508:1: entryRuleDataTypeList returns [String current=null] : iv_ruleDataTypeList= ruleDataTypeList EOF ;
    public final String entryRuleDataTypeList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypeList = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1509:2: (iv_ruleDataTypeList= ruleDataTypeList EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1510:2: iv_ruleDataTypeList= ruleDataTypeList EOF
            {
             newCompositeNode(grammarAccess.getDataTypeListRule()); 
            pushFollow(FOLLOW_ruleDataTypeList_in_entryRuleDataTypeList4178);
            iv_ruleDataTypeList=ruleDataTypeList();

            state._fsp--;

             current =iv_ruleDataTypeList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeList4189); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1517:1: ruleDataTypeList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'List' kw= '<' this_ID_2= RULE_ID kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleDataTypeList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1520:28: ( (kw= 'List' kw= '<' this_ID_2= RULE_ID kw= '>' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1521:1: (kw= 'List' kw= '<' this_ID_2= RULE_ID kw= '>' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1521:1: (kw= 'List' kw= '<' this_ID_2= RULE_ID kw= '>' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1522:2: kw= 'List' kw= '<' this_ID_2= RULE_ID kw= '>'
            {
            kw=(Token)match(input,58,FOLLOW_58_in_ruleDataTypeList4227); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDataTypeListAccess().getListKeyword_0()); 
                
            kw=(Token)match(input,59,FOLLOW_59_in_ruleDataTypeList4240); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDataTypeListAccess().getLessThanSignKeyword_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeList4255); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getDataTypeListAccess().getIDTerminalRuleCall_2()); 
                
            kw=(Token)match(input,57,FOLLOW_57_in_ruleDataTypeList4273); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1554:1: entryRuleDataTypeSet returns [String current=null] : iv_ruleDataTypeSet= ruleDataTypeSet EOF ;
    public final String entryRuleDataTypeSet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypeSet = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1555:2: (iv_ruleDataTypeSet= ruleDataTypeSet EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1556:2: iv_ruleDataTypeSet= ruleDataTypeSet EOF
            {
             newCompositeNode(grammarAccess.getDataTypeSetRule()); 
            pushFollow(FOLLOW_ruleDataTypeSet_in_entryRuleDataTypeSet4314);
            iv_ruleDataTypeSet=ruleDataTypeSet();

            state._fsp--;

             current =iv_ruleDataTypeSet.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeSet4325); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1563:1: ruleDataTypeSet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' kw= '<' this_ID_2= RULE_ID kw= '>' ) ;
    public final AntlrDatatypeRuleToken ruleDataTypeSet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1566:28: ( (kw= 'Set' kw= '<' this_ID_2= RULE_ID kw= '>' ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1567:1: (kw= 'Set' kw= '<' this_ID_2= RULE_ID kw= '>' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1567:1: (kw= 'Set' kw= '<' this_ID_2= RULE_ID kw= '>' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1568:2: kw= 'Set' kw= '<' this_ID_2= RULE_ID kw= '>'
            {
            kw=(Token)match(input,60,FOLLOW_60_in_ruleDataTypeSet4363); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDataTypeSetAccess().getSetKeyword_0()); 
                
            kw=(Token)match(input,59,FOLLOW_59_in_ruleDataTypeSet4376); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDataTypeSetAccess().getLessThanSignKeyword_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeSet4391); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getDataTypeSetAccess().getIDTerminalRuleCall_2()); 
                
            kw=(Token)match(input,57,FOLLOW_57_in_ruleDataTypeSet4409); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1600:1: entryRuleAccessModifier returns [String current=null] : iv_ruleAccessModifier= ruleAccessModifier EOF ;
    public final String entryRuleAccessModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAccessModifier = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1601:2: (iv_ruleAccessModifier= ruleAccessModifier EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1602:2: iv_ruleAccessModifier= ruleAccessModifier EOF
            {
             newCompositeNode(grammarAccess.getAccessModifierRule()); 
            pushFollow(FOLLOW_ruleAccessModifier_in_entryRuleAccessModifier4450);
            iv_ruleAccessModifier=ruleAccessModifier();

            state._fsp--;

             current =iv_ruleAccessModifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessModifier4461); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1609:1: ruleAccessModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Private_0= rulePrivate | this_Protected_1= ruleProtected ) ;
    public final AntlrDatatypeRuleToken ruleAccessModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Private_0 = null;

        AntlrDatatypeRuleToken this_Protected_1 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1612:28: ( (this_Private_0= rulePrivate | this_Protected_1= ruleProtected ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1613:1: (this_Private_0= rulePrivate | this_Protected_1= ruleProtected )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1613:1: (this_Private_0= rulePrivate | this_Protected_1= ruleProtected )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==61) ) {
                alt27=1;
            }
            else if ( (LA27_0==62) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1614:5: this_Private_0= rulePrivate
                    {
                     
                            newCompositeNode(grammarAccess.getAccessModifierAccess().getPrivateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrivate_in_ruleAccessModifier4508);
                    this_Private_0=rulePrivate();

                    state._fsp--;


                    		current.merge(this_Private_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1626:5: this_Protected_1= ruleProtected
                    {
                     
                            newCompositeNode(grammarAccess.getAccessModifierAccess().getProtectedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleProtected_in_ruleAccessModifier4541);
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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1644:1: entryRulePrivate returns [String current=null] : iv_rulePrivate= rulePrivate EOF ;
    public final String entryRulePrivate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrivate = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1645:2: (iv_rulePrivate= rulePrivate EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1646:2: iv_rulePrivate= rulePrivate EOF
            {
             newCompositeNode(grammarAccess.getPrivateRule()); 
            pushFollow(FOLLOW_rulePrivate_in_entryRulePrivate4587);
            iv_rulePrivate=rulePrivate();

            state._fsp--;

             current =iv_rulePrivate.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrivate4598); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1653:1: rulePrivate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken rulePrivate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1656:28: (kw= '-' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1658:2: kw= '-'
            {
            kw=(Token)match(input,61,FOLLOW_61_in_rulePrivate4635); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPrivateAccess().getHyphenMinusKeyword()); 
                

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1671:1: entryRuleProtected returns [String current=null] : iv_ruleProtected= ruleProtected EOF ;
    public final String entryRuleProtected() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtected = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1672:2: (iv_ruleProtected= ruleProtected EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1673:2: iv_ruleProtected= ruleProtected EOF
            {
             newCompositeNode(grammarAccess.getProtectedRule()); 
            pushFollow(FOLLOW_ruleProtected_in_entryRuleProtected4675);
            iv_ruleProtected=ruleProtected();

            state._fsp--;

             current =iv_ruleProtected.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtected4686); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1680:1: ruleProtected returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#' ;
    public final AntlrDatatypeRuleToken ruleProtected() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1683:28: (kw= '#' )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1685:2: kw= '#'
            {
            kw=(Token)match(input,62,FOLLOW_62_in_ruleProtected4723); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProtectedAccess().getNumberSignKeyword()); 
                

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1698:1: entryRuleImportCompoundName returns [String current=null] : iv_ruleImportCompoundName= ruleImportCompoundName EOF ;
    public final String entryRuleImportCompoundName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImportCompoundName = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1699:2: (iv_ruleImportCompoundName= ruleImportCompoundName EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1700:2: iv_ruleImportCompoundName= ruleImportCompoundName EOF
            {
             newCompositeNode(grammarAccess.getImportCompoundNameRule()); 
            pushFollow(FOLLOW_ruleImportCompoundName_in_entryRuleImportCompoundName4763);
            iv_ruleImportCompoundName=ruleImportCompoundName();

            state._fsp--;

             current =iv_ruleImportCompoundName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportCompoundName4774); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1707:1: ruleImportCompoundName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CompoundName_0= ruleCompoundName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleImportCompoundName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CompoundName_0 = null;


         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1710:28: ( (this_CompoundName_0= ruleCompoundName (kw= '.*' )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1711:1: (this_CompoundName_0= ruleCompoundName (kw= '.*' )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1711:1: (this_CompoundName_0= ruleCompoundName (kw= '.*' )? )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1712:5: this_CompoundName_0= ruleCompoundName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getImportCompoundNameAccess().getCompoundNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCompoundName_in_ruleImportCompoundName4821);
            this_CompoundName_0=ruleCompoundName();

            state._fsp--;


            		current.merge(this_CompoundName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1722:1: (kw= '.*' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==63) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1723:2: kw= '.*'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleImportCompoundName4840); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1736:1: entryRuleCompoundName returns [String current=null] : iv_ruleCompoundName= ruleCompoundName EOF ;
    public final String entryRuleCompoundName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundName = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1737:2: (iv_ruleCompoundName= ruleCompoundName EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1738:2: iv_ruleCompoundName= ruleCompoundName EOF
            {
             newCompositeNode(grammarAccess.getCompoundNameRule()); 
            pushFollow(FOLLOW_ruleCompoundName_in_entryRuleCompoundName4883);
            iv_ruleCompoundName=ruleCompoundName();

            state._fsp--;

             current =iv_ruleCompoundName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundName4894); 

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
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1745:1: ruleCompoundName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleCompoundName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1748:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1749:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1749:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1749:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundName4934); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getCompoundNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1756:1: (kw= '.' this_ID_2= RULE_ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1757:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_ruleCompoundName4953); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCompoundNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompoundName4968); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getCompoundNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop29;
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


    // $ANTLR start "entryRuleCompoundVersion"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1777:1: entryRuleCompoundVersion returns [String current=null] : iv_ruleCompoundVersion= ruleCompoundVersion EOF ;
    public final String entryRuleCompoundVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompoundVersion = null;


        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1778:2: (iv_ruleCompoundVersion= ruleCompoundVersion EOF )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1779:2: iv_ruleCompoundVersion= ruleCompoundVersion EOF
            {
             newCompositeNode(grammarAccess.getCompoundVersionRule()); 
            pushFollow(FOLLOW_ruleCompoundVersion_in_entryRuleCompoundVersion5016);
            iv_ruleCompoundVersion=ruleCompoundVersion();

            state._fsp--;

             current =iv_ruleCompoundVersion.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundVersion5027); 

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
    // $ANTLR end "entryRuleCompoundVersion"


    // $ANTLR start "ruleCompoundVersion"
    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1786:1: ruleCompoundVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleCompoundVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1789:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1790:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1790:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )* )
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1790:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )*
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCompoundVersion5067); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getCompoundVersionAccess().getINTTerminalRuleCall_0()); 
                
            // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1797:1: (kw= '.' this_INT_2= RULE_INT )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode/src-gen/br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.g:1798:2: kw= '.' this_INT_2= RULE_INT
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_ruleCompoundVersion5086); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getCompoundVersionAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCompoundVersion5101); 

            	    		current.merge(this_INT_2);
            	        
            	     
            	        newLeafNode(this_INT_2, grammarAccess.getCompoundVersionAccess().getINTTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleCompoundVersion"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLedsCodeDSL_in_entryRuleLedsCodeDSL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLedsCodeDSL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_ruleLedsCodeDSL130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleProject216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProject231 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProject249 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleInfrastructureBlock_in_ruleProject271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceBlock_in_ruleProject306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationBlock_in_ruleProject343 = new BitSet(new long[]{0x0000000014002000L});
    public static final BitSet FOLLOW_ruleDomainBlock_in_ruleProject376 = new BitSet(new long[]{0x0000000014002000L});
    public static final BitSet FOLLOW_13_in_ruleProject396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceBlock_in_entryRuleInterfaceBlock438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceBlock449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleInterfaceBlock487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceBlock502 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInterfaceBlock520 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_15_in_ruleInterfaceBlock535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16_in_ruleInterfaceBlock554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterfaceBlock570 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_13_in_ruleInterfaceBlock590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfrastructureBlock_in_entryRuleInfrastructureBlock631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfrastructureBlock642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInfrastructureBlock680 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInfrastructureBlock693 = new BitSet(new long[]{0x0000000001F40000L});
    public static final BitSet FOLLOW_18_in_ruleInfrastructureBlock708 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInfrastructureBlock721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleInfrastructureBlock743 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20_in_ruleInfrastructureBlock769 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInfrastructureBlock782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleCompoundVersion_in_ruleInfrastructureBlock804 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21_in_ruleInfrastructureBlock830 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInfrastructureBlock843 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDictBlock_in_ruleInfrastructureBlock865 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22_in_ruleInfrastructureBlock891 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInfrastructureBlock904 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDictBlock_in_ruleInfrastructureBlock926 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23_in_ruleInfrastructureBlock952 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInfrastructureBlock965 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDictBlock_in_ruleInfrastructureBlock987 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_24_in_ruleInfrastructureBlock1013 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInfrastructureBlock1026 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleDictBlock_in_ruleInfrastructureBlock1048 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInfrastructureBlock1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictBlock_in_entryRuleDictBlock1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictBlock1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDictBlock1158 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleKeyValue_in_ruleDictBlock1181 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_25_in_ruleDictBlock1200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleKeyValue_in_ruleDictBlock1222 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_13_in_ruleDictBlock1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationBlock_in_entryRuleApplicationBlock1285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationBlock1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleApplicationBlock1334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationBlock1349 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplicationBlock1367 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_27_in_ruleApplicationBlock1381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleImportCompoundName_in_ruleApplicationBlock1403 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_13_in_ruleApplicationBlock1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainBlock_in_entryRuleDomainBlock1464 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainBlock1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDomainBlock1513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainBlock1528 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomainBlock1546 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_ruleModuleBlock_in_ruleDomainBlock1569 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_13_in_ruleDomainBlock1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleBlock_in_entryRuleModuleBlock1630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleBlock1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleModuleBlock1679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModuleBlock1694 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModuleBlock1712 = new BitSet(new long[]{0x6000008640002000L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_ruleModuleBlock1735 = new BitSet(new long[]{0x6000008640002000L});
    public static final BitSet FOLLOW_ruleEntityBlock_in_ruleModuleBlock1768 = new BitSet(new long[]{0x6000008640002000L});
    public static final BitSet FOLLOW_ruleEnumBlock_in_ruleModuleBlock1801 = new BitSet(new long[]{0x6000008640002000L});
    public static final BitSet FOLLOW_13_in_ruleModuleBlock1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceBlock1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleServiceBlock1911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceBlock1926 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleServiceBlock1944 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceBlock1960 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleServiceBlock1978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceBlock1993 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleServiceBlock2011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceBlock2026 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleServiceBlock2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBlock_in_entryRuleEntityBlock2087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityBlock2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessModifier_in_ruleEntityBlock2146 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33_in_ruleEntityBlock2167 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleEntityBlock2182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityBlock2197 = new BitSet(new long[]{0x03E0004000001000L});
    public static final BitSet FOLLOW_ruleExtendBlock_in_ruleEntityBlock2225 = new BitSet(new long[]{0x0380000000001000L});
    public static final BitSet FOLLOW_ruleImplementBlock_in_ruleEntityBlock2255 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntityBlock2275 = new BitSet(new long[]{0x741FFF0800002010L});
    public static final BitSet FOLLOW_ruleAccessModifier_in_ruleEntityBlock2299 = new BitSet(new long[]{0x741FFF0000000010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleEntityBlock2328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntityBlock2348 = new BitSet(new long[]{0x741FFF0800002010L});
    public static final BitSet FOLLOW_ruleRepositoryBlock_in_ruleEntityBlock2378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntityBlock2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepositoryBlock_in_entryRuleRepositoryBlock2439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepositoryBlock2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRepositoryBlock2488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepositoryBlock2503 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRepositoryBlock2521 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRepositoryBlock2537 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleRepositoryBlock2555 = new BitSet(new long[]{0x741FFF0000000010L});
    public static final BitSet FOLLOW_ruleMethodParameter_in_ruleRepositoryBlock2577 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleRepositoryBlock2595 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleRepositoryBlock2608 = new BitSet(new long[]{0x741FFF0000000010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleRepositoryBlock2630 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleRepositoryBlock2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumBlock_in_entryRuleEnumBlock2691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumBlock2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumBlock2740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumBlock2755 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumBlock2773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumBlock2788 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_25_in_ruleEnumBlock2807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumBlock2822 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumBlock2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType2883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeList_in_ruleDataType2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeSet_in_ruleDataType2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleDataType3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDataType3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDataType3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDataType3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDataType3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDataType3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDataType3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDataType3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDataType3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDataType3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDataType3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDataType3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDataType3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDataType3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodParameter_in_entryRuleMethodParameter3300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodParameter3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleMethodParameter3358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodParameter3378 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleMethodParameter3397 = new BitSet(new long[]{0x741FFF0000000010L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleMethodParameter3419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethodParameter3439 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleKeyValue_in_entryRuleKeyValue3487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValue3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeyValue3538 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleKeyValue3556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKeyValue3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendBlock_in_entryRuleExtendBlock3617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendBlock3628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_ruleExtendBlock3675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleExtendBlock3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend3748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExtend3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExtend3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExtend3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementBlock_in_entryRuleImplementBlock3876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementBlock3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplement_in_ruleImplementBlock3934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleImplementBlock3961 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleImplementBlock3980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleImplementBlock4002 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleImplement_in_entryRuleImplement4050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplement4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleImplement4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleImplement4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImplement4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeList_in_entryRuleDataTypeList4178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeList4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleDataTypeList4227 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleDataTypeList4240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeList4255 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleDataTypeList4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeSet_in_entryRuleDataTypeSet4314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeSet4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDataTypeSet4363 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleDataTypeSet4376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeSet4391 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleDataTypeSet4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessModifier_in_entryRuleAccessModifier4450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessModifier4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivate_in_ruleAccessModifier4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_ruleAccessModifier4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivate_in_entryRulePrivate4587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrivate4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrivate4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_entryRuleProtected4675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtected4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleProtected4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportCompoundName_in_entryRuleImportCompoundName4763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportCompoundName4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_ruleImportCompoundName4821 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleImportCompoundName4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_entryRuleCompoundName4883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundName4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundName4934 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleCompoundName4953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompoundName4968 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleCompoundVersion_in_entryRuleCompoundVersion5016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundVersion5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCompoundVersion5067 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleCompoundVersion5086 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCompoundVersion5101 = new BitSet(new long[]{0x0000000100000002L});

}