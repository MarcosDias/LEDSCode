/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.util;

import br.edu.sr.ifes.leds.ledsCodeV001.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package
 * @generated
 */
public class LedsCodeV001AdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LedsCodeV001Package modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LedsCodeV001AdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LedsCodeV001Package.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LedsCodeV001Switch<Adapter> modelSwitch =
    new LedsCodeV001Switch<Adapter>()
    {
      @Override
      public Adapter caseLedsCodeDSL(LedsCodeDSL object)
      {
        return createLedsCodeDSLAdapter();
      }
      @Override
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseNameApplication(NameApplication object)
      {
        return createNameApplicationAdapter();
      }
      @Override
      public Adapter caseLanguage(Language object)
      {
        return createLanguageAdapter();
      }
      @Override
      public Adapter caseFramework(Framework object)
      {
        return createFrameworkAdapter();
      }
      @Override
      public Adapter caseORM(ORM object)
      {
        return createORMAdapter();
      }
      @Override
      public Adapter caseDataBase(DataBase object)
      {
        return createDataBaseAdapter();
      }
      @Override
      public Adapter caseDictionary(Dictionary object)
      {
        return createDictionaryAdapter();
      }
      @Override
      public Adapter caseKeyValue(KeyValue object)
      {
        return createKeyValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL <em>Leds Code DSL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL
   * @generated
   */
  public Adapter createLedsCodeDSLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.NameApplication <em>Name Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.NameApplication
   * @generated
   */
  public Adapter createNameApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Language
   * @generated
   */
  public Adapter createLanguageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Framework <em>Framework</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Framework
   * @generated
   */
  public Adapter createFrameworkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ORM <em>ORM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ORM
   * @generated
   */
  public Adapter createORMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.DataBase <em>Data Base</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DataBase
   * @generated
   */
  public Adapter createDataBaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Dictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Dictionary
   * @generated
   */
  public Adapter createDictionaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.KeyValue <em>Key Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.KeyValue
   * @generated
   */
  public Adapter createKeyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LedsCodeV001AdapterFactory
