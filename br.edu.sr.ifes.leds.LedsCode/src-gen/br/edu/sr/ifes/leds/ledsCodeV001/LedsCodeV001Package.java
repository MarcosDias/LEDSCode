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
   * The feature id for the '<em><b>App Block</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__APP_BLOCK = 3;

  /**
   * The feature id for the '<em><b>Domain Block</b></em>' attribute list.
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
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseBlockImpl <em>Database Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseBlockImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getDatabaseBlock()
   * @generated
   */
  int DATABASE_BLOCK = 5;

  /**
   * The feature id for the '<em><b>Version Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__VERSION_VALUE = 0;

  /**
   * The feature id for the '<em><b>Name Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__NAME_VALUE = 1;

  /**
   * The feature id for the '<em><b>User Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__USER_VALUE = 2;

  /**
   * The feature id for the '<em><b>Pass Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__PASS_VALUE = 3;

  /**
   * The feature id for the '<em><b>Host Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK__HOST_VALUE = 4;

  /**
   * The number of structural features of the '<em>Database Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_BLOCK_FEATURE_COUNT = 5;

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
   * Returns the meta object for the attribute list '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getAppBlock <em>App Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>App Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Project#getAppBlock()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_AppBlock();

  /**
   * Returns the meta object for the attribute list '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getDomainBlock <em>Domain Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Domain Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Project#getDomainBlock()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_DomainBlock();

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
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock <em>Database Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Block</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock
   * @generated
   */
  EClass getDatabaseBlock();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock#getVersionValue <em>Version Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock#getVersionValue()
   * @see #getDatabaseBlock()
   * @generated
   */
  EAttribute getDatabaseBlock_VersionValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock#getNameValue <em>Name Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock#getNameValue()
   * @see #getDatabaseBlock()
   * @generated
   */
  EAttribute getDatabaseBlock_NameValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock#getUserValue <em>User Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock#getUserValue()
   * @see #getDatabaseBlock()
   * @generated
   */
  EAttribute getDatabaseBlock_UserValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock#getPassValue <em>Pass Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock#getPassValue()
   * @see #getDatabaseBlock()
   * @generated
   */
  EAttribute getDatabaseBlock_PassValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock#getHostValue <em>Host Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock#getHostValue()
   * @see #getDatabaseBlock()
   * @generated
   */
  EAttribute getDatabaseBlock_HostValue();

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
     * The meta object literal for the '<em><b>App Block</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__APP_BLOCK = eINSTANCE.getProject_AppBlock();

    /**
     * The meta object literal for the '<em><b>Domain Block</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__DOMAIN_BLOCK = eINSTANCE.getProject_DomainBlock();

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
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseBlockImpl <em>Database Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.DatabaseBlockImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getDatabaseBlock()
     * @generated
     */
    EClass DATABASE_BLOCK = eINSTANCE.getDatabaseBlock();

    /**
     * The meta object literal for the '<em><b>Version Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_BLOCK__VERSION_VALUE = eINSTANCE.getDatabaseBlock_VersionValue();

    /**
     * The meta object literal for the '<em><b>Name Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_BLOCK__NAME_VALUE = eINSTANCE.getDatabaseBlock_NameValue();

    /**
     * The meta object literal for the '<em><b>User Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_BLOCK__USER_VALUE = eINSTANCE.getDatabaseBlock_UserValue();

    /**
     * The meta object literal for the '<em><b>Pass Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_BLOCK__PASS_VALUE = eINSTANCE.getDatabaseBlock_PassValue();

    /**
     * The meta object literal for the '<em><b>Host Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_BLOCK__HOST_VALUE = eINSTANCE.getDatabaseBlock_HostValue();

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

  }

} //LedsCodeV001Package
