/**
 */
package com.brainspeedtech.constraint.web.gwt.util;

import com.brainspeedtech.constraint.web.gwt.GWTPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GWTXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GWTXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		GWTPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the GWTResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new GWTResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new GWTResourceFactoryImpl());
		}
		return registrations;
	}

} //GWTXMLProcessor
