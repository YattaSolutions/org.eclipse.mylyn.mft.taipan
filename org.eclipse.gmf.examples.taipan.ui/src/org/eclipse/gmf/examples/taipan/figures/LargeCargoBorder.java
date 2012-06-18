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
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.swt.graphics.Color;

/**
 * @author dstadnik
 */
public class LargeCargoBorder extends LineBorder {

	public LargeCargoBorder() {
		super();
	}

	public LargeCargoBorder(int width) {
		super(width);
	}

	public LargeCargoBorder(Color color) {
		super(color);
	}

	public LargeCargoBorder(Color color, int width) {
		super(color, width);
	}

	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		tempRect.setBounds(getPaintRectangle(figure, insets));
		if (getWidth() % 2 == 1) {
			tempRect.width -= MapModeUtil.getMapMode(figure).DPtoLP(1);
			tempRect.height -= MapModeUtil.getMapMode(figure).DPtoLP(1);
		}
		int shrinkWidth = MapModeUtil.getMapMode(figure).DPtoLP(getWidth() / 2);
		tempRect.shrink(shrinkWidth, shrinkWidth);
		graphics.setLineWidth(getWidth());
		if (getColor() != null) {
			graphics.setForegroundColor(getColor());
		}
		graphics.drawRoundRectangle(tempRect, 12, 12);
	}
}
