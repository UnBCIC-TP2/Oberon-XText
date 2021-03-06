/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.unb.grupo10.oberon.oberon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>else If Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.unb.grupo10.oberon.oberon.elseIfStmt#getCond <em>Cond</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.elseIfStmt#getStmt <em>Stmt</em>}</li>
 * </ul>
 *
 * @see org.unb.grupo10.oberon.oberon.OberonPackage#getelseIfStmt()
 * @model
 * @generated
 */
public interface elseIfStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expression)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getelseIfStmt_Cond()
   * @model containment="true"
   * @generated
   */
  Expression getCond();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.elseIfStmt#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expression value);

  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(Statement)
   * @see org.unb.grupo10.oberon.oberon.OberonPackage#getelseIfStmt_Stmt()
   * @model containment="true"
   * @generated
   */
  Statement getStmt();

  /**
   * Sets the value of the '{@link org.unb.grupo10.oberon.oberon.elseIfStmt#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(Statement value);

} // elseIfStmt
