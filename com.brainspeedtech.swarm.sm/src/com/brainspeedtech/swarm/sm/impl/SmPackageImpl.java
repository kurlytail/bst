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
package com.brainspeedtech.swarm.sm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.brainspeedtech.struct.StructPackage;
import com.brainspeedtech.swarm.sm.SmFactory;
import com.brainspeedtech.swarm.sm.SmPackage;
import com.brainspeedtech.swarm.sm.State;
import com.brainspeedtech.swarm.sm.StateMachine;
import com.brainspeedtech.swarm.sm.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmPackageImpl extends EPackageImpl implements SmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

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
	 * @see com.brainspeedtech.swarm.sm.SmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmPackageImpl() {
		super(eNS_URI, SmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmPackage init() {
		if (isInited) return (SmPackage)EPackage.Registry.INSTANCE.getEPackage(SmPackage.eNS_URI);

		// Obtain or create and register package
		SmPackageImpl theSmPackage = (SmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSmPackage.createPackageContents();

		// Initialize created meta-data
		theSmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmPackage.eNS_URI, theSmPackage);
		return theSmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Source() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Dest() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_State() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Transition() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_StatePath() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_To() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_From() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmFactory getSmFactory() {
		return (SmFactory)getEFactoryInstance();
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
		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__SOURCE);
		createEReference(stateEClass, STATE__DEST);
		createEAttribute(stateEClass, STATE__NAME);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__STATE);
		createEReference(stateMachineEClass, STATE_MACHINE__TRANSITION);
		createEReference(stateMachineEClass, STATE_MACHINE__STATE_PATH);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TO);
		createEReference(transitionEClass, TRANSITION__FROM);
		createEAttribute(transitionEClass, TRANSITION__NAME);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		StructPackage theStructPackage = (StructPackage)EPackage.Registry.INSTANCE.getEPackage(StructPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stateMachineEClass.getESuperTypes().add(theStructPackage.getStruct());

		// Initialize classes and features; add operations and parameters
		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Source(), this.getTransition(), this.getTransition_To(), "source", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Dest(), this.getTransition(), this.getTransition_From(), "dest", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_State(), this.getState(), null, "state", null, 1, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_Transition(), this.getTransition(), null, "transition", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_StatePath(), theStructPackage.getPath(), null, "statePath", null, 1, 1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_To(), this.getState(), this.getState_Source(), "to", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_From(), this.getState(), this.getState_Dest(), "from", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (stateEClass, 
		   source, 
		   new String[] {
			 "name", "State",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getState_Source(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getState_Dest(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dest",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getState_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (stateMachineEClass, 
		   source, 
		   new String[] {
			 "name", "StateMachine",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStateMachine_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStateMachine_Transition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStateMachine_StatePath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state_path",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "name", "Transition",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTransition_To(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "to",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransition_From(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "from",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransition_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });
	}

} //SmPackageImpl
