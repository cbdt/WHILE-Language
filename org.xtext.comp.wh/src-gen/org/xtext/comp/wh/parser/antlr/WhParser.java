/*
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.wh.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.comp.wh.parser.antlr.internal.InternalWhParser;
import org.xtext.comp.wh.services.WhGrammarAccess;

public class WhParser extends AbstractAntlrParser {

	@Inject
	private WhGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalWhParser createParser(XtextTokenStream stream) {
		return new InternalWhParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public WhGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WhGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
