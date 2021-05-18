/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.unb.grupo10.oberon.oberon.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.unb.grupo10.oberon.oberon.OberonPackage;
import org.unb.grupo10.oberon.oberon.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unb.grupo10.oberon.oberon.impl.OperationImpl#getOperationRelacional <em>Operation Relacional</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.impl.OperationImpl#getOperationAritmetic <em>Operation Aritmetic</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.impl.OperationImpl#getOperationLogic <em>Operation Logic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation
{
  /**
   * The default value of the '{@link #getOperationRelacional() <em>Operation Relacional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationRelacional()
   * @generated
   * @ordered
   */
  protected static final String OPERATION_RELACIONAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperationRelacional() <em>Operation Relacional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationRelacional()
   * @generated
   * @ordered
   */
  protected String operationRelacional = OPERATION_RELACIONAL_EDEFAULT;

  /**
   * The default value of the '{@link #getOperationAritmetic() <em>Operation Aritmetic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationAritmetic()
   * @generated
   * @ordered
   */
  protected static final String OPERATION_ARITMETIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperationAritmetic() <em>Operation Aritmetic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationAritmetic()
   * @generated
   * @ordered
   */
  protected String operationAritmetic = OPERATION_ARITMETIC_EDEFAULT;

  /**
   * The default value of the '{@link #getOperationLogic() <em>Operation Logic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationLogic()
   * @generated
   * @ordered
   */
  protected static final String OPERATION_LOGIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperationLogic() <em>Operation Logic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationLogic()
   * @generated
   * @ordered
   */
  protected String operationLogic = OPERATION_LOGIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return OberonPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperationRelacional()
  {
    return operationRelacional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperationRelacional(String newOperationRelacional)
  {
    String oldOperationRelacional = operationRelacional;
    operationRelacional = newOperationRelacional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.OPERATION__OPERATION_RELACIONAL, oldOperationRelacional, operationRelacional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperationAritmetic()
  {
    return operationAritmetic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperationAritmetic(String newOperationAritmetic)
  {
    String oldOperationAritmetic = operationAritmetic;
    operationAritmetic = newOperationAritmetic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.OPERATION__OPERATION_ARITMETIC, oldOperationAritmetic, operationAritmetic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperationLogic()
  {
    return operationLogic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperationLogic(String newOperationLogic)
  {
    String oldOperationLogic = operationLogic;
    operationLogic = newOperationLogic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.OPERATION__OPERATION_LOGIC, oldOperationLogic, operationLogic));
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
      case OberonPackage.OPERATION__OPERATION_RELACIONAL:
        return getOperationRelacional();
      case OberonPackage.OPERATION__OPERATION_ARITMETIC:
        return getOperationAritmetic();
      case OberonPackage.OPERATION__OPERATION_LOGIC:
        return getOperationLogic();
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
      case OberonPackage.OPERATION__OPERATION_RELACIONAL:
        setOperationRelacional((String)newValue);
        return;
      case OberonPackage.OPERATION__OPERATION_ARITMETIC:
        setOperationAritmetic((String)newValue);
        return;
      case OberonPackage.OPERATION__OPERATION_LOGIC:
        setOperationLogic((String)newValue);
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
      case OberonPackage.OPERATION__OPERATION_RELACIONAL:
        setOperationRelacional(OPERATION_RELACIONAL_EDEFAULT);
        return;
      case OberonPackage.OPERATION__OPERATION_ARITMETIC:
        setOperationAritmetic(OPERATION_ARITMETIC_EDEFAULT);
        return;
      case OberonPackage.OPERATION__OPERATION_LOGIC:
        setOperationLogic(OPERATION_LOGIC_EDEFAULT);
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
      case OberonPackage.OPERATION__OPERATION_RELACIONAL:
        return OPERATION_RELACIONAL_EDEFAULT == null ? operationRelacional != null : !OPERATION_RELACIONAL_EDEFAULT.equals(operationRelacional);
      case OberonPackage.OPERATION__OPERATION_ARITMETIC:
        return OPERATION_ARITMETIC_EDEFAULT == null ? operationAritmetic != null : !OPERATION_ARITMETIC_EDEFAULT.equals(operationAritmetic);
      case OberonPackage.OPERATION__OPERATION_LOGIC:
        return OPERATION_LOGIC_EDEFAULT == null ? operationLogic != null : !OPERATION_LOGIC_EDEFAULT.equals(operationLogic);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (OperationRelacional: ");
    result.append(operationRelacional);
    result.append(", OperationAritmetic: ");
    result.append(operationAritmetic);
    result.append(", OperationLogic: ");
    result.append(operationLogic);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
