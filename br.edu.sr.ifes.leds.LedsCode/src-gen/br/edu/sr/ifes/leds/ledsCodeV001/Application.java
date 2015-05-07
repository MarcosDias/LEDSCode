/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getNameApplication <em>Name Application</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getLanguage <em>Language</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getFramework <em>Framework</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getOrm <em>Orm</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Application</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Application</em>' containment reference.
   * @see #setNameApplication(NameApplication)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getApplication_NameApplication()
   * @model containment="true"
   * @generated
   */
  NameApplication getNameApplication();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getNameApplication <em>Name Application</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Application</em>' containment reference.
   * @see #getNameApplication()
   * @generated
   */
  void setNameApplication(NameApplication value);

  /**
   * Returns the value of the '<em><b>Language</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language</em>' containment reference.
   * @see #setLanguage(Language)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getApplication_Language()
   * @model containment="true"
   * @generated
   */
  Language getLanguage();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getLanguage <em>Language</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' containment reference.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(Language value);

  /**
   * Returns the value of the '<em><b>Framework</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Framework</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Framework</em>' containment reference.
   * @see #setFramework(Framework)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getApplication_Framework()
   * @model containment="true"
   * @generated
   */
  Framework getFramework();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getFramework <em>Framework</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Framework</em>' containment reference.
   * @see #getFramework()
   * @generated
   */
  void setFramework(Framework value);

  /**
   * Returns the value of the '<em><b>Orm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orm</em>' containment reference.
   * @see #setOrm(ORM)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getApplication_Orm()
   * @model containment="true"
   * @generated
   */
  ORM getOrm();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getOrm <em>Orm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orm</em>' containment reference.
   * @see #getOrm()
   * @generated
   */
  void setOrm(ORM value);

  /**
   * Returns the value of the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Database</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Database</em>' containment reference.
   * @see #setDatabase(DataBase)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getApplication_Database()
   * @model containment="true"
   * @generated
   */
  DataBase getDatabase();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getDatabase <em>Database</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Database</em>' containment reference.
   * @see #getDatabase()
   * @generated
   */
  void setDatabase(DataBase value);

} // Application
