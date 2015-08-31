/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Factory
 * @model kind="package"
 * @generated
 */
public interface LedsCodeV001Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ledsCodeV001";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.edu.br/sr/ifes/leds/LedsCodeV001";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ledsCodeV001";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LedsCodeV001Package eINSTANCE = br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl.init();

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeDSLImpl <em>Leds Code DSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeDSLImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getLedsCodeDSL()
   * @generated
   */
  int LEDS_CODE_DSL = 0;

  /**
   * The feature id for the '<em><b>Project</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEDS_CODE_DSL__PROJECT = 0;

  /**
   * The number of structural features of the '<em>Leds Code DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEDS_CODE_DSL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ProjectImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getProject()
   * @generated
   */
  int PROJECT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__NAME = 0;

  /**
   * The feature id for the '<em><b>Infrastructure Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__INFRASTRUCTURE_BLOCK = 1;

  /**
   * The feature id for the '<em><b>Interface Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__INTERFACE_BLOCK = 2;

  /**
   * The feature id for the '<em><b>Application Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__APPLICATION_BLOCK = 3;

  /**
   * The feature id for the '<em><b>Domain Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__DOMAIN_BLOCK = 4;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InterfaceBlockImpl <em>Interface Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.InterfaceBlockImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getInterfaceBlock()
   * @generated
   */
  int INTERFACE_BLOCK = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Interface Application</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_BLOCK__INTERFACE_APPLICATION = 1;

  /**
   * The number of structural features of the '<em>Interface Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InterfaceApplicationImpl <em>Interface Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.InterfaceApplicationImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getInterfaceApplication()
   * @generated
   */
  int INTERFACE_APPLICATION = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_APPLICATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_APPLICATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Name App</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_APPLICATION__NAME_APP = 2;

  /**
   * The number of structural features of the '<em>Interface Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_APPLICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InfrastructureBlockImpl <em>Infrastructure Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.InfrastructureBlockImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getInfrastructureBlock()
   * @generated
   */
  int INFRASTRUCTURE_BLOCK = 4;

  /**
   * The feature id for the '<em><b>Base Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_BLOCK__BASE_PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Project Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_BLOCK__PROJECT_VERSION = 1;

  /**
   * The feature id for the '<em><b>Language</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_BLOCK__LANGUAGE = 2;

  /**
   * The feature id for the '<em><b>Framework</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_BLOCK__FRAMEWORK = 3;

  /**
   * The feature id for the '<em><b>Orm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_BLOCK__ORM = 4;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_BLOCK__DATABASE = 5;

  /**
   * The number of structural features of the '<em>Infrastructure Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INFRASTRUCTURE_BLOCK_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseImpl <em>Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getDatabase()
   * @generated
   */
  int DATABASE = 5;

  /**
   * The feature id for the '<em><b>Version Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__VERSION_VALUE = 0;

  /**
   * The feature id for the '<em><b>Name Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__NAME_VALUE = 1;

  /**
   * The feature id for the '<em><b>User Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__USER_VALUE = 2;

  /**
   * The feature id for the '<em><b>Pass Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__PASS_VALUE = 3;

  /**
   * The feature id for the '<em><b>Host Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__HOST_VALUE = 4;

  /**
   * The feature id for the '<em><b>Env Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__ENV_VALUE = 5;

  /**
   * The number of structural features of the '<em>Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.NameVersionImpl <em>Name Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.NameVersionImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getNameVersion()
   * @generated
   */
  int NAME_VERSION = 6;

  /**
   * The feature id for the '<em><b>Name Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_VERSION__NAME_VALUE = 0;

  /**
   * The feature id for the '<em><b>Version Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_VERSION__VERSION_VALUE = 1;

  /**
   * The number of structural features of the '<em>Name Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_VERSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationBlockImpl <em>Application Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationBlockImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getApplicationBlock()
   * @generated
   */
  int APPLICATION_BLOCK = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Application Domain</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_BLOCK__APPLICATION_DOMAIN = 1;

  /**
   * The number of structural features of the '<em>Application Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DomainBlockImpl <em>Domain Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.DomainBlockImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getDomainBlock()
   * @generated
   */
  int DOMAIN_BLOCK = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_BLOCK__MODULE = 1;

  /**
   * The number of structural features of the '<em>Domain Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ModuleBlockImpl <em>Module Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ModuleBlockImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getModuleBlock()
   * @generated
   */
  int MODULE_BLOCK = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Service Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_BLOCK__SERVICE_BLOCK = 1;

  /**
   * The feature id for the '<em><b>Entity Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_BLOCK__ENTITY_BLOCK = 2;

  /**
   * The feature id for the '<em><b>Enum Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_BLOCK__ENUM_BLOCK = 3;

  /**
   * The number of structural features of the '<em>Module Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_BLOCK_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ServiceBlockImpl <em>Service Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ServiceBlockImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getServiceBlock()
   * @generated
   */
  int SERVICE_BLOCK = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Service Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_BLOCK__SERVICE_FIELDS = 1;

  /**
   * The number of structural features of the '<em>Service Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ServiceMethodImpl <em>Service Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ServiceMethodImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getServiceMethod()
   * @generated
   */
  int SERVICE_METHOD = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Method Acess</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD__METHOD_ACESS = 1;

  /**
   * The number of structural features of the '<em>Service Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl <em>Entity Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getEntityBlock()
   * @generated
   */
  int ENTITY_BLOCK = 12;

  /**
   * The feature id for the '<em><b>Acess Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BLOCK__ACESS_MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BLOCK__IS_ABSTRACT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BLOCK__NAME = 2;

  /**
   * The feature id for the '<em><b>Class Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BLOCK__CLASS_EXTENDS = 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BLOCK__ATTRIBUTES = 4;

  /**
   * The feature id for the '<em><b>Repository</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BLOCK__REPOSITORY = 5;

  /**
   * The number of structural features of the '<em>Entity Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BLOCK_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 13;

  /**
   * The feature id for the '<em><b>Acess Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ACESS_MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 2;

  /**
   * The feature id for the '<em><b>Pk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__PK = 3;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__UNIQUE = 4;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NULLABLE = 5;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MIN = 6;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MAX = 7;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryImpl <em>Repository</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getRepository()
   * @generated
   */
  int REPOSITORY = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__NAME = 0;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY__METHODS = 1;

  /**
   * The number of structural features of the '<em>Repository</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryFieldsImpl <em>Repository Fields</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryFieldsImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getRepositoryFields()
   * @generated
   */
  int REPOSITORY_FIELDS = 15;

  /**
   * The feature id for the '<em><b>Name Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FIELDS__NAME_METHOD = 0;

  /**
   * The feature id for the '<em><b>Methods Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FIELDS__METHODS_PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FIELDS__RETURN_TYPE = 2;

  /**
   * The number of structural features of the '<em>Repository Fields</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_FIELDS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EnumBlockImpl <em>Enum Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.EnumBlockImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getEnumBlock()
   * @generated
   */
  int ENUM_BLOCK = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_BLOCK__NAME = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_BLOCK__VALUES = 1;

  /**
   * The number of structural features of the '<em>Enum Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.MethodParameterImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getMethodParameter()
   * @generated
   */
  int METHOD_PARAMETER = 17;

  /**
   * The feature id for the '<em><b>Type And Attr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PARAMETER__TYPE_AND_ATTR = 0;

  /**
   * The number of structural features of the '<em>Method Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.TypeAndAttributeImpl <em>Type And Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.TypeAndAttributeImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getTypeAndAttribute()
   * @generated
   */
  int TYPE_AND_ATTRIBUTE = 18;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_AND_ATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_AND_ATTRIBUTE__NAME = 1;

  /**
   * The number of structural features of the '<em>Type And Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_AND_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ExtendBlockImpl <em>Extend Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ExtendBlockImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getExtendBlock()
   * @generated
   */
  int EXTEND_BLOCK = 19;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_BLOCK__VALUES = 0;

  /**
   * The number of structural features of the '<em>Extend Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTEND_BLOCK_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL <em>Leds Code DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leds Code DSL</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL
   * @generated
   */
  EClass getLedsCodeDSL();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Project</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL#getProject()
   * @see #getLedsCodeDSL()
   * @generated
   */
  EReference getLedsCodeDSL_Project();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Project#getName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getInfrastructureBlock <em>Infrastructure Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Infrastructure Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Project#getInfrastructureBlock()
   * @see #getProject()
   * @generated
   */
  EReference getProject_InfrastructureBlock();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getInterfaceBlock <em>Interface Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Project#getInterfaceBlock()
   * @see #getProject()
   * @generated
   */
  EReference getProject_InterfaceBlock();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getApplicationBlock <em>Application Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Application Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Project#getApplicationBlock()
   * @see #getProject()
   * @generated
   */
  EReference getProject_ApplicationBlock();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getDomainBlock <em>Domain Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Domain Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Project#getDomainBlock()
   * @see #getProject()
   * @generated
   */
  EReference getProject_DomainBlock();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock <em>Interface Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock
   * @generated
   */
  EClass getInterfaceBlock();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock#getName()
   * @see #getInterfaceBlock()
   * @generated
   */
  EAttribute getInterfaceBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock#getInterfaceApplication <em>Interface Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interface Application</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock#getInterfaceApplication()
   * @see #getInterfaceBlock()
   * @generated
   */
  EReference getInterfaceBlock_InterfaceApplication();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication <em>Interface Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Application</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication
   * @generated
   */
  EClass getInterfaceApplication();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication#getType()
   * @see #getInterfaceApplication()
   * @generated
   */
  EAttribute getInterfaceApplication_Type();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication#getName()
   * @see #getInterfaceApplication()
   * @generated
   */
  EAttribute getInterfaceApplication_Name();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication#getNameApp <em>Name App</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name App</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication#getNameApp()
   * @see #getInterfaceApplication()
   * @generated
   */
  EAttribute getInterfaceApplication_NameApp();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock <em>Infrastructure Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Infrastructure Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock
   * @generated
   */
  EClass getInfrastructureBlock();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getBasePackage <em>Base Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Package</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getBasePackage()
   * @see #getInfrastructureBlock()
   * @generated
   */
  EAttribute getInfrastructureBlock_BasePackage();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getProjectVersion <em>Project Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Version</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getProjectVersion()
   * @see #getInfrastructureBlock()
   * @generated
   */
  EAttribute getInfrastructureBlock_ProjectVersion();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Language</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getLanguage()
   * @see #getInfrastructureBlock()
   * @generated
   */
  EReference getInfrastructureBlock_Language();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getFramework <em>Framework</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Framework</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getFramework()
   * @see #getInfrastructureBlock()
   * @generated
   */
  EReference getInfrastructureBlock_Framework();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getOrm <em>Orm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Orm</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getOrm()
   * @see #getInfrastructureBlock()
   * @generated
   */
  EReference getInfrastructureBlock_Orm();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getDatabase <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getDatabase()
   * @see #getInfrastructureBlock()
   * @generated
   */
  EReference getInfrastructureBlock_Database();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Database <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Database
   * @generated
   */
  EClass getDatabase();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Database#getVersionValue <em>Version Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Database#getVersionValue()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_VersionValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Database#getNameValue <em>Name Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Database#getNameValue()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_NameValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Database#getUserValue <em>User Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Database#getUserValue()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_UserValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Database#getPassValue <em>Pass Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Database#getPassValue()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_PassValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Database#getHostValue <em>Host Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Database#getHostValue()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_HostValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Database#getEnvValue <em>Env Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Env Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Database#getEnvValue()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_EnvValue();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.NameVersion <em>Name Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Version</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.NameVersion
   * @generated
   */
  EClass getNameVersion();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.NameVersion#getNameValue <em>Name Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.NameVersion#getNameValue()
   * @see #getNameVersion()
   * @generated
   */
  EAttribute getNameVersion_NameValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.NameVersion#getVersionValue <em>Version Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.NameVersion#getVersionValue()
   * @see #getNameVersion()
   * @generated
   */
  EAttribute getNameVersion_VersionValue();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock <em>Application Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock
   * @generated
   */
  EClass getApplicationBlock();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock#getName()
   * @see #getApplicationBlock()
   * @generated
   */
  EAttribute getApplicationBlock_Name();

  /**
   * Returns the meta object for the attribute list '{@link br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock#getApplicationDomain <em>Application Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Application Domain</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock#getApplicationDomain()
   * @see #getApplicationBlock()
   * @generated
   */
  EAttribute getApplicationBlock_ApplicationDomain();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock <em>Domain Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock
   * @generated
   */
  EClass getDomainBlock();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock#getName()
   * @see #getDomainBlock()
   * @generated
   */
  EAttribute getDomainBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Module</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock#getModule()
   * @see #getDomainBlock()
   * @generated
   */
  EReference getDomainBlock_Module();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock <em>Module Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock
   * @generated
   */
  EClass getModuleBlock();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock#getName()
   * @see #getModuleBlock()
   * @generated
   */
  EAttribute getModuleBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock#getServiceBlock <em>Service Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock#getServiceBlock()
   * @see #getModuleBlock()
   * @generated
   */
  EReference getModuleBlock_ServiceBlock();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock#getEntityBlock <em>Entity Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock#getEntityBlock()
   * @see #getModuleBlock()
   * @generated
   */
  EReference getModuleBlock_EntityBlock();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock#getEnumBlock <em>Enum Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ModuleBlock#getEnumBlock()
   * @see #getModuleBlock()
   * @generated
   */
  EReference getModuleBlock_EnumBlock();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock <em>Service Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock
   * @generated
   */
  EClass getServiceBlock();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock#getName()
   * @see #getServiceBlock()
   * @generated
   */
  EAttribute getServiceBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock#getServiceFields <em>Service Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Fields</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock#getServiceFields()
   * @see #getServiceBlock()
   * @generated
   */
  EReference getServiceBlock_ServiceFields();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod <em>Service Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Method</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod
   * @generated
   */
  EClass getServiceMethod();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod#getName()
   * @see #getServiceMethod()
   * @generated
   */
  EAttribute getServiceMethod_Name();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod#getMethodAcess <em>Method Acess</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method Acess</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod#getMethodAcess()
   * @see #getServiceMethod()
   * @generated
   */
  EAttribute getServiceMethod_MethodAcess();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock <em>Entity Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
   * @generated
   */
  EClass getEntityBlock();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getAcessModifier <em>Acess Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acess Modifier</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getAcessModifier()
   * @see #getEntityBlock()
   * @generated
   */
  EAttribute getEntityBlock_AcessModifier();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#isIsAbstract()
   * @see #getEntityBlock()
   * @generated
   */
  EAttribute getEntityBlock_IsAbstract();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getName()
   * @see #getEntityBlock()
   * @generated
   */
  EAttribute getEntityBlock_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getClassExtends <em>Class Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Extends</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getClassExtends()
   * @see #getEntityBlock()
   * @generated
   */
  EReference getEntityBlock_ClassExtends();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getAttributes()
   * @see #getEntityBlock()
   * @generated
   */
  EReference getEntityBlock_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getRepository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repository</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getRepository()
   * @see #getEntityBlock()
   * @generated
   */
  EReference getEntityBlock_Repository();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getAcessModifier <em>Acess Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acess Modifier</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getAcessModifier()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AcessModifier();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute#isPk <em>Pk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Attribute#isPk()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Pk();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getUnique()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Unique();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getNullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getNullable()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Nullable();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getMin()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Min();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Attribute#getMax()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Max();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Repository
   * @generated
   */
  EClass getRepository();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.Repository#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Repository#getName()
   * @see #getRepository()
   * @generated
   */
  EAttribute getRepository_Name();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.Repository#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Repository#getMethods()
   * @see #getRepository()
   * @generated
   */
  EReference getRepository_Methods();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields <em>Repository Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository Fields</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
   * @generated
   */
  EClass getRepositoryFields();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getNameMethod <em>Name Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Method</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getNameMethod()
   * @see #getRepositoryFields()
   * @generated
   */
  EAttribute getRepositoryFields_NameMethod();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getMethodsParameters <em>Methods Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Methods Parameters</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getMethodsParameters()
   * @see #getRepositoryFields()
   * @generated
   */
  EReference getRepositoryFields_MethodsParameters();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getReturnType()
   * @see #getRepositoryFields()
   * @generated
   */
  EAttribute getRepositoryFields_ReturnType();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock <em>Enum Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock
   * @generated
   */
  EClass getEnumBlock();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock#getName()
   * @see #getEnumBlock()
   * @generated
   */
  EAttribute getEnumBlock_Name();

  /**
   * Returns the meta object for the attribute list '{@link br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock#getValues()
   * @see #getEnumBlock()
   * @generated
   */
  EAttribute getEnumBlock_Values();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter <em>Method Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Parameter</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter
   * @generated
   */
  EClass getMethodParameter();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter#getTypeAndAttr <em>Type And Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type And Attr</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter#getTypeAndAttr()
   * @see #getMethodParameter()
   * @generated
   */
  EReference getMethodParameter_TypeAndAttr();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute <em>Type And Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type And Attribute</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute
   * @generated
   */
  EClass getTypeAndAttribute();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute#getType()
   * @see #getTypeAndAttribute()
   * @generated
   */
  EAttribute getTypeAndAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute#getName()
   * @see #getTypeAndAttribute()
   * @generated
   */
  EAttribute getTypeAndAttribute_Name();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock <em>Extend Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extend Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock
   * @generated
   */
  EClass getExtendBlock();

  /**
   * Returns the meta object for the attribute list '{@link br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock#getValues()
   * @see #getExtendBlock()
   * @generated
   */
  EAttribute getExtendBlock_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LedsCodeV001Factory getLedsCodeV001Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeDSLImpl <em>Leds Code DSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeDSLImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getLedsCodeDSL()
     * @generated
     */
    EClass LEDS_CODE_DSL = eINSTANCE.getLedsCodeDSL();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEDS_CODE_DSL__PROJECT = eINSTANCE.getLedsCodeDSL_Project();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ProjectImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

    /**
     * The meta object literal for the '<em><b>Infrastructure Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__INFRASTRUCTURE_BLOCK = eINSTANCE.getProject_InfrastructureBlock();

    /**
     * The meta object literal for the '<em><b>Interface Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__INTERFACE_BLOCK = eINSTANCE.getProject_InterfaceBlock();

    /**
     * The meta object literal for the '<em><b>Application Block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__APPLICATION_BLOCK = eINSTANCE.getProject_ApplicationBlock();

    /**
     * The meta object literal for the '<em><b>Domain Block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__DOMAIN_BLOCK = eINSTANCE.getProject_DomainBlock();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InterfaceBlockImpl <em>Interface Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.InterfaceBlockImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getInterfaceBlock()
     * @generated
     */
    EClass INTERFACE_BLOCK = eINSTANCE.getInterfaceBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_BLOCK__NAME = eINSTANCE.getInterfaceBlock_Name();

    /**
     * The meta object literal for the '<em><b>Interface Application</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_BLOCK__INTERFACE_APPLICATION = eINSTANCE.getInterfaceBlock_InterfaceApplication();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InterfaceApplicationImpl <em>Interface Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.InterfaceApplicationImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getInterfaceApplication()
     * @generated
     */
    EClass INTERFACE_APPLICATION = eINSTANCE.getInterfaceApplication();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_APPLICATION__TYPE = eINSTANCE.getInterfaceApplication_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_APPLICATION__NAME = eINSTANCE.getInterfaceApplication_Name();

    /**
     * The meta object literal for the '<em><b>Name App</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_APPLICATION__NAME_APP = eINSTANCE.getInterfaceApplication_NameApp();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.InfrastructureBlockImpl <em>Infrastructure Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.InfrastructureBlockImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getInfrastructureBlock()
     * @generated
     */
    EClass INFRASTRUCTURE_BLOCK = eINSTANCE.getInfrastructureBlock();

    /**
     * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE_BLOCK__BASE_PACKAGE = eINSTANCE.getInfrastructureBlock_BasePackage();

    /**
     * The meta object literal for the '<em><b>Project Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INFRASTRUCTURE_BLOCK__PROJECT_VERSION = eINSTANCE.getInfrastructureBlock_ProjectVersion();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE_BLOCK__LANGUAGE = eINSTANCE.getInfrastructureBlock_Language();

    /**
     * The meta object literal for the '<em><b>Framework</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE_BLOCK__FRAMEWORK = eINSTANCE.getInfrastructureBlock_Framework();

    /**
     * The meta object literal for the '<em><b>Orm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE_BLOCK__ORM = eINSTANCE.getInfrastructureBlock_Orm();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INFRASTRUCTURE_BLOCK__DATABASE = eINSTANCE.getInfrastructureBlock_Database();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseImpl <em>Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getDatabase()
     * @generated
     */
    EClass DATABASE = eINSTANCE.getDatabase();

    /**
     * The meta object literal for the '<em><b>Version Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__VERSION_VALUE = eINSTANCE.getDatabase_VersionValue();

    /**
     * The meta object literal for the '<em><b>Name Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__NAME_VALUE = eINSTANCE.getDatabase_NameValue();

    /**
     * The meta object literal for the '<em><b>User Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__USER_VALUE = eINSTANCE.getDatabase_UserValue();

    /**
     * The meta object literal for the '<em><b>Pass Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__PASS_VALUE = eINSTANCE.getDatabase_PassValue();

    /**
     * The meta object literal for the '<em><b>Host Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__HOST_VALUE = eINSTANCE.getDatabase_HostValue();

    /**
     * The meta object literal for the '<em><b>Env Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__ENV_VALUE = eINSTANCE.getDatabase_EnvValue();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.NameVersionImpl <em>Name Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.NameVersionImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getNameVersion()
     * @generated
     */
    EClass NAME_VERSION = eINSTANCE.getNameVersion();

    /**
     * The meta object literal for the '<em><b>Name Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_VERSION__NAME_VALUE = eINSTANCE.getNameVersion_NameValue();

    /**
     * The meta object literal for the '<em><b>Version Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_VERSION__VERSION_VALUE = eINSTANCE.getNameVersion_VersionValue();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationBlockImpl <em>Application Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationBlockImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getApplicationBlock()
     * @generated
     */
    EClass APPLICATION_BLOCK = eINSTANCE.getApplicationBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_BLOCK__NAME = eINSTANCE.getApplicationBlock_Name();

    /**
     * The meta object literal for the '<em><b>Application Domain</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_BLOCK__APPLICATION_DOMAIN = eINSTANCE.getApplicationBlock_ApplicationDomain();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DomainBlockImpl <em>Domain Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.DomainBlockImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getDomainBlock()
     * @generated
     */
    EClass DOMAIN_BLOCK = eINSTANCE.getDomainBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN_BLOCK__NAME = eINSTANCE.getDomainBlock_Name();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_BLOCK__MODULE = eINSTANCE.getDomainBlock_Module();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ModuleBlockImpl <em>Module Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ModuleBlockImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getModuleBlock()
     * @generated
     */
    EClass MODULE_BLOCK = eINSTANCE.getModuleBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_BLOCK__NAME = eINSTANCE.getModuleBlock_Name();

    /**
     * The meta object literal for the '<em><b>Service Block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_BLOCK__SERVICE_BLOCK = eINSTANCE.getModuleBlock_ServiceBlock();

    /**
     * The meta object literal for the '<em><b>Entity Block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_BLOCK__ENTITY_BLOCK = eINSTANCE.getModuleBlock_EntityBlock();

    /**
     * The meta object literal for the '<em><b>Enum Block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_BLOCK__ENUM_BLOCK = eINSTANCE.getModuleBlock_EnumBlock();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ServiceBlockImpl <em>Service Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ServiceBlockImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getServiceBlock()
     * @generated
     */
    EClass SERVICE_BLOCK = eINSTANCE.getServiceBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_BLOCK__NAME = eINSTANCE.getServiceBlock_Name();

    /**
     * The meta object literal for the '<em><b>Service Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_BLOCK__SERVICE_FIELDS = eINSTANCE.getServiceBlock_ServiceFields();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ServiceMethodImpl <em>Service Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ServiceMethodImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getServiceMethod()
     * @generated
     */
    EClass SERVICE_METHOD = eINSTANCE.getServiceMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_METHOD__NAME = eINSTANCE.getServiceMethod_Name();

    /**
     * The meta object literal for the '<em><b>Method Acess</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_METHOD__METHOD_ACESS = eINSTANCE.getServiceMethod_MethodAcess();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl <em>Entity Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.EntityBlockImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getEntityBlock()
     * @generated
     */
    EClass ENTITY_BLOCK = eINSTANCE.getEntityBlock();

    /**
     * The meta object literal for the '<em><b>Acess Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_BLOCK__ACESS_MODIFIER = eINSTANCE.getEntityBlock_AcessModifier();

    /**
     * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_BLOCK__IS_ABSTRACT = eINSTANCE.getEntityBlock_IsAbstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_BLOCK__NAME = eINSTANCE.getEntityBlock_Name();

    /**
     * The meta object literal for the '<em><b>Class Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_BLOCK__CLASS_EXTENDS = eINSTANCE.getEntityBlock_ClassExtends();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_BLOCK__ATTRIBUTES = eINSTANCE.getEntityBlock_Attributes();

    /**
     * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_BLOCK__REPOSITORY = eINSTANCE.getEntityBlock_Repository();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Acess Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ACESS_MODIFIER = eINSTANCE.getAttribute_AcessModifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Pk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__PK = eINSTANCE.getAttribute_Pk();

    /**
     * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__UNIQUE = eINSTANCE.getAttribute_Unique();

    /**
     * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NULLABLE = eINSTANCE.getAttribute_Nullable();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MIN = eINSTANCE.getAttribute_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MAX = eINSTANCE.getAttribute_Max();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryImpl <em>Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getRepository()
     * @generated
     */
    EClass REPOSITORY = eINSTANCE.getRepository();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY__METHODS = eINSTANCE.getRepository_Methods();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryFieldsImpl <em>Repository Fields</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryFieldsImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getRepositoryFields()
     * @generated
     */
    EClass REPOSITORY_FIELDS = eINSTANCE.getRepositoryFields();

    /**
     * The meta object literal for the '<em><b>Name Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_FIELDS__NAME_METHOD = eINSTANCE.getRepositoryFields_NameMethod();

    /**
     * The meta object literal for the '<em><b>Methods Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPOSITORY_FIELDS__METHODS_PARAMETERS = eINSTANCE.getRepositoryFields_MethodsParameters();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_FIELDS__RETURN_TYPE = eINSTANCE.getRepositoryFields_ReturnType();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.EnumBlockImpl <em>Enum Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.EnumBlockImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getEnumBlock()
     * @generated
     */
    EClass ENUM_BLOCK = eINSTANCE.getEnumBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_BLOCK__NAME = eINSTANCE.getEnumBlock_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_BLOCK__VALUES = eINSTANCE.getEnumBlock_Values();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.MethodParameterImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getMethodParameter()
     * @generated
     */
    EClass METHOD_PARAMETER = eINSTANCE.getMethodParameter();

    /**
     * The meta object literal for the '<em><b>Type And Attr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PARAMETER__TYPE_AND_ATTR = eINSTANCE.getMethodParameter_TypeAndAttr();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.TypeAndAttributeImpl <em>Type And Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.TypeAndAttributeImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getTypeAndAttribute()
     * @generated
     */
    EClass TYPE_AND_ATTRIBUTE = eINSTANCE.getTypeAndAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_AND_ATTRIBUTE__TYPE = eINSTANCE.getTypeAndAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_AND_ATTRIBUTE__NAME = eINSTANCE.getTypeAndAttribute_Name();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ExtendBlockImpl <em>Extend Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ExtendBlockImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getExtendBlock()
     * @generated
     */
    EClass EXTEND_BLOCK = eINSTANCE.getExtendBlock();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTEND_BLOCK__VALUES = eINSTANCE.getExtendBlock_Values();

  }

} //LedsCodeV001Package
