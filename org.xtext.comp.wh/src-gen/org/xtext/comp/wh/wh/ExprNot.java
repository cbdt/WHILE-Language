/**
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.wh.wh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.wh.ExprNot#getHasNot <em>Has Not</em>}</li>
 *   <li>{@link org.xtext.comp.wh.wh.ExprNot#getExpr_eq <em>Expr eq</em>}</li>
 * </ul>
 *
 * @see org.xtext.comp.wh.wh.WhPackage#getExprNot()
 * @model
 * @generated
 */
public interface ExprNot extends EObject
{
  /**
   * Returns the value of the '<em><b>Has Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Not</em>' attribute.
   * @see #setHasNot(String)
   * @see org.xtext.comp.wh.wh.WhPackage#getExprNot_HasNot()
   * @model
   * @generated
   */
  String getHasNot();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.wh.ExprNot#getHasNot <em>Has Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Not</em>' attribute.
   * @see #getHasNot()
   * @generated
   */
  void setHasNot(String value);

  /**
   * Returns the value of the '<em><b>Expr eq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr eq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr eq</em>' containment reference.
   * @see #setExpr_eq(ExprEq)
   * @see org.xtext.comp.wh.wh.WhPackage#getExprNot_Expr_eq()
   * @model containment="true"
   * @generated
   */
  ExprEq getExpr_eq();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.wh.ExprNot#getExpr_eq <em>Expr eq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr eq</em>' containment reference.
   * @see #getExpr_eq()
   * @generated
   */
  void setExpr_eq(ExprEq value);

} // ExprNot
