package org.xtext.example.index.greetings.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.runner.RunWith
import org.xtext.example.index.greetings.GreetingsInjectorProvider
import org.xtext.example.index.greetings.greetings.Model
import org.junit.Test

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(GreetingsInjectorProvider))
class GreetingsParserTest {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test def void testGreeting() {
		'''
		Hello test!
		'''.parse.assertNoErrors
	}
}