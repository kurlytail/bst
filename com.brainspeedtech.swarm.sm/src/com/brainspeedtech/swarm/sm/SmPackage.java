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
package com.brainspeedtech.swarm.sm;

import com.brainspeedtech.struct.StructPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see com.brainspeedtech.swarm.sm.SmFactory
 * @model kind="package"
 * @generated
 */
public interface SmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.brainspeedtech.com/swarm/sm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmPackage eINSTANCE = com.brainspeedtech.swarm.sm.impl.SmPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.sm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.sm.impl.StateImpl
	 * @see com.brainspeedtech.swarm.sm.impl.SmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DEST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.sm.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.sm.impl.StateMachineImpl
	 * @see com.brainspeedtech.swarm.sm.impl.SmPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__ATOM = StructPackage.STRUCT__ATOM;

	/**
	 * The feature id for the '<em><b>Blurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__BLURB = StructPackage.STRUCT__BLURB;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__COUNT = StructPackage.STRUCT__COUNT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = StructPackage.STRUCT__NAME;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__FIELD = StructPackage.STRUCT__FIELD;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATE = StructPackage.STRUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITION = StructPackage.STRUCT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATE_PATH = StructPackage.STRUCT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = StructPackage.STRUCT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.brainspeedtech.swarm.sm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.brainspeedtech.swarm.sm.impl.TransitionImpl
	 * @see com.brainspeedtech.swarm.sm.impl.SmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.sm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see com.brainspeedtech.swarm.sm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.sm.State#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see com.brainspeedtech.swarm.sm.State#getSource()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Source();

	/**
	 * Returns the meta object for the reference list '{@link com.brainspeedtech.swarm.sm.State#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dest</em>'.
	 * @see com.brainspeedtech.swarm.sm.State#getDest()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Dest();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.sm.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.sm.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.sm.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see com.brainspeedtech.swarm.sm.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.sm.StateMachine#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see com.brainspeedtech.swarm.sm.StateMachine#getState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_State();

	/**
	 * Returns the meta object for the containment reference list '{@link com.brainspeedtech.swarm.sm.StateMachine#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see com.brainspeedtech.swarm.sm.StateMachine#getTransition()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transition();

	/**
	 * Returns the meta object for the containment reference '{@link com.brainspeedtech.swarm.sm.StateMachine#getStatePath <em>State Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Path</em>'.
	 * @see com.brainspeedtech.swarm.sm.StateMachine#getStatePath()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_StatePath();

	/**
	 * Returns the meta object for class '{@link com.brainspeedtech.swarm.sm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see com.brainspeedtech.swarm.sm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.sm.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see com.brainspeedtech.swarm.sm.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for the reference '{@link com.brainspeedtech.swarm.sm.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see com.brainspeedtech.swarm.sm.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the meta object for the attribute '{@link com.brainspeedtech.swarm.sm.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.brainspeedtech.swarm.sm.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmFactory getSmFactory();

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
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.sm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.sm.impl.StateImpl
		 * @see com.brainspeedtech.swarm.sm.impl.SmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__SOURCE = eINSTANCE.getState_Source();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DEST = eINSTANCE.getState_Dest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.sm.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.sm.impl.StateMachineImpl
		 * @see com.brainspeedtech.swarm.sm.impl.SmPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATE = eINSTANCE.getStateMachine_State();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITION = eINSTANCE.getStateMachine_Transition();

		/**
		 * The meta object literal for the '<em><b>State Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATE_PATH = eINSTANCE.getStateMachine_StatePath();

		/**
		 * The meta object literal for the '{@link com.brainspeedtech.swarm.sm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.brainspeedtech.swarm.sm.impl.TransitionImpl
		 * @see com.brainspeedtech.swarm.sm.impl.SmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

	}

} //SmPackage
