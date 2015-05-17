/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Factory
 * @model kind="package"
 * @generated
 */
public interface LedsCodeV001Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ledsCodeV001";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.edu.br/sr/ifes/leds/LedsCodeV001";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ledsCodeV001";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LedsCodeV001Package eINSTANCE = br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl.init();

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeDSLImpl <em>Leds Code DSL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeDSLImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getLedsCodeDSL()
   * @generated
   */
  int LEDS_CODE_DSL = 0;

  /**
   * The feature id for the '<em><b>Project</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEDS_CODE_DSL__PROJECT = 0;

  /**
   * The number of structural features of the '<em>Leds Code DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEDS_CODE_DSL_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL <em>Leds Code DSL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leds Code DSL</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL
   * @generated
   */
  EClass getLedsCodeDSL();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL#getProject()
   * @see #getLedsCodeDSL()
   * @generated
   */
  EAttribute getLedsCodeDSL_Project();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LedsCodeV001Factory getLedsCodeV001Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeDSLImpl <em>Leds Code DSL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeDSLImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getLedsCodeDSL()
     * @generated
     */
    EClass LEDS_CODE_DSL = eINSTANCE.getLedsCodeDSL();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEDS_CODE_DSL__PROJECT = eINSTANCE.getLedsCodeDSL_Project();

  }

} //LedsCodeV001Package
