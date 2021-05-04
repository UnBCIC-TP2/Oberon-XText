/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.unb.grupo10.oberon.oberon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unb.grupo10.oberon.oberon.UserTypeDeclaration#getNameType <em>Name Type</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.UserTypeDeclaration#getLength <em>Length</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.UserTypeDeclaration#getVartype <em>Vartype</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.UserTypeDeclaration#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see org.unb.grupo10.oberon.oberon.OberonPackage#getUserTypeDeclaration()
 * @model
 * @generated
 */
public interface UserTypeDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Type</em>' attribute.
   * @see #setNameType(String)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getUserTypeDeclaration_NameType()
   * @model
   * @generated
   */
  String getNameType();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.UserTypeDeclaration#getNameType <em>Name Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Type</em>' attribute.
   * @see #getNameType()
   * @generated
   */
  void setNameType(String value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getUserTypeDeclaration_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.UserTypeDeclaration#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

  /**
   * Returns the value of the '<em><b>Vartype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vartype</em>' containment reference.
   * @see #setVartype(OberonType)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getUserTypeDeclaration_Vartype()
   * @model containment="true"
   * @generated
   */
  OberonType getVartype();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.UserTypeDeclaration#getVartype <em>Vartype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vartype</em>' containment reference.
   * @see #getVartype()
   * @generated
   */
  void setVartype(OberonType value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link org.unb.grupo10.oberon.oberon.VarDeclaration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getUserTypeDeclaration_Vars()
   * @model containment="true"
   * @generated
   */
  EList<VarDeclaration> getVars();

} // UserTypeDeclaration