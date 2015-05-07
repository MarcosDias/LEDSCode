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
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Name Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Application</em>'.
   * @generated
   */
  NameApplication createNameApplication();

  /**
   * Returns a new object of class '<em>Language</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language</em>'.
   * @generated
   */
  Language createLanguage();

  /**
   * Returns a new object of class '<em>Framework</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Framework</em>'.
   * @generated
   */
  Framework createFramework();

  /**
   * Returns a new object of class '<em>ORM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ORM</em>'.
   * @generated
   */
  ORM createORM();

  /**
   * Returns a new object of class '<em>Data Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Base</em>'.
   * @generated
   */
  DataBase createDataBase();

  /**
   * Returns a new object of class '<em>Dictionary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dictionary</em>'.
   * @generated
   */
  Dictionary createDictionary();

  /**
   * Returns a new object of class '<em>Key Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Value</em>'.
   * @generated
   */
  KeyValue createKeyValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LedsCodeV001Package getLedsCodeV001Package();

} //LedsCodeV001Factory
