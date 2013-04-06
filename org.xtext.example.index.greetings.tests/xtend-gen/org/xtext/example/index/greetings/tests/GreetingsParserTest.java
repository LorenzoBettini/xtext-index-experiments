package org.xtext.example.index.greetings.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.index.greetings.GreetingsInjectorProvider;
import org.xtext.example.index.greetings.greetings.Model;

@RunWith(XtextRunner.class)
@InjectWith(GreetingsInjectorProvider.class)
@SuppressWarnings("all")
public class GreetingsParserTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testGreeting() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello test!");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
