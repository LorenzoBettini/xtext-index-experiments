package org.xtext.example.index.greetings.serializer;

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
import org.xtext.example.index.greetings.greetings.GreetingsPackage;
import org.xtext.example.index.greetings.greetings.HelloGreeting;
import org.xtext.example.index.greetings.greetings.Model;
import org.xtext.example.index.greetings.greetings.RefGreeting;
import org.xtext.example.index.greetings.services.GreetingsGrammarAccess;

@SuppressWarnings("all")
public class GreetingsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GreetingsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GreetingsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GreetingsPackage.HELLO_GREETING:
				if(context == grammarAccess.getGreetingRule() ||
				   context == grammarAccess.getHelloGreetingRule()) {
					sequence_HelloGreeting(context, (HelloGreeting) semanticObject); 
					return; 
				}
				else break;
			case GreetingsPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case GreetingsPackage.REF_GREETING:
				if(context == grammarAccess.getGreetingRule() ||
				   context == grammarAccess.getRefGreetingRule()) {
					sequence_RefGreeting(context, (RefGreeting) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID parent=[HelloGreeting|ID]?)
	 */
	protected void sequence_HelloGreeting(EObject context, HelloGreeting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     greetings+=Greeting*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     greeting=[HelloGreeting|ID]
	 */
	protected void sequence_RefGreeting(EObject context, RefGreeting semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GreetingsPackage.Literals.REF_GREETING__GREETING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GreetingsPackage.Literals.REF_GREETING__GREETING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefGreetingAccess().getGreetingHelloGreetingIDTerminalRuleCall_1_0_1(), semanticObject.getGreeting());
		feeder.finish();
	}
}
