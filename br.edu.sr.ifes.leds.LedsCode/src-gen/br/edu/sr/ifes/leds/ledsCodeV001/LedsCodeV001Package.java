/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
   * The feature id for the '<em><b>Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEDS_CODE_DSL__APPLICATION = 0;

  /**
   * The number of structural features of the '<em>Leds Code DSL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEDS_CODE_DSL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 1;

  /**
   * The feature id for the '<em><b>Name Application</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME_APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Language</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__LANGUAGE = 1;

  /**
   * The feature id for the '<em><b>Framework</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__FRAMEWORK = 2;

  /**
   * The feature id for the '<em><b>Orm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__ORM = 3;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__DATABASE = 4;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.NameApplicationImpl <em>Name Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.NameApplicationImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getNameApplication()
   * @generated
   */
  int NAME_APPLICATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_APPLICATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Name Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_APPLICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.LanguageImpl <em>Language</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LanguageImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getLanguage()
   * @generated
   */
  int LANGUAGE = 3;

  /**
   * The number of structural features of the '<em>Language</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.FrameworkImpl <em>Framework</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.FrameworkImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getFramework()
   * @generated
   */
  int FRAMEWORK = 4;

  /**
   * The number of structural features of the '<em>Framework</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAMEWORK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ORMImpl <em>ORM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ORMImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getORM()
   * @generated
   */
  int ORM = 5;

  /**
   * The number of structural features of the '<em>ORM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DataBaseImpl <em>Data Base</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.DataBaseImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getDataBase()
   * @generated
   */
  int DATA_BASE = 6;

  /**
   * The number of structural features of the '<em>Data Base</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_BASE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DictionaryImpl <em>Dictionary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.DictionaryImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getDictionary()
   * @generated
   */
  int DICTIONARY = 7;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY__ELEMENTS = LANGUAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dictionary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_FEATURE_COUNT = LANGUAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.KeyValueImpl <em>Key Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.KeyValueImpl
   * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getKeyValue()
   * @generated
   */
  int KEY_VALUE = 8;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Key Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_VALUE_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Application</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL#getApplication()
   * @see #getLedsCodeDSL()
   * @generated
   */
  EReference getLedsCodeDSL_Application();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getNameApplication <em>Name Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Application</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Application#getNameApplication()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_NameApplication();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Language</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Application#getLanguage()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Language();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getFramework <em>Framework</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Framework</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Application#getFramework()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Framework();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getOrm <em>Orm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Orm</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Application#getOrm()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Orm();

  /**
   * Returns the meta object for the containment reference '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application#getDatabase <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Application#getDatabase()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Database();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.NameApplication <em>Name Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Application</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.NameApplication
   * @generated
   */
  EClass getNameApplication();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.NameApplication#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.NameApplication#getName()
   * @see #getNameApplication()
   * @generated
   */
  EAttribute getNameApplication_Name();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Language
   * @generated
   */
  EClass getLanguage();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Framework <em>Framework</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Framework</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Framework
   * @generated
   */
  EClass getFramework();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ORM <em>ORM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ORM</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ORM
   * @generated
   */
  EClass getORM();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.DataBase <em>Data Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Base</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DataBase
   * @generated
   */
  EClass getDataBase();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Dictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dictionary</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Dictionary
   * @generated
   */
  EClass getDictionary();

  /**
   * Returns the meta object for the containment reference list '{@link br.edu.sr.ifes.leds.ledsCodeV001.Dictionary#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Dictionary#getElements()
   * @see #getDictionary()
   * @generated
   */
  EReference getDictionary_Elements();

  /**
   * Returns the meta object for class '{@link br.edu.sr.ifes.leds.ledsCodeV001.KeyValue <em>Key Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.KeyValue
   * @generated
   */
  EClass getKeyValue();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.KeyValue#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.KeyValue#getKey()
   * @see #getKeyValue()
   * @generated
   */
  EAttribute getKeyValue_Key();

  /**
   * Returns the meta object for the attribute '{@link br.edu.sr.ifes.leds.ledsCodeV001.KeyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.KeyValue#getValue()
   * @see #getKeyValue()
   * @generated
   */
  EAttribute getKeyValue_Value();

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
     * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEDS_CODE_DSL__APPLICATION = eINSTANCE.getLedsCodeDSL_Application();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ApplicationImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name Application</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__NAME_APPLICATION = eINSTANCE.getApplication_NameApplication();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__LANGUAGE = eINSTANCE.getApplication_Language();

    /**
     * The meta object literal for the '<em><b>Framework</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__FRAMEWORK = eINSTANCE.getApplication_Framework();

    /**
     * The meta object literal for the '<em><b>Orm</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__ORM = eINSTANCE.getApplication_Orm();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__DATABASE = eINSTANCE.getApplication_Database();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.NameApplicationImpl <em>Name Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.NameApplicationImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getNameApplication()
     * @generated
     */
    EClass NAME_APPLICATION = eINSTANCE.getNameApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_APPLICATION__NAME = eINSTANCE.getNameApplication_Name();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.LanguageImpl <em>Language</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LanguageImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getLanguage()
     * @generated
     */
    EClass LANGUAGE = eINSTANCE.getLanguage();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.FrameworkImpl <em>Framework</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.FrameworkImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getFramework()
     * @generated
     */
    EClass FRAMEWORK = eINSTANCE.getFramework();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.ORMImpl <em>ORM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.ORMImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getORM()
     * @generated
     */
    EClass ORM = eINSTANCE.getORM();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DataBaseImpl <em>Data Base</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.DataBaseImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getDataBase()
     * @generated
     */
    EClass DATA_BASE = eINSTANCE.getDataBase();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.DictionaryImpl <em>Dictionary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.DictionaryImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getDictionary()
     * @generated
     */
    EClass DICTIONARY = eINSTANCE.getDictionary();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICTIONARY__ELEMENTS = eINSTANCE.getDictionary_Elements();

    /**
     * The meta object literal for the '{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.KeyValueImpl <em>Key Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.KeyValueImpl
     * @see br.edu.sr.ifes.leds.ledsCodeV001.impl.LedsCodeV001PackageImpl#getKeyValue()
     * @generated
     */
    EClass KEY_VALUE = eINSTANCE.getKeyValue();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_VALUE__KEY = eINSTANCE.getKeyValue_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY_VALUE__VALUE = eINSTANCE.getKeyValue_Value();

  }

} //LedsCodeV001Package
