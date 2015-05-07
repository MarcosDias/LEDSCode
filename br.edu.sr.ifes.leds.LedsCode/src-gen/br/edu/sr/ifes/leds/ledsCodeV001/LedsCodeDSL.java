/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leds Code DSL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getLedsCodeDSL()
 * @model
 * @generated
 */
public interface LedsCodeDSL extends EObject
{
  /**
   * Returns the value of the '<em><b>Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application</em>' containment reference.
   * @see #setApplication(Application)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getLedsCodeDSL_Application()
   * @model containment="true"
   * @generated
   */
  Application getApplication();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL#getApplication <em>Application</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application</em>' containment reference.
   * @see #getApplication()
   * @generated
   */
  void setApplication(Application value);

} // LedsCodeDSL
