/**
 */
package org.xtext.example.index.greetings.greetings;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.index.greetings.greetings.GreetingsFactory
 * @model kind="package"
 * @generated
 */
public interface GreetingsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "greetings";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/index/greetings/Greetings";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "greetings";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GreetingsPackage eINSTANCE = org.xtext.example.index.greetings.greetings.impl.GreetingsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.index.greetings.greetings.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.index.greetings.greetings.impl.ModelImpl
   * @see org.xtext.example.index.greetings.greetings.impl.GreetingsPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.index.greetings.greetings.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.index.greetings.greetings.impl.GreetingImpl
   * @see org.xtext.example.index.greetings.greetings.impl.GreetingsPackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 1;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.index.greetings.greetings.impl.HelloGreetingImpl <em>Hello Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.index.greetings.greetings.impl.HelloGreetingImpl
   * @see org.xtext.example.index.greetings.greetings.impl.GreetingsPackageImpl#getHelloGreeting()
   * @generated
   */
  int HELLO_GREETING = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELLO_GREETING__NAME = GREETING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELLO_GREETING__PARENT = GREETING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Hello Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELLO_GREETING_FEATURE_COUNT = GREETING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.index.greetings.greetings.impl.RefGreetingImpl <em>Ref Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.index.greetings.greetings.impl.RefGreetingImpl
   * @see org.xtext.example.index.greetings.greetings.impl.GreetingsPackageImpl#getRefGreeting()
   * @generated
   */
  int REF_GREETING = 3;

  /**
   * The feature id for the '<em><b>Greeting</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_GREETING__GREETING = GREETING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ref Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_GREETING_FEATURE_COUNT = GREETING_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.index.greetings.greetings.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.index.greetings.greetings.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.index.greetings.greetings.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see org.xtext.example.index.greetings.greetings.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link org.xtext.example.index.greetings.greetings.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see org.xtext.example.index.greetings.greetings.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for class '{@link org.xtext.example.index.greetings.greetings.HelloGreeting <em>Hello Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hello Greeting</em>'.
   * @see org.xtext.example.index.greetings.greetings.HelloGreeting
   * @generated
   */
  EClass getHelloGreeting();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.index.greetings.greetings.HelloGreeting#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.index.greetings.greetings.HelloGreeting#getName()
   * @see #getHelloGreeting()
   * @generated
   */
  EAttribute getHelloGreeting_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.index.greetings.greetings.HelloGreeting#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see org.xtext.example.index.greetings.greetings.HelloGreeting#getParent()
   * @see #getHelloGreeting()
   * @generated
   */
  EReference getHelloGreeting_Parent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.index.greetings.greetings.RefGreeting <em>Ref Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Greeting</em>'.
   * @see org.xtext.example.index.greetings.greetings.RefGreeting
   * @generated
   */
  EClass getRefGreeting();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.index.greetings.greetings.RefGreeting#getGreeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Greeting</em>'.
   * @see org.xtext.example.index.greetings.greetings.RefGreeting#getGreeting()
   * @see #getRefGreeting()
   * @generated
   */
  EReference getRefGreeting_Greeting();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GreetingsFactory getGreetingsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.index.greetings.greetings.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.index.greetings.greetings.impl.ModelImpl
     * @see org.xtext.example.index.greetings.greetings.impl.GreetingsPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

    /**
     * The meta object literal for the '{@link org.xtext.example.index.greetings.greetings.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.index.greetings.greetings.impl.GreetingImpl
     * @see org.xtext.example.index.greetings.greetings.impl.GreetingsPackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '{@link org.xtext.example.index.greetings.greetings.impl.HelloGreetingImpl <em>Hello Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.index.greetings.greetings.impl.HelloGreetingImpl
     * @see org.xtext.example.index.greetings.greetings.impl.GreetingsPackageImpl#getHelloGreeting()
     * @generated
     */
    EClass HELLO_GREETING = eINSTANCE.getHelloGreeting();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELLO_GREETING__NAME = eINSTANCE.getHelloGreeting_Name();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELLO_GREETING__PARENT = eINSTANCE.getHelloGreeting_Parent();

    /**
     * The meta object literal for the '{@link org.xtext.example.index.greetings.greetings.impl.RefGreetingImpl <em>Ref Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.index.greetings.greetings.impl.RefGreetingImpl
     * @see org.xtext.example.index.greetings.greetings.impl.GreetingsPackageImpl#getRefGreeting()
     * @generated
     */
    EClass REF_GREETING = eINSTANCE.getRefGreeting();

    /**
     * The meta object literal for the '<em><b>Greeting</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_GREETING__GREETING = eINSTANCE.getRefGreeting_Greeting();

  }

} //GreetingsPackage
