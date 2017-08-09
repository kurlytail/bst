/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.software.mray;

import java.util.Collection;

import com.brainspeedtech.gen.util.GeneratorFile;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;
import com.brainspeedtech.swarm.sm.SmPackage;
import com.brainspeedtech.swarm.sm.StateMachine;

public class SMGenerator {
	@SuppressWarnings("unchecked")
	public static void generate(SwarmCachingEditingDomain domain,
			String outputDir, String designName) throws Exception {
		

		Collection<? extends StateMachine> machines = (Collection<? extends StateMachine>) domain
				.getObjectsByType(SmPackage.eINSTANCE.getStateMachine());
		String genPrefix = outputDir + "/gen_";

		for (final StateMachine machine : machines) {

			String name = machine.eResource().getURI().lastSegment()
					.replaceAll("\\.sm$", "");
			new GeneratorFile(genPrefix + name + "_sm.h") {
				@Override
				public String getFileContents() {
					return new SMHeaderFile().generate(machine);
				}
			};

			new GeneratorFile(genPrefix + name + "_sm.c") {
				@Override
				public String getFileContents() {
					return new SMSourceFile2().generate(machine);
				}
			};
		}

	}
}
