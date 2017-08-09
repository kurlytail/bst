package com.brainspeedtech.swarm.layer.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;

import com.brainspeedtech.swarm.inst.CellInstance;
import com.brainspeedtech.swarm.inst.TubeInstance;
import com.brainspeedtech.swarm.master.MasterCell;
import com.brainspeedtech.swarm.master.MasterTube;

public class SGenXMLHelper extends XMIHelperImpl {
	
	public static Map<String, URI> domaintoURI = new HashMap<String, URI>();
	public SGenXMLHelper(XMIResource xmiResource) {
		super(xmiResource);
	}
	
	@Override
	public void setResource(XMLResource resource) {
		super.setResource(resource);
	}
	
	@Override
	public String getHREF(EObject obj) {
		Resource res = obj.eResource();
		
		if(res instanceof GMFResource) {
			if(obj instanceof CellInstance) {
				return "instance#" + ((CellInstance)obj).getInternalName();
			}
			if(obj instanceof TubeInstance) {
				return "instance#" + ((TubeInstance)obj).getInternalName();
			}
			if(obj instanceof MasterCell) {
				return "master#" + ((MasterCell)obj).getInternalName();
			}
			if(obj instanceof MasterTube) {
				return "master#" + ((MasterTube)obj).getInternalName();
			}

		}

		return super.getHREF(obj);
	}

	@Override
	public URI resolve(URI relative, URI base) {
		
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getResource());
		
		if(relative.fragment().contains("private")) {
			System.out.println("private");
		}
		if(relative.hasFragment() &&
				relative.segment(0).equals("master")) {
			if(domain != null && domaintoURI.get(domain.getID()) != null)
				return domaintoURI.get(domain.getID()).appendSegment(domain.getID() + ".master").appendFragment(relative.fragment());
			else {
				base = base.trimSegments(1);
				base = base.appendSegment(base.segments()[base.segmentCount() - 1] + ".master");
				base = base.appendFragment(relative.fragment());
				return base;
			}
		}
		
		if(relative.hasFragment() &&
				relative.segment(0).equals("instance")) {
			if(domain != null && domaintoURI.get(domain.getID()) != null)
				return domaintoURI.get(domain.getID()).appendSegment(domain.getID() + ".inst").appendFragment(relative.fragment());
			else {
				base = base.trimSegments(1);
				base = base.appendSegment(base.segments()[base.segmentCount() - 1] + ".inst");
				base = base.appendFragment(relative.fragment());
				return base;
			}
		}
		return super.resolve(relative, base);
	}
}
