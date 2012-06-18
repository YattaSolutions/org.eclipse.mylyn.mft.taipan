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

import org.eclipse.swt.graphics.Image;

/**
 * @author dstadnik
 */
public class WarshipShape extends ShipShape {

	protected Image getShipImage() {
		return getImageImage("images/warship.png"); //$NON-NLS-1$
	}
}
