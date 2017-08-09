package com.brainspeedtech.swarm.presentation;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateListStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.IEMFValueProperty;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.OpenEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.eclipse.wb.swt.SWTResourceManager;

import com.brainspeedtech.swarm.Design;
import com.brainspeedtech.swarm.DesignFlow;
import com.brainspeedtech.swarm.SwarmPackage;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;
import com.brainspeedtech.swarm.project.views.SwarmEditorPart;

public class SwarmConfigurationEditor extends SwarmEditorPart {
	private DataBindingContext m_bindingContext;

	public static final String ID = "com.brainspeedtech.swarm.presentation.SwarmConfigurationEditor"; //$NON-NLS-1$
	private final FormToolkit formToolkit = new FormToolkit(
			Display.getDefault());
	private Text designNameText;

	private Design design;

	public SwarmConfigurationEditor() {
	}

	/**
	 * Create contents of the editor part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));

		ScrolledForm scrldfrmMainform = formToolkit
				.createScrolledForm(container);
		formToolkit.paintBordersFor(scrldfrmMainform);
		formToolkit.decorateFormHeading(scrldfrmMainform.getForm());
		scrldfrmMainform.setText("Swarm Configuration");
		{
			TableWrapLayout tableWrapLayout = new TableWrapLayout();
			tableWrapLayout.numColumns = 4;
			scrldfrmMainform.getBody().setLayout(tableWrapLayout);
		}

		Label lblDesignName = formToolkit.createLabel(
				scrldfrmMainform.getBody(), "Design Name", SWT.NONE);
		lblDesignName.setLayoutData(new TableWrapData(TableWrapData.RIGHT,
				TableWrapData.TOP, 1, 1));
		lblDesignName.setFont(SWTResourceManager
				.getFont("Tahoma", 10, SWT.BOLD));

		designNameText = new Text(scrldfrmMainform.getBody(), SWT.BORDER);
		designNameText
				.setToolTipText("Design Name\r\nName will be used as a template for all generated artifacts.");
		designNameText.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB,
				TableWrapData.MIDDLE, 1, 1));
		formToolkit.adapt(designNameText, true, true);
		new Label(scrldfrmMainform.getBody(), SWT.NONE);
		new Label(scrldfrmMainform.getBody(), SWT.NONE);

		Label lblFlows = formToolkit.createLabel(scrldfrmMainform.getBody(),
				"Flows", SWT.NONE);
		lblFlows.setFont(SWTResourceManager.getFont("Tahoma", 10, SWT.BOLD));

		flowListViewer = new ListViewer(scrldfrmMainform.getBody(),
				SWT.V_SCROLL);

		flowListViewer.addOpenListener(new IOpenListener() {

			@Override
			public void open(OpenEvent event) {
				int i = flowListViewer.getList().getFocusIndex();
				Object obj = flowListViewer.getList().getItem(i);
				openFlowEditor((String) obj);
			}
		});

		flowList = flowListViewer.getList();
		TableWrapData twd_flowList = new TableWrapData(TableWrapData.FILL_GRAB,
				TableWrapData.MIDDLE, 1, 1);
		twd_flowList.heightHint = 264;
		twd_flowList.grabVertical = true;
		flowList.setLayoutData(twd_flowList);

		Label lblStructures = formToolkit.createLabel(
				scrldfrmMainform.getBody(), "Structures", SWT.NONE);
		lblStructures.setFont(SWTResourceManager
				.getFont("Tahoma", 10, SWT.BOLD));

		ListViewer structListViewer = new ListViewer(
				scrldfrmMainform.getBody(), SWT.V_SCROLL | SWT.MULTI);
		structList = structListViewer.getList();
		TableWrapData twd_structList = new TableWrapData(
				TableWrapData.FILL_GRAB, TableWrapData.MIDDLE, 1, 1);
		twd_structList.heightHint = 278;
		twd_structList.grabVertical = true;
		structList.setLayoutData(twd_structList);
		new Label(scrldfrmMainform.getBody(), SWT.NONE);

		Composite composite = formToolkit.createComposite(
				scrldfrmMainform.getBody(), SWT.NONE);
		formToolkit.paintBordersFor(composite);
		{
			TableWrapLayout twl_composite = new TableWrapLayout();
			twl_composite.numColumns = 3;
			composite.setLayout(twl_composite);
		}

		Button btnCreateFlow = formToolkit.createButton(composite, "Create",
				SWT.NONE);
		btnCreateFlow.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String id = "com.brainspeedtech.swarm.flow.diagram.part.FlowCreationWizardID";
				// First see if this is a "new wizard".
				IWizardDescriptor descriptor = PlatformUI.getWorkbench()
						.getNewWizardRegistry().findWizard(id);
				// If not check if it is an "import wizard".
				if (descriptor == null) {
					descriptor = PlatformUI.getWorkbench()
							.getImportWizardRegistry().findWizard(id);
				}
				// Or maybe an export wizard
				if (descriptor == null) {
					descriptor = PlatformUI.getWorkbench()
							.getExportWizardRegistry().findWizard(id);
				}
				try {
					// Then if we have a wizard, open it.
					if (descriptor != null) {
						INewWizard wizard = (INewWizard) descriptor
								.createWizard();
						IStructuredSelection selection = new StructuredSelection(
								((FileEditorInput) getEditorInput()).getFile()
										.getProject());
						wizard.init(PlatformUI.getWorkbench(), selection);
						WizardDialog wd = new WizardDialog(Display.getDefault()
								.getActiveShell(), wizard);

						wd.setTitle(wizard.getWindowTitle());
						wd.open();
					}
				} catch (CoreException ex) {
					ex.printStackTrace();
				}
			}
		});
		btnCreateFlow.setBounds(0, 0, 68, 23);

		btnDeleteFlow = formToolkit.createButton(composite, "Delete", SWT.NONE);
		btnDeleteFlow.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int i = flowListViewer.getList().getFocusIndex();
				if (i >= 0) {
					Resource resource = null;
					Object obj = flowListViewer.getList().getItem(i);
					DesignFlow deletingFlow = null;
					/* Find the corresponding design flow */
					for (DesignFlow dflow : design.getFlow()) {
						if (obj.equals(dflow.getFlow().getName())) {
							resource = dflow.getFlow().eResource();
							deletingFlow = dflow;
						}
					}

					if (resource != null) {
						TransactionalEditingDomain editingDomain = TransactionUtil
								.getEditingDomain(resource);
						editingDomain.getCommandStack().execute(
								new RemoveCommand(editingDomain, design
										.getFlow(), deletingFlow));
					}
				}
			}
		});

		Button btnAddExternalFlow = formToolkit.createButton(composite, "Add",
				SWT.NONE);
		new Label(scrldfrmMainform.getBody(), SWT.NONE);

		Composite composite_1 = formToolkit.createComposite(
				scrldfrmMainform.getBody(), SWT.NONE);
		composite_1.setBounds(0, 0, 64, 64);
		formToolkit.paintBordersFor(composite_1);
		{
			TableWrapLayout twl_composite_1 = new TableWrapLayout();
			twl_composite_1.numColumns = 3;
			composite_1.setLayout(twl_composite_1);
		}

		Button btnCreateStructure = formToolkit.createButton(composite_1,
				"Create", SWT.NONE);
		btnCreateStructure.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnCreateStructure.setBounds(0, 0, 68, 23);

		Button btnDeleteStructure = formToolkit.createButton(composite_1,
				"Delete", SWT.NONE);

		Button btnAddExternalStructures = formToolkit.createButton(composite_1,
				"Add", SWT.NONE);
		m_bindingContext = initDataBindings();

	}

	protected void openFlowEditor(String obj) {

		IFile modelFile = WorkspaceSynchronizer.getFile(design.eResource())
				.getProject().getFile(obj);
		// Open the associated editor for this file.
		IEditorDescriptor descriptor = IDE.getDefaultEditor(modelFile);
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IWorkbenchPage page = window.getActivePage();
			if (descriptor != null && page != null) {
				try {
					page.openEditor(new FileEditorInput(modelFile),
							descriptor.getId());
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void dispose() {
		// getResource().unload();
		// ResourcesPlugin.getWorkspace().removeResourceChangeListener(
		// resourceChangeListener);
		super.dispose();
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		design = (Design) getResource().getContents().get(0);
	}

	private List flowList;
	private List structList;
	private Button btnDeleteFlow;

	private ListViewer flowListViewer;

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();

		IEMFValueProperty designNameProperty = EMFProperties
				.value(SwarmPackage.Literals.DESIGN__NAME);
		IObservableValue designNameObservable = designNameProperty
				.observe(design);
		IObservableValue swtNameObservable = SWTObservables.observeText(
				designNameText, SWT.Modify);
		bindingContext.bindValue(swtNameObservable, designNameObservable);

		UpdateListStrategy flowListStrategy = new UpdateListStrategy();
		flowListStrategy.setConverter(new DesignImplToStringConverter());

		IEMFListProperty flowListProperty = EMFProperties
				.list(SwarmPackage.eINSTANCE.getDesign_Flow());
		IObservableList flowListObservable = flowListProperty.observe(design);
		IObservableList swtFlowListObservable = SWTObservables
				.observeItems(flowList);
		bindingContext.bindList(swtFlowListObservable, flowListObservable,
				flowListStrategy, flowListStrategy);

		/*
		 * 
		 * IEMFListProperty structList =
		 * EMFProperties.list(FeaturePath.fromList(
		 * SwarmPackage.Literals.DESIGN__STRUCT,
		 * SwarmPackage.Literals.DESIGN_STRUCT__STRUCT,
		 * StructPackage.Literals.DOCUMENT__STRUCT)); IObservableList
		 * structListObservable = structList.observe(design.getStruct());
		 */

		return bindingContext;
	}

	public static class DesignImplToStringConverter extends Converter {

		public DesignImplToStringConverter() {
			super(null, null);
		}

		public DesignImplToStringConverter(Object fromType, Object toType) {
			super(fromType, toType);
		}

		@Override
		public Object convert(Object fromObject) {
			if (fromObject instanceof DesignFlow) {
				DesignFlow dFlow = (DesignFlow) fromObject;
				return dFlow.getFlow().getName();
			}
			// TODO Auto-generated method stub
			return null;
		}

	}
}
