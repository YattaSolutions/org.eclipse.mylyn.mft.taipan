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
package org.eclipse.gmf.examples.taipan.gmf.editor.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.examples.taipan.gmf.editor.providers.TaiPanElementTypes;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class TaiPanPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createLinks2Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.setSmallIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/Port.gif")); //$NON-NLS-1$
		paletteContainer.setLargeIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/Port.gif")); //$NON-NLS-1$
		paletteContainer.add(createPort1CreationTool());
		paletteContainer.add(createShip2CreationTool());
		paletteContainer.add(createWarship3CreationTool());
		paletteContainer.add(createSmallItems4CreationTool());
		paletteContainer.add(createLargeItem5CreationTool());
		paletteContainer.add(createEmptyBox6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Links2Group_title);
		paletteContainer.setId("createLinks2Group"); //$NON-NLS-1$
		paletteContainer.setSmallIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/Route.gif")); //$NON-NLS-1$
		paletteContainer.setLargeIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/Route.gif")); //$NON-NLS-1$
		paletteContainer.add(createReliableRoute1CreationTool());
		paletteContainer.add(createUnreliableRoute2CreationTool());
		paletteContainer.add(createRegistration3CreationTool());
		paletteContainer.add(createShipDestination4CreationTool());
		paletteContainer.add(createShipRoute5CreationTool());
		paletteContainer.add(createBesiegePortOrder6CreationTool());
		paletteContainer.add(createEscortShipsOrder7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Port1CreationTool_title, Messages.Port1CreationTool_desc, Collections.singletonList(TaiPanElementTypes.Port_2001));
		entry.setId("createPort1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanElementTypes.getImageDescriptor(TaiPanElementTypes.Port_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShip2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Ship2CreationTool_title, Messages.Ship2CreationTool_desc, Collections.singletonList(TaiPanElementTypes.Ship_2002));
		entry.setId("createShip2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanElementTypes.getImageDescriptor(TaiPanElementTypes.Ship_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWarship3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Warship3CreationTool_title, Messages.Warship3CreationTool_desc, Collections.singletonList(TaiPanElementTypes.Warship_2003));
		entry.setId("createWarship3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanElementTypes.getImageDescriptor(TaiPanElementTypes.Warship_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSmallItems4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.SmallItems4CreationTool_title, Messages.SmallItems4CreationTool_desc, Collections.singletonList(TaiPanElementTypes.SmallItems_3001));
		entry.setId("createSmallItems4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanElementTypes.getImageDescriptor(TaiPanElementTypes.SmallItems_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLargeItem5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.LargeItem5CreationTool_title, Messages.LargeItem5CreationTool_desc, Collections.singletonList(TaiPanElementTypes.LargeItem_3002));
		entry.setId("createLargeItem5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanElementTypes.getImageDescriptor(TaiPanElementTypes.LargeItem_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEmptyBox6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.EmptyBox6CreationTool_title, Messages.EmptyBox6CreationTool_desc, Collections.singletonList(TaiPanElementTypes.EmptyBox_3003));
		entry.setId("createEmptyBox6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanElementTypes.getImageDescriptor(TaiPanElementTypes.EmptyBox_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReliableRoute1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.ReliableRoute1CreationTool_title, Messages.ReliableRoute1CreationTool_desc, Collections.singletonList(TaiPanElementTypes.Route_4002));
		entry.setId("createReliableRoute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/Route.gif")); //$NON-NLS-1$
		entry.setLargeIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/Route.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnreliableRoute2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.UnreliableRoute2CreationTool_title, Messages.UnreliableRoute2CreationTool_desc, Collections.singletonList(TaiPanElementTypes.Route_4003));
		entry.setId("createUnreliableRoute2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/UnreliableRoute.gif")); //$NON-NLS-1$
		entry.setLargeIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/UnreliableRoute.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegistration3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.Registration3CreationTool_title, Messages.Registration3CreationTool_desc, Collections.singletonList(TaiPanElementTypes.PortRegister_4007));
		entry.setId("createRegistration3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/ShipRegistration.gif")); //$NON-NLS-1$
		entry.setLargeIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/ShipRegistration.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShipDestination4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.ShipDestination4CreationTool_title, Messages.ShipDestination4CreationTool_desc,
				Collections.singletonList(TaiPanElementTypes.ShipDestination_4001));
		entry.setId("createShipDestination4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/ShipDestination.gif")); //$NON-NLS-1$
		entry.setLargeIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/ShipDestination.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShipRoute5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.ShipRoute5CreationTool_title, Messages.ShipRoute5CreationTool_desc, Collections.singletonList(TaiPanElementTypes.ShipRoute_4004));
		entry.setId("createShipRoute5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/ShipRoute.gif")); //$NON-NLS-1$
		entry.setLargeIcon(TaiPanDiagramEditorPlugin.findImageDescriptor("/org.eclipse.gmf.examples.taipan.edit/icons/full/obj16/ShipRoute.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBesiegePortOrder6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.BesiegePortOrder6CreationTool_title, Messages.BesiegePortOrder6CreationTool_desc,
				Collections.singletonList(TaiPanElementTypes.BesiegePortOrder_4005));
		entry.setId("createBesiegePortOrder6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanElementTypes.getImageDescriptor(TaiPanElementTypes.BesiegePortOrder_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEscortShipsOrder7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.EscortShipsOrder7CreationTool_title, Messages.EscortShipsOrder7CreationTool_desc,
				Collections.singletonList(TaiPanElementTypes.EscortShipsOrder_4006));
		entry.setId("createEscortShipsOrder7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TaiPanElementTypes.getImageDescriptor(TaiPanElementTypes.EscortShipsOrder_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description, List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description, List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
