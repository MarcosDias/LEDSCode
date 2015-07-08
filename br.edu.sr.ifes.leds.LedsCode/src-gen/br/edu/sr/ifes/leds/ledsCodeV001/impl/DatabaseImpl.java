/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.Database;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseImpl#getVersionValue <em>Version Value</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseImpl#getNameValue <em>Name Value</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseImpl#getUserValue <em>User Value</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseImpl#getPassValue <em>Pass Value</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseImpl#getHostValue <em>Host Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseImpl extends MinimalEObjectImpl.Container implements Database
{
  /**
   * The default value of the '{@link #getVersionValue() <em>Version Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionValue()
   * @generated
   * @ordered
   */
  protected static final String VERSION_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersionValue() <em>Version Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionValue()
   * @generated
   * @ordered
   */
  protected String versionValue = VERSION_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getNameValue() <em>Name Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameValue()
   * @generated
   * @ordered
   */
  protected static final String NAME_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameValue() <em>Name Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameValue()
   * @generated
   * @ordered
   */
  protected String nameValue = NAME_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getUserValue() <em>User Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserValue()
   * @generated
   * @ordered
   */
  protected static final String USER_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUserValue() <em>User Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserValue()
   * @generated
   * @ordered
   */
  protected String userValue = USER_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getPassValue() <em>Pass Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassValue()
   * @generated
   * @ordered
   */
  protected static final String PASS_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPassValue() <em>Pass Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassValue()
   * @generated
   * @ordered
   */
  protected String passValue = PASS_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getHostValue() <em>Host Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostValue()
   * @generated
   * @ordered
   */
  protected static final String HOST_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHostValue() <em>Host Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostValue()
   * @generated
   * @ordered
   */
  protected String hostValue = HOST_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatabaseImpl()
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
    return LedsCodeV001Package.Literals.DATABASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersionValue()
  {
    return versionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersionValue(String newVersionValue)
  {
    String oldVersionValue = versionValue;
    versionValue = newVersionValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.DATABASE__VERSION_VALUE, oldVersionValue, versionValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameValue()
  {
    return nameValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameValue(String newNameValue)
  {
    String oldNameValue = nameValue;
    nameValue = newNameValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.DATABASE__NAME_VALUE, oldNameValue, nameValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUserValue()
  {
    return userValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUserValue(String newUserValue)
  {
    String oldUserValue = userValue;
    userValue = newUserValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.DATABASE__USER_VALUE, oldUserValue, userValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPassValue()
  {
    return passValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassValue(String newPassValue)
  {
    String oldPassValue = passValue;
    passValue = newPassValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.DATABASE__PASS_VALUE, oldPassValue, passValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHostValue()
  {
    return hostValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostValue(String newHostValue)
  {
    String oldHostValue = hostValue;
    hostValue = newHostValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.DATABASE__HOST_VALUE, oldHostValue, hostValue));
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
      case LedsCodeV001Package.DATABASE__VERSION_VALUE:
        return getVersionValue();
      case LedsCodeV001Package.DATABASE__NAME_VALUE:
        return getNameValue();
      case LedsCodeV001Package.DATABASE__USER_VALUE:
        return getUserValue();
      case LedsCodeV001Package.DATABASE__PASS_VALUE:
        return getPassValue();
      case LedsCodeV001Package.DATABASE__HOST_VALUE:
        return getHostValue();
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
      case LedsCodeV001Package.DATABASE__VERSION_VALUE:
        setVersionValue((String)newValue);
        return;
      case LedsCodeV001Package.DATABASE__NAME_VALUE:
        setNameValue((String)newValue);
        return;
      case LedsCodeV001Package.DATABASE__USER_VALUE:
        setUserValue((String)newValue);
        return;
      case LedsCodeV001Package.DATABASE__PASS_VALUE:
        setPassValue((String)newValue);
        return;
      case LedsCodeV001Package.DATABASE__HOST_VALUE:
        setHostValue((String)newValue);
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
      case LedsCodeV001Package.DATABASE__VERSION_VALUE:
        setVersionValue(VERSION_VALUE_EDEFAULT);
        return;
      case LedsCodeV001Package.DATABASE__NAME_VALUE:
        setNameValue(NAME_VALUE_EDEFAULT);
        return;
      case LedsCodeV001Package.DATABASE__USER_VALUE:
        setUserValue(USER_VALUE_EDEFAULT);
        return;
      case LedsCodeV001Package.DATABASE__PASS_VALUE:
        setPassValue(PASS_VALUE_EDEFAULT);
        return;
      case LedsCodeV001Package.DATABASE__HOST_VALUE:
        setHostValue(HOST_VALUE_EDEFAULT);
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
      case LedsCodeV001Package.DATABASE__VERSION_VALUE:
        return VERSION_VALUE_EDEFAULT == null ? versionValue != null : !VERSION_VALUE_EDEFAULT.equals(versionValue);
      case LedsCodeV001Package.DATABASE__NAME_VALUE:
        return NAME_VALUE_EDEFAULT == null ? nameValue != null : !NAME_VALUE_EDEFAULT.equals(nameValue);
      case LedsCodeV001Package.DATABASE__USER_VALUE:
        return USER_VALUE_EDEFAULT == null ? userValue != null : !USER_VALUE_EDEFAULT.equals(userValue);
      case LedsCodeV001Package.DATABASE__PASS_VALUE:
        return PASS_VALUE_EDEFAULT == null ? passValue != null : !PASS_VALUE_EDEFAULT.equals(passValue);
      case LedsCodeV001Package.DATABASE__HOST_VALUE:
        return HOST_VALUE_EDEFAULT == null ? hostValue != null : !HOST_VALUE_EDEFAULT.equals(hostValue);
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
    result.append(" (versionValue: ");
    result.append(versionValue);
    result.append(", nameValue: ");
    result.append(nameValue);
    result.append(", userValue: ");
    result.append(userValue);
    result.append(", passValue: ");
    result.append(passValue);
    result.append(", hostValue: ");
    result.append(hostValue);
    result.append(')');
    return result.toString();
  }

} //DatabaseImpl
