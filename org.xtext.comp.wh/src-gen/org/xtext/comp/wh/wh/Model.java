/**
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.wh.wh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.wh.Model#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.comp.wh.wh.WhPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' containment reference.
   * @see #setText(Program)
   * @see org.xtext.comp.wh.wh.WhPackage#getModel_Text()
   * @model containment="true"
   * @generated
   */
  Program getText();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.wh.Model#getText <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' containment reference.
   * @see #getText()
   * @generated
   */
  void setText(Program value);

} // Model
