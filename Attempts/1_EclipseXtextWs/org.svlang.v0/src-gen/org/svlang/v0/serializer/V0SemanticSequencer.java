package org.svlang.v0.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.svlang.v0.services.V0GrammarAccess;
import org.svlang.v0.v0.Assignment;
import org.svlang.v0.v0.Domainmodel;
import org.svlang.v0.v0.Fun;
import org.svlang.v0.v0.FunCall;
import org.svlang.v0.v0.INT;
import org.svlang.v0.v0.Main;
import org.svlang.v0.v0.NumberLiteral;
import org.svlang.v0.v0.RootElement;
import org.svlang.v0.v0.STRING;
import org.svlang.v0.v0.StringLiteral;
import org.svlang.v0.v0.SymbolRef;
import org.svlang.v0.v0.V0Package;

@SuppressWarnings("all")
public class V0SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private V0GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == V0Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case V0Package.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case V0Package.DOMAINMODEL:
				if(context == grammarAccess.getDomainmodelRule()) {
					sequence_Domainmodel(context, (Domainmodel) semanticObject); 
					return; 
				}
				else break;
			case V0Package.FUN:
				if(context == grammarAccess.getFunRule()) {
					sequence_Fun(context, (Fun) semanticObject); 
					return; 
				}
				else break;
			case V0Package.FUN_CALL:
				if(context == grammarAccess.getAtomicRule()) {
					sequence_Atomic(context, (FunCall) semanticObject); 
					return; 
				}
				else break;
			case V0Package.INT:
				if(context == grammarAccess.getMyIntTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MyIntType(context, (INT) semanticObject); 
					return; 
				}
				else break;
			case V0Package.MAIN:
				if(context == grammarAccess.getMainRule()) {
					sequence_Main(context, (Main) semanticObject); 
					return; 
				}
				else break;
			case V0Package.NUMBER_LITERAL:
				if(context == grammarAccess.getAtomicRule()) {
					sequence_Atomic(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case V0Package.ROOT_ELEMENT:
				if(context == grammarAccess.getRootElementRule()) {
					sequence_RootElement(context, (RootElement) semanticObject); 
					return; 
				}
				else break;
			case V0Package.STRING:
				if(context == grammarAccess.getMyStringTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MyStringType(context, (STRING) semanticObject); 
					return; 
				}
				else break;
			case V0Package.STRING_LITERAL:
				if(context == grammarAccess.getAtomicRule()) {
					sequence_Atomic(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case V0Package.SYMBOL_REF:
				if(context == grammarAccess.getAtomicRule()) {
					sequence_Atomic(context, (SymbolRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (type=[Type|ID] name=ID value=Atomic)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, V0Package.Literals.ASSIGNMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, V0Package.Literals.ASSIGNMENT__TYPE));
			if(transientValues.isValueTransient(semanticObject, V0Package.Literals.ASSIGNMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, V0Package.Literals.ASSIGNMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, V0Package.Literals.ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, V0Package.Literals.ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getTypeTypeIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssignmentAccess().getValueAtomicParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     fun=[Fun|ID]
	 */
	protected void sequence_Atomic(EObject context, FunCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, V0Package.Literals.FUN_CALL__FUN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, V0Package.Literals.FUN_CALL__FUN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getFunFunIDTerminalRuleCall_3_1_0_1(), semanticObject.getFun());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, V0Package.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, V0Package.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Atomic(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, V0Package.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, V0Package.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     symbol=[Symbol|ID]
	 */
	protected void sequence_Atomic(EObject context, SymbolRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, V0Package.Literals.SYMBOL_REF__SYMBOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, V0Package.Literals.SYMBOL_REF__SYMBOL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getSymbolSymbolIDTerminalRuleCall_0_1_0_1(), semanticObject.getSymbol());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=RootElement*
	 */
	protected void sequence_Domainmodel(EObject context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID returnType=[Type|ID] expressions+=Expression*)
	 */
	protected void sequence_Fun(EObject context, Fun semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expressions+=Expression+
	 */
	protected void sequence_Main(EObject context, Main semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {INT}
	 */
	protected void sequence_MyIntType(EObject context, INT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {STRING}
	 */
	protected void sequence_MyStringType(EObject context, STRING semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (main=Main funs+=Fun*)
	 */
	protected void sequence_RootElement(EObject context, RootElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
