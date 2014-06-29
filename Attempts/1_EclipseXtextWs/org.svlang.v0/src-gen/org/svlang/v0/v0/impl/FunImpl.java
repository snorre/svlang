/**
 */
package org.svlang.v0.v0.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.svlang.v0.v0.Expression;
import org.svlang.v0.v0.Fun;
import org.svlang.v0.v0.Type;
import org.svlang.v0.v0.V0Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fun</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.svlang.v0.v0.impl.FunImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.svlang.v0.v0.impl.FunImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.svlang.v0.v0.impl.FunImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunImpl extends MinimalEObjectImpl.Container implements Fun
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected Type returnType;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return V0Package.Literals.FUN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, V0Package.FUN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getReturnType()
  {
    if (returnType != null && returnType.eIsProxy())
    {
      InternalEObject oldReturnType = (InternalEObject)returnType;
      returnType = (Type)eResolveProxy(oldReturnType);
      if (returnType != oldReturnType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, V0Package.FUN__RETURN_TYPE, oldReturnType, returnType));
      }
    }
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(Type newReturnType)
  {
    Type oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, V0Package.FUN__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<Expression>(Expression.class, this, V0Package.FUN__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case V0Package.FUN__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case V0Package.FUN__NAME:
        return getName();
      case V0Package.FUN__RETURN_TYPE:
        if (resolve) return getReturnType();
        return basicGetReturnType();
      case V0Package.FUN__EXPRESSIONS:
        return getExpressions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case V0Package.FUN__NAME:
        setName((String)newValue);
        return;
      case V0Package.FUN__RETURN_TYPE:
        setReturnType((Type)newValue);
        return;
      case V0Package.FUN__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case V0Package.FUN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case V0Package.FUN__RETURN_TYPE:
        setReturnType((Type)null);
        return;
      case V0Package.FUN__EXPRESSIONS:
        getExpressions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case V0Package.FUN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case V0Package.FUN__RETURN_TYPE:
        return returnType != null;
      case V0Package.FUN__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunImpl
