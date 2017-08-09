/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.web.javascript.impl;

import com.brainspeedtech.constraint.software.web.javascript.*;

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
public class JavascriptFactoryImpl extends EFactoryImpl implements JavascriptFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavascriptFactory init() {
		try {
			JavascriptFactory theJavascriptFactory = (JavascriptFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.brainspeedtech.com/constraint/software/web/javascript"); 
			if (theJavascriptFactory != null) {
				return theJavascriptFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavascriptFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavascriptFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavascriptPackage.JAVASCRIPT_GENERATION: return createJavascriptGeneration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavascriptGeneration createJavascriptGeneration() {
		JavascriptGenerationImpl javascriptGeneration = new JavascriptGenerationImpl();
		return javascriptGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavascriptPackage getJavascriptPackage() {
		return (JavascriptPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static JavascriptPackage getPackage() {
		return JavascriptPackage.eINSTANCE;
	}

} //JavascriptFactoryImpl
