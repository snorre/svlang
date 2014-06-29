/**
 */
package org.svlang.v0.v0.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.svlang.v0.v0.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class V0FactoryImpl extends EFactoryImpl implements V0Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static V0Factory init()
  {
    try
    {
      V0Factory theV0Factory = (V0Factory)EPackage.Registry.INSTANCE.getEFactory(V0Package.eNS_URI);
      if (theV0Factory != null)
      {
        return theV0Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new V0FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public V0FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case V0Package.DOMAINMODEL: return createDomainmodel();
      case V0Package.ROOT_ELEMENT: return createRootElement();
      case V0Package.MAIN: return createMain();
      case V0Package.FUN: return createFun();
      case V0Package.EXPRESSION: return createExpression();
      case V0Package.SYMBOL: return createSymbol();
      case V0Package.ATOMIC: return createAtomic();
      case V0Package.TYPE: return createType();
      case V0Package.MY_INT_TYPE: return createMyIntType();
      case V0Package.MY_STRING_TYPE: return createMyStringType();
      case V0Package.ASSIGNMENT: return createAssignment();
      case V0Package.SYMBOL_REF: return createSymbolRef();
      case V0Package.NUMBER_LITERAL: return createNumberLiteral();
      case V0Package.STRING_LITERAL: return createStringLiteral();
      case V0Package.FUN_CALL: return createFunCall();
      case V0Package.INT: return createINT();
      case V0Package.STRING: return createSTRING();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootElement createRootElement()
  {
    RootElementImpl rootElement = new RootElementImpl();
    return rootElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fun createFun()
  {
    FunImpl fun = new FunImpl();
    return fun;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol createSymbol()
  {
    SymbolImpl symbol = new SymbolImpl();
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atomic createAtomic()
  {
    AtomicImpl atomic = new AtomicImpl();
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyIntType createMyIntType()
  {
    MyIntTypeImpl myIntType = new MyIntTypeImpl();
    return myIntType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyStringType createMyStringType()
  {
    MyStringTypeImpl myStringType = new MyStringTypeImpl();
    return myStringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRef createSymbolRef()
  {
    SymbolRefImpl symbolRef = new SymbolRefImpl();
    return symbolRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunCall createFunCall()
  {
    FunCallImpl funCall = new FunCallImpl();
    return funCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INT createINT()
  {
    INTImpl int_ = new INTImpl();
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING createSTRING()
  {
    STRINGImpl string = new STRINGImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public V0Package getV0Package()
  {
    return (V0Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static V0Package getPackage()
  {
    return V0Package.eINSTANCE;
  }

} //V0FactoryImpl
