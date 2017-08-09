/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.master.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import com.brainspeedtech.swarm.master.diagram.providers.MasterElementTypes;

/**
 * @generated
 */
public class MasterPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMaster1Group());
	}

	/**
	 * Creates "master" palette tool group
	 * @generated
	 */
	private PaletteContainer createMaster1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Master1Group_title);
		paletteContainer.setId("createMaster1Group"); //$NON-NLS-1$
		paletteContainer.add(createMasterCell1CreationTool());
		paletteContainer.add(createMasterTube2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMasterCell1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MasterCell1CreationTool_title,
				Messages.MasterCell1CreationTool_desc,
				Collections.singletonList(MasterElementTypes.MasterCell_2002));
		entry.setId("createMasterCell1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MasterElementTypes
				.getImageDescriptor(MasterElementTypes.MasterCell_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMasterTube2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.MasterTube2CreationTool_title,
				Messages.MasterTube2CreationTool_desc,
				Collections.singletonList(MasterElementTypes.MasterTube_4002));
		entry.setId("createMasterTube2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MasterElementTypes
				.getImageDescriptor(MasterElementTypes.MasterTube_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
