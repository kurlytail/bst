/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.swarm.flow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.brainspeedtech.swarm.flow.Cell;
import com.brainspeedtech.swarm.flow.FlowPackage;
import com.brainspeedtech.swarm.flow.Tube;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.flow.impl.CellImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.impl.CellImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.impl.CellImpl#getCount <em>Count</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.impl.CellImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.impl.CellImpl#isExternal <em>External</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.flow.impl.CellImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellImpl extends EObjectImpl implements Cell {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Tube> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Tube> output;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * This is true if the Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countESet;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * This is true if the External attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean externalESet;

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
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tube> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList<Tube>(Tube.class, this, FlowPackage.CELL__INPUT, FlowPackage.TUBE__TO);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tube> getOutput() {
		if (output == null) {
			output = new EObjectWithInverseResolvingEList<Tube>(Tube.class, this, FlowPackage.CELL__OUTPUT, FlowPackage.TUBE__FROM);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		boolean oldCountESet = countESet;
		countESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CELL__COUNT, oldCount, count, !oldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCount() {
		int oldCount = count;
		boolean oldCountESet = countESet;
		count = COUNT_EDEFAULT;
		countESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FlowPackage.CELL__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
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
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CELL__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternal(boolean newExternal) {
		boolean oldExternal = external;
		external = newExternal;
		boolean oldExternalESet = externalESet;
		externalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CELL__EXTERNAL, oldExternal, external, !oldExternalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExternal() {
		boolean oldExternal = external;
		boolean oldExternalESet = externalESet;
		external = EXTERNAL_EDEFAULT;
		externalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FlowPackage.CELL__EXTERNAL, oldExternal, EXTERNAL_EDEFAULT, oldExternalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExternal() {
		return externalESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.CELL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.CELL__INPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput()).basicAdd(otherEnd, msgs);
			case FlowPackage.CELL__OUTPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutput()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlowPackage.CELL__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case FlowPackage.CELL__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
			case FlowPackage.CELL__INPUT:
				return getInput();
			case FlowPackage.CELL__OUTPUT:
				return getOutput();
			case FlowPackage.CELL__COUNT:
				return getCount();
			case FlowPackage.CELL__DOMAIN:
				return getDomain();
			case FlowPackage.CELL__EXTERNAL:
				return isExternal();
			case FlowPackage.CELL__NAME:
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
			case FlowPackage.CELL__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Tube>)newValue);
				return;
			case FlowPackage.CELL__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Tube>)newValue);
				return;
			case FlowPackage.CELL__COUNT:
				setCount((Integer)newValue);
				return;
			case FlowPackage.CELL__DOMAIN:
				setDomain((String)newValue);
				return;
			case FlowPackage.CELL__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case FlowPackage.CELL__NAME:
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
			case FlowPackage.CELL__INPUT:
				getInput().clear();
				return;
			case FlowPackage.CELL__OUTPUT:
				getOutput().clear();
				return;
			case FlowPackage.CELL__COUNT:
				unsetCount();
				return;
			case FlowPackage.CELL__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case FlowPackage.CELL__EXTERNAL:
				unsetExternal();
				return;
			case FlowPackage.CELL__NAME:
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
			case FlowPackage.CELL__INPUT:
				return input != null && !input.isEmpty();
			case FlowPackage.CELL__OUTPUT:
				return output != null && !output.isEmpty();
			case FlowPackage.CELL__COUNT:
				return isSetCount();
			case FlowPackage.CELL__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case FlowPackage.CELL__EXTERNAL:
				return isSetExternal();
			case FlowPackage.CELL__NAME:
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
		result.append(" (count: ");
		if (countESet) result.append(count); else result.append("<unset>");
		result.append(", domain: ");
		result.append(domain);
		result.append(", external: ");
		if (externalESet) result.append(external); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CellImpl
