/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.NameVersion#getNameValue <em>Name Value</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.NameVersion#getVersionValue <em>Version Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getNameVersion()
 * @model
 * @generated
 */
public interface NameVersion extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Value</em>' attribute.
   * @see #setNameValue(String)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getNameVersion_NameValue()
   * @model
   * @generated
   */
  String getNameValue();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.NameVersion#getNameValue <em>Name Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Value</em>' attribute.
   * @see #getNameValue()
   * @generated
   */
  void setNameValue(String value);

  /**
   * Returns the value of the '<em><b>Version Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version Value</em>' attribute.
   * @see #setVersionValue(String)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getNameVersion_VersionValue()
   * @model
   * @generated
   */
  String getVersionValue();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.NameVersion#getVersionValue <em>Version Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version Value</em>' attribute.
   * @see #getVersionValue()
   * @generated
   */
  void setVersionValue(String value);

} // NameVersion
