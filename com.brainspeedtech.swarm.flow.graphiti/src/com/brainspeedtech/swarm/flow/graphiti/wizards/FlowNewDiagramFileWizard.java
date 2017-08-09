package com.brainspeedtech.swarm.flow.graphiti.wizards;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;

import com.brainspeedtech.swarm.flow.Flow;
import com.brainspeedtech.swarm.flow.FlowFactory;

public class FlowNewDiagramFileWizard extends BasicNewFileResourceWizard {
	private WizardNewFileCreationPage myFileCreationPage;

	public static String getUniqueFileName(IPath containerFullPath,
			String fileName, String extension) {
		if (containerFullPath == null) {
			containerFullPath = new Path(""); //$NON-NLS-1$
		}
		if (fileName == null || fileName.trim().length() == 0) {
			fileName = "default"; //$NON-NLS-1$
		}
		IPath filePath = containerFullPath.append(fileName);
		if (extension != null && !extension.equals(filePath.getFileExtension())) {
			filePath = filePath.addFileExtension(extension);
		}
		extension = filePath.getFileExtension();
		fileName = filePath.removeFileExtension().lastSegment();
		int i = 1;
		while (ResourcesPlugin.getWorkspace().getRoot().exists(filePath)) {
			i++;
			filePath = containerFullPath.append(fileName + i);
			if (extension != null) {
				filePath = filePath.addFileExtension(extension);
			}
		}
		return filePath.lastSegment();
	}


	public FlowNewDiagramFileWizard() {

		myFileCreationPage = new WizardNewFileCreationPage("New Flow",
				StructuredSelection.EMPTY);
		myFileCreationPage
				.setTitle("New Flow");
		myFileCreationPage.setDescription("New Flow");
		IPath filePath = new Path("/");
		String fileName = "default";

		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(getUniqueFileName(
				filePath, fileName, "flow")); //$NON-NLS-1$


	}


	public void addPages() {
		addPage(myFileCreationPage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {

		IFile diagramFile = myFileCreationPage.createNewFile();

		URI diagramModelURI = URI.createPlatformResourceURI(diagramFile
				.getFullPath().toString(), true);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(diagramModelURI);
		
		Flow flow = FlowFactory.eINSTANCE.createFlow();
		flow.setName(diagramFile.getFullPath().removeFileExtension().lastSegment());
		
		Diagram diagram = Graphiti.getPeCreateService().createDiagram("FlowDiagram", flow.getName(), true);
		resource.getContents().add(diagram);
		resource.getContents().add(flow);
		IFileEditorInput input = new FileEditorInput(diagramFile);
		
		try {
			resource.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(input, DiagramEditor.DIAGRAM_EDITOR_ID);
		} catch (PartInitException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return true;
	}
}
