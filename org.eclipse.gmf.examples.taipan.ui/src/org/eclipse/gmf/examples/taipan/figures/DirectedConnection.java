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

import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

/**
 * @author dstadnik
 */
public class DirectedConnection extends PolylineConnectionEx {

	public DirectedConnection() {
		PolylineDecoration arrow = new PolylineDecoration();
		setTargetDecoration(arrow);
	}
}
