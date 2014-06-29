/**
 */
package org.svlang.v0.v0.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.svlang.v0.v0.Fun;
import org.svlang.v0.v0.FunCall;
import org.svlang.v0.v0.V0Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fun Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.svlang.v0.v0.impl.FunCallImpl#getFun <em>Fun</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunCallImpl extends AtomicImpl implements FunCall
{
  /**
   * The cached value of the '{@link #getFun() <em>Fun</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFun()
   * @generated
   * @ordered
   */
  protected Fun fun;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunCallImpl()
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
    return V0Package.Literals.FUN_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fun getFun()
  {
    if (fun != null && fun.eIsProxy())
    {
      InternalEObject oldFun = (InternalEObject)fun;
      fun = (Fun)eResolveProxy(oldFun);
      if (fun != oldFun)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, V0Package.FUN_CALL__FUN, oldFun, fun));
      }
    }
    return fun;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fun basicGetFun()
  {
    return fun;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFun(Fun newFun)
  {
    Fun oldFun = fun;
    fun = newFun;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, V0Package.FUN_CALL__FUN, oldFun, fun));
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
      case V0Package.FUN_CALL__FUN:
        if (resolve) return getFun();
        return basicGetFun();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case V0Package.FUN_CALL__FUN:
        setFun((Fun)newValue);
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
      case V0Package.FUN_CALL__FUN:
        setFun((Fun)null);
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
      case V0Package.FUN_CALL__FUN:
        return fun != null;
    }
    return super.eIsSet(featureID);
  }

} //FunCallImpl
