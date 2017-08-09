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
import com.brainspeedtech.struct.Field;
import com.brainspeedtech.struct.StructPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.struct.impl.FieldImpl#getAtom <em>Atom</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.impl.FieldImpl#getBlurb <em>Blurb</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.impl.FieldImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.brainspeedtech.struct.impl.FieldImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends EObjectImpl implements Field {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * The cached value of the '{@link #getAtom() <em>Atom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtom()
	 * @generated
	 * @ordered
	 */
	protected Atom atom;

	/**
	 * The default value of the '{@link #getBlurb() <em>Blurb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlurb()
	 * @generated
	 * @ordered
	 */
	protected static final String BLURB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlurb() <em>Blurb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlurb()
	 * @generated
	 * @ordered
	 */
	protected String blurb = BLURB_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final long COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected long count = COUNT_EDEFAULT;

	/**
	 * This is true if the Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countESet;

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
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom getAtom() {
		if (atom != null && atom.eIsProxy()) {
			InternalEObject oldAtom = (InternalEObject)atom;
			atom = (Atom)eResolveProxy(oldAtom);
			if (atom != oldAtom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructPackage.FIELD__ATOM, oldAtom, atom));
			}
		}
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom basicGetAtom() {
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtom(Atom newAtom) {
		Atom oldAtom = atom;
		atom = newAtom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructPackage.FIELD__ATOM, oldAtom, atom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlurb() {
		return blurb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlurb(String newBlurb) {
		String oldBlurb = blurb;
		blurb = newBlurb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructPackage.FIELD__BLURB, oldBlurb, blurb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(long newCount) {
		long oldCount = count;
		count = newCount;
		boolean oldCountESet = countESet;
		countESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructPackage.FIELD__COUNT, oldCount, count, !oldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCount() {
		long oldCount = count;
		boolean oldCountESet = countESet;
		count = COUNT_EDEFAULT;
		countESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StructPackage.FIELD__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCount() {
		return countESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructPackage.FIELD__ATOM:
				if (resolve) return getAtom();
				return basicGetAtom();
			case StructPackage.FIELD__BLURB:
				return getBlurb();
			case StructPackage.FIELD__COUNT:
				return getCount();
			case StructPackage.FIELD__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructPackage.FIELD__ATOM:
				setAtom((Atom)newValue);
				return;
			case StructPackage.FIELD__BLURB:
				setBlurb((String)newValue);
				return;
			case StructPackage.FIELD__COUNT:
				setCount((Long)newValue);
				return;
			case StructPackage.FIELD__NAME:
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
			case StructPackage.FIELD__ATOM:
				setAtom((Atom)null);
				return;
			case StructPackage.FIELD__BLURB:
				setBlurb(BLURB_EDEFAULT);
				return;
			case StructPackage.FIELD__COUNT:
				unsetCount();
				return;
			case StructPackage.FIELD__NAME:
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
			case StructPackage.FIELD__ATOM:
				return atom != null;
			case StructPackage.FIELD__BLURB:
				return BLURB_EDEFAULT == null ? blurb != null : !BLURB_EDEFAULT.equals(blurb);
			case StructPackage.FIELD__COUNT:
				return isSetCount();
			case StructPackage.FIELD__NAME:
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
		result.append(" (blurb: ");
		result.append(blurb);
		result.append(", count: ");
		if (countESet) result.append(count); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
