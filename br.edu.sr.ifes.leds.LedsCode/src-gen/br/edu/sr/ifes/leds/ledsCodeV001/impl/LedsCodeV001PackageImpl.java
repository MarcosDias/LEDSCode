/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeDSL;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Factory;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LedsCodeV001PackageImpl extends EPackageImpl implements LedsCodeV001Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ledsCodeDSLEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package#eNS_URI
   * @see #init()
   * @generated
   */
  private LedsCodeV001PackageImpl()
  {
    super(eNS_URI, LedsCodeV001Factory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LedsCodeV001Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LedsCodeV001Package init()
  {
    if (isInited) return (LedsCodeV001Package)EPackage.Registry.INSTANCE.getEPackage(LedsCodeV001Package.eNS_URI);

    // Obtain or create and register package
    LedsCodeV001PackageImpl theLedsCodeV001Package = (LedsCodeV001PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LedsCodeV001PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LedsCodeV001PackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLedsCodeV001Package.createPackageContents();

    // Initialize created meta-data
    theLedsCodeV001Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLedsCodeV001Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LedsCodeV001Package.eNS_URI, theLedsCodeV001Package);
    return theLedsCodeV001Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLedsCodeDSL()
  {
    return ledsCodeDSLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLedsCodeDSL_Project()
  {
    return (EAttribute)ledsCodeDSLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LedsCodeV001Factory getLedsCodeV001Factory()
  {
    return (LedsCodeV001Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    ledsCodeDSLEClass = createEClass(LEDS_CODE_DSL);
    createEAttribute(ledsCodeDSLEClass, LEDS_CODE_DSL__PROJECT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(ledsCodeDSLEClass, LedsCodeDSL.class, "LedsCodeDSL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLedsCodeDSL_Project(), ecorePackage.getEString(), "project", null, 0, 1, LedsCodeDSL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LedsCodeV001PackageImpl
