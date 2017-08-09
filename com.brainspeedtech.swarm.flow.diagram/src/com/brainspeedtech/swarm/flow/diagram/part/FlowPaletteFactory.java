/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.flow.diagram.part;

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

import com.brainspeedtech.swarm.flow.diagram.providers.FlowElementTypes;

/**
 * @generated
 */
public class FlowPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createFlow1Group());
	}

	/**
	 * Creates "flow" palette tool group
	 * @generated
	 */
	private PaletteContainer createFlow1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Flow1Group_title);
		paletteContainer.setId("createFlow1Group"); //$NON-NLS-1$
		paletteContainer.add(createCell1CreationTool());
		paletteContainer.add(createTube2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCell1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Cell1CreationTool_title,
				Messages.Cell1CreationTool_desc,
				Collections.singletonList(FlowElementTypes.Cell_2001));
		entry.setId("createCell1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FlowElementTypes
				.getImageDescriptor(FlowElementTypes.Cell_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTube2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Tube2CreationTool_title,
				Messages.Tube2CreationTool_desc,
				Collections.singletonList(FlowElementTypes.Tube_4001));
		entry.setId("createTube2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FlowElementTypes
				.getImageDescriptor(FlowElementTypes.Tube_4001));
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
