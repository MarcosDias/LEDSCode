/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getInfrastructureBlock <em>Infrastructure Block</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getInterfaceBlock <em>Interface Block</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getAppBlock <em>App Block</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getDomainBlock <em>Domain Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
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
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getProject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Infrastructure Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infrastructure Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infrastructure Block</em>' containment reference.
   * @see #setInfrastructureBlock(InfrastructureBlock)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getProject_InfrastructureBlock()
   * @model containment="true"
   * @generated
   */
  InfrastructureBlock getInfrastructureBlock();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getInfrastructureBlock <em>Infrastructure Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infrastructure Block</em>' containment reference.
   * @see #getInfrastructureBlock()
   * @generated
   */
  void setInfrastructureBlock(InfrastructureBlock value);

  /**
   * Returns the value of the '<em><b>Interface Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Block</em>' containment reference.
   * @see #setInterfaceBlock(InterfaceBlock)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getProject_InterfaceBlock()
   * @model containment="true"
   * @generated
   */
  InterfaceBlock getInterfaceBlock();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project#getInterfaceBlock <em>Interface Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Block</em>' containment reference.
   * @see #getInterfaceBlock()
   * @generated
   */
  void setInterfaceBlock(InterfaceBlock value);

  /**
   * Returns the value of the '<em><b>App Block</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>App Block</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>App Block</em>' attribute list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getProject_AppBlock()
   * @model unique="false"
   * @generated
   */
  EList<String> getAppBlock();

  /**
   * Returns the value of the '<em><b>Domain Block</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Block</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Block</em>' attribute list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getProject_DomainBlock()
   * @model unique="false"
   * @generated
   */
  EList<String> getDomainBlock();

} // Project
