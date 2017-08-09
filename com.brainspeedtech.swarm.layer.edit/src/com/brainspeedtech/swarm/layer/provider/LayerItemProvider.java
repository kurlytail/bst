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
package com.brainspeedtech.swarm.layer.provider;


import com.brainspeedtech.swarm.layer.Layer;
import com.brainspeedtech.swarm.layer.LayerFactory;
import com.brainspeedtech.swarm.layer.LayerPackage;
import com.brainspeedtech.swarm.project.providers.SwarmElementTableProvider;
import com.brainspeedtech.swarm.project.validation.ProblemDecoratorItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemFontProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.brainspeedtech.swarm.layer.Layer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayerItemProvider
	extends SwarmElementTableProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider,
		ITableItemColorProvider,
		ITableItemFontProvider,
		IItemColorProvider,
		IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layer_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layer_name_feature", "_UI_Layer_type"),
				 LayerPackage.Literals.LAYER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LayerPackage.Literals.LAYER__CONSTRAINT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Layer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Layer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Layer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Layer_type") :
			getString("_UI_Layer_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Layer.class)) {
			case LayerPackage.LAYER__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LayerPackage.LAYER__CONSTRAINT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createCounter()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createCellCounter()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createCellInstanceCount()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createConvertMasterToSM()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createCrossReference()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createCustom()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createCustomTube()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createExternalCell()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createFileReference()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createIgnoreCell()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createIgnoreFlow()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createIgnoreTube()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createMatchingFlows()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createModelReference()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createProjectPrefixString()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createQueueDepth()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createStreamingTube()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createTap()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createTubeDescriptorLog()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createTubeInstanceCount()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createTubeReceiveCounter()));

		newChildDescriptors.add
			(createChildParameter
				(LayerPackage.Literals.LAYER__CONSTRAINT,
				 LayerFactory.eINSTANCE.createTubeTransmitCounter()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
