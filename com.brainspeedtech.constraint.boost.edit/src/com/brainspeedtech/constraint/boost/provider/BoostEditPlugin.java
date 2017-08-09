/**
 * <copyright>
 * Copyright @2011-2013 BrainSpeed Technologies - All rights reserved
 * </copyright>
 *
 * $Id$
 */
package com.brainspeedtech.constraint.boost.provider;

import com.brainspeedtech.struct.provider.StructEditPlugin;
import com.brainspeedtech.swarm.flow.provider.FlowEditPlugin;
import com.brainspeedtech.swarm.inst.provider.InstEditPlugin;
import com.brainspeedtech.swarm.layer.provider.LayerEditPlugin;

import com.brainspeedtech.swarm.master.provider.MasterEditPlugin;
import com.brainspeedtech.swarm.sm.provider.SmEditPlugin;
import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Boost edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class BoostEditPlugin extends EMFPlugin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright @2011-2013 BrainSpeed Technologies - All rights reserved";

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BoostEditPlugin INSTANCE = new BoostEditPlugin();

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
	public BoostEditPlugin() {
		super
		  (new ResourceLocator [] {
		     FlowEditPlugin.INSTANCE,
		     InstEditPlugin.INSTANCE,
		     LayerEditPlugin.INSTANCE,
		     MasterEditPlugin.INSTANCE,
		     StructEditPlugin.INSTANCE,
		     SmEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
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
