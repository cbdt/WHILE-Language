/**
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.wh.wh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.wh.For#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.comp.wh.wh.For#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see org.xtext.comp.wh.wh.WhPackage#getFor()
 * @model
 * @generated
 */
public interface For extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expr)
   * @see org.xtext.comp.wh.wh.WhPackage#getFor_Cond()
   * @model containment="true"
   * @generated
   */
  Expr getCond();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.wh.For#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expr value);

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference.
   * @see #setCommands(Commands)
   * @see org.xtext.comp.wh.wh.WhPackage#getFor_Commands()
   * @model containment="true"
   * @generated
   */
  Commands getCommands();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.wh.For#getCommands <em>Commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commands</em>' containment reference.
   * @see #getCommands()
   * @generated
   */
  void setCommands(Commands value);

} // For
