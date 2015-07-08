/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;
import br.edu.sr.ifes.leds.ledsCodeV001.MethodParameter;
import br.edu.sr.ifes.leds.ledsCodeV001.RepositoryFields;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Fields</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryFieldsImpl#getNameMethod <em>Name Method</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryFieldsImpl#getMethodsParameters <em>Methods Parameters</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.RepositoryFieldsImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryFieldsImpl extends MinimalEObjectImpl.Container implements RepositoryFields
{
  /**
   * The default value of the '{@link #getNameMethod() <em>Name Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameMethod()
   * @generated
   * @ordered
   */
  protected static final String NAME_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNameMethod() <em>Name Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNameMethod()
   * @generated
   * @ordered
   */
  protected String nameMethod = NAME_METHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getMethodsParameters() <em>Methods Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodsParameters()
   * @generated
   * @ordered
   */
  protected MethodParameter methodsParameters;

  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final String RETURN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected String returnType = RETURN_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryFieldsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LedsCodeV001Package.Literals.REPOSITORY_FIELDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNameMethod()
  {
    return nameMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNameMethod(String newNameMethod)
  {
    String oldNameMethod = nameMethod;
    nameMethod = newNameMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.REPOSITORY_FIELDS__NAME_METHOD, oldNameMethod, nameMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodParameter getMethodsParameters()
  {
    return methodsParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodsParameters(MethodParameter newMethodsParameters, NotificationChain msgs)
  {
    MethodParameter oldMethodsParameters = methodsParameters;
    methodsParameters = newMethodsParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.REPOSITORY_FIELDS__METHODS_PARAMETERS, oldMethodsParameters, newMethodsParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodsParameters(MethodParameter newMethodsParameters)
  {
    if (newMethodsParameters != methodsParameters)
    {
      NotificationChain msgs = null;
      if (methodsParameters != null)
        msgs = ((InternalEObject)methodsParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.REPOSITORY_FIELDS__METHODS_PARAMETERS, null, msgs);
      if (newMethodsParameters != null)
        msgs = ((InternalEObject)newMethodsParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LedsCodeV001Package.REPOSITORY_FIELDS__METHODS_PARAMETERS, null, msgs);
      msgs = basicSetMethodsParameters(newMethodsParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.REPOSITORY_FIELDS__METHODS_PARAMETERS, newMethodsParameters, newMethodsParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(String newReturnType)
  {
    String oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.REPOSITORY_FIELDS__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LedsCodeV001Package.REPOSITORY_FIELDS__METHODS_PARAMETERS:
        return basicSetMethodsParameters(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LedsCodeV001Package.REPOSITORY_FIELDS__NAME_METHOD:
        return getNameMethod();
      case LedsCodeV001Package.REPOSITORY_FIELDS__METHODS_PARAMETERS:
        return getMethodsParameters();
      case LedsCodeV001Package.REPOSITORY_FIELDS__RETURN_TYPE:
        return getReturnType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LedsCodeV001Package.REPOSITORY_FIELDS__NAME_METHOD:
        setNameMethod((String)newValue);
        return;
      case LedsCodeV001Package.REPOSITORY_FIELDS__METHODS_PARAMETERS:
        setMethodsParameters((MethodParameter)newValue);
        return;
      case LedsCodeV001Package.REPOSITORY_FIELDS__RETURN_TYPE:
        setReturnType((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LedsCodeV001Package.REPOSITORY_FIELDS__NAME_METHOD:
        setNameMethod(NAME_METHOD_EDEFAULT);
        return;
      case LedsCodeV001Package.REPOSITORY_FIELDS__METHODS_PARAMETERS:
        setMethodsParameters((MethodParameter)null);
        return;
      case LedsCodeV001Package.REPOSITORY_FIELDS__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LedsCodeV001Package.REPOSITORY_FIELDS__NAME_METHOD:
        return NAME_METHOD_EDEFAULT == null ? nameMethod != null : !NAME_METHOD_EDEFAULT.equals(nameMethod);
      case LedsCodeV001Package.REPOSITORY_FIELDS__METHODS_PARAMETERS:
        return methodsParameters != null;
      case LedsCodeV001Package.REPOSITORY_FIELDS__RETURN_TYPE:
        return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nameMethod: ");
    result.append(nameMethod);
    result.append(", returnType: ");
    result.append(returnType);
    result.append(')');
    return result.toString();
  }

} //RepositoryFieldsImpl
