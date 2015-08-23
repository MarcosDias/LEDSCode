/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.Attribute;
import br.edu.sr.ifes.leds.ledsCodeV001.Database;
import br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication;
import br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Factory;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter;
import br.edu.sr.ifes.leds.ledsCodeV001.Module;
import br.edu.sr.ifes.leds.ledsCodeV001.NameVersion;
import br.edu.sr.ifes.leds.ledsCodeV001.Project;
import br.edu.sr.ifes.leds.ledsCodeV001.Repository;
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock;
import br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod;
import br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute;

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
  private EClass databaseEClass = null;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repositoryFieldsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeAndAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendBlockEClass = null;

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
  public EReference getProject_DomainBlock()
  {
    return (EReference)projectEClass.getEStructuralFeatures().get(4);
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
  public EClass getDatabase()
  {
    return databaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabase_VersionValue()
  {
    return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabase_NameValue()
  {
    return (EAttribute)databaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabase_UserValue()
  {
    return (EAttribute)databaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabase_PassValue()
  {
    return (EAttribute)databaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabase_HostValue()
  {
    return (EAttribute)databaseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabase_EnvValue()
  {
    return (EAttribute)databaseEClass.getEStructuralFeatures().get(5);
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
  public EClass getDomainBlock()
  {
    return domainBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainBlock_Name()
  {
    return (EAttribute)domainBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainBlock_Module()
  {
    return (EReference)domainBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_ServiceBlock()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_EntityBlock()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_EnumBlock()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceBlock()
  {
    return serviceBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceBlock_Name()
  {
    return (EAttribute)serviceBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceBlock_ServiceFields()
  {
    return (EReference)serviceBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceMethod()
  {
    return serviceMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceMethod_Name()
  {
    return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceMethod_MethodAcess()
  {
    return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityBlock()
  {
    return entityBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityBlock_AcessModifier()
  {
    return (EAttribute)entityBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityBlock_IsAbstract()
  {
    return (EAttribute)entityBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityBlock_Name()
  {
    return (EAttribute)entityBlockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityBlock_ClassExtends()
  {
    return (EReference)entityBlockEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityBlock_Attributes()
  {
    return (EReference)entityBlockEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityBlock_Repository()
  {
    return (EReference)entityBlockEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_AcessModifier()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Type()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Pk()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Unique()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Nullable()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Min()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Max()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepository()
  {
    return repositoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepository_Name()
  {
    return (EAttribute)repositoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepository_Methods()
  {
    return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepositoryFields()
  {
    return repositoryFieldsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryFields_NameMethod()
  {
    return (EAttribute)repositoryFieldsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRepositoryFields_MethodsParameters()
  {
    return (EReference)repositoryFieldsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepositoryFields_ReturnType()
  {
    return (EAttribute)repositoryFieldsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumBlock()
  {
    return enumBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumBlock_Name()
  {
    return (EAttribute)enumBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumBlock_Values()
  {
    return (EAttribute)enumBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodParameter()
  {
    return methodParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodParameter_TypeAndAttr()
  {
    return (EReference)methodParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeAndAttribute()
  {
    return typeAndAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeAndAttribute_Type()
  {
    return (EAttribute)typeAndAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeAndAttribute_Name()
  {
    return (EAttribute)typeAndAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtendBlock()
  {
    return extendBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtendBlock_Values()
  {
    return (EAttribute)extendBlockEClass.getEStructuralFeatures().get(0);
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
    createEReference(projectEClass, PROJECT__DOMAIN_BLOCK);

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

    databaseEClass = createEClass(DATABASE);
    createEAttribute(databaseEClass, DATABASE__VERSION_VALUE);
    createEAttribute(databaseEClass, DATABASE__NAME_VALUE);
    createEAttribute(databaseEClass, DATABASE__USER_VALUE);
    createEAttribute(databaseEClass, DATABASE__PASS_VALUE);
    createEAttribute(databaseEClass, DATABASE__HOST_VALUE);
    createEAttribute(databaseEClass, DATABASE__ENV_VALUE);

    nameVersionEClass = createEClass(NAME_VERSION);
    createEAttribute(nameVersionEClass, NAME_VERSION__NAME_VALUE);
    createEAttribute(nameVersionEClass, NAME_VERSION__VERSION_VALUE);

    applicationBlockEClass = createEClass(APPLICATION_BLOCK);
    createEAttribute(applicationBlockEClass, APPLICATION_BLOCK__NAME);
    createEAttribute(applicationBlockEClass, APPLICATION_BLOCK__APPLICATION_DOMAIN);

    domainBlockEClass = createEClass(DOMAIN_BLOCK);
    createEAttribute(domainBlockEClass, DOMAIN_BLOCK__NAME);
    createEReference(domainBlockEClass, DOMAIN_BLOCK__MODULE);

    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEReference(moduleEClass, MODULE__SERVICE_BLOCK);
    createEReference(moduleEClass, MODULE__ENTITY_BLOCK);
    createEReference(moduleEClass, MODULE__ENUM_BLOCK);

    serviceBlockEClass = createEClass(SERVICE_BLOCK);
    createEAttribute(serviceBlockEClass, SERVICE_BLOCK__NAME);
    createEReference(serviceBlockEClass, SERVICE_BLOCK__SERVICE_FIELDS);

    serviceMethodEClass = createEClass(SERVICE_METHOD);
    createEAttribute(serviceMethodEClass, SERVICE_METHOD__NAME);
    createEAttribute(serviceMethodEClass, SERVICE_METHOD__METHOD_ACESS);

    entityBlockEClass = createEClass(ENTITY_BLOCK);
    createEAttribute(entityBlockEClass, ENTITY_BLOCK__ACESS_MODIFIER);
    createEAttribute(entityBlockEClass, ENTITY_BLOCK__IS_ABSTRACT);
    createEAttribute(entityBlockEClass, ENTITY_BLOCK__NAME);
    createEReference(entityBlockEClass, ENTITY_BLOCK__CLASS_EXTENDS);
    createEReference(entityBlockEClass, ENTITY_BLOCK__ATTRIBUTES);
    createEReference(entityBlockEClass, ENTITY_BLOCK__REPOSITORY);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__ACESS_MODIFIER);
    createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__PK);
    createEAttribute(attributeEClass, ATTRIBUTE__UNIQUE);
    createEAttribute(attributeEClass, ATTRIBUTE__NULLABLE);
    createEAttribute(attributeEClass, ATTRIBUTE__MIN);
    createEAttribute(attributeEClass, ATTRIBUTE__MAX);

    repositoryEClass = createEClass(REPOSITORY);
    createEAttribute(repositoryEClass, REPOSITORY__NAME);
    createEReference(repositoryEClass, REPOSITORY__METHODS);

    repositoryFieldsEClass = createEClass(REPOSITORY_FIELDS);
    createEAttribute(repositoryFieldsEClass, REPOSITORY_FIELDS__NAME_METHOD);
    createEReference(repositoryFieldsEClass, REPOSITORY_FIELDS__METHODS_PARAMETERS);
    createEAttribute(repositoryFieldsEClass, REPOSITORY_FIELDS__RETURN_TYPE);

    enumBlockEClass = createEClass(ENUM_BLOCK);
    createEAttribute(enumBlockEClass, ENUM_BLOCK__NAME);
    createEAttribute(enumBlockEClass, ENUM_BLOCK__VALUES);

    methodParameterEClass = createEClass(METHOD_PARAMETER);
    createEReference(methodParameterEClass, METHOD_PARAMETER__TYPE_AND_ATTR);

    typeAndAttributeEClass = createEClass(TYPE_AND_ATTRIBUTE);
    createEAttribute(typeAndAttributeEClass, TYPE_AND_ATTRIBUTE__TYPE);
    createEAttribute(typeAndAttributeEClass, TYPE_AND_ATTRIBUTE__NAME);

    extendBlockEClass = createEClass(EXTEND_BLOCK);
    createEAttribute(extendBlockEClass, EXTEND_BLOCK__VALUES);
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
    initEReference(getProject_DomainBlock(), this.getDomainBlock(), null, "domainBlock", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEReference(getInfrastructureBlock_Database(), this.getDatabase(), null, "database", null, 0, 1, InfrastructureBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabase_VersionValue(), ecorePackage.getEString(), "versionValue", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabase_NameValue(), ecorePackage.getEString(), "nameValue", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabase_UserValue(), ecorePackage.getEString(), "userValue", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabase_PassValue(), ecorePackage.getEString(), "passValue", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabase_HostValue(), ecorePackage.getEString(), "hostValue", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDatabase_EnvValue(), ecorePackage.getEString(), "envValue", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nameVersionEClass, NameVersion.class, "NameVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNameVersion_NameValue(), ecorePackage.getEString(), "nameValue", null, 0, 1, NameVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNameVersion_VersionValue(), ecorePackage.getEString(), "versionValue", null, 0, 1, NameVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationBlockEClass, ApplicationBlock.class, "ApplicationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationBlock_ApplicationDomain(), ecorePackage.getEString(), "applicationDomain", null, 0, -1, ApplicationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainBlockEClass, DomainBlock.class, "DomainBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainBlock_Module(), this.getModule(), null, "module", null, 0, -1, DomainBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_ServiceBlock(), this.getServiceBlock(), null, "serviceBlock", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_EntityBlock(), this.getEntityBlock(), null, "entityBlock", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_EnumBlock(), this.getEnumBlock(), null, "enumBlock", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceBlockEClass, ServiceBlock.class, "ServiceBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceBlock_ServiceFields(), this.getServiceMethod(), null, "serviceFields", null, 0, -1, ServiceBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceMethodEClass, ServiceMethod.class, "ServiceMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceMethod_MethodAcess(), ecorePackage.getEString(), "methodAcess", null, 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityBlockEClass, EntityBlock.class, "EntityBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntityBlock_AcessModifier(), ecorePackage.getEString(), "acessModifier", null, 0, 1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntityBlock_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntityBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityBlock_ClassExtends(), this.getExtendBlock(), null, "classExtends", null, 0, 1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityBlock_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityBlock_Repository(), this.getRepository(), null, "repository", null, 0, 1, EntityBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_AcessModifier(), ecorePackage.getEString(), "acessModifier", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Pk(), ecorePackage.getEBoolean(), "pk", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Unique(), ecorePackage.getEString(), "unique", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Nullable(), ecorePackage.getEString(), "nullable", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Min(), ecorePackage.getEIntegerObject(), "min", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Max(), ecorePackage.getEIntegerObject(), "max", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepository_Methods(), this.getRepositoryFields(), null, "methods", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repositoryFieldsEClass, RepositoryFields.class, "RepositoryFields", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepositoryFields_NameMethod(), ecorePackage.getEString(), "nameMethod", null, 0, 1, RepositoryFields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRepositoryFields_MethodsParameters(), this.getMethodParameter(), null, "methodsParameters", null, 0, 1, RepositoryFields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepositoryFields_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, RepositoryFields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumBlockEClass, EnumBlock.class, "EnumBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumBlock_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumBlock_Values(), ecorePackage.getEString(), "values", null, 0, -1, EnumBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodParameterEClass, MethodParameter.class, "MethodParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodParameter_TypeAndAttr(), this.getTypeAndAttribute(), null, "typeAndAttr", null, 0, -1, MethodParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeAndAttributeEClass, TypeAndAttribute.class, "TypeAndAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeAndAttribute_Type(), ecorePackage.getEString(), "type", null, 0, 1, TypeAndAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeAndAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, TypeAndAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendBlockEClass, ExtendBlock.class, "ExtendBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtendBlock_Values(), ecorePackage.getEString(), "values", null, 0, -1, ExtendBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LedsCodeV001PackageImpl
