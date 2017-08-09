/**
 * <copyright>
 * Copyright @2011-2013 BrainSpeed Technologies - All rights reserved
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.boost.provider;


import com.brainspeedtech.constraint.boost.BoostFactory;
import com.brainspeedtech.constraint.boost.BoostPackage;
import com.brainspeedtech.constraint.boost.TCPSocketTube;

import com.brainspeedtech.swarm.layer.LayerPackage;
import com.brainspeedtech.swarm.layer.provider.ConstraintBaseItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.brainspeedtech.constraint.boost.TCPSocketTube} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TCPSocketTubeItemProvider
	extends ConstraintBaseItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright @2011-2013 BrainSpeed Technologies - All rights reserved";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCPSocketTubeItemProvider(AdapterFactory adapterFactory) {
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

			addTubePropertyDescriptor(object);
			addClientReceiverPropertyDescriptor(object);
			addServerIPPropertyDescriptor(object);
			addServerPortPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tube feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTubePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPSocketTube_tube_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPSocketTube_tube_feature", "_UI_TCPSocketTube_type"),
				 BoostPackage.Literals.TCP_SOCKET_TUBE__TUBE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Receiver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientReceiverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPSocketTube_clientReceiver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPSocketTube_clientReceiver_feature", "_UI_TCPSocketTube_type"),
				 BoostPackage.Literals.TCP_SOCKET_TUBE__CLIENT_RECEIVER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server IP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerIPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPSocketTube_serverIP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPSocketTube_serverIP_feature", "_UI_TCPSocketTube_type"),
				 BoostPackage.Literals.TCP_SOCKET_TUBE__SERVER_IP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TCPSocketTube_serverPort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TCPSocketTube_serverPort_feature", "_UI_TCPSocketTube_type"),
				 BoostPackage.Literals.TCP_SOCKET_TUBE__SERVER_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TCPSocketTube.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TCPSocketTube"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TCPSocketTube tcpSocketTube = (TCPSocketTube)object;
		return getString("_UI_TCPSocketTube_type") + " " + tcpSocketTube.isApplyToAllNatures();
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

		switch (notification.getFeatureID(TCPSocketTube.class)) {
			case BoostPackage.TCP_SOCKET_TUBE__CLIENT_RECEIVER:
			case BoostPackage.TCP_SOCKET_TUBE__SERVER_IP:
			case BoostPackage.TCP_SOCKET_TUBE__SERVER_PORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
				(LayerPackage.Literals.CONSTRAINT_BASE__EXCEPT_FOR,
				 BoostFactory.eINSTANCE.createBoostNature()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BoostEditPlugin.INSTANCE;
	}

}
