/**
 */
package org.svlang.v0.v0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.svlang.v0.v0.FunCall#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.svlang.v0.v0.V0Package#getFunCall()
 * @model
 * @generated
 */
public interface FunCall extends Expression
{
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
   * @see org.svlang.v0.v0.V0Package#getFunCall_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.svlang.v0.v0.FunCall#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // FunCall
