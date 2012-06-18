/*
 * Copyright (c) 2005 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dmitri Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.examples.taipan.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.gmf.examples.taipan.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaiPanFactoryImpl extends EFactoryImpl implements TaiPanFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaiPanFactory init() {
		try {
			TaiPanFactory theTaiPanFactory = (TaiPanFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/examples/gmf/taipan"); //$NON-NLS-1$ 
			if (theTaiPanFactory != null) {
				return theTaiPanFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaiPanFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaiPanFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TaiPanPackage.AQUATORY:
			return createAquatory();
		case TaiPanPackage.PORT:
			return createPort();
		case TaiPanPackage.BUILDING:
			return createBuilding();
		case TaiPanPackage.ROUTE:
			return createRoute();
		case TaiPanPackage.SHIP:
			return createShip();
		case TaiPanPackage.LARGE_ITEM:
			return createLargeItem();
		case TaiPanPackage.SMALL_ITEMS:
			return createSmallItems();
		case TaiPanPackage.EMPTY_BOX:
			return createEmptyBox();
		case TaiPanPackage.WARSHIP:
			return createWarship();
		case TaiPanPackage.ESCORT_SHIPS_ORDER:
			return createEscortShipsOrder();
		case TaiPanPackage.BESIEGE_PORT_ORDER:
			return createBesiegePortOrder();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aquatory createAquatory() {
		AquatoryImpl aquatory = new AquatoryImpl();
		return aquatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ship createShip() {
		ShipImpl ship = new ShipImpl();
		return ship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeItem createLargeItem() {
		LargeItemImpl largeItem = new LargeItemImpl();
		return largeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallItems createSmallItems() {
		SmallItemsImpl smallItems = new SmallItemsImpl();
		return smallItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyBox createEmptyBox() {
		EmptyBoxImpl emptyBox = new EmptyBoxImpl();
		return emptyBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Warship createWarship() {
		WarshipImpl warship = new WarshipImpl();
		return warship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscortShipsOrder createEscortShipsOrder() {
		EscortShipsOrderImpl escortShipsOrder = new EscortShipsOrderImpl();
		return escortShipsOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BesiegePortOrder createBesiegePortOrder() {
		BesiegePortOrderImpl besiegePortOrder = new BesiegePortOrderImpl();
		return besiegePortOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Building createBuilding() {
		BuildingImpl building = new BuildingImpl();
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaiPanPackage getTaiPanPackage() {
		return (TaiPanPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaiPanPackage getPackage() {
		return TaiPanPackage.eINSTANCE;
	}

} //TaiPanFactoryImpl
