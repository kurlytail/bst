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
package com.brainspeedtech.swarm.layer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.brainspeedtech.swarm.layer.LayerPackage
 * @generated
 */
public interface LayerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayerFactory eINSTANCE = com.brainspeedtech.swarm.layer.impl.LayerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Cell Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell Counter</em>'.
	 * @generated
	 */
	CellCounter createCellCounter();

	/**
	 * Returns a new object of class '<em>Cell Instance Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cell Instance Count</em>'.
	 * @generated
	 */
	CellInstanceCount createCellInstanceCount();

	/**
	 * Returns a new object of class '<em>Convert Master To SM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert Master To SM</em>'.
	 * @generated
	 */
	ConvertMasterToSM createConvertMasterToSM();

	/**
	 * Returns a new object of class '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter</em>'.
	 * @generated
	 */
	Counter createCounter();

	/**
	 * Returns a new object of class '<em>Cross Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Reference</em>'.
	 * @generated
	 */
	CrossReference createCrossReference();

	/**
	 * Returns a new object of class '<em>Custom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom</em>'.
	 * @generated
	 */
	Custom createCustom();

	/**
	 * Returns a new object of class '<em>Custom Tube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Tube</em>'.
	 * @generated
	 */
	CustomTube createCustomTube();

	/**
	 * Returns a new object of class '<em>External Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Cell</em>'.
	 * @generated
	 */
	ExternalCell createExternalCell();

	/**
	 * Returns a new object of class '<em>File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Reference</em>'.
	 * @generated
	 */
	FileReference createFileReference();

	/**
	 * Returns a new object of class '<em>Flow Analysis And Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Analysis And Merge</em>'.
	 * @generated
	 */
	FlowAnalysisAndMerge createFlowAnalysisAndMerge();

	/**
	 * Returns a new object of class '<em>Ignore Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ignore Cell</em>'.
	 * @generated
	 */
	IgnoreCell createIgnoreCell();

	/**
	 * Returns a new object of class '<em>Ignore Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ignore Flow</em>'.
	 * @generated
	 */
	IgnoreFlow createIgnoreFlow();

	/**
	 * Returns a new object of class '<em>Ignore Tube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ignore Tube</em>'.
	 * @generated
	 */
	IgnoreTube createIgnoreTube();

	/**
	 * Returns a new object of class '<em>Instance Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Transform</em>'.
	 * @generated
	 */
	InstanceTransform createInstanceTransform();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	Layer createLayer();

	/**
	 * Returns a new object of class '<em>Matching Flows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matching Flows</em>'.
	 * @generated
	 */
	MatchingFlows createMatchingFlows();

	/**
	 * Returns a new object of class '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Reference</em>'.
	 * @generated
	 */
	ModelReference createModelReference();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Project Prefix String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Prefix String</em>'.
	 * @generated
	 */
	ProjectPrefixString createProjectPrefixString();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Queue Depth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue Depth</em>'.
	 * @generated
	 */
	QueueDepth createQueueDepth();

	/**
	 * Returns a new object of class '<em>Streaming Tube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Streaming Tube</em>'.
	 * @generated
	 */
	StreamingTube createStreamingTube();

	/**
	 * Returns a new object of class '<em>Tap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tap</em>'.
	 * @generated
	 */
	Tap createTap();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	Template createTemplate();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Tube Descriptor Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tube Descriptor Log</em>'.
	 * @generated
	 */
	TubeDescriptorLog createTubeDescriptorLog();

	/**
	 * Returns a new object of class '<em>Tube Instance Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tube Instance Count</em>'.
	 * @generated
	 */
	TubeInstanceCount createTubeInstanceCount();

	/**
	 * Returns a new object of class '<em>Tube Receive Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tube Receive Counter</em>'.
	 * @generated
	 */
	TubeReceiveCounter createTubeReceiveCounter();

	/**
	 * Returns a new object of class '<em>Tube Transmit Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tube Transmit Counter</em>'.
	 * @generated
	 */
	TubeTransmitCounter createTubeTransmitCounter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LayerPackage getLayerPackage();

} //LayerFactory
