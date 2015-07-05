/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Factory;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;

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
  private EClass projectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass infrastructureBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameVersionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationBlockEClass = null;

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
  public EReference getLedsCodeDSL_Project()
  {
    return (EReference)ledsCodeDSLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProject()
  {
    return projectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_Name()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_InfrastructureBlock()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_InterfaceBlock()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProject_ApplicationBlock()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProject_DomainBlock()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceBlock()
  {
    return interfaceBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceBlock_Name()
  {
    return (EAttribute)interfaceBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceBlock_InterfaceApplication()
  {
    return (EReference)interfaceBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceApplication()
  {
    return interfaceApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceApplication_Type()
  {
    return (EAttribute)interfaceApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceApplication_Name()
  {
    return (EAttribute)interfaceApplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceApplication_NameApp()
  {
    return (EAttribute)interfaceApplicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInfrastructureBlock()
  {
    return infrastructureBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfrastructureBlock_BasePackage()
  {
    return (EAttribute)infrastructureBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInfrastructureBlock_ProjectVersion()
  {
    return (EAttribute)infrastructureBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructureBlock_Language()
  {
    return (EReference)infrastructureBlockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructureBlock_Framework()
  {
    return (EReference)infrastructureBlockEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructureBlock_Orm()
  {
    return (EReference)infrastructureBlockEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInfrastructureBlock_Database()
  {
    return (EReference)infrastructureBlockEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseBlock()
  {
    return databaseBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseBlock_VersionValue()
  {
    return (EAttribute)databaseBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseBlock_NameValue()
  {
    return (EAttribute)databaseBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseBlock_UserValue()
  {
    return (EAttribute)databaseBlockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseBlock_PassValue()
  {
    return (EAttribute)databaseBlockEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseBlock_HostValue()
  {
    return (EAttribute)databaseBlockEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameVersion()
  {
    return nameVersionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameVersion_NameValue()
  {
    return (EAttribute)nameVersionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameVersion_VersionValue()
  {
    return (EAttribute)nameVersionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationBlock()
  {
    return applicationBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationBlock_Name()
  {
    return (EAttribute)applicationBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationBlock_ApplicationDomain()
  {
    return (EAttribute)applicationBlockEClass.getEStructuralFeatures().get(1);
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
    createEReference(ledsCodeDSLEClass, LEDS_CODE_DSL__PROJECT);

    projectEClass = createEClass(PROJECT);
    createEAttribute(projectEClass, PROJECT__NAME);
    createEReference(projectEClass, PROJECT__INFRASTRUCTURE_BLOCK);
    createEReference(projectEClass, PROJECT__INTERFACE_BLOCK);
    createEReference(projectEClass, PROJECT__APPLICATION_BLOCK);
    createEAttribute(projectEClass, PROJECT__DOMAIN_BLOCK);

    interfaceBlockEClass = createEClass(INTERFACE_BLOCK);
    createEAttribute(interfaceBlockEClass, INTERFACE_BLOCK__NAME);
    createEReference(interfaceBlockEClass, INTERFACE_BLOCK__INTERFACE_APPLICATION);

    interfaceApplicationEClass = createEClass(INTERFACE_APPLICATION);
    createEAttribute(interfaceApplicationEClass, INTERFACE_APPLICATION__TYPE);
    createEAttribute(interfaceApplicationEClass, INTERFACE_APPLICATION__NAME);
    createEAttribute(interfaceApplicationEClass, INTERFACE_APPLICATION__NAME_APP);

    infrastructureBlockEClass = createEClass(INFRASTRUCTURE_BLOCK);
    createEAttribute(infrastructureBlockEClass, INFRASTRUCTURE_BLOCK__BASE_PACKAGE);
    createEAttribute(infrastructureBlockEClass, INFRASTRUCTURE_BLOCK__PROJECT_VERSION);
    createEReference(infrastructureBlockEClass, INFRASTRUCTURE_BLOCK__LANGUAGE);
    createEReference(infrastructureBlockEClass, INFRASTRUCTURE_BLOCK__FRAMEWORK);
    createEReference(infrastructureBlockEClass, INFRASTRUCTURE_BLOCK__ORM);
    createEReference(infrastructureBlockEClass, INFRASTRUCTURE_BLOCK__DATABASE);

    databaseBlockEClass = createEClass(DATABASE_BLOCK);
    createEAttribute(databaseBlockEClass, DATABASE_BLOCK__VERSION_VALUE);
    createEAttribute(databaseBlockEClass, DATABASE_BLOCK__NAME_VALUE);
    createEAttribute(databaseBlockEClass, DATABASE_BLOCK__USER_VALUE);
    createEAttribute(databaseBlockEClass, DATABASE_BLOCK__PASS_VALUE);
    createEAttribute(databaseBlockEClass, DATABASE_BLOCK__HOST_VALUE);

    nameVersionEClass = createEClass(NAME_VERSION);
    createEAttribute(nameVersionEClass, NAME_VERSION__NAME_VALUE);
    createEAttribute(nameVersionEClass, NAME_VERSION__VERSION_VALUE);

    applicationBlockEClass = createEClass(APPLICATION_BLOCK);
    createEAttribute(applicationBlockEClass, APPLICATION_BLOCK__NAME);
    createEAttribute(applicationBlockEClass, APPLICATION_BLOCK__APPLICATION_DOMAIN);
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

    // Initialize classes and features; add operations and parameters
    initEClass(ledsCodeDSLEClass, LedsCodeDSL.class, "LedsCodeDSL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLedsCodeDSL_Project(), this.getProject(), null, "project", null, 0, -1, LedsCodeDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_InfrastructureBlock(), this.getInfrastructureBlock(), null, "infrastructureBlock", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_InterfaceBlock(), this.getInterfaceBlock(), null, "interfaceBlock", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProject_ApplicationBlock(), this.getApplicationBlock(), null, "applicationBlock", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProject_DomainBlock(), ecorePackage.getEString(), "domainBlock", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceBlockEClass, InterfaceBlock.class, "InterfaceBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaceBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterfaceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceBlock_InterfaceApplication(), this.getInterfaceApplication(), null, "interfaceApplication", null, 0, -1, InterfaceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceApplicationEClass, InterfaceApplication.class, "InterfaceApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaceApplication_Type(), ecorePackage.getEString(), "type", null, 0, 1, InterfaceApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterfaceApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterfaceApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterfaceApplication_NameApp(), ecorePackage.getEString(), "nameApp", null, 0, 1, InterfaceApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(infrastructureBlockEClass, InfrastructureBlock.class, "InfrastructureBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInfrastructureBlock_BasePackage(), ecorePackage.getEString(), "basePackage", null, 0, 1, InfrastructureBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInfrastructureBlock_ProjectVersion(), ecorePackage.getEString(), "projectVersion", null, 0, 1, InfrastructureBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructureBlock_Language(), this.getNameVersion(), null, "language", null, 0, 1, InfrastructureBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructureBlock_Framework(), this.getNameVersion(), null, "framework", null, 0, 1, InfrastructureBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructureBlock_Orm(), this.getNameVersion(), null, "orm", null, 0, 1, InfrastructureBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInfrastructureBlock_Database(), this.getDatabaseBlock(), null, "database", null, 0, 1, InfrastructureBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseBlockEClass, DatabaseBlock.class, "DatabaseBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseBlock_VersionValue(), ecorePackage.getEString(), "versionValue", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseBlock_NameValue(), ecorePackage.getEString(), "nameValue", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseBlock_UserValue(), ecorePackage.getEString(), "userValue", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseBlock_PassValue(), ecorePackage.getEString(), "passValue", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabaseBlock_HostValue(), ecorePackage.getEString(), "hostValue", null, 0, 1, DatabaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameVersionEClass, NameVersion.class, "NameVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameVersion_NameValue(), ecorePackage.getEString(), "nameValue", null, 0, 1, NameVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameVersion_VersionValue(), ecorePackage.getEString(), "versionValue", null, 0, 1, NameVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationBlockEClass, ApplicationBlock.class, "ApplicationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationBlock_ApplicationDomain(), ecorePackage.getEString(), "applicationDomain", null, 0, -1, ApplicationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LedsCodeV001PackageImpl
