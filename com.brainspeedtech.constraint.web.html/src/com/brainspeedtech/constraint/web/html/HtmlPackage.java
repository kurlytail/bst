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
package com.brainspeedtech.constraint.web.html;

import com.brainspeedtech.swarm.layer.LayerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.web.html.HtmlFactory
 * @model kind="package"
 * @generated
 */
public interface HtmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "html";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/constraint/web/html";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "html";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HtmlPackage eINSTANCE = com.brainspeedtech.constraint.web.html.impl.HtmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.web.html.impl.HtmlGenerationImpl <em>Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.web.html.impl.HtmlGenerationImpl
	 * @see com.brainspeedtech.constraint.web.html.impl.HtmlPackageImpl#getHtmlGeneration()
	 * @generated
	 */
	int HTML_GENERATION = 0;

	/**
	 * The number of structural features of the '<em>Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_GENERATION_FEATURE_COUNT = LayerPackage.NATURE_BASE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.brainspeedtech.constraint.web.html.impl.IndexPageImpl <em>Index Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.constraint.web.html.impl.IndexPageImpl
	 * @see com.brainspeedtech.constraint.web.html.impl.HtmlPackageImpl#getIndexPage()
	 * @generated
	 */
	int INDEX_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Except For</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__EXCEPT_FOR = LayerPackage.CONSTRAINT_BASE__EXCEPT_FOR;

	/**
	 * The feature id for the '<em><b>Apply To All Natures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__APPLY_TO_ALL_NATURES = LayerPackage.CONSTRAINT_BASE__APPLY_TO_ALL_NATURES;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__BLURB = LayerPackage.CONSTRAINT_BASE__BLURB;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__DISABLED = LayerPackage.CONSTRAINT_BASE__DISABLED;

	/**
	 * The feature id for the '<em><b>Pinned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__PINNED = LayerPackage.CONSTRAINT_BASE__PINNED;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__PROCESS = LayerPackage.CONSTRAINT_BASE__PROCESS;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__REASON = LayerPackage.CONSTRAINT_BASE__REASON;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE__INSTANCE = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_PAGE_FEATURE_COUNT = LayerPackage.CONSTRAINT_BASE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.web.html.HtmlGeneration <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation</em>'.
	 * @see com.brainspeedtech.constraint.web.html.HtmlGeneration
	 * @generated
	 */
	EClass getHtmlGeneration();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.constraint.web.html.IndexPage <em>Index Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Page</em>'.
	 * @see com.brainspeedtech.constraint.web.html.IndexPage
	 * @generated
	 */
	EClass getIndexPage();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.constraint.web.html.IndexPage#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see com.brainspeedtech.constraint.web.html.IndexPage#getInstance()
	 * @see #getIndexPage()
	 * @generated
	 */
	EReference getIndexPage_Instance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HtmlFactory getHtmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.web.html.impl.HtmlGenerationImpl <em>Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.web.html.impl.HtmlGenerationImpl
		 * @see com.brainspeedtech.constraint.web.html.impl.HtmlPackageImpl#getHtmlGeneration()
		 * @generated
		 */
		EClass HTML_GENERATION = eINSTANCE.getHtmlGeneration();
		/**
		 * The meta object literal for the '{@link com.brainspeedtech.constraint.web.html.impl.IndexPageImpl <em>Index Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.constraint.web.html.impl.IndexPageImpl
		 * @see com.brainspeedtech.constraint.web.html.impl.HtmlPackageImpl#getIndexPage()
		 * @generated
		 */
		EClass INDEX_PAGE = eINSTANCE.getIndexPage();
		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_PAGE__INSTANCE = eINSTANCE.getIndexPage_Instance();

	}

} //HtmlPackage
