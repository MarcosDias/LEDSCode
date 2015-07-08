/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ServiceMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ServiceMethodImpl#getMethodAcess <em>Method Acess</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceMethodImpl extends MinimalEObjectImpl.Container implements ServiceMethod
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
   * The default value of the '{@link #getMethodAcess() <em>Method Acess</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodAcess()
   * @generated
   * @ordered
   */
  protected static final String METHOD_ACESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethodAcess() <em>Method Acess</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodAcess()
   * @generated
   * @ordered
   */
  protected String methodAcess = METHOD_ACESS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceMethodImpl()
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
    return LedsCodeV001Package.Literals.SERVICE_METHOD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.SERVICE_METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethodAcess()
  {
    return methodAcess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodAcess(String newMethodAcess)
  {
    String oldMethodAcess = methodAcess;
    methodAcess = newMethodAcess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.SERVICE_METHOD__METHOD_ACESS, oldMethodAcess, methodAcess));
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
      case LedsCodeV001Package.SERVICE_METHOD__NAME:
        return getName();
      case LedsCodeV001Package.SERVICE_METHOD__METHOD_ACESS:
        return getMethodAcess();
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
      case LedsCodeV001Package.SERVICE_METHOD__NAME:
        setName((String)newValue);
        return;
      case LedsCodeV001Package.SERVICE_METHOD__METHOD_ACESS:
        setMethodAcess((String)newValue);
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
      case LedsCodeV001Package.SERVICE_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LedsCodeV001Package.SERVICE_METHOD__METHOD_ACESS:
        setMethodAcess(METHOD_ACESS_EDEFAULT);
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
      case LedsCodeV001Package.SERVICE_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LedsCodeV001Package.SERVICE_METHOD__METHOD_ACESS:
        return METHOD_ACESS_EDEFAULT == null ? methodAcess != null : !METHOD_ACESS_EDEFAULT.equals(methodAcess);
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
    result.append(", methodAcess: ");
    result.append(methodAcess);
    result.append(')');
    return result.toString();
  }

} //ServiceMethodImpl
