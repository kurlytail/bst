/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.impl;

import com.brainspeedtech.constraint.software.SharedMemoryTube;
import com.brainspeedtech.constraint.software.SoftwarePackage;

import com.brainspeedtech.struct.Struct;
import com.brainspeedtech.swarm.layer.impl.IgnoreTubeImpl;
import org.eclipse.emf.common.notify.Notification;
import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import com.brainspeedtech.swarm.master.MasterTube;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Memory Tube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.SharedMemoryTubeImpl#getTube <em>Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.SharedMemoryTubeImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.software.impl.SharedMemoryTubeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SharedMemoryTubeImpl extends ConstraintBaseImpl implements SharedMemoryTube {
	/**
	 * The cached value of the '{@link #getTube() <em>Tube</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTube()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterTube> tube;
	/**
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected Struct struct;
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
	protected SharedMemoryTubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.SHARED_MEMORY_TUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterTube> getTube() {
		if (tube == null) {
			tube = new EObjectResolvingEList<MasterTube>(MasterTube.class, this, SoftwarePackage.SHARED_MEMORY_TUBE__TUBE);
		}
		return tube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct getStruct() {
		if (struct != null && struct.eIsProxy()) {
			InternalEObject oldStruct = (InternalEObject)struct;
			struct = (Struct)eResolveProxy(oldStruct);
			if (struct != oldStruct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwarePackage.SHARED_MEMORY_TUBE__STRUCT, oldStruct, struct));
			}
		}
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct basicGetStruct() {
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(Struct newStruct) {
		Struct oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SHARED_MEMORY_TUBE__STRUCT, oldStruct, struct));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.SHARED_MEMORY_TUBE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.SHARED_MEMORY_TUBE__TUBE:
				return getTube();
			case SoftwarePackage.SHARED_MEMORY_TUBE__STRUCT:
				if (resolve) return getStruct();
				return basicGetStruct();
			case SoftwarePackage.SHARED_MEMORY_TUBE__NAME:
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
			case SoftwarePackage.SHARED_MEMORY_TUBE__TUBE:
				getTube().clear();
				getTube().addAll((Collection<? extends MasterTube>)newValue);
				return;
			case SoftwarePackage.SHARED_MEMORY_TUBE__STRUCT:
				setStruct((Struct)newValue);
				return;
			case SoftwarePackage.SHARED_MEMORY_TUBE__NAME:
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
			case SoftwarePackage.SHARED_MEMORY_TUBE__TUBE:
				getTube().clear();
				return;
			case SoftwarePackage.SHARED_MEMORY_TUBE__STRUCT:
				setStruct((Struct)null);
				return;
			case SoftwarePackage.SHARED_MEMORY_TUBE__NAME:
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
			case SoftwarePackage.SHARED_MEMORY_TUBE__TUBE:
				return tube != null && !tube.isEmpty();
			case SoftwarePackage.SHARED_MEMORY_TUBE__STRUCT:
				return struct != null;
			case SoftwarePackage.SHARED_MEMORY_TUBE__NAME:
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

} //SharedMemoryTubeImpl
