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
package com.brainspeedtech.swarm.layer.impl;

import com.brainspeedtech.swarm.layer.ConstraintBase;
import com.brainspeedtech.swarm.layer.LayerPackage;

import com.brainspeedtech.swarm.layer.NatureBase;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl#getExceptFor <em>Except For</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl#isApplyToAllNatures <em>Apply To All Natures</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl#getBlurb <em>Blurb</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl#isPinned <em>Pinned</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConstraintBaseImpl extends EObjectImpl implements ConstraintBase {
	/**
	 * The cached value of the '{@link #getExceptFor() <em>Except For</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptFor()
	 * @generated
	 * @ordered
	 */
	protected EList<NatureBase> exceptFor;

	/**
	 * The default value of the '{@link #isApplyToAllNatures() <em>Apply To All Natures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToAllNatures()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_TO_ALL_NATURES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isApplyToAllNatures() <em>Apply To All Natures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToAllNatures()
	 * @generated
	 * @ordered
	 */
	protected boolean applyToAllNatures = APPLY_TO_ALL_NATURES_EDEFAULT;

	/**
	 * This is true if the Apply To All Natures attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applyToAllNaturesESet;

	/**
	 * The default value of the '{@link #getBlurb() <em>Blurb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlurb()
	 * @generated
	 * @ordered
	 */
	protected static final String BLURB_EDEFAULT = "Add Description";

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
	 * This is true if the Blurb attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blurbESet;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean disabled = DISABLED_EDEFAULT;

	/**
	 * This is true if the Disabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disabledESet;

	/**
	 * The default value of the '{@link #isPinned() <em>Pinned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPinned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PINNED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPinned() <em>Pinned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPinned()
	 * @generated
	 * @ordered
	 */
	protected boolean pinned = PINNED_EDEFAULT;

	/**
	 * This is true if the Pinned attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pinnedESet;

	/**
	 * The default value of the '{@link #getProcess() <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_EDEFAULT = "Manually Added";

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected String process = PROCESS_EDEFAULT;

	/**
	 * This is true if the Process attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processESet;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = "User Interaction";

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * This is true if the Reason attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reasonESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayerPackage.Literals.CONSTRAINT_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NatureBase> getExceptFor() {
		if (exceptFor == null) {
			exceptFor = new EObjectContainmentEList<NatureBase>(NatureBase.class, this, LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR);
		}
		return exceptFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyToAllNatures() {
		return applyToAllNatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyToAllNatures(boolean newApplyToAllNatures) {
		boolean oldApplyToAllNatures = applyToAllNatures;
		applyToAllNatures = newApplyToAllNatures;
		boolean oldApplyToAllNaturesESet = applyToAllNaturesESet;
		applyToAllNaturesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES, oldApplyToAllNatures, applyToAllNatures, !oldApplyToAllNaturesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplyToAllNatures() {
		boolean oldApplyToAllNatures = applyToAllNatures;
		boolean oldApplyToAllNaturesESet = applyToAllNaturesESet;
		applyToAllNatures = APPLY_TO_ALL_NATURES_EDEFAULT;
		applyToAllNaturesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES, oldApplyToAllNatures, APPLY_TO_ALL_NATURES_EDEFAULT, oldApplyToAllNaturesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplyToAllNatures() {
		return applyToAllNaturesESet;
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
		boolean oldBlurbESet = blurbESet;
		blurbESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayerPackage.CONSTRAINT_BASE__BLURB, oldBlurb, blurb, !oldBlurbESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBlurb() {
		String oldBlurb = blurb;
		boolean oldBlurbESet = blurbESet;
		blurb = BLURB_EDEFAULT;
		blurbESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LayerPackage.CONSTRAINT_BASE__BLURB, oldBlurb, BLURB_EDEFAULT, oldBlurbESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBlurb() {
		return blurbESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		boolean oldDisabled = disabled;
		disabled = newDisabled;
		boolean oldDisabledESet = disabledESet;
		disabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayerPackage.CONSTRAINT_BASE__DISABLED, oldDisabled, disabled, !oldDisabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisabled() {
		boolean oldDisabled = disabled;
		boolean oldDisabledESet = disabledESet;
		disabled = DISABLED_EDEFAULT;
		disabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LayerPackage.CONSTRAINT_BASE__DISABLED, oldDisabled, DISABLED_EDEFAULT, oldDisabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisabled() {
		return disabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPinned() {
		return pinned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinned(boolean newPinned) {
		boolean oldPinned = pinned;
		pinned = newPinned;
		boolean oldPinnedESet = pinnedESet;
		pinnedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayerPackage.CONSTRAINT_BASE__PINNED, oldPinned, pinned, !oldPinnedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPinned() {
		boolean oldPinned = pinned;
		boolean oldPinnedESet = pinnedESet;
		pinned = PINNED_EDEFAULT;
		pinnedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LayerPackage.CONSTRAINT_BASE__PINNED, oldPinned, PINNED_EDEFAULT, oldPinnedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPinned() {
		return pinnedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(String newProcess) {
		String oldProcess = process;
		process = newProcess;
		boolean oldProcessESet = processESet;
		processESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayerPackage.CONSTRAINT_BASE__PROCESS, oldProcess, process, !oldProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcess() {
		String oldProcess = process;
		boolean oldProcessESet = processESet;
		process = PROCESS_EDEFAULT;
		processESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LayerPackage.CONSTRAINT_BASE__PROCESS, oldProcess, PROCESS_EDEFAULT, oldProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcess() {
		return processESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		boolean oldReasonESet = reasonESet;
		reasonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayerPackage.CONSTRAINT_BASE__REASON, oldReason, reason, !oldReasonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReason() {
		String oldReason = reason;
		boolean oldReasonESet = reasonESet;
		reason = REASON_EDEFAULT;
		reasonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LayerPackage.CONSTRAINT_BASE__REASON, oldReason, REASON_EDEFAULT, oldReasonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReason() {
		return reasonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR:
				return ((InternalEList<?>)getExceptFor()).basicRemove(otherEnd, msgs);
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
			case LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR:
				return getExceptFor();
			case LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES:
				return isApplyToAllNatures();
			case LayerPackage.CONSTRAINT_BASE__BLURB:
				return getBlurb();
			case LayerPackage.CONSTRAINT_BASE__DISABLED:
				return isDisabled();
			case LayerPackage.CONSTRAINT_BASE__PINNED:
				return isPinned();
			case LayerPackage.CONSTRAINT_BASE__PROCESS:
				return getProcess();
			case LayerPackage.CONSTRAINT_BASE__REASON:
				return getReason();
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
			case LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR:
				getExceptFor().clear();
				getExceptFor().addAll((Collection<? extends NatureBase>)newValue);
				return;
			case LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES:
				setApplyToAllNatures((Boolean)newValue);
				return;
			case LayerPackage.CONSTRAINT_BASE__BLURB:
				setBlurb((String)newValue);
				return;
			case LayerPackage.CONSTRAINT_BASE__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case LayerPackage.CONSTRAINT_BASE__PINNED:
				setPinned((Boolean)newValue);
				return;
			case LayerPackage.CONSTRAINT_BASE__PROCESS:
				setProcess((String)newValue);
				return;
			case LayerPackage.CONSTRAINT_BASE__REASON:
				setReason((String)newValue);
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
			case LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR:
				getExceptFor().clear();
				return;
			case LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES:
				unsetApplyToAllNatures();
				return;
			case LayerPackage.CONSTRAINT_BASE__BLURB:
				unsetBlurb();
				return;
			case LayerPackage.CONSTRAINT_BASE__DISABLED:
				unsetDisabled();
				return;
			case LayerPackage.CONSTRAINT_BASE__PINNED:
				unsetPinned();
				return;
			case LayerPackage.CONSTRAINT_BASE__PROCESS:
				unsetProcess();
				return;
			case LayerPackage.CONSTRAINT_BASE__REASON:
				unsetReason();
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
			case LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR:
				return exceptFor != null && !exceptFor.isEmpty();
			case LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES:
				return isSetApplyToAllNatures();
			case LayerPackage.CONSTRAINT_BASE__BLURB:
				return isSetBlurb();
			case LayerPackage.CONSTRAINT_BASE__DISABLED:
				return isSetDisabled();
			case LayerPackage.CONSTRAINT_BASE__PINNED:
				return isSetPinned();
			case LayerPackage.CONSTRAINT_BASE__PROCESS:
				return isSetProcess();
			case LayerPackage.CONSTRAINT_BASE__REASON:
				return isSetReason();
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
		result.append(" (applyToAllNatures: ");
		if (applyToAllNaturesESet) result.append(applyToAllNatures); else result.append("<unset>");
		result.append(", blurb: ");
		if (blurbESet) result.append(blurb); else result.append("<unset>");
		result.append(", disabled: ");
		if (disabledESet) result.append(disabled); else result.append("<unset>");
		result.append(", pinned: ");
		if (pinnedESet) result.append(pinned); else result.append("<unset>");
		result.append(", process: ");
		if (processESet) result.append(process); else result.append("<unset>");
		result.append(", reason: ");
		if (reasonESet) result.append(reason); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConstraintBaseImpl
