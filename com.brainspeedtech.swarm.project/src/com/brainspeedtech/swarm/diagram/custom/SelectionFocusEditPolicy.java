/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.diagram.custom;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.editpolicies.SelectionEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.RectangularDropShadowLineBorder;
import org.eclipse.swt.graphics.Color;

public class SelectionFocusEditPolicy extends SelectionEditPolicy {
	
	EditPart editPart;
	HashMap<IFigure, Border> borderHash = new HashMap<IFigure, Border>();
	HashMap<IFigure, Color> colorHash = new HashMap<IFigure, Color>();

	public SelectionFocusEditPolicy(EditPart cellInstanceEditPart) {
		editPart = cellInstanceEditPart;
	}

	@Override
	protected void hideSelection() {
		for(IFigure figure: borderHash.keySet()) {
			figure.setBorder(borderHash.get(figure));
		}
		borderHash.clear();
		for(IFigure figure: colorHash.keySet()) {
			figure.setForegroundColor(colorHash.get(figure));
		}
		colorHash.clear();
	}

	@Override
	protected void showSelection() {
		if(editPart instanceof ConnectionEditPart) {
			highlightNeighbors((ConnectionEditPart)editPart);
		} else if(editPart instanceof NodeEditPart) {
			highlightNeighbors((NodeEditPart)editPart);
		}
	}

	private void highlightNeighbors(NodeEditPart node) {
		HashSet<EditPart> nodes = new HashSet<EditPart>();
		HashSet<EditPart> connections = new HashSet<EditPart>();
		for(Object connection: node.getSourceConnections()) {
			if (connection == node) continue;
			
			if (connection instanceof ConnectionEditPart) {
				nodes.add(((ConnectionEditPart)connection).getTarget());
				connections.add((ConnectionEditPart)connection);
			}
		}
		for(Object connection: node.getTargetConnections()) {
			if (connection == node) continue;
			
			if (connection instanceof ConnectionEditPart) {
				nodes.add(((ConnectionEditPart)connection).getSource());
				connections.add((ConnectionEditPart)connection);
			}
		}
		
		nodes.add(node);
		
		highlightNodes(nodes.toArray());
		highlightConnections(connections.toArray());

	}

	private void highlightConnections(Object[] connections) {
		for (Object part: connections) {
			if (part == null) continue;
			if (!(part instanceof ConnectionEditPart)) continue;
			
			ConnectionEditPart connection = (ConnectionEditPart)part;
			IFigure figure = connection.getFigure();
			if (!figure.getForegroundColor().equals(ColorConstants.black)) {
				colorHash.put(figure, figure.getForegroundColor());
				figure.setForegroundColor(ColorConstants.black);
			}
		}
	}

	private void highlightNodes(Object[] nodes) {
		
		for(Object part: nodes) {
			if (part == null) continue;
			if (!(part instanceof NodeEditPart)) continue;
			NodeEditPart node = (NodeEditPart)part;
			IFigure figure = node.getFigure();

			if (!(figure.getBorder() instanceof RectangularDropShadowLineBorder)) {
				borderHash.put(figure, figure.getBorder());
				RectangularDropShadowLineBorder border = new RectangularDropShadowLineBorder(
						1);
				figure.setBorder(border);
			}
		}

	}

	private void highlightNeighbors(ConnectionEditPart connection) {
		EditPart editParts[] = new EditPart[] { 
			connection.getTarget(),
			connection.getSource()
		};
		
		highlightNodes(editParts);
		highlightConnections(new Object[] { connection } );
		
	}
	
}
