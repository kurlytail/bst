/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.struct.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositeSourcePropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.dialogs.ListDialog;

import com.brainspeedtech.struct.Atom;
import com.brainspeedtech.struct.EnumTerm;
import com.brainspeedtech.struct.Field;
import com.brainspeedtech.struct.Struct;
import com.brainspeedtech.struct.StructPackage;
import com.brainspeedtech.struct.util.StructUtil;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class StructTreeProvider extends
		AdapterFactoryLabelProvider.ColorProvider {

	public class StructCompositeSourcePropertyDescriptor extends
			EMFCompositeSourcePropertyDescriptor {

		public StructCompositeSourcePropertyDescriptor(Object object,
				IItemPropertyDescriptor itemPropertyDescriptor) {
			super(object, itemPropertyDescriptor);
		}

		@Override
		protected CellEditor createComboBoxCellEditor(Composite composite) {

			return new ExtendedDialogCellEditor(composite, StructTreeProvider.this) {

				@Override
				protected Object openDialogBox(Control cellEditorWindow) {

					ListDialog dialog = new ListDialog(
							cellEditorWindow.getShell());
					dialog.setTitle("Select Structure");
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
							return getChoiceOfValues().toArray();
						}
					});

					dialog.setLabelProvider(StructTreeProvider.this);
					dialog.setInput(getChoiceOfValues());
					dialog.setInitialSelections(new Object[] { ((EObject) getObject())
							.eGet((EStructuralFeature) getFeature()) });
					dialog.open();
					if (dialog.getResult() != null && dialog.getResult().length > 0)
						return dialog.getResult()[0];
					else return null;
				}
			};
		}

	}

	public class EObjectEditingSupport extends EditingSupport {

		Object[] featureIds;
		StructCompositeSourcePropertyDescriptor propertySourceDescriptor;

		public EObjectEditingSupport(ColumnViewer viewer, Object[] eFeatureIds) {
			super(viewer);
			featureIds = eFeatureIds;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			/* For now we support only text fiels */
			if (!(element instanceof EObject))
				return null;
			EObject eObj = (EObject) element;
			IItemPropertySource adapter = (IItemPropertySource) getAdapterFactory()
					.adapt(eObj, IItemPropertySource.class);

			for (Object featureId : featureIds) {
				IItemPropertyDescriptor descriptor = adapter
						.getPropertyDescriptor(eObj, featureId);
				if (descriptor != null) {
					propertySourceDescriptor = new StructCompositeSourcePropertyDescriptor(
							element, descriptor);
					CellEditor editor = propertySourceDescriptor
							.createPropertyEditor((Composite) getViewer()
									.getControl());
					return editor;
				}
			}

			return null;
		}

		@Override
		protected boolean canEdit(Object element) {
			if (!(element instanceof EObject))
				return false;
			EObject eObj = (EObject) element;
			IItemPropertySource adapter = (IItemPropertySource) getAdapterFactory()
					.adapt(eObj, IItemPropertySource.class);

			for (Object featureId : featureIds) {
				IItemPropertyDescriptor descriptor = adapter
						.getPropertyDescriptor(eObj, featureId);
				if (descriptor != null) {
					return true;
				}
			}

			return true;
		}

		@Override
		protected Object getValue(Object element) {
			return propertySourceDescriptor.getPropertyValue();
		}

		@Override
		protected void setValue(Object element, final Object value) {

			if (element == null || value == null)
				return;

			if (propertySourceDescriptor.getPropertyValue() != null)
				if (propertySourceDescriptor.getPropertyValue().equals(value))
					return;

			SwarmEditingDomainFactory.getEditingDomain((EObject) element)
					.getCommandStack()
					.execute(new ChangeCommand((Notifier) element) {

						@Override
						protected void doExecute() {
							propertySourceDescriptor.setPropertyValue(value);
						}
					});

			TreeIterator<EObject> iterator = ((EObject) element).eResource()
					.getAllContents();
			while (iterator.hasNext()) {
				getViewer().update(iterator.next(), null);
			}
			/* Refresh all the elements */
			getViewer().refresh();
		}
	}

	public StructTreeProvider(ComposedAdapterFactory adapterFactory,
			TreeViewer selectionViewer) {
		super(adapterFactory, selectionViewer);

		TreeViewerColumn column = new TreeViewerColumn(selectionViewer,
				SWT.None);
		column.getColumn().setWidth(200);
		column.getColumn().setText("Name");
		column.setEditingSupport(new EObjectEditingSupport(selectionViewer,
				new EStructuralFeature[] { StructPackage.Literals.ATOM__NAME,
						StructPackage.Literals.FIELD__NAME,
						StructPackage.Literals.ENUM_TERM__NAME }));

		column = new TreeViewerColumn(selectionViewer, SWT.None);
		column.getColumn().setWidth(200);
		column.getColumn().setText("Type");
		column.setEditingSupport(new EObjectEditingSupport(selectionViewer,
				new EStructuralFeature[] { StructPackage.Literals.FIELD__ATOM,
						StructPackage.Literals.ENUM_TERM__VALUE }));

		column = new TreeViewerColumn(selectionViewer, SWT.None);
		column.getColumn().setWidth(110);
		column.getColumn().setText("Count\n(units of Type)");
		column.setEditingSupport(new EObjectEditingSupport(
				selectionViewer,
				new EStructuralFeature[] { StructPackage.Literals.FIELD__COUNT }));

		column = new TreeViewerColumn(selectionViewer, SWT.None);
		column.getColumn().setWidth(100);
		column.getColumn().setText("Type Size\n(bits/bytes)");

		column = new TreeViewerColumn(selectionViewer, SWT.None);
		column.getColumn().setWidth(100);
		column.getColumn().setText("Total Size\n(bits/bytes)");

		column = new TreeViewerColumn(selectionViewer, SWT.None);
		column.getColumn().setWidth(25);
		column.getColumn().setText("Location");

		selectionViewer.getTree().setHeaderVisible(true);
		selectionViewer.getTree().setLinesVisible(true);
	}

	@Override
	public Image getColumnImage(Object object, int columnIndex) {
		if (columnIndex == 0)
			return super.getImage(object);
		return null;
	}

	private String getAtomName(Atom atom) {
		if (atom == null)
			return "bit";
		return atom.getName();
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		if (columnIndex == 0)
			return super.getText(object);
		long count;

		if (object instanceof Field) {
			Field struct = (Field) object;
			switch (columnIndex) {
			case 1:
				return getAtomName(struct.getAtom());
			case 2:
				return Long.toString(StructUtil.getFieldCount(struct));
			case 3:
				long atomSize = StructUtil.getAtomSize(struct.getAtom());
				return Long.toString(atomSize) + "/"
						+ Long.toString(atomSize / 8);
			case 4:
				count = StructUtil.getFieldCount(struct)
						* StructUtil.getAtomSize(struct.getAtom());
				return Long.toString(count);
			}
		}

		if (object instanceof Struct) {
			Struct struct = (Struct) object;
			switch (columnIndex) {

			case 4:
				count = StructUtil.getAtomSize(struct);
				return Long.toString(count) + "/" + Long.toString(count / 8);
			}
		}

		if (object instanceof EnumTerm) {
			EnumTerm e = (EnumTerm) object;
			switch (columnIndex) {

			case 1:
				return e.getValue();
			}
		}

		return "-";
	}

	@Override
	public AdapterFactory getAdapterFactory() {
		// TODO Auto-generated method stub
		return super.getAdapterFactory();
	}

	@Override
	public void setAdapterFactory(AdapterFactory adapterFactory) {
		// TODO Auto-generated method stub
		super.setAdapterFactory(adapterFactory);
	}

}
