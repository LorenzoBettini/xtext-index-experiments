/**
 */
package org.xtext.example.index.greetings.greetings.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.index.greetings.greetings.GreetingsPackage;
import org.xtext.example.index.greetings.greetings.HelloGreeting;
import org.xtext.example.index.greetings.greetings.RefGreeting;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Greeting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.index.greetings.greetings.impl.RefGreetingImpl#getGreeting <em>Greeting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefGreetingImpl extends GreetingImpl implements RefGreeting
{
  /**
   * The cached value of the '{@link #getGreeting() <em>Greeting</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreeting()
   * @generated
   * @ordered
   */
  protected HelloGreeting greeting;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefGreetingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GreetingsPackage.Literals.REF_GREETING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelloGreeting getGreeting()
  {
    if (greeting != null && greeting.eIsProxy())
    {
      InternalEObject oldGreeting = (InternalEObject)greeting;
      greeting = (HelloGreeting)eResolveProxy(oldGreeting);
      if (greeting != oldGreeting)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GreetingsPackage.REF_GREETING__GREETING, oldGreeting, greeting));
      }
    }
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelloGreeting basicGetGreeting()
  {
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreeting(HelloGreeting newGreeting)
  {
    HelloGreeting oldGreeting = greeting;
    greeting = newGreeting;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GreetingsPackage.REF_GREETING__GREETING, oldGreeting, greeting));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GreetingsPackage.REF_GREETING__GREETING:
        if (resolve) return getGreeting();
        return basicGetGreeting();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GreetingsPackage.REF_GREETING__GREETING:
        setGreeting((HelloGreeting)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GreetingsPackage.REF_GREETING__GREETING:
        setGreeting((HelloGreeting)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GreetingsPackage.REF_GREETING__GREETING:
        return greeting != null;
    }
    return super.eIsSet(featureID);
  }

} //RefGreetingImpl
