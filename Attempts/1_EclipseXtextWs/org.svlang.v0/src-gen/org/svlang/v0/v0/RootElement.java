/**
 */
package org.svlang.v0.v0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.svlang.v0.v0.RootElement#getMain <em>Main</em>}</li>
 *   <li>{@link org.svlang.v0.v0.RootElement#getFuns <em>Funs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.svlang.v0.v0.V0Package#getRootElement()
 * @model
 * @generated
 */
public interface RootElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(Main)
   * @see org.svlang.v0.v0.V0Package#getRootElement_Main()
   * @model containment="true"
   * @generated
   */
  Main getMain();

  /**
   * Sets the value of the '{@link org.svlang.v0.v0.RootElement#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(Main value);

  /**
   * Returns the value of the '<em><b>Funs</b></em>' containment reference list.
   * The list contents are of type {@link org.svlang.v0.v0.Fun}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Funs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funs</em>' containment reference list.
   * @see org.svlang.v0.v0.V0Package#getRootElement_Funs()
   * @model containment="true"
   * @generated
   */
  EList<Fun> getFuns();

} // RootElement
