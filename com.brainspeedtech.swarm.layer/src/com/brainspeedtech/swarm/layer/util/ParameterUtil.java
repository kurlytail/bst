/*******************************************************************************
 * Copyright @2011,2012,2013 BrainSpeed Technologies, http://www.brainspeedtech.com
 * Copyright @2013,2014 Medullanet Inc, http://www.medullanet.com
 * All rights reserved.
 ******************************************************************************/
package com.brainspeedtech.swarm.layer.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.brainspeedtech.swarm.layer.Layer;
import com.brainspeedtech.swarm.layer.LayerPackage;
import com.brainspeedtech.swarm.layer.ModelReference;
import com.brainspeedtech.swarm.layer.Parameter;

public class ParameterUtil {
	
	static ScriptEngineManager mgr = new ScriptEngineManager();
	static ScriptEngine engine = mgr.getEngineByName("JavaScript");
	
	public static Object compute(Parameter parameter) throws ScriptException {

		HashSet<Layer> visited = new HashSet<Layer>();
		visited.add((Layer)parameter.eContainer());
		Collection<Object> objects = new LinkedList<Object>();
		
		getHeirarchichalParameters((Layer)parameter.eContainer(), objects,
				visited);
		
		objects.addAll(EcoreUtil.getObjectsByType(parameter.eContainer().eContents(),
				LayerPackage.eINSTANCE.getParameter()));
		for(Object obj: objects) {
			if (obj.equals(parameter)) break;

			Parameter p = (Parameter)obj;
			engine.put(p.getName(), engine.eval(p.getValue()));
		}
		
		return engine.eval(parameter.getValue());
	}

	private static void getHeirarchichalParameters(
			Layer eContainer, Collection<Object> objects, Collection<Layer> visited) {
		Collection<ModelReference> refs = new LinkedList<ModelReference>();
		
		refs = EcoreUtil.getObjectsByType(eContainer.eContents(), LayerPackage.eINSTANCE.getModelReference());
		for(ModelReference ref: refs) {
			
			for(EObject obj: ref.getObject()) {
				Layer layer = null;
				if (obj instanceof Layer) layer = (Layer)obj;
				if(obj.eContainer() instanceof Layer) {
					obj = (Layer)obj.eContainer();
				}
				
				if(layer == null) continue;
				if(visited.contains(layer)) continue;
				
				objects.addAll(EcoreUtil.getObjectsByType(layer.eContents(),
						LayerPackage.eINSTANCE.getParameter()));
				visited.add(layer);
				
				getHeirarchichalParameters(layer, objects,
						visited);
			}
		}
	}
}
