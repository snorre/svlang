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
import org.svlang.v0.v0.Main;
import org.svlang.v0.v0.Println;
import org.svlang.v0.v0.RootElement;
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
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunCallRule()) {
					sequence_FunCall(context, (FunCall) semanticObject); 
					return; 
				}
				else break;
			case V0Package.MAIN:
				if(context == grammarAccess.getMainRule()) {
					sequence_Main(context, (Main) semanticObject); 
					return; 
				}
				else break;
			case V0Package.PRINTLN:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getPrintlnRule()) {
					sequence_Println(context, (Println) semanticObject); 
					return; 
				}
				else break;
			case V0Package.ROOT_ELEMENT:
				if(context == grammarAccess.getRootElementRule()) {
					sequence_RootElement(context, (RootElement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, V0Package.Literals.ASSIGNMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, V0Package.Literals.ASSIGNMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, V0Package.Literals.ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, V0Package.Literals.ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssignmentAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
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
	 *     name=ID
	 */
	protected void sequence_FunCall(EObject context, FunCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, V0Package.Literals.FUN_CALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, V0Package.Literals.FUN_CALL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunCallAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expressions+=Expression*)
	 */
	protected void sequence_Fun(EObject context, Fun semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expressions+=Expression*
	 */
	protected void sequence_Main(EObject context, Main semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     values+=STRING+
	 */
	protected void sequence_Println(EObject context, Println semanticObject) {
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
