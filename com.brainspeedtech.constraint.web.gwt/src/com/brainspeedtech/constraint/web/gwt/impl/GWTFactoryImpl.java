/**
 */
package com.brainspeedtech.constraint.web.gwt.impl;

import com.brainspeedtech.constraint.web.gwt.*;

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
public class GWTFactoryImpl extends EFactoryImpl implements GWTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GWTFactory init() {
		try {
			GWTFactory theGWTFactory = (GWTFactory)EPackage.Registry.INSTANCE.getEFactory(GWTPackage.eNS_URI);
			if (theGWTFactory != null) {
				return theGWTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GWTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GWTFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GWTPackage.GWT_GENERATION: return createGWTGeneration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GWTGeneration createGWTGeneration() {
		GWTGenerationImpl gwtGeneration = new GWTGenerationImpl();
		return gwtGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GWTPackage getGWTPackage() {
		return (GWTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static GWTPackage getPackage() {
		return GWTPackage.eINSTANCE;
	}

} //GWTFactoryImpl
