/*
* generated by Xtext
*/
package org.xtext.example.index.greetings.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.index.greetings.services.GreetingsGrammarAccess;

public class GreetingsParser extends AbstractContentAssistParser {
	
	@Inject
	private GreetingsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.index.greetings.ui.contentassist.antlr.internal.InternalGreetingsParser createParser() {
		org.xtext.example.index.greetings.ui.contentassist.antlr.internal.InternalGreetingsParser result = new org.xtext.example.index.greetings.ui.contentassist.antlr.internal.InternalGreetingsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGreetingAccess().getAlternatives(), "rule__Greeting__Alternatives");
					put(grammarAccess.getHelloGreetingAccess().getGroup(), "rule__HelloGreeting__Group__0");
					put(grammarAccess.getHelloGreetingAccess().getGroup_2(), "rule__HelloGreeting__Group_2__0");
					put(grammarAccess.getRefGreetingAccess().getGroup(), "rule__RefGreeting__Group__0");
					put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
					put(grammarAccess.getHelloGreetingAccess().getNameAssignment_1(), "rule__HelloGreeting__NameAssignment_1");
					put(grammarAccess.getHelloGreetingAccess().getParentAssignment_2_1(), "rule__HelloGreeting__ParentAssignment_2_1");
					put(grammarAccess.getRefGreetingAccess().getGreetingAssignment_1(), "rule__RefGreeting__GreetingAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.index.greetings.ui.contentassist.antlr.internal.InternalGreetingsParser typedParser = (org.xtext.example.index.greetings.ui.contentassist.antlr.internal.InternalGreetingsParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GreetingsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GreetingsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
