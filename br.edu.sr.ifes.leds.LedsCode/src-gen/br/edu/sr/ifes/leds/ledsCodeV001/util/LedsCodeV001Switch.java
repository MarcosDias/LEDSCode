/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.util;

import br.edu.sr.ifes.leds.ledsCodeV001.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package
 * @generated
 */
public class LedsCodeV001Switch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LedsCodeV001Package modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LedsCodeV001Switch()
  {
    if (modelPackage == null)
    {
      modelPackage = LedsCodeV001Package.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LedsCodeV001Package.LEDS_CODE_DSL:
      {
        LedsCodeDSL ledsCodeDSL = (LedsCodeDSL)theEObject;
        T result = caseLedsCodeDSL(ledsCodeDSL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.PROJECT:
      {
        Project project = (Project)theEObject;
        T result = caseProject(project);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.INTERFACE_BLOCK:
      {
        InterfaceBlock interfaceBlock = (InterfaceBlock)theEObject;
        T result = caseInterfaceBlock(interfaceBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.INTERFACE_APPLICATION:
      {
        InterfaceApplication interfaceApplication = (InterfaceApplication)theEObject;
        T result = caseInterfaceApplication(interfaceApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.INFRASTRUCTURE_BLOCK:
      {
        InfrastructureBlock infrastructureBlock = (InfrastructureBlock)theEObject;
        T result = caseInfrastructureBlock(infrastructureBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.DATABASE:
      {
        Database database = (Database)theEObject;
        T result = caseDatabase(database);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.NAME_VERSION:
      {
        NameVersion nameVersion = (NameVersion)theEObject;
        T result = caseNameVersion(nameVersion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.APPLICATION_BLOCK:
      {
        ApplicationBlock applicationBlock = (ApplicationBlock)theEObject;
        T result = caseApplicationBlock(applicationBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.DOMAIN_BLOCK:
      {
        DomainBlock domainBlock = (DomainBlock)theEObject;
        T result = caseDomainBlock(domainBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.SERVICE_BLOCK:
      {
        ServiceBlock serviceBlock = (ServiceBlock)theEObject;
        T result = caseServiceBlock(serviceBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.SERVICE_METHOD:
      {
        ServiceMethod serviceMethod = (ServiceMethod)theEObject;
        T result = caseServiceMethod(serviceMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.ENTITY_BLOCK:
      {
        EntityBlock entityBlock = (EntityBlock)theEObject;
        T result = caseEntityBlock(entityBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.REPOSITORY:
      {
        Repository repository = (Repository)theEObject;
        T result = caseRepository(repository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.REPOSITORY_FIELDS:
      {
        RepositoryFields repositoryFields = (RepositoryFields)theEObject;
        T result = caseRepositoryFields(repositoryFields);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.ENUM_BLOCK:
      {
        EnumBlock enumBlock = (EnumBlock)theEObject;
        T result = caseEnumBlock(enumBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.METHOD_PARAMETER:
      {
        MethodParameter methodParameter = (MethodParameter)theEObject;
        T result = caseMethodParameter(methodParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.TYPE_AND_ATTRIBUTE:
      {
        TypeAndAttribute typeAndAttribute = (TypeAndAttribute)theEObject;
        T result = caseTypeAndAttribute(typeAndAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.EXTEND_BLOCK:
      {
        ExtendBlock extendBlock = (ExtendBlock)theEObject;
        T result = caseExtendBlock(extendBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.ACCESS_MODIFIER:
      {
        AccessModifier accessModifier = (AccessModifier)theEObject;
        T result = caseAccessModifier(accessModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leds Code DSL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leds Code DSL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLedsCodeDSL(LedsCodeDSL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProject(Project object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceBlock(InterfaceBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceApplication(InterfaceApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInfrastructureBlock(InfrastructureBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabase(Database object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameVersion(NameVersion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationBlock(ApplicationBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainBlock(DomainBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceBlock(ServiceBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceMethod(ServiceMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityBlock(EntityBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepository(Repository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository Fields</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository Fields</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepositoryFields(RepositoryFields object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumBlock(EnumBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodParameter(MethodParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type And Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type And Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeAndAttribute(TypeAndAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extend Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extend Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtendBlock(ExtendBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessModifier(AccessModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LedsCodeV001Switch
