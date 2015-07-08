/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;

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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ProjectImpl#getInfrastructureBlock <em>Infrastructure Block</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ProjectImpl#getInterfaceBlock <em>Interface Block</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ProjectImpl#getApplicationBlock <em>Application Block</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ProjectImpl#getDomainBlock <em>Domain Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project
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
   * The cached value of the '{@link #getInfrastructureBlock() <em>Infrastructure Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfrastructureBlock()
   * @generated
   * @ordered
   */
  protected InfrastructureBlock infrastructureBlock;

  /**
   * The cached value of the '{@link #getInterfaceBlock() <em>Interface Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceBlock()
   * @generated
   * @ordered
   */
  protected InterfaceBlock interfaceBlock;

  /**
   * The cached value of the '{@link #getApplicationBlock() <em>Application Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicationBlock()
   * @generated
   * @ordered
   */
  protected EList<ApplicationBlock> applicationBlock;

  /**
   * The cached value of the '{@link #getDomainBlock() <em>Domain Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainBlock()
   * @generated
   * @ordered
   */
  protected EList<DomainBlock> domainBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectImpl()
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
    return LedsCodeV001Package.Literals.PROJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.PROJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfrastructureBlock getInfrastructureBlock()
  {
    return infrastructureBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInfrastructureBlock(InfrastructureBlock newInfrastructureBlock, NotificationChain msgs)
  {
    InfrastructureBlock oldInfrastructureBlock = infrastructureBlock;
    infrastructureBlock = newInfrastructureBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.PROJECT__INFRASTRUCTURE_BLOCK, oldInfrastructureBlock, newInfrastructureBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfrastructureBlock(InfrastructureBlock newInfrastructureBlock)
  {
    if (newInfrastructureBlock != infrastructureBlock)
    {
      NotificationChain msgs = null;
      if (infrastructureBlock != null)
        msgs = ((InternalEObject)infrastructureBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.PROJECT__INFRASTRUCTURE_BLOCK, null, msgs);
      if (newInfrastructureBlock != null)
        msgs = ((InternalEObject)newInfrastructureBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.PROJECT__INFRASTRUCTURE_BLOCK, null, msgs);
      msgs = basicSetInfrastructureBlock(newInfrastructureBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.PROJECT__INFRASTRUCTURE_BLOCK, newInfrastructureBlock, newInfrastructureBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceBlock getInterfaceBlock()
  {
    return interfaceBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfaceBlock(InterfaceBlock newInterfaceBlock, NotificationChain msgs)
  {
    InterfaceBlock oldInterfaceBlock = interfaceBlock;
    interfaceBlock = newInterfaceBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.PROJECT__INTERFACE_BLOCK, oldInterfaceBlock, newInterfaceBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceBlock(InterfaceBlock newInterfaceBlock)
  {
    if (newInterfaceBlock != interfaceBlock)
    {
      NotificationChain msgs = null;
      if (interfaceBlock != null)
        msgs = ((InternalEObject)interfaceBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.PROJECT__INTERFACE_BLOCK, null, msgs);
      if (newInterfaceBlock != null)
        msgs = ((InternalEObject)newInterfaceBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.PROJECT__INTERFACE_BLOCK, null, msgs);
      msgs = basicSetInterfaceBlock(newInterfaceBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.PROJECT__INTERFACE_BLOCK, newInterfaceBlock, newInterfaceBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ApplicationBlock> getApplicationBlock()
  {
    if (applicationBlock == null)
    {
      applicationBlock = new EObjectContainmentEList<ApplicationBlock>(ApplicationBlock.class, this, LedsCodeV001Package.PROJECT__APPLICATION_BLOCK);
    }
    return applicationBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DomainBlock> getDomainBlock()
  {
    if (domainBlock == null)
    {
      domainBlock = new EObjectContainmentEList<DomainBlock>(DomainBlock.class, this, LedsCodeV001Package.PROJECT__DOMAIN_BLOCK);
    }
    return domainBlock;
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
      case LedsCodeV001Package.PROJECT__INFRASTRUCTURE_BLOCK:
        return basicSetInfrastructureBlock(null, msgs);
      case LedsCodeV001Package.PROJECT__INTERFACE_BLOCK:
        return basicSetInterfaceBlock(null, msgs);
      case LedsCodeV001Package.PROJECT__APPLICATION_BLOCK:
        return ((InternalEList<?>)getApplicationBlock()).basicRemove(otherEnd, msgs);
      case LedsCodeV001Package.PROJECT__DOMAIN_BLOCK:
        return ((InternalEList<?>)getDomainBlock()).basicRemove(otherEnd, msgs);
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
      case LedsCodeV001Package.PROJECT__NAME:
        return getName();
      case LedsCodeV001Package.PROJECT__INFRASTRUCTURE_BLOCK:
        return getInfrastructureBlock();
      case LedsCodeV001Package.PROJECT__INTERFACE_BLOCK:
        return getInterfaceBlock();
      case LedsCodeV001Package.PROJECT__APPLICATION_BLOCK:
        return getApplicationBlock();
      case LedsCodeV001Package.PROJECT__DOMAIN_BLOCK:
        return getDomainBlock();
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
      case LedsCodeV001Package.PROJECT__NAME:
        setName((String)newValue);
        return;
      case LedsCodeV001Package.PROJECT__INFRASTRUCTURE_BLOCK:
        setInfrastructureBlock((InfrastructureBlock)newValue);
        return;
      case LedsCodeV001Package.PROJECT__INTERFACE_BLOCK:
        setInterfaceBlock((InterfaceBlock)newValue);
        return;
      case LedsCodeV001Package.PROJECT__APPLICATION_BLOCK:
        getApplicationBlock().clear();
        getApplicationBlock().addAll((Collection<? extends ApplicationBlock>)newValue);
        return;
      case LedsCodeV001Package.PROJECT__DOMAIN_BLOCK:
        getDomainBlock().clear();
        getDomainBlock().addAll((Collection<? extends DomainBlock>)newValue);
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
      case LedsCodeV001Package.PROJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LedsCodeV001Package.PROJECT__INFRASTRUCTURE_BLOCK:
        setInfrastructureBlock((InfrastructureBlock)null);
        return;
      case LedsCodeV001Package.PROJECT__INTERFACE_BLOCK:
        setInterfaceBlock((InterfaceBlock)null);
        return;
      case LedsCodeV001Package.PROJECT__APPLICATION_BLOCK:
        getApplicationBlock().clear();
        return;
      case LedsCodeV001Package.PROJECT__DOMAIN_BLOCK:
        getDomainBlock().clear();
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
      case LedsCodeV001Package.PROJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LedsCodeV001Package.PROJECT__INFRASTRUCTURE_BLOCK:
        return infrastructureBlock != null;
      case LedsCodeV001Package.PROJECT__INTERFACE_BLOCK:
        return interfaceBlock != null;
      case LedsCodeV001Package.PROJECT__APPLICATION_BLOCK:
        return applicationBlock != null && !applicationBlock.isEmpty();
      case LedsCodeV001Package.PROJECT__DOMAIN_BLOCK:
        return domainBlock != null && !domainBlock.isEmpty();
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

} //ProjectImpl
