/**
 */
package org.xtext.example.index.greetings.greetings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hello Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.index.greetings.greetings.HelloGreeting#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.index.greetings.greetings.HelloGreeting#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.index.greetings.greetings.GreetingsPackage#getHelloGreeting()
 * @model
 * @generated
 */
public interface HelloGreeting extends Greeting
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.index.greetings.greetings.GreetingsPackage#getHelloGreeting_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.index.greetings.greetings.HelloGreeting#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(HelloGreeting)
   * @see org.xtext.example.index.greetings.greetings.GreetingsPackage#getHelloGreeting_Parent()
   * @model
   * @generated
   */
  HelloGreeting getParent();

  /**
   * Sets the value of the '{@link org.xtext.example.index.greetings.greetings.HelloGreeting#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(HelloGreeting value);

} // HelloGreeting
