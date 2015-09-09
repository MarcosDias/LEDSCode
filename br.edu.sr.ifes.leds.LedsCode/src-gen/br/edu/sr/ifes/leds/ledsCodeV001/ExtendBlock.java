/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getExtendBlock()
 * @model
 * @generated
 */
public interface ExtendBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' reference list.
   * The list contents are of type {@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' reference list.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#getExtendBlock_Values()
   * @model
   * @generated
   */
  EList<EntityBlock> getValues();

} // ExtendBlock
