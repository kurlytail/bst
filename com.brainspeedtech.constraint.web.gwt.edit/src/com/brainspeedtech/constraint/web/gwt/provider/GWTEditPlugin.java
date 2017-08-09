/**
 */
package com.brainspeedtech.constraint.web.gwt.provider;

import com.brainspeedtech.struct.provider.StructEditPlugin;

import com.brainspeedtech.swarm.flow.provider.FlowEditPlugin;

import com.brainspeedtech.swarm.inst.provider.InstEditPlugin;

import com.brainspeedtech.swarm.layer.provider.LayerEditPlugin;

import com.brainspeedtech.swarm.master.provider.MasterEditPlugin;

import com.brainspeedtech.swarm.sm.provider.SmEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the GWT edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class GWTEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GWTEditPlugin INSTANCE = new GWTEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GWTEditPlugin() {
		super
		  (new ResourceLocator [] {
		     FlowEditPlugin.INSTANCE,
		     InstEditPlugin.INSTANCE,
		     LayerEditPlugin.INSTANCE,
		     MasterEditPlugin.INSTANCE,
		     SmEditPlugin.INSTANCE,
		     StructEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
