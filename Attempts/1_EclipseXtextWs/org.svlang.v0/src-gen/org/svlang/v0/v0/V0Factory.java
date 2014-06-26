/**
 */
package org.svlang.v0.v0;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.svlang.v0.v0.V0Package
 * @generated
 */
public interface V0Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  V0Factory eINSTANCE = org.svlang.v0.v0.impl.V0FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domainmodel</em>'.
   * @generated
   */
  Domainmodel createDomainmodel();

  /**
   * Returns a new object of class '<em>Root Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root Element</em>'.
   * @generated
   */
  RootElement createRootElement();

  /**
   * Returns a new object of class '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main</em>'.
   * @generated
   */
  Main createMain();

  /**
   * Returns a new object of class '<em>Fun</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fun</em>'.
   * @generated
   */
  Fun createFun();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Fun Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fun Call</em>'.
   * @generated
   */
  FunCall createFunCall();

  /**
   * Returns a new object of class '<em>Println</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Println</em>'.
   * @generated
   */
  Println createPrintln();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  V0Package getV0Package();

} //V0Factory
