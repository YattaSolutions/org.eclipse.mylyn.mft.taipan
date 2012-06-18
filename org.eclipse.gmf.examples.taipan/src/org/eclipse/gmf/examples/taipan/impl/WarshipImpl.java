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
package org.eclipse.gmf.examples.taipan.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.gmf.examples.taipan.BesiegePortOrder;
import org.eclipse.gmf.examples.taipan.EscortShipsOrder;
import org.eclipse.gmf.examples.taipan.TaiPanPackage;
import org.eclipse.gmf.examples.taipan.Warship;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Warship</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.examples.taipan.impl.WarshipImpl#getEscortOrder <em>Escort Order</em>}</li>
 *   <li>{@link org.eclipse.gmf.examples.taipan.impl.WarshipImpl#getAttackOrders <em>Attack Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WarshipImpl extends ShipImpl implements Warship {

	/**
	 * The cached value of the '{@link #getEscortOrder() <em>Escort Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscortOrder()
	 * @generated
	 * @ordered
	 */
	protected EscortShipsOrder escortOrder;

	/**
	 * The cached value of the '{@link #getAttackOrders() <em>Attack Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<BesiegePortOrder> attackOrders;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WarshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaiPanPackage.Literals.WARSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscortShipsOrder getEscortOrder() {
		return escortOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEscortOrder(EscortShipsOrder newEscortOrder, NotificationChain msgs) {
		EscortShipsOrder oldEscortOrder = escortOrder;
		escortOrder = newEscortOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaiPanPackage.WARSHIP__ESCORT_ORDER, oldEscortOrder, newEscortOrder);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscortOrder(EscortShipsOrder newEscortOrder) {
		if (newEscortOrder != escortOrder) {
			NotificationChain msgs = null;
			if (escortOrder != null)
				msgs = ((InternalEObject) escortOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaiPanPackage.WARSHIP__ESCORT_ORDER, null, msgs);
			if (newEscortOrder != null)
				msgs = ((InternalEObject) newEscortOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaiPanPackage.WARSHIP__ESCORT_ORDER, null, msgs);
			msgs = basicSetEscortOrder(newEscortOrder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaiPanPackage.WARSHIP__ESCORT_ORDER, newEscortOrder, newEscortOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BesiegePortOrder> getAttackOrders() {
		if (attackOrders == null) {
			attackOrders = new EObjectContainmentEList<BesiegePortOrder>(BesiegePortOrder.class, this, TaiPanPackage.WARSHIP__ATTACK_ORDERS);
		}
		return attackOrders;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TaiPanPackage.WARSHIP__ESCORT_ORDER:
			return basicSetEscortOrder(null, msgs);
		case TaiPanPackage.WARSHIP__ATTACK_ORDERS:
			return ((InternalEList<?>) getAttackOrders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TaiPanPackage.WARSHIP__ESCORT_ORDER:
			return getEscortOrder();
		case TaiPanPackage.WARSHIP__ATTACK_ORDERS:
			return getAttackOrders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TaiPanPackage.WARSHIP__ESCORT_ORDER:
			setEscortOrder((EscortShipsOrder) newValue);
			return;
		case TaiPanPackage.WARSHIP__ATTACK_ORDERS:
			getAttackOrders().clear();
			getAttackOrders().addAll((Collection<? extends BesiegePortOrder>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TaiPanPackage.WARSHIP__ESCORT_ORDER:
			setEscortOrder((EscortShipsOrder) null);
			return;
		case TaiPanPackage.WARSHIP__ATTACK_ORDERS:
			getAttackOrders().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TaiPanPackage.WARSHIP__ESCORT_ORDER:
			return escortOrder != null;
		case TaiPanPackage.WARSHIP__ATTACK_ORDERS:
			return attackOrders != null && !attackOrders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // WarshipImpl
