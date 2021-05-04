/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.unb.grupo10.oberon.oberon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unb.grupo10.oberon.oberon.Operation#getOperationRelacional <em>Operation Relacional</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.Operation#getOperationAritmetic <em>Operation Aritmetic</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.Operation#getOperationLogic <em>Operation Logic</em>}</li>
 * </ul>
 *
 * @see org.unb.grupo10.oberon.oberon.OberonPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation Relacional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Relacional</em>' attribute.
   * @see #setOperationRelacional(String)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getOperation_OperationRelacional()
   * @model
   * @generated
   */
  String getOperationRelacional();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.Operation#getOperationRelacional <em>Operation Relacional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Relacional</em>' attribute.
   * @see #getOperationRelacional()
   * @generated
   */
  void setOperationRelacional(String value);

  /**
   * Returns the value of the '<em><b>Operation Aritmetic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Aritmetic</em>' attribute.
   * @see #setOperationAritmetic(String)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getOperation_OperationAritmetic()
   * @model
   * @generated
   */
  String getOperationAritmetic();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.Operation#getOperationAritmetic <em>Operation Aritmetic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Aritmetic</em>' attribute.
   * @see #getOperationAritmetic()
   * @generated
   */
  void setOperationAritmetic(String value);

  /**
   * Returns the value of the '<em><b>Operation Logic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Logic</em>' attribute.
   * @see #setOperationLogic(String)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getOperation_OperationLogic()
   * @model
   * @generated
   */
  String getOperationLogic();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.Operation#getOperationLogic <em>Operation Logic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Logic</em>' attribute.
   * @see #getOperationLogic()
   * @generated
   */
  void setOperationLogic(String value);

} // Operation
