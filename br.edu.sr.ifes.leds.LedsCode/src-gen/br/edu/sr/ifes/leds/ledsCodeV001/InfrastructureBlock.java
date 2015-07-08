/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getProjectVersion <em>Project Version</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getLanguage <em>Language</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getFramework <em>Framework</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getOrm <em>Orm</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getInfrastructureBlock()
 * @model
 * @generated
 */
public interface InfrastructureBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Base Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Package</em>' attribute.
   * @see #setBasePackage(String)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getInfrastructureBlock_BasePackage()
   * @model
   * @generated
   */
  String getBasePackage();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getBasePackage <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Package</em>' attribute.
   * @see #getBasePackage()
   * @generated
   */
  void setBasePackage(String value);

  /**
   * Returns the value of the '<em><b>Project Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Version</em>' attribute.
   * @see #setProjectVersion(String)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getInfrastructureBlock_ProjectVersion()
   * @model
   * @generated
   */
  String getProjectVersion();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getProjectVersion <em>Project Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Version</em>' attribute.
   * @see #getProjectVersion()
   * @generated
   */
  void setProjectVersion(String value);

  /**
   * Returns the value of the '<em><b>Language</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' containment reference.
   * @see #setLanguage(NameVersion)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getInfrastructureBlock_Language()
   * @model containment="true"
   * @generated
   */
  NameVersion getLanguage();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getLanguage <em>Language</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' containment reference.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(NameVersion value);

  /**
   * Returns the value of the '<em><b>Framework</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Framework</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Framework</em>' containment reference.
   * @see #setFramework(NameVersion)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getInfrastructureBlock_Framework()
   * @model containment="true"
   * @generated
   */
  NameVersion getFramework();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getFramework <em>Framework</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Framework</em>' containment reference.
   * @see #getFramework()
   * @generated
   */
  void setFramework(NameVersion value);

  /**
   * Returns the value of the '<em><b>Orm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orm</em>' containment reference.
   * @see #setOrm(NameVersion)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getInfrastructureBlock_Orm()
   * @model containment="true"
   * @generated
   */
  NameVersion getOrm();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getOrm <em>Orm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orm</em>' containment reference.
   * @see #getOrm()
   * @generated
   */
  void setOrm(NameVersion value);

  /**
   * Returns the value of the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database</em>' containment reference.
   * @see #setDatabase(Database)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getInfrastructureBlock_Database()
   * @model containment="true"
   * @generated
   */
  Database getDatabase();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock#getDatabase <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database</em>' containment reference.
   * @see #getDatabase()
   * @generated
   */
  void setDatabase(Database value);

} // InfrastructureBlock
