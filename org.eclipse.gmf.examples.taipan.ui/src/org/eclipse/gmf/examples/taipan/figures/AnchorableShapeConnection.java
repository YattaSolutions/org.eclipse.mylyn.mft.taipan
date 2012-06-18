/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.examples.taipan.figures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.gmf.runtime.draw2d.ui.figures.BaseSlidableAnchor;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IPolygonAnchorableFigure;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;

/**
 * @author dstadnik
 */
public abstract class AnchorableShapeConnection extends ShapeConnection implements IPolygonAnchorableFigure {

	private static final String DEFAULT_ANCHOR_ID = ""; //$NON-NLS-1$

	private Map<String, ConnectionAnchor> connectionAnchors;

	protected Map<String, ConnectionAnchor> getConnectionAnchors() {
		if (connectionAnchors == null) {
			connectionAnchors = new HashMap<String, ConnectionAnchor>(1);
		}
		return connectionAnchors;
	}

	public ConnectionAnchor getConnectionAnchor(String terminal) {
		ConnectionAnchor connectAnchor = (ConnectionAnchor) getConnectionAnchors().get(terminal);
		if (connectAnchor == null) {
			if (terminal.equals(DEFAULT_ANCHOR_ID)) {
				connectAnchor = createDefaultConnectionAnchor();
				getConnectionAnchors().put(terminal, connectAnchor);
			} else {
				connectAnchor = createConnectionAnchor(BaseSlidableAnchor.parseTerminalString(terminal));
			}
		}
		return connectAnchor;
	}

	public String getConnectionAnchorTerminal(ConnectionAnchor c) {
		if (c instanceof BaseSlidableAnchor) {
			return ((BaseSlidableAnchor) c).getTerminal();
		}
		if (getConnectionAnchors().containsValue(c)) {
			Iterator<String> iter = getConnectionAnchors().keySet().iterator();
			String key;
			while (iter.hasNext()) {
				key = iter.next();
				if (getConnectionAnchors().get(key).equals(c)) {
					return key;
				}
			}
		}
		return DEFAULT_ANCHOR_ID;
	}

	public ConnectionAnchor getSourceConnectionAnchorAt(Point p) {
		return createConnectionAnchor(p);
	}

	public ConnectionAnchor getTargetConnectionAnchorAt(Point p) {
		return createConnectionAnchor(p);
	}

	protected ConnectionAnchor createConnectionAnchor(Point p) {
		if (p == null) {
			return getConnectionAnchor(DEFAULT_ANCHOR_ID);
		} else {
			Point temp = p.getCopy();
			translateToRelative(temp);
			PrecisionPoint pp = BaseSlidableAnchor.getAnchorRelativeLocation(temp, getBounds());
			return new BaseSlidableAnchor(this, pp);
		}
	}

	protected ConnectionAnchor createDefaultConnectionAnchor() {
		return new BaseSlidableAnchor(this);
	}

	public PointList getPolygonPoints() {
		return PointListUtilities.copyPoints(getPoints());
	}
}
