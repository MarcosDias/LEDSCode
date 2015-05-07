/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.Application;
import br.edu.sr.ifes.leds.ledsCodeV001.DataBase;
import br.edu.sr.ifes.leds.ledsCodeV001.Framework;
import br.edu.sr.ifes.leds.ledsCodeV001.Language;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.NameApplication;
import br.edu.sr.ifes.leds.ledsCodeV001.ORM;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationImpl#getNameApplication <em>Name Application</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationImpl#getFramework <em>Framework</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationImpl#getOrm <em>Orm</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application
{
  /**
   * The cached value of the '{@link #getNameApplication() <em>Name Application</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameApplication()
   * @generated
   * @ordered
   */
  protected NameApplication nameApplication;

  /**
   * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected Language language;

  /**
   * The cached value of the '{@link #getFramework() <em>Framework</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFramework()
   * @generated
   * @ordered
   */
  protected Framework framework;

  /**
   * The cached value of the '{@link #getOrm() <em>Orm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrm()
   * @generated
   * @ordered
   */
  protected ORM orm;

  /**
   * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabase()
   * @generated
   * @ordered
   */
  protected DataBase database;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationImpl()
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
    return LedsCodeV001Package.Literals.APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameApplication getNameApplication()
  {
    return nameApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNameApplication(NameApplication newNameApplication, NotificationChain msgs)
  {
    NameApplication oldNameApplication = nameApplication;
    nameApplication = newNameApplication;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.APPLICATION__NAME_APPLICATION, oldNameApplication, newNameApplication);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameApplication(NameApplication newNameApplication)
  {
    if (newNameApplication != nameApplication)
    {
      NotificationChain msgs = null;
      if (nameApplication != null)
        msgs = ((InternalEObject)nameApplication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.APPLICATION__NAME_APPLICATION, null, msgs);
      if (newNameApplication != null)
        msgs = ((InternalEObject)newNameApplication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.APPLICATION__NAME_APPLICATION, null, msgs);
      msgs = basicSetNameApplication(newNameApplication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.APPLICATION__NAME_APPLICATION, newNameApplication, newNameApplication));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Language getLanguage()
  {
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLanguage(Language newLanguage, NotificationChain msgs)
  {
    Language oldLanguage = language;
    language = newLanguage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.APPLICATION__LANGUAGE, oldLanguage, newLanguage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLanguage(Language newLanguage)
  {
    if (newLanguage != language)
    {
      NotificationChain msgs = null;
      if (language != null)
        msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.APPLICATION__LANGUAGE, null, msgs);
      if (newLanguage != null)
        msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.APPLICATION__LANGUAGE, null, msgs);
      msgs = basicSetLanguage(newLanguage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.APPLICATION__LANGUAGE, newLanguage, newLanguage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Framework getFramework()
  {
    return framework;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFramework(Framework newFramework, NotificationChain msgs)
  {
    Framework oldFramework = framework;
    framework = newFramework;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.APPLICATION__FRAMEWORK, oldFramework, newFramework);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFramework(Framework newFramework)
  {
    if (newFramework != framework)
    {
      NotificationChain msgs = null;
      if (framework != null)
        msgs = ((InternalEObject)framework).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.APPLICATION__FRAMEWORK, null, msgs);
      if (newFramework != null)
        msgs = ((InternalEObject)newFramework).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.APPLICATION__FRAMEWORK, null, msgs);
      msgs = basicSetFramework(newFramework, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.APPLICATION__FRAMEWORK, newFramework, newFramework));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ORM getOrm()
  {
    return orm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrm(ORM newOrm, NotificationChain msgs)
  {
    ORM oldOrm = orm;
    orm = newOrm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.APPLICATION__ORM, oldOrm, newOrm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrm(ORM newOrm)
  {
    if (newOrm != orm)
    {
      NotificationChain msgs = null;
      if (orm != null)
        msgs = ((InternalEObject)orm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.APPLICATION__ORM, null, msgs);
      if (newOrm != null)
        msgs = ((InternalEObject)newOrm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.APPLICATION__ORM, null, msgs);
      msgs = basicSetOrm(newOrm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.APPLICATION__ORM, newOrm, newOrm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataBase getDatabase()
  {
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatabase(DataBase newDatabase, NotificationChain msgs)
  {
    DataBase oldDatabase = database;
    database = newDatabase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.APPLICATION__DATABASE, oldDatabase, newDatabase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatabase(DataBase newDatabase)
  {
    if (newDatabase != database)
    {
      NotificationChain msgs = null;
      if (database != null)
        msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.APPLICATION__DATABASE, null, msgs);
      if (newDatabase != null)
        msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.APPLICATION__DATABASE, null, msgs);
      msgs = basicSetDatabase(newDatabase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.APPLICATION__DATABASE, newDatabase, newDatabase));
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
      case LedsCodeV001Package.APPLICATION__NAME_APPLICATION:
        return basicSetNameApplication(null, msgs);
      case LedsCodeV001Package.APPLICATION__LANGUAGE:
        return basicSetLanguage(null, msgs);
      case LedsCodeV001Package.APPLICATION__FRAMEWORK:
        return basicSetFramework(null, msgs);
      case LedsCodeV001Package.APPLICATION__ORM:
        return basicSetOrm(null, msgs);
      case LedsCodeV001Package.APPLICATION__DATABASE:
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
      case LedsCodeV001Package.APPLICATION__NAME_APPLICATION:
        return getNameApplication();
      case LedsCodeV001Package.APPLICATION__LANGUAGE:
        return getLanguage();
      case LedsCodeV001Package.APPLICATION__FRAMEWORK:
        return getFramework();
      case LedsCodeV001Package.APPLICATION__ORM:
        return getOrm();
      case LedsCodeV001Package.APPLICATION__DATABASE:
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
      case LedsCodeV001Package.APPLICATION__NAME_APPLICATION:
        setNameApplication((NameApplication)newValue);
        return;
      case LedsCodeV001Package.APPLICATION__LANGUAGE:
        setLanguage((Language)newValue);
        return;
      case LedsCodeV001Package.APPLICATION__FRAMEWORK:
        setFramework((Framework)newValue);
        return;
      case LedsCodeV001Package.APPLICATION__ORM:
        setOrm((ORM)newValue);
        return;
      case LedsCodeV001Package.APPLICATION__DATABASE:
        setDatabase((DataBase)newValue);
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
      case LedsCodeV001Package.APPLICATION__NAME_APPLICATION:
        setNameApplication((NameApplication)null);
        return;
      case LedsCodeV001Package.APPLICATION__LANGUAGE:
        setLanguage((Language)null);
        return;
      case LedsCodeV001Package.APPLICATION__FRAMEWORK:
        setFramework((Framework)null);
        return;
      case LedsCodeV001Package.APPLICATION__ORM:
        setOrm((ORM)null);
        return;
      case LedsCodeV001Package.APPLICATION__DATABASE:
        setDatabase((DataBase)null);
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
      case LedsCodeV001Package.APPLICATION__NAME_APPLICATION:
        return nameApplication != null;
      case LedsCodeV001Package.APPLICATION__LANGUAGE:
        return language != null;
      case LedsCodeV001Package.APPLICATION__FRAMEWORK:
        return framework != null;
      case LedsCodeV001Package.APPLICATION__ORM:
        return orm != null;
      case LedsCodeV001Package.APPLICATION__DATABASE:
        return database != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplicationImpl
