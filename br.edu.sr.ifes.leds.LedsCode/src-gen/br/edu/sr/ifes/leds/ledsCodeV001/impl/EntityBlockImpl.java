/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.AccessModifier;
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute;
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.Repository;

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
 * An implementation of the model object '<em><b>Entity Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl#getAcessModifier <em>Acess Modifier</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityBlockImpl extends MinimalEObjectImpl.Container implements EntityBlock
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
   * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
   * The cached value of the '{@link #getSuperClasses() <em>Super Classes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperClasses()
   * @generated
   * @ordered
   */
  protected ExtendBlock superClasses;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepository()
   * @generated
   * @ordered
   */
  protected Repository repository;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityBlockImpl()
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
    return LedsCodeV001Package.Literals.ENTITY_BLOCK;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__ACESS_MODIFIER, oldAcessModifier, newAcessModifier);
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
        msgs = ((InternalEObject)acessModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.ENTITY_BLOCK__ACESS_MODIFIER, null, msgs);
      if (newAcessModifier != null)
        msgs = ((InternalEObject)newAcessModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.ENTITY_BLOCK__ACESS_MODIFIER, null, msgs);
      msgs = basicSetAcessModifier(newAcessModifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__ACESS_MODIFIER, newAcessModifier, newAcessModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAbstract()
  {
    return isAbstract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAbstract(boolean newIsAbstract)
  {
    boolean oldIsAbstract = isAbstract;
    isAbstract = newIsAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendBlock getSuperClasses()
  {
    return superClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperClasses(ExtendBlock newSuperClasses, NotificationChain msgs)
  {
    ExtendBlock oldSuperClasses = superClasses;
    superClasses = newSuperClasses;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__SUPER_CLASSES, oldSuperClasses, newSuperClasses);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperClasses(ExtendBlock newSuperClasses)
  {
    if (newSuperClasses != superClasses)
    {
      NotificationChain msgs = null;
      if (superClasses != null)
        msgs = ((InternalEObject)superClasses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.ENTITY_BLOCK__SUPER_CLASSES, null, msgs);
      if (newSuperClasses != null)
        msgs = ((InternalEObject)newSuperClasses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.ENTITY_BLOCK__SUPER_CLASSES, null, msgs);
      msgs = basicSetSuperClasses(newSuperClasses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__SUPER_CLASSES, newSuperClasses, newSuperClasses));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, LedsCodeV001Package.ENTITY_BLOCK__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repository getRepository()
  {
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs)
  {
    Repository oldRepository = repository;
    repository = newRepository;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__REPOSITORY, oldRepository, newRepository);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepository(Repository newRepository)
  {
    if (newRepository != repository)
    {
      NotificationChain msgs = null;
      if (repository != null)
        msgs = ((InternalEObject)repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.ENTITY_BLOCK__REPOSITORY, null, msgs);
      if (newRepository != null)
        msgs = ((InternalEObject)newRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.ENTITY_BLOCK__REPOSITORY, null, msgs);
      msgs = basicSetRepository(newRepository, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__REPOSITORY, newRepository, newRepository));
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
      case LedsCodeV001Package.ENTITY_BLOCK__ACESS_MODIFIER:
        return basicSetAcessModifier(null, msgs);
      case LedsCodeV001Package.ENTITY_BLOCK__SUPER_CLASSES:
        return basicSetSuperClasses(null, msgs);
      case LedsCodeV001Package.ENTITY_BLOCK__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case LedsCodeV001Package.ENTITY_BLOCK__REPOSITORY:
        return basicSetRepository(null, msgs);
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
      case LedsCodeV001Package.ENTITY_BLOCK__ACESS_MODIFIER:
        return getAcessModifier();
      case LedsCodeV001Package.ENTITY_BLOCK__IS_ABSTRACT:
        return isIsAbstract();
      case LedsCodeV001Package.ENTITY_BLOCK__NAME:
        return getName();
      case LedsCodeV001Package.ENTITY_BLOCK__SUPER_CLASSES:
        return getSuperClasses();
      case LedsCodeV001Package.ENTITY_BLOCK__ATTRIBUTES:
        return getAttributes();
      case LedsCodeV001Package.ENTITY_BLOCK__REPOSITORY:
        return getRepository();
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
      case LedsCodeV001Package.ENTITY_BLOCK__ACESS_MODIFIER:
        setAcessModifier((AccessModifier)newValue);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__IS_ABSTRACT:
        setIsAbstract((Boolean)newValue);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__NAME:
        setName((String)newValue);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__SUPER_CLASSES:
        setSuperClasses((ExtendBlock)newValue);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__REPOSITORY:
        setRepository((Repository)newValue);
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
      case LedsCodeV001Package.ENTITY_BLOCK__ACESS_MODIFIER:
        setAcessModifier((AccessModifier)null);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__SUPER_CLASSES:
        setSuperClasses((ExtendBlock)null);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__ATTRIBUTES:
        getAttributes().clear();
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__REPOSITORY:
        setRepository((Repository)null);
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
      case LedsCodeV001Package.ENTITY_BLOCK__ACESS_MODIFIER:
        return acessModifier != null;
      case LedsCodeV001Package.ENTITY_BLOCK__IS_ABSTRACT:
        return isAbstract != IS_ABSTRACT_EDEFAULT;
      case LedsCodeV001Package.ENTITY_BLOCK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LedsCodeV001Package.ENTITY_BLOCK__SUPER_CLASSES:
        return superClasses != null;
      case LedsCodeV001Package.ENTITY_BLOCK__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case LedsCodeV001Package.ENTITY_BLOCK__REPOSITORY:
        return repository != null;
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
    result.append(" (isAbstract: ");
    result.append(isAbstract);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityBlockImpl
