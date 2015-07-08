/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter;
import br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.MethodParameterImpl#getTypeAndAttr <em>Type And Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodParameterImpl extends MinimalEObjectImpl.Container implements MethodParameter
{
  /**
   * The cached value of the '{@link #getTypeAndAttr() <em>Type And Attr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeAndAttr()
   * @generated
   * @ordered
   */
  protected EList<TypeAndAttribute> typeAndAttr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodParameterImpl()
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
    return LedsCodeV001Package.Literals.METHOD_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeAndAttribute> getTypeAndAttr()
  {
    if (typeAndAttr == null)
    {
      typeAndAttr = new EObjectContainmentEList<TypeAndAttribute>(TypeAndAttribute.class, this, LedsCodeV001Package.METHOD_PARAMETER__TYPE_AND_ATTR);
    }
    return typeAndAttr;
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
      case LedsCodeV001Package.METHOD_PARAMETER__TYPE_AND_ATTR:
        return ((InternalEList<?>)getTypeAndAttr()).basicRemove(otherEnd, msgs);
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
      case LedsCodeV001Package.METHOD_PARAMETER__TYPE_AND_ATTR:
        return getTypeAndAttr();
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
      case LedsCodeV001Package.METHOD_PARAMETER__TYPE_AND_ATTR:
        getTypeAndAttr().clear();
        getTypeAndAttr().addAll((Collection<? extends TypeAndAttribute>)newValue);
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
      case LedsCodeV001Package.METHOD_PARAMETER__TYPE_AND_ATTR:
        getTypeAndAttr().clear();
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
      case LedsCodeV001Package.METHOD_PARAMETER__TYPE_AND_ATTR:
        return typeAndAttr != null && !typeAndAttr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodParameterImpl
