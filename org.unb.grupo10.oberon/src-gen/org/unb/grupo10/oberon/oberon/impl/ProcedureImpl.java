/**
 * generated by Xtext 2.26.0-SNAPSHOT
 */
package org.unb.grupo10.oberon.oberon.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.unb.grupo10.oberon.oberon.Block;
import org.unb.grupo10.oberon.oberon.Declarations;
import org.unb.grupo10.oberon.oberon.Formals;
import org.unb.grupo10.oberon.oberon.OberonPackage;
import org.unb.grupo10.oberon.oberon.OberonType;
import org.unb.grupo10.oberon.oberon.Procedure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.unb.grupo10.oberon.oberon.impl.ProcedureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.impl.ProcedureImpl#getFormals <em>Formals</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.impl.ProcedureImpl#getProcedureType <em>Procedure Type</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.impl.ProcedureImpl#getDecl <em>Decl</em>}</li>
 *   <li>{@link org.unb.grupo10.oberon.oberon.impl.ProcedureImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureImpl extends MinimalEObjectImpl.Container implements Procedure
{
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
   * The cached value of the '{@link #getFormals() <em>Formals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormals()
   * @generated
   * @ordered
   */
  protected Formals formals;

  /**
   * The cached value of the '{@link #getProcedureType() <em>Procedure Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedureType()
   * @generated
   * @ordered
   */
  protected OberonType procedureType;

  /**
   * The cached value of the '{@link #getDecl() <em>Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecl()
   * @generated
   * @ordered
   */
  protected Declarations decl;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected Block block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcedureImpl()
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
    return OberonPackage.Literals.PROCEDURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.PROCEDURE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Formals getFormals()
  {
    return formals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormals(Formals newFormals, NotificationChain msgs)
  {
    Formals oldFormals = formals;
    formals = newFormals;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OberonPackage.PROCEDURE__FORMALS, oldFormals, newFormals);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFormals(Formals newFormals)
  {
    if (newFormals != formals)
    {
      NotificationChain msgs = null;
      if (formals != null)
        msgs = ((InternalEObject)formals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OberonPackage.PROCEDURE__FORMALS, null, msgs);
      if (newFormals != null)
        msgs = ((InternalEObject)newFormals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OberonPackage.PROCEDURE__FORMALS, null, msgs);
      msgs = basicSetFormals(newFormals, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.PROCEDURE__FORMALS, newFormals, newFormals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OberonType getProcedureType()
  {
    return procedureType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcedureType(OberonType newProcedureType, NotificationChain msgs)
  {
    OberonType oldProcedureType = procedureType;
    procedureType = newProcedureType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OberonPackage.PROCEDURE__PROCEDURE_TYPE, oldProcedureType, newProcedureType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcedureType(OberonType newProcedureType)
  {
    if (newProcedureType != procedureType)
    {
      NotificationChain msgs = null;
      if (procedureType != null)
        msgs = ((InternalEObject)procedureType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OberonPackage.PROCEDURE__PROCEDURE_TYPE, null, msgs);
      if (newProcedureType != null)
        msgs = ((InternalEObject)newProcedureType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OberonPackage.PROCEDURE__PROCEDURE_TYPE, null, msgs);
      msgs = basicSetProcedureType(newProcedureType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.PROCEDURE__PROCEDURE_TYPE, newProcedureType, newProcedureType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declarations getDecl()
  {
    return decl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecl(Declarations newDecl, NotificationChain msgs)
  {
    Declarations oldDecl = decl;
    decl = newDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OberonPackage.PROCEDURE__DECL, oldDecl, newDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDecl(Declarations newDecl)
  {
    if (newDecl != decl)
    {
      NotificationChain msgs = null;
      if (decl != null)
        msgs = ((InternalEObject)decl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OberonPackage.PROCEDURE__DECL, null, msgs);
      if (newDecl != null)
        msgs = ((InternalEObject)newDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OberonPackage.PROCEDURE__DECL, null, msgs);
      msgs = basicSetDecl(newDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.PROCEDURE__DECL, newDecl, newDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Block getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs)
  {
    Block oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OberonPackage.PROCEDURE__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBlock(Block newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OberonPackage.PROCEDURE__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OberonPackage.PROCEDURE__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OberonPackage.PROCEDURE__BLOCK, newBlock, newBlock));
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
      case OberonPackage.PROCEDURE__FORMALS:
        return basicSetFormals(null, msgs);
      case OberonPackage.PROCEDURE__PROCEDURE_TYPE:
        return basicSetProcedureType(null, msgs);
      case OberonPackage.PROCEDURE__DECL:
        return basicSetDecl(null, msgs);
      case OberonPackage.PROCEDURE__BLOCK:
        return basicSetBlock(null, msgs);
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
      case OberonPackage.PROCEDURE__NAME:
        return getName();
      case OberonPackage.PROCEDURE__FORMALS:
        return getFormals();
      case OberonPackage.PROCEDURE__PROCEDURE_TYPE:
        return getProcedureType();
      case OberonPackage.PROCEDURE__DECL:
        return getDecl();
      case OberonPackage.PROCEDURE__BLOCK:
        return getBlock();
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
      case OberonPackage.PROCEDURE__NAME:
        setName((String)newValue);
        return;
      case OberonPackage.PROCEDURE__FORMALS:
        setFormals((Formals)newValue);
        return;
      case OberonPackage.PROCEDURE__PROCEDURE_TYPE:
        setProcedureType((OberonType)newValue);
        return;
      case OberonPackage.PROCEDURE__DECL:
        setDecl((Declarations)newValue);
        return;
      case OberonPackage.PROCEDURE__BLOCK:
        setBlock((Block)newValue);
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
      case OberonPackage.PROCEDURE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OberonPackage.PROCEDURE__FORMALS:
        setFormals((Formals)null);
        return;
      case OberonPackage.PROCEDURE__PROCEDURE_TYPE:
        setProcedureType((OberonType)null);
        return;
      case OberonPackage.PROCEDURE__DECL:
        setDecl((Declarations)null);
        return;
      case OberonPackage.PROCEDURE__BLOCK:
        setBlock((Block)null);
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
      case OberonPackage.PROCEDURE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OberonPackage.PROCEDURE__FORMALS:
        return formals != null;
      case OberonPackage.PROCEDURE__PROCEDURE_TYPE:
        return procedureType != null;
      case OberonPackage.PROCEDURE__DECL:
        return decl != null;
      case OberonPackage.PROCEDURE__BLOCK:
        return block != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ProcedureImpl
