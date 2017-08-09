/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.views;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.net.ssl.SSLEngineResult.Status;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ViewPart;

import com.brainspeedtech.swarm.layer.CrossReference;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;
import com.brainspeedtech.swarm.project.util.ProjectUtil;

public class LayerView extends ViewPart implements ISelectionListener {

	private HashSet<EObject> currentObjects = new HashSet<EObject>();
	private ComposedAdapterFactory allFactories;
	private Table table;
	private TableViewer tableViewer;
	private TableColumn column_1;

	public LayerView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (!(selection instanceof IStructuredSelection))
			return;

		Set<EObject> objects = new HashSet<EObject>();
		Set<EObject> finalObjects = new HashSet<EObject>();
		Set<Resource> resourceSet = new HashSet<Resource>();
		IStructuredSelection sel = (IStructuredSelection) selection;
		Iterator<?> it = sel.iterator();
		currentObjects.clear();

		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof EditPart) {
				EditPart editPart = (EditPart) obj;
				obj = editPart.getModel();
			}

			if (obj instanceof View) {
				View view = (View) obj;
				obj = view.getElement();
			}

			if (obj instanceof EObject) {
				EObject eobj = (EObject) obj;
				IFile file = WorkspaceSynchronizer.getFile(eobj.eResource());
				TransactionalEditingDomain domain = SwarmEditingDomainFactory
						.getEditingDomain(file);
				Resource resource = domain.getResourceSet().getResource(
						eobj.eResource().getURI(), true);
				eobj = resource.getEObject(eobj.eResource()
						.getURIFragment(eobj));

				if (eobj == null)
					continue;

				EcoreUtil.resolveAll(eobj);
				objects.add(eobj);
				Iterator<EObject> iterator = eobj.eCrossReferences().iterator();
				while (iterator.hasNext()) {
					EObject childObj = iterator.next();
					finalObjects.add(childObj);
				}
				resourceSet.add(eobj.eResource());
			}

		}
		finalObjects.addAll(ProjectUtil.getReferringInstances(objects));
		for(CrossReference crossReference: ProjectUtil.getReferringInstances(objects, CrossReference.class)) {
			finalObjects.addAll(crossReference.getObject());
		}
		for (EObject obj : finalObjects) {
			if (!resourceSet.contains(obj.eResource())) {
				currentObjects.add(obj);
			}
		}
		tableViewer.refresh();
	}

	@Override
	public void createPartControl(Composite parent) {

		tableViewer = new TableViewer(parent);
		table = tableViewer.getTable();

		TableColumn column = new TableColumn(table, SWT.NONE);
		column.setWidth(186);
		column.setText("Associations");
		column_1 = new TableColumn(table, SWT.NONE);
		column_1.setWidth(170);
		column_1.setText("Resource");

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn tblclmnCategory = new TableColumn(table, SWT.SINGLE);
		tblclmnCategory.setWidth(100);
		tblclmnCategory.setText("Category");
		ISelectionService service = (ISelectionService) getSite().getService(
				ISelectionService.class);
		if (service != null) {
			service.addSelectionListener(this);
		}

		allFactories = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		tableViewer.setContentProvider(new IStructuredContentProvider() {

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
				if (inputElement == currentObjects) {
					return currentObjects.toArray();
				}

				return new Object[0];
			}
		});

		tableViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				allFactories));
		tableViewer.setInput(currentObjects);

		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDoubleClick(MouseEvent selection) {
				if (!(selection.widget instanceof Table))
					return;
				Table table = (Table) selection.widget;
				if (table.getSelection().length == 0)
					return;

				TableItem item = table.getSelection()[0];
				Object obj = item.getData();
				if (!(obj instanceof EObject))
					return;

				final EObject object = (EObject) obj;
				try {
					IEditorDescriptor descriptor = EditUIUtil.getDefaultEditor(
							object.eResource().getURI(), null);
					IWorkbench workbench = PlatformUI.getWorkbench();
					IWorkbenchPage page = workbench.getActiveWorkbenchWindow()
							.getActivePage();
					IEditorPart editor = page.openEditor(
							new FileEditorInput(WorkspaceSynchronizer
									.getFile(object.eResource())), descriptor
									.getId());
					if(editor != null) {
						final IGotoMarker gotoMarker = (IGotoMarker) editor.getAdapter(IGotoMarker.class);
						if(gotoMarker != null) {
							
							Job job = new Job("Goto Marker") {
								
								@Override
								protected IStatus run(IProgressMonitor monitor) {
										getSite().getShell().getDisplay().asyncExec(new Runnable() {
											public void run() {
												IMarker marker;
												try {
													marker = WorkspaceSynchronizer.getFile(object.eResource()).createMarker("com.brainspeedtech.swarm.project.gotoMarker");
													marker.setAttribute("com.brainspeedtech.swarm.project.goto.Object", object.eResource().getURIFragment(object).toString());
													marker.setAttribute(org.eclipse.gmf.runtime.common.core.resources.IMarker.ELEMENT_ID, object.eResource().getURIFragment(object).toString());
													marker.setAttribute(IMarker.TRANSIENT, true);
													gotoMarker.gotoMarker(marker);
													marker.delete();
												} catch (CoreException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
										});
									return org.eclipse.core.runtime.Status.OK_STATUS;
								}
							};
							job.setRule(WorkspaceSynchronizer.getFile(object.eResource()).getWorkspace().getRuleFactory().buildRule());
							job.schedule();
						}
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		table.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent selection) {
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				widgetSelected(arg0);
			}
		});
	}

	@Override
	public void setFocus() {
		table.setFocus();
	}

}
