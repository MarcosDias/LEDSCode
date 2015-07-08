/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Module#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Module#getServiceBlock <em>Service Block</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Module#getEntityBlock <em>Entity Block</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Module#getEnumBlock <em>Enum Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
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
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Service Block</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Block</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Block</em>' containment reference list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getModule_ServiceBlock()
   * @model containment="true"
   * @generated
   */
  EList<ServiceBlock> getServiceBlock();

  /**
   * Returns the value of the '<em><b>Entity Block</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Block</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Block</em>' containment reference list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getModule_EntityBlock()
   * @model containment="true"
   * @generated
   */
  EList<EntityBlock> getEntityBlock();

  /**
   * Returns the value of the '<em><b>Enum Block</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Block</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Block</em>' containment reference list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getModule_EnumBlock()
   * @model containment="true"
   * @generated
   */
  EList<EnumBlock> getEnumBlock();

} // Module
