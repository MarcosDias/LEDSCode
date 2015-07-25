/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

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
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl#getClassExtends <em>Class Extends</em>}</li>
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
   * The default value of the '{@link #getAcessModifier() <em>Acess Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcessModifier()
   * @generated
   * @ordered
   */
  protected static final String ACESS_MODIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAcessModifier() <em>Acess Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcessModifier()
   * @generated
   * @ordered
   */
  protected String acessModifier = ACESS_MODIFIER_EDEFAULT;

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
   * The cached value of the '{@link #getClassExtends() <em>Class Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassExtends()
   * @generated
   * @ordered
   */
  protected ExtendBlock classExtends;

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
  public String getAcessModifier()
  {
    return acessModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcessModifier(String newAcessModifier)
  {
    String oldAcessModifier = acessModifier;
    acessModifier = newAcessModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__ACESS_MODIFIER, oldAcessModifier, acessModifier));
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
  public ExtendBlock getClassExtends()
  {
    return classExtends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassExtends(ExtendBlock newClassExtends, NotificationChain msgs)
  {
    ExtendBlock oldClassExtends = classExtends;
    classExtends = newClassExtends;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__CLASS_EXTENDS, oldClassExtends, newClassExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassExtends(ExtendBlock newClassExtends)
  {
    if (newClassExtends != classExtends)
    {
      NotificationChain msgs = null;
      if (classExtends != null)
        msgs = ((InternalEObject)classExtends).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.ENTITY_BLOCK__CLASS_EXTENDS, null, msgs);
      if (newClassExtends != null)
        msgs = ((InternalEObject)newClassExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.ENTITY_BLOCK__CLASS_EXTENDS, null, msgs);
      msgs = basicSetClassExtends(newClassExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ENTITY_BLOCK__CLASS_EXTENDS, newClassExtends, newClassExtends));
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
      case LedsCodeV001Package.ENTITY_BLOCK__CLASS_EXTENDS:
        return basicSetClassExtends(null, msgs);
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
      case LedsCodeV001Package.ENTITY_BLOCK__CLASS_EXTENDS:
        return getClassExtends();
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
        setAcessModifier((String)newValue);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__IS_ABSTRACT:
        setIsAbstract((Boolean)newValue);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__NAME:
        setName((String)newValue);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__CLASS_EXTENDS:
        setClassExtends((ExtendBlock)newValue);
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
        setAcessModifier(ACESS_MODIFIER_EDEFAULT);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LedsCodeV001Package.ENTITY_BLOCK__CLASS_EXTENDS:
        setClassExtends((ExtendBlock)null);
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
        return ACESS_MODIFIER_EDEFAULT == null ? acessModifier != null : !ACESS_MODIFIER_EDEFAULT.equals(acessModifier);
      case LedsCodeV001Package.ENTITY_BLOCK__IS_ABSTRACT:
        return isAbstract != IS_ABSTRACT_EDEFAULT;
      case LedsCodeV001Package.ENTITY_BLOCK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LedsCodeV001Package.ENTITY_BLOCK__CLASS_EXTENDS:
        return classExtends != null;
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
    result.append(" (acessModifier: ");
    result.append(acessModifier);
    result.append(", isAbstract: ");
    result.append(isAbstract);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //EntityBlockImpl
