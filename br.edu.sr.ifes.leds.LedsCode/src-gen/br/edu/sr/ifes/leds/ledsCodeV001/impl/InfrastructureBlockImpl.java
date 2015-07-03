/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InfrastructureBlockImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InfrastructureBlockImpl#getProjectVersion <em>Project Version</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InfrastructureBlockImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InfrastructureBlockImpl#getFramework <em>Framework</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InfrastructureBlockImpl#getOrm <em>Orm</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InfrastructureBlockImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureBlockImpl extends MinimalEObjectImpl.Container implements InfrastructureBlock
{
  /**
   * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasePackage()
   * @generated
   * @ordered
   */
  protected static final String BASE_PACKAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasePackage()
   * @generated
   * @ordered
   */
  protected String basePackage = BASE_PACKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getProjectVersion() <em>Project Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectVersion()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjectVersion() <em>Project Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectVersion()
   * @generated
   * @ordered
   */
  protected String projectVersion = PROJECT_VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected NameVersion language;

  /**
   * The cached value of the '{@link #getFramework() <em>Framework</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFramework()
   * @generated
   * @ordered
   */
  protected NameVersion framework;

  /**
   * The cached value of the '{@link #getOrm() <em>Orm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrm()
   * @generated
   * @ordered
   */
  protected NameVersion orm;

  /**
   * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabase()
   * @generated
   * @ordered
   */
  protected DatabaseBlock database;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfrastructureBlockImpl()
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
    return LedsCodeV001Package.Literals.INFRASTRUCTURE_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBasePackage()
  {
    return basePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasePackage(String newBasePackage)
  {
    String oldBasePackage = basePackage;
    basePackage = newBasePackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.INFRASTRUCTURE_BLOCK__BASE_PACKAGE, oldBasePackage, basePackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjectVersion()
  {
    return projectVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectVersion(String newProjectVersion)
  {
    String oldProjectVersion = projectVersion;
    projectVersion = newProjectVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.INFRASTRUCTURE_BLOCK__PROJECT_VERSION, oldProjectVersion, projectVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameVersion getLanguage()
  {
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLanguage(NameVersion newLanguage, NotificationChain msgs)
  {
    NameVersion oldLanguage = language;
    language = newLanguage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.INFRASTRUCTURE_BLOCK__LANGUAGE, oldLanguage, newLanguage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLanguage(NameVersion newLanguage)
  {
    if (newLanguage != language)
    {
      NotificationChain msgs = null;
      if (language != null)
        msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.INFRASTRUCTURE_BLOCK__LANGUAGE, null, msgs);
      if (newLanguage != null)
        msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.INFRASTRUCTURE_BLOCK__LANGUAGE, null, msgs);
      msgs = basicSetLanguage(newLanguage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.INFRASTRUCTURE_BLOCK__LANGUAGE, newLanguage, newLanguage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameVersion getFramework()
  {
    return framework;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFramework(NameVersion newFramework, NotificationChain msgs)
  {
    NameVersion oldFramework = framework;
    framework = newFramework;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.INFRASTRUCTURE_BLOCK__FRAMEWORK, oldFramework, newFramework);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFramework(NameVersion newFramework)
  {
    if (newFramework != framework)
    {
      NotificationChain msgs = null;
      if (framework != null)
        msgs = ((InternalEObject)framework).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.INFRASTRUCTURE_BLOCK__FRAMEWORK, null, msgs);
      if (newFramework != null)
        msgs = ((InternalEObject)newFramework).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.INFRASTRUCTURE_BLOCK__FRAMEWORK, null, msgs);
      msgs = basicSetFramework(newFramework, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.INFRASTRUCTURE_BLOCK__FRAMEWORK, newFramework, newFramework));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameVersion getOrm()
  {
    return orm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrm(NameVersion newOrm, NotificationChain msgs)
  {
    NameVersion oldOrm = orm;
    orm = newOrm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.INFRASTRUCTURE_BLOCK__ORM, oldOrm, newOrm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrm(NameVersion newOrm)
  {
    if (newOrm != orm)
    {
      NotificationChain msgs = null;
      if (orm != null)
        msgs = ((InternalEObject)orm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.INFRASTRUCTURE_BLOCK__ORM, null, msgs);
      if (newOrm != null)
        msgs = ((InternalEObject)newOrm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.INFRASTRUCTURE_BLOCK__ORM, null, msgs);
      msgs = basicSetOrm(newOrm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.INFRASTRUCTURE_BLOCK__ORM, newOrm, newOrm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseBlock getDatabase()
  {
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabase(DatabaseBlock newDatabase, NotificationChain msgs)
  {
    DatabaseBlock oldDatabase = database;
    database = newDatabase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.INFRASTRUCTURE_BLOCK__DATABASE, oldDatabase, newDatabase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatabase(DatabaseBlock newDatabase)
  {
    if (newDatabase != database)
    {
      NotificationChain msgs = null;
      if (database != null)
        msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.INFRASTRUCTURE_BLOCK__DATABASE, null, msgs);
      if (newDatabase != null)
        msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.INFRASTRUCTURE_BLOCK__DATABASE, null, msgs);
      msgs = basicSetDatabase(newDatabase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.INFRASTRUCTURE_BLOCK__DATABASE, newDatabase, newDatabase));
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
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__LANGUAGE:
        return basicSetLanguage(null, msgs);
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__FRAMEWORK:
        return basicSetFramework(null, msgs);
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__ORM:
        return basicSetOrm(null, msgs);
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__DATABASE:
        return basicSetDatabase(null, msgs);
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
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__BASE_PACKAGE:
        return getBasePackage();
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__PROJECT_VERSION:
        return getProjectVersion();
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__LANGUAGE:
        return getLanguage();
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__FRAMEWORK:
        return getFramework();
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__ORM:
        return getOrm();
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__DATABASE:
        return getDatabase();
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
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__BASE_PACKAGE:
        setBasePackage((String)newValue);
        return;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__PROJECT_VERSION:
        setProjectVersion((String)newValue);
        return;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__LANGUAGE:
        setLanguage((NameVersion)newValue);
        return;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__FRAMEWORK:
        setFramework((NameVersion)newValue);
        return;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__ORM:
        setOrm((NameVersion)newValue);
        return;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__DATABASE:
        setDatabase((DatabaseBlock)newValue);
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
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__BASE_PACKAGE:
        setBasePackage(BASE_PACKAGE_EDEFAULT);
        return;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__PROJECT_VERSION:
        setProjectVersion(PROJECT_VERSION_EDEFAULT);
        return;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__LANGUAGE:
        setLanguage((NameVersion)null);
        return;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__FRAMEWORK:
        setFramework((NameVersion)null);
        return;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__ORM:
        setOrm((NameVersion)null);
        return;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__DATABASE:
        setDatabase((DatabaseBlock)null);
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
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__BASE_PACKAGE:
        return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__PROJECT_VERSION:
        return PROJECT_VERSION_EDEFAULT == null ? projectVersion != null : !PROJECT_VERSION_EDEFAULT.equals(projectVersion);
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__LANGUAGE:
        return language != null;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__FRAMEWORK:
        return framework != null;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__ORM:
        return orm != null;
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK__DATABASE:
        return database != null;
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
    result.append(" (basePackage: ");
    result.append(basePackage);
    result.append(", projectVersion: ");
    result.append(projectVersion);
    result.append(')');
    return result.toString();
  }

} //InfrastructureBlockImpl
