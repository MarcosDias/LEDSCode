/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LedsCodeV001FactoryImpl extends EFactoryImpl implements LedsCodeV001Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LedsCodeV001Factory init()
  {
    try
    {
      LedsCodeV001Factory theLedsCodeV001Factory = (LedsCodeV001Factory)EPackage.Registry.INSTANCE.getEFactory(LedsCodeV001Package.eNS_URI);
      if (theLedsCodeV001Factory != null)
      {
        return theLedsCodeV001Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LedsCodeV001FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LedsCodeV001FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LedsCodeV001Package.LEDS_CODE_DSL: return createLedsCodeDSL();
      case LedsCodeV001Package.APPLICATION: return createApplication();
      case LedsCodeV001Package.NAME_APPLICATION: return createNameApplication();
      case LedsCodeV001Package.LANGUAGE: return createLanguage();
      case LedsCodeV001Package.FRAMEWORK: return createFramework();
      case LedsCodeV001Package.ORM: return createORM();
      case LedsCodeV001Package.DATA_BASE: return createDataBase();
      case LedsCodeV001Package.DICTIONARY: return createDictionary();
      case LedsCodeV001Package.KEY_VALUE: return createKeyValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LedsCodeDSL createLedsCodeDSL()
  {
    LedsCodeDSLImpl ledsCodeDSL = new LedsCodeDSLImpl();
    return ledsCodeDSL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameApplication createNameApplication()
  {
    NameApplicationImpl nameApplication = new NameApplicationImpl();
    return nameApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Language createLanguage()
  {
    LanguageImpl language = new LanguageImpl();
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Framework createFramework()
  {
    FrameworkImpl framework = new FrameworkImpl();
    return framework;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ORM createORM()
  {
    ORMImpl orm = new ORMImpl();
    return orm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataBase createDataBase()
  {
    DataBaseImpl dataBase = new DataBaseImpl();
    return dataBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dictionary createDictionary()
  {
    DictionaryImpl dictionary = new DictionaryImpl();
    return dictionary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyValue createKeyValue()
  {
    KeyValueImpl keyValue = new KeyValueImpl();
    return keyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LedsCodeV001Package getLedsCodeV001Package()
  {
    return (LedsCodeV001Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LedsCodeV001Package getPackage()
  {
    return LedsCodeV001Package.eINSTANCE;
  }

} //LedsCodeV001FactoryImpl
