/*
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.wh.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.comp.wh.services.WhGrammarAccess;

@SuppressWarnings("all")
public class WhSyntacticSequencer extends AbstractSyntacticSequencer {

	protected WhGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ExprEq_SYMBOLTerminalRuleCall_1_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (WhGrammarAccess) access;
		match_ExprEq_SYMBOLTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getExprEqAccess().getSYMBOLTerminalRuleCall_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getSYMBOLRule())
			return getSYMBOLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal SYMBOL: ('a'..'z')('A'..'Z' | 'a'..'z' | '0'..'9')*;
	 */
	protected String getSYMBOLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ExprEq_SYMBOLTerminalRuleCall_1_1_q.equals(syntax))
				emit_ExprEq_SYMBOLTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     SYMBOL?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '(' (ambiguity) le+=Expr
	 */
	protected void emit_ExprEq_SYMBOLTerminalRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
