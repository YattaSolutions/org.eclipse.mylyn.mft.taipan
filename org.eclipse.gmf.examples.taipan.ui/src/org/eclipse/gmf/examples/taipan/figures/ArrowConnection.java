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

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author dstadnik
 */
public class ArrowConnection extends AnchorableShapeConnection {

	private int arrowBaseWidth = 10;

	public int getArrowBaseWidth() {
		return arrowBaseWidth;
	}

	public void setArrowBaseWidth(int arrowBaseWidth) {
		this.arrowBaseWidth = arrowBaseWidth;
		revalidate();
	}

	protected PointList[] getSegments() {
		PointList points = getPoints();
		if (points.size() < 2) {
			return new PointList[0];
		}
		PointList[] segments = new PointList[points.size() - 1];
		for (int i = 0; i < points.size() - 1; i++) {
			Point p1 = points.getPoint(i);
			Point p2 = points.getPoint(i + 1);
			double dx = p2.x - p1.x;
			double dy = p2.y - p1.y;
			double d = Math.sqrt(dx * dx + dy * dy);
			int qx = (int) (arrowBaseWidth * dy / d);
			int qy = (int) (arrowBaseWidth * dx / d);
			Point q1 = new Point(p1.x - qx, p1.y + qy);
			Point q2 = new Point(p1.x + qx, p1.y - qy);
			PointList segment = new PointList(3);
			segment.addPoint(q1);
			segment.addPoint(q2);
			segment.addPoint(p2);
			segments[i] = segment;
		}
		return segments;
	}

	protected void outlineShape(Graphics graphics) {
		PointList[] segments = getSegments();
		for (int i = 0; i < segments.length; i++) {
			graphics.drawPolygon(segments[i]);
		}
	}

	protected void fillShape(Graphics graphics) {
		PointList[] segments = getSegments();
		for (int i = 0; i < segments.length; i++) {
			graphics.fillPolygon(segments[i]);
		}
	}

	protected Rectangle getShapeBounds() {
		Rectangle shapeBounds = null;
		PointList[] segments = getSegments();
		for (int i = 0; i < segments.length; i++) {
			Rectangle segmentBounds = segments[i].getBounds().getExpanded(lineWidth / 2, lineWidth / 2);
			if (shapeBounds == null) {
				shapeBounds = segmentBounds;
			} else {
				shapeBounds.union(segmentBounds);
			}
		}
		return shapeBounds == null ? new Rectangle() : shapeBounds;
	}
}
