package com.brainspeedtech.swarm.flow.graphiti;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
 
public class SwarmToolCollapseFeature extends AbstractCustomFeature {
 
      public SwarmToolCollapseFeature(IFeatureProvider fp) {
            super(fp);
      }
 
      @Override
      public boolean canExecute(ICustomContext context) {
    	  return true;
      }
 
      @Override
      public String getName() {
            return "Collapse";
      }
 
      @Override
      public String getDescription() {
            return "Collapse Figure";
      }
 
      @Override
      public String getImageId() {
            return IPlatformImageConstants.IMG_EDIT_COLLAPSE;
      }
 
      @Override
      public boolean isAvailable(IContext context) {
            return true;
      }
 
      @Override
      public void execute(ICustomContext context) {
            MessageDialog.openInformation(PlatformUI.getWorkbench()
              .getActiveWorkbenchWindow().getShell(), "Information",
            "The 'Collapse Feature' is intentionally not implemented yet.");
      }
} 