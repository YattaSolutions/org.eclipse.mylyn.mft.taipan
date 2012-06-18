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
package org.eclipse.gmf.examples.taipan.gmf.editor.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.examples.taipan.TaiPanPackage;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.AquatoryEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.BesiegePortOrderEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.EmptyBoxEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.EscortShipsOrderEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.LargeItemEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.PortEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.PortRegisterEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.ReliableRouteEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.ShipDestinationEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.ShipEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.ShipRouteEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.SmallItemsEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.UnreliableRouteEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts.WarshipEditPart;
import org.eclipse.gmf.examples.taipan.gmf.editor.part.TaiPanDiagramEditorPlugin;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class TaiPanElementTypes {

	/**
	 * @generated
	 */
	private TaiPanElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Aquatory_1000 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.Aquatory_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Port_2001 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.Port_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Ship_2002 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.Ship_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Warship_2003 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.Warship_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmallItems_3001 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.SmallItems_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LargeItem_3002 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.LargeItem_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EmptyBox_3003 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.EmptyBox_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ShipDestination_4001 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.ShipDestination_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Route_4002 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.Route_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Route_4003 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.Route_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ShipRoute_4004 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.ShipRoute_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BesiegePortOrder_4005 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.BesiegePortOrder_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EscortShipsOrder_4006 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.EscortShipsOrder_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PortRegister_4007 = getElementType("org.eclipse.gmf.examples.taipan.gmf.editor.PortRegister_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass && !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return TaiPanDiagramEditorPlugin.getInstance().getItemImageDescriptor(eClass.getEPackage().getEFactoryInstance().create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns type of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Aquatory_1000, TaiPanPackage.eINSTANCE.getAquatory());

			elements.put(Port_2001, TaiPanPackage.eINSTANCE.getPort());

			elements.put(Ship_2002, TaiPanPackage.eINSTANCE.getShip());

			elements.put(Warship_2003, TaiPanPackage.eINSTANCE.getWarship());

			elements.put(SmallItems_3001, TaiPanPackage.eINSTANCE.getSmallItems());

			elements.put(LargeItem_3002, TaiPanPackage.eINSTANCE.getLargeItem());

			elements.put(EmptyBox_3003, TaiPanPackage.eINSTANCE.getEmptyBox());

			elements.put(ShipDestination_4001, TaiPanPackage.eINSTANCE.getShip_Destination());

			elements.put(Route_4002, TaiPanPackage.eINSTANCE.getRoute());

			elements.put(Route_4003, TaiPanPackage.eINSTANCE.getRoute());

			elements.put(ShipRoute_4004, TaiPanPackage.eINSTANCE.getShip_Route());

			elements.put(BesiegePortOrder_4005, TaiPanPackage.eINSTANCE.getBesiegePortOrder());

			elements.put(EscortShipsOrder_4006, TaiPanPackage.eINSTANCE.getEscortShipsOrder());

			elements.put(PortRegister_4007, TaiPanPackage.eINSTANCE.getPort_Register());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Aquatory_1000);
			KNOWN_ELEMENT_TYPES.add(Port_2001);
			KNOWN_ELEMENT_TYPES.add(Ship_2002);
			KNOWN_ELEMENT_TYPES.add(Warship_2003);
			KNOWN_ELEMENT_TYPES.add(SmallItems_3001);
			KNOWN_ELEMENT_TYPES.add(LargeItem_3002);
			KNOWN_ELEMENT_TYPES.add(EmptyBox_3003);
			KNOWN_ELEMENT_TYPES.add(ShipDestination_4001);
			KNOWN_ELEMENT_TYPES.add(Route_4002);
			KNOWN_ELEMENT_TYPES.add(Route_4003);
			KNOWN_ELEMENT_TYPES.add(ShipRoute_4004);
			KNOWN_ELEMENT_TYPES.add(BesiegePortOrder_4005);
			KNOWN_ELEMENT_TYPES.add(EscortShipsOrder_4006);
			KNOWN_ELEMENT_TYPES.add(PortRegister_4007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case AquatoryEditPart.VISUAL_ID:
			return Aquatory_1000;
		case PortEditPart.VISUAL_ID:
			return Port_2001;
		case ShipEditPart.VISUAL_ID:
			return Ship_2002;
		case WarshipEditPart.VISUAL_ID:
			return Warship_2003;
		case SmallItemsEditPart.VISUAL_ID:
			return SmallItems_3001;
		case LargeItemEditPart.VISUAL_ID:
			return LargeItem_3002;
		case EmptyBoxEditPart.VISUAL_ID:
			return EmptyBox_3003;
		case ShipDestinationEditPart.VISUAL_ID:
			return ShipDestination_4001;
		case ReliableRouteEditPart.VISUAL_ID:
			return Route_4002;
		case UnreliableRouteEditPart.VISUAL_ID:
			return Route_4003;
		case ShipRouteEditPart.VISUAL_ID:
			return ShipRoute_4004;
		case BesiegePortOrderEditPart.VISUAL_ID:
			return BesiegePortOrder_4005;
		case EscortShipsOrderEditPart.VISUAL_ID:
			return EscortShipsOrder_4006;
		case PortRegisterEditPart.VISUAL_ID:
			return PortRegister_4007;
		}
		return null;
	}

}
