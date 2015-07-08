/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.AccessModifier;
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#getAcessModifier <em>Acess Modifier</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The cached value of the '{@link #getAcessModifier() <em>Acess Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcessModifier()
   * @generated
   * @ordered
   */
  protected AccessModifier acessModifier;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return LedsCodeV001Package.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessModifier getAcessModifier()
  {
    return acessModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcessModifier(AccessModifier newAcessModifier, NotificationChain msgs)
  {
    AccessModifier oldAcessModifier = acessModifier;
    acessModifier = newAcessModifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER, oldAcessModifier, newAcessModifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcessModifier(AccessModifier newAcessModifier)
  {
    if (newAcessModifier != acessModifier)
    {
      NotificationChain msgs = null;
      if (acessModifier != null)
        msgs = ((InternalEObject)acessModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER, null, msgs);
      if (newAcessModifier != null)
        msgs = ((InternalEObject)newAcessModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER, null, msgs);
      msgs = basicSetAcessModifier(newAcessModifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER, newAcessModifier, newAcessModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__NAME, oldName, name));
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
      case LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER:
        return basicSetAcessModifier(null, msgs);
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
      case LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER:
        return getAcessModifier();
      case LedsCodeV001Package.ATTRIBUTE__TYPE:
        return getType();
      case LedsCodeV001Package.ATTRIBUTE__NAME:
        return getName();
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
      case LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER:
        setAcessModifier((AccessModifier)newValue);
        return;
      case LedsCodeV001Package.ATTRIBUTE__TYPE:
        setType((String)newValue);
        return;
      case LedsCodeV001Package.ATTRIBUTE__NAME:
        setName((String)newValue);
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
      case LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER:
        setAcessModifier((AccessModifier)null);
        return;
      case LedsCodeV001Package.ATTRIBUTE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LedsCodeV001Package.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
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
      case LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER:
        return acessModifier != null;
      case LedsCodeV001Package.ATTRIBUTE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case LedsCodeV001Package.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
