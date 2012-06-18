/*
 * Copyright (c) 2007 Borland Software Corporation
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

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * @author dstadnik
 */
public class PortShape extends Shape {

	protected void outlineShape(Graphics g) {
		drawPort(g, false);
	}

	protected void fillShape(Graphics g) {
		drawPort(g, true);
	}

	protected void drawPort(Graphics g, boolean fill) {
		Rectangle r = getBounds();
		int x = r.x + lineWidth / 2;
		int y = r.y + lineWidth / 2;
		int w = r.width - Math.max(1, lineWidth);
		int h = r.height - Math.max(1, lineWidth);

		// walls
		PointList walls = new PointList(4);
		walls.addPoint(w / 6, h * 4 / 5);
		walls.addPoint(w * 5 / 6, h * 4 / 5);
		walls.addPoint(w * 5 / 6, h);
		walls.addPoint(w / 6, h);
		walls.performTranslate(x, y);
		if (fill) {
			g.setBackgroundColor(ColorConstants.darkGray);
			g.fillPolygon(walls);
		} else {
			g.setForegroundColor(ColorConstants.black);
			g.drawPolygon(walls);
		}

		// main roof
		PointList mainRoof = new PointList(3);
		mainRoof.addPoint(w / 2, h / 5);
		mainRoof.addPoint(w, h * 4 / 5);
		mainRoof.addPoint(0, h * 4 / 5);
		mainRoof.performTranslate(x, y);
		if (fill) {
			g.setBackgroundColor(ColorConstants.orange);
			g.fillPolygon(mainRoof);
		} else {
			g.setForegroundColor(ColorConstants.orange);
			g.drawPolygon(mainRoof);
		}

		// top roof
		PointList topRoof = new PointList(3);
		topRoof.addPoint(w / 2, 0);
		topRoof.addPoint(w * 5 / 6, h * 2 / 5);
		topRoof.addPoint(w / 6, h * 2 / 5);
		topRoof.performTranslate(x, y);
		if (fill) {
			g.setBackgroundColor(ColorConstants.orange);
			g.fillPolygon(topRoof);
		} else {
			g.setForegroundColor(ColorConstants.orange);
			g.drawPolygon(topRoof);
		}
	}
}
