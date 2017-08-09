/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.posix.vpi;

import com.brainspeedtech.gen.software.posix.CounterHeaderFile;
import com.brainspeedtech.gen.software.posix.DesignTopHeaderFile;
import com.brainspeedtech.gen.software.posix.FlowsHeaderFile;
import com.brainspeedtech.gen.software.posix.InstanceHeaderFile;
import com.brainspeedtech.gen.software.posix.InstancePlanHeaderFile;
import com.brainspeedtech.gen.software.posix.InstancePlanSourceFile;
import com.brainspeedtech.gen.software.posix.ParameterHeaderFile;
import com.brainspeedtech.gen.software.posix.SwarmLibSourceFile;
import com.brainspeedtech.gen.util.GeneratorFile;
import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.InstPackage;
import com.brainspeedtech.swarm.inst.Instance;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterDesign;
import com.brainspeedtech.swarm.master.MasterPackage;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;

public class ImplementationGenerator {

	public static void generate(SwarmCachingEditingDomain domain,
			String outputDir, String designName) throws Exception {

		final Instance instance = (Instance) domain
				.getObjectByType(InstPackage.eINSTANCE.getInstance());
		if (instance == null)
			return;

		final MasterDesign mDesign = (MasterDesign) domain
				.getObjectByType(MasterPackage.eINSTANCE.getMasterDesign());
		if (mDesign == null)
			return;

		String genPrefix = outputDir + "/gen_";
		new GeneratorFile(genPrefix + designName + ".h") {
			@Override
			public String getFileContents() {
				return new DesignHeaderFile().generate(instance);
			}
		};

		new GeneratorFile(genPrefix + "_design_top.h") {
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

		new GeneratorFile(genPrefix + designName + ".c") {
			@Override
			public String getFileContents() {
				return new DesignStartupFile().generate(instance);
			}

		};

		new GeneratorFile(genPrefix + designName + "_swarm_lib.h") {
			@Override
			public String getFileContents() {
				return new SwarmLibFile().generate(instance);
			}

		};

		new GeneratorFile(genPrefix + designName + "_swarm_lib.c") {
			@Override
			public String getFileContents() {
				return new SwarmLibSourceFile().generate(instance);
			}

		};
		
		new GeneratorFile(outputDir + "/Makefile-vpi") {
			@Override
			public String getFileContents() {
				return new MakefileVPIFile().generate(instance);
			}

		};
		
		for (final CellInstance cellInstance : instance.getCell()) {

			new GeneratorFile(genPrefix + cellInstance.getName() + "_plan.v") {
				@Override
				public String getFileContents() {
					return new ModulePlanFile().generate(cellInstance);
				}

			};

			new GeneratorFile(genPrefix + cellInstance.getName() + "_vpi.c") {
				@Override
				public String getFileContents() {
					return new InstanceVPIFile().generate(cellInstance);
				}

			};
			
			new GeneratorFile(genPrefix + cellInstance.getName() + ".h") {
				@Override
				public String getFileContents() {
					return new InstanceHeaderFile().generate(cellInstance);
				}

			};

		}
		
		new GeneratorFile(genPrefix + designName + "_counters.h") {
			@Override
			public String getFileContents() {
				return new CounterHeaderFile().generate(mDesign);
			}
		};

		for (final MasterCell masterCell : mDesign.getCell()) {

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

	}
}
