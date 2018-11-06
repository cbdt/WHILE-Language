/**
 * generated by Xtext 2.15.0
 */
package org.xtext.whileLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.whileLanguage.Commands;
import org.xtext.whileLanguage.Definition;
import org.xtext.whileLanguage.Input;
import org.xtext.whileLanguage.Output;
import org.xtext.whileLanguage.WhileLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.whileLanguage.impl.DefinitionImpl#getI <em>I</em>}</li>
 *   <li>{@link org.xtext.whileLanguage.impl.DefinitionImpl#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.whileLanguage.impl.DefinitionImpl#getO <em>O</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The cached value of the '{@link #getI() <em>I</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI()
   * @generated
   * @ordered
   */
  protected Input i;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected Commands c;

  /**
   * The cached value of the '{@link #getO() <em>O</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO()
   * @generated
   * @ordered
   */
  protected Output o;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
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
    return WhileLanguagePackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetI(Input newI, NotificationChain msgs)
  {
    Input oldI = i;
    i = newI;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileLanguagePackage.DEFINITION__I, oldI, newI);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(Input newI)
  {
    if (newI != i)
    {
      NotificationChain msgs = null;
      if (i != null)
        msgs = ((InternalEObject)i).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileLanguagePackage.DEFINITION__I, null, msgs);
      if (newI != null)
        msgs = ((InternalEObject)newI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileLanguagePackage.DEFINITION__I, null, msgs);
      msgs = basicSetI(newI, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileLanguagePackage.DEFINITION__I, newI, newI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(Commands newC, NotificationChain msgs)
  {
    Commands oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileLanguagePackage.DEFINITION__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(Commands newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileLanguagePackage.DEFINITION__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileLanguagePackage.DEFINITION__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileLanguagePackage.DEFINITION__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output getO()
  {
    return o;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetO(Output newO, NotificationChain msgs)
  {
    Output oldO = o;
    o = newO;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileLanguagePackage.DEFINITION__O, oldO, newO);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setO(Output newO)
  {
    if (newO != o)
    {
      NotificationChain msgs = null;
      if (o != null)
        msgs = ((InternalEObject)o).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileLanguagePackage.DEFINITION__O, null, msgs);
      if (newO != null)
        msgs = ((InternalEObject)newO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileLanguagePackage.DEFINITION__O, null, msgs);
      msgs = basicSetO(newO, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileLanguagePackage.DEFINITION__O, newO, newO));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WhileLanguagePackage.DEFINITION__I:
        return basicSetI(null, msgs);
      case WhileLanguagePackage.DEFINITION__C:
        return basicSetC(null, msgs);
      case WhileLanguagePackage.DEFINITION__O:
        return basicSetO(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case WhileLanguagePackage.DEFINITION__I:
        return getI();
      case WhileLanguagePackage.DEFINITION__C:
        return getC();
      case WhileLanguagePackage.DEFINITION__O:
        return getO();
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
      case WhileLanguagePackage.DEFINITION__I:
        setI((Input)newValue);
        return;
      case WhileLanguagePackage.DEFINITION__C:
        setC((Commands)newValue);
        return;
      case WhileLanguagePackage.DEFINITION__O:
        setO((Output)newValue);
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
      case WhileLanguagePackage.DEFINITION__I:
        setI((Input)null);
        return;
      case WhileLanguagePackage.DEFINITION__C:
        setC((Commands)null);
        return;
      case WhileLanguagePackage.DEFINITION__O:
        setO((Output)null);
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
      case WhileLanguagePackage.DEFINITION__I:
        return i != null;
      case WhileLanguagePackage.DEFINITION__C:
        return c != null;
      case WhileLanguagePackage.DEFINITION__O:
        return o != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionImpl
