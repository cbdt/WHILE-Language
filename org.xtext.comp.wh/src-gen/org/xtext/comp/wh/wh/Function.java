/**
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.wh.wh;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.comp.wh.wh.Function#getFunction_name <em>Function name</em>}</li>
 *   <li>{@link org.xtext.comp.wh.wh.Function#getD <em>D</em>}</li>
 * </ul>
 *
 * @see org.xtext.comp.wh.wh.WhPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Function name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function name</em>' attribute.
   * @see #setFunction_name(String)
   * @see org.xtext.comp.wh.wh.WhPackage#getFunction_Function_name()
   * @model
   * @generated
   */
  String getFunction_name();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.wh.Function#getFunction_name <em>Function name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function name</em>' attribute.
   * @see #getFunction_name()
   * @generated
   */
  void setFunction_name(String value);

  /**
   * Returns the value of the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' containment reference.
   * @see #setD(Definition)
   * @see org.xtext.comp.wh.wh.WhPackage#getFunction_D()
   * @model containment="true"
   * @generated
   */
  Definition getD();

  /**
   * Sets the value of the '{@link org.xtext.comp.wh.wh.Function#getD <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' containment reference.
   * @see #getD()
   * @generated
   */
  void setD(Definition value);

} // Function
