/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.opencl.impl;

import com.brainspeedtech.constraint.software.opencl.*;

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
public class OpenclFactoryImpl extends EFactoryImpl implements OpenclFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenclFactory init() {
		try {
			OpenclFactory theOpenclFactory = (OpenclFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.brainspeedtech.com/constraint/software/opencl"); 
			if (theOpenclFactory != null) {
				return theOpenclFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenclFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenclFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenclPackage.CUSTOM_OPEN_CL_TUBE: return createCustomOpenCLTube();
			case OpenclPackage.IGNORE_OPEN_CL_TUBE: return createIgnoreOpenCLTube();
			case OpenclPackage.OPEN_CL_GENERATOR: return createOpenCLGenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomOpenCLTube createCustomOpenCLTube() {
		CustomOpenCLTubeImpl customOpenCLTube = new CustomOpenCLTubeImpl();
		return customOpenCLTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreOpenCLTube createIgnoreOpenCLTube() {
		IgnoreOpenCLTubeImpl ignoreOpenCLTube = new IgnoreOpenCLTubeImpl();
		return ignoreOpenCLTube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenCLGenerator createOpenCLGenerator() {
		OpenCLGeneratorImpl openCLGenerator = new OpenCLGeneratorImpl();
		return openCLGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenclPackage getOpenclPackage() {
		return (OpenclPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static OpenclPackage getPackage() {
		return OpenclPackage.eINSTANCE;
	}

} //OpenclFactoryImpl
