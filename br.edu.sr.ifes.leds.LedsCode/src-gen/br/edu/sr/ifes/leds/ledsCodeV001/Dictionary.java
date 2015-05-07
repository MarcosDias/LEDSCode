/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Dictionary#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getDictionary()
 * @model
 * @generated
 */
public interface Dictionary extends Language, Framework, ORM, DataBase
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.sr.ifes.leds.ledsCodeV001.KeyValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getDictionary_Elements()
   * @model containment="true"
   * @generated
   */
  EList<KeyValue> getElements();

} // Dictionary
