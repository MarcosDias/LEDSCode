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
      case LedsCodeV001Package.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.NAME_APPLICATION:
      {
        NameApplication nameApplication = (NameApplication)theEObject;
        T result = caseNameApplication(nameApplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.LANGUAGE:
      {
        Language language = (Language)theEObject;
        T result = caseLanguage(language);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.FRAMEWORK:
      {
        Framework framework = (Framework)theEObject;
        T result = caseFramework(framework);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.ORM:
      {
        ORM orm = (ORM)theEObject;
        T result = caseORM(orm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.DATA_BASE:
      {
        DataBase dataBase = (DataBase)theEObject;
        T result = caseDataBase(dataBase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.DICTIONARY:
      {
        Dictionary dictionary = (Dictionary)theEObject;
        T result = caseDictionary(dictionary);
        if (result == null) result = caseLanguage(dictionary);
        if (result == null) result = caseFramework(dictionary);
        if (result == null) result = caseORM(dictionary);
        if (result == null) result = caseDataBase(dictionary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LedsCodeV001Package.KEY_VALUE:
      {
        KeyValue keyValue = (KeyValue)theEObject;
        T result = caseKeyValue(keyValue);
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
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameApplication(NameApplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguage(Language object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Framework</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Framework</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFramework(Framework object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ORM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ORM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseORM(ORM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataBase(DataBase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dictionary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dictionary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictionary(Dictionary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyValue(KeyValue object)
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
