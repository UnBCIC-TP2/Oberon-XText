/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.unb.grupo10.oberon.oberon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unb.grupo10.oberon.oberon.Block#getStmt <em>Stmt</em>}</li>
 * </ul>
 *
 * @see org.unb.grupo10.oberon.oberon.OberonPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject
{
  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference list.
   * The list contents are of type {@link org.unb.grupo10.oberon.oberon.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference list.
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getBlock_Stmt()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStmt();

} // Block
