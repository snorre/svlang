package org.svlang.v0.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.svlang.v0.services.V0GrammarAccess;

@SuppressWarnings("all")
public class V0SyntacticSequencer extends AbstractSyntacticSequencer {

	protected V0GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Passable_ConstantsParserRuleCall_0_or_IDTerminalRuleCall_1;
	protected AbstractElementAlias match_Return_ReturnKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (V0GrammarAccess) access;
		match_Passable_ConstantsParserRuleCall_0_or_IDTerminalRuleCall_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPassableAccess().getConstantsParserRuleCall_0()), new TokenAlias(false, false, grammarAccess.getPassableAccess().getIDTerminalRuleCall_1()));
		match_Return_ReturnKeyword_0_q = new TokenAlias(false, true, grammarAccess.getReturnAccess().getReturnKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getConstantsRule())
			return getConstantsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Constants:
	 * 	INT | STRING
	 * ;
	 */
	protected String getConstantsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
			if(match_Passable_ConstantsParserRuleCall_0_or_IDTerminalRuleCall_1.equals(syntax))
				emit_Passable_ConstantsParserRuleCall_0_or_IDTerminalRuleCall_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Return_ReturnKeyword_0_q.equals(syntax))
				emit_Return_ReturnKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     Constants | ID
	 */
	protected void emit_Passable_ConstantsParserRuleCall_0_or_IDTerminalRuleCall_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'return '?
	 */
	protected void emit_Return_ReturnKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
