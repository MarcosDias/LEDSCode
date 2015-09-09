/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Fields</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getMethodsParameters <em>Methods Parameters</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getRepositoryFields()
 * @model
 * @generated
 */
public interface RepositoryFields extends EObject
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
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getRepositoryFields_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Methods Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods Parameters</em>' containment reference.
   * @see #setMethodsParameters(MethodParameter)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getRepositoryFields_MethodsParameters()
   * @model containment="true"
   * @generated
   */
  MethodParameter getMethodsParameters();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getMethodsParameters <em>Methods Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methods Parameters</em>' containment reference.
   * @see #getMethodsParameters()
   * @generated
   */
  void setMethodsParameters(MethodParameter value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' attribute.
   * @see #setReturnType(String)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getRepositoryFields_ReturnType()
   * @model
   * @generated
   */
  String getReturnType();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields#getReturnType <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' attribute.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(String value);

} // RepositoryFields
