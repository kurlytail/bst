/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.project.eclipse;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import com.brainspeedtech.swarm.layer.LayerPackage;
import com.brainspeedtech.swarm.project.eclipse.ProjectUtil;

public class LayerUtil {
	public static Collection<EClass> getPotentialConstraints(EObject object) {
		Set<EClass> classes = new HashSet<EClass>();
		EClass clazz = LayerPackage.eINSTANCE.getConstraintBase();
		
		String natures[] = ProjectUtil.getNatures(object);
		
		/* Iterate through all classes in the registry */
		Collection<String> pkgnames = new LinkedList<String>();
		pkgnames.addAll(EPackage.Registry.INSTANCE.keySet());
		for(String pkgname: pkgnames) {
			try {
				EPackage pkg = EPackage.Registry.INSTANCE.getEPackage(pkgname);
				for (EClassifier classifier: pkg.getEClassifiers()) {
					if (classifier instanceof EClass) {
						EClass fromClassifier = (EClass)classifier;
						/* Check if the annotations match the project natures */
						EAnnotation annotation = fromClassifier.getEAnnotation("http://www.brainspeedtech.com");
						
						if(clazz.isSuperTypeOf(fromClassifier)) {
							for(EReference ref :fromClassifier.getEAllReferences()) {
								if(ref.getEReferenceType().isSuperTypeOf(object.eClass())) {
									classes.add(fromClassifier);								
								}
							}
						}
					}
				}

			}
			catch (Exception ex) {
				
			}
		}

		return classes;
	}
	
	public static Collection<EObject> getExistingPotentialConstraints(EObject object) {
		return new LinkedList<EObject>();
	}
}
