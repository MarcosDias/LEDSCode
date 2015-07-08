/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter#getTypeAndAttr <em>Type And Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getMethodParameter()
 * @model
 * @generated
 */
public interface MethodParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Type And Attr</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type And Attr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type And Attr</em>' containment reference list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getMethodParameter_TypeAndAttr()
   * @model containment="true"
   * @generated
   */
  EList<TypeAndAttribute> getTypeAndAttr();

} // MethodParameter
