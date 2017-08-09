/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.struct.impl;

import com.brainspeedtech.struct.Atom;
import com.brainspeedtech.struct.Document;
import com.brainspeedtech.struct.StructPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.struct.impl.DocumentImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.impl.DocumentImpl#isGhost <em>Ghost</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.impl.DocumentImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends EObjectImpl implements Document {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected EList<Atom> struct;

	/**
	 * The default value of the '{@link #isGhost() <em>Ghost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGhost()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GHOST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGhost() <em>Ghost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGhost()
	 * @generated
	 * @ordered
	 */
	protected boolean ghost = GHOST_EDEFAULT;

	/**
	 * This is true if the Ghost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ghostESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atom> getStruct() {
		if (struct == null) {
			struct = new EObjectContainmentEList<Atom>(Atom.class, this, StructPackage.DOCUMENT__STRUCT);
		}
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGhost() {
		return ghost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGhost(boolean newGhost) {
		boolean oldGhost = ghost;
		ghost = newGhost;
		boolean oldGhostESet = ghostESet;
		ghostESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructPackage.DOCUMENT__GHOST, oldGhost, ghost, !oldGhostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGhost() {
		boolean oldGhost = ghost;
		boolean oldGhostESet = ghostESet;
		ghost = GHOST_EDEFAULT;
		ghostESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StructPackage.DOCUMENT__GHOST, oldGhost, GHOST_EDEFAULT, oldGhostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGhost() {
		return ghostESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		if(eResource() != null) {
			if(eResource().getURI() != null) {
				String fileName = eResource().getURI().segments()[eResource().getURI().segments().length - 1];
				return fileName.replace(".struct", "");
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructPackage.DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructPackage.DOCUMENT__STRUCT:
				return ((InternalEList<?>)getStruct()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructPackage.DOCUMENT__STRUCT:
				return getStruct();
			case StructPackage.DOCUMENT__GHOST:
				return isGhost();
			case StructPackage.DOCUMENT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructPackage.DOCUMENT__STRUCT:
				getStruct().clear();
				getStruct().addAll((Collection<? extends Atom>)newValue);
				return;
			case StructPackage.DOCUMENT__GHOST:
				setGhost((Boolean)newValue);
				return;
			case StructPackage.DOCUMENT__NAME:
				setName((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case StructPackage.DOCUMENT__STRUCT:
				getStruct().clear();
				return;
			case StructPackage.DOCUMENT__GHOST:
				unsetGhost();
				return;
			case StructPackage.DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StructPackage.DOCUMENT__STRUCT:
				return struct != null && !struct.isEmpty();
			case StructPackage.DOCUMENT__GHOST:
				return isSetGhost();
			case StructPackage.DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ghost: ");
		if (ghostESet) result.append(ghost); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
