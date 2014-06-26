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

import org.svlang.v0.v0.Fun;
import org.svlang.v0.v0.Main;
import org.svlang.v0.v0.RootElement;
import org.svlang.v0.v0.V0Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.svlang.v0.v0.impl.RootElementImpl#getMain <em>Main</em>}</li>
 *   <li>{@link org.svlang.v0.v0.impl.RootElementImpl#getFuns <em>Funs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootElementImpl extends MinimalEObjectImpl.Container implements RootElement
{
  /**
   * The cached value of the '{@link #getMain() <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected Main main;

  /**
   * The cached value of the '{@link #getFuns() <em>Funs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuns()
   * @generated
   * @ordered
   */
  protected EList<Fun> funs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RootElementImpl()
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
    return V0Package.Literals.ROOT_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main getMain()
  {
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMain(Main newMain, NotificationChain msgs)
  {
    Main oldMain = main;
    main = newMain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.ROOT_ELEMENT__MAIN, oldMain, newMain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMain(Main newMain)
  {
    if (newMain != main)
    {
      NotificationChain msgs = null;
      if (main != null)
        msgs = ((InternalEObject)main).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.ROOT_ELEMENT__MAIN, null, msgs);
      if (newMain != null)
        msgs = ((InternalEObject)newMain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.ROOT_ELEMENT__MAIN, null, msgs);
      msgs = basicSetMain(newMain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, V0Package.ROOT_ELEMENT__MAIN, newMain, newMain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fun> getFuns()
  {
    if (funs == null)
    {
      funs = new EObjectContainmentEList<Fun>(Fun.class, this, V0Package.ROOT_ELEMENT__FUNS);
    }
    return funs;
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
      case V0Package.ROOT_ELEMENT__MAIN:
        return basicSetMain(null, msgs);
      case V0Package.ROOT_ELEMENT__FUNS:
        return ((InternalEList<?>)getFuns()).basicRemove(otherEnd, msgs);
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
      case V0Package.ROOT_ELEMENT__MAIN:
        return getMain();
      case V0Package.ROOT_ELEMENT__FUNS:
        return getFuns();
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
      case V0Package.ROOT_ELEMENT__MAIN:
        setMain((Main)newValue);
        return;
      case V0Package.ROOT_ELEMENT__FUNS:
        getFuns().clear();
        getFuns().addAll((Collection<? extends Fun>)newValue);
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
      case V0Package.ROOT_ELEMENT__MAIN:
        setMain((Main)null);
        return;
      case V0Package.ROOT_ELEMENT__FUNS:
        getFuns().clear();
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
      case V0Package.ROOT_ELEMENT__MAIN:
        return main != null;
      case V0Package.ROOT_ELEMENT__FUNS:
        return funs != null && !funs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RootElementImpl
