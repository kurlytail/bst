/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.posix;

import java.io.PrintStream;

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
			String outputDir, String designName, final PrintStream log) throws Exception {

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
				log.println("Generating design header " + file.getAbsolutePath());
				return new DesignHeaderFile().generate(instance);
			}
		};

		new GeneratorFile(genPrefix + "design_top.h") {
			@Override
			public String getFileContents() {
				log.println("Generating top level include " + file.getAbsolutePath());
				return new DesignTopHeaderFile().generate(instance);
			}
		};

		new GeneratorFile(genPrefix + designName + "_parameters.h") {
			@Override
			public String getFileContents() {
				log.println("Generating parameters header " + file.getAbsolutePath());
				return new ParameterHeaderFile().generate(instance);
			}
		};

		new GeneratorFile(genPrefix + designName + "_flows.h") {
			@Override
			public String getFileContents() {
				log.println("Generating flows header " + file.getAbsolutePath());
				return new FlowsHeaderFile().generate(instance);
			}
		};

		new GeneratorFile(genPrefix + designName + ".c") {
			@Override
			public String getFileContents() {
				log.println("Generating design controller " + file.getAbsolutePath());
				return new DesignStartupFile().generate(instance);
			}

		};

		new GeneratorFile(genPrefix + designName + "_swarm_lib.h") {
			@Override
			public String getFileContents() {
				log.println("Generating swarm header " + file.getAbsolutePath());
				return new SwarmLibFile().generate(instance);
			}

		};

		new GeneratorFile(genPrefix + designName + "_swarm_lib.c") {
			@Override
			public String getFileContents() {
				log.println("Generating swarm routines " + file.getAbsolutePath());
				return new SwarmLibSourceFile().generate(instance);
			}

		};

		new GeneratorFile(outputDir + "/Makefile-posix") {
			@Override
			public String getFileContents() {
				log.println("Generating makefile " + file.getAbsolutePath());
				return new MakeFile().generate(instance);
			}

		};

		for (final CellInstance cellInstance : instance.getCell()) {

			if (cellInstance.getCell().isExternal())
				continue;

			new GeneratorFile(genPrefix + cellInstance.getName() + ".h") {
				@Override
				public String getFileContents() {
					log.println("Generating instance header " + file.getAbsolutePath());
					return new InstanceHeaderFile().generate(cellInstance);
				}

			};

			new GeneratorFile(genPrefix + cellInstance.getName() + ".c") {
				@Override
				public String getFileContents() {
					log.println("Generating instance source " + file.getAbsolutePath());
					return new InstanceSourceFile().generate(cellInstance);
				}

			};

		}

		new GeneratorFile(genPrefix + designName + "_counters.h") {
			@Override
			public String getFileContents() {
				log.println("Generating counters header " + file.getAbsolutePath());
				return new CounterHeaderFile().generate(mDesign);
			}
		};

		for (final MasterCell masterCell : mDesign.getCell()) {

			if (masterCell.isExternal())
				continue;

			new GeneratorFile(genPrefix + masterCell.getName() + ".h") {
				@Override
				public String getFileContents() {
					log.println("Generating plan header " + file.getAbsolutePath());
					return new InstancePlanHeaderFile().generate(masterCell);
				}
			};

			new GeneratorFile(genPrefix + masterCell.getName() + "_plan.c") {
				@Override
				public String getFileContents() {
					log.println("Generating plan source " + file.getAbsolutePath());
					return new InstancePlanSourceFile().generate(masterCell);
				}
			};

		}

//		new GeneratorFile(genPrefix + "logrotate.conf") {
//			@Override
//			public String getFileContents() {
//				return new LogrotateConfigFile().generate(instance);
//			}
//		};
//
//		new GeneratorFile(outputDir + "/monitor.sh") {
//			@Override
//			public String getFileContents() {
//				return new MonitorFile().generate(instance);
//			}
//		};
//		
//		File file = new File(outputDir + "/monitor.sh");
//		file.setExecutable(true);

		new GeneratorFile(genPrefix + designName + ".cscope") {
			@Override
			public String getFileContents() {
				log.println("Generating cscope file list " + file.getAbsolutePath());
				return new CScope().generate(GeneratorFile.getFileList());
			}
		};
		
		new GeneratorFile(genPrefix + designName + "_print_counters.h") {
			@Override
			public String getFileContents() {
				log.println("Generating print counters header " + file.getAbsolutePath());
				return new DumpCountersFile().generate(mDesign);
			}
		};

		new GeneratorFile(genPrefix + designName + "_print_counters.c") {
			@Override
			public String getFileContents() {
				log.println("Generating print counters source " + file.getAbsolutePath());
				return new DumpCountersAppFile().generate(instance);
			}
		};

	}
}
