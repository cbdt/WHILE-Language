/**
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.wh.wh.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.comp.wh.wh.ExprNot;
import org.xtext.comp.wh.wh.ExprOr;
import org.xtext.comp.wh.wh.WhPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Or</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.wh.impl.ExprOrImpl#getExpr_not <em>Expr not</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprOrImpl extends MinimalEObjectImpl.Container implements ExprOr
{
  /**
   * The cached value of the '{@link #getExpr_not() <em>Expr not</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr_not()
   * @generated
   * @ordered
   */
  protected EList<ExprNot> expr_not;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprOrImpl()
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
    return WhPackage.Literals.EXPR_OR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExprNot> getExpr_not()
  {
    if (expr_not == null)
    {
      expr_not = new EObjectContainmentEList<ExprNot>(ExprNot.class, this, WhPackage.EXPR_OR__EXPR_NOT);
    }
    return expr_not;
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
      case WhPackage.EXPR_OR__EXPR_NOT:
        return ((InternalEList<?>)getExpr_not()).basicRemove(otherEnd, msgs);
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
      case WhPackage.EXPR_OR__EXPR_NOT:
        return getExpr_not();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WhPackage.EXPR_OR__EXPR_NOT:
        getExpr_not().clear();
        getExpr_not().addAll((Collection<? extends ExprNot>)newValue);
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
      case WhPackage.EXPR_OR__EXPR_NOT:
        getExpr_not().clear();
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
      case WhPackage.EXPR_OR__EXPR_NOT:
        return expr_not != null && !expr_not.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExprOrImpl
