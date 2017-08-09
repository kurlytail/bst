/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.gen.tcl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.brainspeedtech.gen.util.GeneratorFile;
import com.brainspeedtech.struct.Atom;
import com.brainspeedtech.struct.Document;
import com.brainspeedtech.struct.Enum;
import com.brainspeedtech.struct.EnumTerm;
import com.brainspeedtech.struct.Field;
import com.brainspeedtech.struct.Struct;
import com.brainspeedtech.struct.StructPackage;
import com.brainspeedtech.swarm.project.domain.SwarmCachingEditingDomain;

public class StructGenerator {


	@SuppressWarnings("unchecked")
	public static void generate(SwarmCachingEditingDomain domain,
			String outputDir, final String designName) throws Exception {

		Collection<? extends Document> structs = (Collection<? extends Document>) domain
				.getObjectsByType(StructPackage.eINSTANCE.getDocument());
		String genPrefix = outputDir + "/gen_";

		for (final Document struct : structs) {

			String name = struct.eResource().getURI().lastSegment()
					.replaceAll("\\.struct$", "");
			new GeneratorFile(genPrefix + name + ".h") {
				@Override
				public String getFileContents() throws Exception {
					
					Resource resource = struct.eResource();

					List<Atom> atoms = new ArrayList<Atom>();
					HashMap<String, Boolean> includeFiles = new HashMap<String, Boolean>();

					TreeIterator<EObject> contents = resource.getAllContents();
					while (contents.hasNext()) {
						EObject eObject = contents.next();
						if (eObject instanceof Atom) {
							Atom atom = (Atom) eObject;
							atoms.add((Atom) eObject);
							if (atom.getAtom() != null) {
								if (atom.getAtom().eResource() == resource)
									continue;
								includeFiles.put(atom.getAtom().eResource().getURI()
										.toPlatformString(true), true);
							}
							if (atom instanceof Struct) {
								Struct str = (Struct) atom;
								for (Field f : str.getField()) {
									if (f.getAtom() != null) {
										if (f.getAtom().eResource() == resource)
											continue;
										includeFiles.put(f.getAtom().eResource().getURI()
												.toPlatformString(true), true);
									}
								}
							}
						}
					}

					// Iterate through the external resources and create include heirarchies
					for (String includeFile : includeFiles.keySet()) {
						if (includeFile == null) continue;
						write("source gen_"
								+ (new File(includeFile)).getName().replaceAll(
										"\\.struct$", ".tcl") + "\n");
					}

					// Create definition before reference list for all atoms
					for (Atom atom : atoms) {
						if (atom.getBlurb() != null) {
							String blurb = atom.getBlurb().replaceAll("\\n", "#");
							
							write("#" + blurb + "\n");
						}

						if (atom instanceof Struct) {

							write("set " + atom.getName() + " {\n");

							for (Field f : ((Struct) atom).getField()) {
								String blurb;
								if (f.getBlurb() != null) {
									blurb = f.getBlurb().replaceAll("\\n", " ");
								} else {
									blurb = "";
								}

								if (f.getAtom() == null) {
									write("    " + f.getName() + " { bit "
											+ f.getCount() + " { " + blurb + " } }\n");
								} else {
									write("    " + f.getName() + " { "
											+ f.getAtom().getName() + " " + f.getCount()
											+ " { " + blurb + " } }\n");
								}
							}
							write("}\n");
						}

						if (atom instanceof Enum) {
							write("set " + atom.getName() + " {\n");
							for (EnumTerm et : ((Enum) atom).getTerm()) {
								String blurb;
								if (et.getBlurb() != null) {
									blurb = et.getBlurb().replaceAll("\\n", " ");
								} else {
									blurb = "";
								}

								write("    " + et.getName() + " " + et.getValue()
										+ " {" + blurb + "}\n");
							}
							write("}\n");
						}

						write("\n");
					}
					return "";
				}
			};

		}
	}

}
