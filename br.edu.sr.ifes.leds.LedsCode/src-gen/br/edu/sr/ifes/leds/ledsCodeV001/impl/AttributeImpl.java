/**
 */
package br.edu.sr.ifes.leds.ledsCodeV001.impl;

import br.edu.sr.ifes.leds.ledsCodeV001.Attribute;
import br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#getAcessModifier <em>Acess Modifier</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#isPk <em>Pk</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link br.edu.sr.ifes.leds.ledsCodeV001.impl.AttributeImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The default value of the '{@link #getAcessModifier() <em>Acess Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcessModifier()
   * @generated
   * @ordered
   */
  protected static final String ACESS_MODIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAcessModifier() <em>Acess Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcessModifier()
   * @generated
   * @ordered
   */
  protected String acessModifier = ACESS_MODIFIER_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isPk() <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPk()
   * @generated
   * @ordered
   */
  protected static final boolean PK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPk() <em>Pk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPk()
   * @generated
   * @ordered
   */
  protected boolean pk = PK_EDEFAULT;

  /**
   * The default value of the '{@link #getUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnique()
   * @generated
   * @ordered
   */
  protected static final String UNIQUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnique()
   * @generated
   * @ordered
   */
  protected String unique = UNIQUE_EDEFAULT;

  /**
   * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullable()
   * @generated
   * @ordered
   */
  protected static final String NULLABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNullable()
   * @generated
   * @ordered
   */
  protected String nullable = NULLABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final Integer MIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected Integer min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final Integer MAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected Integer max = MAX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return LedsCodeV001Package.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAcessModifier()
  {
    return acessModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcessModifier(String newAcessModifier)
  {
    String oldAcessModifier = acessModifier;
    acessModifier = newAcessModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER, oldAcessModifier, acessModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPk()
  {
    return pk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPk(boolean newPk)
  {
    boolean oldPk = pk;
    pk = newPk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__PK, oldPk, pk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnique()
  {
    return unique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnique(String newUnique)
  {
    String oldUnique = unique;
    unique = newUnique;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__UNIQUE, oldUnique, unique));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNullable()
  {
    return nullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(String newNullable)
  {
    String oldNullable = nullable;
    nullable = newNullable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__NULLABLE, oldNullable, nullable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(Integer newMin)
  {
    Integer oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(Integer newMax)
  {
    Integer oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LedsCodeV001Package.ATTRIBUTE__MAX, oldMax, max));
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
      case LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER:
        return getAcessModifier();
      case LedsCodeV001Package.ATTRIBUTE__TYPE:
        return getType();
      case LedsCodeV001Package.ATTRIBUTE__NAME:
        return getName();
      case LedsCodeV001Package.ATTRIBUTE__PK:
        return isPk();
      case LedsCodeV001Package.ATTRIBUTE__UNIQUE:
        return getUnique();
      case LedsCodeV001Package.ATTRIBUTE__NULLABLE:
        return getNullable();
      case LedsCodeV001Package.ATTRIBUTE__MIN:
        return getMin();
      case LedsCodeV001Package.ATTRIBUTE__MAX:
        return getMax();
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
      case LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER:
        setAcessModifier((String)newValue);
        return;
      case LedsCodeV001Package.ATTRIBUTE__TYPE:
        setType((String)newValue);
        return;
      case LedsCodeV001Package.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case LedsCodeV001Package.ATTRIBUTE__PK:
        setPk((Boolean)newValue);
        return;
      case LedsCodeV001Package.ATTRIBUTE__UNIQUE:
        setUnique((String)newValue);
        return;
      case LedsCodeV001Package.ATTRIBUTE__NULLABLE:
        setNullable((String)newValue);
        return;
      case LedsCodeV001Package.ATTRIBUTE__MIN:
        setMin((Integer)newValue);
        return;
      case LedsCodeV001Package.ATTRIBUTE__MAX:
        setMax((Integer)newValue);
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
      case LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER:
        setAcessModifier(ACESS_MODIFIER_EDEFAULT);
        return;
      case LedsCodeV001Package.ATTRIBUTE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LedsCodeV001Package.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LedsCodeV001Package.ATTRIBUTE__PK:
        setPk(PK_EDEFAULT);
        return;
      case LedsCodeV001Package.ATTRIBUTE__UNIQUE:
        setUnique(UNIQUE_EDEFAULT);
        return;
      case LedsCodeV001Package.ATTRIBUTE__NULLABLE:
        setNullable(NULLABLE_EDEFAULT);
        return;
      case LedsCodeV001Package.ATTRIBUTE__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case LedsCodeV001Package.ATTRIBUTE__MAX:
        setMax(MAX_EDEFAULT);
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
      case LedsCodeV001Package.ATTRIBUTE__ACESS_MODIFIER:
        return ACESS_MODIFIER_EDEFAULT == null ? acessModifier != null : !ACESS_MODIFIER_EDEFAULT.equals(acessModifier);
      case LedsCodeV001Package.ATTRIBUTE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case LedsCodeV001Package.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LedsCodeV001Package.ATTRIBUTE__PK:
        return pk != PK_EDEFAULT;
      case LedsCodeV001Package.ATTRIBUTE__UNIQUE:
        return UNIQUE_EDEFAULT == null ? unique != null : !UNIQUE_EDEFAULT.equals(unique);
      case LedsCodeV001Package.ATTRIBUTE__NULLABLE:
        return NULLABLE_EDEFAULT == null ? nullable != null : !NULLABLE_EDEFAULT.equals(nullable);
      case LedsCodeV001Package.ATTRIBUTE__MIN:
        return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
      case LedsCodeV001Package.ATTRIBUTE__MAX:
        return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
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
    result.append(" (acessModifier: ");
    result.append(acessModifier);
    result.append(", type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(", pk: ");
    result.append(pk);
    result.append(", unique: ");
    result.append(unique);
    result.append(", nullable: ");
    result.append(nullable);
    result.append(", min: ");
    result.append(min);
    result.append(", max: ");
    result.append(max);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
