/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.providers;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.ui.PlatformUI;

import com.brainspeedtech.swarm.project.validation.ProblemDecoratorItemProvider;

public class SwarmElementTableProvider extends ProblemDecoratorItemProvider {
	
	static Font DISABLED_FONT = null;
	static Color DISABLED_COLOR = null;

	public SwarmElementTableProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		
		if (DISABLED_FONT == null) {
			DISABLED_FONT = new Font(PlatformUI.getWorkbench().getDisplay(),
					"Arial", 11, SWT.ITALIC);
			DISABLED_COLOR = ColorConstants.lightGray;
		}
	}
	
	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		
		if (columnIndex == 0) {
			return getImage(object);
		}

		return super.getColumnImage(object, columnIndex);
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		if (columnIndex == 0) {
			return getText(object);
		}
		
		if (columnIndex == 1) {
			if (((EObject)object).eResource() != null) {
				return ((EObject)object).eResource().getURI().toString();
			} else {
				return "ORPHANED";
			}
		}
		
		return super.getColumnText(object, columnIndex);
	}
	
	private boolean isDisabled(Object object) {
		if(object instanceof EObject) {
			EObject cObject = (EObject)object;
			EList<EAttribute> attributes = cObject.eClass().getEAllAttributes();
			for(EAttribute ea: attributes) {
				if(ea.getName().equals("disabled") && ea.getEType().getName().equals("Boolean")) {
					return (Boolean) cObject.eGet(ea);
				}
			}
		}
		
		return false;
	}

	@Override
	public Object getFont(Object object) {

		if(isDisabled(object)) {
			return DISABLED_FONT;
		}
		return super.getFont(object);
	}

	@Override
	public Object getForeground(Object object) {
		if(isDisabled(object)) {
			return DISABLED_COLOR;
		}
		return super.getFont(object);
	}

}
