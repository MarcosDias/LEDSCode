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
      public Adapter caseDatabase(Database object)
      {
        return createDatabaseAdapter();
      }
      @Override
      public Adapter caseNameVersion(NameVersion object)
      {
        return createNameVersionAdapter();
      }
      @Override
      public Adapter caseApplicationBlock(ApplicationBlock object)
      {
        return createApplicationBlockAdapter();
      }
      @Override
      public Adapter caseDomainBlock(DomainBlock object)
      {
        return createDomainBlockAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseServiceBlock(ServiceBlock object)
      {
        return createServiceBlockAdapter();
      }
      @Override
      public Adapter caseServiceMethod(ServiceMethod object)
      {
        return createServiceMethodAdapter();
      }
      @Override
      public Adapter caseEntityBlock(EntityBlock object)
      {
        return createEntityBlockAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseRepository(Repository object)
      {
        return createRepositoryAdapter();
      }
      @Override
      public Adapter caseRepositoryFields(RepositoryFields object)
      {
        return createRepositoryFieldsAdapter();
      }
      @Override
      public Adapter caseEnumBlock(EnumBlock object)
      {
        return createEnumBlockAdapter();
      }
      @Override
      public Adapter caseMethodParameter(MethodParameter object)
      {
        return createMethodParameterAdapter();
      }
      @Override
      public Adapter caseTypeAndAttribute(TypeAndAttribute object)
      {
        return createTypeAndAttributeAdapter();
      }
      @Override
      public Adapter caseExtendBlock(ExtendBlock object)
      {
        return createExtendBlockAdapter();
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
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Database <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Database
   * @generated
   */
  public Adapter createDatabaseAdapter()
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
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock <em>Application Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ApplicationBlock
   * @generated
   */
  public Adapter createApplicationBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock <em>Domain Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.DomainBlock
   * @generated
   */
  public Adapter createDomainBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock <em>Service Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ServiceBlock
   * @generated
   */
  public Adapter createServiceBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod <em>Service Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ServiceMethod
   * @generated
   */
  public Adapter createServiceMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock <em>Entity Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EntityBlock
   * @generated
   */
  public Adapter createEntityBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.Repository <em>Repository</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.Repository
   * @generated
   */
  public Adapter createRepositoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields <em>Repository Fields</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields
   * @generated
   */
  public Adapter createRepositoryFieldsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock <em>Enum Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.EnumBlock
   * @generated
   */
  public Adapter createEnumBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter <em>Method Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter
   * @generated
   */
  public Adapter createMethodParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute <em>Type And Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.TypeAndAttribute
   * @generated
   */
  public Adapter createTypeAndAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock <em>Extend Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.edu.sr.ifes.leds.ledsCodeV001.ExtendBlock
   * @generated
   */
  public Adapter createExtendBlockAdapter()
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
