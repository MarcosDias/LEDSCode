/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leds Code DSL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL#getProject <em>Project</em>}</li>
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
   * Returns the value of the '<em><b>Project</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.sr.ifes.leds.ledsCodeV001.Project}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project</em>' containment reference list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getLedsCodeDSL_Project()
   * @model containment="true"
   * @generated
   */
  EList<Project> getProject();

} // LedsCodeDSL
