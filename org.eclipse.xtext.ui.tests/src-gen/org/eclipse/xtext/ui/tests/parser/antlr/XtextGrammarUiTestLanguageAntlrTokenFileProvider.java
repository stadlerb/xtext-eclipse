/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XtextGrammarUiTestLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/eclipse/xtext/ui/tests/parser/antlr/internal/InternalXtextGrammarUiTestLanguage.tokens");
	}
}
