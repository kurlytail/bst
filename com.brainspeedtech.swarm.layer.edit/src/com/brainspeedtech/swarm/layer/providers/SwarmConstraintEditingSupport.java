/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.layer.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;

import com.brainspeedtech.swarm.project.util.ProjectUtil;

public class SwarmConstraintEditingSupport extends EditingSupport {

	private EReference referenceAttribute;
	private EObject object;
	
	public SwarmConstraintEditingSupport(ColumnViewer viewer,
			EReference eReference) {
		super(viewer);
		this.referenceAttribute = eReference;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		if (!(element instanceof EObject))
			return null;
		
		this.object = (EObject)element;
		
		ConstraintDialogCellEditor editor = new ConstraintDialogCellEditor((Composite) getViewer().getControl(),
				object);
		return editor;
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		EObject constraint = 
				ProjectUtil.getReferringInstance(object, (Class<? extends EObject>)referenceAttribute.getContainerClass());

		return constraint;
	}

	@Override
	protected void setValue(Object element, Object value) {
	}

}
