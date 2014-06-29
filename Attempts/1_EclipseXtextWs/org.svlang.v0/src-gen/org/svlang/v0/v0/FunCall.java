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
 *   <li>{@link org.svlang.v0.v0.FunCall#getFun <em>Fun</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.svlang.v0.v0.V0Package#getFunCall()
 * @model
 * @generated
 */
public interface FunCall extends Atomic
{
  /**
   * Returns the value of the '<em><b>Fun</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fun</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fun</em>' reference.
   * @see #setFun(Fun)
   * @see org.svlang.v0.v0.V0Package#getFunCall_Fun()
   * @model
   * @generated
   */
  Fun getFun();

  /**
   * Sets the value of the '{@link org.svlang.v0.v0.FunCall#getFun <em>Fun</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fun</em>' reference.
   * @see #getFun()
   * @generated
   */
  void setFun(Fun value);

} // FunCall
