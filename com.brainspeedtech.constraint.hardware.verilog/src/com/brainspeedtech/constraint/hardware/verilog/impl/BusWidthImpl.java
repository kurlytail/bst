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
package com.brainspeedtech.constraint.hardware.verilog.impl;

import com.brainspeedtech.constraint.hardware.verilog.BusWidth;
import com.brainspeedtech.constraint.hardware.verilog.VerilogPackage;

import com.brainspeedtech.swarm.inst.TubeInstance;

import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import com.brainspeedtech.swarm.master.MasterTube;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Width</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.impl.BusWidthImpl#getMasterTube <em>Master Tube</em>}</li>
 *   <li>{@link com.brainspeedtech.constraint.hardware.verilog.impl.BusWidthImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BusWidthImpl extends ConstraintBaseImpl implements BusWidth {
	/**
	 * The cached value of the '{@link #getMasterTube() <em>Master Tube</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterTube()
	 * @generated
	 * @ordered
	 */
	protected EList masterTube;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusWidthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return VerilogPackage.Literals.BUS_WIDTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMasterTube() {
		if (masterTube == null) {
			masterTube = new EObjectResolvingEList(MasterTube.class, this, VerilogPackage.BUS_WIDTH__MASTER_TUBE);
		}
		return masterTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		boolean oldWidthESet = widthESet;
		widthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VerilogPackage.BUS_WIDTH__WIDTH, oldWidth, width, !oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		int oldWidth = width;
		boolean oldWidthESet = widthESet;
		width = WIDTH_EDEFAULT;
		widthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, VerilogPackage.BUS_WIDTH__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return widthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VerilogPackage.BUS_WIDTH__MASTER_TUBE:
				return getMasterTube();
			case VerilogPackage.BUS_WIDTH__WIDTH:
				return new Integer(getWidth());
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
			case VerilogPackage.BUS_WIDTH__MASTER_TUBE:
				getMasterTube().clear();
				getMasterTube().addAll((Collection)newValue);
				return;
			case VerilogPackage.BUS_WIDTH__WIDTH:
				setWidth(((Integer)newValue).intValue());
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
			case VerilogPackage.BUS_WIDTH__MASTER_TUBE:
				getMasterTube().clear();
				return;
			case VerilogPackage.BUS_WIDTH__WIDTH:
				unsetWidth();
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
			case VerilogPackage.BUS_WIDTH__MASTER_TUBE:
				return masterTube != null && !masterTube.isEmpty();
			case VerilogPackage.BUS_WIDTH__WIDTH:
				return isSetWidth();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (width: ");
		if (widthESet) result.append(width); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BusWidthImpl
