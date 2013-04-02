/**
 */
package org.xtext.example.index.greetings.greetings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.index.greetings.greetings.RefGreeting#getGreeting <em>Greeting</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.index.greetings.greetings.GreetingsPackage#getRefGreeting()
 * @model
 * @generated
 */
public interface RefGreeting extends Greeting
{
  /**
   * Returns the value of the '<em><b>Greeting</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greeting</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greeting</em>' reference.
   * @see #setGreeting(HelloGreeting)
   * @see org.xtext.example.index.greetings.greetings.GreetingsPackage#getRefGreeting_Greeting()
   * @model
   * @generated
   */
  HelloGreeting getGreeting();

  /**
   * Sets the value of the '{@link org.xtext.example.index.greetings.greetings.RefGreeting#getGreeting <em>Greeting</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Greeting</em>' reference.
   * @see #getGreeting()
   * @generated
   */
  void setGreeting(HelloGreeting value);

} // RefGreeting
