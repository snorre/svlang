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
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getRootElementAccess().getGroup(), "rule__RootElement__Group__0");
					put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
					put(grammarAccess.getFunAccess().getGroup(), "rule__Fun__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
					put(grammarAccess.getMyIntTypeAccess().getGroup(), "rule__MyIntType__Group__0");
					put(grammarAccess.getMyStringTypeAccess().getGroup(), "rule__MyStringType__Group__0");
					put(grammarAccess.getDomainmodelAccess().getElementsAssignment(), "rule__Domainmodel__ElementsAssignment");
					put(grammarAccess.getRootElementAccess().getMainAssignment_0(), "rule__RootElement__MainAssignment_0");
					put(grammarAccess.getRootElementAccess().getFunsAssignment_1(), "rule__RootElement__FunsAssignment_1");
					put(grammarAccess.getMainAccess().getExpressionsAssignment_1(), "rule__Main__ExpressionsAssignment_1");
					put(grammarAccess.getFunAccess().getNameAssignment_2(), "rule__Fun__NameAssignment_2");
					put(grammarAccess.getFunAccess().getReturnTypeAssignment_4(), "rule__Fun__ReturnTypeAssignment_4");
					put(grammarAccess.getFunAccess().getExpressionsAssignment_6(), "rule__Fun__ExpressionsAssignment_6");
					put(grammarAccess.getAssignmentAccess().getTypeAssignment_1(), "rule__Assignment__TypeAssignment_1");
					put(grammarAccess.getAssignmentAccess().getNameAssignment_2(), "rule__Assignment__NameAssignment_2");
					put(grammarAccess.getAssignmentAccess().getValueAssignment_4(), "rule__Assignment__ValueAssignment_4");
					put(grammarAccess.getAtomicAccess().getSymbolAssignment_0_1(), "rule__Atomic__SymbolAssignment_0_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
					put(grammarAccess.getAtomicAccess().getFunAssignment_3_1(), "rule__Atomic__FunAssignment_3_1");
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