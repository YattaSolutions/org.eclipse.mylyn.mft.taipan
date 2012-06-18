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
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.commands.ReliableRouteCreateCommand;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.commands.ReliableRouteReorientCommand;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.commands.ShipRouteCreateCommand;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.commands.ShipRouteReorientCommand;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.commands.UnreliableRouteCreateCommand;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.commands.UnreliableRouteReorientCommand;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.ReliableRouteEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.ShipRouteEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.UnreliableRouteEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.providers.TaiPanElementTypes;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class UnreliableRouteItemSemanticEditPolicy extends TaiPanBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UnreliableRouteItemSemanticEditPolicy() {
		super(TaiPanElementTypes.Route_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TaiPanElementTypes.Route_4002 == req.getElementType()) {
			return getGEFWrapper(new ReliableRouteCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (TaiPanElementTypes.Route_4003 == req.getElementType()) {
			return getGEFWrapper(new UnreliableRouteCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (TaiPanElementTypes.ShipRoute_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TaiPanElementTypes.Route_4002 == req.getElementType()) {
			return getGEFWrapper(new ReliableRouteCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (TaiPanElementTypes.Route_4003 == req.getElementType()) {
			return getGEFWrapper(new UnreliableRouteCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (TaiPanElementTypes.ShipRoute_4004 == req.getElementType()) {
			return getGEFWrapper(new ShipRouteCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ReliableRouteEditPart.VISUAL_ID:
			return getGEFWrapper(new ReliableRouteReorientCommand(req));
		case UnreliableRouteEditPart.VISUAL_ID:
			return getGEFWrapper(new UnreliableRouteReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ShipRouteEditPart.VISUAL_ID:
			return getGEFWrapper(new ShipRouteReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
