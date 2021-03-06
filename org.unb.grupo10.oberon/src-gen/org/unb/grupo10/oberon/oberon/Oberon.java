/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.unb.grupo10.oberon.oberon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oberon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unb.grupo10.oberon.oberon.Oberon#getName <em>Name</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.Oberon#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.Oberon#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.unb.grupo10.oberon.oberon.OberonPackage#getOberon()
 * @model
 * @generated
 */
public interface Oberon extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getOberon_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.Oberon#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference.
   * @see #setDeclaration(Declarations)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getOberon_Declaration()
   * @model containment="true"
   * @generated
   */
  Declarations getDeclaration();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.Oberon#getDeclaration <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' containment reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(Declarations value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getOberon_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.Oberon#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // Oberon
