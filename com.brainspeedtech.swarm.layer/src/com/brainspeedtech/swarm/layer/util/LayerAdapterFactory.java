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
package com.brainspeedtech.swarm.layer.util;

import com.brainspeedtech.swarm.layer.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.layer.LayerPackage
 * @generated
 */
public class LayerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LayerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LayerPackage.eINSTANCE;
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
	@Override
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
	protected LayerSwitch<Adapter> modelSwitch =
		new LayerSwitch<Adapter>() {
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseCellCounter(CellCounter object) {
				return createCellCounterAdapter();
			}
			@Override
			public Adapter caseCellInstanceCount(CellInstanceCount object) {
				return createCellInstanceCountAdapter();
			}
			@Override
			public Adapter caseConstraintBase(ConstraintBase object) {
				return createConstraintBaseAdapter();
			}
			@Override
			public Adapter caseConvertMasterToSM(ConvertMasterToSM object) {
				return createConvertMasterToSMAdapter();
			}
			@Override
			public Adapter caseCounter(Counter object) {
				return createCounterAdapter();
			}
			@Override
			public Adapter caseCrossReference(CrossReference object) {
				return createCrossReferenceAdapter();
			}
			@Override
			public Adapter caseCustom(Custom object) {
				return createCustomAdapter();
			}
			@Override
			public Adapter caseCustomTube(CustomTube object) {
				return createCustomTubeAdapter();
			}
			@Override
			public Adapter caseExternalCell(ExternalCell object) {
				return createExternalCellAdapter();
			}
			@Override
			public Adapter caseFileReference(FileReference object) {
				return createFileReferenceAdapter();
			}
			@Override
			public Adapter caseFlowAnalysisAndMerge(FlowAnalysisAndMerge object) {
				return createFlowAnalysisAndMergeAdapter();
			}
			@Override
			public Adapter caseIgnoreCell(IgnoreCell object) {
				return createIgnoreCellAdapter();
			}
			@Override
			public Adapter caseIgnoreFlow(IgnoreFlow object) {
				return createIgnoreFlowAdapter();
			}
			@Override
			public Adapter caseIgnoreTube(IgnoreTube object) {
				return createIgnoreTubeAdapter();
			}
			@Override
			public Adapter caseInstanceTransform(InstanceTransform object) {
				return createInstanceTransformAdapter();
			}
			@Override
			public Adapter caseLayer(Layer object) {
				return createLayerAdapter();
			}
			@Override
			public Adapter caseMatchingFlows(MatchingFlows object) {
				return createMatchingFlowsAdapter();
			}
			@Override
			public Adapter caseModelReference(ModelReference object) {
				return createModelReferenceAdapter();
			}
			@Override
			public Adapter caseNatureBase(NatureBase object) {
				return createNatureBaseAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseProjectPrefixString(ProjectPrefixString object) {
				return createProjectPrefixStringAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseQueueDepth(QueueDepth object) {
				return createQueueDepthAdapter();
			}
			@Override
			public Adapter caseStreamingTube(StreamingTube object) {
				return createStreamingTubeAdapter();
			}
			@Override
			public Adapter caseTap(Tap object) {
				return createTapAdapter();
			}
			@Override
			public Adapter caseTemplate(Template object) {
				return createTemplateAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseTubeDescriptorLog(TubeDescriptorLog object) {
				return createTubeDescriptorLogAdapter();
			}
			@Override
			public Adapter caseTubeInstanceCount(TubeInstanceCount object) {
				return createTubeInstanceCountAdapter();
			}
			@Override
			public Adapter caseTubeReceiveCounter(TubeReceiveCounter object) {
				return createTubeReceiveCounterAdapter();
			}
			@Override
			public Adapter caseTubeTransmitCounter(TubeTransmitCounter object) {
				return createTubeTransmitCounterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.CellCounter <em>Cell Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.CellCounter
	 * @generated
	 */
	public Adapter createCellCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.CellInstanceCount <em>Cell Instance Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.CellInstanceCount
	 * @generated
	 */
	public Adapter createCellInstanceCountAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.ConvertMasterToSM <em>Convert Master To SM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.ConvertMasterToSM
	 * @generated
	 */
	public Adapter createConvertMasterToSMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.Counter
	 * @generated
	 */
	public Adapter createCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.CrossReference <em>Cross Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.CrossReference
	 * @generated
	 */
	public Adapter createCrossReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.Custom
	 * @generated
	 */
	public Adapter createCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.CustomTube <em>Custom Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.CustomTube
	 * @generated
	 */
	public Adapter createCustomTubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.ExternalCell <em>External Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.ExternalCell
	 * @generated
	 */
	public Adapter createExternalCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.FileReference <em>File Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.FileReference
	 * @generated
	 */
	public Adapter createFileReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.FlowAnalysisAndMerge <em>Flow Analysis And Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.FlowAnalysisAndMerge
	 * @generated
	 */
	public Adapter createFlowAnalysisAndMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.IgnoreCell <em>Ignore Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.IgnoreCell
	 * @generated
	 */
	public Adapter createIgnoreCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.IgnoreFlow <em>Ignore Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.IgnoreFlow
	 * @generated
	 */
	public Adapter createIgnoreFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.IgnoreTube <em>Ignore Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.IgnoreTube
	 * @generated
	 */
	public Adapter createIgnoreTubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.InstanceTransform <em>Instance Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.InstanceTransform
	 * @generated
	 */
	public Adapter createInstanceTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.MatchingFlows <em>Matching Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.MatchingFlows
	 * @generated
	 */
	public Adapter createMatchingFlowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.ModelReference
	 * @generated
	 */
	public Adapter createModelReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.ProjectPrefixString <em>Project Prefix String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.ProjectPrefixString
	 * @generated
	 */
	public Adapter createProjectPrefixStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.QueueDepth <em>Queue Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.QueueDepth
	 * @generated
	 */
	public Adapter createQueueDepthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.StreamingTube <em>Streaming Tube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.StreamingTube
	 * @generated
	 */
	public Adapter createStreamingTubeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.Tap <em>Tap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.Tap
	 * @generated
	 */
	public Adapter createTapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.TubeDescriptorLog <em>Tube Descriptor Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.TubeDescriptorLog
	 * @generated
	 */
	public Adapter createTubeDescriptorLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.TubeInstanceCount <em>Tube Instance Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.TubeInstanceCount
	 * @generated
	 */
	public Adapter createTubeInstanceCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.TubeReceiveCounter <em>Tube Receive Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.TubeReceiveCounter
	 * @generated
	 */
	public Adapter createTubeReceiveCounterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.brainspeedtech.swarm.layer.TubeTransmitCounter <em>Tube Transmit Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.brainspeedtech.swarm.layer.TubeTransmitCounter
	 * @generated
	 */
	public Adapter createTubeTransmitCounterAdapter() {
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

} //LayerAdapterFactory
