/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.mray;

import com.brainspeedtech.gen.util.GeneratorFile;
import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.layer.ExternalCell;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.project.util.ProjectUtil;


public class ImplementationGenerator {


	public static void generate(SwarmCachingEditingDomain domain,
			String outputDir, String designName) throws Exception {

		final Instance instance = (Instance)domain.getObjectByType(InstPackage.eINSTANCE.getInstance());
		if (instance == null) return;

		final MasterDesign mDesign = (MasterDesign)domain.getObjectByType(MasterPackage.eINSTANCE.getMasterDesign());
		if (mDesign == null) return;

		String genPrefix = outputDir + "/gen_";
		
		new GeneratorFile(genPrefix + designName + ".h") {
			@Override
			public String getFileContents() {
				return new DesignHeaderFile().generate(instance);
			}
		};
		
		new GeneratorFile(genPrefix + "design_top.h") {
			@Override
			public String getFileContents() {
				return new DesignTopHeaderFile().generate(instance);
			}
		};

		new GeneratorFile(genPrefix + designName + "_parameters.h") {
			@Override
			public String getFileContents() {
				return new ParameterHeaderFile().generate(instance);
			}
		};
		
		new GeneratorFile(genPrefix + designName + "_flows.h") {
			@Override
			public String getFileContents() {
				return new FlowsHeaderFile().generate(instance);
			}
		};
		

		for (final CellInstance cellInstance : instance.getCell()) {
			if (cellInstance.getCell().isExternal()) continue;
			if (ProjectUtil.getReferringInstance(cellInstance, ExternalCell.class) != null) continue;
			if (ProjectUtil.getReferringInstance(cellInstance.getCell(), ExternalCell.class) != null) continue;
			
			new GeneratorFile(genPrefix + cellInstance.getName() + ".h") {
				@Override
				public String getFileContents() {
					return new InstanceHeaderFile().generate(cellInstance);
				}
			};
			
			new GeneratorFile(genPrefix + cellInstance.getName() + ".c") {
				@Override
				public String getFileContents() {
					return new InstanceSourceFile().generate(cellInstance);
				}
			};
			
		}

		for (final MasterCell masterCell : mDesign.getCell()) {

			if (masterCell.isExternal()) continue;
			if (ProjectUtil.getReferringInstance(masterCell, ExternalCell.class) != null) continue;

			new GeneratorFile(genPrefix + masterCell.getName() + ".h") {
				@Override
				public String getFileContents() {
					return new InstancePlanHeaderFile().generate(masterCell);
				}
			};
			
			new GeneratorFile(genPrefix + masterCell.getName() + "_plan.c") {
				@Override
				public String getFileContents() {
					return new InstancePlanSourceFile().generate(masterCell);
				}
			};

		}
		

		new GeneratorFile(genPrefix + designName + "_counters.h") {
			@Override
			public String getFileContents() {
				return new CounterHeaderFile().generate(mDesign);
			}
		};
		
		new GeneratorFile(outputDir + "/Makefile-mray") {
			@Override
			public String getFileContents() {
				return new MakeFile().generate(instance);
			}
		};
	}
}
