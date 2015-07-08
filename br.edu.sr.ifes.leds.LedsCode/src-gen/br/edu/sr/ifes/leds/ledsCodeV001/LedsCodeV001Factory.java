/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package
 * @generated
 */
public interface LedsCodeV001Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LedsCodeV001Factory eINSTANCE = br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Leds Code DSL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leds Code DSL</em>'.
   * @generated
   */
  LedsCodeDSL createLedsCodeDSL();

  /**
   * Returns a new object of class '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  Project createProject();

  /**
   * Returns a new object of class '<em>Interface Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Block</em>'.
   * @generated
   */
  InterfaceBlock createInterfaceBlock();

  /**
   * Returns a new object of class '<em>Interface Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Application</em>'.
   * @generated
   */
  InterfaceApplication createInterfaceApplication();

  /**
   * Returns a new object of class '<em>Infrastructure Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Infrastructure Block</em>'.
   * @generated
   */
  InfrastructureBlock createInfrastructureBlock();

  /**
   * Returns a new object of class '<em>Database</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database</em>'.
   * @generated
   */
  Database createDatabase();

  /**
   * Returns a new object of class '<em>Name Version</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Version</em>'.
   * @generated
   */
  NameVersion createNameVersion();

  /**
   * Returns a new object of class '<em>Application Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Block</em>'.
   * @generated
   */
  ApplicationBlock createApplicationBlock();

  /**
   * Returns a new object of class '<em>Domain Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Block</em>'.
   * @generated
   */
  DomainBlock createDomainBlock();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Service Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Block</em>'.
   * @generated
   */
  ServiceBlock createServiceBlock();

  /**
   * Returns a new object of class '<em>Service Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Method</em>'.
   * @generated
   */
  ServiceMethod createServiceMethod();

  /**
   * Returns a new object of class '<em>Entity Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Block</em>'.
   * @generated
   */
  EntityBlock createEntityBlock();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository</em>'.
   * @generated
   */
  Repository createRepository();

  /**
   * Returns a new object of class '<em>Repository Fields</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Repository Fields</em>'.
   * @generated
   */
  RepositoryFields createRepositoryFields();

  /**
   * Returns a new object of class '<em>Enum Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Block</em>'.
   * @generated
   */
  EnumBlock createEnumBlock();

  /**
   * Returns a new object of class '<em>Method Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Parameter</em>'.
   * @generated
   */
  MethodParameter createMethodParameter();

  /**
   * Returns a new object of class '<em>Type And Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type And Attribute</em>'.
   * @generated
   */
  TypeAndAttribute createTypeAndAttribute();

  /**
   * Returns a new object of class '<em>Extend Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extend Block</em>'.
   * @generated
   */
  ExtendBlock createExtendBlock();

  /**
   * Returns a new object of class '<em>Access Modifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Access Modifier</em>'.
   * @generated
   */
  AccessModifier createAccessModifier();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LedsCodeV001Package getLedsCodeV001Package();

} //LedsCodeV001Factory
