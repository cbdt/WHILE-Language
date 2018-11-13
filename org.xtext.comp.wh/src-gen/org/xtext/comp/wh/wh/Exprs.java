/**
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.wh.wh;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exprs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.wh.Exprs#getE <em>E</em>}</li>
 * </ul>
 *
 * @see org.xtext.comp.wh.wh.WhPackage#getExprs()
 * @model
 * @generated
 */
public interface Exprs extends EObject
{
  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.comp.wh.wh.Expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see org.xtext.comp.wh.wh.WhPackage#getExprs_E()
   * @model containment="true"
   * @generated
   */
  EList<Expr> getE();

} // Exprs
