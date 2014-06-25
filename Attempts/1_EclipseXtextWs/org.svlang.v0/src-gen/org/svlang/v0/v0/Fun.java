/**
 */
package org.svlang.v0.v0;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.svlang.v0.v0.Fun#getName <em>Name</em>}</li>
 *   <li>{@link org.svlang.v0.v0.Fun#getRetType <em>Ret Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.svlang.v0.v0.V0Package#getFun()
 * @model
 * @generated
 */
public interface Fun extends RootElement
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
   * @see org.svlang.v0.v0.V0Package#getFun_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.svlang.v0.v0.Fun#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ret Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ret Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ret Type</em>' attribute.
   * @see #setRetType(String)
   * @see org.svlang.v0.v0.V0Package#getFun_RetType()
   * @model
   * @generated
   */
  String getRetType();

  /**
   * Sets the value of the '{@link org.svlang.v0.v0.Fun#getRetType <em>Ret Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ret Type</em>' attribute.
   * @see #getRetType()
   * @generated
   */
  void setRetType(String value);

} // Fun
