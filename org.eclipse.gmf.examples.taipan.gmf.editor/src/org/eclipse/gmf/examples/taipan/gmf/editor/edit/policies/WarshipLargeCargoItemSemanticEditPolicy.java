/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.examples.taipan.gmf.editor.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.commands.EmptyBoxCreateCommand;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.commands.LargeItemCreateCommand;
import org.eclipse.gmf.examples.taipan.gmf.editor.providers.TaiPanElementTypes;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class WarshipLargeCargoItemSemanticEditPolicy extends TaiPanBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WarshipLargeCargoItemSemanticEditPolicy() {
		super(TaiPanElementTypes.Warship_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TaiPanElementTypes.LargeItem_3002 == req.getElementType()) {
			return getGEFWrapper(new LargeItemCreateCommand(req));
		}
		if (TaiPanElementTypes.EmptyBox_3003 == req.getElementType()) {
			return getGEFWrapper(new EmptyBoxCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
