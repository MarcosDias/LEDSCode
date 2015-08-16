package br.edu.sr.ifes.leds.ui.contentassist.antlr.internal; 

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
import br.edu.sr.ifes.leds.services.LedsCodeV001GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLedsCodeV001Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'HtmlView'", "'RestFull'", "'String'", "'int'", "'Integer'", "'long'", "'Long'", "'boolean'", "'Boolean'", "'DateTime'", "'double'", "'Double'", "'float'", "'Float'", "'Object'", "'-'", "'private'", "'#'", "'protected'", "'project'", "'{'", "'}'", "'interface'", "'=>'", "'infrastructure'", "'basePackage'", "'='", "'projectVersion'", "'language'", "'framework'", "'orm'", "'database'", "'@version'", "','", "'@name'", "'@user'", "'@pass'", "'@host'", "'@env'", "'application'", "'composedBy'", "'domain'", "'module'", "'service'", "'entity'", "'repository'", "'('", "')'", "'enum'", "'List'", "'<'", "'>'", "'Set'", "'.*'", "'.'", "'abstract'"
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
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g"; }


     
     	private LedsCodeV001GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LedsCodeV001GrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleLedsCodeDSL"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:60:1: entryRuleLedsCodeDSL : ruleLedsCodeDSL EOF ;
    public final void entryRuleLedsCodeDSL() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:61:1: ( ruleLedsCodeDSL EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:62:1: ruleLedsCodeDSL EOF
            {
             before(grammarAccess.getLedsCodeDSLRule()); 
            pushFollow(FOLLOW_ruleLedsCodeDSL_in_entryRuleLedsCodeDSL61);
            ruleLedsCodeDSL();

            state._fsp--;

             after(grammarAccess.getLedsCodeDSLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLedsCodeDSL68); 

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
    // $ANTLR end "entryRuleLedsCodeDSL"


    // $ANTLR start "ruleLedsCodeDSL"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:69:1: ruleLedsCodeDSL : ( ( rule__LedsCodeDSL__ProjectAssignment ) ) ;
    public final void ruleLedsCodeDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:73:2: ( ( ( rule__LedsCodeDSL__ProjectAssignment ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:74:1: ( ( rule__LedsCodeDSL__ProjectAssignment ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:74:1: ( ( rule__LedsCodeDSL__ProjectAssignment ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:75:1: ( rule__LedsCodeDSL__ProjectAssignment )
            {
             before(grammarAccess.getLedsCodeDSLAccess().getProjectAssignment()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:76:1: ( rule__LedsCodeDSL__ProjectAssignment )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:76:2: rule__LedsCodeDSL__ProjectAssignment
            {
            pushFollow(FOLLOW_rule__LedsCodeDSL__ProjectAssignment_in_ruleLedsCodeDSL94);
            rule__LedsCodeDSL__ProjectAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLedsCodeDSLAccess().getProjectAssignment()); 

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
    // $ANTLR end "ruleLedsCodeDSL"


    // $ANTLR start "entryRuleProject"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:88:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:89:1: ( ruleProject EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:90:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_ruleProject_in_entryRuleProject121);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProject128); 

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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:97:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:101:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:102:1: ( ( rule__Project__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:102:1: ( ( rule__Project__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:103:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:104:1: ( rule__Project__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:104:2: rule__Project__Group__0
            {
            pushFollow(FOLLOW_rule__Project__Group__0_in_ruleProject154);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleInterfaceBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:116:1: entryRuleInterfaceBlock : ruleInterfaceBlock EOF ;
    public final void entryRuleInterfaceBlock() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:117:1: ( ruleInterfaceBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:118:1: ruleInterfaceBlock EOF
            {
             before(grammarAccess.getInterfaceBlockRule()); 
            pushFollow(FOLLOW_ruleInterfaceBlock_in_entryRuleInterfaceBlock181);
            ruleInterfaceBlock();

            state._fsp--;

             after(grammarAccess.getInterfaceBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceBlock188); 

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
    // $ANTLR end "entryRuleInterfaceBlock"


    // $ANTLR start "ruleInterfaceBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:125:1: ruleInterfaceBlock : ( ( rule__InterfaceBlock__Group__0 ) ) ;
    public final void ruleInterfaceBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:129:2: ( ( ( rule__InterfaceBlock__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:130:1: ( ( rule__InterfaceBlock__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:130:1: ( ( rule__InterfaceBlock__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:131:1: ( rule__InterfaceBlock__Group__0 )
            {
             before(grammarAccess.getInterfaceBlockAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:132:1: ( rule__InterfaceBlock__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:132:2: rule__InterfaceBlock__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceBlock__Group__0_in_ruleInterfaceBlock214);
            rule__InterfaceBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleInterfaceBlock"


    // $ANTLR start "entryRuleInterfaceApplication"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:144:1: entryRuleInterfaceApplication : ruleInterfaceApplication EOF ;
    public final void entryRuleInterfaceApplication() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:145:1: ( ruleInterfaceApplication EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:146:1: ruleInterfaceApplication EOF
            {
             before(grammarAccess.getInterfaceApplicationRule()); 
            pushFollow(FOLLOW_ruleInterfaceApplication_in_entryRuleInterfaceApplication241);
            ruleInterfaceApplication();

            state._fsp--;

             after(grammarAccess.getInterfaceApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceApplication248); 

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
    // $ANTLR end "entryRuleInterfaceApplication"


    // $ANTLR start "ruleInterfaceApplication"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:153:1: ruleInterfaceApplication : ( ( rule__InterfaceApplication__Group__0 ) ) ;
    public final void ruleInterfaceApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:157:2: ( ( ( rule__InterfaceApplication__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:158:1: ( ( rule__InterfaceApplication__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:158:1: ( ( rule__InterfaceApplication__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:159:1: ( rule__InterfaceApplication__Group__0 )
            {
             before(grammarAccess.getInterfaceApplicationAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:160:1: ( rule__InterfaceApplication__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:160:2: rule__InterfaceApplication__Group__0
            {
            pushFollow(FOLLOW_rule__InterfaceApplication__Group__0_in_ruleInterfaceApplication274);
            rule__InterfaceApplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceApplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleInterfaceApplication"


    // $ANTLR start "entryRuleInfrastructureBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:172:1: entryRuleInfrastructureBlock : ruleInfrastructureBlock EOF ;
    public final void entryRuleInfrastructureBlock() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:173:1: ( ruleInfrastructureBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:174:1: ruleInfrastructureBlock EOF
            {
             before(grammarAccess.getInfrastructureBlockRule()); 
            pushFollow(FOLLOW_ruleInfrastructureBlock_in_entryRuleInfrastructureBlock301);
            ruleInfrastructureBlock();

            state._fsp--;

             after(grammarAccess.getInfrastructureBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfrastructureBlock308); 

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
    // $ANTLR end "entryRuleInfrastructureBlock"


    // $ANTLR start "ruleInfrastructureBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:181:1: ruleInfrastructureBlock : ( ( rule__InfrastructureBlock__Group__0 ) ) ;
    public final void ruleInfrastructureBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:185:2: ( ( ( rule__InfrastructureBlock__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:186:1: ( ( rule__InfrastructureBlock__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:186:1: ( ( rule__InfrastructureBlock__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:187:1: ( rule__InfrastructureBlock__Group__0 )
            {
             before(grammarAccess.getInfrastructureBlockAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:188:1: ( rule__InfrastructureBlock__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:188:2: rule__InfrastructureBlock__Group__0
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__0_in_ruleInfrastructureBlock334);
            rule__InfrastructureBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleInfrastructureBlock"


    // $ANTLR start "entryRuleDatabase"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:200:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:201:1: ( ruleDatabase EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:202:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase361);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase368); 

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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:209:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:213:2: ( ( ( rule__Database__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:214:1: ( ( rule__Database__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:214:1: ( ( rule__Database__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:215:1: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:216:1: ( rule__Database__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:216:2: rule__Database__Group__0
            {
            pushFollow(FOLLOW_rule__Database__Group__0_in_ruleDatabase394);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleNameVersion"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:228:1: entryRuleNameVersion : ruleNameVersion EOF ;
    public final void entryRuleNameVersion() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:229:1: ( ruleNameVersion EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:230:1: ruleNameVersion EOF
            {
             before(grammarAccess.getNameVersionRule()); 
            pushFollow(FOLLOW_ruleNameVersion_in_entryRuleNameVersion421);
            ruleNameVersion();

            state._fsp--;

             after(grammarAccess.getNameVersionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameVersion428); 

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
    // $ANTLR end "entryRuleNameVersion"


    // $ANTLR start "ruleNameVersion"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:237:1: ruleNameVersion : ( ( rule__NameVersion__Group__0 ) ) ;
    public final void ruleNameVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:241:2: ( ( ( rule__NameVersion__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:242:1: ( ( rule__NameVersion__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:242:1: ( ( rule__NameVersion__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:243:1: ( rule__NameVersion__Group__0 )
            {
             before(grammarAccess.getNameVersionAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:244:1: ( rule__NameVersion__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:244:2: rule__NameVersion__Group__0
            {
            pushFollow(FOLLOW_rule__NameVersion__Group__0_in_ruleNameVersion454);
            rule__NameVersion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameVersionAccess().getGroup()); 

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
    // $ANTLR end "ruleNameVersion"


    // $ANTLR start "entryRuleApplicationBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:256:1: entryRuleApplicationBlock : ruleApplicationBlock EOF ;
    public final void entryRuleApplicationBlock() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:257:1: ( ruleApplicationBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:258:1: ruleApplicationBlock EOF
            {
             before(grammarAccess.getApplicationBlockRule()); 
            pushFollow(FOLLOW_ruleApplicationBlock_in_entryRuleApplicationBlock481);
            ruleApplicationBlock();

            state._fsp--;

             after(grammarAccess.getApplicationBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationBlock488); 

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
    // $ANTLR end "entryRuleApplicationBlock"


    // $ANTLR start "ruleApplicationBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:265:1: ruleApplicationBlock : ( ( rule__ApplicationBlock__Group__0 ) ) ;
    public final void ruleApplicationBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:269:2: ( ( ( rule__ApplicationBlock__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:270:1: ( ( rule__ApplicationBlock__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:270:1: ( ( rule__ApplicationBlock__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:271:1: ( rule__ApplicationBlock__Group__0 )
            {
             before(grammarAccess.getApplicationBlockAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:272:1: ( rule__ApplicationBlock__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:272:2: rule__ApplicationBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ApplicationBlock__Group__0_in_ruleApplicationBlock514);
            rule__ApplicationBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleApplicationBlock"


    // $ANTLR start "entryRuleDomainBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:284:1: entryRuleDomainBlock : ruleDomainBlock EOF ;
    public final void entryRuleDomainBlock() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:285:1: ( ruleDomainBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:286:1: ruleDomainBlock EOF
            {
             before(grammarAccess.getDomainBlockRule()); 
            pushFollow(FOLLOW_ruleDomainBlock_in_entryRuleDomainBlock541);
            ruleDomainBlock();

            state._fsp--;

             after(grammarAccess.getDomainBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainBlock548); 

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
    // $ANTLR end "entryRuleDomainBlock"


    // $ANTLR start "ruleDomainBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:293:1: ruleDomainBlock : ( ( rule__DomainBlock__Group__0 ) ) ;
    public final void ruleDomainBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:297:2: ( ( ( rule__DomainBlock__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:298:1: ( ( rule__DomainBlock__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:298:1: ( ( rule__DomainBlock__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:299:1: ( rule__DomainBlock__Group__0 )
            {
             before(grammarAccess.getDomainBlockAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:300:1: ( rule__DomainBlock__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:300:2: rule__DomainBlock__Group__0
            {
            pushFollow(FOLLOW_rule__DomainBlock__Group__0_in_ruleDomainBlock574);
            rule__DomainBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleDomainBlock"


    // $ANTLR start "entryRuleModule"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:312:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:313:1: ( ruleModule EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:314:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule601);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule608); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:321:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:325:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:326:1: ( ( rule__Module__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:326:1: ( ( rule__Module__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:327:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:328:1: ( rule__Module__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:328:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule634);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleServiceBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:340:1: entryRuleServiceBlock : ruleServiceBlock EOF ;
    public final void entryRuleServiceBlock() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:341:1: ( ruleServiceBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:342:1: ruleServiceBlock EOF
            {
             before(grammarAccess.getServiceBlockRule()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock661);
            ruleServiceBlock();

            state._fsp--;

             after(grammarAccess.getServiceBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceBlock668); 

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
    // $ANTLR end "entryRuleServiceBlock"


    // $ANTLR start "ruleServiceBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:349:1: ruleServiceBlock : ( ( rule__ServiceBlock__Group__0 ) ) ;
    public final void ruleServiceBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:353:2: ( ( ( rule__ServiceBlock__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:354:1: ( ( rule__ServiceBlock__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:354:1: ( ( rule__ServiceBlock__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:355:1: ( rule__ServiceBlock__Group__0 )
            {
             before(grammarAccess.getServiceBlockAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:356:1: ( rule__ServiceBlock__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:356:2: rule__ServiceBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__0_in_ruleServiceBlock694);
            rule__ServiceBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleServiceBlock"


    // $ANTLR start "entryRuleServiceMethod"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:368:1: entryRuleServiceMethod : ruleServiceMethod EOF ;
    public final void entryRuleServiceMethod() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:369:1: ( ruleServiceMethod EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:370:1: ruleServiceMethod EOF
            {
             before(grammarAccess.getServiceMethodRule()); 
            pushFollow(FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod721);
            ruleServiceMethod();

            state._fsp--;

             after(grammarAccess.getServiceMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethod728); 

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
    // $ANTLR end "entryRuleServiceMethod"


    // $ANTLR start "ruleServiceMethod"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:377:1: ruleServiceMethod : ( ( rule__ServiceMethod__Group__0 ) ) ;
    public final void ruleServiceMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:381:2: ( ( ( rule__ServiceMethod__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:382:1: ( ( rule__ServiceMethod__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:382:1: ( ( rule__ServiceMethod__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:383:1: ( rule__ServiceMethod__Group__0 )
            {
             before(grammarAccess.getServiceMethodAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:384:1: ( rule__ServiceMethod__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:384:2: rule__ServiceMethod__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__0_in_ruleServiceMethod754);
            rule__ServiceMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleServiceMethod"


    // $ANTLR start "entryRuleEntityBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:396:1: entryRuleEntityBlock : ruleEntityBlock EOF ;
    public final void entryRuleEntityBlock() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:397:1: ( ruleEntityBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:398:1: ruleEntityBlock EOF
            {
             before(grammarAccess.getEntityBlockRule()); 
            pushFollow(FOLLOW_ruleEntityBlock_in_entryRuleEntityBlock781);
            ruleEntityBlock();

            state._fsp--;

             after(grammarAccess.getEntityBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityBlock788); 

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
    // $ANTLR end "entryRuleEntityBlock"


    // $ANTLR start "ruleEntityBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:405:1: ruleEntityBlock : ( ( rule__EntityBlock__Group__0 ) ) ;
    public final void ruleEntityBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:409:2: ( ( ( rule__EntityBlock__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:410:1: ( ( rule__EntityBlock__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:410:1: ( ( rule__EntityBlock__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:411:1: ( rule__EntityBlock__Group__0 )
            {
             before(grammarAccess.getEntityBlockAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:412:1: ( rule__EntityBlock__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:412:2: rule__EntityBlock__Group__0
            {
            pushFollow(FOLLOW_rule__EntityBlock__Group__0_in_ruleEntityBlock814);
            rule__EntityBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityBlock"


    // $ANTLR start "entryRuleAttribute"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:424:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:425:1: ( ruleAttribute EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:426:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute841);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute848); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:433:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:437:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:438:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:438:1: ( ( rule__Attribute__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:439:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:440:1: ( rule__Attribute__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:440:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute874);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRepository"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:452:1: entryRuleRepository : ruleRepository EOF ;
    public final void entryRuleRepository() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:453:1: ( ruleRepository EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:454:1: ruleRepository EOF
            {
             before(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_ruleRepository_in_entryRuleRepository901);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getRepositoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepository908); 

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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:461:1: ruleRepository : ( ( rule__Repository__Group__0 ) ) ;
    public final void ruleRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:465:2: ( ( ( rule__Repository__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:466:1: ( ( rule__Repository__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:466:1: ( ( rule__Repository__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:467:1: ( rule__Repository__Group__0 )
            {
             before(grammarAccess.getRepositoryAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:468:1: ( rule__Repository__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:468:2: rule__Repository__Group__0
            {
            pushFollow(FOLLOW_rule__Repository__Group__0_in_ruleRepository934);
            rule__Repository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getGroup()); 

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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleRepositoryFields"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:480:1: entryRuleRepositoryFields : ruleRepositoryFields EOF ;
    public final void entryRuleRepositoryFields() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:481:1: ( ruleRepositoryFields EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:482:1: ruleRepositoryFields EOF
            {
             before(grammarAccess.getRepositoryFieldsRule()); 
            pushFollow(FOLLOW_ruleRepositoryFields_in_entryRuleRepositoryFields961);
            ruleRepositoryFields();

            state._fsp--;

             after(grammarAccess.getRepositoryFieldsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepositoryFields968); 

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
    // $ANTLR end "entryRuleRepositoryFields"


    // $ANTLR start "ruleRepositoryFields"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:489:1: ruleRepositoryFields : ( ( rule__RepositoryFields__Group__0 ) ) ;
    public final void ruleRepositoryFields() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:493:2: ( ( ( rule__RepositoryFields__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:494:1: ( ( rule__RepositoryFields__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:494:1: ( ( rule__RepositoryFields__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:495:1: ( rule__RepositoryFields__Group__0 )
            {
             before(grammarAccess.getRepositoryFieldsAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:496:1: ( rule__RepositoryFields__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:496:2: rule__RepositoryFields__Group__0
            {
            pushFollow(FOLLOW_rule__RepositoryFields__Group__0_in_ruleRepositoryFields994);
            rule__RepositoryFields__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryFieldsAccess().getGroup()); 

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
    // $ANTLR end "ruleRepositoryFields"


    // $ANTLR start "entryRuleEnumBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:508:1: entryRuleEnumBlock : ruleEnumBlock EOF ;
    public final void entryRuleEnumBlock() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:509:1: ( ruleEnumBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:510:1: ruleEnumBlock EOF
            {
             before(grammarAccess.getEnumBlockRule()); 
            pushFollow(FOLLOW_ruleEnumBlock_in_entryRuleEnumBlock1021);
            ruleEnumBlock();

            state._fsp--;

             after(grammarAccess.getEnumBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumBlock1028); 

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
    // $ANTLR end "entryRuleEnumBlock"


    // $ANTLR start "ruleEnumBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:517:1: ruleEnumBlock : ( ( rule__EnumBlock__Group__0 ) ) ;
    public final void ruleEnumBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:521:2: ( ( ( rule__EnumBlock__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:522:1: ( ( rule__EnumBlock__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:522:1: ( ( rule__EnumBlock__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:523:1: ( rule__EnumBlock__Group__0 )
            {
             before(grammarAccess.getEnumBlockAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:524:1: ( rule__EnumBlock__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:524:2: rule__EnumBlock__Group__0
            {
            pushFollow(FOLLOW_rule__EnumBlock__Group__0_in_ruleEnumBlock1054);
            rule__EnumBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumBlock"


    // $ANTLR start "entryRuleDataType"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:536:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:537:1: ( ruleDataType EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:538:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType1081);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType1088); 

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:545:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:549:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:550:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:550:1: ( ( rule__DataType__Alternatives ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:551:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:552:1: ( rule__DataType__Alternatives )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:552:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType1114);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleMethodParameter"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:564:1: entryRuleMethodParameter : ruleMethodParameter EOF ;
    public final void entryRuleMethodParameter() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:565:1: ( ruleMethodParameter EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:566:1: ruleMethodParameter EOF
            {
             before(grammarAccess.getMethodParameterRule()); 
            pushFollow(FOLLOW_ruleMethodParameter_in_entryRuleMethodParameter1141);
            ruleMethodParameter();

            state._fsp--;

             after(grammarAccess.getMethodParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodParameter1148); 

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
    // $ANTLR end "entryRuleMethodParameter"


    // $ANTLR start "ruleMethodParameter"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:573:1: ruleMethodParameter : ( ( rule__MethodParameter__Group__0 ) ) ;
    public final void ruleMethodParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:577:2: ( ( ( rule__MethodParameter__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:578:1: ( ( rule__MethodParameter__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:578:1: ( ( rule__MethodParameter__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:579:1: ( rule__MethodParameter__Group__0 )
            {
             before(grammarAccess.getMethodParameterAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:580:1: ( rule__MethodParameter__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:580:2: rule__MethodParameter__Group__0
            {
            pushFollow(FOLLOW_rule__MethodParameter__Group__0_in_ruleMethodParameter1174);
            rule__MethodParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleMethodParameter"


    // $ANTLR start "entryRuleTypeAndAttribute"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:592:1: entryRuleTypeAndAttribute : ruleTypeAndAttribute EOF ;
    public final void entryRuleTypeAndAttribute() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:593:1: ( ruleTypeAndAttribute EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:594:1: ruleTypeAndAttribute EOF
            {
             before(grammarAccess.getTypeAndAttributeRule()); 
            pushFollow(FOLLOW_ruleTypeAndAttribute_in_entryRuleTypeAndAttribute1201);
            ruleTypeAndAttribute();

            state._fsp--;

             after(grammarAccess.getTypeAndAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeAndAttribute1208); 

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
    // $ANTLR end "entryRuleTypeAndAttribute"


    // $ANTLR start "ruleTypeAndAttribute"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:601:1: ruleTypeAndAttribute : ( ( rule__TypeAndAttribute__Group__0 ) ) ;
    public final void ruleTypeAndAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:605:2: ( ( ( rule__TypeAndAttribute__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:606:1: ( ( rule__TypeAndAttribute__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:606:1: ( ( rule__TypeAndAttribute__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:607:1: ( rule__TypeAndAttribute__Group__0 )
            {
             before(grammarAccess.getTypeAndAttributeAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:608:1: ( rule__TypeAndAttribute__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:608:2: rule__TypeAndAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__TypeAndAttribute__Group__0_in_ruleTypeAndAttribute1234);
            rule__TypeAndAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAndAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeAndAttribute"


    // $ANTLR start "entryRuleExtendBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:620:1: entryRuleExtendBlock : ruleExtendBlock EOF ;
    public final void entryRuleExtendBlock() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:621:1: ( ruleExtendBlock EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:622:1: ruleExtendBlock EOF
            {
             before(grammarAccess.getExtendBlockRule()); 
            pushFollow(FOLLOW_ruleExtendBlock_in_entryRuleExtendBlock1261);
            ruleExtendBlock();

            state._fsp--;

             after(grammarAccess.getExtendBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendBlock1268); 

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
    // $ANTLR end "entryRuleExtendBlock"


    // $ANTLR start "ruleExtendBlock"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:629:1: ruleExtendBlock : ( ( rule__ExtendBlock__Group__0 ) ) ;
    public final void ruleExtendBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:633:2: ( ( ( rule__ExtendBlock__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:634:1: ( ( rule__ExtendBlock__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:634:1: ( ( rule__ExtendBlock__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:635:1: ( rule__ExtendBlock__Group__0 )
            {
             before(grammarAccess.getExtendBlockAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:636:1: ( rule__ExtendBlock__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:636:2: rule__ExtendBlock__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendBlock__Group__0_in_ruleExtendBlock1294);
            rule__ExtendBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleExtendBlock"


    // $ANTLR start "entryRuleExtend"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:648:1: entryRuleExtend : ruleExtend EOF ;
    public final void entryRuleExtend() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:649:1: ( ruleExtend EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:650:1: ruleExtend EOF
            {
             before(grammarAccess.getExtendRule()); 
            pushFollow(FOLLOW_ruleExtend_in_entryRuleExtend1321);
            ruleExtend();

            state._fsp--;

             after(grammarAccess.getExtendRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtend1328); 

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
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:657:1: ruleExtend : ( ':' ) ;
    public final void ruleExtend() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:661:2: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:662:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:662:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:663:1: ':'
            {
             before(grammarAccess.getExtendAccess().getColonKeyword()); 
            match(input,11,FOLLOW_11_in_ruleExtend1355); 
             after(grammarAccess.getExtendAccess().getColonKeyword()); 

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
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleDataTypeList"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:678:1: entryRuleDataTypeList : ruleDataTypeList EOF ;
    public final void entryRuleDataTypeList() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:679:1: ( ruleDataTypeList EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:680:1: ruleDataTypeList EOF
            {
             before(grammarAccess.getDataTypeListRule()); 
            pushFollow(FOLLOW_ruleDataTypeList_in_entryRuleDataTypeList1383);
            ruleDataTypeList();

            state._fsp--;

             after(grammarAccess.getDataTypeListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeList1390); 

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
    // $ANTLR end "entryRuleDataTypeList"


    // $ANTLR start "ruleDataTypeList"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:687:1: ruleDataTypeList : ( ( rule__DataTypeList__Group__0 ) ) ;
    public final void ruleDataTypeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:691:2: ( ( ( rule__DataTypeList__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:692:1: ( ( rule__DataTypeList__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:692:1: ( ( rule__DataTypeList__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:693:1: ( rule__DataTypeList__Group__0 )
            {
             before(grammarAccess.getDataTypeListAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:694:1: ( rule__DataTypeList__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:694:2: rule__DataTypeList__Group__0
            {
            pushFollow(FOLLOW_rule__DataTypeList__Group__0_in_ruleDataTypeList1416);
            rule__DataTypeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeListAccess().getGroup()); 

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
    // $ANTLR end "ruleDataTypeList"


    // $ANTLR start "entryRuleDataTypeSet"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:706:1: entryRuleDataTypeSet : ruleDataTypeSet EOF ;
    public final void entryRuleDataTypeSet() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:707:1: ( ruleDataTypeSet EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:708:1: ruleDataTypeSet EOF
            {
             before(grammarAccess.getDataTypeSetRule()); 
            pushFollow(FOLLOW_ruleDataTypeSet_in_entryRuleDataTypeSet1443);
            ruleDataTypeSet();

            state._fsp--;

             after(grammarAccess.getDataTypeSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeSet1450); 

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
    // $ANTLR end "entryRuleDataTypeSet"


    // $ANTLR start "ruleDataTypeSet"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:715:1: ruleDataTypeSet : ( ( rule__DataTypeSet__Group__0 ) ) ;
    public final void ruleDataTypeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:719:2: ( ( ( rule__DataTypeSet__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:720:1: ( ( rule__DataTypeSet__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:720:1: ( ( rule__DataTypeSet__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:721:1: ( rule__DataTypeSet__Group__0 )
            {
             before(grammarAccess.getDataTypeSetAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:722:1: ( rule__DataTypeSet__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:722:2: rule__DataTypeSet__Group__0
            {
            pushFollow(FOLLOW_rule__DataTypeSet__Group__0_in_ruleDataTypeSet1476);
            rule__DataTypeSet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeSetAccess().getGroup()); 

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
    // $ANTLR end "ruleDataTypeSet"


    // $ANTLR start "entryRuleAccessModifier"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:734:1: entryRuleAccessModifier : ruleAccessModifier EOF ;
    public final void entryRuleAccessModifier() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:735:1: ( ruleAccessModifier EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:736:1: ruleAccessModifier EOF
            {
             before(grammarAccess.getAccessModifierRule()); 
            pushFollow(FOLLOW_ruleAccessModifier_in_entryRuleAccessModifier1503);
            ruleAccessModifier();

            state._fsp--;

             after(grammarAccess.getAccessModifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessModifier1510); 

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
    // $ANTLR end "entryRuleAccessModifier"


    // $ANTLR start "ruleAccessModifier"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:743:1: ruleAccessModifier : ( ( rule__AccessModifier__Alternatives ) ) ;
    public final void ruleAccessModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:747:2: ( ( ( rule__AccessModifier__Alternatives ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:748:1: ( ( rule__AccessModifier__Alternatives ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:748:1: ( ( rule__AccessModifier__Alternatives ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:749:1: ( rule__AccessModifier__Alternatives )
            {
             before(grammarAccess.getAccessModifierAccess().getAlternatives()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:750:1: ( rule__AccessModifier__Alternatives )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:750:2: rule__AccessModifier__Alternatives
            {
            pushFollow(FOLLOW_rule__AccessModifier__Alternatives_in_ruleAccessModifier1536);
            rule__AccessModifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccessModifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAccessModifier"


    // $ANTLR start "entryRulePrivate"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:762:1: entryRulePrivate : rulePrivate EOF ;
    public final void entryRulePrivate() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:763:1: ( rulePrivate EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:764:1: rulePrivate EOF
            {
             before(grammarAccess.getPrivateRule()); 
            pushFollow(FOLLOW_rulePrivate_in_entryRulePrivate1563);
            rulePrivate();

            state._fsp--;

             after(grammarAccess.getPrivateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrivate1570); 

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
    // $ANTLR end "entryRulePrivate"


    // $ANTLR start "rulePrivate"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:771:1: rulePrivate : ( ( rule__Private__Alternatives ) ) ;
    public final void rulePrivate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:775:2: ( ( ( rule__Private__Alternatives ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:776:1: ( ( rule__Private__Alternatives ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:776:1: ( ( rule__Private__Alternatives ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:777:1: ( rule__Private__Alternatives )
            {
             before(grammarAccess.getPrivateAccess().getAlternatives()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:778:1: ( rule__Private__Alternatives )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:778:2: rule__Private__Alternatives
            {
            pushFollow(FOLLOW_rule__Private__Alternatives_in_rulePrivate1596);
            rule__Private__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrivateAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrivate"


    // $ANTLR start "entryRuleProtected"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:790:1: entryRuleProtected : ruleProtected EOF ;
    public final void entryRuleProtected() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:791:1: ( ruleProtected EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:792:1: ruleProtected EOF
            {
             before(grammarAccess.getProtectedRule()); 
            pushFollow(FOLLOW_ruleProtected_in_entryRuleProtected1623);
            ruleProtected();

            state._fsp--;

             after(grammarAccess.getProtectedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtected1630); 

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
    // $ANTLR end "entryRuleProtected"


    // $ANTLR start "ruleProtected"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:799:1: ruleProtected : ( ( rule__Protected__Alternatives ) ) ;
    public final void ruleProtected() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:803:2: ( ( ( rule__Protected__Alternatives ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:804:1: ( ( rule__Protected__Alternatives ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:804:1: ( ( rule__Protected__Alternatives ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:805:1: ( rule__Protected__Alternatives )
            {
             before(grammarAccess.getProtectedAccess().getAlternatives()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:806:1: ( rule__Protected__Alternatives )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:806:2: rule__Protected__Alternatives
            {
            pushFollow(FOLLOW_rule__Protected__Alternatives_in_ruleProtected1656);
            rule__Protected__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtectedAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProtected"


    // $ANTLR start "entryRuleImportCompoundName"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:818:1: entryRuleImportCompoundName : ruleImportCompoundName EOF ;
    public final void entryRuleImportCompoundName() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:819:1: ( ruleImportCompoundName EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:820:1: ruleImportCompoundName EOF
            {
             before(grammarAccess.getImportCompoundNameRule()); 
            pushFollow(FOLLOW_ruleImportCompoundName_in_entryRuleImportCompoundName1683);
            ruleImportCompoundName();

            state._fsp--;

             after(grammarAccess.getImportCompoundNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportCompoundName1690); 

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
    // $ANTLR end "entryRuleImportCompoundName"


    // $ANTLR start "ruleImportCompoundName"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:827:1: ruleImportCompoundName : ( ( rule__ImportCompoundName__Group__0 ) ) ;
    public final void ruleImportCompoundName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:831:2: ( ( ( rule__ImportCompoundName__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:832:1: ( ( rule__ImportCompoundName__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:832:1: ( ( rule__ImportCompoundName__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:833:1: ( rule__ImportCompoundName__Group__0 )
            {
             before(grammarAccess.getImportCompoundNameAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:834:1: ( rule__ImportCompoundName__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:834:2: rule__ImportCompoundName__Group__0
            {
            pushFollow(FOLLOW_rule__ImportCompoundName__Group__0_in_ruleImportCompoundName1716);
            rule__ImportCompoundName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportCompoundNameAccess().getGroup()); 

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
    // $ANTLR end "ruleImportCompoundName"


    // $ANTLR start "entryRuleCompoundName"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:846:1: entryRuleCompoundName : ruleCompoundName EOF ;
    public final void entryRuleCompoundName() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:847:1: ( ruleCompoundName EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:848:1: ruleCompoundName EOF
            {
             before(grammarAccess.getCompoundNameRule()); 
            pushFollow(FOLLOW_ruleCompoundName_in_entryRuleCompoundName1743);
            ruleCompoundName();

            state._fsp--;

             after(grammarAccess.getCompoundNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundName1750); 

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
    // $ANTLR end "entryRuleCompoundName"


    // $ANTLR start "ruleCompoundName"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:855:1: ruleCompoundName : ( ( rule__CompoundName__Group__0 ) ) ;
    public final void ruleCompoundName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:859:2: ( ( ( rule__CompoundName__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:860:1: ( ( rule__CompoundName__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:860:1: ( ( rule__CompoundName__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:861:1: ( rule__CompoundName__Group__0 )
            {
             before(grammarAccess.getCompoundNameAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:862:1: ( rule__CompoundName__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:862:2: rule__CompoundName__Group__0
            {
            pushFollow(FOLLOW_rule__CompoundName__Group__0_in_ruleCompoundName1776);
            rule__CompoundName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompoundNameAccess().getGroup()); 

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
    // $ANTLR end "ruleCompoundName"


    // $ANTLR start "rule__InterfaceApplication__TypeAlternatives_0_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:874:1: rule__InterfaceApplication__TypeAlternatives_0_0 : ( ( 'HtmlView' ) | ( 'RestFull' ) );
    public final void rule__InterfaceApplication__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:878:1: ( ( 'HtmlView' ) | ( 'RestFull' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:879:1: ( 'HtmlView' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:879:1: ( 'HtmlView' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:880:1: 'HtmlView'
                    {
                     before(grammarAccess.getInterfaceApplicationAccess().getTypeHtmlViewKeyword_0_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__InterfaceApplication__TypeAlternatives_0_01813); 
                     after(grammarAccess.getInterfaceApplicationAccess().getTypeHtmlViewKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:887:6: ( 'RestFull' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:887:6: ( 'RestFull' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:888:1: 'RestFull'
                    {
                     before(grammarAccess.getInterfaceApplicationAccess().getTypeRestFullKeyword_0_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__InterfaceApplication__TypeAlternatives_0_01833); 
                     after(grammarAccess.getInterfaceApplicationAccess().getTypeRestFullKeyword_0_0_1()); 

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
    // $ANTLR end "rule__InterfaceApplication__TypeAlternatives_0_0"


    // $ANTLR start "rule__Module__Alternatives_3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:900:1: rule__Module__Alternatives_3 : ( ( ( rule__Module__ServiceBlockAssignment_3_0 ) ) | ( ( rule__Module__EntityBlockAssignment_3_1 ) ) | ( ( rule__Module__EnumBlockAssignment_3_2 ) ) );
    public final void rule__Module__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:904:1: ( ( ( rule__Module__ServiceBlockAssignment_3_0 ) ) | ( ( rule__Module__EntityBlockAssignment_3_1 ) ) | ( ( rule__Module__EnumBlockAssignment_3_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt2=1;
                }
                break;
            case 27:
            case 28:
            case 29:
            case 30:
            case 56:
            case 67:
                {
                alt2=2;
                }
                break;
            case 60:
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
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:905:1: ( ( rule__Module__ServiceBlockAssignment_3_0 ) )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:905:1: ( ( rule__Module__ServiceBlockAssignment_3_0 ) )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:906:1: ( rule__Module__ServiceBlockAssignment_3_0 )
                    {
                     before(grammarAccess.getModuleAccess().getServiceBlockAssignment_3_0()); 
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:907:1: ( rule__Module__ServiceBlockAssignment_3_0 )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:907:2: rule__Module__ServiceBlockAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Module__ServiceBlockAssignment_3_0_in_rule__Module__Alternatives_31867);
                    rule__Module__ServiceBlockAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleAccess().getServiceBlockAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:911:6: ( ( rule__Module__EntityBlockAssignment_3_1 ) )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:911:6: ( ( rule__Module__EntityBlockAssignment_3_1 ) )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:912:1: ( rule__Module__EntityBlockAssignment_3_1 )
                    {
                     before(grammarAccess.getModuleAccess().getEntityBlockAssignment_3_1()); 
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:913:1: ( rule__Module__EntityBlockAssignment_3_1 )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:913:2: rule__Module__EntityBlockAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Module__EntityBlockAssignment_3_1_in_rule__Module__Alternatives_31885);
                    rule__Module__EntityBlockAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleAccess().getEntityBlockAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:917:6: ( ( rule__Module__EnumBlockAssignment_3_2 ) )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:917:6: ( ( rule__Module__EnumBlockAssignment_3_2 ) )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:918:1: ( rule__Module__EnumBlockAssignment_3_2 )
                    {
                     before(grammarAccess.getModuleAccess().getEnumBlockAssignment_3_2()); 
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:919:1: ( rule__Module__EnumBlockAssignment_3_2 )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:919:2: rule__Module__EnumBlockAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__Module__EnumBlockAssignment_3_2_in_rule__Module__Alternatives_31903);
                    rule__Module__EnumBlockAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModuleAccess().getEnumBlockAssignment_3_2()); 

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
    // $ANTLR end "rule__Module__Alternatives_3"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:928:1: rule__DataType__Alternatives : ( ( ruleDataTypeList ) | ( ruleDataTypeSet ) | ( ruleCompoundName ) | ( 'String' ) | ( 'int' ) | ( 'Integer' ) | ( 'long' ) | ( 'Long' ) | ( 'boolean' ) | ( 'Boolean' ) | ( 'DateTime' ) | ( 'double' ) | ( 'Double' ) | ( 'float' ) | ( 'Float' ) | ( 'Object' ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:932:1: ( ( ruleDataTypeList ) | ( ruleDataTypeSet ) | ( ruleCompoundName ) | ( 'String' ) | ( 'int' ) | ( 'Integer' ) | ( 'long' ) | ( 'Long' ) | ( 'boolean' ) | ( 'Boolean' ) | ( 'DateTime' ) | ( 'double' ) | ( 'Double' ) | ( 'float' ) | ( 'Float' ) | ( 'Object' ) )
            int alt3=16;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt3=1;
                }
                break;
            case 64:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            case 21:
                {
                alt3=11;
                }
                break;
            case 22:
                {
                alt3=12;
                }
                break;
            case 23:
                {
                alt3=13;
                }
                break;
            case 24:
                {
                alt3=14;
                }
                break;
            case 25:
                {
                alt3=15;
                }
                break;
            case 26:
                {
                alt3=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:933:1: ( ruleDataTypeList )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:933:1: ( ruleDataTypeList )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:934:1: ruleDataTypeList
                    {
                     before(grammarAccess.getDataTypeAccess().getDataTypeListParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDataTypeList_in_rule__DataType__Alternatives1936);
                    ruleDataTypeList();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getDataTypeListParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:939:6: ( ruleDataTypeSet )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:939:6: ( ruleDataTypeSet )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:940:1: ruleDataTypeSet
                    {
                     before(grammarAccess.getDataTypeAccess().getDataTypeSetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataTypeSet_in_rule__DataType__Alternatives1953);
                    ruleDataTypeSet();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getDataTypeSetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:945:6: ( ruleCompoundName )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:945:6: ( ruleCompoundName )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:946:1: ruleCompoundName
                    {
                     before(grammarAccess.getDataTypeAccess().getCompoundNameParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCompoundName_in_rule__DataType__Alternatives1970);
                    ruleCompoundName();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getCompoundNameParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:951:6: ( 'String' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:951:6: ( 'String' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:952:1: 'String'
                    {
                     before(grammarAccess.getDataTypeAccess().getStringKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__DataType__Alternatives1988); 
                     after(grammarAccess.getDataTypeAccess().getStringKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:959:6: ( 'int' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:959:6: ( 'int' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:960:1: 'int'
                    {
                     before(grammarAccess.getDataTypeAccess().getIntKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__DataType__Alternatives2008); 
                     after(grammarAccess.getDataTypeAccess().getIntKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:967:6: ( 'Integer' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:967:6: ( 'Integer' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:968:1: 'Integer'
                    {
                     before(grammarAccess.getDataTypeAccess().getIntegerKeyword_5()); 
                    match(input,16,FOLLOW_16_in_rule__DataType__Alternatives2028); 
                     after(grammarAccess.getDataTypeAccess().getIntegerKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:975:6: ( 'long' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:975:6: ( 'long' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:976:1: 'long'
                    {
                     before(grammarAccess.getDataTypeAccess().getLongKeyword_6()); 
                    match(input,17,FOLLOW_17_in_rule__DataType__Alternatives2048); 
                     after(grammarAccess.getDataTypeAccess().getLongKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:983:6: ( 'Long' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:983:6: ( 'Long' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:984:1: 'Long'
                    {
                     before(grammarAccess.getDataTypeAccess().getLongKeyword_7()); 
                    match(input,18,FOLLOW_18_in_rule__DataType__Alternatives2068); 
                     after(grammarAccess.getDataTypeAccess().getLongKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:991:6: ( 'boolean' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:991:6: ( 'boolean' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:992:1: 'boolean'
                    {
                     before(grammarAccess.getDataTypeAccess().getBooleanKeyword_8()); 
                    match(input,19,FOLLOW_19_in_rule__DataType__Alternatives2088); 
                     after(grammarAccess.getDataTypeAccess().getBooleanKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:999:6: ( 'Boolean' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:999:6: ( 'Boolean' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1000:1: 'Boolean'
                    {
                     before(grammarAccess.getDataTypeAccess().getBooleanKeyword_9()); 
                    match(input,20,FOLLOW_20_in_rule__DataType__Alternatives2108); 
                     after(grammarAccess.getDataTypeAccess().getBooleanKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1007:6: ( 'DateTime' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1007:6: ( 'DateTime' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1008:1: 'DateTime'
                    {
                     before(grammarAccess.getDataTypeAccess().getDateTimeKeyword_10()); 
                    match(input,21,FOLLOW_21_in_rule__DataType__Alternatives2128); 
                     after(grammarAccess.getDataTypeAccess().getDateTimeKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1015:6: ( 'double' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1015:6: ( 'double' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1016:1: 'double'
                    {
                     before(grammarAccess.getDataTypeAccess().getDoubleKeyword_11()); 
                    match(input,22,FOLLOW_22_in_rule__DataType__Alternatives2148); 
                     after(grammarAccess.getDataTypeAccess().getDoubleKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1023:6: ( 'Double' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1023:6: ( 'Double' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1024:1: 'Double'
                    {
                     before(grammarAccess.getDataTypeAccess().getDoubleKeyword_12()); 
                    match(input,23,FOLLOW_23_in_rule__DataType__Alternatives2168); 
                     after(grammarAccess.getDataTypeAccess().getDoubleKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1031:6: ( 'float' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1031:6: ( 'float' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1032:1: 'float'
                    {
                     before(grammarAccess.getDataTypeAccess().getFloatKeyword_13()); 
                    match(input,24,FOLLOW_24_in_rule__DataType__Alternatives2188); 
                     after(grammarAccess.getDataTypeAccess().getFloatKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1039:6: ( 'Float' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1039:6: ( 'Float' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1040:1: 'Float'
                    {
                     before(grammarAccess.getDataTypeAccess().getFloatKeyword_14()); 
                    match(input,25,FOLLOW_25_in_rule__DataType__Alternatives2208); 
                     after(grammarAccess.getDataTypeAccess().getFloatKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1047:6: ( 'Object' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1047:6: ( 'Object' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1048:1: 'Object'
                    {
                     before(grammarAccess.getDataTypeAccess().getObjectKeyword_15()); 
                    match(input,26,FOLLOW_26_in_rule__DataType__Alternatives2228); 
                     after(grammarAccess.getDataTypeAccess().getObjectKeyword_15()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__AccessModifier__Alternatives"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1060:1: rule__AccessModifier__Alternatives : ( ( rulePrivate ) | ( ruleProtected ) );
    public final void rule__AccessModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1064:1: ( ( rulePrivate ) | ( ruleProtected ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=27 && LA4_0<=28)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=29 && LA4_0<=30)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1065:1: ( rulePrivate )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1065:1: ( rulePrivate )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1066:1: rulePrivate
                    {
                     before(grammarAccess.getAccessModifierAccess().getPrivateParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrivate_in_rule__AccessModifier__Alternatives2262);
                    rulePrivate();

                    state._fsp--;

                     after(grammarAccess.getAccessModifierAccess().getPrivateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1071:6: ( ruleProtected )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1071:6: ( ruleProtected )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1072:1: ruleProtected
                    {
                     before(grammarAccess.getAccessModifierAccess().getProtectedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProtected_in_rule__AccessModifier__Alternatives2279);
                    ruleProtected();

                    state._fsp--;

                     after(grammarAccess.getAccessModifierAccess().getProtectedParserRuleCall_1()); 

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
    // $ANTLR end "rule__AccessModifier__Alternatives"


    // $ANTLR start "rule__Private__Alternatives"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1082:1: rule__Private__Alternatives : ( ( '-' ) | ( 'private' ) );
    public final void rule__Private__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1086:1: ( ( '-' ) | ( 'private' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1087:1: ( '-' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1087:1: ( '-' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1088:1: '-'
                    {
                     before(grammarAccess.getPrivateAccess().getHyphenMinusKeyword_0()); 
                    match(input,27,FOLLOW_27_in_rule__Private__Alternatives2312); 
                     after(grammarAccess.getPrivateAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1095:6: ( 'private' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1095:6: ( 'private' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1096:1: 'private'
                    {
                     before(grammarAccess.getPrivateAccess().getPrivateKeyword_1()); 
                    match(input,28,FOLLOW_28_in_rule__Private__Alternatives2332); 
                     after(grammarAccess.getPrivateAccess().getPrivateKeyword_1()); 

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
    // $ANTLR end "rule__Private__Alternatives"


    // $ANTLR start "rule__Protected__Alternatives"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1108:1: rule__Protected__Alternatives : ( ( '#' ) | ( 'protected' ) );
    public final void rule__Protected__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1112:1: ( ( '#' ) | ( 'protected' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1113:1: ( '#' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1113:1: ( '#' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1114:1: '#'
                    {
                     before(grammarAccess.getProtectedAccess().getNumberSignKeyword_0()); 
                    match(input,29,FOLLOW_29_in_rule__Protected__Alternatives2367); 
                     after(grammarAccess.getProtectedAccess().getNumberSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1121:6: ( 'protected' )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1121:6: ( 'protected' )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1122:1: 'protected'
                    {
                     before(grammarAccess.getProtectedAccess().getProtectedKeyword_1()); 
                    match(input,30,FOLLOW_30_in_rule__Protected__Alternatives2387); 
                     after(grammarAccess.getProtectedAccess().getProtectedKeyword_1()); 

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
    // $ANTLR end "rule__Protected__Alternatives"


    // $ANTLR start "rule__Project__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1136:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1140:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1141:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__02419);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__1_in_rule__Project__Group__02422);
            rule__Project__Group__1();

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
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1148:1: rule__Project__Group__0__Impl : ( 'project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1152:1: ( ( 'project' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1153:1: ( 'project' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1153:1: ( 'project' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1154:1: 'project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Project__Group__0__Impl2450); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

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
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1167:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1171:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1172:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__12481);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__2_in_rule__Project__Group__12484);
            rule__Project__Group__2();

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
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1179:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1183:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1184:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1184:1: ( ( rule__Project__NameAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1185:1: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1186:1: ( rule__Project__NameAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1186:2: rule__Project__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Project__NameAssignment_1_in_rule__Project__Group__1__Impl2511);
            rule__Project__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1196:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1200:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1201:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__22541);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__3_in_rule__Project__Group__22544);
            rule__Project__Group__3();

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
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1208:1: rule__Project__Group__2__Impl : ( '{' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1212:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1213:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1213:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1214:1: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Project__Group__2__Impl2572); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1227:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1231:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1232:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__32603);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__4_in_rule__Project__Group__32606);
            rule__Project__Group__4();

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
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1239:1: rule__Project__Group__3__Impl : ( ( rule__Project__InfrastructureBlockAssignment_3 ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1243:1: ( ( ( rule__Project__InfrastructureBlockAssignment_3 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1244:1: ( ( rule__Project__InfrastructureBlockAssignment_3 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1244:1: ( ( rule__Project__InfrastructureBlockAssignment_3 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1245:1: ( rule__Project__InfrastructureBlockAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getInfrastructureBlockAssignment_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1246:1: ( rule__Project__InfrastructureBlockAssignment_3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1246:2: rule__Project__InfrastructureBlockAssignment_3
            {
            pushFollow(FOLLOW_rule__Project__InfrastructureBlockAssignment_3_in_rule__Project__Group__3__Impl2633);
            rule__Project__InfrastructureBlockAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getInfrastructureBlockAssignment_3()); 

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
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1256:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1260:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1261:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__42663);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__5_in_rule__Project__Group__42666);
            rule__Project__Group__5();

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
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1268:1: rule__Project__Group__4__Impl : ( ( rule__Project__InterfaceBlockAssignment_4 )? ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1272:1: ( ( ( rule__Project__InterfaceBlockAssignment_4 )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1273:1: ( ( rule__Project__InterfaceBlockAssignment_4 )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1273:1: ( ( rule__Project__InterfaceBlockAssignment_4 )? )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1274:1: ( rule__Project__InterfaceBlockAssignment_4 )?
            {
             before(grammarAccess.getProjectAccess().getInterfaceBlockAssignment_4()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1275:1: ( rule__Project__InterfaceBlockAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1275:2: rule__Project__InterfaceBlockAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Project__InterfaceBlockAssignment_4_in_rule__Project__Group__4__Impl2693);
                    rule__Project__InterfaceBlockAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getInterfaceBlockAssignment_4()); 

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
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1285:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1289:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1290:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__52724);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__6_in_rule__Project__Group__52727);
            rule__Project__Group__6();

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
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1297:1: rule__Project__Group__5__Impl : ( ( rule__Project__ApplicationBlockAssignment_5 )* ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1301:1: ( ( ( rule__Project__ApplicationBlockAssignment_5 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1302:1: ( ( rule__Project__ApplicationBlockAssignment_5 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1302:1: ( ( rule__Project__ApplicationBlockAssignment_5 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1303:1: ( rule__Project__ApplicationBlockAssignment_5 )*
            {
             before(grammarAccess.getProjectAccess().getApplicationBlockAssignment_5()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1304:1: ( rule__Project__ApplicationBlockAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==51) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1304:2: rule__Project__ApplicationBlockAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Project__ApplicationBlockAssignment_5_in_rule__Project__Group__5__Impl2754);
            	    rule__Project__ApplicationBlockAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getApplicationBlockAssignment_5()); 

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
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1314:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1318:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1319:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__62785);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Project__Group__7_in_rule__Project__Group__62788);
            rule__Project__Group__7();

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
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1326:1: rule__Project__Group__6__Impl : ( ( ( rule__Project__DomainBlockAssignment_6 ) ) ( ( rule__Project__DomainBlockAssignment_6 )* ) ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1330:1: ( ( ( ( rule__Project__DomainBlockAssignment_6 ) ) ( ( rule__Project__DomainBlockAssignment_6 )* ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1331:1: ( ( ( rule__Project__DomainBlockAssignment_6 ) ) ( ( rule__Project__DomainBlockAssignment_6 )* ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1331:1: ( ( ( rule__Project__DomainBlockAssignment_6 ) ) ( ( rule__Project__DomainBlockAssignment_6 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1332:1: ( ( rule__Project__DomainBlockAssignment_6 ) ) ( ( rule__Project__DomainBlockAssignment_6 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1332:1: ( ( rule__Project__DomainBlockAssignment_6 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1333:1: ( rule__Project__DomainBlockAssignment_6 )
            {
             before(grammarAccess.getProjectAccess().getDomainBlockAssignment_6()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1334:1: ( rule__Project__DomainBlockAssignment_6 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1334:2: rule__Project__DomainBlockAssignment_6
            {
            pushFollow(FOLLOW_rule__Project__DomainBlockAssignment_6_in_rule__Project__Group__6__Impl2817);
            rule__Project__DomainBlockAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getDomainBlockAssignment_6()); 

            }

            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1337:1: ( ( rule__Project__DomainBlockAssignment_6 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1338:1: ( rule__Project__DomainBlockAssignment_6 )*
            {
             before(grammarAccess.getProjectAccess().getDomainBlockAssignment_6()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1339:1: ( rule__Project__DomainBlockAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==53) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1339:2: rule__Project__DomainBlockAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Project__DomainBlockAssignment_6_in_rule__Project__Group__6__Impl2829);
            	    rule__Project__DomainBlockAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getDomainBlockAssignment_6()); 

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
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group__7"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1350:1: rule__Project__Group__7 : rule__Project__Group__7__Impl ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1354:1: ( rule__Project__Group__7__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1355:2: rule__Project__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__72862);
            rule__Project__Group__7__Impl();

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
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1361:1: rule__Project__Group__7__Impl : ( '}' ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1365:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1366:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1366:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1367:1: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_33_in_rule__Project__Group__7__Impl2890); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__InterfaceBlock__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1396:1: rule__InterfaceBlock__Group__0 : rule__InterfaceBlock__Group__0__Impl rule__InterfaceBlock__Group__1 ;
    public final void rule__InterfaceBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1400:1: ( rule__InterfaceBlock__Group__0__Impl rule__InterfaceBlock__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1401:2: rule__InterfaceBlock__Group__0__Impl rule__InterfaceBlock__Group__1
            {
            pushFollow(FOLLOW_rule__InterfaceBlock__Group__0__Impl_in_rule__InterfaceBlock__Group__02937);
            rule__InterfaceBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceBlock__Group__1_in_rule__InterfaceBlock__Group__02940);
            rule__InterfaceBlock__Group__1();

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
    // $ANTLR end "rule__InterfaceBlock__Group__0"


    // $ANTLR start "rule__InterfaceBlock__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1408:1: rule__InterfaceBlock__Group__0__Impl : ( 'interface' ) ;
    public final void rule__InterfaceBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1412:1: ( ( 'interface' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1413:1: ( 'interface' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1413:1: ( 'interface' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1414:1: 'interface'
            {
             before(grammarAccess.getInterfaceBlockAccess().getInterfaceKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__InterfaceBlock__Group__0__Impl2968); 
             after(grammarAccess.getInterfaceBlockAccess().getInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__InterfaceBlock__Group__0__Impl"


    // $ANTLR start "rule__InterfaceBlock__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1427:1: rule__InterfaceBlock__Group__1 : rule__InterfaceBlock__Group__1__Impl rule__InterfaceBlock__Group__2 ;
    public final void rule__InterfaceBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1431:1: ( rule__InterfaceBlock__Group__1__Impl rule__InterfaceBlock__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1432:2: rule__InterfaceBlock__Group__1__Impl rule__InterfaceBlock__Group__2
            {
            pushFollow(FOLLOW_rule__InterfaceBlock__Group__1__Impl_in_rule__InterfaceBlock__Group__12999);
            rule__InterfaceBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceBlock__Group__2_in_rule__InterfaceBlock__Group__13002);
            rule__InterfaceBlock__Group__2();

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
    // $ANTLR end "rule__InterfaceBlock__Group__1"


    // $ANTLR start "rule__InterfaceBlock__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1439:1: rule__InterfaceBlock__Group__1__Impl : ( ( rule__InterfaceBlock__NameAssignment_1 ) ) ;
    public final void rule__InterfaceBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1443:1: ( ( ( rule__InterfaceBlock__NameAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1444:1: ( ( rule__InterfaceBlock__NameAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1444:1: ( ( rule__InterfaceBlock__NameAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1445:1: ( rule__InterfaceBlock__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceBlockAccess().getNameAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1446:1: ( rule__InterfaceBlock__NameAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1446:2: rule__InterfaceBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InterfaceBlock__NameAssignment_1_in_rule__InterfaceBlock__Group__1__Impl3029);
            rule__InterfaceBlock__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceBlockAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__InterfaceBlock__Group__1__Impl"


    // $ANTLR start "rule__InterfaceBlock__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1456:1: rule__InterfaceBlock__Group__2 : rule__InterfaceBlock__Group__2__Impl rule__InterfaceBlock__Group__3 ;
    public final void rule__InterfaceBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1460:1: ( rule__InterfaceBlock__Group__2__Impl rule__InterfaceBlock__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1461:2: rule__InterfaceBlock__Group__2__Impl rule__InterfaceBlock__Group__3
            {
            pushFollow(FOLLOW_rule__InterfaceBlock__Group__2__Impl_in_rule__InterfaceBlock__Group__23059);
            rule__InterfaceBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceBlock__Group__3_in_rule__InterfaceBlock__Group__23062);
            rule__InterfaceBlock__Group__3();

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
    // $ANTLR end "rule__InterfaceBlock__Group__2"


    // $ANTLR start "rule__InterfaceBlock__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1468:1: rule__InterfaceBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__InterfaceBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1472:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1473:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1473:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1474:1: '{'
            {
             before(grammarAccess.getInterfaceBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__InterfaceBlock__Group__2__Impl3090); 
             after(grammarAccess.getInterfaceBlockAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__InterfaceBlock__Group__2__Impl"


    // $ANTLR start "rule__InterfaceBlock__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1487:1: rule__InterfaceBlock__Group__3 : rule__InterfaceBlock__Group__3__Impl rule__InterfaceBlock__Group__4 ;
    public final void rule__InterfaceBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1491:1: ( rule__InterfaceBlock__Group__3__Impl rule__InterfaceBlock__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1492:2: rule__InterfaceBlock__Group__3__Impl rule__InterfaceBlock__Group__4
            {
            pushFollow(FOLLOW_rule__InterfaceBlock__Group__3__Impl_in_rule__InterfaceBlock__Group__33121);
            rule__InterfaceBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceBlock__Group__4_in_rule__InterfaceBlock__Group__33124);
            rule__InterfaceBlock__Group__4();

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
    // $ANTLR end "rule__InterfaceBlock__Group__3"


    // $ANTLR start "rule__InterfaceBlock__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1499:1: rule__InterfaceBlock__Group__3__Impl : ( ( rule__InterfaceBlock__InterfaceApplicationAssignment_3 )* ) ;
    public final void rule__InterfaceBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1503:1: ( ( ( rule__InterfaceBlock__InterfaceApplicationAssignment_3 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1504:1: ( ( rule__InterfaceBlock__InterfaceApplicationAssignment_3 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1504:1: ( ( rule__InterfaceBlock__InterfaceApplicationAssignment_3 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1505:1: ( rule__InterfaceBlock__InterfaceApplicationAssignment_3 )*
            {
             before(grammarAccess.getInterfaceBlockAccess().getInterfaceApplicationAssignment_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1506:1: ( rule__InterfaceBlock__InterfaceApplicationAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=12 && LA10_0<=13)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1506:2: rule__InterfaceBlock__InterfaceApplicationAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__InterfaceBlock__InterfaceApplicationAssignment_3_in_rule__InterfaceBlock__Group__3__Impl3151);
            	    rule__InterfaceBlock__InterfaceApplicationAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getInterfaceBlockAccess().getInterfaceApplicationAssignment_3()); 

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
    // $ANTLR end "rule__InterfaceBlock__Group__3__Impl"


    // $ANTLR start "rule__InterfaceBlock__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1516:1: rule__InterfaceBlock__Group__4 : rule__InterfaceBlock__Group__4__Impl ;
    public final void rule__InterfaceBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1520:1: ( rule__InterfaceBlock__Group__4__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1521:2: rule__InterfaceBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__InterfaceBlock__Group__4__Impl_in_rule__InterfaceBlock__Group__43182);
            rule__InterfaceBlock__Group__4__Impl();

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
    // $ANTLR end "rule__InterfaceBlock__Group__4"


    // $ANTLR start "rule__InterfaceBlock__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1527:1: rule__InterfaceBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__InterfaceBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1531:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1532:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1532:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1533:1: '}'
            {
             before(grammarAccess.getInterfaceBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__InterfaceBlock__Group__4__Impl3210); 
             after(grammarAccess.getInterfaceBlockAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__InterfaceBlock__Group__4__Impl"


    // $ANTLR start "rule__InterfaceApplication__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1556:1: rule__InterfaceApplication__Group__0 : rule__InterfaceApplication__Group__0__Impl rule__InterfaceApplication__Group__1 ;
    public final void rule__InterfaceApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1560:1: ( rule__InterfaceApplication__Group__0__Impl rule__InterfaceApplication__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1561:2: rule__InterfaceApplication__Group__0__Impl rule__InterfaceApplication__Group__1
            {
            pushFollow(FOLLOW_rule__InterfaceApplication__Group__0__Impl_in_rule__InterfaceApplication__Group__03251);
            rule__InterfaceApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceApplication__Group__1_in_rule__InterfaceApplication__Group__03254);
            rule__InterfaceApplication__Group__1();

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
    // $ANTLR end "rule__InterfaceApplication__Group__0"


    // $ANTLR start "rule__InterfaceApplication__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1568:1: rule__InterfaceApplication__Group__0__Impl : ( ( rule__InterfaceApplication__TypeAssignment_0 ) ) ;
    public final void rule__InterfaceApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1572:1: ( ( ( rule__InterfaceApplication__TypeAssignment_0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1573:1: ( ( rule__InterfaceApplication__TypeAssignment_0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1573:1: ( ( rule__InterfaceApplication__TypeAssignment_0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1574:1: ( rule__InterfaceApplication__TypeAssignment_0 )
            {
             before(grammarAccess.getInterfaceApplicationAccess().getTypeAssignment_0()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1575:1: ( rule__InterfaceApplication__TypeAssignment_0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1575:2: rule__InterfaceApplication__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__InterfaceApplication__TypeAssignment_0_in_rule__InterfaceApplication__Group__0__Impl3281);
            rule__InterfaceApplication__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceApplicationAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__InterfaceApplication__Group__0__Impl"


    // $ANTLR start "rule__InterfaceApplication__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1585:1: rule__InterfaceApplication__Group__1 : rule__InterfaceApplication__Group__1__Impl rule__InterfaceApplication__Group__2 ;
    public final void rule__InterfaceApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1589:1: ( rule__InterfaceApplication__Group__1__Impl rule__InterfaceApplication__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1590:2: rule__InterfaceApplication__Group__1__Impl rule__InterfaceApplication__Group__2
            {
            pushFollow(FOLLOW_rule__InterfaceApplication__Group__1__Impl_in_rule__InterfaceApplication__Group__13311);
            rule__InterfaceApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceApplication__Group__2_in_rule__InterfaceApplication__Group__13314);
            rule__InterfaceApplication__Group__2();

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
    // $ANTLR end "rule__InterfaceApplication__Group__1"


    // $ANTLR start "rule__InterfaceApplication__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1597:1: rule__InterfaceApplication__Group__1__Impl : ( ( rule__InterfaceApplication__NameAssignment_1 ) ) ;
    public final void rule__InterfaceApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1601:1: ( ( ( rule__InterfaceApplication__NameAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1602:1: ( ( rule__InterfaceApplication__NameAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1602:1: ( ( rule__InterfaceApplication__NameAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1603:1: ( rule__InterfaceApplication__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceApplicationAccess().getNameAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1604:1: ( rule__InterfaceApplication__NameAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1604:2: rule__InterfaceApplication__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__InterfaceApplication__NameAssignment_1_in_rule__InterfaceApplication__Group__1__Impl3341);
            rule__InterfaceApplication__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceApplicationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__InterfaceApplication__Group__1__Impl"


    // $ANTLR start "rule__InterfaceApplication__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1614:1: rule__InterfaceApplication__Group__2 : rule__InterfaceApplication__Group__2__Impl rule__InterfaceApplication__Group__3 ;
    public final void rule__InterfaceApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1618:1: ( rule__InterfaceApplication__Group__2__Impl rule__InterfaceApplication__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1619:2: rule__InterfaceApplication__Group__2__Impl rule__InterfaceApplication__Group__3
            {
            pushFollow(FOLLOW_rule__InterfaceApplication__Group__2__Impl_in_rule__InterfaceApplication__Group__23371);
            rule__InterfaceApplication__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InterfaceApplication__Group__3_in_rule__InterfaceApplication__Group__23374);
            rule__InterfaceApplication__Group__3();

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
    // $ANTLR end "rule__InterfaceApplication__Group__2"


    // $ANTLR start "rule__InterfaceApplication__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1626:1: rule__InterfaceApplication__Group__2__Impl : ( '=>' ) ;
    public final void rule__InterfaceApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1630:1: ( ( '=>' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1631:1: ( '=>' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1631:1: ( '=>' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1632:1: '=>'
            {
             before(grammarAccess.getInterfaceApplicationAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__InterfaceApplication__Group__2__Impl3402); 
             after(grammarAccess.getInterfaceApplicationAccess().getEqualsSignGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__InterfaceApplication__Group__2__Impl"


    // $ANTLR start "rule__InterfaceApplication__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1645:1: rule__InterfaceApplication__Group__3 : rule__InterfaceApplication__Group__3__Impl ;
    public final void rule__InterfaceApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1649:1: ( rule__InterfaceApplication__Group__3__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1650:2: rule__InterfaceApplication__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InterfaceApplication__Group__3__Impl_in_rule__InterfaceApplication__Group__33433);
            rule__InterfaceApplication__Group__3__Impl();

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
    // $ANTLR end "rule__InterfaceApplication__Group__3"


    // $ANTLR start "rule__InterfaceApplication__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1656:1: rule__InterfaceApplication__Group__3__Impl : ( ( rule__InterfaceApplication__NameAppAssignment_3 ) ) ;
    public final void rule__InterfaceApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1660:1: ( ( ( rule__InterfaceApplication__NameAppAssignment_3 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1661:1: ( ( rule__InterfaceApplication__NameAppAssignment_3 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1661:1: ( ( rule__InterfaceApplication__NameAppAssignment_3 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1662:1: ( rule__InterfaceApplication__NameAppAssignment_3 )
            {
             before(grammarAccess.getInterfaceApplicationAccess().getNameAppAssignment_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1663:1: ( rule__InterfaceApplication__NameAppAssignment_3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1663:2: rule__InterfaceApplication__NameAppAssignment_3
            {
            pushFollow(FOLLOW_rule__InterfaceApplication__NameAppAssignment_3_in_rule__InterfaceApplication__Group__3__Impl3460);
            rule__InterfaceApplication__NameAppAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceApplicationAccess().getNameAppAssignment_3()); 

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
    // $ANTLR end "rule__InterfaceApplication__Group__3__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1681:1: rule__InfrastructureBlock__Group__0 : rule__InfrastructureBlock__Group__0__Impl rule__InfrastructureBlock__Group__1 ;
    public final void rule__InfrastructureBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1685:1: ( rule__InfrastructureBlock__Group__0__Impl rule__InfrastructureBlock__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1686:2: rule__InfrastructureBlock__Group__0__Impl rule__InfrastructureBlock__Group__1
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__0__Impl_in_rule__InfrastructureBlock__Group__03498);
            rule__InfrastructureBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__1_in_rule__InfrastructureBlock__Group__03501);
            rule__InfrastructureBlock__Group__1();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__0"


    // $ANTLR start "rule__InfrastructureBlock__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1693:1: rule__InfrastructureBlock__Group__0__Impl : ( 'infrastructure' ) ;
    public final void rule__InfrastructureBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1697:1: ( ( 'infrastructure' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1698:1: ( 'infrastructure' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1698:1: ( 'infrastructure' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1699:1: 'infrastructure'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getInfrastructureKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__InfrastructureBlock__Group__0__Impl3529); 
             after(grammarAccess.getInfrastructureBlockAccess().getInfrastructureKeyword_0()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__0__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1712:1: rule__InfrastructureBlock__Group__1 : rule__InfrastructureBlock__Group__1__Impl rule__InfrastructureBlock__Group__2 ;
    public final void rule__InfrastructureBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1716:1: ( rule__InfrastructureBlock__Group__1__Impl rule__InfrastructureBlock__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1717:2: rule__InfrastructureBlock__Group__1__Impl rule__InfrastructureBlock__Group__2
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__1__Impl_in_rule__InfrastructureBlock__Group__13560);
            rule__InfrastructureBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__2_in_rule__InfrastructureBlock__Group__13563);
            rule__InfrastructureBlock__Group__2();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__1"


    // $ANTLR start "rule__InfrastructureBlock__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1724:1: rule__InfrastructureBlock__Group__1__Impl : ( '{' ) ;
    public final void rule__InfrastructureBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1728:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1729:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1729:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1730:1: '{'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__InfrastructureBlock__Group__1__Impl3591); 
             after(grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__1__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1743:1: rule__InfrastructureBlock__Group__2 : rule__InfrastructureBlock__Group__2__Impl rule__InfrastructureBlock__Group__3 ;
    public final void rule__InfrastructureBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1747:1: ( rule__InfrastructureBlock__Group__2__Impl rule__InfrastructureBlock__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1748:2: rule__InfrastructureBlock__Group__2__Impl rule__InfrastructureBlock__Group__3
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__2__Impl_in_rule__InfrastructureBlock__Group__23622);
            rule__InfrastructureBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__3_in_rule__InfrastructureBlock__Group__23625);
            rule__InfrastructureBlock__Group__3();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__2"


    // $ANTLR start "rule__InfrastructureBlock__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1755:1: rule__InfrastructureBlock__Group__2__Impl : ( 'basePackage' ) ;
    public final void rule__InfrastructureBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1759:1: ( ( 'basePackage' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1760:1: ( 'basePackage' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1760:1: ( 'basePackage' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1761:1: 'basePackage'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getBasePackageKeyword_2()); 
            match(input,37,FOLLOW_37_in_rule__InfrastructureBlock__Group__2__Impl3653); 
             after(grammarAccess.getInfrastructureBlockAccess().getBasePackageKeyword_2()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__2__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1774:1: rule__InfrastructureBlock__Group__3 : rule__InfrastructureBlock__Group__3__Impl rule__InfrastructureBlock__Group__4 ;
    public final void rule__InfrastructureBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1778:1: ( rule__InfrastructureBlock__Group__3__Impl rule__InfrastructureBlock__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1779:2: rule__InfrastructureBlock__Group__3__Impl rule__InfrastructureBlock__Group__4
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__3__Impl_in_rule__InfrastructureBlock__Group__33684);
            rule__InfrastructureBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__4_in_rule__InfrastructureBlock__Group__33687);
            rule__InfrastructureBlock__Group__4();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__3"


    // $ANTLR start "rule__InfrastructureBlock__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1786:1: rule__InfrastructureBlock__Group__3__Impl : ( '=' ) ;
    public final void rule__InfrastructureBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1790:1: ( ( '=' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1791:1: ( '=' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1791:1: ( '=' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1792:1: '='
            {
             before(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_3()); 
            match(input,38,FOLLOW_38_in_rule__InfrastructureBlock__Group__3__Impl3715); 
             after(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__3__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1805:1: rule__InfrastructureBlock__Group__4 : rule__InfrastructureBlock__Group__4__Impl rule__InfrastructureBlock__Group__5 ;
    public final void rule__InfrastructureBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1809:1: ( rule__InfrastructureBlock__Group__4__Impl rule__InfrastructureBlock__Group__5 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1810:2: rule__InfrastructureBlock__Group__4__Impl rule__InfrastructureBlock__Group__5
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__4__Impl_in_rule__InfrastructureBlock__Group__43746);
            rule__InfrastructureBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__5_in_rule__InfrastructureBlock__Group__43749);
            rule__InfrastructureBlock__Group__5();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__4"


    // $ANTLR start "rule__InfrastructureBlock__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1817:1: rule__InfrastructureBlock__Group__4__Impl : ( ( rule__InfrastructureBlock__BasePackageAssignment_4 ) ) ;
    public final void rule__InfrastructureBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1821:1: ( ( ( rule__InfrastructureBlock__BasePackageAssignment_4 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1822:1: ( ( rule__InfrastructureBlock__BasePackageAssignment_4 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1822:1: ( ( rule__InfrastructureBlock__BasePackageAssignment_4 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1823:1: ( rule__InfrastructureBlock__BasePackageAssignment_4 )
            {
             before(grammarAccess.getInfrastructureBlockAccess().getBasePackageAssignment_4()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1824:1: ( rule__InfrastructureBlock__BasePackageAssignment_4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1824:2: rule__InfrastructureBlock__BasePackageAssignment_4
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__BasePackageAssignment_4_in_rule__InfrastructureBlock__Group__4__Impl3776);
            rule__InfrastructureBlock__BasePackageAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureBlockAccess().getBasePackageAssignment_4()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__4__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1834:1: rule__InfrastructureBlock__Group__5 : rule__InfrastructureBlock__Group__5__Impl rule__InfrastructureBlock__Group__6 ;
    public final void rule__InfrastructureBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1838:1: ( rule__InfrastructureBlock__Group__5__Impl rule__InfrastructureBlock__Group__6 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1839:2: rule__InfrastructureBlock__Group__5__Impl rule__InfrastructureBlock__Group__6
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__5__Impl_in_rule__InfrastructureBlock__Group__53806);
            rule__InfrastructureBlock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__6_in_rule__InfrastructureBlock__Group__53809);
            rule__InfrastructureBlock__Group__6();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__5"


    // $ANTLR start "rule__InfrastructureBlock__Group__5__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1846:1: rule__InfrastructureBlock__Group__5__Impl : ( 'projectVersion' ) ;
    public final void rule__InfrastructureBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1850:1: ( ( 'projectVersion' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1851:1: ( 'projectVersion' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1851:1: ( 'projectVersion' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1852:1: 'projectVersion'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getProjectVersionKeyword_5()); 
            match(input,39,FOLLOW_39_in_rule__InfrastructureBlock__Group__5__Impl3837); 
             after(grammarAccess.getInfrastructureBlockAccess().getProjectVersionKeyword_5()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__5__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1865:1: rule__InfrastructureBlock__Group__6 : rule__InfrastructureBlock__Group__6__Impl rule__InfrastructureBlock__Group__7 ;
    public final void rule__InfrastructureBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1869:1: ( rule__InfrastructureBlock__Group__6__Impl rule__InfrastructureBlock__Group__7 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1870:2: rule__InfrastructureBlock__Group__6__Impl rule__InfrastructureBlock__Group__7
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__6__Impl_in_rule__InfrastructureBlock__Group__63868);
            rule__InfrastructureBlock__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__7_in_rule__InfrastructureBlock__Group__63871);
            rule__InfrastructureBlock__Group__7();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__6"


    // $ANTLR start "rule__InfrastructureBlock__Group__6__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1877:1: rule__InfrastructureBlock__Group__6__Impl : ( '=' ) ;
    public final void rule__InfrastructureBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1881:1: ( ( '=' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1882:1: ( '=' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1882:1: ( '=' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1883:1: '='
            {
             before(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_6()); 
            match(input,38,FOLLOW_38_in_rule__InfrastructureBlock__Group__6__Impl3899); 
             after(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_6()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__6__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__7"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1896:1: rule__InfrastructureBlock__Group__7 : rule__InfrastructureBlock__Group__7__Impl rule__InfrastructureBlock__Group__8 ;
    public final void rule__InfrastructureBlock__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1900:1: ( rule__InfrastructureBlock__Group__7__Impl rule__InfrastructureBlock__Group__8 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1901:2: rule__InfrastructureBlock__Group__7__Impl rule__InfrastructureBlock__Group__8
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__7__Impl_in_rule__InfrastructureBlock__Group__73930);
            rule__InfrastructureBlock__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__8_in_rule__InfrastructureBlock__Group__73933);
            rule__InfrastructureBlock__Group__8();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__7"


    // $ANTLR start "rule__InfrastructureBlock__Group__7__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1908:1: rule__InfrastructureBlock__Group__7__Impl : ( ( rule__InfrastructureBlock__ProjectVersionAssignment_7 ) ) ;
    public final void rule__InfrastructureBlock__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1912:1: ( ( ( rule__InfrastructureBlock__ProjectVersionAssignment_7 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1913:1: ( ( rule__InfrastructureBlock__ProjectVersionAssignment_7 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1913:1: ( ( rule__InfrastructureBlock__ProjectVersionAssignment_7 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1914:1: ( rule__InfrastructureBlock__ProjectVersionAssignment_7 )
            {
             before(grammarAccess.getInfrastructureBlockAccess().getProjectVersionAssignment_7()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1915:1: ( rule__InfrastructureBlock__ProjectVersionAssignment_7 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1915:2: rule__InfrastructureBlock__ProjectVersionAssignment_7
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__ProjectVersionAssignment_7_in_rule__InfrastructureBlock__Group__7__Impl3960);
            rule__InfrastructureBlock__ProjectVersionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureBlockAccess().getProjectVersionAssignment_7()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__7__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__8"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1925:1: rule__InfrastructureBlock__Group__8 : rule__InfrastructureBlock__Group__8__Impl rule__InfrastructureBlock__Group__9 ;
    public final void rule__InfrastructureBlock__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1929:1: ( rule__InfrastructureBlock__Group__8__Impl rule__InfrastructureBlock__Group__9 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1930:2: rule__InfrastructureBlock__Group__8__Impl rule__InfrastructureBlock__Group__9
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__8__Impl_in_rule__InfrastructureBlock__Group__83990);
            rule__InfrastructureBlock__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__9_in_rule__InfrastructureBlock__Group__83993);
            rule__InfrastructureBlock__Group__9();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__8"


    // $ANTLR start "rule__InfrastructureBlock__Group__8__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1937:1: rule__InfrastructureBlock__Group__8__Impl : ( 'language' ) ;
    public final void rule__InfrastructureBlock__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1941:1: ( ( 'language' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1942:1: ( 'language' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1942:1: ( 'language' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1943:1: 'language'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getLanguageKeyword_8()); 
            match(input,40,FOLLOW_40_in_rule__InfrastructureBlock__Group__8__Impl4021); 
             after(grammarAccess.getInfrastructureBlockAccess().getLanguageKeyword_8()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__8__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__9"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1956:1: rule__InfrastructureBlock__Group__9 : rule__InfrastructureBlock__Group__9__Impl rule__InfrastructureBlock__Group__10 ;
    public final void rule__InfrastructureBlock__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1960:1: ( rule__InfrastructureBlock__Group__9__Impl rule__InfrastructureBlock__Group__10 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1961:2: rule__InfrastructureBlock__Group__9__Impl rule__InfrastructureBlock__Group__10
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__9__Impl_in_rule__InfrastructureBlock__Group__94052);
            rule__InfrastructureBlock__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__10_in_rule__InfrastructureBlock__Group__94055);
            rule__InfrastructureBlock__Group__10();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__9"


    // $ANTLR start "rule__InfrastructureBlock__Group__9__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1968:1: rule__InfrastructureBlock__Group__9__Impl : ( '=' ) ;
    public final void rule__InfrastructureBlock__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1972:1: ( ( '=' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1973:1: ( '=' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1973:1: ( '=' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1974:1: '='
            {
             before(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_9()); 
            match(input,38,FOLLOW_38_in_rule__InfrastructureBlock__Group__9__Impl4083); 
             after(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_9()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__9__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__10"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1987:1: rule__InfrastructureBlock__Group__10 : rule__InfrastructureBlock__Group__10__Impl rule__InfrastructureBlock__Group__11 ;
    public final void rule__InfrastructureBlock__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1991:1: ( rule__InfrastructureBlock__Group__10__Impl rule__InfrastructureBlock__Group__11 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1992:2: rule__InfrastructureBlock__Group__10__Impl rule__InfrastructureBlock__Group__11
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__10__Impl_in_rule__InfrastructureBlock__Group__104114);
            rule__InfrastructureBlock__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__11_in_rule__InfrastructureBlock__Group__104117);
            rule__InfrastructureBlock__Group__11();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__10"


    // $ANTLR start "rule__InfrastructureBlock__Group__10__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1999:1: rule__InfrastructureBlock__Group__10__Impl : ( '{' ) ;
    public final void rule__InfrastructureBlock__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2003:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2004:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2004:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2005:1: '{'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,32,FOLLOW_32_in_rule__InfrastructureBlock__Group__10__Impl4145); 
             after(grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__10__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__11"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2018:1: rule__InfrastructureBlock__Group__11 : rule__InfrastructureBlock__Group__11__Impl rule__InfrastructureBlock__Group__12 ;
    public final void rule__InfrastructureBlock__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2022:1: ( rule__InfrastructureBlock__Group__11__Impl rule__InfrastructureBlock__Group__12 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2023:2: rule__InfrastructureBlock__Group__11__Impl rule__InfrastructureBlock__Group__12
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__11__Impl_in_rule__InfrastructureBlock__Group__114176);
            rule__InfrastructureBlock__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__12_in_rule__InfrastructureBlock__Group__114179);
            rule__InfrastructureBlock__Group__12();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__11"


    // $ANTLR start "rule__InfrastructureBlock__Group__11__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2030:1: rule__InfrastructureBlock__Group__11__Impl : ( ( rule__InfrastructureBlock__LanguageAssignment_11 ) ) ;
    public final void rule__InfrastructureBlock__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2034:1: ( ( ( rule__InfrastructureBlock__LanguageAssignment_11 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2035:1: ( ( rule__InfrastructureBlock__LanguageAssignment_11 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2035:1: ( ( rule__InfrastructureBlock__LanguageAssignment_11 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2036:1: ( rule__InfrastructureBlock__LanguageAssignment_11 )
            {
             before(grammarAccess.getInfrastructureBlockAccess().getLanguageAssignment_11()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2037:1: ( rule__InfrastructureBlock__LanguageAssignment_11 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2037:2: rule__InfrastructureBlock__LanguageAssignment_11
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__LanguageAssignment_11_in_rule__InfrastructureBlock__Group__11__Impl4206);
            rule__InfrastructureBlock__LanguageAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureBlockAccess().getLanguageAssignment_11()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__11__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__12"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2047:1: rule__InfrastructureBlock__Group__12 : rule__InfrastructureBlock__Group__12__Impl rule__InfrastructureBlock__Group__13 ;
    public final void rule__InfrastructureBlock__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2051:1: ( rule__InfrastructureBlock__Group__12__Impl rule__InfrastructureBlock__Group__13 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2052:2: rule__InfrastructureBlock__Group__12__Impl rule__InfrastructureBlock__Group__13
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__12__Impl_in_rule__InfrastructureBlock__Group__124236);
            rule__InfrastructureBlock__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__13_in_rule__InfrastructureBlock__Group__124239);
            rule__InfrastructureBlock__Group__13();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__12"


    // $ANTLR start "rule__InfrastructureBlock__Group__12__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2059:1: rule__InfrastructureBlock__Group__12__Impl : ( '}' ) ;
    public final void rule__InfrastructureBlock__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2063:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2064:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2064:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2065:1: '}'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_12()); 
            match(input,33,FOLLOW_33_in_rule__InfrastructureBlock__Group__12__Impl4267); 
             after(grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__12__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__13"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2078:1: rule__InfrastructureBlock__Group__13 : rule__InfrastructureBlock__Group__13__Impl rule__InfrastructureBlock__Group__14 ;
    public final void rule__InfrastructureBlock__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2082:1: ( rule__InfrastructureBlock__Group__13__Impl rule__InfrastructureBlock__Group__14 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2083:2: rule__InfrastructureBlock__Group__13__Impl rule__InfrastructureBlock__Group__14
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__13__Impl_in_rule__InfrastructureBlock__Group__134298);
            rule__InfrastructureBlock__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__14_in_rule__InfrastructureBlock__Group__134301);
            rule__InfrastructureBlock__Group__14();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__13"


    // $ANTLR start "rule__InfrastructureBlock__Group__13__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2090:1: rule__InfrastructureBlock__Group__13__Impl : ( 'framework' ) ;
    public final void rule__InfrastructureBlock__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2094:1: ( ( 'framework' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2095:1: ( 'framework' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2095:1: ( 'framework' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2096:1: 'framework'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getFrameworkKeyword_13()); 
            match(input,41,FOLLOW_41_in_rule__InfrastructureBlock__Group__13__Impl4329); 
             after(grammarAccess.getInfrastructureBlockAccess().getFrameworkKeyword_13()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__13__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__14"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2109:1: rule__InfrastructureBlock__Group__14 : rule__InfrastructureBlock__Group__14__Impl rule__InfrastructureBlock__Group__15 ;
    public final void rule__InfrastructureBlock__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2113:1: ( rule__InfrastructureBlock__Group__14__Impl rule__InfrastructureBlock__Group__15 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2114:2: rule__InfrastructureBlock__Group__14__Impl rule__InfrastructureBlock__Group__15
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__14__Impl_in_rule__InfrastructureBlock__Group__144360);
            rule__InfrastructureBlock__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__15_in_rule__InfrastructureBlock__Group__144363);
            rule__InfrastructureBlock__Group__15();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__14"


    // $ANTLR start "rule__InfrastructureBlock__Group__14__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2121:1: rule__InfrastructureBlock__Group__14__Impl : ( '=' ) ;
    public final void rule__InfrastructureBlock__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2125:1: ( ( '=' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2126:1: ( '=' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2126:1: ( '=' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2127:1: '='
            {
             before(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_14()); 
            match(input,38,FOLLOW_38_in_rule__InfrastructureBlock__Group__14__Impl4391); 
             after(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_14()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__14__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__15"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2140:1: rule__InfrastructureBlock__Group__15 : rule__InfrastructureBlock__Group__15__Impl rule__InfrastructureBlock__Group__16 ;
    public final void rule__InfrastructureBlock__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2144:1: ( rule__InfrastructureBlock__Group__15__Impl rule__InfrastructureBlock__Group__16 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2145:2: rule__InfrastructureBlock__Group__15__Impl rule__InfrastructureBlock__Group__16
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__15__Impl_in_rule__InfrastructureBlock__Group__154422);
            rule__InfrastructureBlock__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__16_in_rule__InfrastructureBlock__Group__154425);
            rule__InfrastructureBlock__Group__16();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__15"


    // $ANTLR start "rule__InfrastructureBlock__Group__15__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2152:1: rule__InfrastructureBlock__Group__15__Impl : ( '{' ) ;
    public final void rule__InfrastructureBlock__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2156:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2157:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2157:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2158:1: '{'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,32,FOLLOW_32_in_rule__InfrastructureBlock__Group__15__Impl4453); 
             after(grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__15__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__16"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2171:1: rule__InfrastructureBlock__Group__16 : rule__InfrastructureBlock__Group__16__Impl rule__InfrastructureBlock__Group__17 ;
    public final void rule__InfrastructureBlock__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2175:1: ( rule__InfrastructureBlock__Group__16__Impl rule__InfrastructureBlock__Group__17 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2176:2: rule__InfrastructureBlock__Group__16__Impl rule__InfrastructureBlock__Group__17
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__16__Impl_in_rule__InfrastructureBlock__Group__164484);
            rule__InfrastructureBlock__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__17_in_rule__InfrastructureBlock__Group__164487);
            rule__InfrastructureBlock__Group__17();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__16"


    // $ANTLR start "rule__InfrastructureBlock__Group__16__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2183:1: rule__InfrastructureBlock__Group__16__Impl : ( ( rule__InfrastructureBlock__FrameworkAssignment_16 ) ) ;
    public final void rule__InfrastructureBlock__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2187:1: ( ( ( rule__InfrastructureBlock__FrameworkAssignment_16 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2188:1: ( ( rule__InfrastructureBlock__FrameworkAssignment_16 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2188:1: ( ( rule__InfrastructureBlock__FrameworkAssignment_16 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2189:1: ( rule__InfrastructureBlock__FrameworkAssignment_16 )
            {
             before(grammarAccess.getInfrastructureBlockAccess().getFrameworkAssignment_16()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2190:1: ( rule__InfrastructureBlock__FrameworkAssignment_16 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2190:2: rule__InfrastructureBlock__FrameworkAssignment_16
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__FrameworkAssignment_16_in_rule__InfrastructureBlock__Group__16__Impl4514);
            rule__InfrastructureBlock__FrameworkAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureBlockAccess().getFrameworkAssignment_16()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__16__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__17"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2200:1: rule__InfrastructureBlock__Group__17 : rule__InfrastructureBlock__Group__17__Impl rule__InfrastructureBlock__Group__18 ;
    public final void rule__InfrastructureBlock__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2204:1: ( rule__InfrastructureBlock__Group__17__Impl rule__InfrastructureBlock__Group__18 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2205:2: rule__InfrastructureBlock__Group__17__Impl rule__InfrastructureBlock__Group__18
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__17__Impl_in_rule__InfrastructureBlock__Group__174544);
            rule__InfrastructureBlock__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__18_in_rule__InfrastructureBlock__Group__174547);
            rule__InfrastructureBlock__Group__18();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__17"


    // $ANTLR start "rule__InfrastructureBlock__Group__17__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2212:1: rule__InfrastructureBlock__Group__17__Impl : ( '}' ) ;
    public final void rule__InfrastructureBlock__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2216:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2217:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2217:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2218:1: '}'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_17()); 
            match(input,33,FOLLOW_33_in_rule__InfrastructureBlock__Group__17__Impl4575); 
             after(grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_17()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__17__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__18"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2231:1: rule__InfrastructureBlock__Group__18 : rule__InfrastructureBlock__Group__18__Impl rule__InfrastructureBlock__Group__19 ;
    public final void rule__InfrastructureBlock__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2235:1: ( rule__InfrastructureBlock__Group__18__Impl rule__InfrastructureBlock__Group__19 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2236:2: rule__InfrastructureBlock__Group__18__Impl rule__InfrastructureBlock__Group__19
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__18__Impl_in_rule__InfrastructureBlock__Group__184606);
            rule__InfrastructureBlock__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__19_in_rule__InfrastructureBlock__Group__184609);
            rule__InfrastructureBlock__Group__19();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__18"


    // $ANTLR start "rule__InfrastructureBlock__Group__18__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2243:1: rule__InfrastructureBlock__Group__18__Impl : ( 'orm' ) ;
    public final void rule__InfrastructureBlock__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2247:1: ( ( 'orm' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2248:1: ( 'orm' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2248:1: ( 'orm' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2249:1: 'orm'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getOrmKeyword_18()); 
            match(input,42,FOLLOW_42_in_rule__InfrastructureBlock__Group__18__Impl4637); 
             after(grammarAccess.getInfrastructureBlockAccess().getOrmKeyword_18()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__18__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__19"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2262:1: rule__InfrastructureBlock__Group__19 : rule__InfrastructureBlock__Group__19__Impl rule__InfrastructureBlock__Group__20 ;
    public final void rule__InfrastructureBlock__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2266:1: ( rule__InfrastructureBlock__Group__19__Impl rule__InfrastructureBlock__Group__20 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2267:2: rule__InfrastructureBlock__Group__19__Impl rule__InfrastructureBlock__Group__20
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__19__Impl_in_rule__InfrastructureBlock__Group__194668);
            rule__InfrastructureBlock__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__20_in_rule__InfrastructureBlock__Group__194671);
            rule__InfrastructureBlock__Group__20();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__19"


    // $ANTLR start "rule__InfrastructureBlock__Group__19__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2274:1: rule__InfrastructureBlock__Group__19__Impl : ( '=' ) ;
    public final void rule__InfrastructureBlock__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2278:1: ( ( '=' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2279:1: ( '=' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2279:1: ( '=' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2280:1: '='
            {
             before(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_19()); 
            match(input,38,FOLLOW_38_in_rule__InfrastructureBlock__Group__19__Impl4699); 
             after(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_19()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__19__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__20"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2293:1: rule__InfrastructureBlock__Group__20 : rule__InfrastructureBlock__Group__20__Impl rule__InfrastructureBlock__Group__21 ;
    public final void rule__InfrastructureBlock__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2297:1: ( rule__InfrastructureBlock__Group__20__Impl rule__InfrastructureBlock__Group__21 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2298:2: rule__InfrastructureBlock__Group__20__Impl rule__InfrastructureBlock__Group__21
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__20__Impl_in_rule__InfrastructureBlock__Group__204730);
            rule__InfrastructureBlock__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__21_in_rule__InfrastructureBlock__Group__204733);
            rule__InfrastructureBlock__Group__21();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__20"


    // $ANTLR start "rule__InfrastructureBlock__Group__20__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2305:1: rule__InfrastructureBlock__Group__20__Impl : ( '{' ) ;
    public final void rule__InfrastructureBlock__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2309:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2310:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2310:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2311:1: '{'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_20()); 
            match(input,32,FOLLOW_32_in_rule__InfrastructureBlock__Group__20__Impl4761); 
             after(grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_20()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__20__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__21"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2324:1: rule__InfrastructureBlock__Group__21 : rule__InfrastructureBlock__Group__21__Impl rule__InfrastructureBlock__Group__22 ;
    public final void rule__InfrastructureBlock__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2328:1: ( rule__InfrastructureBlock__Group__21__Impl rule__InfrastructureBlock__Group__22 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2329:2: rule__InfrastructureBlock__Group__21__Impl rule__InfrastructureBlock__Group__22
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__21__Impl_in_rule__InfrastructureBlock__Group__214792);
            rule__InfrastructureBlock__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__22_in_rule__InfrastructureBlock__Group__214795);
            rule__InfrastructureBlock__Group__22();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__21"


    // $ANTLR start "rule__InfrastructureBlock__Group__21__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2336:1: rule__InfrastructureBlock__Group__21__Impl : ( ( rule__InfrastructureBlock__OrmAssignment_21 ) ) ;
    public final void rule__InfrastructureBlock__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2340:1: ( ( ( rule__InfrastructureBlock__OrmAssignment_21 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2341:1: ( ( rule__InfrastructureBlock__OrmAssignment_21 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2341:1: ( ( rule__InfrastructureBlock__OrmAssignment_21 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2342:1: ( rule__InfrastructureBlock__OrmAssignment_21 )
            {
             before(grammarAccess.getInfrastructureBlockAccess().getOrmAssignment_21()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2343:1: ( rule__InfrastructureBlock__OrmAssignment_21 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2343:2: rule__InfrastructureBlock__OrmAssignment_21
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__OrmAssignment_21_in_rule__InfrastructureBlock__Group__21__Impl4822);
            rule__InfrastructureBlock__OrmAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureBlockAccess().getOrmAssignment_21()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__21__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__22"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2353:1: rule__InfrastructureBlock__Group__22 : rule__InfrastructureBlock__Group__22__Impl rule__InfrastructureBlock__Group__23 ;
    public final void rule__InfrastructureBlock__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2357:1: ( rule__InfrastructureBlock__Group__22__Impl rule__InfrastructureBlock__Group__23 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2358:2: rule__InfrastructureBlock__Group__22__Impl rule__InfrastructureBlock__Group__23
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__22__Impl_in_rule__InfrastructureBlock__Group__224852);
            rule__InfrastructureBlock__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__23_in_rule__InfrastructureBlock__Group__224855);
            rule__InfrastructureBlock__Group__23();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__22"


    // $ANTLR start "rule__InfrastructureBlock__Group__22__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2365:1: rule__InfrastructureBlock__Group__22__Impl : ( '}' ) ;
    public final void rule__InfrastructureBlock__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2369:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2370:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2370:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2371:1: '}'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_22()); 
            match(input,33,FOLLOW_33_in_rule__InfrastructureBlock__Group__22__Impl4883); 
             after(grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_22()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__22__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__23"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2384:1: rule__InfrastructureBlock__Group__23 : rule__InfrastructureBlock__Group__23__Impl rule__InfrastructureBlock__Group__24 ;
    public final void rule__InfrastructureBlock__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2388:1: ( rule__InfrastructureBlock__Group__23__Impl rule__InfrastructureBlock__Group__24 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2389:2: rule__InfrastructureBlock__Group__23__Impl rule__InfrastructureBlock__Group__24
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__23__Impl_in_rule__InfrastructureBlock__Group__234914);
            rule__InfrastructureBlock__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__24_in_rule__InfrastructureBlock__Group__234917);
            rule__InfrastructureBlock__Group__24();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__23"


    // $ANTLR start "rule__InfrastructureBlock__Group__23__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2396:1: rule__InfrastructureBlock__Group__23__Impl : ( 'database' ) ;
    public final void rule__InfrastructureBlock__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2400:1: ( ( 'database' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2401:1: ( 'database' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2401:1: ( 'database' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2402:1: 'database'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getDatabaseKeyword_23()); 
            match(input,43,FOLLOW_43_in_rule__InfrastructureBlock__Group__23__Impl4945); 
             after(grammarAccess.getInfrastructureBlockAccess().getDatabaseKeyword_23()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__23__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__24"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2415:1: rule__InfrastructureBlock__Group__24 : rule__InfrastructureBlock__Group__24__Impl rule__InfrastructureBlock__Group__25 ;
    public final void rule__InfrastructureBlock__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2419:1: ( rule__InfrastructureBlock__Group__24__Impl rule__InfrastructureBlock__Group__25 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2420:2: rule__InfrastructureBlock__Group__24__Impl rule__InfrastructureBlock__Group__25
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__24__Impl_in_rule__InfrastructureBlock__Group__244976);
            rule__InfrastructureBlock__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__25_in_rule__InfrastructureBlock__Group__244979);
            rule__InfrastructureBlock__Group__25();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__24"


    // $ANTLR start "rule__InfrastructureBlock__Group__24__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2427:1: rule__InfrastructureBlock__Group__24__Impl : ( '=' ) ;
    public final void rule__InfrastructureBlock__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2431:1: ( ( '=' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2432:1: ( '=' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2432:1: ( '=' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2433:1: '='
            {
             before(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_24()); 
            match(input,38,FOLLOW_38_in_rule__InfrastructureBlock__Group__24__Impl5007); 
             after(grammarAccess.getInfrastructureBlockAccess().getEqualsSignKeyword_24()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__24__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__25"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2446:1: rule__InfrastructureBlock__Group__25 : rule__InfrastructureBlock__Group__25__Impl rule__InfrastructureBlock__Group__26 ;
    public final void rule__InfrastructureBlock__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2450:1: ( rule__InfrastructureBlock__Group__25__Impl rule__InfrastructureBlock__Group__26 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2451:2: rule__InfrastructureBlock__Group__25__Impl rule__InfrastructureBlock__Group__26
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__25__Impl_in_rule__InfrastructureBlock__Group__255038);
            rule__InfrastructureBlock__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__26_in_rule__InfrastructureBlock__Group__255041);
            rule__InfrastructureBlock__Group__26();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__25"


    // $ANTLR start "rule__InfrastructureBlock__Group__25__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2458:1: rule__InfrastructureBlock__Group__25__Impl : ( '{' ) ;
    public final void rule__InfrastructureBlock__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2462:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2463:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2463:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2464:1: '{'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_25()); 
            match(input,32,FOLLOW_32_in_rule__InfrastructureBlock__Group__25__Impl5069); 
             after(grammarAccess.getInfrastructureBlockAccess().getLeftCurlyBracketKeyword_25()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__25__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__26"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2477:1: rule__InfrastructureBlock__Group__26 : rule__InfrastructureBlock__Group__26__Impl rule__InfrastructureBlock__Group__27 ;
    public final void rule__InfrastructureBlock__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2481:1: ( rule__InfrastructureBlock__Group__26__Impl rule__InfrastructureBlock__Group__27 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2482:2: rule__InfrastructureBlock__Group__26__Impl rule__InfrastructureBlock__Group__27
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__26__Impl_in_rule__InfrastructureBlock__Group__265100);
            rule__InfrastructureBlock__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__27_in_rule__InfrastructureBlock__Group__265103);
            rule__InfrastructureBlock__Group__27();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__26"


    // $ANTLR start "rule__InfrastructureBlock__Group__26__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2489:1: rule__InfrastructureBlock__Group__26__Impl : ( ( rule__InfrastructureBlock__DatabaseAssignment_26 ) ) ;
    public final void rule__InfrastructureBlock__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2493:1: ( ( ( rule__InfrastructureBlock__DatabaseAssignment_26 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2494:1: ( ( rule__InfrastructureBlock__DatabaseAssignment_26 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2494:1: ( ( rule__InfrastructureBlock__DatabaseAssignment_26 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2495:1: ( rule__InfrastructureBlock__DatabaseAssignment_26 )
            {
             before(grammarAccess.getInfrastructureBlockAccess().getDatabaseAssignment_26()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2496:1: ( rule__InfrastructureBlock__DatabaseAssignment_26 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2496:2: rule__InfrastructureBlock__DatabaseAssignment_26
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__DatabaseAssignment_26_in_rule__InfrastructureBlock__Group__26__Impl5130);
            rule__InfrastructureBlock__DatabaseAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureBlockAccess().getDatabaseAssignment_26()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__26__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__27"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2506:1: rule__InfrastructureBlock__Group__27 : rule__InfrastructureBlock__Group__27__Impl rule__InfrastructureBlock__Group__28 ;
    public final void rule__InfrastructureBlock__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2510:1: ( rule__InfrastructureBlock__Group__27__Impl rule__InfrastructureBlock__Group__28 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2511:2: rule__InfrastructureBlock__Group__27__Impl rule__InfrastructureBlock__Group__28
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__27__Impl_in_rule__InfrastructureBlock__Group__275160);
            rule__InfrastructureBlock__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__28_in_rule__InfrastructureBlock__Group__275163);
            rule__InfrastructureBlock__Group__28();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__27"


    // $ANTLR start "rule__InfrastructureBlock__Group__27__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2518:1: rule__InfrastructureBlock__Group__27__Impl : ( '}' ) ;
    public final void rule__InfrastructureBlock__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2522:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2523:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2523:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2524:1: '}'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_27()); 
            match(input,33,FOLLOW_33_in_rule__InfrastructureBlock__Group__27__Impl5191); 
             after(grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_27()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__27__Impl"


    // $ANTLR start "rule__InfrastructureBlock__Group__28"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2537:1: rule__InfrastructureBlock__Group__28 : rule__InfrastructureBlock__Group__28__Impl ;
    public final void rule__InfrastructureBlock__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2541:1: ( rule__InfrastructureBlock__Group__28__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2542:2: rule__InfrastructureBlock__Group__28__Impl
            {
            pushFollow(FOLLOW_rule__InfrastructureBlock__Group__28__Impl_in_rule__InfrastructureBlock__Group__285222);
            rule__InfrastructureBlock__Group__28__Impl();

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
    // $ANTLR end "rule__InfrastructureBlock__Group__28"


    // $ANTLR start "rule__InfrastructureBlock__Group__28__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2548:1: rule__InfrastructureBlock__Group__28__Impl : ( '}' ) ;
    public final void rule__InfrastructureBlock__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2552:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2553:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2553:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2554:1: '}'
            {
             before(grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_28()); 
            match(input,33,FOLLOW_33_in_rule__InfrastructureBlock__Group__28__Impl5250); 
             after(grammarAccess.getInfrastructureBlockAccess().getRightCurlyBracketKeyword_28()); 

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
    // $ANTLR end "rule__InfrastructureBlock__Group__28__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2625:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2629:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2630:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__05339);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__1_in_rule__Database__Group__05342);
            rule__Database__Group__1();

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
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2637:1: rule__Database__Group__0__Impl : ( '@version' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2641:1: ( ( '@version' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2642:1: ( '@version' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2642:1: ( '@version' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2643:1: '@version'
            {
             before(grammarAccess.getDatabaseAccess().getVersionKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Database__Group__0__Impl5370); 
             after(grammarAccess.getDatabaseAccess().getVersionKeyword_0()); 

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
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2656:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2660:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2661:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__15401);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__2_in_rule__Database__Group__15404);
            rule__Database__Group__2();

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
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2668:1: rule__Database__Group__1__Impl : ( ':' ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2672:1: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2673:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2673:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2674:1: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Database__Group__1__Impl5432); 
             after(grammarAccess.getDatabaseAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Database__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2687:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2691:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2692:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__25463);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__3_in_rule__Database__Group__25466);
            rule__Database__Group__3();

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
    // $ANTLR end "rule__Database__Group__2"


    // $ANTLR start "rule__Database__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2699:1: rule__Database__Group__2__Impl : ( ( rule__Database__VersionValueAssignment_2 ) ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2703:1: ( ( ( rule__Database__VersionValueAssignment_2 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2704:1: ( ( rule__Database__VersionValueAssignment_2 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2704:1: ( ( rule__Database__VersionValueAssignment_2 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2705:1: ( rule__Database__VersionValueAssignment_2 )
            {
             before(grammarAccess.getDatabaseAccess().getVersionValueAssignment_2()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2706:1: ( rule__Database__VersionValueAssignment_2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2706:2: rule__Database__VersionValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Database__VersionValueAssignment_2_in_rule__Database__Group__2__Impl5493);
            rule__Database__VersionValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getVersionValueAssignment_2()); 

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
    // $ANTLR end "rule__Database__Group__2__Impl"


    // $ANTLR start "rule__Database__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2716:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2720:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2721:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__35523);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__4_in_rule__Database__Group__35526);
            rule__Database__Group__4();

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
    // $ANTLR end "rule__Database__Group__3"


    // $ANTLR start "rule__Database__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2728:1: rule__Database__Group__3__Impl : ( ',' ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2732:1: ( ( ',' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2733:1: ( ',' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2733:1: ( ',' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2734:1: ','
            {
             before(grammarAccess.getDatabaseAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_45_in_rule__Database__Group__3__Impl5554); 
             after(grammarAccess.getDatabaseAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Database__Group__3__Impl"


    // $ANTLR start "rule__Database__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2747:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2751:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2752:2: rule__Database__Group__4__Impl rule__Database__Group__5
            {
            pushFollow(FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__45585);
            rule__Database__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__5_in_rule__Database__Group__45588);
            rule__Database__Group__5();

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
    // $ANTLR end "rule__Database__Group__4"


    // $ANTLR start "rule__Database__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2759:1: rule__Database__Group__4__Impl : ( '@name' ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2763:1: ( ( '@name' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2764:1: ( '@name' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2764:1: ( '@name' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2765:1: '@name'
            {
             before(grammarAccess.getDatabaseAccess().getNameKeyword_4()); 
            match(input,46,FOLLOW_46_in_rule__Database__Group__4__Impl5616); 
             after(grammarAccess.getDatabaseAccess().getNameKeyword_4()); 

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
    // $ANTLR end "rule__Database__Group__4__Impl"


    // $ANTLR start "rule__Database__Group__5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2778:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2782:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2783:2: rule__Database__Group__5__Impl rule__Database__Group__6
            {
            pushFollow(FOLLOW_rule__Database__Group__5__Impl_in_rule__Database__Group__55647);
            rule__Database__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__6_in_rule__Database__Group__55650);
            rule__Database__Group__6();

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
    // $ANTLR end "rule__Database__Group__5"


    // $ANTLR start "rule__Database__Group__5__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2790:1: rule__Database__Group__5__Impl : ( ':' ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2794:1: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2795:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2795:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2796:1: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_5()); 
            match(input,11,FOLLOW_11_in_rule__Database__Group__5__Impl5678); 
             after(grammarAccess.getDatabaseAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Database__Group__5__Impl"


    // $ANTLR start "rule__Database__Group__6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2809:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2813:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2814:2: rule__Database__Group__6__Impl rule__Database__Group__7
            {
            pushFollow(FOLLOW_rule__Database__Group__6__Impl_in_rule__Database__Group__65709);
            rule__Database__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__7_in_rule__Database__Group__65712);
            rule__Database__Group__7();

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
    // $ANTLR end "rule__Database__Group__6"


    // $ANTLR start "rule__Database__Group__6__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2821:1: rule__Database__Group__6__Impl : ( ( rule__Database__NameValueAssignment_6 ) ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2825:1: ( ( ( rule__Database__NameValueAssignment_6 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2826:1: ( ( rule__Database__NameValueAssignment_6 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2826:1: ( ( rule__Database__NameValueAssignment_6 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2827:1: ( rule__Database__NameValueAssignment_6 )
            {
             before(grammarAccess.getDatabaseAccess().getNameValueAssignment_6()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2828:1: ( rule__Database__NameValueAssignment_6 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2828:2: rule__Database__NameValueAssignment_6
            {
            pushFollow(FOLLOW_rule__Database__NameValueAssignment_6_in_rule__Database__Group__6__Impl5739);
            rule__Database__NameValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getNameValueAssignment_6()); 

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
    // $ANTLR end "rule__Database__Group__6__Impl"


    // $ANTLR start "rule__Database__Group__7"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2838:1: rule__Database__Group__7 : rule__Database__Group__7__Impl rule__Database__Group__8 ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2842:1: ( rule__Database__Group__7__Impl rule__Database__Group__8 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2843:2: rule__Database__Group__7__Impl rule__Database__Group__8
            {
            pushFollow(FOLLOW_rule__Database__Group__7__Impl_in_rule__Database__Group__75769);
            rule__Database__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__8_in_rule__Database__Group__75772);
            rule__Database__Group__8();

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
    // $ANTLR end "rule__Database__Group__7"


    // $ANTLR start "rule__Database__Group__7__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2850:1: rule__Database__Group__7__Impl : ( ',' ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2854:1: ( ( ',' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2855:1: ( ',' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2855:1: ( ',' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2856:1: ','
            {
             before(grammarAccess.getDatabaseAccess().getCommaKeyword_7()); 
            match(input,45,FOLLOW_45_in_rule__Database__Group__7__Impl5800); 
             after(grammarAccess.getDatabaseAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__Database__Group__7__Impl"


    // $ANTLR start "rule__Database__Group__8"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2869:1: rule__Database__Group__8 : rule__Database__Group__8__Impl rule__Database__Group__9 ;
    public final void rule__Database__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2873:1: ( rule__Database__Group__8__Impl rule__Database__Group__9 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2874:2: rule__Database__Group__8__Impl rule__Database__Group__9
            {
            pushFollow(FOLLOW_rule__Database__Group__8__Impl_in_rule__Database__Group__85831);
            rule__Database__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__9_in_rule__Database__Group__85834);
            rule__Database__Group__9();

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
    // $ANTLR end "rule__Database__Group__8"


    // $ANTLR start "rule__Database__Group__8__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2881:1: rule__Database__Group__8__Impl : ( '@user' ) ;
    public final void rule__Database__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2885:1: ( ( '@user' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2886:1: ( '@user' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2886:1: ( '@user' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2887:1: '@user'
            {
             before(grammarAccess.getDatabaseAccess().getUserKeyword_8()); 
            match(input,47,FOLLOW_47_in_rule__Database__Group__8__Impl5862); 
             after(grammarAccess.getDatabaseAccess().getUserKeyword_8()); 

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
    // $ANTLR end "rule__Database__Group__8__Impl"


    // $ANTLR start "rule__Database__Group__9"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2900:1: rule__Database__Group__9 : rule__Database__Group__9__Impl rule__Database__Group__10 ;
    public final void rule__Database__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2904:1: ( rule__Database__Group__9__Impl rule__Database__Group__10 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2905:2: rule__Database__Group__9__Impl rule__Database__Group__10
            {
            pushFollow(FOLLOW_rule__Database__Group__9__Impl_in_rule__Database__Group__95893);
            rule__Database__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__10_in_rule__Database__Group__95896);
            rule__Database__Group__10();

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
    // $ANTLR end "rule__Database__Group__9"


    // $ANTLR start "rule__Database__Group__9__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2912:1: rule__Database__Group__9__Impl : ( ':' ) ;
    public final void rule__Database__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2916:1: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2917:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2917:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2918:1: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_9()); 
            match(input,11,FOLLOW_11_in_rule__Database__Group__9__Impl5924); 
             after(grammarAccess.getDatabaseAccess().getColonKeyword_9()); 

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
    // $ANTLR end "rule__Database__Group__9__Impl"


    // $ANTLR start "rule__Database__Group__10"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2931:1: rule__Database__Group__10 : rule__Database__Group__10__Impl rule__Database__Group__11 ;
    public final void rule__Database__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2935:1: ( rule__Database__Group__10__Impl rule__Database__Group__11 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2936:2: rule__Database__Group__10__Impl rule__Database__Group__11
            {
            pushFollow(FOLLOW_rule__Database__Group__10__Impl_in_rule__Database__Group__105955);
            rule__Database__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__11_in_rule__Database__Group__105958);
            rule__Database__Group__11();

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
    // $ANTLR end "rule__Database__Group__10"


    // $ANTLR start "rule__Database__Group__10__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2943:1: rule__Database__Group__10__Impl : ( ( rule__Database__UserValueAssignment_10 ) ) ;
    public final void rule__Database__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2947:1: ( ( ( rule__Database__UserValueAssignment_10 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2948:1: ( ( rule__Database__UserValueAssignment_10 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2948:1: ( ( rule__Database__UserValueAssignment_10 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2949:1: ( rule__Database__UserValueAssignment_10 )
            {
             before(grammarAccess.getDatabaseAccess().getUserValueAssignment_10()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2950:1: ( rule__Database__UserValueAssignment_10 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2950:2: rule__Database__UserValueAssignment_10
            {
            pushFollow(FOLLOW_rule__Database__UserValueAssignment_10_in_rule__Database__Group__10__Impl5985);
            rule__Database__UserValueAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getUserValueAssignment_10()); 

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
    // $ANTLR end "rule__Database__Group__10__Impl"


    // $ANTLR start "rule__Database__Group__11"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2960:1: rule__Database__Group__11 : rule__Database__Group__11__Impl rule__Database__Group__12 ;
    public final void rule__Database__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2964:1: ( rule__Database__Group__11__Impl rule__Database__Group__12 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2965:2: rule__Database__Group__11__Impl rule__Database__Group__12
            {
            pushFollow(FOLLOW_rule__Database__Group__11__Impl_in_rule__Database__Group__116015);
            rule__Database__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__12_in_rule__Database__Group__116018);
            rule__Database__Group__12();

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
    // $ANTLR end "rule__Database__Group__11"


    // $ANTLR start "rule__Database__Group__11__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2972:1: rule__Database__Group__11__Impl : ( ',' ) ;
    public final void rule__Database__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2976:1: ( ( ',' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2977:1: ( ',' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2977:1: ( ',' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2978:1: ','
            {
             before(grammarAccess.getDatabaseAccess().getCommaKeyword_11()); 
            match(input,45,FOLLOW_45_in_rule__Database__Group__11__Impl6046); 
             after(grammarAccess.getDatabaseAccess().getCommaKeyword_11()); 

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
    // $ANTLR end "rule__Database__Group__11__Impl"


    // $ANTLR start "rule__Database__Group__12"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2991:1: rule__Database__Group__12 : rule__Database__Group__12__Impl rule__Database__Group__13 ;
    public final void rule__Database__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2995:1: ( rule__Database__Group__12__Impl rule__Database__Group__13 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:2996:2: rule__Database__Group__12__Impl rule__Database__Group__13
            {
            pushFollow(FOLLOW_rule__Database__Group__12__Impl_in_rule__Database__Group__126077);
            rule__Database__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__13_in_rule__Database__Group__126080);
            rule__Database__Group__13();

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
    // $ANTLR end "rule__Database__Group__12"


    // $ANTLR start "rule__Database__Group__12__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3003:1: rule__Database__Group__12__Impl : ( '@pass' ) ;
    public final void rule__Database__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3007:1: ( ( '@pass' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3008:1: ( '@pass' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3008:1: ( '@pass' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3009:1: '@pass'
            {
             before(grammarAccess.getDatabaseAccess().getPassKeyword_12()); 
            match(input,48,FOLLOW_48_in_rule__Database__Group__12__Impl6108); 
             after(grammarAccess.getDatabaseAccess().getPassKeyword_12()); 

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
    // $ANTLR end "rule__Database__Group__12__Impl"


    // $ANTLR start "rule__Database__Group__13"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3022:1: rule__Database__Group__13 : rule__Database__Group__13__Impl rule__Database__Group__14 ;
    public final void rule__Database__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3026:1: ( rule__Database__Group__13__Impl rule__Database__Group__14 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3027:2: rule__Database__Group__13__Impl rule__Database__Group__14
            {
            pushFollow(FOLLOW_rule__Database__Group__13__Impl_in_rule__Database__Group__136139);
            rule__Database__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__14_in_rule__Database__Group__136142);
            rule__Database__Group__14();

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
    // $ANTLR end "rule__Database__Group__13"


    // $ANTLR start "rule__Database__Group__13__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3034:1: rule__Database__Group__13__Impl : ( ':' ) ;
    public final void rule__Database__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3038:1: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3039:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3039:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3040:1: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_13()); 
            match(input,11,FOLLOW_11_in_rule__Database__Group__13__Impl6170); 
             after(grammarAccess.getDatabaseAccess().getColonKeyword_13()); 

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
    // $ANTLR end "rule__Database__Group__13__Impl"


    // $ANTLR start "rule__Database__Group__14"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3053:1: rule__Database__Group__14 : rule__Database__Group__14__Impl rule__Database__Group__15 ;
    public final void rule__Database__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3057:1: ( rule__Database__Group__14__Impl rule__Database__Group__15 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3058:2: rule__Database__Group__14__Impl rule__Database__Group__15
            {
            pushFollow(FOLLOW_rule__Database__Group__14__Impl_in_rule__Database__Group__146201);
            rule__Database__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__15_in_rule__Database__Group__146204);
            rule__Database__Group__15();

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
    // $ANTLR end "rule__Database__Group__14"


    // $ANTLR start "rule__Database__Group__14__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3065:1: rule__Database__Group__14__Impl : ( ( rule__Database__PassValueAssignment_14 ) ) ;
    public final void rule__Database__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3069:1: ( ( ( rule__Database__PassValueAssignment_14 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3070:1: ( ( rule__Database__PassValueAssignment_14 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3070:1: ( ( rule__Database__PassValueAssignment_14 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3071:1: ( rule__Database__PassValueAssignment_14 )
            {
             before(grammarAccess.getDatabaseAccess().getPassValueAssignment_14()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3072:1: ( rule__Database__PassValueAssignment_14 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3072:2: rule__Database__PassValueAssignment_14
            {
            pushFollow(FOLLOW_rule__Database__PassValueAssignment_14_in_rule__Database__Group__14__Impl6231);
            rule__Database__PassValueAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getPassValueAssignment_14()); 

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
    // $ANTLR end "rule__Database__Group__14__Impl"


    // $ANTLR start "rule__Database__Group__15"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3082:1: rule__Database__Group__15 : rule__Database__Group__15__Impl rule__Database__Group__16 ;
    public final void rule__Database__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3086:1: ( rule__Database__Group__15__Impl rule__Database__Group__16 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3087:2: rule__Database__Group__15__Impl rule__Database__Group__16
            {
            pushFollow(FOLLOW_rule__Database__Group__15__Impl_in_rule__Database__Group__156261);
            rule__Database__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__16_in_rule__Database__Group__156264);
            rule__Database__Group__16();

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
    // $ANTLR end "rule__Database__Group__15"


    // $ANTLR start "rule__Database__Group__15__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3094:1: rule__Database__Group__15__Impl : ( ',' ) ;
    public final void rule__Database__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3098:1: ( ( ',' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3099:1: ( ',' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3099:1: ( ',' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3100:1: ','
            {
             before(grammarAccess.getDatabaseAccess().getCommaKeyword_15()); 
            match(input,45,FOLLOW_45_in_rule__Database__Group__15__Impl6292); 
             after(grammarAccess.getDatabaseAccess().getCommaKeyword_15()); 

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
    // $ANTLR end "rule__Database__Group__15__Impl"


    // $ANTLR start "rule__Database__Group__16"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3113:1: rule__Database__Group__16 : rule__Database__Group__16__Impl rule__Database__Group__17 ;
    public final void rule__Database__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3117:1: ( rule__Database__Group__16__Impl rule__Database__Group__17 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3118:2: rule__Database__Group__16__Impl rule__Database__Group__17
            {
            pushFollow(FOLLOW_rule__Database__Group__16__Impl_in_rule__Database__Group__166323);
            rule__Database__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__17_in_rule__Database__Group__166326);
            rule__Database__Group__17();

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
    // $ANTLR end "rule__Database__Group__16"


    // $ANTLR start "rule__Database__Group__16__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3125:1: rule__Database__Group__16__Impl : ( '@host' ) ;
    public final void rule__Database__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3129:1: ( ( '@host' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3130:1: ( '@host' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3130:1: ( '@host' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3131:1: '@host'
            {
             before(grammarAccess.getDatabaseAccess().getHostKeyword_16()); 
            match(input,49,FOLLOW_49_in_rule__Database__Group__16__Impl6354); 
             after(grammarAccess.getDatabaseAccess().getHostKeyword_16()); 

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
    // $ANTLR end "rule__Database__Group__16__Impl"


    // $ANTLR start "rule__Database__Group__17"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3144:1: rule__Database__Group__17 : rule__Database__Group__17__Impl rule__Database__Group__18 ;
    public final void rule__Database__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3148:1: ( rule__Database__Group__17__Impl rule__Database__Group__18 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3149:2: rule__Database__Group__17__Impl rule__Database__Group__18
            {
            pushFollow(FOLLOW_rule__Database__Group__17__Impl_in_rule__Database__Group__176385);
            rule__Database__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__18_in_rule__Database__Group__176388);
            rule__Database__Group__18();

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
    // $ANTLR end "rule__Database__Group__17"


    // $ANTLR start "rule__Database__Group__17__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3156:1: rule__Database__Group__17__Impl : ( ':' ) ;
    public final void rule__Database__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3160:1: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3161:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3161:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3162:1: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_17()); 
            match(input,11,FOLLOW_11_in_rule__Database__Group__17__Impl6416); 
             after(grammarAccess.getDatabaseAccess().getColonKeyword_17()); 

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
    // $ANTLR end "rule__Database__Group__17__Impl"


    // $ANTLR start "rule__Database__Group__18"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3175:1: rule__Database__Group__18 : rule__Database__Group__18__Impl rule__Database__Group__19 ;
    public final void rule__Database__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3179:1: ( rule__Database__Group__18__Impl rule__Database__Group__19 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3180:2: rule__Database__Group__18__Impl rule__Database__Group__19
            {
            pushFollow(FOLLOW_rule__Database__Group__18__Impl_in_rule__Database__Group__186447);
            rule__Database__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__19_in_rule__Database__Group__186450);
            rule__Database__Group__19();

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
    // $ANTLR end "rule__Database__Group__18"


    // $ANTLR start "rule__Database__Group__18__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3187:1: rule__Database__Group__18__Impl : ( ( rule__Database__HostValueAssignment_18 ) ) ;
    public final void rule__Database__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3191:1: ( ( ( rule__Database__HostValueAssignment_18 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3192:1: ( ( rule__Database__HostValueAssignment_18 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3192:1: ( ( rule__Database__HostValueAssignment_18 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3193:1: ( rule__Database__HostValueAssignment_18 )
            {
             before(grammarAccess.getDatabaseAccess().getHostValueAssignment_18()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3194:1: ( rule__Database__HostValueAssignment_18 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3194:2: rule__Database__HostValueAssignment_18
            {
            pushFollow(FOLLOW_rule__Database__HostValueAssignment_18_in_rule__Database__Group__18__Impl6477);
            rule__Database__HostValueAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getHostValueAssignment_18()); 

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
    // $ANTLR end "rule__Database__Group__18__Impl"


    // $ANTLR start "rule__Database__Group__19"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3204:1: rule__Database__Group__19 : rule__Database__Group__19__Impl rule__Database__Group__20 ;
    public final void rule__Database__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3208:1: ( rule__Database__Group__19__Impl rule__Database__Group__20 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3209:2: rule__Database__Group__19__Impl rule__Database__Group__20
            {
            pushFollow(FOLLOW_rule__Database__Group__19__Impl_in_rule__Database__Group__196507);
            rule__Database__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__20_in_rule__Database__Group__196510);
            rule__Database__Group__20();

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
    // $ANTLR end "rule__Database__Group__19"


    // $ANTLR start "rule__Database__Group__19__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3216:1: rule__Database__Group__19__Impl : ( ',' ) ;
    public final void rule__Database__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3220:1: ( ( ',' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3221:1: ( ',' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3221:1: ( ',' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3222:1: ','
            {
             before(grammarAccess.getDatabaseAccess().getCommaKeyword_19()); 
            match(input,45,FOLLOW_45_in_rule__Database__Group__19__Impl6538); 
             after(grammarAccess.getDatabaseAccess().getCommaKeyword_19()); 

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
    // $ANTLR end "rule__Database__Group__19__Impl"


    // $ANTLR start "rule__Database__Group__20"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3235:1: rule__Database__Group__20 : rule__Database__Group__20__Impl rule__Database__Group__21 ;
    public final void rule__Database__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3239:1: ( rule__Database__Group__20__Impl rule__Database__Group__21 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3240:2: rule__Database__Group__20__Impl rule__Database__Group__21
            {
            pushFollow(FOLLOW_rule__Database__Group__20__Impl_in_rule__Database__Group__206569);
            rule__Database__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__21_in_rule__Database__Group__206572);
            rule__Database__Group__21();

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
    // $ANTLR end "rule__Database__Group__20"


    // $ANTLR start "rule__Database__Group__20__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3247:1: rule__Database__Group__20__Impl : ( '@env' ) ;
    public final void rule__Database__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3251:1: ( ( '@env' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3252:1: ( '@env' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3252:1: ( '@env' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3253:1: '@env'
            {
             before(grammarAccess.getDatabaseAccess().getEnvKeyword_20()); 
            match(input,50,FOLLOW_50_in_rule__Database__Group__20__Impl6600); 
             after(grammarAccess.getDatabaseAccess().getEnvKeyword_20()); 

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
    // $ANTLR end "rule__Database__Group__20__Impl"


    // $ANTLR start "rule__Database__Group__21"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3266:1: rule__Database__Group__21 : rule__Database__Group__21__Impl rule__Database__Group__22 ;
    public final void rule__Database__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3270:1: ( rule__Database__Group__21__Impl rule__Database__Group__22 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3271:2: rule__Database__Group__21__Impl rule__Database__Group__22
            {
            pushFollow(FOLLOW_rule__Database__Group__21__Impl_in_rule__Database__Group__216631);
            rule__Database__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__22_in_rule__Database__Group__216634);
            rule__Database__Group__22();

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
    // $ANTLR end "rule__Database__Group__21"


    // $ANTLR start "rule__Database__Group__21__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3278:1: rule__Database__Group__21__Impl : ( ':' ) ;
    public final void rule__Database__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3282:1: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3283:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3283:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3284:1: ':'
            {
             before(grammarAccess.getDatabaseAccess().getColonKeyword_21()); 
            match(input,11,FOLLOW_11_in_rule__Database__Group__21__Impl6662); 
             after(grammarAccess.getDatabaseAccess().getColonKeyword_21()); 

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
    // $ANTLR end "rule__Database__Group__21__Impl"


    // $ANTLR start "rule__Database__Group__22"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3297:1: rule__Database__Group__22 : rule__Database__Group__22__Impl ;
    public final void rule__Database__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3301:1: ( rule__Database__Group__22__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3302:2: rule__Database__Group__22__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group__22__Impl_in_rule__Database__Group__226693);
            rule__Database__Group__22__Impl();

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
    // $ANTLR end "rule__Database__Group__22"


    // $ANTLR start "rule__Database__Group__22__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3308:1: rule__Database__Group__22__Impl : ( ( rule__Database__EnvValueAssignment_22 ) ) ;
    public final void rule__Database__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3312:1: ( ( ( rule__Database__EnvValueAssignment_22 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3313:1: ( ( rule__Database__EnvValueAssignment_22 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3313:1: ( ( rule__Database__EnvValueAssignment_22 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3314:1: ( rule__Database__EnvValueAssignment_22 )
            {
             before(grammarAccess.getDatabaseAccess().getEnvValueAssignment_22()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3315:1: ( rule__Database__EnvValueAssignment_22 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3315:2: rule__Database__EnvValueAssignment_22
            {
            pushFollow(FOLLOW_rule__Database__EnvValueAssignment_22_in_rule__Database__Group__22__Impl6720);
            rule__Database__EnvValueAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getEnvValueAssignment_22()); 

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
    // $ANTLR end "rule__Database__Group__22__Impl"


    // $ANTLR start "rule__NameVersion__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3371:1: rule__NameVersion__Group__0 : rule__NameVersion__Group__0__Impl rule__NameVersion__Group__1 ;
    public final void rule__NameVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3375:1: ( rule__NameVersion__Group__0__Impl rule__NameVersion__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3376:2: rule__NameVersion__Group__0__Impl rule__NameVersion__Group__1
            {
            pushFollow(FOLLOW_rule__NameVersion__Group__0__Impl_in_rule__NameVersion__Group__06796);
            rule__NameVersion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameVersion__Group__1_in_rule__NameVersion__Group__06799);
            rule__NameVersion__Group__1();

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
    // $ANTLR end "rule__NameVersion__Group__0"


    // $ANTLR start "rule__NameVersion__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3383:1: rule__NameVersion__Group__0__Impl : ( '@name' ) ;
    public final void rule__NameVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3387:1: ( ( '@name' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3388:1: ( '@name' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3388:1: ( '@name' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3389:1: '@name'
            {
             before(grammarAccess.getNameVersionAccess().getNameKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__NameVersion__Group__0__Impl6827); 
             after(grammarAccess.getNameVersionAccess().getNameKeyword_0()); 

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
    // $ANTLR end "rule__NameVersion__Group__0__Impl"


    // $ANTLR start "rule__NameVersion__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3402:1: rule__NameVersion__Group__1 : rule__NameVersion__Group__1__Impl rule__NameVersion__Group__2 ;
    public final void rule__NameVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3406:1: ( rule__NameVersion__Group__1__Impl rule__NameVersion__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3407:2: rule__NameVersion__Group__1__Impl rule__NameVersion__Group__2
            {
            pushFollow(FOLLOW_rule__NameVersion__Group__1__Impl_in_rule__NameVersion__Group__16858);
            rule__NameVersion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameVersion__Group__2_in_rule__NameVersion__Group__16861);
            rule__NameVersion__Group__2();

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
    // $ANTLR end "rule__NameVersion__Group__1"


    // $ANTLR start "rule__NameVersion__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3414:1: rule__NameVersion__Group__1__Impl : ( ':' ) ;
    public final void rule__NameVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3418:1: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3419:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3419:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3420:1: ':'
            {
             before(grammarAccess.getNameVersionAccess().getColonKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__NameVersion__Group__1__Impl6889); 
             after(grammarAccess.getNameVersionAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__NameVersion__Group__1__Impl"


    // $ANTLR start "rule__NameVersion__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3433:1: rule__NameVersion__Group__2 : rule__NameVersion__Group__2__Impl rule__NameVersion__Group__3 ;
    public final void rule__NameVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3437:1: ( rule__NameVersion__Group__2__Impl rule__NameVersion__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3438:2: rule__NameVersion__Group__2__Impl rule__NameVersion__Group__3
            {
            pushFollow(FOLLOW_rule__NameVersion__Group__2__Impl_in_rule__NameVersion__Group__26920);
            rule__NameVersion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameVersion__Group__3_in_rule__NameVersion__Group__26923);
            rule__NameVersion__Group__3();

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
    // $ANTLR end "rule__NameVersion__Group__2"


    // $ANTLR start "rule__NameVersion__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3445:1: rule__NameVersion__Group__2__Impl : ( ( rule__NameVersion__NameValueAssignment_2 ) ) ;
    public final void rule__NameVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3449:1: ( ( ( rule__NameVersion__NameValueAssignment_2 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3450:1: ( ( rule__NameVersion__NameValueAssignment_2 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3450:1: ( ( rule__NameVersion__NameValueAssignment_2 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3451:1: ( rule__NameVersion__NameValueAssignment_2 )
            {
             before(grammarAccess.getNameVersionAccess().getNameValueAssignment_2()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3452:1: ( rule__NameVersion__NameValueAssignment_2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3452:2: rule__NameVersion__NameValueAssignment_2
            {
            pushFollow(FOLLOW_rule__NameVersion__NameValueAssignment_2_in_rule__NameVersion__Group__2__Impl6950);
            rule__NameVersion__NameValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNameVersionAccess().getNameValueAssignment_2()); 

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
    // $ANTLR end "rule__NameVersion__Group__2__Impl"


    // $ANTLR start "rule__NameVersion__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3462:1: rule__NameVersion__Group__3 : rule__NameVersion__Group__3__Impl rule__NameVersion__Group__4 ;
    public final void rule__NameVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3466:1: ( rule__NameVersion__Group__3__Impl rule__NameVersion__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3467:2: rule__NameVersion__Group__3__Impl rule__NameVersion__Group__4
            {
            pushFollow(FOLLOW_rule__NameVersion__Group__3__Impl_in_rule__NameVersion__Group__36980);
            rule__NameVersion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameVersion__Group__4_in_rule__NameVersion__Group__36983);
            rule__NameVersion__Group__4();

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
    // $ANTLR end "rule__NameVersion__Group__3"


    // $ANTLR start "rule__NameVersion__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3474:1: rule__NameVersion__Group__3__Impl : ( ',' ) ;
    public final void rule__NameVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3478:1: ( ( ',' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3479:1: ( ',' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3479:1: ( ',' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3480:1: ','
            {
             before(grammarAccess.getNameVersionAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_45_in_rule__NameVersion__Group__3__Impl7011); 
             after(grammarAccess.getNameVersionAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__NameVersion__Group__3__Impl"


    // $ANTLR start "rule__NameVersion__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3493:1: rule__NameVersion__Group__4 : rule__NameVersion__Group__4__Impl rule__NameVersion__Group__5 ;
    public final void rule__NameVersion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3497:1: ( rule__NameVersion__Group__4__Impl rule__NameVersion__Group__5 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3498:2: rule__NameVersion__Group__4__Impl rule__NameVersion__Group__5
            {
            pushFollow(FOLLOW_rule__NameVersion__Group__4__Impl_in_rule__NameVersion__Group__47042);
            rule__NameVersion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameVersion__Group__5_in_rule__NameVersion__Group__47045);
            rule__NameVersion__Group__5();

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
    // $ANTLR end "rule__NameVersion__Group__4"


    // $ANTLR start "rule__NameVersion__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3505:1: rule__NameVersion__Group__4__Impl : ( '@version' ) ;
    public final void rule__NameVersion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3509:1: ( ( '@version' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3510:1: ( '@version' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3510:1: ( '@version' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3511:1: '@version'
            {
             before(grammarAccess.getNameVersionAccess().getVersionKeyword_4()); 
            match(input,44,FOLLOW_44_in_rule__NameVersion__Group__4__Impl7073); 
             after(grammarAccess.getNameVersionAccess().getVersionKeyword_4()); 

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
    // $ANTLR end "rule__NameVersion__Group__4__Impl"


    // $ANTLR start "rule__NameVersion__Group__5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3524:1: rule__NameVersion__Group__5 : rule__NameVersion__Group__5__Impl rule__NameVersion__Group__6 ;
    public final void rule__NameVersion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3528:1: ( rule__NameVersion__Group__5__Impl rule__NameVersion__Group__6 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3529:2: rule__NameVersion__Group__5__Impl rule__NameVersion__Group__6
            {
            pushFollow(FOLLOW_rule__NameVersion__Group__5__Impl_in_rule__NameVersion__Group__57104);
            rule__NameVersion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameVersion__Group__6_in_rule__NameVersion__Group__57107);
            rule__NameVersion__Group__6();

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
    // $ANTLR end "rule__NameVersion__Group__5"


    // $ANTLR start "rule__NameVersion__Group__5__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3536:1: rule__NameVersion__Group__5__Impl : ( ':' ) ;
    public final void rule__NameVersion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3540:1: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3541:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3541:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3542:1: ':'
            {
             before(grammarAccess.getNameVersionAccess().getColonKeyword_5()); 
            match(input,11,FOLLOW_11_in_rule__NameVersion__Group__5__Impl7135); 
             after(grammarAccess.getNameVersionAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__NameVersion__Group__5__Impl"


    // $ANTLR start "rule__NameVersion__Group__6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3555:1: rule__NameVersion__Group__6 : rule__NameVersion__Group__6__Impl ;
    public final void rule__NameVersion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3559:1: ( rule__NameVersion__Group__6__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3560:2: rule__NameVersion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__NameVersion__Group__6__Impl_in_rule__NameVersion__Group__67166);
            rule__NameVersion__Group__6__Impl();

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
    // $ANTLR end "rule__NameVersion__Group__6"


    // $ANTLR start "rule__NameVersion__Group__6__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3566:1: rule__NameVersion__Group__6__Impl : ( ( rule__NameVersion__VersionValueAssignment_6 ) ) ;
    public final void rule__NameVersion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3570:1: ( ( ( rule__NameVersion__VersionValueAssignment_6 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3571:1: ( ( rule__NameVersion__VersionValueAssignment_6 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3571:1: ( ( rule__NameVersion__VersionValueAssignment_6 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3572:1: ( rule__NameVersion__VersionValueAssignment_6 )
            {
             before(grammarAccess.getNameVersionAccess().getVersionValueAssignment_6()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3573:1: ( rule__NameVersion__VersionValueAssignment_6 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3573:2: rule__NameVersion__VersionValueAssignment_6
            {
            pushFollow(FOLLOW_rule__NameVersion__VersionValueAssignment_6_in_rule__NameVersion__Group__6__Impl7193);
            rule__NameVersion__VersionValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNameVersionAccess().getVersionValueAssignment_6()); 

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
    // $ANTLR end "rule__NameVersion__Group__6__Impl"


    // $ANTLR start "rule__ApplicationBlock__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3597:1: rule__ApplicationBlock__Group__0 : rule__ApplicationBlock__Group__0__Impl rule__ApplicationBlock__Group__1 ;
    public final void rule__ApplicationBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3601:1: ( rule__ApplicationBlock__Group__0__Impl rule__ApplicationBlock__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3602:2: rule__ApplicationBlock__Group__0__Impl rule__ApplicationBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ApplicationBlock__Group__0__Impl_in_rule__ApplicationBlock__Group__07237);
            rule__ApplicationBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationBlock__Group__1_in_rule__ApplicationBlock__Group__07240);
            rule__ApplicationBlock__Group__1();

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
    // $ANTLR end "rule__ApplicationBlock__Group__0"


    // $ANTLR start "rule__ApplicationBlock__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3609:1: rule__ApplicationBlock__Group__0__Impl : ( 'application' ) ;
    public final void rule__ApplicationBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3613:1: ( ( 'application' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3614:1: ( 'application' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3614:1: ( 'application' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3615:1: 'application'
            {
             before(grammarAccess.getApplicationBlockAccess().getApplicationKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__ApplicationBlock__Group__0__Impl7268); 
             after(grammarAccess.getApplicationBlockAccess().getApplicationKeyword_0()); 

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
    // $ANTLR end "rule__ApplicationBlock__Group__0__Impl"


    // $ANTLR start "rule__ApplicationBlock__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3628:1: rule__ApplicationBlock__Group__1 : rule__ApplicationBlock__Group__1__Impl rule__ApplicationBlock__Group__2 ;
    public final void rule__ApplicationBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3632:1: ( rule__ApplicationBlock__Group__1__Impl rule__ApplicationBlock__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3633:2: rule__ApplicationBlock__Group__1__Impl rule__ApplicationBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ApplicationBlock__Group__1__Impl_in_rule__ApplicationBlock__Group__17299);
            rule__ApplicationBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationBlock__Group__2_in_rule__ApplicationBlock__Group__17302);
            rule__ApplicationBlock__Group__2();

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
    // $ANTLR end "rule__ApplicationBlock__Group__1"


    // $ANTLR start "rule__ApplicationBlock__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3640:1: rule__ApplicationBlock__Group__1__Impl : ( ( rule__ApplicationBlock__NameAssignment_1 ) ) ;
    public final void rule__ApplicationBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3644:1: ( ( ( rule__ApplicationBlock__NameAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3645:1: ( ( rule__ApplicationBlock__NameAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3645:1: ( ( rule__ApplicationBlock__NameAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3646:1: ( rule__ApplicationBlock__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationBlockAccess().getNameAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3647:1: ( rule__ApplicationBlock__NameAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3647:2: rule__ApplicationBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ApplicationBlock__NameAssignment_1_in_rule__ApplicationBlock__Group__1__Impl7329);
            rule__ApplicationBlock__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationBlockAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ApplicationBlock__Group__1__Impl"


    // $ANTLR start "rule__ApplicationBlock__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3657:1: rule__ApplicationBlock__Group__2 : rule__ApplicationBlock__Group__2__Impl rule__ApplicationBlock__Group__3 ;
    public final void rule__ApplicationBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3661:1: ( rule__ApplicationBlock__Group__2__Impl rule__ApplicationBlock__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3662:2: rule__ApplicationBlock__Group__2__Impl rule__ApplicationBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ApplicationBlock__Group__2__Impl_in_rule__ApplicationBlock__Group__27359);
            rule__ApplicationBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationBlock__Group__3_in_rule__ApplicationBlock__Group__27362);
            rule__ApplicationBlock__Group__3();

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
    // $ANTLR end "rule__ApplicationBlock__Group__2"


    // $ANTLR start "rule__ApplicationBlock__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3669:1: rule__ApplicationBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__ApplicationBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3673:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3674:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3674:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3675:1: '{'
            {
             before(grammarAccess.getApplicationBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__ApplicationBlock__Group__2__Impl7390); 
             after(grammarAccess.getApplicationBlockAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ApplicationBlock__Group__2__Impl"


    // $ANTLR start "rule__ApplicationBlock__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3688:1: rule__ApplicationBlock__Group__3 : rule__ApplicationBlock__Group__3__Impl rule__ApplicationBlock__Group__4 ;
    public final void rule__ApplicationBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3692:1: ( rule__ApplicationBlock__Group__3__Impl rule__ApplicationBlock__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3693:2: rule__ApplicationBlock__Group__3__Impl rule__ApplicationBlock__Group__4
            {
            pushFollow(FOLLOW_rule__ApplicationBlock__Group__3__Impl_in_rule__ApplicationBlock__Group__37421);
            rule__ApplicationBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationBlock__Group__4_in_rule__ApplicationBlock__Group__37424);
            rule__ApplicationBlock__Group__4();

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
    // $ANTLR end "rule__ApplicationBlock__Group__3"


    // $ANTLR start "rule__ApplicationBlock__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3700:1: rule__ApplicationBlock__Group__3__Impl : ( ( rule__ApplicationBlock__Group_3__0 )* ) ;
    public final void rule__ApplicationBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3704:1: ( ( ( rule__ApplicationBlock__Group_3__0 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3705:1: ( ( rule__ApplicationBlock__Group_3__0 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3705:1: ( ( rule__ApplicationBlock__Group_3__0 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3706:1: ( rule__ApplicationBlock__Group_3__0 )*
            {
             before(grammarAccess.getApplicationBlockAccess().getGroup_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3707:1: ( rule__ApplicationBlock__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==52) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3707:2: rule__ApplicationBlock__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplicationBlock__Group_3__0_in_rule__ApplicationBlock__Group__3__Impl7451);
            	    rule__ApplicationBlock__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getApplicationBlockAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ApplicationBlock__Group__3__Impl"


    // $ANTLR start "rule__ApplicationBlock__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3717:1: rule__ApplicationBlock__Group__4 : rule__ApplicationBlock__Group__4__Impl ;
    public final void rule__ApplicationBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3721:1: ( rule__ApplicationBlock__Group__4__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3722:2: rule__ApplicationBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationBlock__Group__4__Impl_in_rule__ApplicationBlock__Group__47482);
            rule__ApplicationBlock__Group__4__Impl();

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
    // $ANTLR end "rule__ApplicationBlock__Group__4"


    // $ANTLR start "rule__ApplicationBlock__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3728:1: rule__ApplicationBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ApplicationBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3732:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3733:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3733:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3734:1: '}'
            {
             before(grammarAccess.getApplicationBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__ApplicationBlock__Group__4__Impl7510); 
             after(grammarAccess.getApplicationBlockAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ApplicationBlock__Group__4__Impl"


    // $ANTLR start "rule__ApplicationBlock__Group_3__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3757:1: rule__ApplicationBlock__Group_3__0 : rule__ApplicationBlock__Group_3__0__Impl rule__ApplicationBlock__Group_3__1 ;
    public final void rule__ApplicationBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3761:1: ( rule__ApplicationBlock__Group_3__0__Impl rule__ApplicationBlock__Group_3__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3762:2: rule__ApplicationBlock__Group_3__0__Impl rule__ApplicationBlock__Group_3__1
            {
            pushFollow(FOLLOW_rule__ApplicationBlock__Group_3__0__Impl_in_rule__ApplicationBlock__Group_3__07551);
            rule__ApplicationBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ApplicationBlock__Group_3__1_in_rule__ApplicationBlock__Group_3__07554);
            rule__ApplicationBlock__Group_3__1();

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
    // $ANTLR end "rule__ApplicationBlock__Group_3__0"


    // $ANTLR start "rule__ApplicationBlock__Group_3__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3769:1: rule__ApplicationBlock__Group_3__0__Impl : ( 'composedBy' ) ;
    public final void rule__ApplicationBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3773:1: ( ( 'composedBy' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3774:1: ( 'composedBy' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3774:1: ( 'composedBy' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3775:1: 'composedBy'
            {
             before(grammarAccess.getApplicationBlockAccess().getComposedByKeyword_3_0()); 
            match(input,52,FOLLOW_52_in_rule__ApplicationBlock__Group_3__0__Impl7582); 
             after(grammarAccess.getApplicationBlockAccess().getComposedByKeyword_3_0()); 

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
    // $ANTLR end "rule__ApplicationBlock__Group_3__0__Impl"


    // $ANTLR start "rule__ApplicationBlock__Group_3__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3788:1: rule__ApplicationBlock__Group_3__1 : rule__ApplicationBlock__Group_3__1__Impl ;
    public final void rule__ApplicationBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3792:1: ( rule__ApplicationBlock__Group_3__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3793:2: rule__ApplicationBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplicationBlock__Group_3__1__Impl_in_rule__ApplicationBlock__Group_3__17613);
            rule__ApplicationBlock__Group_3__1__Impl();

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
    // $ANTLR end "rule__ApplicationBlock__Group_3__1"


    // $ANTLR start "rule__ApplicationBlock__Group_3__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3799:1: rule__ApplicationBlock__Group_3__1__Impl : ( ( rule__ApplicationBlock__ApplicationDomainAssignment_3_1 ) ) ;
    public final void rule__ApplicationBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3803:1: ( ( ( rule__ApplicationBlock__ApplicationDomainAssignment_3_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3804:1: ( ( rule__ApplicationBlock__ApplicationDomainAssignment_3_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3804:1: ( ( rule__ApplicationBlock__ApplicationDomainAssignment_3_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3805:1: ( rule__ApplicationBlock__ApplicationDomainAssignment_3_1 )
            {
             before(grammarAccess.getApplicationBlockAccess().getApplicationDomainAssignment_3_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3806:1: ( rule__ApplicationBlock__ApplicationDomainAssignment_3_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3806:2: rule__ApplicationBlock__ApplicationDomainAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ApplicationBlock__ApplicationDomainAssignment_3_1_in_rule__ApplicationBlock__Group_3__1__Impl7640);
            rule__ApplicationBlock__ApplicationDomainAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationBlockAccess().getApplicationDomainAssignment_3_1()); 

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
    // $ANTLR end "rule__ApplicationBlock__Group_3__1__Impl"


    // $ANTLR start "rule__DomainBlock__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3820:1: rule__DomainBlock__Group__0 : rule__DomainBlock__Group__0__Impl rule__DomainBlock__Group__1 ;
    public final void rule__DomainBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3824:1: ( rule__DomainBlock__Group__0__Impl rule__DomainBlock__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3825:2: rule__DomainBlock__Group__0__Impl rule__DomainBlock__Group__1
            {
            pushFollow(FOLLOW_rule__DomainBlock__Group__0__Impl_in_rule__DomainBlock__Group__07674);
            rule__DomainBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainBlock__Group__1_in_rule__DomainBlock__Group__07677);
            rule__DomainBlock__Group__1();

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
    // $ANTLR end "rule__DomainBlock__Group__0"


    // $ANTLR start "rule__DomainBlock__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3832:1: rule__DomainBlock__Group__0__Impl : ( 'domain' ) ;
    public final void rule__DomainBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3836:1: ( ( 'domain' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3837:1: ( 'domain' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3837:1: ( 'domain' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3838:1: 'domain'
            {
             before(grammarAccess.getDomainBlockAccess().getDomainKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__DomainBlock__Group__0__Impl7705); 
             after(grammarAccess.getDomainBlockAccess().getDomainKeyword_0()); 

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
    // $ANTLR end "rule__DomainBlock__Group__0__Impl"


    // $ANTLR start "rule__DomainBlock__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3851:1: rule__DomainBlock__Group__1 : rule__DomainBlock__Group__1__Impl rule__DomainBlock__Group__2 ;
    public final void rule__DomainBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3855:1: ( rule__DomainBlock__Group__1__Impl rule__DomainBlock__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3856:2: rule__DomainBlock__Group__1__Impl rule__DomainBlock__Group__2
            {
            pushFollow(FOLLOW_rule__DomainBlock__Group__1__Impl_in_rule__DomainBlock__Group__17736);
            rule__DomainBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainBlock__Group__2_in_rule__DomainBlock__Group__17739);
            rule__DomainBlock__Group__2();

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
    // $ANTLR end "rule__DomainBlock__Group__1"


    // $ANTLR start "rule__DomainBlock__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3863:1: rule__DomainBlock__Group__1__Impl : ( ( rule__DomainBlock__NameAssignment_1 ) ) ;
    public final void rule__DomainBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3867:1: ( ( ( rule__DomainBlock__NameAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3868:1: ( ( rule__DomainBlock__NameAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3868:1: ( ( rule__DomainBlock__NameAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3869:1: ( rule__DomainBlock__NameAssignment_1 )
            {
             before(grammarAccess.getDomainBlockAccess().getNameAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3870:1: ( rule__DomainBlock__NameAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3870:2: rule__DomainBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DomainBlock__NameAssignment_1_in_rule__DomainBlock__Group__1__Impl7766);
            rule__DomainBlock__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainBlockAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DomainBlock__Group__1__Impl"


    // $ANTLR start "rule__DomainBlock__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3880:1: rule__DomainBlock__Group__2 : rule__DomainBlock__Group__2__Impl rule__DomainBlock__Group__3 ;
    public final void rule__DomainBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3884:1: ( rule__DomainBlock__Group__2__Impl rule__DomainBlock__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3885:2: rule__DomainBlock__Group__2__Impl rule__DomainBlock__Group__3
            {
            pushFollow(FOLLOW_rule__DomainBlock__Group__2__Impl_in_rule__DomainBlock__Group__27796);
            rule__DomainBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainBlock__Group__3_in_rule__DomainBlock__Group__27799);
            rule__DomainBlock__Group__3();

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
    // $ANTLR end "rule__DomainBlock__Group__2"


    // $ANTLR start "rule__DomainBlock__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3892:1: rule__DomainBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3896:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3897:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3897:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3898:1: '{'
            {
             before(grammarAccess.getDomainBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__DomainBlock__Group__2__Impl7827); 
             after(grammarAccess.getDomainBlockAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DomainBlock__Group__2__Impl"


    // $ANTLR start "rule__DomainBlock__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3911:1: rule__DomainBlock__Group__3 : rule__DomainBlock__Group__3__Impl rule__DomainBlock__Group__4 ;
    public final void rule__DomainBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3915:1: ( rule__DomainBlock__Group__3__Impl rule__DomainBlock__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3916:2: rule__DomainBlock__Group__3__Impl rule__DomainBlock__Group__4
            {
            pushFollow(FOLLOW_rule__DomainBlock__Group__3__Impl_in_rule__DomainBlock__Group__37858);
            rule__DomainBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainBlock__Group__4_in_rule__DomainBlock__Group__37861);
            rule__DomainBlock__Group__4();

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
    // $ANTLR end "rule__DomainBlock__Group__3"


    // $ANTLR start "rule__DomainBlock__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3923:1: rule__DomainBlock__Group__3__Impl : ( ( rule__DomainBlock__ModuleAssignment_3 )* ) ;
    public final void rule__DomainBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3927:1: ( ( ( rule__DomainBlock__ModuleAssignment_3 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3928:1: ( ( rule__DomainBlock__ModuleAssignment_3 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3928:1: ( ( rule__DomainBlock__ModuleAssignment_3 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3929:1: ( rule__DomainBlock__ModuleAssignment_3 )*
            {
             before(grammarAccess.getDomainBlockAccess().getModuleAssignment_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3930:1: ( rule__DomainBlock__ModuleAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==54) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3930:2: rule__DomainBlock__ModuleAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__DomainBlock__ModuleAssignment_3_in_rule__DomainBlock__Group__3__Impl7888);
            	    rule__DomainBlock__ModuleAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDomainBlockAccess().getModuleAssignment_3()); 

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
    // $ANTLR end "rule__DomainBlock__Group__3__Impl"


    // $ANTLR start "rule__DomainBlock__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3940:1: rule__DomainBlock__Group__4 : rule__DomainBlock__Group__4__Impl ;
    public final void rule__DomainBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3944:1: ( rule__DomainBlock__Group__4__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3945:2: rule__DomainBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DomainBlock__Group__4__Impl_in_rule__DomainBlock__Group__47919);
            rule__DomainBlock__Group__4__Impl();

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
    // $ANTLR end "rule__DomainBlock__Group__4"


    // $ANTLR start "rule__DomainBlock__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3951:1: rule__DomainBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3955:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3956:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3956:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3957:1: '}'
            {
             before(grammarAccess.getDomainBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__DomainBlock__Group__4__Impl7947); 
             after(grammarAccess.getDomainBlockAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__DomainBlock__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3980:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3984:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3985:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__07988);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__07991);
            rule__Module__Group__1();

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
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3992:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3996:1: ( ( 'module' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3997:1: ( 'module' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3997:1: ( 'module' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:3998:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__Module__Group__0__Impl8019); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

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
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4011:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4015:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4016:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__18050);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__18053);
            rule__Module__Group__2();

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
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4023:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4027:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4028:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4028:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4029:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4030:1: ( rule__Module__NameAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4030:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl8080);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4040:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4044:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4045:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__28110);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__28113);
            rule__Module__Group__3();

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
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4052:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4056:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4057:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4057:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4058:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Module__Group__2__Impl8141); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4071:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4075:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4076:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__38172);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__38175);
            rule__Module__Group__4();

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
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4083:1: rule__Module__Group__3__Impl : ( ( rule__Module__Alternatives_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4087:1: ( ( ( rule__Module__Alternatives_3 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4088:1: ( ( rule__Module__Alternatives_3 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4088:1: ( ( rule__Module__Alternatives_3 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4089:1: ( rule__Module__Alternatives_3 )*
            {
             before(grammarAccess.getModuleAccess().getAlternatives_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4090:1: ( rule__Module__Alternatives_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=27 && LA13_0<=30)||(LA13_0>=55 && LA13_0<=56)||LA13_0==60||LA13_0==67) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4090:2: rule__Module__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__Module__Alternatives_3_in_rule__Module__Group__3__Impl8202);
            	    rule__Module__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4100:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4104:1: ( rule__Module__Group__4__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4105:2: rule__Module__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__48233);
            rule__Module__Group__4__Impl();

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
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4111:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4115:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4116:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4116:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4117:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Module__Group__4__Impl8261); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__ServiceBlock__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4140:1: rule__ServiceBlock__Group__0 : rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1 ;
    public final void rule__ServiceBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4144:1: ( rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4145:2: rule__ServiceBlock__Group__0__Impl rule__ServiceBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__0__Impl_in_rule__ServiceBlock__Group__08302);
            rule__ServiceBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__1_in_rule__ServiceBlock__Group__08305);
            rule__ServiceBlock__Group__1();

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
    // $ANTLR end "rule__ServiceBlock__Group__0"


    // $ANTLR start "rule__ServiceBlock__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4152:1: rule__ServiceBlock__Group__0__Impl : ( 'service' ) ;
    public final void rule__ServiceBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4156:1: ( ( 'service' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4157:1: ( 'service' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4157:1: ( 'service' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4158:1: 'service'
            {
             before(grammarAccess.getServiceBlockAccess().getServiceKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__ServiceBlock__Group__0__Impl8333); 
             after(grammarAccess.getServiceBlockAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__ServiceBlock__Group__0__Impl"


    // $ANTLR start "rule__ServiceBlock__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4171:1: rule__ServiceBlock__Group__1 : rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2 ;
    public final void rule__ServiceBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4175:1: ( rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4176:2: rule__ServiceBlock__Group__1__Impl rule__ServiceBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__1__Impl_in_rule__ServiceBlock__Group__18364);
            rule__ServiceBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__2_in_rule__ServiceBlock__Group__18367);
            rule__ServiceBlock__Group__2();

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
    // $ANTLR end "rule__ServiceBlock__Group__1"


    // $ANTLR start "rule__ServiceBlock__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4183:1: rule__ServiceBlock__Group__1__Impl : ( ( rule__ServiceBlock__NameAssignment_1 ) ) ;
    public final void rule__ServiceBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4187:1: ( ( ( rule__ServiceBlock__NameAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4188:1: ( ( rule__ServiceBlock__NameAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4188:1: ( ( rule__ServiceBlock__NameAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4189:1: ( rule__ServiceBlock__NameAssignment_1 )
            {
             before(grammarAccess.getServiceBlockAccess().getNameAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4190:1: ( rule__ServiceBlock__NameAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4190:2: rule__ServiceBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceBlock__NameAssignment_1_in_rule__ServiceBlock__Group__1__Impl8394);
            rule__ServiceBlock__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceBlockAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ServiceBlock__Group__1__Impl"


    // $ANTLR start "rule__ServiceBlock__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4200:1: rule__ServiceBlock__Group__2 : rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3 ;
    public final void rule__ServiceBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4204:1: ( rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4205:2: rule__ServiceBlock__Group__2__Impl rule__ServiceBlock__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__2__Impl_in_rule__ServiceBlock__Group__28424);
            rule__ServiceBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__3_in_rule__ServiceBlock__Group__28427);
            rule__ServiceBlock__Group__3();

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
    // $ANTLR end "rule__ServiceBlock__Group__2"


    // $ANTLR start "rule__ServiceBlock__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4212:1: rule__ServiceBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4216:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4217:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4217:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4218:1: '{'
            {
             before(grammarAccess.getServiceBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__ServiceBlock__Group__2__Impl8455); 
             after(grammarAccess.getServiceBlockAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ServiceBlock__Group__2__Impl"


    // $ANTLR start "rule__ServiceBlock__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4231:1: rule__ServiceBlock__Group__3 : rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4 ;
    public final void rule__ServiceBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4235:1: ( rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4236:2: rule__ServiceBlock__Group__3__Impl rule__ServiceBlock__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__3__Impl_in_rule__ServiceBlock__Group__38486);
            rule__ServiceBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceBlock__Group__4_in_rule__ServiceBlock__Group__38489);
            rule__ServiceBlock__Group__4();

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
    // $ANTLR end "rule__ServiceBlock__Group__3"


    // $ANTLR start "rule__ServiceBlock__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4243:1: rule__ServiceBlock__Group__3__Impl : ( ( rule__ServiceBlock__ServiceFieldsAssignment_3 )* ) ;
    public final void rule__ServiceBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4247:1: ( ( ( rule__ServiceBlock__ServiceFieldsAssignment_3 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4248:1: ( ( rule__ServiceBlock__ServiceFieldsAssignment_3 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4248:1: ( ( rule__ServiceBlock__ServiceFieldsAssignment_3 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4249:1: ( rule__ServiceBlock__ServiceFieldsAssignment_3 )*
            {
             before(grammarAccess.getServiceBlockAccess().getServiceFieldsAssignment_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4250:1: ( rule__ServiceBlock__ServiceFieldsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4250:2: rule__ServiceBlock__ServiceFieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ServiceBlock__ServiceFieldsAssignment_3_in_rule__ServiceBlock__Group__3__Impl8516);
            	    rule__ServiceBlock__ServiceFieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getServiceBlockAccess().getServiceFieldsAssignment_3()); 

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
    // $ANTLR end "rule__ServiceBlock__Group__3__Impl"


    // $ANTLR start "rule__ServiceBlock__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4260:1: rule__ServiceBlock__Group__4 : rule__ServiceBlock__Group__4__Impl ;
    public final void rule__ServiceBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4264:1: ( rule__ServiceBlock__Group__4__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4265:2: rule__ServiceBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ServiceBlock__Group__4__Impl_in_rule__ServiceBlock__Group__48547);
            rule__ServiceBlock__Group__4__Impl();

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
    // $ANTLR end "rule__ServiceBlock__Group__4"


    // $ANTLR start "rule__ServiceBlock__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4271:1: rule__ServiceBlock__Group__4__Impl : ( '}' ) ;
    public final void rule__ServiceBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4275:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4276:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4276:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4277:1: '}'
            {
             before(grammarAccess.getServiceBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__ServiceBlock__Group__4__Impl8575); 
             after(grammarAccess.getServiceBlockAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ServiceBlock__Group__4__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4300:1: rule__ServiceMethod__Group__0 : rule__ServiceMethod__Group__0__Impl rule__ServiceMethod__Group__1 ;
    public final void rule__ServiceMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4304:1: ( rule__ServiceMethod__Group__0__Impl rule__ServiceMethod__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4305:2: rule__ServiceMethod__Group__0__Impl rule__ServiceMethod__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__0__Impl_in_rule__ServiceMethod__Group__08616);
            rule__ServiceMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethod__Group__1_in_rule__ServiceMethod__Group__08619);
            rule__ServiceMethod__Group__1();

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
    // $ANTLR end "rule__ServiceMethod__Group__0"


    // $ANTLR start "rule__ServiceMethod__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4312:1: rule__ServiceMethod__Group__0__Impl : ( ( rule__ServiceMethod__NameAssignment_0 ) ) ;
    public final void rule__ServiceMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4316:1: ( ( ( rule__ServiceMethod__NameAssignment_0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4317:1: ( ( rule__ServiceMethod__NameAssignment_0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4317:1: ( ( rule__ServiceMethod__NameAssignment_0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4318:1: ( rule__ServiceMethod__NameAssignment_0 )
            {
             before(grammarAccess.getServiceMethodAccess().getNameAssignment_0()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4319:1: ( rule__ServiceMethod__NameAssignment_0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4319:2: rule__ServiceMethod__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ServiceMethod__NameAssignment_0_in_rule__ServiceMethod__Group__0__Impl8646);
            rule__ServiceMethod__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getServiceMethodAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ServiceMethod__Group__0__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4329:1: rule__ServiceMethod__Group__1 : rule__ServiceMethod__Group__1__Impl rule__ServiceMethod__Group__2 ;
    public final void rule__ServiceMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4333:1: ( rule__ServiceMethod__Group__1__Impl rule__ServiceMethod__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4334:2: rule__ServiceMethod__Group__1__Impl rule__ServiceMethod__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__1__Impl_in_rule__ServiceMethod__Group__18676);
            rule__ServiceMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethod__Group__2_in_rule__ServiceMethod__Group__18679);
            rule__ServiceMethod__Group__2();

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
    // $ANTLR end "rule__ServiceMethod__Group__1"


    // $ANTLR start "rule__ServiceMethod__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4341:1: rule__ServiceMethod__Group__1__Impl : ( '=>' ) ;
    public final void rule__ServiceMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4345:1: ( ( '=>' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4346:1: ( '=>' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4346:1: ( '=>' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4347:1: '=>'
            {
             before(grammarAccess.getServiceMethodAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__ServiceMethod__Group__1__Impl8707); 
             after(grammarAccess.getServiceMethodAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__ServiceMethod__Group__1__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4360:1: rule__ServiceMethod__Group__2 : rule__ServiceMethod__Group__2__Impl ;
    public final void rule__ServiceMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4364:1: ( rule__ServiceMethod__Group__2__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4365:2: rule__ServiceMethod__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__2__Impl_in_rule__ServiceMethod__Group__28738);
            rule__ServiceMethod__Group__2__Impl();

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
    // $ANTLR end "rule__ServiceMethod__Group__2"


    // $ANTLR start "rule__ServiceMethod__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4371:1: rule__ServiceMethod__Group__2__Impl : ( ( rule__ServiceMethod__MethodAcessAssignment_2 ) ) ;
    public final void rule__ServiceMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4375:1: ( ( ( rule__ServiceMethod__MethodAcessAssignment_2 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4376:1: ( ( rule__ServiceMethod__MethodAcessAssignment_2 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4376:1: ( ( rule__ServiceMethod__MethodAcessAssignment_2 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4377:1: ( rule__ServiceMethod__MethodAcessAssignment_2 )
            {
             before(grammarAccess.getServiceMethodAccess().getMethodAcessAssignment_2()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4378:1: ( rule__ServiceMethod__MethodAcessAssignment_2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4378:2: rule__ServiceMethod__MethodAcessAssignment_2
            {
            pushFollow(FOLLOW_rule__ServiceMethod__MethodAcessAssignment_2_in_rule__ServiceMethod__Group__2__Impl8765);
            rule__ServiceMethod__MethodAcessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceMethodAccess().getMethodAcessAssignment_2()); 

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
    // $ANTLR end "rule__ServiceMethod__Group__2__Impl"


    // $ANTLR start "rule__EntityBlock__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4394:1: rule__EntityBlock__Group__0 : rule__EntityBlock__Group__0__Impl rule__EntityBlock__Group__1 ;
    public final void rule__EntityBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4398:1: ( rule__EntityBlock__Group__0__Impl rule__EntityBlock__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4399:2: rule__EntityBlock__Group__0__Impl rule__EntityBlock__Group__1
            {
            pushFollow(FOLLOW_rule__EntityBlock__Group__0__Impl_in_rule__EntityBlock__Group__08801);
            rule__EntityBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBlock__Group__1_in_rule__EntityBlock__Group__08804);
            rule__EntityBlock__Group__1();

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
    // $ANTLR end "rule__EntityBlock__Group__0"


    // $ANTLR start "rule__EntityBlock__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4406:1: rule__EntityBlock__Group__0__Impl : ( ( rule__EntityBlock__AcessModifierAssignment_0 )? ) ;
    public final void rule__EntityBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4410:1: ( ( ( rule__EntityBlock__AcessModifierAssignment_0 )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4411:1: ( ( rule__EntityBlock__AcessModifierAssignment_0 )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4411:1: ( ( rule__EntityBlock__AcessModifierAssignment_0 )? )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4412:1: ( rule__EntityBlock__AcessModifierAssignment_0 )?
            {
             before(grammarAccess.getEntityBlockAccess().getAcessModifierAssignment_0()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4413:1: ( rule__EntityBlock__AcessModifierAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=27 && LA15_0<=30)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4413:2: rule__EntityBlock__AcessModifierAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EntityBlock__AcessModifierAssignment_0_in_rule__EntityBlock__Group__0__Impl8831);
                    rule__EntityBlock__AcessModifierAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityBlockAccess().getAcessModifierAssignment_0()); 

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
    // $ANTLR end "rule__EntityBlock__Group__0__Impl"


    // $ANTLR start "rule__EntityBlock__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4423:1: rule__EntityBlock__Group__1 : rule__EntityBlock__Group__1__Impl rule__EntityBlock__Group__2 ;
    public final void rule__EntityBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4427:1: ( rule__EntityBlock__Group__1__Impl rule__EntityBlock__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4428:2: rule__EntityBlock__Group__1__Impl rule__EntityBlock__Group__2
            {
            pushFollow(FOLLOW_rule__EntityBlock__Group__1__Impl_in_rule__EntityBlock__Group__18862);
            rule__EntityBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBlock__Group__2_in_rule__EntityBlock__Group__18865);
            rule__EntityBlock__Group__2();

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
    // $ANTLR end "rule__EntityBlock__Group__1"


    // $ANTLR start "rule__EntityBlock__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4435:1: rule__EntityBlock__Group__1__Impl : ( ( rule__EntityBlock__IsAbstractAssignment_1 )? ) ;
    public final void rule__EntityBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4439:1: ( ( ( rule__EntityBlock__IsAbstractAssignment_1 )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4440:1: ( ( rule__EntityBlock__IsAbstractAssignment_1 )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4440:1: ( ( rule__EntityBlock__IsAbstractAssignment_1 )? )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4441:1: ( rule__EntityBlock__IsAbstractAssignment_1 )?
            {
             before(grammarAccess.getEntityBlockAccess().getIsAbstractAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4442:1: ( rule__EntityBlock__IsAbstractAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==67) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4442:2: rule__EntityBlock__IsAbstractAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EntityBlock__IsAbstractAssignment_1_in_rule__EntityBlock__Group__1__Impl8892);
                    rule__EntityBlock__IsAbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityBlockAccess().getIsAbstractAssignment_1()); 

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
    // $ANTLR end "rule__EntityBlock__Group__1__Impl"


    // $ANTLR start "rule__EntityBlock__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4452:1: rule__EntityBlock__Group__2 : rule__EntityBlock__Group__2__Impl rule__EntityBlock__Group__3 ;
    public final void rule__EntityBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4456:1: ( rule__EntityBlock__Group__2__Impl rule__EntityBlock__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4457:2: rule__EntityBlock__Group__2__Impl rule__EntityBlock__Group__3
            {
            pushFollow(FOLLOW_rule__EntityBlock__Group__2__Impl_in_rule__EntityBlock__Group__28923);
            rule__EntityBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBlock__Group__3_in_rule__EntityBlock__Group__28926);
            rule__EntityBlock__Group__3();

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
    // $ANTLR end "rule__EntityBlock__Group__2"


    // $ANTLR start "rule__EntityBlock__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4464:1: rule__EntityBlock__Group__2__Impl : ( 'entity' ) ;
    public final void rule__EntityBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4468:1: ( ( 'entity' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4469:1: ( 'entity' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4469:1: ( 'entity' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4470:1: 'entity'
            {
             before(grammarAccess.getEntityBlockAccess().getEntityKeyword_2()); 
            match(input,56,FOLLOW_56_in_rule__EntityBlock__Group__2__Impl8954); 
             after(grammarAccess.getEntityBlockAccess().getEntityKeyword_2()); 

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
    // $ANTLR end "rule__EntityBlock__Group__2__Impl"


    // $ANTLR start "rule__EntityBlock__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4483:1: rule__EntityBlock__Group__3 : rule__EntityBlock__Group__3__Impl rule__EntityBlock__Group__4 ;
    public final void rule__EntityBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4487:1: ( rule__EntityBlock__Group__3__Impl rule__EntityBlock__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4488:2: rule__EntityBlock__Group__3__Impl rule__EntityBlock__Group__4
            {
            pushFollow(FOLLOW_rule__EntityBlock__Group__3__Impl_in_rule__EntityBlock__Group__38985);
            rule__EntityBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBlock__Group__4_in_rule__EntityBlock__Group__38988);
            rule__EntityBlock__Group__4();

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
    // $ANTLR end "rule__EntityBlock__Group__3"


    // $ANTLR start "rule__EntityBlock__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4495:1: rule__EntityBlock__Group__3__Impl : ( ( rule__EntityBlock__NameAssignment_3 ) ) ;
    public final void rule__EntityBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4499:1: ( ( ( rule__EntityBlock__NameAssignment_3 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4500:1: ( ( rule__EntityBlock__NameAssignment_3 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4500:1: ( ( rule__EntityBlock__NameAssignment_3 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4501:1: ( rule__EntityBlock__NameAssignment_3 )
            {
             before(grammarAccess.getEntityBlockAccess().getNameAssignment_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4502:1: ( rule__EntityBlock__NameAssignment_3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4502:2: rule__EntityBlock__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__EntityBlock__NameAssignment_3_in_rule__EntityBlock__Group__3__Impl9015);
            rule__EntityBlock__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityBlockAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__EntityBlock__Group__3__Impl"


    // $ANTLR start "rule__EntityBlock__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4512:1: rule__EntityBlock__Group__4 : rule__EntityBlock__Group__4__Impl rule__EntityBlock__Group__5 ;
    public final void rule__EntityBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4516:1: ( rule__EntityBlock__Group__4__Impl rule__EntityBlock__Group__5 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4517:2: rule__EntityBlock__Group__4__Impl rule__EntityBlock__Group__5
            {
            pushFollow(FOLLOW_rule__EntityBlock__Group__4__Impl_in_rule__EntityBlock__Group__49045);
            rule__EntityBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBlock__Group__5_in_rule__EntityBlock__Group__49048);
            rule__EntityBlock__Group__5();

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
    // $ANTLR end "rule__EntityBlock__Group__4"


    // $ANTLR start "rule__EntityBlock__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4524:1: rule__EntityBlock__Group__4__Impl : ( ( rule__EntityBlock__ClassExtendsAssignment_4 )? ) ;
    public final void rule__EntityBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4528:1: ( ( ( rule__EntityBlock__ClassExtendsAssignment_4 )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4529:1: ( ( rule__EntityBlock__ClassExtendsAssignment_4 )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4529:1: ( ( rule__EntityBlock__ClassExtendsAssignment_4 )? )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4530:1: ( rule__EntityBlock__ClassExtendsAssignment_4 )?
            {
             before(grammarAccess.getEntityBlockAccess().getClassExtendsAssignment_4()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4531:1: ( rule__EntityBlock__ClassExtendsAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==11) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4531:2: rule__EntityBlock__ClassExtendsAssignment_4
                    {
                    pushFollow(FOLLOW_rule__EntityBlock__ClassExtendsAssignment_4_in_rule__EntityBlock__Group__4__Impl9075);
                    rule__EntityBlock__ClassExtendsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityBlockAccess().getClassExtendsAssignment_4()); 

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
    // $ANTLR end "rule__EntityBlock__Group__4__Impl"


    // $ANTLR start "rule__EntityBlock__Group__5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4541:1: rule__EntityBlock__Group__5 : rule__EntityBlock__Group__5__Impl rule__EntityBlock__Group__6 ;
    public final void rule__EntityBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4545:1: ( rule__EntityBlock__Group__5__Impl rule__EntityBlock__Group__6 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4546:2: rule__EntityBlock__Group__5__Impl rule__EntityBlock__Group__6
            {
            pushFollow(FOLLOW_rule__EntityBlock__Group__5__Impl_in_rule__EntityBlock__Group__59106);
            rule__EntityBlock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBlock__Group__6_in_rule__EntityBlock__Group__59109);
            rule__EntityBlock__Group__6();

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
    // $ANTLR end "rule__EntityBlock__Group__5"


    // $ANTLR start "rule__EntityBlock__Group__5__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4553:1: rule__EntityBlock__Group__5__Impl : ( '{' ) ;
    public final void rule__EntityBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4557:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4558:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4558:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4559:1: '{'
            {
             before(grammarAccess.getEntityBlockAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_32_in_rule__EntityBlock__Group__5__Impl9137); 
             after(grammarAccess.getEntityBlockAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__EntityBlock__Group__5__Impl"


    // $ANTLR start "rule__EntityBlock__Group__6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4572:1: rule__EntityBlock__Group__6 : rule__EntityBlock__Group__6__Impl rule__EntityBlock__Group__7 ;
    public final void rule__EntityBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4576:1: ( rule__EntityBlock__Group__6__Impl rule__EntityBlock__Group__7 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4577:2: rule__EntityBlock__Group__6__Impl rule__EntityBlock__Group__7
            {
            pushFollow(FOLLOW_rule__EntityBlock__Group__6__Impl_in_rule__EntityBlock__Group__69168);
            rule__EntityBlock__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBlock__Group__7_in_rule__EntityBlock__Group__69171);
            rule__EntityBlock__Group__7();

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
    // $ANTLR end "rule__EntityBlock__Group__6"


    // $ANTLR start "rule__EntityBlock__Group__6__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4584:1: rule__EntityBlock__Group__6__Impl : ( ( rule__EntityBlock__AttributesAssignment_6 )* ) ;
    public final void rule__EntityBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4588:1: ( ( ( rule__EntityBlock__AttributesAssignment_6 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4589:1: ( ( rule__EntityBlock__AttributesAssignment_6 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4589:1: ( ( rule__EntityBlock__AttributesAssignment_6 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4590:1: ( rule__EntityBlock__AttributesAssignment_6 )*
            {
             before(grammarAccess.getEntityBlockAccess().getAttributesAssignment_6()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4591:1: ( rule__EntityBlock__AttributesAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=14 && LA18_0<=30)||LA18_0==61||LA18_0==64) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4591:2: rule__EntityBlock__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__EntityBlock__AttributesAssignment_6_in_rule__EntityBlock__Group__6__Impl9198);
            	    rule__EntityBlock__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEntityBlockAccess().getAttributesAssignment_6()); 

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
    // $ANTLR end "rule__EntityBlock__Group__6__Impl"


    // $ANTLR start "rule__EntityBlock__Group__7"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4601:1: rule__EntityBlock__Group__7 : rule__EntityBlock__Group__7__Impl rule__EntityBlock__Group__8 ;
    public final void rule__EntityBlock__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4605:1: ( rule__EntityBlock__Group__7__Impl rule__EntityBlock__Group__8 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4606:2: rule__EntityBlock__Group__7__Impl rule__EntityBlock__Group__8
            {
            pushFollow(FOLLOW_rule__EntityBlock__Group__7__Impl_in_rule__EntityBlock__Group__79229);
            rule__EntityBlock__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityBlock__Group__8_in_rule__EntityBlock__Group__79232);
            rule__EntityBlock__Group__8();

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
    // $ANTLR end "rule__EntityBlock__Group__7"


    // $ANTLR start "rule__EntityBlock__Group__7__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4613:1: rule__EntityBlock__Group__7__Impl : ( ( rule__EntityBlock__RepositoryAssignment_7 ) ) ;
    public final void rule__EntityBlock__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4617:1: ( ( ( rule__EntityBlock__RepositoryAssignment_7 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4618:1: ( ( rule__EntityBlock__RepositoryAssignment_7 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4618:1: ( ( rule__EntityBlock__RepositoryAssignment_7 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4619:1: ( rule__EntityBlock__RepositoryAssignment_7 )
            {
             before(grammarAccess.getEntityBlockAccess().getRepositoryAssignment_7()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4620:1: ( rule__EntityBlock__RepositoryAssignment_7 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4620:2: rule__EntityBlock__RepositoryAssignment_7
            {
            pushFollow(FOLLOW_rule__EntityBlock__RepositoryAssignment_7_in_rule__EntityBlock__Group__7__Impl9259);
            rule__EntityBlock__RepositoryAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEntityBlockAccess().getRepositoryAssignment_7()); 

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
    // $ANTLR end "rule__EntityBlock__Group__7__Impl"


    // $ANTLR start "rule__EntityBlock__Group__8"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4630:1: rule__EntityBlock__Group__8 : rule__EntityBlock__Group__8__Impl ;
    public final void rule__EntityBlock__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4634:1: ( rule__EntityBlock__Group__8__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4635:2: rule__EntityBlock__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__EntityBlock__Group__8__Impl_in_rule__EntityBlock__Group__89289);
            rule__EntityBlock__Group__8__Impl();

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
    // $ANTLR end "rule__EntityBlock__Group__8"


    // $ANTLR start "rule__EntityBlock__Group__8__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4641:1: rule__EntityBlock__Group__8__Impl : ( '}' ) ;
    public final void rule__EntityBlock__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4645:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4646:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4646:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4647:1: '}'
            {
             before(grammarAccess.getEntityBlockAccess().getRightCurlyBracketKeyword_8()); 
            match(input,33,FOLLOW_33_in_rule__EntityBlock__Group__8__Impl9317); 
             after(grammarAccess.getEntityBlockAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__EntityBlock__Group__8__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4678:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4682:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4683:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__09366);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__09369);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4690:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AcessModifierAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4694:1: ( ( ( rule__Attribute__AcessModifierAssignment_0 )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4695:1: ( ( rule__Attribute__AcessModifierAssignment_0 )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4695:1: ( ( rule__Attribute__AcessModifierAssignment_0 )? )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4696:1: ( rule__Attribute__AcessModifierAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getAcessModifierAssignment_0()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4697:1: ( rule__Attribute__AcessModifierAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=27 && LA19_0<=30)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4697:2: rule__Attribute__AcessModifierAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__AcessModifierAssignment_0_in_rule__Attribute__Group__0__Impl9396);
                    rule__Attribute__AcessModifierAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getAcessModifierAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4707:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4711:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4712:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__19427);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__19430);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4719:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4723:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4724:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4724:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4725:1: ( rule__Attribute__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4726:1: ( rule__Attribute__TypeAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4726:2: rule__Attribute__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_1_in_rule__Attribute__Group__1__Impl9457);
            rule__Attribute__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4736:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4740:1: ( rule__Attribute__Group__2__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4741:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__29487);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4747:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4751:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4752:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4752:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4753:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4754:1: ( rule__Attribute__NameAssignment_2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4754:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl9514);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Repository__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4770:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4774:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4775:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
            {
            pushFollow(FOLLOW_rule__Repository__Group__0__Impl_in_rule__Repository__Group__09550);
            rule__Repository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Repository__Group__1_in_rule__Repository__Group__09553);
            rule__Repository__Group__1();

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
    // $ANTLR end "rule__Repository__Group__0"


    // $ANTLR start "rule__Repository__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4782:1: rule__Repository__Group__0__Impl : ( 'repository' ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4786:1: ( ( 'repository' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4787:1: ( 'repository' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4787:1: ( 'repository' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4788:1: 'repository'
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__Repository__Group__0__Impl9581); 
             after(grammarAccess.getRepositoryAccess().getRepositoryKeyword_0()); 

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
    // $ANTLR end "rule__Repository__Group__0__Impl"


    // $ANTLR start "rule__Repository__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4801:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4805:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4806:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
            {
            pushFollow(FOLLOW_rule__Repository__Group__1__Impl_in_rule__Repository__Group__19612);
            rule__Repository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Repository__Group__2_in_rule__Repository__Group__19615);
            rule__Repository__Group__2();

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
    // $ANTLR end "rule__Repository__Group__1"


    // $ANTLR start "rule__Repository__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4813:1: rule__Repository__Group__1__Impl : ( ( rule__Repository__NameAssignment_1 ) ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4817:1: ( ( ( rule__Repository__NameAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4818:1: ( ( rule__Repository__NameAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4818:1: ( ( rule__Repository__NameAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4819:1: ( rule__Repository__NameAssignment_1 )
            {
             before(grammarAccess.getRepositoryAccess().getNameAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4820:1: ( rule__Repository__NameAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4820:2: rule__Repository__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Repository__NameAssignment_1_in_rule__Repository__Group__1__Impl9642);
            rule__Repository__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Repository__Group__1__Impl"


    // $ANTLR start "rule__Repository__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4830:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4834:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4835:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
            {
            pushFollow(FOLLOW_rule__Repository__Group__2__Impl_in_rule__Repository__Group__29672);
            rule__Repository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Repository__Group__3_in_rule__Repository__Group__29675);
            rule__Repository__Group__3();

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
    // $ANTLR end "rule__Repository__Group__2"


    // $ANTLR start "rule__Repository__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4842:1: rule__Repository__Group__2__Impl : ( '{' ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4846:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4847:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4847:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4848:1: '{'
            {
             before(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Repository__Group__2__Impl9703); 
             after(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Repository__Group__2__Impl"


    // $ANTLR start "rule__Repository__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4861:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4865:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4866:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
            {
            pushFollow(FOLLOW_rule__Repository__Group__3__Impl_in_rule__Repository__Group__39734);
            rule__Repository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Repository__Group__4_in_rule__Repository__Group__39737);
            rule__Repository__Group__4();

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
    // $ANTLR end "rule__Repository__Group__3"


    // $ANTLR start "rule__Repository__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4873:1: rule__Repository__Group__3__Impl : ( ( rule__Repository__MethodsAssignment_3 )* ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4877:1: ( ( ( rule__Repository__MethodsAssignment_3 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4878:1: ( ( rule__Repository__MethodsAssignment_3 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4878:1: ( ( rule__Repository__MethodsAssignment_3 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4879:1: ( rule__Repository__MethodsAssignment_3 )*
            {
             before(grammarAccess.getRepositoryAccess().getMethodsAssignment_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4880:1: ( rule__Repository__MethodsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4880:2: rule__Repository__MethodsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Repository__MethodsAssignment_3_in_rule__Repository__Group__3__Impl9764);
            	    rule__Repository__MethodsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRepositoryAccess().getMethodsAssignment_3()); 

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
    // $ANTLR end "rule__Repository__Group__3__Impl"


    // $ANTLR start "rule__Repository__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4890:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4894:1: ( rule__Repository__Group__4__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4895:2: rule__Repository__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Repository__Group__4__Impl_in_rule__Repository__Group__49795);
            rule__Repository__Group__4__Impl();

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
    // $ANTLR end "rule__Repository__Group__4"


    // $ANTLR start "rule__Repository__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4901:1: rule__Repository__Group__4__Impl : ( '}' ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4905:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4906:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4906:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4907:1: '}'
            {
             before(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Repository__Group__4__Impl9823); 
             after(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Repository__Group__4__Impl"


    // $ANTLR start "rule__RepositoryFields__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4930:1: rule__RepositoryFields__Group__0 : rule__RepositoryFields__Group__0__Impl rule__RepositoryFields__Group__1 ;
    public final void rule__RepositoryFields__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4934:1: ( rule__RepositoryFields__Group__0__Impl rule__RepositoryFields__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4935:2: rule__RepositoryFields__Group__0__Impl rule__RepositoryFields__Group__1
            {
            pushFollow(FOLLOW_rule__RepositoryFields__Group__0__Impl_in_rule__RepositoryFields__Group__09864);
            rule__RepositoryFields__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RepositoryFields__Group__1_in_rule__RepositoryFields__Group__09867);
            rule__RepositoryFields__Group__1();

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
    // $ANTLR end "rule__RepositoryFields__Group__0"


    // $ANTLR start "rule__RepositoryFields__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4942:1: rule__RepositoryFields__Group__0__Impl : ( ( rule__RepositoryFields__NameMethodAssignment_0 ) ) ;
    public final void rule__RepositoryFields__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4946:1: ( ( ( rule__RepositoryFields__NameMethodAssignment_0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4947:1: ( ( rule__RepositoryFields__NameMethodAssignment_0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4947:1: ( ( rule__RepositoryFields__NameMethodAssignment_0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4948:1: ( rule__RepositoryFields__NameMethodAssignment_0 )
            {
             before(grammarAccess.getRepositoryFieldsAccess().getNameMethodAssignment_0()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4949:1: ( rule__RepositoryFields__NameMethodAssignment_0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4949:2: rule__RepositoryFields__NameMethodAssignment_0
            {
            pushFollow(FOLLOW_rule__RepositoryFields__NameMethodAssignment_0_in_rule__RepositoryFields__Group__0__Impl9894);
            rule__RepositoryFields__NameMethodAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryFieldsAccess().getNameMethodAssignment_0()); 

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
    // $ANTLR end "rule__RepositoryFields__Group__0__Impl"


    // $ANTLR start "rule__RepositoryFields__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4959:1: rule__RepositoryFields__Group__1 : rule__RepositoryFields__Group__1__Impl rule__RepositoryFields__Group__2 ;
    public final void rule__RepositoryFields__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4963:1: ( rule__RepositoryFields__Group__1__Impl rule__RepositoryFields__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4964:2: rule__RepositoryFields__Group__1__Impl rule__RepositoryFields__Group__2
            {
            pushFollow(FOLLOW_rule__RepositoryFields__Group__1__Impl_in_rule__RepositoryFields__Group__19924);
            rule__RepositoryFields__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RepositoryFields__Group__2_in_rule__RepositoryFields__Group__19927);
            rule__RepositoryFields__Group__2();

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
    // $ANTLR end "rule__RepositoryFields__Group__1"


    // $ANTLR start "rule__RepositoryFields__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4971:1: rule__RepositoryFields__Group__1__Impl : ( '(' ) ;
    public final void rule__RepositoryFields__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4975:1: ( ( '(' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4976:1: ( '(' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4976:1: ( '(' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4977:1: '('
            {
             before(grammarAccess.getRepositoryFieldsAccess().getLeftParenthesisKeyword_1()); 
            match(input,58,FOLLOW_58_in_rule__RepositoryFields__Group__1__Impl9955); 
             after(grammarAccess.getRepositoryFieldsAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__RepositoryFields__Group__1__Impl"


    // $ANTLR start "rule__RepositoryFields__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4990:1: rule__RepositoryFields__Group__2 : rule__RepositoryFields__Group__2__Impl rule__RepositoryFields__Group__3 ;
    public final void rule__RepositoryFields__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4994:1: ( rule__RepositoryFields__Group__2__Impl rule__RepositoryFields__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:4995:2: rule__RepositoryFields__Group__2__Impl rule__RepositoryFields__Group__3
            {
            pushFollow(FOLLOW_rule__RepositoryFields__Group__2__Impl_in_rule__RepositoryFields__Group__29986);
            rule__RepositoryFields__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RepositoryFields__Group__3_in_rule__RepositoryFields__Group__29989);
            rule__RepositoryFields__Group__3();

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
    // $ANTLR end "rule__RepositoryFields__Group__2"


    // $ANTLR start "rule__RepositoryFields__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5002:1: rule__RepositoryFields__Group__2__Impl : ( ( rule__RepositoryFields__MethodsParametersAssignment_2 )? ) ;
    public final void rule__RepositoryFields__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5006:1: ( ( ( rule__RepositoryFields__MethodsParametersAssignment_2 )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5007:1: ( ( rule__RepositoryFields__MethodsParametersAssignment_2 )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5007:1: ( ( rule__RepositoryFields__MethodsParametersAssignment_2 )? )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5008:1: ( rule__RepositoryFields__MethodsParametersAssignment_2 )?
            {
             before(grammarAccess.getRepositoryFieldsAccess().getMethodsParametersAssignment_2()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5009:1: ( rule__RepositoryFields__MethodsParametersAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||(LA21_0>=14 && LA21_0<=26)||LA21_0==61||LA21_0==64) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5009:2: rule__RepositoryFields__MethodsParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RepositoryFields__MethodsParametersAssignment_2_in_rule__RepositoryFields__Group__2__Impl10016);
                    rule__RepositoryFields__MethodsParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRepositoryFieldsAccess().getMethodsParametersAssignment_2()); 

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
    // $ANTLR end "rule__RepositoryFields__Group__2__Impl"


    // $ANTLR start "rule__RepositoryFields__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5019:1: rule__RepositoryFields__Group__3 : rule__RepositoryFields__Group__3__Impl rule__RepositoryFields__Group__4 ;
    public final void rule__RepositoryFields__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5023:1: ( rule__RepositoryFields__Group__3__Impl rule__RepositoryFields__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5024:2: rule__RepositoryFields__Group__3__Impl rule__RepositoryFields__Group__4
            {
            pushFollow(FOLLOW_rule__RepositoryFields__Group__3__Impl_in_rule__RepositoryFields__Group__310047);
            rule__RepositoryFields__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RepositoryFields__Group__4_in_rule__RepositoryFields__Group__310050);
            rule__RepositoryFields__Group__4();

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
    // $ANTLR end "rule__RepositoryFields__Group__3"


    // $ANTLR start "rule__RepositoryFields__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5031:1: rule__RepositoryFields__Group__3__Impl : ( ')' ) ;
    public final void rule__RepositoryFields__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5035:1: ( ( ')' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5036:1: ( ')' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5036:1: ( ')' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5037:1: ')'
            {
             before(grammarAccess.getRepositoryFieldsAccess().getRightParenthesisKeyword_3()); 
            match(input,59,FOLLOW_59_in_rule__RepositoryFields__Group__3__Impl10078); 
             after(grammarAccess.getRepositoryFieldsAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__RepositoryFields__Group__3__Impl"


    // $ANTLR start "rule__RepositoryFields__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5050:1: rule__RepositoryFields__Group__4 : rule__RepositoryFields__Group__4__Impl rule__RepositoryFields__Group__5 ;
    public final void rule__RepositoryFields__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5054:1: ( rule__RepositoryFields__Group__4__Impl rule__RepositoryFields__Group__5 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5055:2: rule__RepositoryFields__Group__4__Impl rule__RepositoryFields__Group__5
            {
            pushFollow(FOLLOW_rule__RepositoryFields__Group__4__Impl_in_rule__RepositoryFields__Group__410109);
            rule__RepositoryFields__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RepositoryFields__Group__5_in_rule__RepositoryFields__Group__410112);
            rule__RepositoryFields__Group__5();

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
    // $ANTLR end "rule__RepositoryFields__Group__4"


    // $ANTLR start "rule__RepositoryFields__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5062:1: rule__RepositoryFields__Group__4__Impl : ( ':' ) ;
    public final void rule__RepositoryFields__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5066:1: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5067:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5067:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5068:1: ':'
            {
             before(grammarAccess.getRepositoryFieldsAccess().getColonKeyword_4()); 
            match(input,11,FOLLOW_11_in_rule__RepositoryFields__Group__4__Impl10140); 
             after(grammarAccess.getRepositoryFieldsAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__RepositoryFields__Group__4__Impl"


    // $ANTLR start "rule__RepositoryFields__Group__5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5081:1: rule__RepositoryFields__Group__5 : rule__RepositoryFields__Group__5__Impl ;
    public final void rule__RepositoryFields__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5085:1: ( rule__RepositoryFields__Group__5__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5086:2: rule__RepositoryFields__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RepositoryFields__Group__5__Impl_in_rule__RepositoryFields__Group__510171);
            rule__RepositoryFields__Group__5__Impl();

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
    // $ANTLR end "rule__RepositoryFields__Group__5"


    // $ANTLR start "rule__RepositoryFields__Group__5__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5092:1: rule__RepositoryFields__Group__5__Impl : ( ( rule__RepositoryFields__ReturnTypeAssignment_5 ) ) ;
    public final void rule__RepositoryFields__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5096:1: ( ( ( rule__RepositoryFields__ReturnTypeAssignment_5 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5097:1: ( ( rule__RepositoryFields__ReturnTypeAssignment_5 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5097:1: ( ( rule__RepositoryFields__ReturnTypeAssignment_5 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5098:1: ( rule__RepositoryFields__ReturnTypeAssignment_5 )
            {
             before(grammarAccess.getRepositoryFieldsAccess().getReturnTypeAssignment_5()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5099:1: ( rule__RepositoryFields__ReturnTypeAssignment_5 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5099:2: rule__RepositoryFields__ReturnTypeAssignment_5
            {
            pushFollow(FOLLOW_rule__RepositoryFields__ReturnTypeAssignment_5_in_rule__RepositoryFields__Group__5__Impl10198);
            rule__RepositoryFields__ReturnTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryFieldsAccess().getReturnTypeAssignment_5()); 

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
    // $ANTLR end "rule__RepositoryFields__Group__5__Impl"


    // $ANTLR start "rule__EnumBlock__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5121:1: rule__EnumBlock__Group__0 : rule__EnumBlock__Group__0__Impl rule__EnumBlock__Group__1 ;
    public final void rule__EnumBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5125:1: ( rule__EnumBlock__Group__0__Impl rule__EnumBlock__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5126:2: rule__EnumBlock__Group__0__Impl rule__EnumBlock__Group__1
            {
            pushFollow(FOLLOW_rule__EnumBlock__Group__0__Impl_in_rule__EnumBlock__Group__010240);
            rule__EnumBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumBlock__Group__1_in_rule__EnumBlock__Group__010243);
            rule__EnumBlock__Group__1();

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
    // $ANTLR end "rule__EnumBlock__Group__0"


    // $ANTLR start "rule__EnumBlock__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5133:1: rule__EnumBlock__Group__0__Impl : ( 'enum' ) ;
    public final void rule__EnumBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5137:1: ( ( 'enum' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5138:1: ( 'enum' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5138:1: ( 'enum' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5139:1: 'enum'
            {
             before(grammarAccess.getEnumBlockAccess().getEnumKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__EnumBlock__Group__0__Impl10271); 
             after(grammarAccess.getEnumBlockAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__EnumBlock__Group__0__Impl"


    // $ANTLR start "rule__EnumBlock__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5152:1: rule__EnumBlock__Group__1 : rule__EnumBlock__Group__1__Impl rule__EnumBlock__Group__2 ;
    public final void rule__EnumBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5156:1: ( rule__EnumBlock__Group__1__Impl rule__EnumBlock__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5157:2: rule__EnumBlock__Group__1__Impl rule__EnumBlock__Group__2
            {
            pushFollow(FOLLOW_rule__EnumBlock__Group__1__Impl_in_rule__EnumBlock__Group__110302);
            rule__EnumBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumBlock__Group__2_in_rule__EnumBlock__Group__110305);
            rule__EnumBlock__Group__2();

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
    // $ANTLR end "rule__EnumBlock__Group__1"


    // $ANTLR start "rule__EnumBlock__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5164:1: rule__EnumBlock__Group__1__Impl : ( ( rule__EnumBlock__NameAssignment_1 ) ) ;
    public final void rule__EnumBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5168:1: ( ( ( rule__EnumBlock__NameAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5169:1: ( ( rule__EnumBlock__NameAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5169:1: ( ( rule__EnumBlock__NameAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5170:1: ( rule__EnumBlock__NameAssignment_1 )
            {
             before(grammarAccess.getEnumBlockAccess().getNameAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5171:1: ( rule__EnumBlock__NameAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5171:2: rule__EnumBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumBlock__NameAssignment_1_in_rule__EnumBlock__Group__1__Impl10332);
            rule__EnumBlock__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumBlockAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EnumBlock__Group__1__Impl"


    // $ANTLR start "rule__EnumBlock__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5181:1: rule__EnumBlock__Group__2 : rule__EnumBlock__Group__2__Impl rule__EnumBlock__Group__3 ;
    public final void rule__EnumBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5185:1: ( rule__EnumBlock__Group__2__Impl rule__EnumBlock__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5186:2: rule__EnumBlock__Group__2__Impl rule__EnumBlock__Group__3
            {
            pushFollow(FOLLOW_rule__EnumBlock__Group__2__Impl_in_rule__EnumBlock__Group__210362);
            rule__EnumBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumBlock__Group__3_in_rule__EnumBlock__Group__210365);
            rule__EnumBlock__Group__3();

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
    // $ANTLR end "rule__EnumBlock__Group__2"


    // $ANTLR start "rule__EnumBlock__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5193:1: rule__EnumBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5197:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5198:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5198:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5199:1: '{'
            {
             before(grammarAccess.getEnumBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__EnumBlock__Group__2__Impl10393); 
             after(grammarAccess.getEnumBlockAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__EnumBlock__Group__2__Impl"


    // $ANTLR start "rule__EnumBlock__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5212:1: rule__EnumBlock__Group__3 : rule__EnumBlock__Group__3__Impl rule__EnumBlock__Group__4 ;
    public final void rule__EnumBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5216:1: ( rule__EnumBlock__Group__3__Impl rule__EnumBlock__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5217:2: rule__EnumBlock__Group__3__Impl rule__EnumBlock__Group__4
            {
            pushFollow(FOLLOW_rule__EnumBlock__Group__3__Impl_in_rule__EnumBlock__Group__310424);
            rule__EnumBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumBlock__Group__4_in_rule__EnumBlock__Group__310427);
            rule__EnumBlock__Group__4();

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
    // $ANTLR end "rule__EnumBlock__Group__3"


    // $ANTLR start "rule__EnumBlock__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5224:1: rule__EnumBlock__Group__3__Impl : ( ( rule__EnumBlock__ValuesAssignment_3 ) ) ;
    public final void rule__EnumBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5228:1: ( ( ( rule__EnumBlock__ValuesAssignment_3 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5229:1: ( ( rule__EnumBlock__ValuesAssignment_3 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5229:1: ( ( rule__EnumBlock__ValuesAssignment_3 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5230:1: ( rule__EnumBlock__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumBlockAccess().getValuesAssignment_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5231:1: ( rule__EnumBlock__ValuesAssignment_3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5231:2: rule__EnumBlock__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumBlock__ValuesAssignment_3_in_rule__EnumBlock__Group__3__Impl10454);
            rule__EnumBlock__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumBlockAccess().getValuesAssignment_3()); 

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
    // $ANTLR end "rule__EnumBlock__Group__3__Impl"


    // $ANTLR start "rule__EnumBlock__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5241:1: rule__EnumBlock__Group__4 : rule__EnumBlock__Group__4__Impl rule__EnumBlock__Group__5 ;
    public final void rule__EnumBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5245:1: ( rule__EnumBlock__Group__4__Impl rule__EnumBlock__Group__5 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5246:2: rule__EnumBlock__Group__4__Impl rule__EnumBlock__Group__5
            {
            pushFollow(FOLLOW_rule__EnumBlock__Group__4__Impl_in_rule__EnumBlock__Group__410484);
            rule__EnumBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumBlock__Group__5_in_rule__EnumBlock__Group__410487);
            rule__EnumBlock__Group__5();

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
    // $ANTLR end "rule__EnumBlock__Group__4"


    // $ANTLR start "rule__EnumBlock__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5253:1: rule__EnumBlock__Group__4__Impl : ( ( rule__EnumBlock__Group_4__0 )* ) ;
    public final void rule__EnumBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5257:1: ( ( ( rule__EnumBlock__Group_4__0 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5258:1: ( ( rule__EnumBlock__Group_4__0 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5258:1: ( ( rule__EnumBlock__Group_4__0 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5259:1: ( rule__EnumBlock__Group_4__0 )*
            {
             before(grammarAccess.getEnumBlockAccess().getGroup_4()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5260:1: ( rule__EnumBlock__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==45) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5260:2: rule__EnumBlock__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumBlock__Group_4__0_in_rule__EnumBlock__Group__4__Impl10514);
            	    rule__EnumBlock__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEnumBlockAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EnumBlock__Group__4__Impl"


    // $ANTLR start "rule__EnumBlock__Group__5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5270:1: rule__EnumBlock__Group__5 : rule__EnumBlock__Group__5__Impl ;
    public final void rule__EnumBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5274:1: ( rule__EnumBlock__Group__5__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5275:2: rule__EnumBlock__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumBlock__Group__5__Impl_in_rule__EnumBlock__Group__510545);
            rule__EnumBlock__Group__5__Impl();

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
    // $ANTLR end "rule__EnumBlock__Group__5"


    // $ANTLR start "rule__EnumBlock__Group__5__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5281:1: rule__EnumBlock__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5285:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5286:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5286:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5287:1: '}'
            {
             before(grammarAccess.getEnumBlockAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__EnumBlock__Group__5__Impl10573); 
             after(grammarAccess.getEnumBlockAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__EnumBlock__Group__5__Impl"


    // $ANTLR start "rule__EnumBlock__Group_4__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5312:1: rule__EnumBlock__Group_4__0 : rule__EnumBlock__Group_4__0__Impl rule__EnumBlock__Group_4__1 ;
    public final void rule__EnumBlock__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5316:1: ( rule__EnumBlock__Group_4__0__Impl rule__EnumBlock__Group_4__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5317:2: rule__EnumBlock__Group_4__0__Impl rule__EnumBlock__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumBlock__Group_4__0__Impl_in_rule__EnumBlock__Group_4__010616);
            rule__EnumBlock__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumBlock__Group_4__1_in_rule__EnumBlock__Group_4__010619);
            rule__EnumBlock__Group_4__1();

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
    // $ANTLR end "rule__EnumBlock__Group_4__0"


    // $ANTLR start "rule__EnumBlock__Group_4__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5324:1: rule__EnumBlock__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumBlock__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5328:1: ( ( ',' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5329:1: ( ',' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5329:1: ( ',' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5330:1: ','
            {
             before(grammarAccess.getEnumBlockAccess().getCommaKeyword_4_0()); 
            match(input,45,FOLLOW_45_in_rule__EnumBlock__Group_4__0__Impl10647); 
             after(grammarAccess.getEnumBlockAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__EnumBlock__Group_4__0__Impl"


    // $ANTLR start "rule__EnumBlock__Group_4__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5343:1: rule__EnumBlock__Group_4__1 : rule__EnumBlock__Group_4__1__Impl ;
    public final void rule__EnumBlock__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5347:1: ( rule__EnumBlock__Group_4__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5348:2: rule__EnumBlock__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumBlock__Group_4__1__Impl_in_rule__EnumBlock__Group_4__110678);
            rule__EnumBlock__Group_4__1__Impl();

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
    // $ANTLR end "rule__EnumBlock__Group_4__1"


    // $ANTLR start "rule__EnumBlock__Group_4__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5354:1: rule__EnumBlock__Group_4__1__Impl : ( ( rule__EnumBlock__ValuesAssignment_4_1 ) ) ;
    public final void rule__EnumBlock__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5358:1: ( ( ( rule__EnumBlock__ValuesAssignment_4_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5359:1: ( ( rule__EnumBlock__ValuesAssignment_4_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5359:1: ( ( rule__EnumBlock__ValuesAssignment_4_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5360:1: ( rule__EnumBlock__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumBlockAccess().getValuesAssignment_4_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5361:1: ( rule__EnumBlock__ValuesAssignment_4_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5361:2: rule__EnumBlock__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__EnumBlock__ValuesAssignment_4_1_in_rule__EnumBlock__Group_4__1__Impl10705);
            rule__EnumBlock__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumBlockAccess().getValuesAssignment_4_1()); 

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
    // $ANTLR end "rule__EnumBlock__Group_4__1__Impl"


    // $ANTLR start "rule__MethodParameter__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5375:1: rule__MethodParameter__Group__0 : rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1 ;
    public final void rule__MethodParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5379:1: ( rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5380:2: rule__MethodParameter__Group__0__Impl rule__MethodParameter__Group__1
            {
            pushFollow(FOLLOW_rule__MethodParameter__Group__0__Impl_in_rule__MethodParameter__Group__010739);
            rule__MethodParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodParameter__Group__1_in_rule__MethodParameter__Group__010742);
            rule__MethodParameter__Group__1();

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
    // $ANTLR end "rule__MethodParameter__Group__0"


    // $ANTLR start "rule__MethodParameter__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5387:1: rule__MethodParameter__Group__0__Impl : ( ( rule__MethodParameter__TypeAndAttrAssignment_0 ) ) ;
    public final void rule__MethodParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5391:1: ( ( ( rule__MethodParameter__TypeAndAttrAssignment_0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5392:1: ( ( rule__MethodParameter__TypeAndAttrAssignment_0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5392:1: ( ( rule__MethodParameter__TypeAndAttrAssignment_0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5393:1: ( rule__MethodParameter__TypeAndAttrAssignment_0 )
            {
             before(grammarAccess.getMethodParameterAccess().getTypeAndAttrAssignment_0()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5394:1: ( rule__MethodParameter__TypeAndAttrAssignment_0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5394:2: rule__MethodParameter__TypeAndAttrAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodParameter__TypeAndAttrAssignment_0_in_rule__MethodParameter__Group__0__Impl10769);
            rule__MethodParameter__TypeAndAttrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodParameterAccess().getTypeAndAttrAssignment_0()); 

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
    // $ANTLR end "rule__MethodParameter__Group__0__Impl"


    // $ANTLR start "rule__MethodParameter__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5404:1: rule__MethodParameter__Group__1 : rule__MethodParameter__Group__1__Impl ;
    public final void rule__MethodParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5408:1: ( rule__MethodParameter__Group__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5409:2: rule__MethodParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodParameter__Group__1__Impl_in_rule__MethodParameter__Group__110799);
            rule__MethodParameter__Group__1__Impl();

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
    // $ANTLR end "rule__MethodParameter__Group__1"


    // $ANTLR start "rule__MethodParameter__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5415:1: rule__MethodParameter__Group__1__Impl : ( ( rule__MethodParameter__Group_1__0 )* ) ;
    public final void rule__MethodParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5419:1: ( ( ( rule__MethodParameter__Group_1__0 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5420:1: ( ( rule__MethodParameter__Group_1__0 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5420:1: ( ( rule__MethodParameter__Group_1__0 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5421:1: ( rule__MethodParameter__Group_1__0 )*
            {
             before(grammarAccess.getMethodParameterAccess().getGroup_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5422:1: ( rule__MethodParameter__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==45) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5422:2: rule__MethodParameter__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MethodParameter__Group_1__0_in_rule__MethodParameter__Group__1__Impl10826);
            	    rule__MethodParameter__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMethodParameterAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MethodParameter__Group__1__Impl"


    // $ANTLR start "rule__MethodParameter__Group_1__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5436:1: rule__MethodParameter__Group_1__0 : rule__MethodParameter__Group_1__0__Impl rule__MethodParameter__Group_1__1 ;
    public final void rule__MethodParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5440:1: ( rule__MethodParameter__Group_1__0__Impl rule__MethodParameter__Group_1__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5441:2: rule__MethodParameter__Group_1__0__Impl rule__MethodParameter__Group_1__1
            {
            pushFollow(FOLLOW_rule__MethodParameter__Group_1__0__Impl_in_rule__MethodParameter__Group_1__010861);
            rule__MethodParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodParameter__Group_1__1_in_rule__MethodParameter__Group_1__010864);
            rule__MethodParameter__Group_1__1();

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
    // $ANTLR end "rule__MethodParameter__Group_1__0"


    // $ANTLR start "rule__MethodParameter__Group_1__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5448:1: rule__MethodParameter__Group_1__0__Impl : ( ',' ) ;
    public final void rule__MethodParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5452:1: ( ( ',' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5453:1: ( ',' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5453:1: ( ',' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5454:1: ','
            {
             before(grammarAccess.getMethodParameterAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__MethodParameter__Group_1__0__Impl10892); 
             after(grammarAccess.getMethodParameterAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__MethodParameter__Group_1__0__Impl"


    // $ANTLR start "rule__MethodParameter__Group_1__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5467:1: rule__MethodParameter__Group_1__1 : rule__MethodParameter__Group_1__1__Impl ;
    public final void rule__MethodParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5471:1: ( rule__MethodParameter__Group_1__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5472:2: rule__MethodParameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodParameter__Group_1__1__Impl_in_rule__MethodParameter__Group_1__110923);
            rule__MethodParameter__Group_1__1__Impl();

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
    // $ANTLR end "rule__MethodParameter__Group_1__1"


    // $ANTLR start "rule__MethodParameter__Group_1__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5478:1: rule__MethodParameter__Group_1__1__Impl : ( ( rule__MethodParameter__TypeAndAttrAssignment_1_1 ) ) ;
    public final void rule__MethodParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5482:1: ( ( ( rule__MethodParameter__TypeAndAttrAssignment_1_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5483:1: ( ( rule__MethodParameter__TypeAndAttrAssignment_1_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5483:1: ( ( rule__MethodParameter__TypeAndAttrAssignment_1_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5484:1: ( rule__MethodParameter__TypeAndAttrAssignment_1_1 )
            {
             before(grammarAccess.getMethodParameterAccess().getTypeAndAttrAssignment_1_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5485:1: ( rule__MethodParameter__TypeAndAttrAssignment_1_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5485:2: rule__MethodParameter__TypeAndAttrAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MethodParameter__TypeAndAttrAssignment_1_1_in_rule__MethodParameter__Group_1__1__Impl10950);
            rule__MethodParameter__TypeAndAttrAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodParameterAccess().getTypeAndAttrAssignment_1_1()); 

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
    // $ANTLR end "rule__MethodParameter__Group_1__1__Impl"


    // $ANTLR start "rule__TypeAndAttribute__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5499:1: rule__TypeAndAttribute__Group__0 : rule__TypeAndAttribute__Group__0__Impl rule__TypeAndAttribute__Group__1 ;
    public final void rule__TypeAndAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5503:1: ( rule__TypeAndAttribute__Group__0__Impl rule__TypeAndAttribute__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5504:2: rule__TypeAndAttribute__Group__0__Impl rule__TypeAndAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__TypeAndAttribute__Group__0__Impl_in_rule__TypeAndAttribute__Group__010984);
            rule__TypeAndAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeAndAttribute__Group__1_in_rule__TypeAndAttribute__Group__010987);
            rule__TypeAndAttribute__Group__1();

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
    // $ANTLR end "rule__TypeAndAttribute__Group__0"


    // $ANTLR start "rule__TypeAndAttribute__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5511:1: rule__TypeAndAttribute__Group__0__Impl : ( ( rule__TypeAndAttribute__TypeAssignment_0 ) ) ;
    public final void rule__TypeAndAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5515:1: ( ( ( rule__TypeAndAttribute__TypeAssignment_0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5516:1: ( ( rule__TypeAndAttribute__TypeAssignment_0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5516:1: ( ( rule__TypeAndAttribute__TypeAssignment_0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5517:1: ( rule__TypeAndAttribute__TypeAssignment_0 )
            {
             before(grammarAccess.getTypeAndAttributeAccess().getTypeAssignment_0()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5518:1: ( rule__TypeAndAttribute__TypeAssignment_0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5518:2: rule__TypeAndAttribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__TypeAndAttribute__TypeAssignment_0_in_rule__TypeAndAttribute__Group__0__Impl11014);
            rule__TypeAndAttribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAndAttributeAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__TypeAndAttribute__Group__0__Impl"


    // $ANTLR start "rule__TypeAndAttribute__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5528:1: rule__TypeAndAttribute__Group__1 : rule__TypeAndAttribute__Group__1__Impl ;
    public final void rule__TypeAndAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5532:1: ( rule__TypeAndAttribute__Group__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5533:2: rule__TypeAndAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeAndAttribute__Group__1__Impl_in_rule__TypeAndAttribute__Group__111044);
            rule__TypeAndAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__TypeAndAttribute__Group__1"


    // $ANTLR start "rule__TypeAndAttribute__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5539:1: rule__TypeAndAttribute__Group__1__Impl : ( ( rule__TypeAndAttribute__NameAssignment_1 ) ) ;
    public final void rule__TypeAndAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5543:1: ( ( ( rule__TypeAndAttribute__NameAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5544:1: ( ( rule__TypeAndAttribute__NameAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5544:1: ( ( rule__TypeAndAttribute__NameAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5545:1: ( rule__TypeAndAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAndAttributeAccess().getNameAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5546:1: ( rule__TypeAndAttribute__NameAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5546:2: rule__TypeAndAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypeAndAttribute__NameAssignment_1_in_rule__TypeAndAttribute__Group__1__Impl11071);
            rule__TypeAndAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAndAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TypeAndAttribute__Group__1__Impl"


    // $ANTLR start "rule__ExtendBlock__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5560:1: rule__ExtendBlock__Group__0 : rule__ExtendBlock__Group__0__Impl rule__ExtendBlock__Group__1 ;
    public final void rule__ExtendBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5564:1: ( rule__ExtendBlock__Group__0__Impl rule__ExtendBlock__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5565:2: rule__ExtendBlock__Group__0__Impl rule__ExtendBlock__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendBlock__Group__0__Impl_in_rule__ExtendBlock__Group__011105);
            rule__ExtendBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExtendBlock__Group__1_in_rule__ExtendBlock__Group__011108);
            rule__ExtendBlock__Group__1();

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
    // $ANTLR end "rule__ExtendBlock__Group__0"


    // $ANTLR start "rule__ExtendBlock__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5572:1: rule__ExtendBlock__Group__0__Impl : ( ruleExtend ) ;
    public final void rule__ExtendBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5576:1: ( ( ruleExtend ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5577:1: ( ruleExtend )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5577:1: ( ruleExtend )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5578:1: ruleExtend
            {
             before(grammarAccess.getExtendBlockAccess().getExtendParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleExtend_in_rule__ExtendBlock__Group__0__Impl11135);
            ruleExtend();

            state._fsp--;

             after(grammarAccess.getExtendBlockAccess().getExtendParserRuleCall_0()); 

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
    // $ANTLR end "rule__ExtendBlock__Group__0__Impl"


    // $ANTLR start "rule__ExtendBlock__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5589:1: rule__ExtendBlock__Group__1 : rule__ExtendBlock__Group__1__Impl rule__ExtendBlock__Group__2 ;
    public final void rule__ExtendBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5593:1: ( rule__ExtendBlock__Group__1__Impl rule__ExtendBlock__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5594:2: rule__ExtendBlock__Group__1__Impl rule__ExtendBlock__Group__2
            {
            pushFollow(FOLLOW_rule__ExtendBlock__Group__1__Impl_in_rule__ExtendBlock__Group__111164);
            rule__ExtendBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExtendBlock__Group__2_in_rule__ExtendBlock__Group__111167);
            rule__ExtendBlock__Group__2();

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
    // $ANTLR end "rule__ExtendBlock__Group__1"


    // $ANTLR start "rule__ExtendBlock__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5601:1: rule__ExtendBlock__Group__1__Impl : ( ( rule__ExtendBlock__ValuesAssignment_1 ) ) ;
    public final void rule__ExtendBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5605:1: ( ( ( rule__ExtendBlock__ValuesAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5606:1: ( ( rule__ExtendBlock__ValuesAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5606:1: ( ( rule__ExtendBlock__ValuesAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5607:1: ( rule__ExtendBlock__ValuesAssignment_1 )
            {
             before(grammarAccess.getExtendBlockAccess().getValuesAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5608:1: ( rule__ExtendBlock__ValuesAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5608:2: rule__ExtendBlock__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__ExtendBlock__ValuesAssignment_1_in_rule__ExtendBlock__Group__1__Impl11194);
            rule__ExtendBlock__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendBlockAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__ExtendBlock__Group__1__Impl"


    // $ANTLR start "rule__ExtendBlock__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5618:1: rule__ExtendBlock__Group__2 : rule__ExtendBlock__Group__2__Impl ;
    public final void rule__ExtendBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5622:1: ( rule__ExtendBlock__Group__2__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5623:2: rule__ExtendBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExtendBlock__Group__2__Impl_in_rule__ExtendBlock__Group__211224);
            rule__ExtendBlock__Group__2__Impl();

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
    // $ANTLR end "rule__ExtendBlock__Group__2"


    // $ANTLR start "rule__ExtendBlock__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5629:1: rule__ExtendBlock__Group__2__Impl : ( ( rule__ExtendBlock__Group_2__0 )? ) ;
    public final void rule__ExtendBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5633:1: ( ( ( rule__ExtendBlock__Group_2__0 )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5634:1: ( ( rule__ExtendBlock__Group_2__0 )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5634:1: ( ( rule__ExtendBlock__Group_2__0 )? )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5635:1: ( rule__ExtendBlock__Group_2__0 )?
            {
             before(grammarAccess.getExtendBlockAccess().getGroup_2()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5636:1: ( rule__ExtendBlock__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5636:2: rule__ExtendBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExtendBlock__Group_2__0_in_rule__ExtendBlock__Group__2__Impl11251);
                    rule__ExtendBlock__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendBlockAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ExtendBlock__Group__2__Impl"


    // $ANTLR start "rule__ExtendBlock__Group_2__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5652:1: rule__ExtendBlock__Group_2__0 : rule__ExtendBlock__Group_2__0__Impl rule__ExtendBlock__Group_2__1 ;
    public final void rule__ExtendBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5656:1: ( rule__ExtendBlock__Group_2__0__Impl rule__ExtendBlock__Group_2__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5657:2: rule__ExtendBlock__Group_2__0__Impl rule__ExtendBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExtendBlock__Group_2__0__Impl_in_rule__ExtendBlock__Group_2__011288);
            rule__ExtendBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExtendBlock__Group_2__1_in_rule__ExtendBlock__Group_2__011291);
            rule__ExtendBlock__Group_2__1();

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
    // $ANTLR end "rule__ExtendBlock__Group_2__0"


    // $ANTLR start "rule__ExtendBlock__Group_2__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5664:1: rule__ExtendBlock__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ExtendBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5668:1: ( ( ',' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5669:1: ( ',' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5669:1: ( ',' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5670:1: ','
            {
             before(grammarAccess.getExtendBlockAccess().getCommaKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__ExtendBlock__Group_2__0__Impl11319); 
             after(grammarAccess.getExtendBlockAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__ExtendBlock__Group_2__0__Impl"


    // $ANTLR start "rule__ExtendBlock__Group_2__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5683:1: rule__ExtendBlock__Group_2__1 : rule__ExtendBlock__Group_2__1__Impl ;
    public final void rule__ExtendBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5687:1: ( rule__ExtendBlock__Group_2__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5688:2: rule__ExtendBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendBlock__Group_2__1__Impl_in_rule__ExtendBlock__Group_2__111350);
            rule__ExtendBlock__Group_2__1__Impl();

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
    // $ANTLR end "rule__ExtendBlock__Group_2__1"


    // $ANTLR start "rule__ExtendBlock__Group_2__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5694:1: rule__ExtendBlock__Group_2__1__Impl : ( ( rule__ExtendBlock__ValuesAssignment_2_1 ) ) ;
    public final void rule__ExtendBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5698:1: ( ( ( rule__ExtendBlock__ValuesAssignment_2_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5699:1: ( ( rule__ExtendBlock__ValuesAssignment_2_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5699:1: ( ( rule__ExtendBlock__ValuesAssignment_2_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5700:1: ( rule__ExtendBlock__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getExtendBlockAccess().getValuesAssignment_2_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5701:1: ( rule__ExtendBlock__ValuesAssignment_2_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5701:2: rule__ExtendBlock__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExtendBlock__ValuesAssignment_2_1_in_rule__ExtendBlock__Group_2__1__Impl11377);
            rule__ExtendBlock__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendBlockAccess().getValuesAssignment_2_1()); 

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
    // $ANTLR end "rule__ExtendBlock__Group_2__1__Impl"


    // $ANTLR start "rule__DataTypeList__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5715:1: rule__DataTypeList__Group__0 : rule__DataTypeList__Group__0__Impl rule__DataTypeList__Group__1 ;
    public final void rule__DataTypeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5719:1: ( rule__DataTypeList__Group__0__Impl rule__DataTypeList__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5720:2: rule__DataTypeList__Group__0__Impl rule__DataTypeList__Group__1
            {
            pushFollow(FOLLOW_rule__DataTypeList__Group__0__Impl_in_rule__DataTypeList__Group__011411);
            rule__DataTypeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeList__Group__1_in_rule__DataTypeList__Group__011414);
            rule__DataTypeList__Group__1();

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
    // $ANTLR end "rule__DataTypeList__Group__0"


    // $ANTLR start "rule__DataTypeList__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5727:1: rule__DataTypeList__Group__0__Impl : ( 'List' ) ;
    public final void rule__DataTypeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5731:1: ( ( 'List' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5732:1: ( 'List' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5732:1: ( 'List' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5733:1: 'List'
            {
             before(grammarAccess.getDataTypeListAccess().getListKeyword_0()); 
            match(input,61,FOLLOW_61_in_rule__DataTypeList__Group__0__Impl11442); 
             after(grammarAccess.getDataTypeListAccess().getListKeyword_0()); 

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
    // $ANTLR end "rule__DataTypeList__Group__0__Impl"


    // $ANTLR start "rule__DataTypeList__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5746:1: rule__DataTypeList__Group__1 : rule__DataTypeList__Group__1__Impl rule__DataTypeList__Group__2 ;
    public final void rule__DataTypeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5750:1: ( rule__DataTypeList__Group__1__Impl rule__DataTypeList__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5751:2: rule__DataTypeList__Group__1__Impl rule__DataTypeList__Group__2
            {
            pushFollow(FOLLOW_rule__DataTypeList__Group__1__Impl_in_rule__DataTypeList__Group__111473);
            rule__DataTypeList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeList__Group__2_in_rule__DataTypeList__Group__111476);
            rule__DataTypeList__Group__2();

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
    // $ANTLR end "rule__DataTypeList__Group__1"


    // $ANTLR start "rule__DataTypeList__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5758:1: rule__DataTypeList__Group__1__Impl : ( '<' ) ;
    public final void rule__DataTypeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5762:1: ( ( '<' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5763:1: ( '<' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5763:1: ( '<' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5764:1: '<'
            {
             before(grammarAccess.getDataTypeListAccess().getLessThanSignKeyword_1()); 
            match(input,62,FOLLOW_62_in_rule__DataTypeList__Group__1__Impl11504); 
             after(grammarAccess.getDataTypeListAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__DataTypeList__Group__1__Impl"


    // $ANTLR start "rule__DataTypeList__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5777:1: rule__DataTypeList__Group__2 : rule__DataTypeList__Group__2__Impl rule__DataTypeList__Group__3 ;
    public final void rule__DataTypeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5781:1: ( rule__DataTypeList__Group__2__Impl rule__DataTypeList__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5782:2: rule__DataTypeList__Group__2__Impl rule__DataTypeList__Group__3
            {
            pushFollow(FOLLOW_rule__DataTypeList__Group__2__Impl_in_rule__DataTypeList__Group__211535);
            rule__DataTypeList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeList__Group__3_in_rule__DataTypeList__Group__211538);
            rule__DataTypeList__Group__3();

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
    // $ANTLR end "rule__DataTypeList__Group__2"


    // $ANTLR start "rule__DataTypeList__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5789:1: rule__DataTypeList__Group__2__Impl : ( ruleDataType ) ;
    public final void rule__DataTypeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5793:1: ( ( ruleDataType ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5794:1: ( ruleDataType )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5794:1: ( ruleDataType )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5795:1: ruleDataType
            {
             before(grammarAccess.getDataTypeListAccess().getDataTypeParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__DataTypeList__Group__2__Impl11565);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeListAccess().getDataTypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__DataTypeList__Group__2__Impl"


    // $ANTLR start "rule__DataTypeList__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5806:1: rule__DataTypeList__Group__3 : rule__DataTypeList__Group__3__Impl ;
    public final void rule__DataTypeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5810:1: ( rule__DataTypeList__Group__3__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5811:2: rule__DataTypeList__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DataTypeList__Group__3__Impl_in_rule__DataTypeList__Group__311594);
            rule__DataTypeList__Group__3__Impl();

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
    // $ANTLR end "rule__DataTypeList__Group__3"


    // $ANTLR start "rule__DataTypeList__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5817:1: rule__DataTypeList__Group__3__Impl : ( '>' ) ;
    public final void rule__DataTypeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5821:1: ( ( '>' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5822:1: ( '>' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5822:1: ( '>' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5823:1: '>'
            {
             before(grammarAccess.getDataTypeListAccess().getGreaterThanSignKeyword_3()); 
            match(input,63,FOLLOW_63_in_rule__DataTypeList__Group__3__Impl11622); 
             after(grammarAccess.getDataTypeListAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__DataTypeList__Group__3__Impl"


    // $ANTLR start "rule__DataTypeSet__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5844:1: rule__DataTypeSet__Group__0 : rule__DataTypeSet__Group__0__Impl rule__DataTypeSet__Group__1 ;
    public final void rule__DataTypeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5848:1: ( rule__DataTypeSet__Group__0__Impl rule__DataTypeSet__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5849:2: rule__DataTypeSet__Group__0__Impl rule__DataTypeSet__Group__1
            {
            pushFollow(FOLLOW_rule__DataTypeSet__Group__0__Impl_in_rule__DataTypeSet__Group__011661);
            rule__DataTypeSet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeSet__Group__1_in_rule__DataTypeSet__Group__011664);
            rule__DataTypeSet__Group__1();

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
    // $ANTLR end "rule__DataTypeSet__Group__0"


    // $ANTLR start "rule__DataTypeSet__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5856:1: rule__DataTypeSet__Group__0__Impl : ( 'Set' ) ;
    public final void rule__DataTypeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5860:1: ( ( 'Set' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5861:1: ( 'Set' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5861:1: ( 'Set' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5862:1: 'Set'
            {
             before(grammarAccess.getDataTypeSetAccess().getSetKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__DataTypeSet__Group__0__Impl11692); 
             after(grammarAccess.getDataTypeSetAccess().getSetKeyword_0()); 

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
    // $ANTLR end "rule__DataTypeSet__Group__0__Impl"


    // $ANTLR start "rule__DataTypeSet__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5875:1: rule__DataTypeSet__Group__1 : rule__DataTypeSet__Group__1__Impl rule__DataTypeSet__Group__2 ;
    public final void rule__DataTypeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5879:1: ( rule__DataTypeSet__Group__1__Impl rule__DataTypeSet__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5880:2: rule__DataTypeSet__Group__1__Impl rule__DataTypeSet__Group__2
            {
            pushFollow(FOLLOW_rule__DataTypeSet__Group__1__Impl_in_rule__DataTypeSet__Group__111723);
            rule__DataTypeSet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeSet__Group__2_in_rule__DataTypeSet__Group__111726);
            rule__DataTypeSet__Group__2();

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
    // $ANTLR end "rule__DataTypeSet__Group__1"


    // $ANTLR start "rule__DataTypeSet__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5887:1: rule__DataTypeSet__Group__1__Impl : ( '<' ) ;
    public final void rule__DataTypeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5891:1: ( ( '<' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5892:1: ( '<' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5892:1: ( '<' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5893:1: '<'
            {
             before(grammarAccess.getDataTypeSetAccess().getLessThanSignKeyword_1()); 
            match(input,62,FOLLOW_62_in_rule__DataTypeSet__Group__1__Impl11754); 
             after(grammarAccess.getDataTypeSetAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__DataTypeSet__Group__1__Impl"


    // $ANTLR start "rule__DataTypeSet__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5906:1: rule__DataTypeSet__Group__2 : rule__DataTypeSet__Group__2__Impl rule__DataTypeSet__Group__3 ;
    public final void rule__DataTypeSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5910:1: ( rule__DataTypeSet__Group__2__Impl rule__DataTypeSet__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5911:2: rule__DataTypeSet__Group__2__Impl rule__DataTypeSet__Group__3
            {
            pushFollow(FOLLOW_rule__DataTypeSet__Group__2__Impl_in_rule__DataTypeSet__Group__211785);
            rule__DataTypeSet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataTypeSet__Group__3_in_rule__DataTypeSet__Group__211788);
            rule__DataTypeSet__Group__3();

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
    // $ANTLR end "rule__DataTypeSet__Group__2"


    // $ANTLR start "rule__DataTypeSet__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5918:1: rule__DataTypeSet__Group__2__Impl : ( ruleDataType ) ;
    public final void rule__DataTypeSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5922:1: ( ( ruleDataType ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5923:1: ( ruleDataType )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5923:1: ( ruleDataType )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5924:1: ruleDataType
            {
             before(grammarAccess.getDataTypeSetAccess().getDataTypeParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__DataTypeSet__Group__2__Impl11815);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeSetAccess().getDataTypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__DataTypeSet__Group__2__Impl"


    // $ANTLR start "rule__DataTypeSet__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5935:1: rule__DataTypeSet__Group__3 : rule__DataTypeSet__Group__3__Impl ;
    public final void rule__DataTypeSet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5939:1: ( rule__DataTypeSet__Group__3__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5940:2: rule__DataTypeSet__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DataTypeSet__Group__3__Impl_in_rule__DataTypeSet__Group__311844);
            rule__DataTypeSet__Group__3__Impl();

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
    // $ANTLR end "rule__DataTypeSet__Group__3"


    // $ANTLR start "rule__DataTypeSet__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5946:1: rule__DataTypeSet__Group__3__Impl : ( '>' ) ;
    public final void rule__DataTypeSet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5950:1: ( ( '>' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5951:1: ( '>' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5951:1: ( '>' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5952:1: '>'
            {
             before(grammarAccess.getDataTypeSetAccess().getGreaterThanSignKeyword_3()); 
            match(input,63,FOLLOW_63_in_rule__DataTypeSet__Group__3__Impl11872); 
             after(grammarAccess.getDataTypeSetAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__DataTypeSet__Group__3__Impl"


    // $ANTLR start "rule__ImportCompoundName__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5973:1: rule__ImportCompoundName__Group__0 : rule__ImportCompoundName__Group__0__Impl rule__ImportCompoundName__Group__1 ;
    public final void rule__ImportCompoundName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5977:1: ( rule__ImportCompoundName__Group__0__Impl rule__ImportCompoundName__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5978:2: rule__ImportCompoundName__Group__0__Impl rule__ImportCompoundName__Group__1
            {
            pushFollow(FOLLOW_rule__ImportCompoundName__Group__0__Impl_in_rule__ImportCompoundName__Group__011911);
            rule__ImportCompoundName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportCompoundName__Group__1_in_rule__ImportCompoundName__Group__011914);
            rule__ImportCompoundName__Group__1();

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
    // $ANTLR end "rule__ImportCompoundName__Group__0"


    // $ANTLR start "rule__ImportCompoundName__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5985:1: rule__ImportCompoundName__Group__0__Impl : ( ruleCompoundName ) ;
    public final void rule__ImportCompoundName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5989:1: ( ( ruleCompoundName ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5990:1: ( ruleCompoundName )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5990:1: ( ruleCompoundName )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:5991:1: ruleCompoundName
            {
             before(grammarAccess.getImportCompoundNameAccess().getCompoundNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCompoundName_in_rule__ImportCompoundName__Group__0__Impl11941);
            ruleCompoundName();

            state._fsp--;

             after(grammarAccess.getImportCompoundNameAccess().getCompoundNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__ImportCompoundName__Group__0__Impl"


    // $ANTLR start "rule__ImportCompoundName__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6002:1: rule__ImportCompoundName__Group__1 : rule__ImportCompoundName__Group__1__Impl ;
    public final void rule__ImportCompoundName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6006:1: ( rule__ImportCompoundName__Group__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6007:2: rule__ImportCompoundName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportCompoundName__Group__1__Impl_in_rule__ImportCompoundName__Group__111970);
            rule__ImportCompoundName__Group__1__Impl();

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
    // $ANTLR end "rule__ImportCompoundName__Group__1"


    // $ANTLR start "rule__ImportCompoundName__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6013:1: rule__ImportCompoundName__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__ImportCompoundName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6017:1: ( ( ( '.*' )? ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6018:1: ( ( '.*' )? )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6018:1: ( ( '.*' )? )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6019:1: ( '.*' )?
            {
             before(grammarAccess.getImportCompoundNameAccess().getFullStopAsteriskKeyword_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6020:1: ( '.*' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==65) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6021:2: '.*'
                    {
                    match(input,65,FOLLOW_65_in_rule__ImportCompoundName__Group__1__Impl11999); 

                    }
                    break;

            }

             after(grammarAccess.getImportCompoundNameAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__ImportCompoundName__Group__1__Impl"


    // $ANTLR start "rule__CompoundName__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6036:1: rule__CompoundName__Group__0 : rule__CompoundName__Group__0__Impl rule__CompoundName__Group__1 ;
    public final void rule__CompoundName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6040:1: ( rule__CompoundName__Group__0__Impl rule__CompoundName__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6041:2: rule__CompoundName__Group__0__Impl rule__CompoundName__Group__1
            {
            pushFollow(FOLLOW_rule__CompoundName__Group__0__Impl_in_rule__CompoundName__Group__012036);
            rule__CompoundName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompoundName__Group__1_in_rule__CompoundName__Group__012039);
            rule__CompoundName__Group__1();

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
    // $ANTLR end "rule__CompoundName__Group__0"


    // $ANTLR start "rule__CompoundName__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6048:1: rule__CompoundName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__CompoundName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6052:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6053:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6053:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6054:1: RULE_ID
            {
             before(grammarAccess.getCompoundNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundName__Group__0__Impl12066); 
             after(grammarAccess.getCompoundNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CompoundName__Group__0__Impl"


    // $ANTLR start "rule__CompoundName__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6065:1: rule__CompoundName__Group__1 : rule__CompoundName__Group__1__Impl ;
    public final void rule__CompoundName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6069:1: ( rule__CompoundName__Group__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6070:2: rule__CompoundName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompoundName__Group__1__Impl_in_rule__CompoundName__Group__112095);
            rule__CompoundName__Group__1__Impl();

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
    // $ANTLR end "rule__CompoundName__Group__1"


    // $ANTLR start "rule__CompoundName__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6076:1: rule__CompoundName__Group__1__Impl : ( ( rule__CompoundName__Group_1__0 )* ) ;
    public final void rule__CompoundName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6080:1: ( ( ( rule__CompoundName__Group_1__0 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6081:1: ( ( rule__CompoundName__Group_1__0 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6081:1: ( ( rule__CompoundName__Group_1__0 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6082:1: ( rule__CompoundName__Group_1__0 )*
            {
             before(grammarAccess.getCompoundNameAccess().getGroup_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6083:1: ( rule__CompoundName__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==66) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6083:2: rule__CompoundName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CompoundName__Group_1__0_in_rule__CompoundName__Group__1__Impl12122);
            	    rule__CompoundName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getCompoundNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__CompoundName__Group__1__Impl"


    // $ANTLR start "rule__CompoundName__Group_1__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6097:1: rule__CompoundName__Group_1__0 : rule__CompoundName__Group_1__0__Impl rule__CompoundName__Group_1__1 ;
    public final void rule__CompoundName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6101:1: ( rule__CompoundName__Group_1__0__Impl rule__CompoundName__Group_1__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6102:2: rule__CompoundName__Group_1__0__Impl rule__CompoundName__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompoundName__Group_1__0__Impl_in_rule__CompoundName__Group_1__012157);
            rule__CompoundName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompoundName__Group_1__1_in_rule__CompoundName__Group_1__012160);
            rule__CompoundName__Group_1__1();

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
    // $ANTLR end "rule__CompoundName__Group_1__0"


    // $ANTLR start "rule__CompoundName__Group_1__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6109:1: rule__CompoundName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__CompoundName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6113:1: ( ( '.' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6114:1: ( '.' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6114:1: ( '.' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6115:1: '.'
            {
             before(grammarAccess.getCompoundNameAccess().getFullStopKeyword_1_0()); 
            match(input,66,FOLLOW_66_in_rule__CompoundName__Group_1__0__Impl12188); 
             after(grammarAccess.getCompoundNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__CompoundName__Group_1__0__Impl"


    // $ANTLR start "rule__CompoundName__Group_1__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6128:1: rule__CompoundName__Group_1__1 : rule__CompoundName__Group_1__1__Impl ;
    public final void rule__CompoundName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6132:1: ( rule__CompoundName__Group_1__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6133:2: rule__CompoundName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompoundName__Group_1__1__Impl_in_rule__CompoundName__Group_1__112219);
            rule__CompoundName__Group_1__1__Impl();

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
    // $ANTLR end "rule__CompoundName__Group_1__1"


    // $ANTLR start "rule__CompoundName__Group_1__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6139:1: rule__CompoundName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__CompoundName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6143:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6144:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6144:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6145:1: RULE_ID
            {
             before(grammarAccess.getCompoundNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompoundName__Group_1__1__Impl12246); 
             after(grammarAccess.getCompoundNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__CompoundName__Group_1__1__Impl"


    // $ANTLR start "rule__LedsCodeDSL__ProjectAssignment"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6161:1: rule__LedsCodeDSL__ProjectAssignment : ( ruleProject ) ;
    public final void rule__LedsCodeDSL__ProjectAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6165:1: ( ( ruleProject ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6166:1: ( ruleProject )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6166:1: ( ruleProject )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6167:1: ruleProject
            {
             before(grammarAccess.getLedsCodeDSLAccess().getProjectProjectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProject_in_rule__LedsCodeDSL__ProjectAssignment12284);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getLedsCodeDSLAccess().getProjectProjectParserRuleCall_0()); 

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
    // $ANTLR end "rule__LedsCodeDSL__ProjectAssignment"


    // $ANTLR start "rule__Project__NameAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6176:1: rule__Project__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6180:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6181:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6181:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6182:1: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Project__NameAssignment_112315); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Project__NameAssignment_1"


    // $ANTLR start "rule__Project__InfrastructureBlockAssignment_3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6191:1: rule__Project__InfrastructureBlockAssignment_3 : ( ruleInfrastructureBlock ) ;
    public final void rule__Project__InfrastructureBlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6195:1: ( ( ruleInfrastructureBlock ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6196:1: ( ruleInfrastructureBlock )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6196:1: ( ruleInfrastructureBlock )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6197:1: ruleInfrastructureBlock
            {
             before(grammarAccess.getProjectAccess().getInfrastructureBlockInfrastructureBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInfrastructureBlock_in_rule__Project__InfrastructureBlockAssignment_312346);
            ruleInfrastructureBlock();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getInfrastructureBlockInfrastructureBlockParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Project__InfrastructureBlockAssignment_3"


    // $ANTLR start "rule__Project__InterfaceBlockAssignment_4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6206:1: rule__Project__InterfaceBlockAssignment_4 : ( ruleInterfaceBlock ) ;
    public final void rule__Project__InterfaceBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6210:1: ( ( ruleInterfaceBlock ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6211:1: ( ruleInterfaceBlock )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6211:1: ( ruleInterfaceBlock )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6212:1: ruleInterfaceBlock
            {
             before(grammarAccess.getProjectAccess().getInterfaceBlockInterfaceBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterfaceBlock_in_rule__Project__InterfaceBlockAssignment_412377);
            ruleInterfaceBlock();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getInterfaceBlockInterfaceBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Project__InterfaceBlockAssignment_4"


    // $ANTLR start "rule__Project__ApplicationBlockAssignment_5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6221:1: rule__Project__ApplicationBlockAssignment_5 : ( ruleApplicationBlock ) ;
    public final void rule__Project__ApplicationBlockAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6225:1: ( ( ruleApplicationBlock ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6226:1: ( ruleApplicationBlock )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6226:1: ( ruleApplicationBlock )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6227:1: ruleApplicationBlock
            {
             before(grammarAccess.getProjectAccess().getApplicationBlockApplicationBlockParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleApplicationBlock_in_rule__Project__ApplicationBlockAssignment_512408);
            ruleApplicationBlock();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getApplicationBlockApplicationBlockParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Project__ApplicationBlockAssignment_5"


    // $ANTLR start "rule__Project__DomainBlockAssignment_6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6236:1: rule__Project__DomainBlockAssignment_6 : ( ruleDomainBlock ) ;
    public final void rule__Project__DomainBlockAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6240:1: ( ( ruleDomainBlock ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6241:1: ( ruleDomainBlock )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6241:1: ( ruleDomainBlock )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6242:1: ruleDomainBlock
            {
             before(grammarAccess.getProjectAccess().getDomainBlockDomainBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDomainBlock_in_rule__Project__DomainBlockAssignment_612439);
            ruleDomainBlock();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getDomainBlockDomainBlockParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Project__DomainBlockAssignment_6"


    // $ANTLR start "rule__InterfaceBlock__NameAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6251:1: rule__InterfaceBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InterfaceBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6255:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6256:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6256:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6257:1: RULE_ID
            {
             before(grammarAccess.getInterfaceBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InterfaceBlock__NameAssignment_112470); 
             after(grammarAccess.getInterfaceBlockAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__InterfaceBlock__NameAssignment_1"


    // $ANTLR start "rule__InterfaceBlock__InterfaceApplicationAssignment_3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6266:1: rule__InterfaceBlock__InterfaceApplicationAssignment_3 : ( ruleInterfaceApplication ) ;
    public final void rule__InterfaceBlock__InterfaceApplicationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6270:1: ( ( ruleInterfaceApplication ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6271:1: ( ruleInterfaceApplication )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6271:1: ( ruleInterfaceApplication )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6272:1: ruleInterfaceApplication
            {
             before(grammarAccess.getInterfaceBlockAccess().getInterfaceApplicationInterfaceApplicationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterfaceApplication_in_rule__InterfaceBlock__InterfaceApplicationAssignment_312501);
            ruleInterfaceApplication();

            state._fsp--;

             after(grammarAccess.getInterfaceBlockAccess().getInterfaceApplicationInterfaceApplicationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InterfaceBlock__InterfaceApplicationAssignment_3"


    // $ANTLR start "rule__InterfaceApplication__TypeAssignment_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6281:1: rule__InterfaceApplication__TypeAssignment_0 : ( ( rule__InterfaceApplication__TypeAlternatives_0_0 ) ) ;
    public final void rule__InterfaceApplication__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6285:1: ( ( ( rule__InterfaceApplication__TypeAlternatives_0_0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6286:1: ( ( rule__InterfaceApplication__TypeAlternatives_0_0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6286:1: ( ( rule__InterfaceApplication__TypeAlternatives_0_0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6287:1: ( rule__InterfaceApplication__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getInterfaceApplicationAccess().getTypeAlternatives_0_0()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6288:1: ( rule__InterfaceApplication__TypeAlternatives_0_0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6288:2: rule__InterfaceApplication__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__InterfaceApplication__TypeAlternatives_0_0_in_rule__InterfaceApplication__TypeAssignment_012532);
            rule__InterfaceApplication__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceApplicationAccess().getTypeAlternatives_0_0()); 

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
    // $ANTLR end "rule__InterfaceApplication__TypeAssignment_0"


    // $ANTLR start "rule__InterfaceApplication__NameAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6297:1: rule__InterfaceApplication__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InterfaceApplication__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6301:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6302:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6302:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6303:1: RULE_ID
            {
             before(grammarAccess.getInterfaceApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InterfaceApplication__NameAssignment_112565); 
             after(grammarAccess.getInterfaceApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__InterfaceApplication__NameAssignment_1"


    // $ANTLR start "rule__InterfaceApplication__NameAppAssignment_3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6312:1: rule__InterfaceApplication__NameAppAssignment_3 : ( RULE_ID ) ;
    public final void rule__InterfaceApplication__NameAppAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6316:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6317:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6317:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6318:1: RULE_ID
            {
             before(grammarAccess.getInterfaceApplicationAccess().getNameAppIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InterfaceApplication__NameAppAssignment_312596); 
             after(grammarAccess.getInterfaceApplicationAccess().getNameAppIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__InterfaceApplication__NameAppAssignment_3"


    // $ANTLR start "rule__InfrastructureBlock__BasePackageAssignment_4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6327:1: rule__InfrastructureBlock__BasePackageAssignment_4 : ( RULE_STRING ) ;
    public final void rule__InfrastructureBlock__BasePackageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6331:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6332:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6332:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6333:1: RULE_STRING
            {
             before(grammarAccess.getInfrastructureBlockAccess().getBasePackageSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InfrastructureBlock__BasePackageAssignment_412627); 
             after(grammarAccess.getInfrastructureBlockAccess().getBasePackageSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__InfrastructureBlock__BasePackageAssignment_4"


    // $ANTLR start "rule__InfrastructureBlock__ProjectVersionAssignment_7"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6342:1: rule__InfrastructureBlock__ProjectVersionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__InfrastructureBlock__ProjectVersionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6346:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6347:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6347:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6348:1: RULE_STRING
            {
             before(grammarAccess.getInfrastructureBlockAccess().getProjectVersionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InfrastructureBlock__ProjectVersionAssignment_712658); 
             after(grammarAccess.getInfrastructureBlockAccess().getProjectVersionSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__InfrastructureBlock__ProjectVersionAssignment_7"


    // $ANTLR start "rule__InfrastructureBlock__LanguageAssignment_11"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6357:1: rule__InfrastructureBlock__LanguageAssignment_11 : ( ruleNameVersion ) ;
    public final void rule__InfrastructureBlock__LanguageAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6361:1: ( ( ruleNameVersion ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6362:1: ( ruleNameVersion )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6362:1: ( ruleNameVersion )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6363:1: ruleNameVersion
            {
             before(grammarAccess.getInfrastructureBlockAccess().getLanguageNameVersionParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleNameVersion_in_rule__InfrastructureBlock__LanguageAssignment_1112689);
            ruleNameVersion();

            state._fsp--;

             after(grammarAccess.getInfrastructureBlockAccess().getLanguageNameVersionParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__InfrastructureBlock__LanguageAssignment_11"


    // $ANTLR start "rule__InfrastructureBlock__FrameworkAssignment_16"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6372:1: rule__InfrastructureBlock__FrameworkAssignment_16 : ( ruleNameVersion ) ;
    public final void rule__InfrastructureBlock__FrameworkAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6376:1: ( ( ruleNameVersion ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6377:1: ( ruleNameVersion )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6377:1: ( ruleNameVersion )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6378:1: ruleNameVersion
            {
             before(grammarAccess.getInfrastructureBlockAccess().getFrameworkNameVersionParserRuleCall_16_0()); 
            pushFollow(FOLLOW_ruleNameVersion_in_rule__InfrastructureBlock__FrameworkAssignment_1612720);
            ruleNameVersion();

            state._fsp--;

             after(grammarAccess.getInfrastructureBlockAccess().getFrameworkNameVersionParserRuleCall_16_0()); 

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
    // $ANTLR end "rule__InfrastructureBlock__FrameworkAssignment_16"


    // $ANTLR start "rule__InfrastructureBlock__OrmAssignment_21"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6387:1: rule__InfrastructureBlock__OrmAssignment_21 : ( ruleNameVersion ) ;
    public final void rule__InfrastructureBlock__OrmAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6391:1: ( ( ruleNameVersion ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6392:1: ( ruleNameVersion )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6392:1: ( ruleNameVersion )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6393:1: ruleNameVersion
            {
             before(grammarAccess.getInfrastructureBlockAccess().getOrmNameVersionParserRuleCall_21_0()); 
            pushFollow(FOLLOW_ruleNameVersion_in_rule__InfrastructureBlock__OrmAssignment_2112751);
            ruleNameVersion();

            state._fsp--;

             after(grammarAccess.getInfrastructureBlockAccess().getOrmNameVersionParserRuleCall_21_0()); 

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
    // $ANTLR end "rule__InfrastructureBlock__OrmAssignment_21"


    // $ANTLR start "rule__InfrastructureBlock__DatabaseAssignment_26"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6402:1: rule__InfrastructureBlock__DatabaseAssignment_26 : ( ruleDatabase ) ;
    public final void rule__InfrastructureBlock__DatabaseAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6406:1: ( ( ruleDatabase ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6407:1: ( ruleDatabase )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6407:1: ( ruleDatabase )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6408:1: ruleDatabase
            {
             before(grammarAccess.getInfrastructureBlockAccess().getDatabaseDatabaseParserRuleCall_26_0()); 
            pushFollow(FOLLOW_ruleDatabase_in_rule__InfrastructureBlock__DatabaseAssignment_2612782);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getInfrastructureBlockAccess().getDatabaseDatabaseParserRuleCall_26_0()); 

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
    // $ANTLR end "rule__InfrastructureBlock__DatabaseAssignment_26"


    // $ANTLR start "rule__Database__VersionValueAssignment_2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6417:1: rule__Database__VersionValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Database__VersionValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6421:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6422:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6422:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6423:1: RULE_STRING
            {
             before(grammarAccess.getDatabaseAccess().getVersionValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Database__VersionValueAssignment_212813); 
             after(grammarAccess.getDatabaseAccess().getVersionValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Database__VersionValueAssignment_2"


    // $ANTLR start "rule__Database__NameValueAssignment_6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6432:1: rule__Database__NameValueAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Database__NameValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6436:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6437:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6437:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6438:1: RULE_STRING
            {
             before(grammarAccess.getDatabaseAccess().getNameValueSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Database__NameValueAssignment_612844); 
             after(grammarAccess.getDatabaseAccess().getNameValueSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Database__NameValueAssignment_6"


    // $ANTLR start "rule__Database__UserValueAssignment_10"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6447:1: rule__Database__UserValueAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Database__UserValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6451:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6452:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6452:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6453:1: RULE_STRING
            {
             before(grammarAccess.getDatabaseAccess().getUserValueSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Database__UserValueAssignment_1012875); 
             after(grammarAccess.getDatabaseAccess().getUserValueSTRINGTerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__Database__UserValueAssignment_10"


    // $ANTLR start "rule__Database__PassValueAssignment_14"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6462:1: rule__Database__PassValueAssignment_14 : ( RULE_STRING ) ;
    public final void rule__Database__PassValueAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6466:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6467:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6467:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6468:1: RULE_STRING
            {
             before(grammarAccess.getDatabaseAccess().getPassValueSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Database__PassValueAssignment_1412906); 
             after(grammarAccess.getDatabaseAccess().getPassValueSTRINGTerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__Database__PassValueAssignment_14"


    // $ANTLR start "rule__Database__HostValueAssignment_18"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6477:1: rule__Database__HostValueAssignment_18 : ( RULE_STRING ) ;
    public final void rule__Database__HostValueAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6481:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6482:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6482:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6483:1: RULE_STRING
            {
             before(grammarAccess.getDatabaseAccess().getHostValueSTRINGTerminalRuleCall_18_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Database__HostValueAssignment_1812937); 
             after(grammarAccess.getDatabaseAccess().getHostValueSTRINGTerminalRuleCall_18_0()); 

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
    // $ANTLR end "rule__Database__HostValueAssignment_18"


    // $ANTLR start "rule__Database__EnvValueAssignment_22"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6492:1: rule__Database__EnvValueAssignment_22 : ( RULE_STRING ) ;
    public final void rule__Database__EnvValueAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6496:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6497:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6497:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6498:1: RULE_STRING
            {
             before(grammarAccess.getDatabaseAccess().getEnvValueSTRINGTerminalRuleCall_22_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Database__EnvValueAssignment_2212968); 
             after(grammarAccess.getDatabaseAccess().getEnvValueSTRINGTerminalRuleCall_22_0()); 

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
    // $ANTLR end "rule__Database__EnvValueAssignment_22"


    // $ANTLR start "rule__NameVersion__NameValueAssignment_2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6507:1: rule__NameVersion__NameValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__NameVersion__NameValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6511:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6512:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6512:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6513:1: RULE_STRING
            {
             before(grammarAccess.getNameVersionAccess().getNameValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NameVersion__NameValueAssignment_212999); 
             after(grammarAccess.getNameVersionAccess().getNameValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__NameVersion__NameValueAssignment_2"


    // $ANTLR start "rule__NameVersion__VersionValueAssignment_6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6522:1: rule__NameVersion__VersionValueAssignment_6 : ( RULE_STRING ) ;
    public final void rule__NameVersion__VersionValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6526:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6527:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6527:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6528:1: RULE_STRING
            {
             before(grammarAccess.getNameVersionAccess().getVersionValueSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NameVersion__VersionValueAssignment_613030); 
             after(grammarAccess.getNameVersionAccess().getVersionValueSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__NameVersion__VersionValueAssignment_6"


    // $ANTLR start "rule__ApplicationBlock__NameAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6537:1: rule__ApplicationBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ApplicationBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6541:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6542:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6542:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6543:1: RULE_ID
            {
             before(grammarAccess.getApplicationBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ApplicationBlock__NameAssignment_113061); 
             after(grammarAccess.getApplicationBlockAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ApplicationBlock__NameAssignment_1"


    // $ANTLR start "rule__ApplicationBlock__ApplicationDomainAssignment_3_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6552:1: rule__ApplicationBlock__ApplicationDomainAssignment_3_1 : ( ruleImportCompoundName ) ;
    public final void rule__ApplicationBlock__ApplicationDomainAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6556:1: ( ( ruleImportCompoundName ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6557:1: ( ruleImportCompoundName )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6557:1: ( ruleImportCompoundName )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6558:1: ruleImportCompoundName
            {
             before(grammarAccess.getApplicationBlockAccess().getApplicationDomainImportCompoundNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleImportCompoundName_in_rule__ApplicationBlock__ApplicationDomainAssignment_3_113092);
            ruleImportCompoundName();

            state._fsp--;

             after(grammarAccess.getApplicationBlockAccess().getApplicationDomainImportCompoundNameParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ApplicationBlock__ApplicationDomainAssignment_3_1"


    // $ANTLR start "rule__DomainBlock__NameAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6567:1: rule__DomainBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6571:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6572:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6572:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6573:1: RULE_ID
            {
             before(grammarAccess.getDomainBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DomainBlock__NameAssignment_113123); 
             after(grammarAccess.getDomainBlockAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DomainBlock__NameAssignment_1"


    // $ANTLR start "rule__DomainBlock__ModuleAssignment_3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6582:1: rule__DomainBlock__ModuleAssignment_3 : ( ruleModule ) ;
    public final void rule__DomainBlock__ModuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6586:1: ( ( ruleModule ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6587:1: ( ruleModule )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6587:1: ( ruleModule )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6588:1: ruleModule
            {
             before(grammarAccess.getDomainBlockAccess().getModuleModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__DomainBlock__ModuleAssignment_313154);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getDomainBlockAccess().getModuleModuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DomainBlock__ModuleAssignment_3"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6597:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6601:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6602:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6602:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6603:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_113185); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__ServiceBlockAssignment_3_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6612:1: rule__Module__ServiceBlockAssignment_3_0 : ( ruleServiceBlock ) ;
    public final void rule__Module__ServiceBlockAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6616:1: ( ( ruleServiceBlock ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6617:1: ( ruleServiceBlock )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6617:1: ( ruleServiceBlock )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6618:1: ruleServiceBlock
            {
             before(grammarAccess.getModuleAccess().getServiceBlockServiceBlockParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleServiceBlock_in_rule__Module__ServiceBlockAssignment_3_013216);
            ruleServiceBlock();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getServiceBlockServiceBlockParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Module__ServiceBlockAssignment_3_0"


    // $ANTLR start "rule__Module__EntityBlockAssignment_3_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6627:1: rule__Module__EntityBlockAssignment_3_1 : ( ruleEntityBlock ) ;
    public final void rule__Module__EntityBlockAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6631:1: ( ( ruleEntityBlock ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6632:1: ( ruleEntityBlock )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6632:1: ( ruleEntityBlock )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6633:1: ruleEntityBlock
            {
             before(grammarAccess.getModuleAccess().getEntityBlockEntityBlockParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEntityBlock_in_rule__Module__EntityBlockAssignment_3_113247);
            ruleEntityBlock();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getEntityBlockEntityBlockParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Module__EntityBlockAssignment_3_1"


    // $ANTLR start "rule__Module__EnumBlockAssignment_3_2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6642:1: rule__Module__EnumBlockAssignment_3_2 : ( ruleEnumBlock ) ;
    public final void rule__Module__EnumBlockAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6646:1: ( ( ruleEnumBlock ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6647:1: ( ruleEnumBlock )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6647:1: ( ruleEnumBlock )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6648:1: ruleEnumBlock
            {
             before(grammarAccess.getModuleAccess().getEnumBlockEnumBlockParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleEnumBlock_in_rule__Module__EnumBlockAssignment_3_213278);
            ruleEnumBlock();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getEnumBlockEnumBlockParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Module__EnumBlockAssignment_3_2"


    // $ANTLR start "rule__ServiceBlock__NameAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6657:1: rule__ServiceBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6661:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6662:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6662:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6663:1: RULE_ID
            {
             before(grammarAccess.getServiceBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceBlock__NameAssignment_113309); 
             after(grammarAccess.getServiceBlockAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ServiceBlock__NameAssignment_1"


    // $ANTLR start "rule__ServiceBlock__ServiceFieldsAssignment_3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6672:1: rule__ServiceBlock__ServiceFieldsAssignment_3 : ( ruleServiceMethod ) ;
    public final void rule__ServiceBlock__ServiceFieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6676:1: ( ( ruleServiceMethod ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6677:1: ( ruleServiceMethod )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6677:1: ( ruleServiceMethod )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6678:1: ruleServiceMethod
            {
             before(grammarAccess.getServiceBlockAccess().getServiceFieldsServiceMethodParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleServiceMethod_in_rule__ServiceBlock__ServiceFieldsAssignment_313340);
            ruleServiceMethod();

            state._fsp--;

             after(grammarAccess.getServiceBlockAccess().getServiceFieldsServiceMethodParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ServiceBlock__ServiceFieldsAssignment_3"


    // $ANTLR start "rule__ServiceMethod__NameAssignment_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6687:1: rule__ServiceMethod__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ServiceMethod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6691:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6692:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6692:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6693:1: RULE_ID
            {
             before(grammarAccess.getServiceMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceMethod__NameAssignment_013371); 
             after(grammarAccess.getServiceMethodAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ServiceMethod__NameAssignment_0"


    // $ANTLR start "rule__ServiceMethod__MethodAcessAssignment_2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6702:1: rule__ServiceMethod__MethodAcessAssignment_2 : ( ruleCompoundName ) ;
    public final void rule__ServiceMethod__MethodAcessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6706:1: ( ( ruleCompoundName ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6707:1: ( ruleCompoundName )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6707:1: ( ruleCompoundName )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6708:1: ruleCompoundName
            {
             before(grammarAccess.getServiceMethodAccess().getMethodAcessCompoundNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCompoundName_in_rule__ServiceMethod__MethodAcessAssignment_213402);
            ruleCompoundName();

            state._fsp--;

             after(grammarAccess.getServiceMethodAccess().getMethodAcessCompoundNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ServiceMethod__MethodAcessAssignment_2"


    // $ANTLR start "rule__EntityBlock__AcessModifierAssignment_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6717:1: rule__EntityBlock__AcessModifierAssignment_0 : ( ruleAccessModifier ) ;
    public final void rule__EntityBlock__AcessModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6721:1: ( ( ruleAccessModifier ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6722:1: ( ruleAccessModifier )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6722:1: ( ruleAccessModifier )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6723:1: ruleAccessModifier
            {
             before(grammarAccess.getEntityBlockAccess().getAcessModifierAccessModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAccessModifier_in_rule__EntityBlock__AcessModifierAssignment_013433);
            ruleAccessModifier();

            state._fsp--;

             after(grammarAccess.getEntityBlockAccess().getAcessModifierAccessModifierParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EntityBlock__AcessModifierAssignment_0"


    // $ANTLR start "rule__EntityBlock__IsAbstractAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6732:1: rule__EntityBlock__IsAbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__EntityBlock__IsAbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6736:1: ( ( ( 'abstract' ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6737:1: ( ( 'abstract' ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6737:1: ( ( 'abstract' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6738:1: ( 'abstract' )
            {
             before(grammarAccess.getEntityBlockAccess().getIsAbstractAbstractKeyword_1_0()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6739:1: ( 'abstract' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6740:1: 'abstract'
            {
             before(grammarAccess.getEntityBlockAccess().getIsAbstractAbstractKeyword_1_0()); 
            match(input,67,FOLLOW_67_in_rule__EntityBlock__IsAbstractAssignment_113469); 
             after(grammarAccess.getEntityBlockAccess().getIsAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getEntityBlockAccess().getIsAbstractAbstractKeyword_1_0()); 

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
    // $ANTLR end "rule__EntityBlock__IsAbstractAssignment_1"


    // $ANTLR start "rule__EntityBlock__NameAssignment_3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6755:1: rule__EntityBlock__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__EntityBlock__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6759:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6760:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6760:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6761:1: RULE_ID
            {
             before(grammarAccess.getEntityBlockAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EntityBlock__NameAssignment_313508); 
             after(grammarAccess.getEntityBlockAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__EntityBlock__NameAssignment_3"


    // $ANTLR start "rule__EntityBlock__ClassExtendsAssignment_4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6770:1: rule__EntityBlock__ClassExtendsAssignment_4 : ( ruleExtendBlock ) ;
    public final void rule__EntityBlock__ClassExtendsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6774:1: ( ( ruleExtendBlock ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6775:1: ( ruleExtendBlock )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6775:1: ( ruleExtendBlock )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6776:1: ruleExtendBlock
            {
             before(grammarAccess.getEntityBlockAccess().getClassExtendsExtendBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExtendBlock_in_rule__EntityBlock__ClassExtendsAssignment_413539);
            ruleExtendBlock();

            state._fsp--;

             after(grammarAccess.getEntityBlockAccess().getClassExtendsExtendBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__EntityBlock__ClassExtendsAssignment_4"


    // $ANTLR start "rule__EntityBlock__AttributesAssignment_6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6785:1: rule__EntityBlock__AttributesAssignment_6 : ( ruleAttribute ) ;
    public final void rule__EntityBlock__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6789:1: ( ( ruleAttribute ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6790:1: ( ruleAttribute )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6790:1: ( ruleAttribute )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6791:1: ruleAttribute
            {
             before(grammarAccess.getEntityBlockAccess().getAttributesAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__EntityBlock__AttributesAssignment_613570);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityBlockAccess().getAttributesAttributeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__EntityBlock__AttributesAssignment_6"


    // $ANTLR start "rule__EntityBlock__RepositoryAssignment_7"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6800:1: rule__EntityBlock__RepositoryAssignment_7 : ( ruleRepository ) ;
    public final void rule__EntityBlock__RepositoryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6804:1: ( ( ruleRepository ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6805:1: ( ruleRepository )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6805:1: ( ruleRepository )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6806:1: ruleRepository
            {
             before(grammarAccess.getEntityBlockAccess().getRepositoryRepositoryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRepository_in_rule__EntityBlock__RepositoryAssignment_713601);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getEntityBlockAccess().getRepositoryRepositoryParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__EntityBlock__RepositoryAssignment_7"


    // $ANTLR start "rule__Attribute__AcessModifierAssignment_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6815:1: rule__Attribute__AcessModifierAssignment_0 : ( ruleAccessModifier ) ;
    public final void rule__Attribute__AcessModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6819:1: ( ( ruleAccessModifier ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6820:1: ( ruleAccessModifier )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6820:1: ( ruleAccessModifier )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6821:1: ruleAccessModifier
            {
             before(grammarAccess.getAttributeAccess().getAcessModifierAccessModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAccessModifier_in_rule__Attribute__AcessModifierAssignment_013632);
            ruleAccessModifier();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAcessModifierAccessModifierParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__AcessModifierAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6830:1: rule__Attribute__TypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6834:1: ( ( ruleDataType ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6835:1: ( ruleDataType )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6835:1: ( ruleDataType )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6836:1: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__Attribute__TypeAssignment_113663);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6845:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6849:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6850:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6850:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6851:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_213694); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Repository__NameAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6860:1: rule__Repository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Repository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6864:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6865:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6865:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6866:1: RULE_ID
            {
             before(grammarAccess.getRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Repository__NameAssignment_113725); 
             after(grammarAccess.getRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Repository__NameAssignment_1"


    // $ANTLR start "rule__Repository__MethodsAssignment_3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6875:1: rule__Repository__MethodsAssignment_3 : ( ruleRepositoryFields ) ;
    public final void rule__Repository__MethodsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6879:1: ( ( ruleRepositoryFields ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6880:1: ( ruleRepositoryFields )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6880:1: ( ruleRepositoryFields )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6881:1: ruleRepositoryFields
            {
             before(grammarAccess.getRepositoryAccess().getMethodsRepositoryFieldsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRepositoryFields_in_rule__Repository__MethodsAssignment_313756);
            ruleRepositoryFields();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getMethodsRepositoryFieldsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Repository__MethodsAssignment_3"


    // $ANTLR start "rule__RepositoryFields__NameMethodAssignment_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6890:1: rule__RepositoryFields__NameMethodAssignment_0 : ( RULE_ID ) ;
    public final void rule__RepositoryFields__NameMethodAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6894:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6895:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6895:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6896:1: RULE_ID
            {
             before(grammarAccess.getRepositoryFieldsAccess().getNameMethodIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RepositoryFields__NameMethodAssignment_013787); 
             after(grammarAccess.getRepositoryFieldsAccess().getNameMethodIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__RepositoryFields__NameMethodAssignment_0"


    // $ANTLR start "rule__RepositoryFields__MethodsParametersAssignment_2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6905:1: rule__RepositoryFields__MethodsParametersAssignment_2 : ( ruleMethodParameter ) ;
    public final void rule__RepositoryFields__MethodsParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6909:1: ( ( ruleMethodParameter ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6910:1: ( ruleMethodParameter )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6910:1: ( ruleMethodParameter )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6911:1: ruleMethodParameter
            {
             before(grammarAccess.getRepositoryFieldsAccess().getMethodsParametersMethodParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMethodParameter_in_rule__RepositoryFields__MethodsParametersAssignment_213818);
            ruleMethodParameter();

            state._fsp--;

             after(grammarAccess.getRepositoryFieldsAccess().getMethodsParametersMethodParameterParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RepositoryFields__MethodsParametersAssignment_2"


    // $ANTLR start "rule__RepositoryFields__ReturnTypeAssignment_5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6920:1: rule__RepositoryFields__ReturnTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__RepositoryFields__ReturnTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6924:1: ( ( ruleDataType ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6925:1: ( ruleDataType )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6925:1: ( ruleDataType )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6926:1: ruleDataType
            {
             before(grammarAccess.getRepositoryFieldsAccess().getReturnTypeDataTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__RepositoryFields__ReturnTypeAssignment_513849);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getRepositoryFieldsAccess().getReturnTypeDataTypeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__RepositoryFields__ReturnTypeAssignment_5"


    // $ANTLR start "rule__EnumBlock__NameAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6935:1: rule__EnumBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6939:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6940:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6940:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6941:1: RULE_ID
            {
             before(grammarAccess.getEnumBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumBlock__NameAssignment_113880); 
             after(grammarAccess.getEnumBlockAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnumBlock__NameAssignment_1"


    // $ANTLR start "rule__EnumBlock__ValuesAssignment_3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6950:1: rule__EnumBlock__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumBlock__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6954:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6955:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6955:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6956:1: RULE_ID
            {
             before(grammarAccess.getEnumBlockAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumBlock__ValuesAssignment_313911); 
             after(grammarAccess.getEnumBlockAccess().getValuesIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__EnumBlock__ValuesAssignment_3"


    // $ANTLR start "rule__EnumBlock__ValuesAssignment_4_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6965:1: rule__EnumBlock__ValuesAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__EnumBlock__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6969:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6970:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6970:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6971:1: RULE_ID
            {
             before(grammarAccess.getEnumBlockAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumBlock__ValuesAssignment_4_113942); 
             after(grammarAccess.getEnumBlockAccess().getValuesIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__EnumBlock__ValuesAssignment_4_1"


    // $ANTLR start "rule__MethodParameter__TypeAndAttrAssignment_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6980:1: rule__MethodParameter__TypeAndAttrAssignment_0 : ( ruleTypeAndAttribute ) ;
    public final void rule__MethodParameter__TypeAndAttrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6984:1: ( ( ruleTypeAndAttribute ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6985:1: ( ruleTypeAndAttribute )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6985:1: ( ruleTypeAndAttribute )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6986:1: ruleTypeAndAttribute
            {
             before(grammarAccess.getMethodParameterAccess().getTypeAndAttrTypeAndAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTypeAndAttribute_in_rule__MethodParameter__TypeAndAttrAssignment_013973);
            ruleTypeAndAttribute();

            state._fsp--;

             after(grammarAccess.getMethodParameterAccess().getTypeAndAttrTypeAndAttributeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MethodParameter__TypeAndAttrAssignment_0"


    // $ANTLR start "rule__MethodParameter__TypeAndAttrAssignment_1_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6995:1: rule__MethodParameter__TypeAndAttrAssignment_1_1 : ( ruleTypeAndAttribute ) ;
    public final void rule__MethodParameter__TypeAndAttrAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:6999:1: ( ( ruleTypeAndAttribute ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7000:1: ( ruleTypeAndAttribute )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7000:1: ( ruleTypeAndAttribute )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7001:1: ruleTypeAndAttribute
            {
             before(grammarAccess.getMethodParameterAccess().getTypeAndAttrTypeAndAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTypeAndAttribute_in_rule__MethodParameter__TypeAndAttrAssignment_1_114004);
            ruleTypeAndAttribute();

            state._fsp--;

             after(grammarAccess.getMethodParameterAccess().getTypeAndAttrTypeAndAttributeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MethodParameter__TypeAndAttrAssignment_1_1"


    // $ANTLR start "rule__TypeAndAttribute__TypeAssignment_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7010:1: rule__TypeAndAttribute__TypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__TypeAndAttribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7014:1: ( ( ruleDataType ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7015:1: ( ruleDataType )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7015:1: ( ruleDataType )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7016:1: ruleDataType
            {
             before(grammarAccess.getTypeAndAttributeAccess().getTypeDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__TypeAndAttribute__TypeAssignment_014035);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getTypeAndAttributeAccess().getTypeDataTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TypeAndAttribute__TypeAssignment_0"


    // $ANTLR start "rule__TypeAndAttribute__NameAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7025:1: rule__TypeAndAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeAndAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7029:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7030:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7030:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7031:1: RULE_ID
            {
             before(grammarAccess.getTypeAndAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeAndAttribute__NameAssignment_114066); 
             after(grammarAccess.getTypeAndAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TypeAndAttribute__NameAssignment_1"


    // $ANTLR start "rule__ExtendBlock__ValuesAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7040:1: rule__ExtendBlock__ValuesAssignment_1 : ( ruleCompoundName ) ;
    public final void rule__ExtendBlock__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7044:1: ( ( ruleCompoundName ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7045:1: ( ruleCompoundName )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7045:1: ( ruleCompoundName )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7046:1: ruleCompoundName
            {
             before(grammarAccess.getExtendBlockAccess().getValuesCompoundNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCompoundName_in_rule__ExtendBlock__ValuesAssignment_114097);
            ruleCompoundName();

            state._fsp--;

             after(grammarAccess.getExtendBlockAccess().getValuesCompoundNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ExtendBlock__ValuesAssignment_1"


    // $ANTLR start "rule__ExtendBlock__ValuesAssignment_2_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7055:1: rule__ExtendBlock__ValuesAssignment_2_1 : ( ruleCompoundName ) ;
    public final void rule__ExtendBlock__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7059:1: ( ( ruleCompoundName ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7060:1: ( ruleCompoundName )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7060:1: ( ruleCompoundName )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:7061:1: ruleCompoundName
            {
             before(grammarAccess.getExtendBlockAccess().getValuesCompoundNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCompoundName_in_rule__ExtendBlock__ValuesAssignment_2_114128);
            ruleCompoundName();

            state._fsp--;

             after(grammarAccess.getExtendBlockAccess().getValuesCompoundNameParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ExtendBlock__ValuesAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLedsCodeDSL_in_entryRuleLedsCodeDSL61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLedsCodeDSL68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LedsCodeDSL__ProjectAssignment_in_ruleLedsCodeDSL94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_entryRuleProject121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProject128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceBlock_in_entryRuleInterfaceBlock181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceBlock188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__Group__0_in_ruleInterfaceBlock214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceApplication_in_entryRuleInterfaceApplication241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceApplication248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__Group__0_in_ruleInterfaceApplication274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfrastructureBlock_in_entryRuleInfrastructureBlock301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfrastructureBlock308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__0_in_ruleInfrastructureBlock334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0_in_ruleDatabase394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameVersion_in_entryRuleNameVersion421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameVersion428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__0_in_ruleNameVersion454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationBlock_in_entryRuleApplicationBlock481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationBlock488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group__0_in_ruleApplicationBlock514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainBlock_in_entryRuleDomainBlock541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainBlock548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainBlock__Group__0_in_ruleDomainBlock574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_entryRuleServiceBlock661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceBlock668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__0_in_ruleServiceBlock694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethod728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__0_in_ruleServiceMethod754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBlock_in_entryRuleEntityBlock781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityBlock788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__0_in_ruleEntityBlock814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepository_in_entryRuleRepository901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepository908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repository__Group__0_in_ruleRepository934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepositoryFields_in_entryRuleRepositoryFields961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepositoryFields968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__0_in_ruleRepositoryFields994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumBlock_in_entryRuleEnumBlock1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumBlock1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__0_in_ruleEnumBlock1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodParameter_in_entryRuleMethodParameter1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodParameter1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodParameter__Group__0_in_ruleMethodParameter1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndAttribute_in_entryRuleTypeAndAttribute1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeAndAttribute1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeAndAttribute__Group__0_in_ruleTypeAndAttribute1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendBlock_in_entryRuleExtendBlock1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendBlock1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendBlock__Group__0_in_ruleExtendBlock1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_entryRuleExtend1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtend1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleExtend1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeList_in_entryRuleDataTypeList1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeList1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeList__Group__0_in_ruleDataTypeList1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeSet_in_entryRuleDataTypeSet1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeSet1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeSet__Group__0_in_ruleDataTypeSet1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessModifier_in_entryRuleAccessModifier1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessModifier1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AccessModifier__Alternatives_in_ruleAccessModifier1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivate_in_entryRulePrivate1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrivate1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Private__Alternatives_in_rulePrivate1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_entryRuleProtected1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtected1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protected__Alternatives_in_ruleProtected1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportCompoundName_in_entryRuleImportCompoundName1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportCompoundName1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportCompoundName__Group__0_in_ruleImportCompoundName1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_entryRuleCompoundName1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundName1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundName__Group__0_in_ruleCompoundName1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InterfaceApplication__TypeAlternatives_0_01813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__InterfaceApplication__TypeAlternatives_0_01833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ServiceBlockAssignment_3_0_in_rule__Module__Alternatives_31867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__EntityBlockAssignment_3_1_in_rule__Module__Alternatives_31885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__EnumBlockAssignment_3_2_in_rule__Module__Alternatives_31903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeList_in_rule__DataType__Alternatives1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeSet_in_rule__DataType__Alternatives1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_rule__DataType__Alternatives1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataType__Alternatives1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataType__Alternatives2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DataType__Alternatives2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DataType__Alternatives2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataType__Alternatives2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataType__Alternatives2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataType__Alternatives2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DataType__Alternatives2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataType__Alternatives2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataType__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataType__Alternatives2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DataType__Alternatives2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataType__Alternatives2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrivate_in_rule__AccessModifier__Alternatives2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_rule__AccessModifier__Alternatives2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Private__Alternatives2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Private__Alternatives2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Protected__Alternatives2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Protected__Alternatives2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__02419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__02422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Project__Group__0__Impl2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__12481 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__12484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__NameAssignment_1_in_rule__Project__Group__1__Impl2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__22541 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Project__Group__3_in_rule__Project__Group__22544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Project__Group__2__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__3__Impl_in_rule__Project__Group__32603 = new BitSet(new long[]{0x0028000400000000L});
    public static final BitSet FOLLOW_rule__Project__Group__4_in_rule__Project__Group__32606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__InfrastructureBlockAssignment_3_in_rule__Project__Group__3__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__4__Impl_in_rule__Project__Group__42663 = new BitSet(new long[]{0x0028000400000000L});
    public static final BitSet FOLLOW_rule__Project__Group__5_in_rule__Project__Group__42666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__InterfaceBlockAssignment_4_in_rule__Project__Group__4__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__5__Impl_in_rule__Project__Group__52724 = new BitSet(new long[]{0x0028000400000000L});
    public static final BitSet FOLLOW_rule__Project__Group__6_in_rule__Project__Group__52727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__ApplicationBlockAssignment_5_in_rule__Project__Group__5__Impl2754 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__Project__Group__6__Impl_in_rule__Project__Group__62785 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Project__Group__7_in_rule__Project__Group__62788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Project__DomainBlockAssignment_6_in_rule__Project__Group__6__Impl2817 = new BitSet(new long[]{0x0028000400000002L});
    public static final BitSet FOLLOW_rule__Project__DomainBlockAssignment_6_in_rule__Project__Group__6__Impl2829 = new BitSet(new long[]{0x0028000400000002L});
    public static final BitSet FOLLOW_rule__Project__Group__7__Impl_in_rule__Project__Group__72862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Project__Group__7__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__Group__0__Impl_in_rule__InterfaceBlock__Group__02937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__Group__1_in_rule__InterfaceBlock__Group__02940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__InterfaceBlock__Group__0__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__Group__1__Impl_in_rule__InterfaceBlock__Group__12999 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__Group__2_in_rule__InterfaceBlock__Group__13002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__NameAssignment_1_in_rule__InterfaceBlock__Group__1__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__Group__2__Impl_in_rule__InterfaceBlock__Group__23059 = new BitSet(new long[]{0x0000000200003000L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__Group__3_in_rule__InterfaceBlock__Group__23062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InterfaceBlock__Group__2__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__Group__3__Impl_in_rule__InterfaceBlock__Group__33121 = new BitSet(new long[]{0x0000000200003000L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__Group__4_in_rule__InterfaceBlock__Group__33124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__InterfaceApplicationAssignment_3_in_rule__InterfaceBlock__Group__3__Impl3151 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_rule__InterfaceBlock__Group__4__Impl_in_rule__InterfaceBlock__Group__43182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InterfaceBlock__Group__4__Impl3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__Group__0__Impl_in_rule__InterfaceApplication__Group__03251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__Group__1_in_rule__InterfaceApplication__Group__03254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__TypeAssignment_0_in_rule__InterfaceApplication__Group__0__Impl3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__Group__1__Impl_in_rule__InterfaceApplication__Group__13311 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__Group__2_in_rule__InterfaceApplication__Group__13314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__NameAssignment_1_in_rule__InterfaceApplication__Group__1__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__Group__2__Impl_in_rule__InterfaceApplication__Group__23371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__Group__3_in_rule__InterfaceApplication__Group__23374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__InterfaceApplication__Group__2__Impl3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__Group__3__Impl_in_rule__InterfaceApplication__Group__33433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__NameAppAssignment_3_in_rule__InterfaceApplication__Group__3__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__0__Impl_in_rule__InfrastructureBlock__Group__03498 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__1_in_rule__InfrastructureBlock__Group__03501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__InfrastructureBlock__Group__0__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__1__Impl_in_rule__InfrastructureBlock__Group__13560 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__2_in_rule__InfrastructureBlock__Group__13563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InfrastructureBlock__Group__1__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__2__Impl_in_rule__InfrastructureBlock__Group__23622 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__3_in_rule__InfrastructureBlock__Group__23625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__InfrastructureBlock__Group__2__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__3__Impl_in_rule__InfrastructureBlock__Group__33684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__4_in_rule__InfrastructureBlock__Group__33687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InfrastructureBlock__Group__3__Impl3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__4__Impl_in_rule__InfrastructureBlock__Group__43746 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__5_in_rule__InfrastructureBlock__Group__43749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__BasePackageAssignment_4_in_rule__InfrastructureBlock__Group__4__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__5__Impl_in_rule__InfrastructureBlock__Group__53806 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__6_in_rule__InfrastructureBlock__Group__53809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__InfrastructureBlock__Group__5__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__6__Impl_in_rule__InfrastructureBlock__Group__63868 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__7_in_rule__InfrastructureBlock__Group__63871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InfrastructureBlock__Group__6__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__7__Impl_in_rule__InfrastructureBlock__Group__73930 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__8_in_rule__InfrastructureBlock__Group__73933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__ProjectVersionAssignment_7_in_rule__InfrastructureBlock__Group__7__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__8__Impl_in_rule__InfrastructureBlock__Group__83990 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__9_in_rule__InfrastructureBlock__Group__83993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__InfrastructureBlock__Group__8__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__9__Impl_in_rule__InfrastructureBlock__Group__94052 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__10_in_rule__InfrastructureBlock__Group__94055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InfrastructureBlock__Group__9__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__10__Impl_in_rule__InfrastructureBlock__Group__104114 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__11_in_rule__InfrastructureBlock__Group__104117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InfrastructureBlock__Group__10__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__11__Impl_in_rule__InfrastructureBlock__Group__114176 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__12_in_rule__InfrastructureBlock__Group__114179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__LanguageAssignment_11_in_rule__InfrastructureBlock__Group__11__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__12__Impl_in_rule__InfrastructureBlock__Group__124236 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__13_in_rule__InfrastructureBlock__Group__124239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InfrastructureBlock__Group__12__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__13__Impl_in_rule__InfrastructureBlock__Group__134298 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__14_in_rule__InfrastructureBlock__Group__134301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__InfrastructureBlock__Group__13__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__14__Impl_in_rule__InfrastructureBlock__Group__144360 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__15_in_rule__InfrastructureBlock__Group__144363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InfrastructureBlock__Group__14__Impl4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__15__Impl_in_rule__InfrastructureBlock__Group__154422 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__16_in_rule__InfrastructureBlock__Group__154425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InfrastructureBlock__Group__15__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__16__Impl_in_rule__InfrastructureBlock__Group__164484 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__17_in_rule__InfrastructureBlock__Group__164487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__FrameworkAssignment_16_in_rule__InfrastructureBlock__Group__16__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__17__Impl_in_rule__InfrastructureBlock__Group__174544 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__18_in_rule__InfrastructureBlock__Group__174547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InfrastructureBlock__Group__17__Impl4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__18__Impl_in_rule__InfrastructureBlock__Group__184606 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__19_in_rule__InfrastructureBlock__Group__184609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__InfrastructureBlock__Group__18__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__19__Impl_in_rule__InfrastructureBlock__Group__194668 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__20_in_rule__InfrastructureBlock__Group__194671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InfrastructureBlock__Group__19__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__20__Impl_in_rule__InfrastructureBlock__Group__204730 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__21_in_rule__InfrastructureBlock__Group__204733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InfrastructureBlock__Group__20__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__21__Impl_in_rule__InfrastructureBlock__Group__214792 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__22_in_rule__InfrastructureBlock__Group__214795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__OrmAssignment_21_in_rule__InfrastructureBlock__Group__21__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__22__Impl_in_rule__InfrastructureBlock__Group__224852 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__23_in_rule__InfrastructureBlock__Group__224855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InfrastructureBlock__Group__22__Impl4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__23__Impl_in_rule__InfrastructureBlock__Group__234914 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__24_in_rule__InfrastructureBlock__Group__234917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__InfrastructureBlock__Group__23__Impl4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__24__Impl_in_rule__InfrastructureBlock__Group__244976 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__25_in_rule__InfrastructureBlock__Group__244979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InfrastructureBlock__Group__24__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__25__Impl_in_rule__InfrastructureBlock__Group__255038 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__26_in_rule__InfrastructureBlock__Group__255041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__InfrastructureBlock__Group__25__Impl5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__26__Impl_in_rule__InfrastructureBlock__Group__265100 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__27_in_rule__InfrastructureBlock__Group__265103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__DatabaseAssignment_26_in_rule__InfrastructureBlock__Group__26__Impl5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__27__Impl_in_rule__InfrastructureBlock__Group__275160 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__28_in_rule__InfrastructureBlock__Group__275163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InfrastructureBlock__Group__27__Impl5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureBlock__Group__28__Impl_in_rule__InfrastructureBlock__Group__285222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__InfrastructureBlock__Group__28__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__05339 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Database__Group__1_in_rule__Database__Group__05342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Database__Group__0__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__15401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Database__Group__2_in_rule__Database__Group__15404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Database__Group__1__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__25463 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Database__Group__3_in_rule__Database__Group__25466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__VersionValueAssignment_2_in_rule__Database__Group__2__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__3__Impl_in_rule__Database__Group__35523 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Database__Group__4_in_rule__Database__Group__35526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Database__Group__3__Impl5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__4__Impl_in_rule__Database__Group__45585 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Database__Group__5_in_rule__Database__Group__45588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Database__Group__4__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__5__Impl_in_rule__Database__Group__55647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Database__Group__6_in_rule__Database__Group__55650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Database__Group__5__Impl5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__6__Impl_in_rule__Database__Group__65709 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Database__Group__7_in_rule__Database__Group__65712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__NameValueAssignment_6_in_rule__Database__Group__6__Impl5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__7__Impl_in_rule__Database__Group__75769 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Database__Group__8_in_rule__Database__Group__75772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Database__Group__7__Impl5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__8__Impl_in_rule__Database__Group__85831 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Database__Group__9_in_rule__Database__Group__85834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Database__Group__8__Impl5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__9__Impl_in_rule__Database__Group__95893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Database__Group__10_in_rule__Database__Group__95896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Database__Group__9__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__10__Impl_in_rule__Database__Group__105955 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Database__Group__11_in_rule__Database__Group__105958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__UserValueAssignment_10_in_rule__Database__Group__10__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__11__Impl_in_rule__Database__Group__116015 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Database__Group__12_in_rule__Database__Group__116018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Database__Group__11__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__12__Impl_in_rule__Database__Group__126077 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Database__Group__13_in_rule__Database__Group__126080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Database__Group__12__Impl6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__13__Impl_in_rule__Database__Group__136139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Database__Group__14_in_rule__Database__Group__136142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Database__Group__13__Impl6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__14__Impl_in_rule__Database__Group__146201 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Database__Group__15_in_rule__Database__Group__146204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__PassValueAssignment_14_in_rule__Database__Group__14__Impl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__15__Impl_in_rule__Database__Group__156261 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Database__Group__16_in_rule__Database__Group__156264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Database__Group__15__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__16__Impl_in_rule__Database__Group__166323 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Database__Group__17_in_rule__Database__Group__166326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Database__Group__16__Impl6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__17__Impl_in_rule__Database__Group__176385 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Database__Group__18_in_rule__Database__Group__176388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Database__Group__17__Impl6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__18__Impl_in_rule__Database__Group__186447 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Database__Group__19_in_rule__Database__Group__186450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__HostValueAssignment_18_in_rule__Database__Group__18__Impl6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__19__Impl_in_rule__Database__Group__196507 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Database__Group__20_in_rule__Database__Group__196510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Database__Group__19__Impl6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__20__Impl_in_rule__Database__Group__206569 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Database__Group__21_in_rule__Database__Group__206572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Database__Group__20__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__21__Impl_in_rule__Database__Group__216631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Database__Group__22_in_rule__Database__Group__216634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Database__Group__21__Impl6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__22__Impl_in_rule__Database__Group__226693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__EnvValueAssignment_22_in_rule__Database__Group__22__Impl6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__0__Impl_in_rule__NameVersion__Group__06796 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__1_in_rule__NameVersion__Group__06799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__NameVersion__Group__0__Impl6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__1__Impl_in_rule__NameVersion__Group__16858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__2_in_rule__NameVersion__Group__16861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NameVersion__Group__1__Impl6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__2__Impl_in_rule__NameVersion__Group__26920 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__3_in_rule__NameVersion__Group__26923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameVersion__NameValueAssignment_2_in_rule__NameVersion__Group__2__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__3__Impl_in_rule__NameVersion__Group__36980 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__4_in_rule__NameVersion__Group__36983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__NameVersion__Group__3__Impl7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__4__Impl_in_rule__NameVersion__Group__47042 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__5_in_rule__NameVersion__Group__47045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__NameVersion__Group__4__Impl7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__5__Impl_in_rule__NameVersion__Group__57104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__6_in_rule__NameVersion__Group__57107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__NameVersion__Group__5__Impl7135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameVersion__Group__6__Impl_in_rule__NameVersion__Group__67166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameVersion__VersionValueAssignment_6_in_rule__NameVersion__Group__6__Impl7193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group__0__Impl_in_rule__ApplicationBlock__Group__07237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group__1_in_rule__ApplicationBlock__Group__07240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ApplicationBlock__Group__0__Impl7268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group__1__Impl_in_rule__ApplicationBlock__Group__17299 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group__2_in_rule__ApplicationBlock__Group__17302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__NameAssignment_1_in_rule__ApplicationBlock__Group__1__Impl7329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group__2__Impl_in_rule__ApplicationBlock__Group__27359 = new BitSet(new long[]{0x0010000200000000L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group__3_in_rule__ApplicationBlock__Group__27362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ApplicationBlock__Group__2__Impl7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group__3__Impl_in_rule__ApplicationBlock__Group__37421 = new BitSet(new long[]{0x0010000200000000L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group__4_in_rule__ApplicationBlock__Group__37424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group_3__0_in_rule__ApplicationBlock__Group__3__Impl7451 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group__4__Impl_in_rule__ApplicationBlock__Group__47482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ApplicationBlock__Group__4__Impl7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group_3__0__Impl_in_rule__ApplicationBlock__Group_3__07551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group_3__1_in_rule__ApplicationBlock__Group_3__07554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ApplicationBlock__Group_3__0__Impl7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__Group_3__1__Impl_in_rule__ApplicationBlock__Group_3__17613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplicationBlock__ApplicationDomainAssignment_3_1_in_rule__ApplicationBlock__Group_3__1__Impl7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainBlock__Group__0__Impl_in_rule__DomainBlock__Group__07674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainBlock__Group__1_in_rule__DomainBlock__Group__07677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__DomainBlock__Group__0__Impl7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainBlock__Group__1__Impl_in_rule__DomainBlock__Group__17736 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DomainBlock__Group__2_in_rule__DomainBlock__Group__17739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainBlock__NameAssignment_1_in_rule__DomainBlock__Group__1__Impl7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainBlock__Group__2__Impl_in_rule__DomainBlock__Group__27796 = new BitSet(new long[]{0x0040000200000000L});
    public static final BitSet FOLLOW_rule__DomainBlock__Group__3_in_rule__DomainBlock__Group__27799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DomainBlock__Group__2__Impl7827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainBlock__Group__3__Impl_in_rule__DomainBlock__Group__37858 = new BitSet(new long[]{0x0040000200000000L});
    public static final BitSet FOLLOW_rule__DomainBlock__Group__4_in_rule__DomainBlock__Group__37861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainBlock__ModuleAssignment_3_in_rule__DomainBlock__Group__3__Impl7888 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__DomainBlock__Group__4__Impl_in_rule__DomainBlock__Group__47919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DomainBlock__Group__4__Impl7947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__07988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__07991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Module__Group__0__Impl8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__18050 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__18053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__28110 = new BitSet(new long[]{0x1180000278000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__28113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Module__Group__2__Impl8141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__38172 = new BitSet(new long[]{0x1180000278000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__38175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Alternatives_3_in_rule__Module__Group__3__Impl8202 = new BitSet(new long[]{0x1180000078000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__48233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Module__Group__4__Impl8261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__0__Impl_in_rule__ServiceBlock__Group__08302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__1_in_rule__ServiceBlock__Group__08305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ServiceBlock__Group__0__Impl8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__1__Impl_in_rule__ServiceBlock__Group__18364 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__2_in_rule__ServiceBlock__Group__18367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__NameAssignment_1_in_rule__ServiceBlock__Group__1__Impl8394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__2__Impl_in_rule__ServiceBlock__Group__28424 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__3_in_rule__ServiceBlock__Group__28427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ServiceBlock__Group__2__Impl8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__3__Impl_in_rule__ServiceBlock__Group__38486 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__4_in_rule__ServiceBlock__Group__38489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceBlock__ServiceFieldsAssignment_3_in_rule__ServiceBlock__Group__3__Impl8516 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ServiceBlock__Group__4__Impl_in_rule__ServiceBlock__Group__48547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ServiceBlock__Group__4__Impl8575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__0__Impl_in_rule__ServiceMethod__Group__08616 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__1_in_rule__ServiceMethod__Group__08619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__NameAssignment_0_in_rule__ServiceMethod__Group__0__Impl8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__1__Impl_in_rule__ServiceMethod__Group__18676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__2_in_rule__ServiceMethod__Group__18679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ServiceMethod__Group__1__Impl8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__2__Impl_in_rule__ServiceMethod__Group__28738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__MethodAcessAssignment_2_in_rule__ServiceMethod__Group__2__Impl8765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__0__Impl_in_rule__EntityBlock__Group__08801 = new BitSet(new long[]{0x0100000078000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__1_in_rule__EntityBlock__Group__08804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__AcessModifierAssignment_0_in_rule__EntityBlock__Group__0__Impl8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__1__Impl_in_rule__EntityBlock__Group__18862 = new BitSet(new long[]{0x0100000078000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__2_in_rule__EntityBlock__Group__18865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__IsAbstractAssignment_1_in_rule__EntityBlock__Group__1__Impl8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__2__Impl_in_rule__EntityBlock__Group__28923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__3_in_rule__EntityBlock__Group__28926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__EntityBlock__Group__2__Impl8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__3__Impl_in_rule__EntityBlock__Group__38985 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__4_in_rule__EntityBlock__Group__38988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__NameAssignment_3_in_rule__EntityBlock__Group__3__Impl9015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__4__Impl_in_rule__EntityBlock__Group__49045 = new BitSet(new long[]{0x0000000100000800L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__5_in_rule__EntityBlock__Group__49048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__ClassExtendsAssignment_4_in_rule__EntityBlock__Group__4__Impl9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__5__Impl_in_rule__EntityBlock__Group__59106 = new BitSet(new long[]{0x220000007FFFC010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__6_in_rule__EntityBlock__Group__59109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EntityBlock__Group__5__Impl9137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__6__Impl_in_rule__EntityBlock__Group__69168 = new BitSet(new long[]{0x220000007FFFC010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__7_in_rule__EntityBlock__Group__69171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__AttributesAssignment_6_in_rule__EntityBlock__Group__6__Impl9198 = new BitSet(new long[]{0x200000007FFFC012L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__7__Impl_in_rule__EntityBlock__Group__79229 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__8_in_rule__EntityBlock__Group__79232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__RepositoryAssignment_7_in_rule__EntityBlock__Group__7__Impl9259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityBlock__Group__8__Impl_in_rule__EntityBlock__Group__89289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EntityBlock__Group__8__Impl9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__09366 = new BitSet(new long[]{0x200000007FFFC010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__09369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AcessModifierAssignment_0_in_rule__Attribute__Group__0__Impl9396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__19427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__19430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_1_in_rule__Attribute__Group__1__Impl9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__29487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repository__Group__0__Impl_in_rule__Repository__Group__09550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Repository__Group__1_in_rule__Repository__Group__09553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Repository__Group__0__Impl9581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repository__Group__1__Impl_in_rule__Repository__Group__19612 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Repository__Group__2_in_rule__Repository__Group__19615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repository__NameAssignment_1_in_rule__Repository__Group__1__Impl9642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repository__Group__2__Impl_in_rule__Repository__Group__29672 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__Repository__Group__3_in_rule__Repository__Group__29675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Repository__Group__2__Impl9703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repository__Group__3__Impl_in_rule__Repository__Group__39734 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__Repository__Group__4_in_rule__Repository__Group__39737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Repository__MethodsAssignment_3_in_rule__Repository__Group__3__Impl9764 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Repository__Group__4__Impl_in_rule__Repository__Group__49795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Repository__Group__4__Impl9823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__0__Impl_in_rule__RepositoryFields__Group__09864 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__1_in_rule__RepositoryFields__Group__09867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepositoryFields__NameMethodAssignment_0_in_rule__RepositoryFields__Group__0__Impl9894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__1__Impl_in_rule__RepositoryFields__Group__19924 = new BitSet(new long[]{0x280000007FFFC010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__2_in_rule__RepositoryFields__Group__19927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__RepositoryFields__Group__1__Impl9955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__2__Impl_in_rule__RepositoryFields__Group__29986 = new BitSet(new long[]{0x280000007FFFC010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__3_in_rule__RepositoryFields__Group__29989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepositoryFields__MethodsParametersAssignment_2_in_rule__RepositoryFields__Group__2__Impl10016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__3__Impl_in_rule__RepositoryFields__Group__310047 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__4_in_rule__RepositoryFields__Group__310050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__RepositoryFields__Group__3__Impl10078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__4__Impl_in_rule__RepositoryFields__Group__410109 = new BitSet(new long[]{0x200000007FFFC010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__5_in_rule__RepositoryFields__Group__410112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RepositoryFields__Group__4__Impl10140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepositoryFields__Group__5__Impl_in_rule__RepositoryFields__Group__510171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RepositoryFields__ReturnTypeAssignment_5_in_rule__RepositoryFields__Group__5__Impl10198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__0__Impl_in_rule__EnumBlock__Group__010240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__1_in_rule__EnumBlock__Group__010243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__EnumBlock__Group__0__Impl10271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__1__Impl_in_rule__EnumBlock__Group__110302 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__2_in_rule__EnumBlock__Group__110305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__NameAssignment_1_in_rule__EnumBlock__Group__1__Impl10332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__2__Impl_in_rule__EnumBlock__Group__210362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__3_in_rule__EnumBlock__Group__210365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EnumBlock__Group__2__Impl10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__3__Impl_in_rule__EnumBlock__Group__310424 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__4_in_rule__EnumBlock__Group__310427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__ValuesAssignment_3_in_rule__EnumBlock__Group__3__Impl10454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__4__Impl_in_rule__EnumBlock__Group__410484 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__5_in_rule__EnumBlock__Group__410487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group_4__0_in_rule__EnumBlock__Group__4__Impl10514 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group__5__Impl_in_rule__EnumBlock__Group__510545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EnumBlock__Group__5__Impl10573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group_4__0__Impl_in_rule__EnumBlock__Group_4__010616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group_4__1_in_rule__EnumBlock__Group_4__010619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__EnumBlock__Group_4__0__Impl10647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__Group_4__1__Impl_in_rule__EnumBlock__Group_4__110678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumBlock__ValuesAssignment_4_1_in_rule__EnumBlock__Group_4__1__Impl10705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodParameter__Group__0__Impl_in_rule__MethodParameter__Group__010739 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__MethodParameter__Group__1_in_rule__MethodParameter__Group__010742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodParameter__TypeAndAttrAssignment_0_in_rule__MethodParameter__Group__0__Impl10769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodParameter__Group__1__Impl_in_rule__MethodParameter__Group__110799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodParameter__Group_1__0_in_rule__MethodParameter__Group__1__Impl10826 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__MethodParameter__Group_1__0__Impl_in_rule__MethodParameter__Group_1__010861 = new BitSet(new long[]{0x200000007FFFC010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__MethodParameter__Group_1__1_in_rule__MethodParameter__Group_1__010864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__MethodParameter__Group_1__0__Impl10892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodParameter__Group_1__1__Impl_in_rule__MethodParameter__Group_1__110923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodParameter__TypeAndAttrAssignment_1_1_in_rule__MethodParameter__Group_1__1__Impl10950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeAndAttribute__Group__0__Impl_in_rule__TypeAndAttribute__Group__010984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeAndAttribute__Group__1_in_rule__TypeAndAttribute__Group__010987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeAndAttribute__TypeAssignment_0_in_rule__TypeAndAttribute__Group__0__Impl11014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeAndAttribute__Group__1__Impl_in_rule__TypeAndAttribute__Group__111044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeAndAttribute__NameAssignment_1_in_rule__TypeAndAttribute__Group__1__Impl11071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendBlock__Group__0__Impl_in_rule__ExtendBlock__Group__011105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExtendBlock__Group__1_in_rule__ExtendBlock__Group__011108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtend_in_rule__ExtendBlock__Group__0__Impl11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendBlock__Group__1__Impl_in_rule__ExtendBlock__Group__111164 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ExtendBlock__Group__2_in_rule__ExtendBlock__Group__111167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendBlock__ValuesAssignment_1_in_rule__ExtendBlock__Group__1__Impl11194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendBlock__Group__2__Impl_in_rule__ExtendBlock__Group__211224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendBlock__Group_2__0_in_rule__ExtendBlock__Group__2__Impl11251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendBlock__Group_2__0__Impl_in_rule__ExtendBlock__Group_2__011288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExtendBlock__Group_2__1_in_rule__ExtendBlock__Group_2__011291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ExtendBlock__Group_2__0__Impl11319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendBlock__Group_2__1__Impl_in_rule__ExtendBlock__Group_2__111350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendBlock__ValuesAssignment_2_1_in_rule__ExtendBlock__Group_2__1__Impl11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeList__Group__0__Impl_in_rule__DataTypeList__Group__011411 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__DataTypeList__Group__1_in_rule__DataTypeList__Group__011414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__DataTypeList__Group__0__Impl11442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeList__Group__1__Impl_in_rule__DataTypeList__Group__111473 = new BitSet(new long[]{0x200000007FFFC010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__DataTypeList__Group__2_in_rule__DataTypeList__Group__111476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__DataTypeList__Group__1__Impl11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeList__Group__2__Impl_in_rule__DataTypeList__Group__211535 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__DataTypeList__Group__3_in_rule__DataTypeList__Group__211538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__DataTypeList__Group__2__Impl11565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeList__Group__3__Impl_in_rule__DataTypeList__Group__311594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__DataTypeList__Group__3__Impl11622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeSet__Group__0__Impl_in_rule__DataTypeSet__Group__011661 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__DataTypeSet__Group__1_in_rule__DataTypeSet__Group__011664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__DataTypeSet__Group__0__Impl11692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeSet__Group__1__Impl_in_rule__DataTypeSet__Group__111723 = new BitSet(new long[]{0x200000007FFFC010L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__DataTypeSet__Group__2_in_rule__DataTypeSet__Group__111726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__DataTypeSet__Group__1__Impl11754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeSet__Group__2__Impl_in_rule__DataTypeSet__Group__211785 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__DataTypeSet__Group__3_in_rule__DataTypeSet__Group__211788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__DataTypeSet__Group__2__Impl11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeSet__Group__3__Impl_in_rule__DataTypeSet__Group__311844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__DataTypeSet__Group__3__Impl11872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportCompoundName__Group__0__Impl_in_rule__ImportCompoundName__Group__011911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportCompoundName__Group__1_in_rule__ImportCompoundName__Group__011914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_rule__ImportCompoundName__Group__0__Impl11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportCompoundName__Group__1__Impl_in_rule__ImportCompoundName__Group__111970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__ImportCompoundName__Group__1__Impl11999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundName__Group__0__Impl_in_rule__CompoundName__Group__012036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__CompoundName__Group__1_in_rule__CompoundName__Group__012039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundName__Group__0__Impl12066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundName__Group__1__Impl_in_rule__CompoundName__Group__112095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundName__Group_1__0_in_rule__CompoundName__Group__1__Impl12122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__CompoundName__Group_1__0__Impl_in_rule__CompoundName__Group_1__012157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CompoundName__Group_1__1_in_rule__CompoundName__Group_1__012160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__CompoundName__Group_1__0__Impl12188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompoundName__Group_1__1__Impl_in_rule__CompoundName__Group_1__112219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompoundName__Group_1__1__Impl12246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProject_in_rule__LedsCodeDSL__ProjectAssignment12284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Project__NameAssignment_112315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfrastructureBlock_in_rule__Project__InfrastructureBlockAssignment_312346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceBlock_in_rule__Project__InterfaceBlockAssignment_412377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplicationBlock_in_rule__Project__ApplicationBlockAssignment_512408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainBlock_in_rule__Project__DomainBlockAssignment_612439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InterfaceBlock__NameAssignment_112470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceApplication_in_rule__InterfaceBlock__InterfaceApplicationAssignment_312501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceApplication__TypeAlternatives_0_0_in_rule__InterfaceApplication__TypeAssignment_012532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InterfaceApplication__NameAssignment_112565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InterfaceApplication__NameAppAssignment_312596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InfrastructureBlock__BasePackageAssignment_412627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InfrastructureBlock__ProjectVersionAssignment_712658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameVersion_in_rule__InfrastructureBlock__LanguageAssignment_1112689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameVersion_in_rule__InfrastructureBlock__FrameworkAssignment_1612720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameVersion_in_rule__InfrastructureBlock__OrmAssignment_2112751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_rule__InfrastructureBlock__DatabaseAssignment_2612782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Database__VersionValueAssignment_212813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Database__NameValueAssignment_612844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Database__UserValueAssignment_1012875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Database__PassValueAssignment_1412906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Database__HostValueAssignment_1812937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Database__EnvValueAssignment_2212968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NameVersion__NameValueAssignment_212999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NameVersion__VersionValueAssignment_613030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ApplicationBlock__NameAssignment_113061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportCompoundName_in_rule__ApplicationBlock__ApplicationDomainAssignment_3_113092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DomainBlock__NameAssignment_113123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__DomainBlock__ModuleAssignment_313154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_113185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceBlock_in_rule__Module__ServiceBlockAssignment_3_013216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityBlock_in_rule__Module__EntityBlockAssignment_3_113247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumBlock_in_rule__Module__EnumBlockAssignment_3_213278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceBlock__NameAssignment_113309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_rule__ServiceBlock__ServiceFieldsAssignment_313340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceMethod__NameAssignment_013371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_rule__ServiceMethod__MethodAcessAssignment_213402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessModifier_in_rule__EntityBlock__AcessModifierAssignment_013433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__EntityBlock__IsAbstractAssignment_113469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EntityBlock__NameAssignment_313508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendBlock_in_rule__EntityBlock__ClassExtendsAssignment_413539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EntityBlock__AttributesAssignment_613570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepository_in_rule__EntityBlock__RepositoryAssignment_713601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessModifier_in_rule__Attribute__AcessModifierAssignment_013632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Attribute__TypeAssignment_113663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_213694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Repository__NameAssignment_113725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepositoryFields_in_rule__Repository__MethodsAssignment_313756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RepositoryFields__NameMethodAssignment_013787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodParameter_in_rule__RepositoryFields__MethodsParametersAssignment_213818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__RepositoryFields__ReturnTypeAssignment_513849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumBlock__NameAssignment_113880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumBlock__ValuesAssignment_313911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumBlock__ValuesAssignment_4_113942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndAttribute_in_rule__MethodParameter__TypeAndAttrAssignment_013973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndAttribute_in_rule__MethodParameter__TypeAndAttrAssignment_1_114004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__TypeAndAttribute__TypeAssignment_014035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeAndAttribute__NameAssignment_114066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_rule__ExtendBlock__ValuesAssignment_114097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundName_in_rule__ExtendBlock__ValuesAssignment_2_114128 = new BitSet(new long[]{0x0000000000000002L});

}