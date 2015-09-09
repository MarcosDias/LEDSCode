/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ModuleBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ModuleBlockImpl#getEnumBlock <em>Enum Block</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ModuleBlockImpl#getEntityBlock <em>Entity Block</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ModuleBlockImpl#getServiceBlock <em>Service Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleBlockImpl extends MinimalEObjectImpl.Container implements ModuleBlock
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
   * The cached value of the '{@link #getEnumBlock() <em>Enum Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumBlock()
   * @generated
   * @ordered
   */
  protected EList<EnumBlock> enumBlock;

  /**
   * The cached value of the '{@link #getEntityBlock() <em>Entity Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityBlock()
   * @generated
   * @ordered
   */
  protected EList<EntityBlock> entityBlock;

  /**
   * The cached value of the '{@link #getServiceBlock() <em>Service Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceBlock()
   * @generated
   * @ordered
   */
  protected EList<ServiceBlock> serviceBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleBlockImpl()
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
    return LedsCodeV001Package.Literals.MODULE_BLOCK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.MODULE_BLOCK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnumBlock> getEnumBlock()
  {
    if (enumBlock == null)
    {
      enumBlock = new EObjectContainmentEList<EnumBlock>(EnumBlock.class, this, LedsCodeV001Package.MODULE_BLOCK__ENUM_BLOCK);
    }
    return enumBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityBlock> getEntityBlock()
  {
    if (entityBlock == null)
    {
      entityBlock = new EObjectContainmentEList<EntityBlock>(EntityBlock.class, this, LedsCodeV001Package.MODULE_BLOCK__ENTITY_BLOCK);
    }
    return entityBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceBlock> getServiceBlock()
  {
    if (serviceBlock == null)
    {
      serviceBlock = new EObjectContainmentEList<ServiceBlock>(ServiceBlock.class, this, LedsCodeV001Package.MODULE_BLOCK__SERVICE_BLOCK);
    }
    return serviceBlock;
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
      case LedsCodeV001Package.MODULE_BLOCK__ENUM_BLOCK:
        return ((InternalEList<?>)getEnumBlock()).basicRemove(otherEnd, msgs);
      case LedsCodeV001Package.MODULE_BLOCK__ENTITY_BLOCK:
        return ((InternalEList<?>)getEntityBlock()).basicRemove(otherEnd, msgs);
      case LedsCodeV001Package.MODULE_BLOCK__SERVICE_BLOCK:
        return ((InternalEList<?>)getServiceBlock()).basicRemove(otherEnd, msgs);
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
      case LedsCodeV001Package.MODULE_BLOCK__NAME:
        return getName();
      case LedsCodeV001Package.MODULE_BLOCK__ENUM_BLOCK:
        return getEnumBlock();
      case LedsCodeV001Package.MODULE_BLOCK__ENTITY_BLOCK:
        return getEntityBlock();
      case LedsCodeV001Package.MODULE_BLOCK__SERVICE_BLOCK:
        return getServiceBlock();
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
      case LedsCodeV001Package.MODULE_BLOCK__NAME:
        setName((String)newValue);
        return;
      case LedsCodeV001Package.MODULE_BLOCK__ENUM_BLOCK:
        getEnumBlock().clear();
        getEnumBlock().addAll((Collection<? extends EnumBlock>)newValue);
        return;
      case LedsCodeV001Package.MODULE_BLOCK__ENTITY_BLOCK:
        getEntityBlock().clear();
        getEntityBlock().addAll((Collection<? extends EntityBlock>)newValue);
        return;
      case LedsCodeV001Package.MODULE_BLOCK__SERVICE_BLOCK:
        getServiceBlock().clear();
        getServiceBlock().addAll((Collection<? extends ServiceBlock>)newValue);
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
      case LedsCodeV001Package.MODULE_BLOCK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LedsCodeV001Package.MODULE_BLOCK__ENUM_BLOCK:
        getEnumBlock().clear();
        return;
      case LedsCodeV001Package.MODULE_BLOCK__ENTITY_BLOCK:
        getEntityBlock().clear();
        return;
      case LedsCodeV001Package.MODULE_BLOCK__SERVICE_BLOCK:
        getServiceBlock().clear();
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
      case LedsCodeV001Package.MODULE_BLOCK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LedsCodeV001Package.MODULE_BLOCK__ENUM_BLOCK:
        return enumBlock != null && !enumBlock.isEmpty();
      case LedsCodeV001Package.MODULE_BLOCK__ENTITY_BLOCK:
        return entityBlock != null && !entityBlock.isEmpty();
      case LedsCodeV001Package.MODULE_BLOCK__SERVICE_BLOCK:
        return serviceBlock != null && !serviceBlock.isEmpty();
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

} //ModuleBlockImpl
