/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.web.html.impl;

import com.brainspeedtech.constraint.web.html.HtmlPackage;
import com.brainspeedtech.constraint.web.html.IndexPage;

import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.layer.impl.ConstraintBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.brainspeedtech.constraint.web.html.impl.IndexPageImpl#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexPageImpl extends ConstraintBaseImpl implements IndexPage {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected CellInstance instance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HtmlPackage.Literals.INDEX_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInstance getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = (CellInstance)eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HtmlPackage.INDEX_PAGE__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInstance basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(CellInstance newInstance) {
		CellInstance oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlPackage.INDEX_PAGE__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlPackage.INDEX_PAGE__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
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
			case HtmlPackage.INDEX_PAGE__INSTANCE:
				setInstance((CellInstance)newValue);
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
			case HtmlPackage.INDEX_PAGE__INSTANCE:
				setInstance((CellInstance)null);
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
			case HtmlPackage.INDEX_PAGE__INSTANCE:
				return instance != null;
		}
		return super.eIsSet(featureID);
	}

} //IndexPageImpl
