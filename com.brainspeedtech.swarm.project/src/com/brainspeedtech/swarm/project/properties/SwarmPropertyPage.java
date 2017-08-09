/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.properties;

import java.util.ArrayList;

import org.eclipse.core.internal.resources.NatureManager;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNatureDescriptor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.statushandlers.StatusManager;

import com.brainspeedtech.swarm.project.Activator;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.CheckStateChangedEvent;

public class SwarmPropertyPage extends PropertyPage {
	private Composite composite;
	private Tree tree;

	/**
	 * Constructor for SamplePropertyPage.
	 */
	public SwarmPropertyPage() {
		super();
		setTitle("Swarm");
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		composite = new Composite(parent, SWT.NONE);
		GridLayout gl_composite = new GridLayout();
		composite.setLayout(gl_composite);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);
		
		CheckboxTreeViewer checkboxTreeViewer = new CheckboxTreeViewer(composite, SWT.BORDER);
		checkboxTreeViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				IProjectNatureDescriptor nature = (IProjectNatureDescriptor)event.getElement();
				if (event.getChecked()) {
					checkNature(nature.getNatureId(), true);
				} else {
					unCheckNature(nature.getNatureId());
				}
			}
		});
		
		tree = checkboxTreeViewer.getTree();
		tree.setLinesVisible(true);
		tree.setHeaderVisible(true);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(checkboxTreeViewer, SWT.NONE);
		TreeColumn trclmnDomain = treeViewerColumn.getColumn();
		trclmnDomain.setWidth(152);
		trclmnDomain.setText("Enabled Natures");
		
		discoverProject();
		
		return composite;
	}

	protected void unCheckNature(String natureId) {
		for(TreeItem item: tree.getItems()) {
			IProjectNatureDescriptor nature = (IProjectNatureDescriptor)item.getData();
			if (nature.getNatureId().equals(natureId)) {
				item.setChecked(false);
				if (item.getParentItem() != null) {
					IProjectNatureDescriptor pNature = (IProjectNatureDescriptor)item.getParentItem().getData();
					unCheckNature(pNature.getNatureId());
				}
			}
			
			unCheckNature(item, natureId);
		}
		
	}

	private void unCheckNature(TreeItem pItem, String natureId) {
		for(TreeItem item: pItem.getItems()) {
			IProjectNatureDescriptor nature = (IProjectNatureDescriptor)item.getData();
			if (nature.getNatureId().equals(natureId)) {
				item.setChecked(false);
				if (item.getParentItem() != null) {
					IProjectNatureDescriptor pNature = (IProjectNatureDescriptor)item.getParentItem().getData();
					unCheckNature(pNature.getNatureId());
				}
			}
			
			unCheckNature(item, natureId);
		}	
	}

	private void discoverProject() {
		IProject project = (IProject)getElement();
		IProjectNatureDescriptor[] natures = project.getWorkspace().getNatureDescriptors();
		
		for(IProjectNatureDescriptor nature: natures) {
			if (!(nature.getNatureId().startsWith("com.brainspeedtech") ||
					nature.getNatureId().startsWith("com.bst") ||
					nature.getNatureId().startsWith("com.mangstor")))
				continue;
			
			TreeItem treeItem = new TreeItem(tree, SWT.NONE);
			treeItem.setText(nature.getLabel());
			treeItem.setData(nature);
			
			for(String child: nature.getRequiredNatureIds()) {
				downCreate(treeItem, child);
			}
			//treeItem.setExpanded(true);

		}
		
		
		try {
			String[] enabledNatures = SwarmEditingDomainFactory.getNatures(project);
			for (String eNature:enabledNatures) {
				checkNature(eNature, false);
			}
		} catch (CoreException e) {
			StatusManager.getManager().handle(e, Activator.PLUGIN_ID);
		}
	}

	private void checkNature(String eNature, boolean propagate) {
		for(TreeItem item: tree.getItems()) {
			IProjectNatureDescriptor nature = (IProjectNatureDescriptor)item.getData();
			if (nature.getNatureId().equals(eNature)) {
				item.setChecked(true);
				if (propagate) {
					for(TreeItem cItem: item.getItems()) {
						IProjectNatureDescriptor cNature = (IProjectNatureDescriptor)cItem.getData();
						checkNature(cNature.getNatureId(), true);
					}
				}
			}
			
			checkNature(item, eNature, propagate);


		}
	}

	private void checkNature(TreeItem tItem, String eNature, boolean propagate) {
		for(TreeItem item: tItem.getItems()) {
			IProjectNatureDescriptor nature = (IProjectNatureDescriptor)item.getData();
			if (nature.getNatureId().equals(eNature)) {
				item.setChecked(true);
				if (propagate) {
					for(TreeItem cItem: item.getItems()) {
						IProjectNatureDescriptor cNature = (IProjectNatureDescriptor)cItem.getData();
						checkNature(cNature.getNatureId(), true);
					}
				}
			}
			
			checkNature(item, eNature, propagate);

		}
	}

	private void downCreate(TreeItem parent, String natureid) {
		IProject project = (IProject)getElement();		
		IProjectNatureDescriptor nature = project.getWorkspace().getNatureDescriptor(natureid);
		
		TreeItem treeItem = new TreeItem(parent, SWT.NONE);
		treeItem.setText(nature.getLabel());
		treeItem.setData(nature);
		
		for(String child: nature.getRequiredNatureIds()) {
			downCreate(treeItem, child);
		}
		treeItem.setExpanded(true);

	}

	protected void performDefaults() {
		super.performDefaults();
		
		tree.clearAll(true);
		discoverProject();
	}
	
	public boolean performOk() {
		IProject project = (IProject)getElement();		

		ArrayList<String> addNatures = new ArrayList<String>();
		String[] aAddNatures = new String[]{};
		ArrayList<String> removeNatures = new ArrayList<String>();
		String[] aRemoveNatures = new String[]{};

		
		for(TreeItem item: tree.getItems()) {
			if (item.getChecked()) {
				addNatures.add(((IProjectNatureDescriptor)item.getData()).getNatureId());
			} else {
				removeNatures.add(((IProjectNatureDescriptor)item.getData()).getNatureId());				
			}
		}
		
		aAddNatures = addNatures.toArray(aAddNatures);
		aRemoveNatures = removeNatures.toArray(aRemoveNatures);
		
		try {
			SwarmEditingDomainFactory.removeNatures(project, aRemoveNatures);
			//SwarmEditingDomainFactory.removeNatures(project, aAddNatures);
			SwarmEditingDomainFactory.addNatures(project, aAddNatures);
		} catch (CoreException e) {
			StatusManager.getManager().handle(e, Activator.PLUGIN_ID);
			return false;
		}
		return true;
	}

}
