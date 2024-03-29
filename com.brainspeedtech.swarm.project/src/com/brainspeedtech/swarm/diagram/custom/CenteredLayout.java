/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.diagram.custom;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

public class CenteredLayout extends StackLayout {

	@Override
	public void layout(IFigure figure) {
		Rectangle r = figure.getClientArea();
		List<?> children = figure.getChildren();
		Dimension maxDimension = new Dimension();

		IFigure child;
		Dimension d;

		for (int i = 0; i < children.size(); i++) {
			child = (IFigure) children.get(i);
			d = child.getPreferredSize();
			// d.width = Math.min(d.width, r.width);
			// d.height = Math.min(d.height, r.height);
			maxDimension.getUnioned(d);
			Rectangle childRect = new Rectangle(r.x + (r.width - d.width) / 2,
					r.y + (r.height - d.height) / 2, d.width, d.height);
			child.setBounds(childRect);
		}


	}
}
