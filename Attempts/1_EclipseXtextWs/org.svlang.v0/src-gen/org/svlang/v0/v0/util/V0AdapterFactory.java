/**
 */
package org.svlang.v0.v0.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.svlang.v0.v0.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.svlang.v0.v0.V0Package
 * @generated
 */
public class V0AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static V0Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public V0AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = V0Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected V0Switch<Adapter> modelSwitch =
    new V0Switch<Adapter>()
    {
      @Override
      public Adapter caseDomainmodel(Domainmodel object)
      {
        return createDomainmodelAdapter();
      }
      @Override
      public Adapter caseRootElement(RootElement object)
      {
        return createRootElementAdapter();
      }
      @Override
      public Adapter caseMain(Main object)
      {
        return createMainAdapter();
      }
      @Override
      public Adapter caseFun(Fun object)
      {
        return createFunAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseSymbol(Symbol object)
      {
        return createSymbolAdapter();
      }
      @Override
      public Adapter caseAtomic(Atomic object)
      {
        return createAtomicAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseMyIntType(MyIntType object)
      {
        return createMyIntTypeAdapter();
      }
      @Override
      public Adapter caseMyStringType(MyStringType object)
      {
        return createMyStringTypeAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseSymbolRef(SymbolRef object)
      {
        return createSymbolRefAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseFunCall(FunCall object)
      {
        return createFunCallAdapter();
      }
      @Override
      public Adapter caseINT(INT object)
      {
        return createINTAdapter();
      }
      @Override
      public Adapter caseSTRING(STRING object)
      {
        return createSTRINGAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.Domainmodel
   * @generated
   */
  public Adapter createDomainmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.RootElement <em>Root Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.RootElement
   * @generated
   */
  public Adapter createRootElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.Main
   * @generated
   */
  public Adapter createMainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.Fun <em>Fun</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.Fun
   * @generated
   */
  public Adapter createFunAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.Symbol
   * @generated
   */
  public Adapter createSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.Atomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.Atomic
   * @generated
   */
  public Adapter createAtomicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.MyIntType <em>My Int Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.MyIntType
   * @generated
   */
  public Adapter createMyIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.MyStringType <em>My String Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.MyStringType
   * @generated
   */
  public Adapter createMyStringTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.SymbolRef <em>Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.SymbolRef
   * @generated
   */
  public Adapter createSymbolRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.FunCall <em>Fun Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.FunCall
   * @generated
   */
  public Adapter createFunCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.INT <em>INT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.INT
   * @generated
   */
  public Adapter createINTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.svlang.v0.v0.STRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.svlang.v0.v0.STRING
   * @generated
   */
  public Adapter createSTRINGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //V0AdapterFactory
