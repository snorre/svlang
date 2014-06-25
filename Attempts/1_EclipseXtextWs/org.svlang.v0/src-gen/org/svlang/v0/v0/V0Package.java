/**
 */
package org.svlang.v0.v0;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.svlang.v0.v0.V0Factory
 * @model kind="package"
 * @generated
 */
public interface V0Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "v0";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.svlang.org/v0/V0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "v0";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  V0Package eINSTANCE = org.svlang.v0.v0.impl.V0PackageImpl.init();

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.DomainmodelImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.RootElementImpl <em>Root Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.RootElementImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getRootElement()
   * @generated
   */
  int ROOT_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Root Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.MainImpl <em>Main</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.MainImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getMain()
   * @generated
   */
  int MAIN = 2;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN__EXPRESSIONS = ROOT_ELEMENT__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.FunImpl <em>Fun</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.FunImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getFun()
   * @generated
   */
  int FUN = 3;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN__EXPRESSIONS = ROOT_ELEMENT__EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ret Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN__RET_TYPE = ROOT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fun</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.ExpressionImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 4;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.AssignmentImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VALUE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.FunCallImpl <em>Fun Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.FunCallImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getFunCall()
   * @generated
   */
  int FUN_CALL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_CALL__NAME = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fun Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.ReturnImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getReturn()
   * @generated
   */
  int RETURN = 8;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.PassableImpl <em>Passable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.PassableImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getPassable()
   * @generated
   */
  int PASSABLE = 7;

  /**
   * The number of structural features of the '<em>Passable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PASSABLE_FEATURE_COUNT = RETURN_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see org.svlang.v0.v0.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.svlang.v0.v0.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.svlang.v0.v0.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.RootElement <em>Root Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root Element</em>'.
   * @see org.svlang.v0.v0.RootElement
   * @generated
   */
  EClass getRootElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.svlang.v0.v0.RootElement#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.svlang.v0.v0.RootElement#getExpressions()
   * @see #getRootElement()
   * @generated
   */
  EReference getRootElement_Expressions();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main</em>'.
   * @see org.svlang.v0.v0.Main
   * @generated
   */
  EClass getMain();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.Fun <em>Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fun</em>'.
   * @see org.svlang.v0.v0.Fun
   * @generated
   */
  EClass getFun();

  /**
   * Returns the meta object for the attribute '{@link org.svlang.v0.v0.Fun#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.svlang.v0.v0.Fun#getName()
   * @see #getFun()
   * @generated
   */
  EAttribute getFun_Name();

  /**
   * Returns the meta object for the attribute '{@link org.svlang.v0.v0.Fun#getRetType <em>Ret Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ret Type</em>'.
   * @see org.svlang.v0.v0.Fun#getRetType()
   * @see #getFun()
   * @generated
   */
  EAttribute getFun_RetType();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.svlang.v0.v0.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.svlang.v0.v0.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.svlang.v0.v0.Assignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.svlang.v0.v0.Assignment#getName()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.svlang.v0.v0.Assignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.svlang.v0.v0.Assignment#getValue()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.FunCall <em>Fun Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fun Call</em>'.
   * @see org.svlang.v0.v0.FunCall
   * @generated
   */
  EClass getFunCall();

  /**
   * Returns the meta object for the attribute '{@link org.svlang.v0.v0.FunCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.svlang.v0.v0.FunCall#getName()
   * @see #getFunCall()
   * @generated
   */
  EAttribute getFunCall_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.svlang.v0.v0.FunCall#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.svlang.v0.v0.FunCall#getParameters()
   * @see #getFunCall()
   * @generated
   */
  EReference getFunCall_Parameters();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.Passable <em>Passable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Passable</em>'.
   * @see org.svlang.v0.v0.Passable
   * @generated
   */
  EClass getPassable();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see org.svlang.v0.v0.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  V0Factory getV0Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.DomainmodelImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.RootElementImpl <em>Root Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.RootElementImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getRootElement()
     * @generated
     */
    EClass ROOT_ELEMENT = eINSTANCE.getRootElement();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_ELEMENT__EXPRESSIONS = eINSTANCE.getRootElement_Expressions();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.MainImpl <em>Main</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.MainImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getMain()
     * @generated
     */
    EClass MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.FunImpl <em>Fun</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.FunImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getFun()
     * @generated
     */
    EClass FUN = eINSTANCE.getFun();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUN__NAME = eINSTANCE.getFun_Name();

    /**
     * The meta object literal for the '<em><b>Ret Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUN__RET_TYPE = eINSTANCE.getFun_RetType();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.ExpressionImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.AssignmentImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__NAME = eINSTANCE.getAssignment_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.FunCallImpl <em>Fun Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.FunCallImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getFunCall()
     * @generated
     */
    EClass FUN_CALL = eINSTANCE.getFunCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUN_CALL__NAME = eINSTANCE.getFunCall_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUN_CALL__PARAMETERS = eINSTANCE.getFunCall_Parameters();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.PassableImpl <em>Passable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.PassableImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getPassable()
     * @generated
     */
    EClass PASSABLE = eINSTANCE.getPassable();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.ReturnImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

  }

} //V0Package
