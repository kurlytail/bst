/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.opencl.impl;

import com.brainspeedtech.constraint.software.opencl.IgnoreOpenCLTube;
import com.brainspeedtech.constraint.software.opencl.OpenclPackage;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import com.brainspeedtech.swarm.master.MasterTube;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ignore Open CL Tube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.opencl.impl.IgnoreOpenCLTubeImpl#getTube <em>Tube</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IgnoreOpenCLTubeImpl extends ConstraintBaseImpl implements IgnoreOpenCLTube {
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
	protected IgnoreOpenCLTubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return OpenclPackage.Literals.IGNORE_OPEN_CL_TUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTube() {
		if (tube == null) {
			tube = new EObjectResolvingEList(MasterTube.class, this, OpenclPackage.IGNORE_OPEN_CL_TUBE__TUBE);
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
			case OpenclPackage.IGNORE_OPEN_CL_TUBE__TUBE:
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
			case OpenclPackage.IGNORE_OPEN_CL_TUBE__TUBE:
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
			case OpenclPackage.IGNORE_OPEN_CL_TUBE__TUBE:
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
			case OpenclPackage.IGNORE_OPEN_CL_TUBE__TUBE:
				return tube != null && !tube.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IgnoreOpenCLTubeImpl
