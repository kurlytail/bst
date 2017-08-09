/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.views;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import com.brainspeedtech.swarm.layer.ConstraintBase;
import com.brainspeedtech.swarm.project.eclipse.LayerUtil;

public class LayerDialog extends Dialog {
	private Table table;
	private EObject object;
	private Collection<ConstraintBase> constraints;
	private CheckboxTableViewer checkboxTableViewer;
	private Composite composite;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @param eobj
	 */
	public LayerDialog(Shell parentShell, EObject eobj) {
		super(parentShell);
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE);
		object = eobj;
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));

		SashForm sashForm = new SashForm(container, SWT.NONE);

		checkboxTableViewer = CheckboxTableViewer.newCheckList(sashForm,
				SWT.BORDER | SWT.FULL_SELECTION);
		table = checkboxTableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(
				checkboxTableViewer, SWT.NONE);
		TableColumn tblclmnConstraints = tableViewerColumn.getColumn();
		tblclmnConstraints.setWidth(100);
		tblclmnConstraints.setText("Constraints");

		composite = new Composite(sashForm, SWT.NONE);
		sashForm.setWeights(new int[] { 1, 1 });

		createTableEntries();

		return container;
	}

	private void createTableEntries() {

		/* Get all class structures that can hold a reference to the selected
		 * object
		 */
		Collection<EClass> allConstraints = LayerUtil.getPotentialConstraints(object);

		/* Get all constraint references to the selected object */
		constraints = com.brainspeedtech.swarm.project.util.ProjectUtil.getReferringInstances(object,
				ConstraintBase.class);
		
		/* Remove the class structures for all constraints that had already 
		 * been instantiated
		 */
		for(ConstraintBase base: constraints) {
			allConstraints.remove(base.eClass());
		}
		
		/* Create place holder constraints for all uninstantiated constraint
		 * classes
		 */
		for(EClass clazz: allConstraints) {
			EObject obj = clazz.getEPackage().getEFactoryInstance().create(clazz);
			constraints.add((ConstraintBase)obj);
		}
		
		ComposedAdapterFactory allFactories = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		checkboxTableViewer
				.setContentProvider(new IStructuredContentProvider() {

					@Override
					public void inputChanged(Viewer viewer, Object oldInput,
							Object newInput) {
						// TODO Auto-generated method stub

					}

					@Override
					public void dispose() {
						// TODO Auto-generated method stub

					}

					@Override
					public Object[] getElements(Object inputElement) {
						// TODO Auto-generated method stub
						if (inputElement == constraints) {
							return constraints.toArray();
						}

						return new Object[0];
					}
				});

		checkboxTableViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				allFactories));
		checkboxTableViewer.setCheckStateProvider(new ICheckStateProvider() {

			@Override
			public boolean isGrayed(Object element) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isChecked(Object element) {
				EObject eObject = (EObject) element;
				if (eObject.eCrossReferences().contains(object))
					return true;
				return false;
			}
		});

		checkboxTableViewer.setInput(constraints);
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button button = createButton(parent, IDialogConstants.OK_ID,
				IDialogConstants.OK_LABEL, true);
		button.setText("Close");
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(741, 520);
	}
}
