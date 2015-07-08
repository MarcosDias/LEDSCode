/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod#getMethodAcess <em>Method Acess</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getServiceMethod()
 * @model
 * @generated
 */
public interface ServiceMethod extends EObject
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
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getServiceMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Method Acess</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Acess</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Acess</em>' attribute.
   * @see #setMethodAcess(String)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getServiceMethod_MethodAcess()
   * @model
   * @generated
   */
  String getMethodAcess();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod#getMethodAcess <em>Method Acess</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Acess</em>' attribute.
   * @see #getMethodAcess()
   * @generated
   */
  void setMethodAcess(String value);

} // ServiceMethod
