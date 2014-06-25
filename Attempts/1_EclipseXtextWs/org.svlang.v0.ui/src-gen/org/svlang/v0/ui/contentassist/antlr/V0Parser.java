/*
* generated by Xtext
*/
package org.svlang.v0.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.svlang.v0.services.V0GrammarAccess;

public class V0Parser extends AbstractContentAssistParser {
	
	@Inject
	private V0GrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.svlang.v0.ui.contentassist.antlr.internal.InternalV0Parser createParser() {
		org.svlang.v0.ui.contentassist.antlr.internal.InternalV0Parser result = new org.svlang.v0.ui.contentassist.antlr.internal.InternalV0Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRootElementAccess().getAlternatives(), "rule__RootElement__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getPassableAccess().getAlternatives(), "rule__Passable__Alternatives");
					put(grammarAccess.getConstantsAccess().getAlternatives(), "rule__Constants__Alternatives");
					put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
					put(grammarAccess.getFunAccess().getGroup(), "rule__Fun__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getFunCallAccess().getGroup(), "rule__FunCall__Group__0");
					put(grammarAccess.getReturnAccess().getGroup(), "rule__Return__Group__0");
					put(grammarAccess.getDomainmodelAccess().getElementsAssignment(), "rule__Domainmodel__ElementsAssignment");
					put(grammarAccess.getMainAccess().getExpressionsAssignment_2(), "rule__Main__ExpressionsAssignment_2");
					put(grammarAccess.getFunAccess().getNameAssignment_1(), "rule__Fun__NameAssignment_1");
					put(grammarAccess.getFunAccess().getRetTypeAssignment_3(), "rule__Fun__RetTypeAssignment_3");
					put(grammarAccess.getFunAccess().getExpressionsAssignment_5(), "rule__Fun__ExpressionsAssignment_5");
					put(grammarAccess.getAssignmentAccess().getNameAssignment_0(), "rule__Assignment__NameAssignment_0");
					put(grammarAccess.getAssignmentAccess().getValueAssignment_2(), "rule__Assignment__ValueAssignment_2");
					put(grammarAccess.getFunCallAccess().getNameAssignment_0(), "rule__FunCall__NameAssignment_0");
					put(grammarAccess.getFunCallAccess().getParametersAssignment_2(), "rule__FunCall__ParametersAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.svlang.v0.ui.contentassist.antlr.internal.InternalV0Parser typedParser = (org.svlang.v0.ui.contentassist.antlr.internal.InternalV0Parser) parser;
			typedParser.entryRuleDomainmodel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public V0GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(V0GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
