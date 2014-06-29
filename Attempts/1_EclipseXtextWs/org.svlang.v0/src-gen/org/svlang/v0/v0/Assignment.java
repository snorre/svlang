/**
 */
package org.svlang.v0.v0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.svlang.v0.v0.Assignment#getType <em>Type</em>}</li>
 *   <li>{@link org.svlang.v0.v0.Assignment#getName <em>Name</em>}</li>
 *   <li>{@link org.svlang.v0.v0.Assignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.svlang.v0.v0.V0Package#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Symbol
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see org.svlang.v0.v0.V0Package#getAssignment_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.svlang.v0.v0.Assignment#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

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
   * @see org.svlang.v0.v0.V0Package#getAssignment_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.svlang.v0.v0.Assignment#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Atomic)
   * @see org.svlang.v0.v0.V0Package#getAssignment_Value()
   * @model containment="true"
   * @generated
   */
  Atomic getValue();

  /**
   * Sets the value of the '{@link org.svlang.v0.v0.Assignment#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Atomic value);

} // Assignment
