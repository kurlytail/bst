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
package com.brainspeedtech.constraint.software.posix.impl;

import com.brainspeedtech.constraint.software.posix.IgnorePosixTube;
import com.brainspeedtech.constraint.software.posix.PosixPackage;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;
import com.brainspeedtech.swarm.master.MasterTube;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import com.brainspeedtech.swarm.layer.impl.CustomTubeImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ignore Posix Tube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.posix.impl.IgnorePosixTubeImpl#getTube <em>Tube</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IgnorePosixTubeImpl extends ConstraintBaseImpl implements IgnorePosixTube {
	/**
	 * The cached value of the '{@link #getTube() <em>Tube</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTube()
	 * @generated
	 * @ordered
	 */
	protected EList tube;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IgnorePosixTubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PosixPackage.Literals.IGNORE_POSIX_TUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTube() {
		if (tube == null) {
			tube = new EObjectResolvingEList(MasterTube.class, this, PosixPackage.IGNORE_POSIX_TUBE__TUBE);
		}
		return tube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PosixPackage.IGNORE_POSIX_TUBE__TUBE:
				return getTube();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PosixPackage.IGNORE_POSIX_TUBE__TUBE:
				getTube().clear();
				getTube().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case PosixPackage.IGNORE_POSIX_TUBE__TUBE:
				getTube().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PosixPackage.IGNORE_POSIX_TUBE__TUBE:
				return tube != null && !tube.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IgnorePosixTubeImpl
