/*
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.wh.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class WhAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/comp/wh/parser/antlr/internal/InternalWh.tokens");
	}
}
