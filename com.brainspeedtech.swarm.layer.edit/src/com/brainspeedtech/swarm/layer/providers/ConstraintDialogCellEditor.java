/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.layer.providers;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.ListDialog;

import com.brainspeedtech.swarm.layer.util.LayerAdapterFactory;
import com.brainspeedtech.swarm.project.eclipse.LayerUtil;


public class ConstraintDialogCellEditor extends DialogCellEditor {
	
	private EObject object;
	public ConstraintDialogCellEditor(Composite parent, EObject object) {
		super(parent);
		this.object = object;
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		// TODO Auto-generated method stub
		ListDialog dialog = new ListDialog(
				cellEditorWindow.getShell());
		dialog.setTitle("Select Constraint");
		dialog.setContentProvider(new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer,
					Object oldInput, Object newInput) {
				// TODO Auto-generated method stub

			}

			@Override
			public void dispose() {
				// TODO Auto-generated method stub

			}

			@Override
			public Object[] getElements(Object inputElement) {
				return null;
			}
		});
		
		dialog.setLabelProvider(new AdapterFactoryLabelProvider(new LayerAdapterFactory()));

		dialog.setInput(LayerUtil.getExistingPotentialConstraints(object));
		//dialog.setInitialSelections(new Object[] { ((EObject) getObject())
		//		.eGet((EStructuralFeature) getFeature()) });
		dialog.open();
		if (dialog.getResult() != null && dialog.getResult().length > 0)
			return dialog.getResult()[0];
		else return null;
	}

}
