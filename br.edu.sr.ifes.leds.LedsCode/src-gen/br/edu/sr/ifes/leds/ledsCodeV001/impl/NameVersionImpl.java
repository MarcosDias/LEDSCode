/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.NameVersionImpl#getNameValue <em>Name Value</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.NameVersionImpl#getVersionValue <em>Version Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameVersionImpl extends MinimalEObjectImpl.Container implements NameVersion
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameVersionImpl()
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
    return LedsCodeV001Package.Literals.NAME_VERSION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.NAME_VERSION__NAME_VALUE, oldNameValue, nameValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.NAME_VERSION__VERSION_VALUE, oldVersionValue, versionValue));
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
      case LedsCodeV001Package.NAME_VERSION__NAME_VALUE:
        return getNameValue();
      case LedsCodeV001Package.NAME_VERSION__VERSION_VALUE:
        return getVersionValue();
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
      case LedsCodeV001Package.NAME_VERSION__NAME_VALUE:
        setNameValue((String)newValue);
        return;
      case LedsCodeV001Package.NAME_VERSION__VERSION_VALUE:
        setVersionValue((String)newValue);
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
      case LedsCodeV001Package.NAME_VERSION__NAME_VALUE:
        setNameValue(NAME_VALUE_EDEFAULT);
        return;
      case LedsCodeV001Package.NAME_VERSION__VERSION_VALUE:
        setVersionValue(VERSION_VALUE_EDEFAULT);
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
      case LedsCodeV001Package.NAME_VERSION__NAME_VALUE:
        return NAME_VALUE_EDEFAULT == null ? nameValue != null : !NAME_VALUE_EDEFAULT.equals(nameValue);
      case LedsCodeV001Package.NAME_VERSION__VERSION_VALUE:
        return VERSION_VALUE_EDEFAULT == null ? versionValue != null : !VERSION_VALUE_EDEFAULT.equals(versionValue);
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
    result.append(" (nameValue: ");
    result.append(nameValue);
    result.append(", versionValue: ");
    result.append(versionValue);
    result.append(')');
    return result.toString();
  }

} //NameVersionImpl
