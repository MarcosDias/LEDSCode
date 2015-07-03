/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock#getInterfaceApplication <em>Interface Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getInterfaceBlock()
 * @model
 * @generated
 */
public interface InterfaceBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getInterfaceBlock_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Interface Application</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Application</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Application</em>' containment reference list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getInterfaceBlock_InterfaceApplication()
   * @model containment="true"
   * @generated
   */
  EList<InterfaceApplication> getInterfaceApplication();

} // InterfaceBlock
