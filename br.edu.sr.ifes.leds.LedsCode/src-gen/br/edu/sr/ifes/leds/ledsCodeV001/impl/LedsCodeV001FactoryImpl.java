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
