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
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT__MAIN = 0;

  /**
   * The feature id for the '<em><b>Funs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT__FUNS = 1;

  /**
   * The number of structural features of the '<em>Root Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_ELEMENT_FEATURE_COUNT = 2;

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
  int MAIN__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Main</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN__NAME = 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN__RETURN_TYPE = 1;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN__EXPRESSIONS = 2;

  /**
   * The number of structural features of the '<em>Fun</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_FEATURE_COUNT = 3;

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
   * The meta object id for the '{@link org.svlang.v0.v0.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.SymbolImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 5;

  /**
   * The number of structural features of the '<em>Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.AtomicImpl <em>Atomic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.AtomicImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getAtomic()
   * @generated
   */
  int ATOMIC = 6;

  /**
   * The number of structural features of the '<em>Atomic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.TypeImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getType()
   * @generated
   */
  int TYPE = 7;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.MyIntTypeImpl <em>My Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.MyIntTypeImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getMyIntType()
   * @generated
   */
  int MY_INT_TYPE = 8;

  /**
   * The number of structural features of the '<em>My Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_INT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.MyStringTypeImpl <em>My String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.MyStringTypeImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getMyStringType()
   * @generated
   */
  int MY_STRING_TYPE = 9;

  /**
   * The number of structural features of the '<em>My String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_STRING_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.AssignmentImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__TYPE = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__NAME = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VALUE = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.SymbolRefImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getSymbolRef()
   * @generated
   */
  int SYMBOL_REF = 11;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF__SYMBOL = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Symbol Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.NumberLiteralImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.StringLiteralImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.FunCallImpl <em>Fun Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.FunCallImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getFunCall()
   * @generated
   */
  int FUN_CALL = 14;

  /**
   * The feature id for the '<em><b>Fun</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_CALL__FUN = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fun Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUN_CALL_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.INTImpl <em>INT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.INTImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getINT()
   * @generated
   */
  int INT = 15;

  /**
   * The number of structural features of the '<em>INT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_FEATURE_COUNT = MY_INT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.svlang.v0.v0.impl.STRINGImpl <em>STRING</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.svlang.v0.v0.impl.STRINGImpl
   * @see org.svlang.v0.v0.impl.V0PackageImpl#getSTRING()
   * @generated
   */
  int STRING = 16;

  /**
   * The number of structural features of the '<em>STRING</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE_COUNT = MY_STRING_TYPE_FEATURE_COUNT + 0;


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
   * Returns the meta object for the containment reference '{@link org.svlang.v0.v0.RootElement#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see org.svlang.v0.v0.RootElement#getMain()
   * @see #getRootElement()
   * @generated
   */
  EReference getRootElement_Main();

  /**
   * Returns the meta object for the containment reference list '{@link org.svlang.v0.v0.RootElement#getFuns <em>Funs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Funs</em>'.
   * @see org.svlang.v0.v0.RootElement#getFuns()
   * @see #getRootElement()
   * @generated
   */
  EReference getRootElement_Funs();

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
   * Returns the meta object for the containment reference list '{@link org.svlang.v0.v0.Main#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.svlang.v0.v0.Main#getExpressions()
   * @see #getMain()
   * @generated
   */
  EReference getMain_Expressions();

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
   * Returns the meta object for the reference '{@link org.svlang.v0.v0.Fun#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Return Type</em>'.
   * @see org.svlang.v0.v0.Fun#getReturnType()
   * @see #getFun()
   * @generated
   */
  EReference getFun_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link org.svlang.v0.v0.Fun#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.svlang.v0.v0.Fun#getExpressions()
   * @see #getFun()
   * @generated
   */
  EReference getFun_Expressions();

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
   * Returns the meta object for class '{@link org.svlang.v0.v0.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol</em>'.
   * @see org.svlang.v0.v0.Symbol
   * @generated
   */
  EClass getSymbol();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.Atomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic</em>'.
   * @see org.svlang.v0.v0.Atomic
   * @generated
   */
  EClass getAtomic();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.svlang.v0.v0.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.MyIntType <em>My Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Int Type</em>'.
   * @see org.svlang.v0.v0.MyIntType
   * @generated
   */
  EClass getMyIntType();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.MyStringType <em>My String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My String Type</em>'.
   * @see org.svlang.v0.v0.MyStringType
   * @generated
   */
  EClass getMyStringType();

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
   * Returns the meta object for the reference '{@link org.svlang.v0.v0.Assignment#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.svlang.v0.v0.Assignment#getType()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Type();

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
   * Returns the meta object for class '{@link org.svlang.v0.v0.SymbolRef <em>Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Ref</em>'.
   * @see org.svlang.v0.v0.SymbolRef
   * @generated
   */
  EClass getSymbolRef();

  /**
   * Returns the meta object for the reference '{@link org.svlang.v0.v0.SymbolRef#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbol</em>'.
   * @see org.svlang.v0.v0.SymbolRef#getSymbol()
   * @see #getSymbolRef()
   * @generated
   */
  EReference getSymbolRef_Symbol();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.svlang.v0.v0.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.svlang.v0.v0.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.svlang.v0.v0.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.svlang.v0.v0.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.svlang.v0.v0.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.svlang.v0.v0.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

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
   * Returns the meta object for the reference '{@link org.svlang.v0.v0.FunCall#getFun <em>Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fun</em>'.
   * @see org.svlang.v0.v0.FunCall#getFun()
   * @see #getFunCall()
   * @generated
   */
  EReference getFunCall_Fun();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.INT <em>INT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>INT</em>'.
   * @see org.svlang.v0.v0.INT
   * @generated
   */
  EClass getINT();

  /**
   * Returns the meta object for class '{@link org.svlang.v0.v0.STRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STRING</em>'.
   * @see org.svlang.v0.v0.STRING
   * @generated
   */
  EClass getSTRING();

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
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_ELEMENT__MAIN = eINSTANCE.getRootElement_Main();

    /**
     * The meta object literal for the '<em><b>Funs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_ELEMENT__FUNS = eINSTANCE.getRootElement_Funs();

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
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN__EXPRESSIONS = eINSTANCE.getMain_Expressions();

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
     * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUN__RETURN_TYPE = eINSTANCE.getFun_ReturnType();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUN__EXPRESSIONS = eINSTANCE.getFun_Expressions();

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
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.SymbolImpl <em>Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.SymbolImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getSymbol()
     * @generated
     */
    EClass SYMBOL = eINSTANCE.getSymbol();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.AtomicImpl <em>Atomic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.AtomicImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getAtomic()
     * @generated
     */
    EClass ATOMIC = eINSTANCE.getAtomic();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.TypeImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.MyIntTypeImpl <em>My Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.MyIntTypeImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getMyIntType()
     * @generated
     */
    EClass MY_INT_TYPE = eINSTANCE.getMyIntType();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.MyStringTypeImpl <em>My String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.MyStringTypeImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getMyStringType()
     * @generated
     */
    EClass MY_STRING_TYPE = eINSTANCE.getMyStringType();

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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__TYPE = eINSTANCE.getAssignment_Type();

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
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.SymbolRefImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getSymbolRef()
     * @generated
     */
    EClass SYMBOL_REF = eINSTANCE.getSymbolRef();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_REF__SYMBOL = eINSTANCE.getSymbolRef_Symbol();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.NumberLiteralImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.StringLiteralImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

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
     * The meta object literal for the '<em><b>Fun</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUN_CALL__FUN = eINSTANCE.getFunCall_Fun();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.INTImpl <em>INT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.INTImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getINT()
     * @generated
     */
    EClass INT = eINSTANCE.getINT();

    /**
     * The meta object literal for the '{@link org.svlang.v0.v0.impl.STRINGImpl <em>STRING</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.svlang.v0.v0.impl.STRINGImpl
     * @see org.svlang.v0.v0.impl.V0PackageImpl#getSTRING()
     * @generated
     */
    EClass STRING = eINSTANCE.getSTRING();

  }

} //V0Package
