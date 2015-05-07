/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.Application;
import br.edu.sr.ifes.leds.ledsCodeV001.DataBase;
import br.edu.sr.ifes.leds.ledsCodeV001.Dictionary;
import br.edu.sr.ifes.leds.ledsCodeV001.Framework;
import br.edu.sr.ifes.leds.ledsCodeV001.KeyValue;
import br.edu.sr.ifes.leds.ledsCodeV001.Language;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Factory;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.NameApplication;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LedsCodeV001PackageImpl extends EPackageImpl implements LedsCodeV001Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ledsCodeDSLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass frameworkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ormEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataBaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dictionaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyValueEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#eNS_URI
   * @see #init()
   * @generated
   */
  private LedsCodeV001PackageImpl()
  {
    super(eNS_URI, LedsCodeV001Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LedsCodeV001Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LedsCodeV001Package init()
  {
    if (isInited) return (LedsCodeV001Package)EPackage.Registry.INSTANCE.getEPackage(LedsCodeV001Package.eNS_URI);

    // Obtain or create and register package
    LedsCodeV001PackageImpl theLedsCodeV001Package = (LedsCodeV001PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LedsCodeV001PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LedsCodeV001PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLedsCodeV001Package.createPackageContents();

    // Initialize created meta-data
    theLedsCodeV001Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLedsCodeV001Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LedsCodeV001Package.eNS_URI, theLedsCodeV001Package);
    return theLedsCodeV001Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLedsCodeDSL()
  {
    return ledsCodeDSLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLedsCodeDSL_Application()
  {
    return (EReference)ledsCodeDSLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplication()
  {
    return applicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_NameApplication()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Language()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Framework()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Orm()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Database()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameApplication()
  {
    return nameApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameApplication_Name()
  {
    return (EAttribute)nameApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLanguage()
  {
    return languageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFramework()
  {
    return frameworkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getORM()
  {
    return ormEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataBase()
  {
    return dataBaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDictionary()
  {
    return dictionaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDictionary_Elements()
  {
    return (EReference)dictionaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyValue()
  {
    return keyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyValue_Key()
  {
    return (EAttribute)keyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyValue_Value()
  {
    return (EAttribute)keyValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LedsCodeV001Factory getLedsCodeV001Factory()
  {
    return (LedsCodeV001Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    ledsCodeDSLEClass = createEClass(LEDS_CODE_DSL);
    createEReference(ledsCodeDSLEClass, LEDS_CODE_DSL__APPLICATION);

    applicationEClass = createEClass(APPLICATION);
    createEReference(applicationEClass, APPLICATION__NAME_APPLICATION);
    createEReference(applicationEClass, APPLICATION__LANGUAGE);
    createEReference(applicationEClass, APPLICATION__FRAMEWORK);
    createEReference(applicationEClass, APPLICATION__ORM);
    createEReference(applicationEClass, APPLICATION__DATABASE);

    nameApplicationEClass = createEClass(NAME_APPLICATION);
    createEAttribute(nameApplicationEClass, NAME_APPLICATION__NAME);

    languageEClass = createEClass(LANGUAGE);

    frameworkEClass = createEClass(FRAMEWORK);

    ormEClass = createEClass(ORM);

    dataBaseEClass = createEClass(DATA_BASE);

    dictionaryEClass = createEClass(DICTIONARY);
    createEReference(dictionaryEClass, DICTIONARY__ELEMENTS);

    keyValueEClass = createEClass(KEY_VALUE);
    createEAttribute(keyValueEClass, KEY_VALUE__KEY);
    createEAttribute(keyValueEClass, KEY_VALUE__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dictionaryEClass.getESuperTypes().add(this.getLanguage());
    dictionaryEClass.getESuperTypes().add(this.getFramework());
    dictionaryEClass.getESuperTypes().add(this.getORM());
    dictionaryEClass.getESuperTypes().add(this.getDataBase());

    // Initialize classes and features; add operations and parameters
    initEClass(ledsCodeDSLEClass, LedsCodeDSL.class, "LedsCodeDSL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLedsCodeDSL_Application(), this.getApplication(), null, "application", null, 0, 1, LedsCodeDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplication_NameApplication(), this.getNameApplication(), null, "nameApplication", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Language(), this.getLanguage(), null, "language", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Framework(), this.getFramework(), null, "framework", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Orm(), this.getORM(), null, "orm", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Database(), this.getDataBase(), null, "database", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameApplicationEClass, NameApplication.class, "NameApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(frameworkEClass, Framework.class, "Framework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ormEClass, br.edu.sr.ifes.leds.ledsCodeV001.ORM.class, "ORM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataBaseEClass, DataBase.class, "DataBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dictionaryEClass, Dictionary.class, "Dictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDictionary_Elements(), this.getKeyValue(), null, "elements", null, 0, -1, Dictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keyValueEClass, KeyValue.class, "KeyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKeyValue_Key(), ecorePackage.getEString(), "key", null, 0, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKeyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LedsCodeV001PackageImpl
