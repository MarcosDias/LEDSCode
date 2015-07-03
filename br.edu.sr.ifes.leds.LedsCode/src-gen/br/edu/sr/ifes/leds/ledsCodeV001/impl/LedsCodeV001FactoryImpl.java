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
      case LedsCodeV001Package.PROJECT: return createProject();
      case LedsCodeV001Package.INTERFACE_BLOCK: return createInterfaceBlock();
      case LedsCodeV001Package.INTERFACE_APPLICATION: return createInterfaceApplication();
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK: return createInfrastructureBlock();
      case LedsCodeV001Package.DATABASE_BLOCK: return createDatabaseBlock();
      case LedsCodeV001Package.NAME_VERSION: return createNameVersion();
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
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceBlock createInterfaceBlock()
  {
    InterfaceBlockImpl interfaceBlock = new InterfaceBlockImpl();
    return interfaceBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceApplication createInterfaceApplication()
  {
    InterfaceApplicationImpl interfaceApplication = new InterfaceApplicationImpl();
    return interfaceApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfrastructureBlock createInfrastructureBlock()
  {
    InfrastructureBlockImpl infrastructureBlock = new InfrastructureBlockImpl();
    return infrastructureBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseBlock createDatabaseBlock()
  {
    DatabaseBlockImpl databaseBlock = new DatabaseBlockImpl();
    return databaseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameVersion createNameVersion()
  {
    NameVersionImpl nameVersion = new NameVersionImpl();
    return nameVersion;
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
