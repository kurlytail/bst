/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.software.opencl.util;

import com.brainspeedtech.constraint.software.opencl.*;

import com.brainspeedtech.swarm.layer.ConstraintBase;
import com.brainspeedtech.swarm.layer.NatureBase;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.constraint.software.opencl.OpenclPackage
 * @generated
 */
public class OpenclAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenclPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenclAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OpenclPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenclSwitch modelSwitch =
		new OpenclSwitch() {
			public Object caseCustomOpenCLTube(CustomOpenCLTube object) {
				return createCustomOpenCLTubeAdapter();
			}
			public Object caseIgnoreOpenCLTube(IgnoreOpenCLTube object) {
				return createIgnoreOpenCLTubeAdapter();
			}
			public Object caseOpenCLGenerator(OpenCLGenerator object) {
				return createOpenCLGeneratorAdapter();
			}
			public Object caseConstraintBase(ConstraintBase object) {
				return createConstraintBaseAdapter();
			}
			public Object caseNatureBase(NatureBase object) {
				return createNatureBaseAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.opencl.CustomOpenCLTube <em>Custom Open CL Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.opencl.CustomOpenCLTube
	 * @generated
	 */
	public Adapter createCustomOpenCLTubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.opencl.IgnoreOpenCLTube <em>Ignore Open CL Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.opencl.IgnoreOpenCLTube
	 * @generated
	 */
	public Adapter createIgnoreOpenCLTubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.constraint.software.opencl.OpenCLGenerator <em>Open CL Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.constraint.software.opencl.OpenCLGenerator
	 * @generated
	 */
	public Adapter createOpenCLGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.ConstraintBase <em>Constraint Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.ConstraintBase
	 * @generated
	 */
	public Adapter createConstraintBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.NatureBase <em>Nature Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.NatureBase
	 * @generated
	 */
	public Adapter createNatureBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OpenclAdapterFactory
