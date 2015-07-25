/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getAcessModifier <em>Acess Modifier</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getClassExtends <em>Class Extends</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getEntityBlock()
 * @model
 * @generated
 */
public interface EntityBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Acess Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acess Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acess Modifier</em>' attribute.
   * @see #setAcessModifier(String)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getEntityBlock_AcessModifier()
   * @model
   * @generated
   */
  String getAcessModifier();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getAcessModifier <em>Acess Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acess Modifier</em>' attribute.
   * @see #getAcessModifier()
   * @generated
   */
  void setAcessModifier(String value);

  /**
   * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Abstract</em>' attribute.
   * @see #setIsAbstract(boolean)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getEntityBlock_IsAbstract()
   * @model
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#isIsAbstract <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Abstract</em>' attribute.
   * @see #isIsAbstract()
   * @generated
   */
  void setIsAbstract(boolean value);

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
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getEntityBlock_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Class Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Extends</em>' containment reference.
   * @see #setClassExtends(ExtendBlock)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getEntityBlock_ClassExtends()
   * @model containment="true"
   * @generated
   */
  ExtendBlock getClassExtends();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getClassExtends <em>Class Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Extends</em>' containment reference.
   * @see #getClassExtends()
   * @generated
   */
  void setClassExtends(ExtendBlock value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getEntityBlock_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Repository</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repository</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repository</em>' containment reference.
   * @see #setRepository(Repository)
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getEntityBlock_Repository()
   * @model containment="true"
   * @generated
   */
  Repository getRepository();

  /**
   * Sets the value of the '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock#getRepository <em>Repository</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository</em>' containment reference.
   * @see #getRepository()
   * @generated
   */
  void setRepository(Repository value);

} // EntityBlock
