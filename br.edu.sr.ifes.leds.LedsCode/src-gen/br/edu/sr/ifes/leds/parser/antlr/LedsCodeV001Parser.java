/*
 * generated by Xtext
 */
package br.edu.sr.ifes.leds.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import br.edu.sr.ifes.leds.services.LedsCodeV001GrammarAccess;

public class LedsCodeV001Parser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private LedsCodeV001GrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected br.edu.sr.ifes.leds.parser.antlr.internal.InternalLedsCodeV001Parser createParser(XtextTokenStream stream) {
		return new br.edu.sr.ifes.leds.parser.antlr.internal.InternalLedsCodeV001Parser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "LedsCodeDSL";
	}
	
	public LedsCodeV001GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LedsCodeV001GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
