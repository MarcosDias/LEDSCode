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
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter caseInterfaceBlock(InterfaceBlock object)
      {
        return createInterfaceBlockAdapter();
      }
      @Override
      public Adapter caseInterfaceApplication(InterfaceApplication object)
      {
        return createInterfaceApplicationAdapter();
      }
      @Override
      public Adapter caseInfrastructureBlock(InfrastructureBlock object)
      {
        return createInfrastructureBlockAdapter();
      }
      @Override
      public Adapter caseDatabaseBlock(DatabaseBlock object)
      {
        return createDatabaseBlockAdapter();
      }
      @Override
      public Adapter caseNameVersion(NameVersion object)
      {
        return createNameVersionAdapter();
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
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock <em>Interface Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InterfaceBlock
   * @generated
   */
  public Adapter createInterfaceBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication <em>Interface Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InterfaceApplication
   * @generated
   */
  public Adapter createInterfaceApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock <em>Infrastructure Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.InfrastructureBlock
   * @generated
   */
  public Adapter createInfrastructureBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock <em>Database Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DatabaseBlock
   * @generated
   */
  public Adapter createDatabaseBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.NameVersion <em>Name Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.NameVersion
   * @generated
   */
  public Adapter createNameVersionAdapter()
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
