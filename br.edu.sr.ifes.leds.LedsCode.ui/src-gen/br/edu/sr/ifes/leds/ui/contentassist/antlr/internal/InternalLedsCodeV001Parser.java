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
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:69:1: ruleLedsCodeDSL : ( ( rule__LedsCodeDSL__Alternatives ) ) ;
    public final void ruleLedsCodeDSL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:73:2: ( ( ( rule__LedsCodeDSL__Alternatives ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:74:1: ( ( rule__LedsCodeDSL__Alternatives ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:74:1: ( ( rule__LedsCodeDSL__Alternatives ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:75:1: ( rule__LedsCodeDSL__Alternatives )
            {
             before(grammarAccess.getLedsCodeDSLAccess().getAlternatives()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:76:1: ( rule__LedsCodeDSL__Alternatives )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:76:2: rule__LedsCodeDSL__Alternatives
            {
            pushFollow(FOLLOW_rule__LedsCodeDSL__Alternatives_in_ruleLedsCodeDSL94);
            rule__LedsCodeDSL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLedsCodeDSLAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleApplication"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:88:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:89:1: ( ruleApplication EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:90:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication121);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication128); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:97:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:101:2: ( ( ( rule__Application__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:102:1: ( ( rule__Application__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:102:1: ( ( rule__Application__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:103:1: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:104:1: ( rule__Application__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:104:2: rule__Application__Group__0
            {
            pushFollow(FOLLOW_rule__Application__Group__0_in_ruleApplication154);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleModuleAplication"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:116:1: entryRuleModuleAplication : ruleModuleAplication EOF ;
    public final void entryRuleModuleAplication() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:117:1: ( ruleModuleAplication EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:118:1: ruleModuleAplication EOF
            {
             before(grammarAccess.getModuleAplicationRule()); 
            pushFollow(FOLLOW_ruleModuleAplication_in_entryRuleModuleAplication181);
            ruleModuleAplication();

            state._fsp--;

             after(grammarAccess.getModuleAplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleAplication188); 

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
    // $ANTLR end "entryRuleModuleAplication"


    // $ANTLR start "ruleModuleAplication"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:125:1: ruleModuleAplication : ( ( rule__ModuleAplication__Group__0 ) ) ;
    public final void ruleModuleAplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:129:2: ( ( ( rule__ModuleAplication__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:130:1: ( ( rule__ModuleAplication__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:130:1: ( ( rule__ModuleAplication__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:131:1: ( rule__ModuleAplication__Group__0 )
            {
             before(grammarAccess.getModuleAplicationAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:132:1: ( rule__ModuleAplication__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:132:2: rule__ModuleAplication__Group__0
            {
            pushFollow(FOLLOW_rule__ModuleAplication__Group__0_in_ruleModuleAplication214);
            rule__ModuleAplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleAplication"


    // $ANTLR start "entryRuleNameApplication"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:144:1: entryRuleNameApplication : ruleNameApplication EOF ;
    public final void entryRuleNameApplication() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:145:1: ( ruleNameApplication EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:146:1: ruleNameApplication EOF
            {
             before(grammarAccess.getNameApplicationRule()); 
            pushFollow(FOLLOW_ruleNameApplication_in_entryRuleNameApplication241);
            ruleNameApplication();

            state._fsp--;

             after(grammarAccess.getNameApplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameApplication248); 

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
    // $ANTLR end "entryRuleNameApplication"


    // $ANTLR start "ruleNameApplication"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:153:1: ruleNameApplication : ( ( rule__NameApplication__Group__0 ) ) ;
    public final void ruleNameApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:157:2: ( ( ( rule__NameApplication__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:158:1: ( ( rule__NameApplication__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:158:1: ( ( rule__NameApplication__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:159:1: ( rule__NameApplication__Group__0 )
            {
             before(grammarAccess.getNameApplicationAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:160:1: ( rule__NameApplication__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:160:2: rule__NameApplication__Group__0
            {
            pushFollow(FOLLOW_rule__NameApplication__Group__0_in_ruleNameApplication274);
            rule__NameApplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameApplication"


    // $ANTLR start "entryRuleLanguage"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:172:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:173:1: ( ruleLanguage EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:174:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage301);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage308); 

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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:181:1: ruleLanguage : ( ( rule__Language__Group__0 ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:185:2: ( ( ( rule__Language__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:186:1: ( ( rule__Language__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:186:1: ( ( rule__Language__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:187:1: ( rule__Language__Group__0 )
            {
             before(grammarAccess.getLanguageAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:188:1: ( rule__Language__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:188:2: rule__Language__Group__0
            {
            pushFollow(FOLLOW_rule__Language__Group__0_in_ruleLanguage334);
            rule__Language__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleFramework"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:200:1: entryRuleFramework : ruleFramework EOF ;
    public final void entryRuleFramework() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:201:1: ( ruleFramework EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:202:1: ruleFramework EOF
            {
             before(grammarAccess.getFrameworkRule()); 
            pushFollow(FOLLOW_ruleFramework_in_entryRuleFramework361);
            ruleFramework();

            state._fsp--;

             after(grammarAccess.getFrameworkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFramework368); 

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
    // $ANTLR end "entryRuleFramework"


    // $ANTLR start "ruleFramework"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:209:1: ruleFramework : ( ( rule__Framework__Group__0 ) ) ;
    public final void ruleFramework() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:213:2: ( ( ( rule__Framework__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:214:1: ( ( rule__Framework__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:214:1: ( ( rule__Framework__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:215:1: ( rule__Framework__Group__0 )
            {
             before(grammarAccess.getFrameworkAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:216:1: ( rule__Framework__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:216:2: rule__Framework__Group__0
            {
            pushFollow(FOLLOW_rule__Framework__Group__0_in_ruleFramework394);
            rule__Framework__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrameworkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFramework"


    // $ANTLR start "entryRuleORM"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:228:1: entryRuleORM : ruleORM EOF ;
    public final void entryRuleORM() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:229:1: ( ruleORM EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:230:1: ruleORM EOF
            {
             before(grammarAccess.getORMRule()); 
            pushFollow(FOLLOW_ruleORM_in_entryRuleORM421);
            ruleORM();

            state._fsp--;

             after(grammarAccess.getORMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleORM428); 

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
    // $ANTLR end "entryRuleORM"


    // $ANTLR start "ruleORM"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:237:1: ruleORM : ( ( rule__ORM__Group__0 ) ) ;
    public final void ruleORM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:241:2: ( ( ( rule__ORM__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:242:1: ( ( rule__ORM__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:242:1: ( ( rule__ORM__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:243:1: ( rule__ORM__Group__0 )
            {
             before(grammarAccess.getORMAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:244:1: ( rule__ORM__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:244:2: rule__ORM__Group__0
            {
            pushFollow(FOLLOW_rule__ORM__Group__0_in_ruleORM454);
            rule__ORM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getORMAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleORM"


    // $ANTLR start "entryRuleDataBase"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:256:1: entryRuleDataBase : ruleDataBase EOF ;
    public final void entryRuleDataBase() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:257:1: ( ruleDataBase EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:258:1: ruleDataBase EOF
            {
             before(grammarAccess.getDataBaseRule()); 
            pushFollow(FOLLOW_ruleDataBase_in_entryRuleDataBase481);
            ruleDataBase();

            state._fsp--;

             after(grammarAccess.getDataBaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataBase488); 

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
    // $ANTLR end "entryRuleDataBase"


    // $ANTLR start "ruleDataBase"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:265:1: ruleDataBase : ( ( rule__DataBase__Group__0 ) ) ;
    public final void ruleDataBase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:269:2: ( ( ( rule__DataBase__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:270:1: ( ( rule__DataBase__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:270:1: ( ( rule__DataBase__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:271:1: ( rule__DataBase__Group__0 )
            {
             before(grammarAccess.getDataBaseAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:272:1: ( rule__DataBase__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:272:2: rule__DataBase__Group__0
            {
            pushFollow(FOLLOW_rule__DataBase__Group__0_in_ruleDataBase514);
            rule__DataBase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataBaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataBase"


    // $ANTLR start "entryRuleDictionary"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:284:1: entryRuleDictionary : ruleDictionary EOF ;
    public final void entryRuleDictionary() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:285:1: ( ruleDictionary EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:286:1: ruleDictionary EOF
            {
             before(grammarAccess.getDictionaryRule()); 
            pushFollow(FOLLOW_ruleDictionary_in_entryRuleDictionary541);
            ruleDictionary();

            state._fsp--;

             after(grammarAccess.getDictionaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionary548); 

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
    // $ANTLR end "entryRuleDictionary"


    // $ANTLR start "ruleDictionary"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:293:1: ruleDictionary : ( ( rule__Dictionary__Group__0 ) ) ;
    public final void ruleDictionary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:297:2: ( ( ( rule__Dictionary__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:298:1: ( ( rule__Dictionary__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:298:1: ( ( rule__Dictionary__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:299:1: ( rule__Dictionary__Group__0 )
            {
             before(grammarAccess.getDictionaryAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:300:1: ( rule__Dictionary__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:300:2: rule__Dictionary__Group__0
            {
            pushFollow(FOLLOW_rule__Dictionary__Group__0_in_ruleDictionary574);
            rule__Dictionary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDictionary"


    // $ANTLR start "entryRuleKeyValue"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:312:1: entryRuleKeyValue : ruleKeyValue EOF ;
    public final void entryRuleKeyValue() throws RecognitionException {
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:313:1: ( ruleKeyValue EOF )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:314:1: ruleKeyValue EOF
            {
             before(grammarAccess.getKeyValueRule()); 
            pushFollow(FOLLOW_ruleKeyValue_in_entryRuleKeyValue601);
            ruleKeyValue();

            state._fsp--;

             after(grammarAccess.getKeyValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyValue608); 

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
    // $ANTLR end "entryRuleKeyValue"


    // $ANTLR start "ruleKeyValue"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:321:1: ruleKeyValue : ( ( rule__KeyValue__Group__0 ) ) ;
    public final void ruleKeyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:325:2: ( ( ( rule__KeyValue__Group__0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:326:1: ( ( rule__KeyValue__Group__0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:326:1: ( ( rule__KeyValue__Group__0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:327:1: ( rule__KeyValue__Group__0 )
            {
             before(grammarAccess.getKeyValueAccess().getGroup()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:328:1: ( rule__KeyValue__Group__0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:328:2: rule__KeyValue__Group__0
            {
            pushFollow(FOLLOW_rule__KeyValue__Group__0_in_ruleKeyValue634);
            rule__KeyValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyValue"


    // $ANTLR start "rule__LedsCodeDSL__Alternatives"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:340:1: rule__LedsCodeDSL__Alternatives : ( ( ( rule__LedsCodeDSL__ApplicationAssignment_0 ) ) | ( ( ( ruleModuleAplication ) ) ( ( ruleModuleAplication )* ) ) );
    public final void rule__LedsCodeDSL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:344:1: ( ( ( rule__LedsCodeDSL__ApplicationAssignment_0 ) ) | ( ( ( ruleModuleAplication ) ) ( ( ruleModuleAplication )* ) ) )
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
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:345:1: ( ( rule__LedsCodeDSL__ApplicationAssignment_0 ) )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:345:1: ( ( rule__LedsCodeDSL__ApplicationAssignment_0 ) )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:346:1: ( rule__LedsCodeDSL__ApplicationAssignment_0 )
                    {
                     before(grammarAccess.getLedsCodeDSLAccess().getApplicationAssignment_0()); 
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:347:1: ( rule__LedsCodeDSL__ApplicationAssignment_0 )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:347:2: rule__LedsCodeDSL__ApplicationAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LedsCodeDSL__ApplicationAssignment_0_in_rule__LedsCodeDSL__Alternatives670);
                    rule__LedsCodeDSL__ApplicationAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLedsCodeDSLAccess().getApplicationAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:351:6: ( ( ( ruleModuleAplication ) ) ( ( ruleModuleAplication )* ) )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:351:6: ( ( ( ruleModuleAplication ) ) ( ( ruleModuleAplication )* ) )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:352:1: ( ( ruleModuleAplication ) ) ( ( ruleModuleAplication )* )
                    {
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:352:1: ( ( ruleModuleAplication ) )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:353:1: ( ruleModuleAplication )
                    {
                     before(grammarAccess.getLedsCodeDSLAccess().getModuleAplicationParserRuleCall_1()); 
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:354:1: ( ruleModuleAplication )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:354:3: ruleModuleAplication
                    {
                    pushFollow(FOLLOW_ruleModuleAplication_in_rule__LedsCodeDSL__Alternatives691);
                    ruleModuleAplication();

                    state._fsp--;


                    }

                     after(grammarAccess.getLedsCodeDSLAccess().getModuleAplicationParserRuleCall_1()); 

                    }

                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:357:1: ( ( ruleModuleAplication )* )
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:358:1: ( ruleModuleAplication )*
                    {
                     before(grammarAccess.getLedsCodeDSLAccess().getModuleAplicationParserRuleCall_1()); 
                    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:359:1: ( ruleModuleAplication )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:359:3: ruleModuleAplication
                    	    {
                    	    pushFollow(FOLLOW_ruleModuleAplication_in_rule__LedsCodeDSL__Alternatives704);
                    	    ruleModuleAplication();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getLedsCodeDSLAccess().getModuleAplicationParserRuleCall_1()); 

                    }


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
    // $ANTLR end "rule__LedsCodeDSL__Alternatives"


    // $ANTLR start "rule__Application__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:371:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:375:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:376:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__0738);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__1_in_rule__Application__Group__0741);
            rule__Application__Group__1();

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
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:383:1: rule__Application__Group__0__Impl : ( 'app' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:387:1: ( ( 'app' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:388:1: ( 'app' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:388:1: ( 'app' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:389:1: 'app'
            {
             before(grammarAccess.getApplicationAccess().getAppKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Application__Group__0__Impl769); 
             after(grammarAccess.getApplicationAccess().getAppKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:402:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:406:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:407:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__1800);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__2_in_rule__Application__Group__1803);
            rule__Application__Group__2();

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
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:414:1: rule__Application__Group__1__Impl : ( '{' ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:418:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:419:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:419:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:420:1: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Application__Group__1__Impl831); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:433:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:437:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:438:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__2862);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__3_in_rule__Application__Group__2865);
            rule__Application__Group__3();

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
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:445:1: rule__Application__Group__2__Impl : ( ( rule__Application__NameApplicationAssignment_2 ) ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:449:1: ( ( ( rule__Application__NameApplicationAssignment_2 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:450:1: ( ( rule__Application__NameApplicationAssignment_2 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:450:1: ( ( rule__Application__NameApplicationAssignment_2 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:451:1: ( rule__Application__NameApplicationAssignment_2 )
            {
             before(grammarAccess.getApplicationAccess().getNameApplicationAssignment_2()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:452:1: ( rule__Application__NameApplicationAssignment_2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:452:2: rule__Application__NameApplicationAssignment_2
            {
            pushFollow(FOLLOW_rule__Application__NameApplicationAssignment_2_in_rule__Application__Group__2__Impl892);
            rule__Application__NameApplicationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameApplicationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:462:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:466:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:467:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__3922);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__4_in_rule__Application__Group__3925);
            rule__Application__Group__4();

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
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:474:1: rule__Application__Group__3__Impl : ( ( rule__Application__LanguageAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:478:1: ( ( ( rule__Application__LanguageAssignment_3 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:479:1: ( ( rule__Application__LanguageAssignment_3 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:479:1: ( ( rule__Application__LanguageAssignment_3 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:480:1: ( rule__Application__LanguageAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getLanguageAssignment_3()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:481:1: ( rule__Application__LanguageAssignment_3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:481:2: rule__Application__LanguageAssignment_3
            {
            pushFollow(FOLLOW_rule__Application__LanguageAssignment_3_in_rule__Application__Group__3__Impl952);
            rule__Application__LanguageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getLanguageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:491:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:495:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:496:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__4982);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__5_in_rule__Application__Group__4985);
            rule__Application__Group__5();

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
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:503:1: rule__Application__Group__4__Impl : ( ( rule__Application__FrameworkAssignment_4 ) ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:507:1: ( ( ( rule__Application__FrameworkAssignment_4 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:508:1: ( ( rule__Application__FrameworkAssignment_4 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:508:1: ( ( rule__Application__FrameworkAssignment_4 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:509:1: ( rule__Application__FrameworkAssignment_4 )
            {
             before(grammarAccess.getApplicationAccess().getFrameworkAssignment_4()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:510:1: ( rule__Application__FrameworkAssignment_4 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:510:2: rule__Application__FrameworkAssignment_4
            {
            pushFollow(FOLLOW_rule__Application__FrameworkAssignment_4_in_rule__Application__Group__4__Impl1012);
            rule__Application__FrameworkAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getFrameworkAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:520:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:524:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:525:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__51042);
            rule__Application__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__6_in_rule__Application__Group__51045);
            rule__Application__Group__6();

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
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:532:1: rule__Application__Group__5__Impl : ( ( rule__Application__OrmAssignment_5 ) ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:536:1: ( ( ( rule__Application__OrmAssignment_5 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:537:1: ( ( rule__Application__OrmAssignment_5 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:537:1: ( ( rule__Application__OrmAssignment_5 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:538:1: ( rule__Application__OrmAssignment_5 )
            {
             before(grammarAccess.getApplicationAccess().getOrmAssignment_5()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:539:1: ( rule__Application__OrmAssignment_5 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:539:2: rule__Application__OrmAssignment_5
            {
            pushFollow(FOLLOW_rule__Application__OrmAssignment_5_in_rule__Application__Group__5__Impl1072);
            rule__Application__OrmAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getOrmAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group__6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:549:1: rule__Application__Group__6 : rule__Application__Group__6__Impl rule__Application__Group__7 ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:553:1: ( rule__Application__Group__6__Impl rule__Application__Group__7 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:554:2: rule__Application__Group__6__Impl rule__Application__Group__7
            {
            pushFollow(FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__61102);
            rule__Application__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__7_in_rule__Application__Group__61105);
            rule__Application__Group__7();

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
    // $ANTLR end "rule__Application__Group__6"


    // $ANTLR start "rule__Application__Group__6__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:561:1: rule__Application__Group__6__Impl : ( ( rule__Application__DatabaseAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:565:1: ( ( ( rule__Application__DatabaseAssignment_6 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:566:1: ( ( rule__Application__DatabaseAssignment_6 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:566:1: ( ( rule__Application__DatabaseAssignment_6 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:567:1: ( rule__Application__DatabaseAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getDatabaseAssignment_6()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:568:1: ( rule__Application__DatabaseAssignment_6 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:568:2: rule__Application__DatabaseAssignment_6
            {
            pushFollow(FOLLOW_rule__Application__DatabaseAssignment_6_in_rule__Application__Group__6__Impl1132);
            rule__Application__DatabaseAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getDatabaseAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__6__Impl"


    // $ANTLR start "rule__Application__Group__7"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:578:1: rule__Application__Group__7 : rule__Application__Group__7__Impl rule__Application__Group__8 ;
    public final void rule__Application__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:582:1: ( rule__Application__Group__7__Impl rule__Application__Group__8 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:583:2: rule__Application__Group__7__Impl rule__Application__Group__8
            {
            pushFollow(FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__71162);
            rule__Application__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Application__Group__8_in_rule__Application__Group__71165);
            rule__Application__Group__8();

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
    // $ANTLR end "rule__Application__Group__7"


    // $ANTLR start "rule__Application__Group__7__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:590:1: rule__Application__Group__7__Impl : ( ruleModuleAplication ) ;
    public final void rule__Application__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:594:1: ( ( ruleModuleAplication ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:595:1: ( ruleModuleAplication )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:595:1: ( ruleModuleAplication )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:596:1: ruleModuleAplication
            {
             before(grammarAccess.getApplicationAccess().getModuleAplicationParserRuleCall_7()); 
            pushFollow(FOLLOW_ruleModuleAplication_in_rule__Application__Group__7__Impl1192);
            ruleModuleAplication();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getModuleAplicationParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__7__Impl"


    // $ANTLR start "rule__Application__Group__8"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:607:1: rule__Application__Group__8 : rule__Application__Group__8__Impl ;
    public final void rule__Application__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:611:1: ( rule__Application__Group__8__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:612:2: rule__Application__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Application__Group__8__Impl_in_rule__Application__Group__81221);
            rule__Application__Group__8__Impl();

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
    // $ANTLR end "rule__Application__Group__8"


    // $ANTLR start "rule__Application__Group__8__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:618:1: rule__Application__Group__8__Impl : ( '}' ) ;
    public final void rule__Application__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:622:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:623:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:623:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:624:1: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__Application__Group__8__Impl1249); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__8__Impl"


    // $ANTLR start "rule__ModuleAplication__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:655:1: rule__ModuleAplication__Group__0 : rule__ModuleAplication__Group__0__Impl rule__ModuleAplication__Group__1 ;
    public final void rule__ModuleAplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:659:1: ( rule__ModuleAplication__Group__0__Impl rule__ModuleAplication__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:660:2: rule__ModuleAplication__Group__0__Impl rule__ModuleAplication__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleAplication__Group__0__Impl_in_rule__ModuleAplication__Group__01298);
            rule__ModuleAplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleAplication__Group__1_in_rule__ModuleAplication__Group__01301);
            rule__ModuleAplication__Group__1();

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
    // $ANTLR end "rule__ModuleAplication__Group__0"


    // $ANTLR start "rule__ModuleAplication__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:667:1: rule__ModuleAplication__Group__0__Impl : ( 'module' ) ;
    public final void rule__ModuleAplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:671:1: ( ( 'module' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:672:1: ( 'module' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:672:1: ( 'module' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:673:1: 'module'
            {
             before(grammarAccess.getModuleAplicationAccess().getModuleKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__ModuleAplication__Group__0__Impl1329); 
             after(grammarAccess.getModuleAplicationAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleAplication__Group__0__Impl"


    // $ANTLR start "rule__ModuleAplication__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:686:1: rule__ModuleAplication__Group__1 : rule__ModuleAplication__Group__1__Impl rule__ModuleAplication__Group__2 ;
    public final void rule__ModuleAplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:690:1: ( rule__ModuleAplication__Group__1__Impl rule__ModuleAplication__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:691:2: rule__ModuleAplication__Group__1__Impl rule__ModuleAplication__Group__2
            {
            pushFollow(FOLLOW_rule__ModuleAplication__Group__1__Impl_in_rule__ModuleAplication__Group__11360);
            rule__ModuleAplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleAplication__Group__2_in_rule__ModuleAplication__Group__11363);
            rule__ModuleAplication__Group__2();

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
    // $ANTLR end "rule__ModuleAplication__Group__1"


    // $ANTLR start "rule__ModuleAplication__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:698:1: rule__ModuleAplication__Group__1__Impl : ( '{' ) ;
    public final void rule__ModuleAplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:702:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:703:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:703:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:704:1: '{'
            {
             before(grammarAccess.getModuleAplicationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__ModuleAplication__Group__1__Impl1391); 
             after(grammarAccess.getModuleAplicationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleAplication__Group__1__Impl"


    // $ANTLR start "rule__ModuleAplication__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:717:1: rule__ModuleAplication__Group__2 : rule__ModuleAplication__Group__2__Impl ;
    public final void rule__ModuleAplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:721:1: ( rule__ModuleAplication__Group__2__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:722:2: rule__ModuleAplication__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModuleAplication__Group__2__Impl_in_rule__ModuleAplication__Group__21422);
            rule__ModuleAplication__Group__2__Impl();

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
    // $ANTLR end "rule__ModuleAplication__Group__2"


    // $ANTLR start "rule__ModuleAplication__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:728:1: rule__ModuleAplication__Group__2__Impl : ( '}' ) ;
    public final void rule__ModuleAplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:732:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:733:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:733:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:734:1: '}'
            {
             before(grammarAccess.getModuleAplicationAccess().getRightCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__ModuleAplication__Group__2__Impl1450); 
             after(grammarAccess.getModuleAplicationAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleAplication__Group__2__Impl"


    // $ANTLR start "rule__NameApplication__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:753:1: rule__NameApplication__Group__0 : rule__NameApplication__Group__0__Impl rule__NameApplication__Group__1 ;
    public final void rule__NameApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:757:1: ( rule__NameApplication__Group__0__Impl rule__NameApplication__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:758:2: rule__NameApplication__Group__0__Impl rule__NameApplication__Group__1
            {
            pushFollow(FOLLOW_rule__NameApplication__Group__0__Impl_in_rule__NameApplication__Group__01487);
            rule__NameApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameApplication__Group__1_in_rule__NameApplication__Group__01490);
            rule__NameApplication__Group__1();

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
    // $ANTLR end "rule__NameApplication__Group__0"


    // $ANTLR start "rule__NameApplication__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:765:1: rule__NameApplication__Group__0__Impl : ( 'name' ) ;
    public final void rule__NameApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:769:1: ( ( 'name' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:770:1: ( 'name' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:770:1: ( 'name' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:771:1: 'name'
            {
             before(grammarAccess.getNameApplicationAccess().getNameKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__NameApplication__Group__0__Impl1518); 
             after(grammarAccess.getNameApplicationAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameApplication__Group__0__Impl"


    // $ANTLR start "rule__NameApplication__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:784:1: rule__NameApplication__Group__1 : rule__NameApplication__Group__1__Impl rule__NameApplication__Group__2 ;
    public final void rule__NameApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:788:1: ( rule__NameApplication__Group__1__Impl rule__NameApplication__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:789:2: rule__NameApplication__Group__1__Impl rule__NameApplication__Group__2
            {
            pushFollow(FOLLOW_rule__NameApplication__Group__1__Impl_in_rule__NameApplication__Group__11549);
            rule__NameApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NameApplication__Group__2_in_rule__NameApplication__Group__11552);
            rule__NameApplication__Group__2();

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
    // $ANTLR end "rule__NameApplication__Group__1"


    // $ANTLR start "rule__NameApplication__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:796:1: rule__NameApplication__Group__1__Impl : ( '=' ) ;
    public final void rule__NameApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:800:1: ( ( '=' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:801:1: ( '=' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:801:1: ( '=' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:802:1: '='
            {
             before(grammarAccess.getNameApplicationAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__NameApplication__Group__1__Impl1580); 
             after(grammarAccess.getNameApplicationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameApplication__Group__1__Impl"


    // $ANTLR start "rule__NameApplication__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:815:1: rule__NameApplication__Group__2 : rule__NameApplication__Group__2__Impl ;
    public final void rule__NameApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:819:1: ( rule__NameApplication__Group__2__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:820:2: rule__NameApplication__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NameApplication__Group__2__Impl_in_rule__NameApplication__Group__21611);
            rule__NameApplication__Group__2__Impl();

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
    // $ANTLR end "rule__NameApplication__Group__2"


    // $ANTLR start "rule__NameApplication__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:826:1: rule__NameApplication__Group__2__Impl : ( ( rule__NameApplication__NameAssignment_2 ) ) ;
    public final void rule__NameApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:830:1: ( ( ( rule__NameApplication__NameAssignment_2 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:831:1: ( ( rule__NameApplication__NameAssignment_2 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:831:1: ( ( rule__NameApplication__NameAssignment_2 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:832:1: ( rule__NameApplication__NameAssignment_2 )
            {
             before(grammarAccess.getNameApplicationAccess().getNameAssignment_2()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:833:1: ( rule__NameApplication__NameAssignment_2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:833:2: rule__NameApplication__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__NameApplication__NameAssignment_2_in_rule__NameApplication__Group__2__Impl1638);
            rule__NameApplication__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNameApplicationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameApplication__Group__2__Impl"


    // $ANTLR start "rule__Language__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:849:1: rule__Language__Group__0 : rule__Language__Group__0__Impl rule__Language__Group__1 ;
    public final void rule__Language__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:853:1: ( rule__Language__Group__0__Impl rule__Language__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:854:2: rule__Language__Group__0__Impl rule__Language__Group__1
            {
            pushFollow(FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__01674);
            rule__Language__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__1_in_rule__Language__Group__01677);
            rule__Language__Group__1();

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
    // $ANTLR end "rule__Language__Group__0"


    // $ANTLR start "rule__Language__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:861:1: rule__Language__Group__0__Impl : ( 'language' ) ;
    public final void rule__Language__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:865:1: ( ( 'language' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:866:1: ( 'language' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:866:1: ( 'language' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:867:1: 'language'
            {
             before(grammarAccess.getLanguageAccess().getLanguageKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Language__Group__0__Impl1705); 
             after(grammarAccess.getLanguageAccess().getLanguageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__0__Impl"


    // $ANTLR start "rule__Language__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:880:1: rule__Language__Group__1 : rule__Language__Group__1__Impl ;
    public final void rule__Language__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:884:1: ( rule__Language__Group__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:885:2: rule__Language__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__11736);
            rule__Language__Group__1__Impl();

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
    // $ANTLR end "rule__Language__Group__1"


    // $ANTLR start "rule__Language__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:891:1: rule__Language__Group__1__Impl : ( ruleDictionary ) ;
    public final void rule__Language__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:895:1: ( ( ruleDictionary ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:896:1: ( ruleDictionary )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:896:1: ( ruleDictionary )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:897:1: ruleDictionary
            {
             before(grammarAccess.getLanguageAccess().getDictionaryParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleDictionary_in_rule__Language__Group__1__Impl1763);
            ruleDictionary();

            state._fsp--;

             after(grammarAccess.getLanguageAccess().getDictionaryParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__Group__1__Impl"


    // $ANTLR start "rule__Framework__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:912:1: rule__Framework__Group__0 : rule__Framework__Group__0__Impl rule__Framework__Group__1 ;
    public final void rule__Framework__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:916:1: ( rule__Framework__Group__0__Impl rule__Framework__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:917:2: rule__Framework__Group__0__Impl rule__Framework__Group__1
            {
            pushFollow(FOLLOW_rule__Framework__Group__0__Impl_in_rule__Framework__Group__01796);
            rule__Framework__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Framework__Group__1_in_rule__Framework__Group__01799);
            rule__Framework__Group__1();

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
    // $ANTLR end "rule__Framework__Group__0"


    // $ANTLR start "rule__Framework__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:924:1: rule__Framework__Group__0__Impl : ( 'framework' ) ;
    public final void rule__Framework__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:928:1: ( ( 'framework' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:929:1: ( 'framework' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:929:1: ( 'framework' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:930:1: 'framework'
            {
             before(grammarAccess.getFrameworkAccess().getFrameworkKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Framework__Group__0__Impl1827); 
             after(grammarAccess.getFrameworkAccess().getFrameworkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Framework__Group__0__Impl"


    // $ANTLR start "rule__Framework__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:943:1: rule__Framework__Group__1 : rule__Framework__Group__1__Impl ;
    public final void rule__Framework__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:947:1: ( rule__Framework__Group__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:948:2: rule__Framework__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Framework__Group__1__Impl_in_rule__Framework__Group__11858);
            rule__Framework__Group__1__Impl();

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
    // $ANTLR end "rule__Framework__Group__1"


    // $ANTLR start "rule__Framework__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:954:1: rule__Framework__Group__1__Impl : ( ruleDictionary ) ;
    public final void rule__Framework__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:958:1: ( ( ruleDictionary ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:959:1: ( ruleDictionary )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:959:1: ( ruleDictionary )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:960:1: ruleDictionary
            {
             before(grammarAccess.getFrameworkAccess().getDictionaryParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleDictionary_in_rule__Framework__Group__1__Impl1885);
            ruleDictionary();

            state._fsp--;

             after(grammarAccess.getFrameworkAccess().getDictionaryParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Framework__Group__1__Impl"


    // $ANTLR start "rule__ORM__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:975:1: rule__ORM__Group__0 : rule__ORM__Group__0__Impl rule__ORM__Group__1 ;
    public final void rule__ORM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:979:1: ( rule__ORM__Group__0__Impl rule__ORM__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:980:2: rule__ORM__Group__0__Impl rule__ORM__Group__1
            {
            pushFollow(FOLLOW_rule__ORM__Group__0__Impl_in_rule__ORM__Group__01918);
            rule__ORM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ORM__Group__1_in_rule__ORM__Group__01921);
            rule__ORM__Group__1();

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
    // $ANTLR end "rule__ORM__Group__0"


    // $ANTLR start "rule__ORM__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:987:1: rule__ORM__Group__0__Impl : ( 'orm' ) ;
    public final void rule__ORM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:991:1: ( ( 'orm' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:992:1: ( 'orm' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:992:1: ( 'orm' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:993:1: 'orm'
            {
             before(grammarAccess.getORMAccess().getOrmKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__ORM__Group__0__Impl1949); 
             after(grammarAccess.getORMAccess().getOrmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORM__Group__0__Impl"


    // $ANTLR start "rule__ORM__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1006:1: rule__ORM__Group__1 : rule__ORM__Group__1__Impl ;
    public final void rule__ORM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1010:1: ( rule__ORM__Group__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1011:2: rule__ORM__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ORM__Group__1__Impl_in_rule__ORM__Group__11980);
            rule__ORM__Group__1__Impl();

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
    // $ANTLR end "rule__ORM__Group__1"


    // $ANTLR start "rule__ORM__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1017:1: rule__ORM__Group__1__Impl : ( ruleDictionary ) ;
    public final void rule__ORM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1021:1: ( ( ruleDictionary ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1022:1: ( ruleDictionary )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1022:1: ( ruleDictionary )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1023:1: ruleDictionary
            {
             before(grammarAccess.getORMAccess().getDictionaryParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleDictionary_in_rule__ORM__Group__1__Impl2007);
            ruleDictionary();

            state._fsp--;

             after(grammarAccess.getORMAccess().getDictionaryParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORM__Group__1__Impl"


    // $ANTLR start "rule__DataBase__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1038:1: rule__DataBase__Group__0 : rule__DataBase__Group__0__Impl rule__DataBase__Group__1 ;
    public final void rule__DataBase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1042:1: ( rule__DataBase__Group__0__Impl rule__DataBase__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1043:2: rule__DataBase__Group__0__Impl rule__DataBase__Group__1
            {
            pushFollow(FOLLOW_rule__DataBase__Group__0__Impl_in_rule__DataBase__Group__02040);
            rule__DataBase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataBase__Group__1_in_rule__DataBase__Group__02043);
            rule__DataBase__Group__1();

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
    // $ANTLR end "rule__DataBase__Group__0"


    // $ANTLR start "rule__DataBase__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1050:1: rule__DataBase__Group__0__Impl : ( 'database' ) ;
    public final void rule__DataBase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1054:1: ( ( 'database' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1055:1: ( 'database' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1055:1: ( 'database' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1056:1: 'database'
            {
             before(grammarAccess.getDataBaseAccess().getDatabaseKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__DataBase__Group__0__Impl2071); 
             after(grammarAccess.getDataBaseAccess().getDatabaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBase__Group__0__Impl"


    // $ANTLR start "rule__DataBase__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1069:1: rule__DataBase__Group__1 : rule__DataBase__Group__1__Impl ;
    public final void rule__DataBase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1073:1: ( rule__DataBase__Group__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1074:2: rule__DataBase__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataBase__Group__1__Impl_in_rule__DataBase__Group__12102);
            rule__DataBase__Group__1__Impl();

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
    // $ANTLR end "rule__DataBase__Group__1"


    // $ANTLR start "rule__DataBase__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1080:1: rule__DataBase__Group__1__Impl : ( ruleDictionary ) ;
    public final void rule__DataBase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1084:1: ( ( ruleDictionary ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1085:1: ( ruleDictionary )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1085:1: ( ruleDictionary )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1086:1: ruleDictionary
            {
             before(grammarAccess.getDataBaseAccess().getDictionaryParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleDictionary_in_rule__DataBase__Group__1__Impl2129);
            ruleDictionary();

            state._fsp--;

             after(grammarAccess.getDataBaseAccess().getDictionaryParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataBase__Group__1__Impl"


    // $ANTLR start "rule__Dictionary__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1101:1: rule__Dictionary__Group__0 : rule__Dictionary__Group__0__Impl rule__Dictionary__Group__1 ;
    public final void rule__Dictionary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1105:1: ( rule__Dictionary__Group__0__Impl rule__Dictionary__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1106:2: rule__Dictionary__Group__0__Impl rule__Dictionary__Group__1
            {
            pushFollow(FOLLOW_rule__Dictionary__Group__0__Impl_in_rule__Dictionary__Group__02162);
            rule__Dictionary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dictionary__Group__1_in_rule__Dictionary__Group__02165);
            rule__Dictionary__Group__1();

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
    // $ANTLR end "rule__Dictionary__Group__0"


    // $ANTLR start "rule__Dictionary__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1113:1: rule__Dictionary__Group__0__Impl : ( '{' ) ;
    public final void rule__Dictionary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1117:1: ( ( '{' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1118:1: ( '{' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1118:1: ( '{' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1119:1: '{'
            {
             before(grammarAccess.getDictionaryAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Dictionary__Group__0__Impl2193); 
             after(grammarAccess.getDictionaryAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__0__Impl"


    // $ANTLR start "rule__Dictionary__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1132:1: rule__Dictionary__Group__1 : rule__Dictionary__Group__1__Impl rule__Dictionary__Group__2 ;
    public final void rule__Dictionary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1136:1: ( rule__Dictionary__Group__1__Impl rule__Dictionary__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1137:2: rule__Dictionary__Group__1__Impl rule__Dictionary__Group__2
            {
            pushFollow(FOLLOW_rule__Dictionary__Group__1__Impl_in_rule__Dictionary__Group__12224);
            rule__Dictionary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dictionary__Group__2_in_rule__Dictionary__Group__12227);
            rule__Dictionary__Group__2();

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
    // $ANTLR end "rule__Dictionary__Group__1"


    // $ANTLR start "rule__Dictionary__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1144:1: rule__Dictionary__Group__1__Impl : ( ( rule__Dictionary__ElementsAssignment_1 ) ) ;
    public final void rule__Dictionary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1148:1: ( ( ( rule__Dictionary__ElementsAssignment_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1149:1: ( ( rule__Dictionary__ElementsAssignment_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1149:1: ( ( rule__Dictionary__ElementsAssignment_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1150:1: ( rule__Dictionary__ElementsAssignment_1 )
            {
             before(grammarAccess.getDictionaryAccess().getElementsAssignment_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1151:1: ( rule__Dictionary__ElementsAssignment_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1151:2: rule__Dictionary__ElementsAssignment_1
            {
            pushFollow(FOLLOW_rule__Dictionary__ElementsAssignment_1_in_rule__Dictionary__Group__1__Impl2254);
            rule__Dictionary__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__1__Impl"


    // $ANTLR start "rule__Dictionary__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1161:1: rule__Dictionary__Group__2 : rule__Dictionary__Group__2__Impl rule__Dictionary__Group__3 ;
    public final void rule__Dictionary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1165:1: ( rule__Dictionary__Group__2__Impl rule__Dictionary__Group__3 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1166:2: rule__Dictionary__Group__2__Impl rule__Dictionary__Group__3
            {
            pushFollow(FOLLOW_rule__Dictionary__Group__2__Impl_in_rule__Dictionary__Group__22284);
            rule__Dictionary__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dictionary__Group__3_in_rule__Dictionary__Group__22287);
            rule__Dictionary__Group__3();

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
    // $ANTLR end "rule__Dictionary__Group__2"


    // $ANTLR start "rule__Dictionary__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1173:1: rule__Dictionary__Group__2__Impl : ( ( rule__Dictionary__Group_2__0 )* ) ;
    public final void rule__Dictionary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1177:1: ( ( ( rule__Dictionary__Group_2__0 )* ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1178:1: ( ( rule__Dictionary__Group_2__0 )* )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1178:1: ( ( rule__Dictionary__Group_2__0 )* )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1179:1: ( rule__Dictionary__Group_2__0 )*
            {
             before(grammarAccess.getDictionaryAccess().getGroup_2()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1180:1: ( rule__Dictionary__Group_2__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1180:2: rule__Dictionary__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Dictionary__Group_2__0_in_rule__Dictionary__Group__2__Impl2314);
            	    rule__Dictionary__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDictionaryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__2__Impl"


    // $ANTLR start "rule__Dictionary__Group__3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1190:1: rule__Dictionary__Group__3 : rule__Dictionary__Group__3__Impl ;
    public final void rule__Dictionary__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1194:1: ( rule__Dictionary__Group__3__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1195:2: rule__Dictionary__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Dictionary__Group__3__Impl_in_rule__Dictionary__Group__32345);
            rule__Dictionary__Group__3__Impl();

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
    // $ANTLR end "rule__Dictionary__Group__3"


    // $ANTLR start "rule__Dictionary__Group__3__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1201:1: rule__Dictionary__Group__3__Impl : ( '}' ) ;
    public final void rule__Dictionary__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1205:1: ( ( '}' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1206:1: ( '}' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1206:1: ( '}' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1207:1: '}'
            {
             before(grammarAccess.getDictionaryAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Dictionary__Group__3__Impl2373); 
             after(grammarAccess.getDictionaryAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group__3__Impl"


    // $ANTLR start "rule__Dictionary__Group_2__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1228:1: rule__Dictionary__Group_2__0 : rule__Dictionary__Group_2__0__Impl rule__Dictionary__Group_2__1 ;
    public final void rule__Dictionary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1232:1: ( rule__Dictionary__Group_2__0__Impl rule__Dictionary__Group_2__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1233:2: rule__Dictionary__Group_2__0__Impl rule__Dictionary__Group_2__1
            {
            pushFollow(FOLLOW_rule__Dictionary__Group_2__0__Impl_in_rule__Dictionary__Group_2__02412);
            rule__Dictionary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dictionary__Group_2__1_in_rule__Dictionary__Group_2__02415);
            rule__Dictionary__Group_2__1();

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
    // $ANTLR end "rule__Dictionary__Group_2__0"


    // $ANTLR start "rule__Dictionary__Group_2__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1240:1: rule__Dictionary__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Dictionary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1244:1: ( ( ',' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1245:1: ( ',' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1245:1: ( ',' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1246:1: ','
            {
             before(grammarAccess.getDictionaryAccess().getCommaKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Dictionary__Group_2__0__Impl2443); 
             after(grammarAccess.getDictionaryAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group_2__0__Impl"


    // $ANTLR start "rule__Dictionary__Group_2__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1259:1: rule__Dictionary__Group_2__1 : rule__Dictionary__Group_2__1__Impl ;
    public final void rule__Dictionary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1263:1: ( rule__Dictionary__Group_2__1__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1264:2: rule__Dictionary__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Dictionary__Group_2__1__Impl_in_rule__Dictionary__Group_2__12474);
            rule__Dictionary__Group_2__1__Impl();

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
    // $ANTLR end "rule__Dictionary__Group_2__1"


    // $ANTLR start "rule__Dictionary__Group_2__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1270:1: rule__Dictionary__Group_2__1__Impl : ( ( rule__Dictionary__ElementsAssignment_2_1 ) ) ;
    public final void rule__Dictionary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1274:1: ( ( ( rule__Dictionary__ElementsAssignment_2_1 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1275:1: ( ( rule__Dictionary__ElementsAssignment_2_1 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1275:1: ( ( rule__Dictionary__ElementsAssignment_2_1 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1276:1: ( rule__Dictionary__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getDictionaryAccess().getElementsAssignment_2_1()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1277:1: ( rule__Dictionary__ElementsAssignment_2_1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1277:2: rule__Dictionary__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Dictionary__ElementsAssignment_2_1_in_rule__Dictionary__Group_2__1__Impl2501);
            rule__Dictionary__ElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDictionaryAccess().getElementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__Group_2__1__Impl"


    // $ANTLR start "rule__KeyValue__Group__0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1291:1: rule__KeyValue__Group__0 : rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1 ;
    public final void rule__KeyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1295:1: ( rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1296:2: rule__KeyValue__Group__0__Impl rule__KeyValue__Group__1
            {
            pushFollow(FOLLOW_rule__KeyValue__Group__0__Impl_in_rule__KeyValue__Group__02535);
            rule__KeyValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KeyValue__Group__1_in_rule__KeyValue__Group__02538);
            rule__KeyValue__Group__1();

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
    // $ANTLR end "rule__KeyValue__Group__0"


    // $ANTLR start "rule__KeyValue__Group__0__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1303:1: rule__KeyValue__Group__0__Impl : ( ( rule__KeyValue__KeyAssignment_0 ) ) ;
    public final void rule__KeyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1307:1: ( ( ( rule__KeyValue__KeyAssignment_0 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1308:1: ( ( rule__KeyValue__KeyAssignment_0 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1308:1: ( ( rule__KeyValue__KeyAssignment_0 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1309:1: ( rule__KeyValue__KeyAssignment_0 )
            {
             before(grammarAccess.getKeyValueAccess().getKeyAssignment_0()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1310:1: ( rule__KeyValue__KeyAssignment_0 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1310:2: rule__KeyValue__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__KeyValue__KeyAssignment_0_in_rule__KeyValue__Group__0__Impl2565);
            rule__KeyValue__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__Group__0__Impl"


    // $ANTLR start "rule__KeyValue__Group__1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1320:1: rule__KeyValue__Group__1 : rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2 ;
    public final void rule__KeyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1324:1: ( rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1325:2: rule__KeyValue__Group__1__Impl rule__KeyValue__Group__2
            {
            pushFollow(FOLLOW_rule__KeyValue__Group__1__Impl_in_rule__KeyValue__Group__12595);
            rule__KeyValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__KeyValue__Group__2_in_rule__KeyValue__Group__12598);
            rule__KeyValue__Group__2();

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
    // $ANTLR end "rule__KeyValue__Group__1"


    // $ANTLR start "rule__KeyValue__Group__1__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1332:1: rule__KeyValue__Group__1__Impl : ( ':' ) ;
    public final void rule__KeyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1336:1: ( ( ':' ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1337:1: ( ':' )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1337:1: ( ':' )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1338:1: ':'
            {
             before(grammarAccess.getKeyValueAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__KeyValue__Group__1__Impl2626); 
             after(grammarAccess.getKeyValueAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__Group__1__Impl"


    // $ANTLR start "rule__KeyValue__Group__2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1351:1: rule__KeyValue__Group__2 : rule__KeyValue__Group__2__Impl ;
    public final void rule__KeyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1355:1: ( rule__KeyValue__Group__2__Impl )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1356:2: rule__KeyValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyValue__Group__2__Impl_in_rule__KeyValue__Group__22657);
            rule__KeyValue__Group__2__Impl();

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
    // $ANTLR end "rule__KeyValue__Group__2"


    // $ANTLR start "rule__KeyValue__Group__2__Impl"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1362:1: rule__KeyValue__Group__2__Impl : ( ( rule__KeyValue__ValueAssignment_2 ) ) ;
    public final void rule__KeyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1366:1: ( ( ( rule__KeyValue__ValueAssignment_2 ) ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1367:1: ( ( rule__KeyValue__ValueAssignment_2 ) )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1367:1: ( ( rule__KeyValue__ValueAssignment_2 ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1368:1: ( rule__KeyValue__ValueAssignment_2 )
            {
             before(grammarAccess.getKeyValueAccess().getValueAssignment_2()); 
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1369:1: ( rule__KeyValue__ValueAssignment_2 )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1369:2: rule__KeyValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyValue__ValueAssignment_2_in_rule__KeyValue__Group__2__Impl2684);
            rule__KeyValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyValueAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__Group__2__Impl"


    // $ANTLR start "rule__LedsCodeDSL__ApplicationAssignment_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1386:1: rule__LedsCodeDSL__ApplicationAssignment_0 : ( ruleApplication ) ;
    public final void rule__LedsCodeDSL__ApplicationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1390:1: ( ( ruleApplication ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1391:1: ( ruleApplication )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1391:1: ( ruleApplication )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1392:1: ruleApplication
            {
             before(grammarAccess.getLedsCodeDSLAccess().getApplicationApplicationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleApplication_in_rule__LedsCodeDSL__ApplicationAssignment_02725);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getLedsCodeDSLAccess().getApplicationApplicationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LedsCodeDSL__ApplicationAssignment_0"


    // $ANTLR start "rule__Application__NameApplicationAssignment_2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1401:1: rule__Application__NameApplicationAssignment_2 : ( ruleNameApplication ) ;
    public final void rule__Application__NameApplicationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1405:1: ( ( ruleNameApplication ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1406:1: ( ruleNameApplication )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1406:1: ( ruleNameApplication )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1407:1: ruleNameApplication
            {
             before(grammarAccess.getApplicationAccess().getNameApplicationNameApplicationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNameApplication_in_rule__Application__NameApplicationAssignment_22756);
            ruleNameApplication();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getNameApplicationNameApplicationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameApplicationAssignment_2"


    // $ANTLR start "rule__Application__LanguageAssignment_3"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1416:1: rule__Application__LanguageAssignment_3 : ( ruleLanguage ) ;
    public final void rule__Application__LanguageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1420:1: ( ( ruleLanguage ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1421:1: ( ruleLanguage )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1421:1: ( ruleLanguage )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1422:1: ruleLanguage
            {
             before(grammarAccess.getApplicationAccess().getLanguageLanguageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLanguage_in_rule__Application__LanguageAssignment_32787);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getLanguageLanguageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__LanguageAssignment_3"


    // $ANTLR start "rule__Application__FrameworkAssignment_4"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1431:1: rule__Application__FrameworkAssignment_4 : ( ruleFramework ) ;
    public final void rule__Application__FrameworkAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1435:1: ( ( ruleFramework ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1436:1: ( ruleFramework )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1436:1: ( ruleFramework )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1437:1: ruleFramework
            {
             before(grammarAccess.getApplicationAccess().getFrameworkFrameworkParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFramework_in_rule__Application__FrameworkAssignment_42818);
            ruleFramework();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getFrameworkFrameworkParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__FrameworkAssignment_4"


    // $ANTLR start "rule__Application__OrmAssignment_5"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1446:1: rule__Application__OrmAssignment_5 : ( ruleORM ) ;
    public final void rule__Application__OrmAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1450:1: ( ( ruleORM ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1451:1: ( ruleORM )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1451:1: ( ruleORM )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1452:1: ruleORM
            {
             before(grammarAccess.getApplicationAccess().getOrmORMParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleORM_in_rule__Application__OrmAssignment_52849);
            ruleORM();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getOrmORMParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__OrmAssignment_5"


    // $ANTLR start "rule__Application__DatabaseAssignment_6"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1461:1: rule__Application__DatabaseAssignment_6 : ( ruleDataBase ) ;
    public final void rule__Application__DatabaseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1465:1: ( ( ruleDataBase ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1466:1: ( ruleDataBase )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1466:1: ( ruleDataBase )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1467:1: ruleDataBase
            {
             before(grammarAccess.getApplicationAccess().getDatabaseDataBaseParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDataBase_in_rule__Application__DatabaseAssignment_62880);
            ruleDataBase();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getDatabaseDataBaseParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__DatabaseAssignment_6"


    // $ANTLR start "rule__NameApplication__NameAssignment_2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1476:1: rule__NameApplication__NameAssignment_2 : ( RULE_UNQUOTED_STRING ) ;
    public final void rule__NameApplication__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1480:1: ( ( RULE_UNQUOTED_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1481:1: ( RULE_UNQUOTED_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1481:1: ( RULE_UNQUOTED_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1482:1: RULE_UNQUOTED_STRING
            {
             before(grammarAccess.getNameApplicationAccess().getNameUNQUOTED_STRINGTerminalRuleCall_2_0()); 
            match(input,RULE_UNQUOTED_STRING,FOLLOW_RULE_UNQUOTED_STRING_in_rule__NameApplication__NameAssignment_22911); 
             after(grammarAccess.getNameApplicationAccess().getNameUNQUOTED_STRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameApplication__NameAssignment_2"


    // $ANTLR start "rule__Dictionary__ElementsAssignment_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1491:1: rule__Dictionary__ElementsAssignment_1 : ( ruleKeyValue ) ;
    public final void rule__Dictionary__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1495:1: ( ( ruleKeyValue ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1496:1: ( ruleKeyValue )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1496:1: ( ruleKeyValue )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1497:1: ruleKeyValue
            {
             before(grammarAccess.getDictionaryAccess().getElementsKeyValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleKeyValue_in_rule__Dictionary__ElementsAssignment_12942);
            ruleKeyValue();

            state._fsp--;

             after(grammarAccess.getDictionaryAccess().getElementsKeyValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__ElementsAssignment_1"


    // $ANTLR start "rule__Dictionary__ElementsAssignment_2_1"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1506:1: rule__Dictionary__ElementsAssignment_2_1 : ( ruleKeyValue ) ;
    public final void rule__Dictionary__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1510:1: ( ( ruleKeyValue ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1511:1: ( ruleKeyValue )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1511:1: ( ruleKeyValue )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1512:1: ruleKeyValue
            {
             before(grammarAccess.getDictionaryAccess().getElementsKeyValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleKeyValue_in_rule__Dictionary__ElementsAssignment_2_12973);
            ruleKeyValue();

            state._fsp--;

             after(grammarAccess.getDictionaryAccess().getElementsKeyValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dictionary__ElementsAssignment_2_1"


    // $ANTLR start "rule__KeyValue__KeyAssignment_0"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1521:1: rule__KeyValue__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__KeyValue__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1525:1: ( ( RULE_ID ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1526:1: ( RULE_ID )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1526:1: ( RULE_ID )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1527:1: RULE_ID
            {
             before(grammarAccess.getKeyValueAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__KeyValue__KeyAssignment_03004); 
             after(grammarAccess.getKeyValueAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__KeyAssignment_0"


    // $ANTLR start "rule__KeyValue__ValueAssignment_2"
    // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1536:1: rule__KeyValue__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__KeyValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1540:1: ( ( RULE_STRING ) )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1541:1: ( RULE_STRING )
            {
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1541:1: ( RULE_STRING )
            // ../br.edu.sr.ifes.leds.LedsCode.ui/src-gen/br/edu/sr/ifes/leds/ui/contentassist/antlr/internal/InternalLedsCodeV001.g:1542:1: RULE_STRING
            {
             before(grammarAccess.getKeyValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__KeyValue__ValueAssignment_23035); 
             after(grammarAccess.getKeyValueAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyValue__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLedsCodeDSL_in_entryRuleLedsCodeDSL61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLedsCodeDSL68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LedsCodeDSL__Alternatives_in_ruleLedsCodeDSL94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__0_in_ruleApplication154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleAplication_in_entryRuleModuleAplication181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleAplication188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleAplication__Group__0_in_ruleModuleAplication214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameApplication_in_entryRuleNameApplication241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameApplication248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameApplication__Group__0_in_ruleNameApplication274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__0_in_ruleLanguage334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFramework_in_entryRuleFramework361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFramework368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Framework__Group__0_in_ruleFramework394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORM_in_entryRuleORM421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleORM428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORM__Group__0_in_ruleORM454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataBase_in_entryRuleDataBase481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataBase488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataBase__Group__0_in_ruleDataBase514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_entryRuleDictionary541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionary548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dictionary__Group__0_in_ruleDictionary574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValue_in_entryRuleKeyValue601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyValue608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValue__Group__0_in_ruleKeyValue634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LedsCodeDSL__ApplicationAssignment_0_in_rule__LedsCodeDSL__Alternatives670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleAplication_in_rule__LedsCodeDSL__Alternatives691 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleModuleAplication_in_rule__LedsCodeDSL__Alternatives704 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Application__Group__0__Impl_in_rule__Application__Group__0738 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Application__Group__1_in_rule__Application__Group__0741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Application__Group__0__Impl769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__1__Impl_in_rule__Application__Group__1800 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Application__Group__2_in_rule__Application__Group__1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Application__Group__1__Impl831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__2__Impl_in_rule__Application__Group__2862 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Application__Group__3_in_rule__Application__Group__2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__NameApplicationAssignment_2_in_rule__Application__Group__2__Impl892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__3__Impl_in_rule__Application__Group__3922 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Application__Group__4_in_rule__Application__Group__3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__LanguageAssignment_3_in_rule__Application__Group__3__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__4__Impl_in_rule__Application__Group__4982 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Application__Group__5_in_rule__Application__Group__4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__FrameworkAssignment_4_in_rule__Application__Group__4__Impl1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__5__Impl_in_rule__Application__Group__51042 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Application__Group__6_in_rule__Application__Group__51045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__OrmAssignment_5_in_rule__Application__Group__5__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__6__Impl_in_rule__Application__Group__61102 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Application__Group__7_in_rule__Application__Group__61105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__DatabaseAssignment_6_in_rule__Application__Group__6__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__7__Impl_in_rule__Application__Group__71162 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Application__Group__8_in_rule__Application__Group__71165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleAplication_in_rule__Application__Group__7__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Application__Group__8__Impl_in_rule__Application__Group__81221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Application__Group__8__Impl1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleAplication__Group__0__Impl_in_rule__ModuleAplication__Group__01298 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ModuleAplication__Group__1_in_rule__ModuleAplication__Group__01301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ModuleAplication__Group__0__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleAplication__Group__1__Impl_in_rule__ModuleAplication__Group__11360 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ModuleAplication__Group__2_in_rule__ModuleAplication__Group__11363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ModuleAplication__Group__1__Impl1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleAplication__Group__2__Impl_in_rule__ModuleAplication__Group__21422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ModuleAplication__Group__2__Impl1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameApplication__Group__0__Impl_in_rule__NameApplication__Group__01487 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__NameApplication__Group__1_in_rule__NameApplication__Group__01490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NameApplication__Group__0__Impl1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameApplication__Group__1__Impl_in_rule__NameApplication__Group__11549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NameApplication__Group__2_in_rule__NameApplication__Group__11552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NameApplication__Group__1__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameApplication__Group__2__Impl_in_rule__NameApplication__Group__21611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameApplication__NameAssignment_2_in_rule__NameApplication__Group__2__Impl1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__01674 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Language__Group__1_in_rule__Language__Group__01677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Language__Group__0__Impl1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__11736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_rule__Language__Group__1__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Framework__Group__0__Impl_in_rule__Framework__Group__01796 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Framework__Group__1_in_rule__Framework__Group__01799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Framework__Group__0__Impl1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Framework__Group__1__Impl_in_rule__Framework__Group__11858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_rule__Framework__Group__1__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORM__Group__0__Impl_in_rule__ORM__Group__01918 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ORM__Group__1_in_rule__ORM__Group__01921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ORM__Group__0__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ORM__Group__1__Impl_in_rule__ORM__Group__11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_rule__ORM__Group__1__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataBase__Group__0__Impl_in_rule__DataBase__Group__02040 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DataBase__Group__1_in_rule__DataBase__Group__02043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataBase__Group__0__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataBase__Group__1__Impl_in_rule__DataBase__Group__12102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_rule__DataBase__Group__1__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dictionary__Group__0__Impl_in_rule__Dictionary__Group__02162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Dictionary__Group__1_in_rule__Dictionary__Group__02165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Dictionary__Group__0__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dictionary__Group__1__Impl_in_rule__Dictionary__Group__12224 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_rule__Dictionary__Group__2_in_rule__Dictionary__Group__12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dictionary__ElementsAssignment_1_in_rule__Dictionary__Group__1__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dictionary__Group__2__Impl_in_rule__Dictionary__Group__22284 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_rule__Dictionary__Group__3_in_rule__Dictionary__Group__22287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dictionary__Group_2__0_in_rule__Dictionary__Group__2__Impl2314 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Dictionary__Group__3__Impl_in_rule__Dictionary__Group__32345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Dictionary__Group__3__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dictionary__Group_2__0__Impl_in_rule__Dictionary__Group_2__02412 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Dictionary__Group_2__1_in_rule__Dictionary__Group_2__02415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Dictionary__Group_2__0__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dictionary__Group_2__1__Impl_in_rule__Dictionary__Group_2__12474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dictionary__ElementsAssignment_2_1_in_rule__Dictionary__Group_2__1__Impl2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValue__Group__0__Impl_in_rule__KeyValue__Group__02535 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__KeyValue__Group__1_in_rule__KeyValue__Group__02538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValue__KeyAssignment_0_in_rule__KeyValue__Group__0__Impl2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValue__Group__1__Impl_in_rule__KeyValue__Group__12595 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__KeyValue__Group__2_in_rule__KeyValue__Group__12598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__KeyValue__Group__1__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValue__Group__2__Impl_in_rule__KeyValue__Group__22657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyValue__ValueAssignment_2_in_rule__KeyValue__Group__2__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_rule__LedsCodeDSL__ApplicationAssignment_02725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameApplication_in_rule__Application__NameApplicationAssignment_22756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLanguage_in_rule__Application__LanguageAssignment_32787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFramework_in_rule__Application__FrameworkAssignment_42818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleORM_in_rule__Application__OrmAssignment_52849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataBase_in_rule__Application__DatabaseAssignment_62880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNQUOTED_STRING_in_rule__NameApplication__NameAssignment_22911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValue_in_rule__Dictionary__ElementsAssignment_12942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyValue_in_rule__Dictionary__ElementsAssignment_2_12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__KeyValue__KeyAssignment_03004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__KeyValue__ValueAssignment_23035 = new BitSet(new long[]{0x0000000000000002L});

}