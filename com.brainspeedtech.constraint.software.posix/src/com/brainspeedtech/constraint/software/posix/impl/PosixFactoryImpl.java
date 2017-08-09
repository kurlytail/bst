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

import com.brainspeedtech.constraint.software.posix.*;

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
public class PosixFactoryImpl extends EFactoryImpl implements PosixFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PosixFactory init() {
		try {
			PosixFactory thePosixFactory = (PosixFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.brainspeedtech.com/constraint/software/posix"); 
			if (thePosixFactory != null) {
				return thePosixFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PosixFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PosixFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PosixPackage.CUSTOM_POSIX_TUBE: return createCustomPosixTube();
			case PosixPackage.IGNORE_POSIX_TUBE: return createIgnorePosixTube();
			case PosixPackage.POSIX_GENERATOR: return createPosixGenerator();
			case PosixPackage.UNIX_SOCKET_TUBE: return createUnixSocketTube();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomPosixTube createCustomPosixTube() {
		CustomPosixTubeImpl customPosixTube = new CustomPosixTubeImpl();
		return customPosixTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnorePosixTube createIgnorePosixTube() {
		IgnorePosixTubeImpl ignorePosixTube = new IgnorePosixTubeImpl();
		return ignorePosixTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PosixGenerator createPosixGenerator() {
		PosixGeneratorImpl posixGenerator = new PosixGeneratorImpl();
		return posixGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnixSocketTube createUnixSocketTube() {
		UnixSocketTubeImpl unixSocketTube = new UnixSocketTubeImpl();
		return unixSocketTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PosixPackage getPosixPackage() {
		return (PosixPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static PosixPackage getPackage() {
		return PosixPackage.eINSTANCE;
	}

} //PosixFactoryImpl
