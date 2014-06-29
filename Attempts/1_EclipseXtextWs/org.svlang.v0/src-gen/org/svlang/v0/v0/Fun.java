/**
 */
package org.svlang.v0.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.svlang.v0.v0.Fun#getName <em>Name</em>}</li>
 *   <li>{@link org.svlang.v0.v0.Fun#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.svlang.v0.v0.Fun#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.svlang.v0.v0.V0Package#getFun()
 * @model
 * @generated
 */
public interface Fun extends EObject
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
   * Returns the value of the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' reference.
   * @see #setReturnType(Type)
   * @see org.svlang.v0.v0.V0Package#getFun_ReturnType()
   * @model
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link org.svlang.v0.v0.Fun#getReturnType <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.svlang.v0.v0.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.svlang.v0.v0.V0Package#getFun_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // Fun
