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

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Bird-eye view of roof.
 * 
 * @author dstadnik
 */
public class BuildingShape extends Shape {

	protected void outlineShape(Graphics g) {
		Rectangle r = getBounds();
		int x = r.x + lineWidth / 2;
		int y = r.y + lineWidth / 2;
		int w = r.width - Math.max(1, lineWidth);
		int h = r.height - Math.max(1, lineWidth);
		g.drawRectangle(x, y, w, h);
		int d = w > h ? h / 2 : w / 2;
		g.drawLine(x, y, x + d, y + d);
		g.drawLine(x, y + h, x + d, y + h - d);
		g.drawLine(x + w, y, x + w - d, y + d);
		g.drawLine(x + w, y + h, x + w - d, y + h - d);
		g.drawLine(x + d, y + d, x + w - d, y + h - d);
	}

	protected void fillShape(Graphics g) {
		g.fillRectangle(getBounds());
	}
}
