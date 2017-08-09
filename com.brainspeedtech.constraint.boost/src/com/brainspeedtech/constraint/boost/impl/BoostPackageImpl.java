/**
 * <copyright>
 * Copyright @2011-2013 BrainSpeed Technologies - All rights reserved
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.boost.impl;

import com.brainspeedtech.constraint.boost.BoostFactory;
import com.brainspeedtech.constraint.boost.BoostNature;
import com.brainspeedtech.constraint.boost.BoostPackage;
import com.brainspeedtech.constraint.boost.NativeType;

import com.brainspeedtech.constraint.boost.TCPSocketTube;
import com.brainspeedtech.struct.StructPackage;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.layer.LayerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoostPackageImpl extends EPackageImpl implements BoostPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright @2011-2013 BrainSpeed Technologies - All rights reserved";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boostNatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpSocketTubeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.brainspeedtech.constraint.boost.BoostPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BoostPackageImpl() {
		super(eNS_URI, BoostFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BoostPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BoostPackage init() {
		if (isInited) return (BoostPackage)EPackage.Registry.INSTANCE.getEPackage(BoostPackage.eNS_URI);

		// Obtain or create and register package
		BoostPackageImpl theBoostPackage = (BoostPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BoostPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BoostPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LayerPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBoostPackage.createPackageContents();

		// Initialize created meta-data
		theBoostPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBoostPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BoostPackage.eNS_URI, theBoostPackage);
		return theBoostPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoostNature() {
		return boostNatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNativeType() {
		return nativeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNativeType_Object() {
		return (EReference)nativeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTCPSocketTube() {
		return tcpSocketTubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTCPSocketTube_Tube() {
		return (EReference)tcpSocketTubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPSocketTube_ClientReceiver() {
		return (EAttribute)tcpSocketTubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPSocketTube_ServerIP() {
		return (EAttribute)tcpSocketTubeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTCPSocketTube_ServerPort() {
		return (EAttribute)tcpSocketTubeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoostFactory getBoostFactory() {
		return (BoostFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		boostNatureEClass = createEClass(BOOST_NATURE);

		nativeTypeEClass = createEClass(NATIVE_TYPE);
		createEReference(nativeTypeEClass, NATIVE_TYPE__OBJECT);

		tcpSocketTubeEClass = createEClass(TCP_SOCKET_TUBE);
		createEReference(tcpSocketTubeEClass, TCP_SOCKET_TUBE__TUBE);
		createEAttribute(tcpSocketTubeEClass, TCP_SOCKET_TUBE__CLIENT_RECEIVER);
		createEAttribute(tcpSocketTubeEClass, TCP_SOCKET_TUBE__SERVER_IP);
		createEAttribute(tcpSocketTubeEClass, TCP_SOCKET_TUBE__SERVER_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LayerPackage theLayerPackage = (LayerPackage)EPackage.Registry.INSTANCE.getEPackage(LayerPackage.eNS_URI);
		StructPackage theStructPackage = (StructPackage)EPackage.Registry.INSTANCE.getEPackage(StructPackage.eNS_URI);
		InstPackage theInstPackage = (InstPackage)EPackage.Registry.INSTANCE.getEPackage(InstPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boostNatureEClass.getESuperTypes().add(theLayerPackage.getNatureBase());
		nativeTypeEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());
		tcpSocketTubeEClass.getESuperTypes().add(theLayerPackage.getConstraintBase());

		// Initialize classes and features; add operations and parameters
		initEClass(boostNatureEClass, BoostNature.class, "BoostNature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nativeTypeEClass, NativeType.class, "NativeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNativeType_Object(), theStructPackage.getAtom(), null, "object", null, 0, -1, NativeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcpSocketTubeEClass, TCPSocketTube.class, "TCPSocketTube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCPSocketTube_Tube(), theInstPackage.getTubeInstance(), null, "tube", null, 0, -1, TCPSocketTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPSocketTube_ClientReceiver(), theXMLTypePackage.getBoolean(), "clientReceiver", "false", 0, 1, TCPSocketTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPSocketTube_ServerIP(), theXMLTypePackage.getString(), "serverIP", "localhost", 0, 1, TCPSocketTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCPSocketTube_ServerPort(), theXMLTypePackage.getInt(), "serverPort", "8000", 0, 1, TCPSocketTube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (boostNatureEClass, 
		   source, 
		   new String[] {
			 "name", "BoostNature",
			 "kind", "empty"
		   });		
		addAnnotation
		  (nativeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NativeType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNativeType_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tcpSocketTubeEClass, 
		   source, 
		   new String[] {
			 "name", "TCPSocketTube",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTCPSocketTube_Tube(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tube",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTCPSocketTube_ClientReceiver(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "clientReceiver"
		   });		
		addAnnotation
		  (getTCPSocketTube_ServerIP(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serverIP"
		   });		
		addAnnotation
		  (getTCPSocketTube_ServerPort(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serverPort"
		   });
	}

} //BoostPackageImpl
