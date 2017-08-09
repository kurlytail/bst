/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.verilog.properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.debug.ui.StringVariableSelectionDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;

import com.brainspeedtech.gen.verilog.builder.SwarmVerilogBuilder;
import com.brainspeedtech.swarm.project.transaction.SwarmEditingDomainFactory;

public class VerilogPropertyPage extends PropertyPage {
	private Text projectLocation;
	private Button btnVariables;

	/**
	 * Constructor for SamplePropertyPage.
	 */
	public VerilogPropertyPage() {
		super();
		setTitle("Verilog Preferences");
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(3, false));

		Label lblGeneratedProject = new Label(composite, SWT.NONE);
		lblGeneratedProject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblGeneratedProject.setText("Generated Project");

		projectLocation = new Text(composite, SWT.BORDER);
		projectLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		btnVariables = new Button(composite, SWT.NONE);
		btnVariables.addSelectionListener(
				new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				StringVariableSelectionDialog dialog = new StringVariableSelectionDialog(
						getShell()) {
					@Override
					protected void okPressed() {
						super.okPressed();
						projectLocation.setText(projectLocation.getText() + "$"
								+ getVariableExpression());

					}
				};
				dialog.open();
			}
		});
		btnVariables.setText("Variables");

		initializeProperties();

		return composite;
	}

	private void initializeProperties() {
		IProject project = (IProject) getElement();

		String pLocation = SwarmEditingDomainFactory.getBuilderOption(project,
				SwarmVerilogBuilder.BUILDER_ID, SwarmVerilogBuilder.PROJECT_LOCATION,
				SwarmVerilogBuilder.DEFAULT_PROJECT_LOCATION);
		if (pLocation == null) {
			projectLocation.setEnabled(false);
			btnVariables.setEnabled(false);
		} else {
			projectLocation.setText(pLocation);
			projectLocation.setEnabled(true);
		}
	}

	protected void performDefaults() {
		super.performDefaults();
		projectLocation.setText(SwarmVerilogBuilder.DEFAULT_PROJECT_LOCATION);
	}

	public boolean performOk() {
		IProject project = (IProject) getElement();

		if (projectLocation.getEnabled())
			SwarmEditingDomainFactory.setBuilderOption(project,
					SwarmVerilogBuilder.BUILDER_ID, SwarmVerilogBuilder.PROJECT_LOCATION,
					projectLocation.getText());

		return true;
	}

	@Override
	public boolean okToLeave() {
		IProject project = (IProject) getElement();
		
		String pLocation = SwarmEditingDomainFactory.getBuilderOption(project,
				SwarmVerilogBuilder.BUILDER_ID,
				SwarmVerilogBuilder.PROJECT_LOCATION,
				SwarmVerilogBuilder.DEFAULT_PROJECT_LOCATION);
		if (pLocation == null) return super.okToLeave();

		return super.okToLeave()
				&& projectLocation.getText().equals(pLocation);

	}

	@Override
	protected void performApply() {
		performOk();
		super.performApply();
	}

	@Override
	public boolean performCancel() {
		initializeProperties();
		return super.performCancel();
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible)
			initializeProperties();
		super.setVisible(visible);
	}


}
