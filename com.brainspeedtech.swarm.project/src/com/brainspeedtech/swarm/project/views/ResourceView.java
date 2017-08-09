/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.views;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;

import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class ResourceView extends ViewPart implements ISelectionListener {

	public static final String ID = "com.brainspeedtech.swarm.project.views.ResourceView"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private TransactionalEditingDomain domain = null;
	private List<Resource> resources;
	private Table table;

	public ResourceView() {
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		{
			table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
			toolkit.adapt(table);
			toolkit.paintBordersFor(table);
			table.setHeaderVisible(true);
			table.setLinesVisible(true);
			{
				TableColumn tblclmnResource = new TableColumn(table, SWT.NONE);
				tblclmnResource.setWidth(100);
				tblclmnResource.setText("Resource");
			}
		}

		createActions();
		initializeToolBar();
		initializeMenu();
		initializeHandlers();
	}

	private void initializeHandlers() {
		ISelectionService service = (ISelectionService) getSite().getService(
				ISelectionService.class);
		if (service != null) {
			service.addSelectionListener(this);
		}
	}

	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		@SuppressWarnings("unused")
		IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		@SuppressWarnings("unused")
		IMenuManager manager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {

		if (!(selection instanceof IStructuredSelection))
			return;

		IStructuredSelection sel = (IStructuredSelection) selection;
		IProject project = null;
		@SuppressWarnings("unchecked")
		Iterator<Object> it = sel.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof EObject) {
				EObject eobj = (EObject) obj;
				if (eobj.eResource() != null) {
					project = WorkspaceSynchronizer.getFile(eobj.eResource())
							.getProject();
				}
			}

			if (obj instanceof IResource) {
				IResource res = (IResource) obj;
				project = res.getProject();
			}

			if (obj instanceof IEditorPart) {
				IEditorPart editorPart = (IEditorPart) obj;
				if (editorPart.getEditorInput() instanceof IFileEditorInput) {
					project = ((IFileEditorInput) editorPart.getEditorInput())
							.getFile().getProject();
				}
			}

			if (project != null)
				break;
		}

		if (project != null) {
			TransactionalEditingDomain currentDomain = SwarmEditingDomainFactory
					.getEditingDomain(project);
			if (currentDomain != domain) {
				domain = currentDomain;
				refreshlist();
			}
		} else {
			domain = null;
			refreshlist();
		}
	}

	private void refreshlist() {

		table.removeAll();

		if (domain == null) {
			resources = null;
		} else {
			resources = new LinkedList<Resource>();
			resources.addAll(domain.getResourceSet().getResources());
		}

		if (resources != null) {
			for (Resource resource : resources) {
				TableItem item = new TableItem(table, SWT.NONE);
				item.setText(0, resource.getURI().toString());
			}
		}
	}

}
