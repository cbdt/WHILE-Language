/*
 * generated by Xtext 2.15.0
 */
grammar InternalWh;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.comp.wh.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.comp.wh.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.comp.wh.services.WhGrammarAccess;

}

@parser::members {

 	private WhGrammarAccess grammarAccess;

    public InternalWhParser(TokenStream input, WhGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected WhGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getTextProgramParserRuleCall_0());
			}
			lv_text_0_0=ruleProgram
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				set(
					$current,
					"text",
					lv_text_0_0,
					"org.xtext.comp.wh.Wh.Program");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0());
			}
			lv_functions_0_0=ruleFunction
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getProgramRule());
				}
				add(
					$current,
					"functions",
					lv_functions_0_0,
					"org.xtext.comp.wh.Wh.Function");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
		}
		(
			(
				lv_fname_1_0=RULE_SYMBOL
				{
					newLeafNode(lv_fname_1_0, grammarAccess.getFunctionAccess().getFnameSYMBOLTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"fname",
						lv_fname_1_0,
						"org.xtext.comp.wh.Wh.SYMBOL");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
				}
				lv_definition_3_0=ruleDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"definition",
						lv_definition_3_0,
						"org.xtext.comp.wh.Wh.Definition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='read'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getInputsInputParserRuleCall_1_0());
				}
				lv_inputs_1_0=ruleInput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"inputs",
						lv_inputs_1_0,
						"org.xtext.comp.wh.Wh.Input");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='%'
		{
			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_3_0());
				}
				lv_commands_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"commands",
						lv_commands_3_0,
						"org.xtext.comp.wh.Wh.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='%'
		{
			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
		}
		otherlv_5='write'
		{
			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinitionAccess().getOutputsOutputParserRuleCall_6_0());
				}
				lv_outputs_6_0=ruleOutput
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinitionRule());
					}
					set(
						$current,
						"outputs",
						lv_outputs_6_0,
						"org.xtext.comp.wh.Wh.Output");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	iv_ruleInput=ruleInput
	{ $current=$iv_ruleInput.current; }
	EOF;

// Rule Input
ruleInput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_params_0_0=RULE_VARIABLE
				{
					newLeafNode(lv_params_0_0, grammarAccess.getInputAccess().getParamsVARIABLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInputRule());
					}
					addWithLastConsumed(
						$current,
						"params",
						lv_params_0_0,
						"org.xtext.comp.wh.Wh.VARIABLE");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_params_2_0=RULE_VARIABLE
					{
						newLeafNode(lv_params_2_0, grammarAccess.getInputAccess().getParamsVARIABLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getInputRule());
						}
						addWithLastConsumed(
							$current,
							"params",
							lv_params_2_0,
							"org.xtext.comp.wh.Wh.VARIABLE");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleOutput
entryRuleOutput returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOutputRule()); }
	iv_ruleOutput=ruleOutput
	{ $current=$iv_ruleOutput.current; }
	EOF;

// Rule Output
ruleOutput returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_r_values_0_0=RULE_VARIABLE
				{
					newLeafNode(lv_r_values_0_0, grammarAccess.getOutputAccess().getR_valuesVARIABLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOutputRule());
					}
					addWithLastConsumed(
						$current,
						"r_values",
						lv_r_values_0_0,
						"org.xtext.comp.wh.Wh.VARIABLE");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_r_values_2_0=RULE_VARIABLE
					{
						newLeafNode(lv_r_values_2_0, grammarAccess.getOutputAccess().getR_valuesVARIABLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOutputRule());
						}
						addWithLastConsumed(
							$current,
							"r_values",
							lv_r_values_2_0,
							"org.xtext.comp.wh.Wh.VARIABLE");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCommands
entryRuleCommands returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandsRule()); }
	iv_ruleCommands=ruleCommands
	{ $current=$iv_ruleCommands.current; }
	EOF;

// Rule Commands
ruleCommands returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_0_0());
				}
				lv_command_0_0=ruleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandsRule());
					}
					add(
						$current,
						"command",
						lv_command_0_0,
						"org.xtext.comp.wh.Wh.Command");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=';'
			{
				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_1_1_0());
					}
					lv_command_2_0=ruleCommand
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCommandsRule());
						}
						add(
							$current,
							"command",
							lv_command_2_0,
							"org.xtext.comp.wh.Wh.Command");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCommand
entryRuleCommand returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandRule()); }
	iv_ruleCommand=ruleCommand
	{ $current=$iv_ruleCommand.current; }
	EOF;

// Rule Command
ruleCommand returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandNopParserRuleCall_0_0());
				}
				lv_command_0_0=ruleNop
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_0_0,
						"org.xtext.comp.wh.Wh.Nop");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandAssignParserRuleCall_1_0());
				}
				lv_command_1_0=ruleAssign
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_1_0,
						"org.xtext.comp.wh.Wh.Assign");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandWhileParserRuleCall_2_0());
				}
				lv_command_2_0=ruleWhile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_2_0,
						"org.xtext.comp.wh.Wh.While");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandForParserRuleCall_3_0());
				}
				lv_command_3_0=ruleFor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_3_0,
						"org.xtext.comp.wh.Wh.For");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandIfParserRuleCall_4_0());
				}
				lv_command_4_0=ruleIf
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_4_0,
						"org.xtext.comp.wh.Wh.If");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getCommandAccess().getCommandForeachParserRuleCall_5_0());
				}
				lv_command_5_0=ruleForeach
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCommandRule());
					}
					set(
						$current,
						"command",
						lv_command_5_0,
						"org.xtext.comp.wh.Wh.Foreach");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNop
entryRuleNop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNopRule()); }
	iv_ruleNop=ruleNop
	{ $current=$iv_ruleNop.current; }
	EOF;

// Rule Nop
ruleNop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_nop_0_0='nop'
			{
				newLeafNode(lv_nop_0_0, grammarAccess.getNopAccess().getNopNopKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNopRule());
				}
				setWithLastConsumed($current, "nop", lv_nop_0_0, "nop");
			}
		)
	)
;

// Entry rule entryRuleAssign
entryRuleAssign returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignRule()); }
	iv_ruleAssign=ruleAssign
	{ $current=$iv_ruleAssign.current; }
	EOF;

// Rule Assign
ruleAssign returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAssignAccess().getVarsVarsParserRuleCall_0_0());
				}
				lv_vars_0_0=ruleVars
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignRule());
					}
					set(
						$current,
						"vars",
						lv_vars_0_0,
						"org.xtext.comp.wh.Wh.Vars");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':='
		{
			newLeafNode(otherlv_1, grammarAccess.getAssignAccess().getColonEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssignAccess().getExprsExprsParserRuleCall_2_0());
				}
				lv_exprs_2_0=ruleExprs
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignRule());
					}
					set(
						$current,
						"exprs",
						lv_exprs_2_0,
						"org.xtext.comp.wh.Wh.Exprs");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWhile
entryRuleWhile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhileRule()); }
	iv_ruleWhile=ruleWhile
	{ $current=$iv_ruleWhile.current; }
	EOF;

// Rule While
ruleWhile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='while'
		{
			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileAccess().getCondExprParserRuleCall_1_0());
				}
				lv_cond_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileRule());
					}
					set(
						$current,
						"cond",
						lv_cond_1_0,
						"org.xtext.comp.wh.Wh.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='do'
		{
			newLeafNode(otherlv_2, grammarAccess.getWhileAccess().getDoKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhileAccess().getCommandsCommandsParserRuleCall_3_0());
				}
				lv_commands_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhileRule());
					}
					set(
						$current,
						"commands",
						lv_commands_3_0,
						"org.xtext.comp.wh.Wh.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='od'
		{
			newLeafNode(otherlv_4, grammarAccess.getWhileAccess().getOdKeyword_4());
		}
	)
;

// Entry rule entryRuleFor
entryRuleFor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForRule()); }
	iv_ruleFor=ruleFor
	{ $current=$iv_ruleFor.current; }
	EOF;

// Rule For
ruleFor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='for'
		{
			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForAccess().getCondExprParserRuleCall_1_0());
				}
				lv_cond_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForRule());
					}
					set(
						$current,
						"cond",
						lv_cond_1_0,
						"org.xtext.comp.wh.Wh.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='do'
		{
			newLeafNode(otherlv_2, grammarAccess.getForAccess().getDoKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForAccess().getCommandsCommandsParserRuleCall_3_0());
				}
				lv_commands_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForRule());
					}
					set(
						$current,
						"commands",
						lv_commands_3_0,
						"org.xtext.comp.wh.Wh.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='od'
		{
			newLeafNode(otherlv_4, grammarAccess.getForAccess().getOdKeyword_4());
		}
	)
;

// Entry rule entryRuleIf
entryRuleIf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIfRule()); }
	iv_ruleIf=ruleIf
	{ $current=$iv_ruleIf.current; }
	EOF;

// Rule If
ruleIf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getCondExprParserRuleCall_1_0());
				}
				lv_cond_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					set(
						$current,
						"cond",
						lv_cond_1_0,
						"org.xtext.comp.wh.Wh.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='then'
		{
			newLeafNode(otherlv_2, grammarAccess.getIfAccess().getThenKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIfAccess().getIf_commandsCommandsParserRuleCall_3_0());
				}
				lv_if_commands_3_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIfRule());
					}
					set(
						$current,
						"if_commands",
						lv_if_commands_3_0,
						"org.xtext.comp.wh.Wh.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='else'
			{
				newLeafNode(otherlv_4, grammarAccess.getIfAccess().getElseKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getIfAccess().getElse_commandsCommandsParserRuleCall_4_1_0());
					}
					lv_else_commands_5_0=ruleCommands
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIfRule());
						}
						set(
							$current,
							"else_commands",
							lv_else_commands_5_0,
							"org.xtext.comp.wh.Wh.Commands");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='fi'
		{
			newLeafNode(otherlv_6, grammarAccess.getIfAccess().getFiKeyword_5());
		}
	)
;

// Entry rule entryRuleForeach
entryRuleForeach returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForeachRule()); }
	iv_ruleForeach=ruleForeach
	{ $current=$iv_ruleForeach.current; }
	EOF;

// Rule Foreach
ruleForeach returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='foreach'
		{
			newLeafNode(otherlv_0, grammarAccess.getForeachAccess().getForeachKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeachAccess().getExprExprParserRuleCall_1_0());
				}
				lv_expr_1_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeachRule());
					}
					set(
						$current,
						"expr",
						lv_expr_1_0,
						"org.xtext.comp.wh.Wh.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='in'
		{
			newLeafNode(otherlv_2, grammarAccess.getForeachAccess().getInKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeachAccess().getE2ExprParserRuleCall_3_0());
				}
				lv_e2_3_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeachRule());
					}
					set(
						$current,
						"e2",
						lv_e2_3_0,
						"org.xtext.comp.wh.Wh.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='do'
		{
			newLeafNode(otherlv_4, grammarAccess.getForeachAccess().getDoKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForeachAccess().getCommandsCommandsParserRuleCall_5_0());
				}
				lv_commands_5_0=ruleCommands
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForeachRule());
					}
					set(
						$current,
						"commands",
						lv_commands_5_0,
						"org.xtext.comp.wh.Wh.Commands");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='od'
		{
			newLeafNode(otherlv_6, grammarAccess.getForeachAccess().getOdKeyword_6());
		}
	)
;

// Entry rule entryRuleVars
entryRuleVars returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarsRule()); }
	iv_ruleVars=ruleVars
	{ $current=$iv_ruleVars.current; }
	EOF;

// Rule Vars
ruleVars returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_variables_0_0=RULE_VARIABLE
				{
					newLeafNode(lv_variables_0_0, grammarAccess.getVarsAccess().getVariablesVARIABLETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVarsRule());
					}
					addWithLastConsumed(
						$current,
						"variables",
						lv_variables_0_0,
						"org.xtext.comp.wh.Wh.VARIABLE");
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
			}
			(
				(
					lv_variables_2_0=RULE_VARIABLE
					{
						newLeafNode(lv_variables_2_0, grammarAccess.getVarsAccess().getVariablesVARIABLETerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVarsRule());
						}
						addWithLastConsumed(
							$current,
							"variables",
							lv_variables_2_0,
							"org.xtext.comp.wh.Wh.VARIABLE");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExprs
entryRuleExprs returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprsRule()); }
	iv_ruleExprs=ruleExprs
	{ $current=$iv_ruleExprs.current; }
	EOF;

// Rule Exprs
ruleExprs returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExprsAccess().getExprExprParserRuleCall_0_0());
				}
				lv_expr_0_0=ruleExpr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprsRule());
					}
					add(
						$current,
						"expr",
						lv_expr_0_0,
						"org.xtext.comp.wh.Wh.Expr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprsAccess().getExprExprParserRuleCall_1_1_0());
					}
					lv_expr_2_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprsRule());
						}
						add(
							$current,
							"expr",
							lv_expr_2_0,
							"org.xtext.comp.wh.Wh.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExpr
entryRuleExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprRule()); }
	iv_ruleExpr=ruleExpr
	{ $current=$iv_ruleExpr.current; }
	EOF;

// Rule Expr
ruleExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getExprAccess().getExpr_andExprAndParserRuleCall_0());
			}
			lv_expr_and_0_0=ruleExprAnd
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getExprRule());
				}
				set(
					$current,
					"expr_and",
					lv_expr_and_0_0,
					"org.xtext.comp.wh.Wh.ExprAnd");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleExprSimple
entryRuleExprSimple returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprSimpleRule()); }
	iv_ruleExprSimple=ruleExprSimple
	{ $current=$iv_ruleExprSimple.current; }
	EOF;

// Rule ExprSimple
ruleExprSimple returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_nil_0_0='nil'
				{
					newLeafNode(lv_nil_0_0, grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprSimpleRule());
					}
					setWithLastConsumed($current, "nil", lv_nil_0_0, "nil");
				}
			)
		)
		    |
		(
			(
				lv_variable_1_0=RULE_VARIABLE
				{
					newLeafNode(lv_variable_1_0, grammarAccess.getExprSimpleAccess().getVariableVARIABLETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprSimpleRule());
					}
					setWithLastConsumed(
						$current,
						"variable",
						lv_variable_1_0,
						"org.xtext.comp.wh.Wh.VARIABLE");
				}
			)
		)
		    |
		(
			(
				lv_sym_2_0=RULE_SYMBOL
				{
					newLeafNode(lv_sym_2_0, grammarAccess.getExprSimpleAccess().getSymSYMBOLTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprSimpleRule());
					}
					setWithLastConsumed(
						$current,
						"sym",
						lv_sym_2_0,
						"org.xtext.comp.wh.Wh.SYMBOL");
				}
			)
		)
		    |
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
			}
			otherlv_4='cons'
			{
				newLeafNode(otherlv_4, grammarAccess.getExprSimpleAccess().getConsKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getCons_expLExprParserRuleCall_3_2_0());
					}
					lv_cons_exp_5_0=ruleLExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"cons_exp",
							lv_cons_exp_5_0,
							"org.xtext.comp.wh.Wh.LExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
			}
		)
		    |
		(
			otherlv_7='('
			{
				newLeafNode(otherlv_7, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
			}
			otherlv_8='list'
			{
				newLeafNode(otherlv_8, grammarAccess.getExprSimpleAccess().getListKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getList_expLExprParserRuleCall_4_2_0());
					}
					lv_list_exp_9_0=ruleLExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"list_exp",
							lv_list_exp_9_0,
							"org.xtext.comp.wh.Wh.LExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_10=')'
			{
				newLeafNode(otherlv_10, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3());
			}
		)
		    |
		(
			otherlv_11='('
			{
				newLeafNode(otherlv_11, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
			}
			otherlv_12='hd'
			{
				newLeafNode(otherlv_12, grammarAccess.getExprSimpleAccess().getHdKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getHd_exprExprParserRuleCall_5_2_0());
					}
					lv_hd_expr_13_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"hd_expr",
							lv_hd_expr_13_0,
							"org.xtext.comp.wh.Wh.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_14=')'
			{
				newLeafNode(otherlv_14, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3());
			}
		)
		    |
		(
			otherlv_15='('
			{
				newLeafNode(otherlv_15, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_6_0());
			}
			otherlv_16='tl'
			{
				newLeafNode(otherlv_16, grammarAccess.getExprSimpleAccess().getTlKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprSimpleAccess().getTl_exprExprParserRuleCall_6_2_0());
					}
					lv_tl_expr_17_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprSimpleRule());
						}
						set(
							$current,
							"tl_expr",
							lv_tl_expr_17_0,
							"org.xtext.comp.wh.Wh.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_18=')'
			{
				newLeafNode(otherlv_18, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_6_3());
			}
		)
	)
;

// Entry rule entryRuleExprAnd
entryRuleExprAnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprAndRule()); }
	iv_ruleExprAnd=ruleExprAnd
	{ $current=$iv_ruleExprAnd.current; }
	EOF;

// Rule ExprAnd
ruleExprAnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExprAndAccess().getExpr_orExprOrParserRuleCall_0_0());
				}
				lv_expr_or_0_0=ruleExprOr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprAndRule());
					}
					add(
						$current,
						"expr_or",
						lv_expr_or_0_0,
						"org.xtext.comp.wh.Wh.ExprOr");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='and'
			{
				newLeafNode(otherlv_1, grammarAccess.getExprAndAccess().getAndKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprAndAccess().getExpr_orExprOrParserRuleCall_1_1_0());
					}
					lv_expr_or_2_0=ruleExprOr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprAndRule());
						}
						add(
							$current,
							"expr_or",
							lv_expr_or_2_0,
							"org.xtext.comp.wh.Wh.ExprOr");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExprOr
entryRuleExprOr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprOrRule()); }
	iv_ruleExprOr=ruleExprOr
	{ $current=$iv_ruleExprOr.current; }
	EOF;

// Rule ExprOr
ruleExprOr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExprOrAccess().getExpr_notExprNotParserRuleCall_0_0());
				}
				lv_expr_not_0_0=ruleExprNot
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprOrRule());
					}
					add(
						$current,
						"expr_not",
						lv_expr_not_0_0,
						"org.xtext.comp.wh.Wh.ExprNot");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='or'
			{
				newLeafNode(otherlv_1, grammarAccess.getExprOrAccess().getOrKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprOrAccess().getExpr_notExprNotParserRuleCall_1_1_0());
					}
					lv_expr_not_2_0=ruleExprNot
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprOrRule());
						}
						add(
							$current,
							"expr_not",
							lv_expr_not_2_0,
							"org.xtext.comp.wh.Wh.ExprNot");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExprNot
entryRuleExprNot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprNotRule()); }
	iv_ruleExprNot=ruleExprNot
	{ $current=$iv_ruleExprNot.current; }
	EOF;

// Rule ExprNot
ruleExprNot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_hasNot_0_0='not'
				{
					newLeafNode(lv_hasNot_0_0, grammarAccess.getExprNotAccess().getHasNotNotKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExprNotRule());
					}
					setWithLastConsumed($current, "hasNot", lv_hasNot_0_0, "not");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getExprNotAccess().getExpr_eqExprEqParserRuleCall_1_0());
				}
				lv_expr_eq_1_0=ruleExprEq
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExprNotRule());
					}
					set(
						$current,
						"expr_eq",
						lv_expr_eq_1_0,
						"org.xtext.comp.wh.Wh.ExprEq");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExprEq
entryRuleExprEq returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExprEqRule()); }
	iv_ruleExprEq=ruleExprEq
	{ $current=$iv_ruleExprEq.current; }
	EOF;

// Rule ExprEq
ruleExprEq returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getExprEqAccess().getExpr_leftExprSimpleParserRuleCall_0_0_0());
					}
					lv_expr_left_0_0=ruleExprSimple
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprEqRule());
						}
						set(
							$current,
							"expr_left",
							lv_expr_left_0_0,
							"org.xtext.comp.wh.Wh.ExprSimple");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_1='=?'
				{
					newLeafNode(otherlv_1, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_0_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getExprEqAccess().getExpr_rightExprSimpleParserRuleCall_0_1_1_0());
						}
						lv_expr_right_2_0=ruleExprSimple
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getExprEqRule());
							}
							set(
								$current,
								"expr_right",
								lv_expr_right_2_0,
								"org.xtext.comp.wh.Wh.ExprSimple");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
		)
		    |
		(
			(
				('(')=>
				otherlv_3='('
				{
					newLeafNode(otherlv_3, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_1_0());
				}
			)
			(
				(
					lv_sym_4_0=RULE_SYMBOL
					{
						newLeafNode(lv_sym_4_0, grammarAccess.getExprEqAccess().getSymSYMBOLTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExprEqRule());
						}
						setWithLastConsumed(
							$current,
							"sym",
							lv_sym_4_0,
							"org.xtext.comp.wh.Wh.SYMBOL");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExprEqAccess().getLexprLExprParserRuleCall_1_2_0());
					}
					lv_lexpr_5_0=ruleLExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprEqRule());
						}
						set(
							$current,
							"lexpr",
							lv_lexpr_5_0,
							"org.xtext.comp.wh.Wh.LExpr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_1_3());
			}
		)
		    |
		(
			otherlv_7='('
			{
				newLeafNode(otherlv_7, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_2_1_0());
					}
					lv_expr_8_0=ruleExpr
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExprEqRule());
						}
						set(
							$current,
							"expr",
							lv_expr_8_0,
							"org.xtext.comp.wh.Wh.Expr");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_9=')'
			{
				newLeafNode(otherlv_9, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_2_2());
			}
		)
	)
;

// Entry rule entryRuleLExpr
entryRuleLExpr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLExprRule()); }
	iv_ruleLExpr=ruleLExpr
	{ $current=$iv_ruleLExpr.current; }
	EOF;

// Rule LExpr
ruleLExpr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getLExprAccess().getExprExprParserRuleCall_0());
			}
			lv_expr_0_0=ruleExpr
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getLExprRule());
				}
				add(
					$current,
					"expr",
					lv_expr_0_0,
					"org.xtext.comp.wh.Wh.Expr");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

RULE_SYMBOL : 'a'..'z' ('0'..'9'|'a'..'z'|'A'..'Z')* ((('-'|'+'|'.'|'/'|'_'|'&')|'->') ('0'..'9'|'a'..'z'|'A'..'Z')+)* ('?'|'!')?;

RULE_VARIABLE : 'A'..'Z' ('0'..'9'|'a'..'z'|'A'..'Z')* ((('-'|'+'|'.'|'/'|'_'|'&')|'->') ('0'..'9'|'a'..'z'|'A'..'Z')+)* ('?'|'!')?;

RULE_CR : '\r';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
