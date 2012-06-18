package org.example.gmf.taipan.mylyn;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.examples.taipan.Order;
import org.eclipse.gmf.examples.taipan.Port;
import org.eclipse.gmf.examples.taipan.Route;
import org.eclipse.gmf.examples.taipan.Ship;
import org.eclipse.mylyn.mft.gmf.ui.GmfStructureBridge;

/**
 * The bridge tells MFT everything it needs to know about the Taipan model.
 * 
 * <ul>
 * <li>Classes representing nodes</li>
 * <li>Classes representing edges</li>
 * <li>The common base class of all nodes</li>
 * <li>The common base class of all edges</li>
 * <li>The bridge’s content type (a unique name identifying the domain supported
 * by the bridge, for example the plug-in’s id)</li>
 * </ul>
 * 
 * @author <a href="mailto:bork@yatta.de">Manuel Bork</a>
 */
public class TaipanContextStructureBridge extends GmfStructureBridge {
	private static final Class[] NODES = new Class[] { Ship.class, Port.class };
	private static final Class[] EDGES = new Class[] { Order.class, Route.class };

	@Override
	public String getContentType() {
		return Activator.PLUGIN_ID;
	}

	@Override
	public Class<?> getDomainBaseNodeClass() {
		return EObject.class;
	}

	@Override
	public Class<?>[] getDomainNodeClasses() {
		return NODES;
	}

	@Override
	public Class<?> getDomainBaseEdgeClass() {
		return EObject.class;
	}

	@Override
	public Class<?>[] getDomainEdgeClasses() {
		return EDGES;
	}
}
