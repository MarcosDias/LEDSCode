/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LedsCodeV001FactoryImpl extends EFactoryImpl implements LedsCodeV001Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LedsCodeV001Factory init()
  {
    try
    {
      LedsCodeV001Factory theLedsCodeV001Factory = (LedsCodeV001Factory)EPackage.Registry.INSTANCE.getEFactory(LedsCodeV001Package.eNS_URI);
      if (theLedsCodeV001Factory != null)
      {
        return theLedsCodeV001Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LedsCodeV001FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LedsCodeV001FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LedsCodeV001Package.LEDS_CODE_DSL: return createLedsCodeDSL();
      case LedsCodeV001Package.PROJECT: return createProject();
      case LedsCodeV001Package.INTERFACE_BLOCK: return createInterfaceBlock();
      case LedsCodeV001Package.INTERFACE_APPLICATION: return createInterfaceApplication();
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK: return createInfrastructureBlock();
      case LedsCodeV001Package.DATABASE: return createDatabase();
      case LedsCodeV001Package.NAME_VERSION: return createNameVersion();
      case LedsCodeV001Package.APPLICATION_BLOCK: return createApplicationBlock();
      case LedsCodeV001Package.DOMAIN_BLOCK: return createDomainBlock();
      case LedsCodeV001Package.MODULE: return createModule();
      case LedsCodeV001Package.SERVICE_BLOCK: return createServiceBlock();
      case LedsCodeV001Package.SERVICE_METHOD: return createServiceMethod();
      case LedsCodeV001Package.ENTITY_BLOCK: return createEntityBlock();
      case LedsCodeV001Package.ATTRIBUTE: return createAttribute();
      case LedsCodeV001Package.REPOSITORY: return createRepository();
      case LedsCodeV001Package.REPOSITORY_FIELDS: return createRepositoryFields();
      case LedsCodeV001Package.ENUM_BLOCK: return createEnumBlock();
      case LedsCodeV001Package.METHOD_PARAMETER: return createMethodParameter();
      case LedsCodeV001Package.TYPE_AND_ATTRIBUTE: return createTypeAndAttribute();
      case LedsCodeV001Package.EXTEND_BLOCK: return createExtendBlock();
      case LedsCodeV001Package.ACCESS_MODIFIER: return createAccessModifier();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LedsCodeDSL createLedsCodeDSL()
  {
    LedsCodeDSLImpl ledsCodeDSL = new LedsCodeDSLImpl();
    return ledsCodeDSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceBlock createInterfaceBlock()
  {
    InterfaceBlockImpl interfaceBlock = new InterfaceBlockImpl();
    return interfaceBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceApplication createInterfaceApplication()
  {
    InterfaceApplicationImpl interfaceApplication = new InterfaceApplicationImpl();
    return interfaceApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfrastructureBlock createInfrastructureBlock()
  {
    InfrastructureBlockImpl infrastructureBlock = new InfrastructureBlockImpl();
    return infrastructureBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Database createDatabase()
  {
    DatabaseImpl database = new DatabaseImpl();
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameVersion createNameVersion()
  {
    NameVersionImpl nameVersion = new NameVersionImpl();
    return nameVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationBlock createApplicationBlock()
  {
    ApplicationBlockImpl applicationBlock = new ApplicationBlockImpl();
    return applicationBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainBlock createDomainBlock()
  {
    DomainBlockImpl domainBlock = new DomainBlockImpl();
    return domainBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceBlock createServiceBlock()
  {
    ServiceBlockImpl serviceBlock = new ServiceBlockImpl();
    return serviceBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceMethod createServiceMethod()
  {
    ServiceMethodImpl serviceMethod = new ServiceMethodImpl();
    return serviceMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityBlock createEntityBlock()
  {
    EntityBlockImpl entityBlock = new EntityBlockImpl();
    return entityBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repository createRepository()
  {
    RepositoryImpl repository = new RepositoryImpl();
    return repository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryFields createRepositoryFields()
  {
    RepositoryFieldsImpl repositoryFields = new RepositoryFieldsImpl();
    return repositoryFields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumBlock createEnumBlock()
  {
    EnumBlockImpl enumBlock = new EnumBlockImpl();
    return enumBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodParameter createMethodParameter()
  {
    MethodParameterImpl methodParameter = new MethodParameterImpl();
    return methodParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndAttribute createTypeAndAttribute()
  {
    TypeAndAttributeImpl typeAndAttribute = new TypeAndAttributeImpl();
    return typeAndAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendBlock createExtendBlock()
  {
    ExtendBlockImpl extendBlock = new ExtendBlockImpl();
    return extendBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessModifier createAccessModifier()
  {
    AccessModifierImpl accessModifier = new AccessModifierImpl();
    return accessModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LedsCodeV001Package getLedsCodeV001Package()
  {
    return (LedsCodeV001Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LedsCodeV001Package getPackage()
  {
    return LedsCodeV001Package.eINSTANCE;
  }

} //LedsCodeV001FactoryImpl
