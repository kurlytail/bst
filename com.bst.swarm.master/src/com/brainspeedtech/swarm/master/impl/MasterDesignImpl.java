/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 *  (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.swarm.master.impl;

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

import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.master.MasterTube;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterDesignImpl#getCell <em>Cell</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterDesignImpl#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.master.impl.MasterDesignImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterDesignImpl extends EObjectImpl implements MasterDesign {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " (c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * The cached value of the '{@link #getCell() <em>Cell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCell()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterCell> cell;

	/**
	 * The cached value of the '{@link #getTube() <em>Tube</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTube()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterTube> tube;

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
	protected MasterDesignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MasterPackage.Literals.MASTER_DESIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterCell> getCell() {
		if (cell == null) {
			cell = new EObjectContainmentEList<MasterCell>(MasterCell.class, this, MasterPackage.MASTER_DESIGN__CELL);
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterTube> getTube() {
		if (tube == null) {
			tube = new EObjectContainmentEList<MasterTube>(MasterTube.class, this, MasterPackage.MASTER_DESIGN__TUBE);
		}
		return tube;
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
				return fileName.replace(".master", "");
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
			eNotify(new ENotificationImpl(this, Notification.SET, MasterPackage.MASTER_DESIGN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MasterPackage.MASTER_DESIGN__CELL:
				return ((InternalEList<?>)getCell()).basicRemove(otherEnd, msgs);
			case MasterPackage.MASTER_DESIGN__TUBE:
				return ((InternalEList<?>)getTube()).basicRemove(otherEnd, msgs);
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
			case MasterPackage.MASTER_DESIGN__CELL:
				return getCell();
			case MasterPackage.MASTER_DESIGN__TUBE:
				return getTube();
			case MasterPackage.MASTER_DESIGN__NAME:
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
			case MasterPackage.MASTER_DESIGN__CELL:
				getCell().clear();
				getCell().addAll((Collection<? extends MasterCell>)newValue);
				return;
			case MasterPackage.MASTER_DESIGN__TUBE:
				getTube().clear();
				getTube().addAll((Collection<? extends MasterTube>)newValue);
				return;
			case MasterPackage.MASTER_DESIGN__NAME:
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
			case MasterPackage.MASTER_DESIGN__CELL:
				getCell().clear();
				return;
			case MasterPackage.MASTER_DESIGN__TUBE:
				getTube().clear();
				return;
			case MasterPackage.MASTER_DESIGN__NAME:
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
			case MasterPackage.MASTER_DESIGN__CELL:
				return cell != null && !cell.isEmpty();
			case MasterPackage.MASTER_DESIGN__TUBE:
				return tube != null && !tube.isEmpty();
			case MasterPackage.MASTER_DESIGN__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MasterDesignImpl
