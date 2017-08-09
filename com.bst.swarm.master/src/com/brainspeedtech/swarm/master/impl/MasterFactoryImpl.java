/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
/**
 *  (c) Copyright 2011, BrainSpeed Technologies
 */
package com.brainspeedtech.swarm.master.impl;

import com.brainspeedtech.swarm.master.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterFactoryImpl extends EFactoryImpl implements MasterFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " (c) Copyright 2011, BrainSpeed Technologies";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MasterFactory init() {
		try {
			MasterFactory theMasterFactory = (MasterFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.brainspeedtech.com/swarm/master"); 
			if (theMasterFactory != null) {
				return theMasterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MasterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MasterPackage.MASTER_CELL: return createMasterCell();
			case MasterPackage.MASTER_DESIGN: return createMasterDesign();
			case MasterPackage.MASTER_TUBE: return createMasterTube();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterCell createMasterCell() {
		MasterCellImpl masterCell = new MasterCellImpl();
		return masterCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterDesign createMasterDesign() {
		MasterDesignImpl masterDesign = new MasterDesignImpl();
		return masterDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterTube createMasterTube() {
		MasterTubeImpl masterTube = new MasterTubeImpl();
		return masterTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterPackage getMasterPackage() {
		return (MasterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MasterPackage getPackage() {
		return MasterPackage.eINSTANCE;
	}

} //MasterFactoryImpl
