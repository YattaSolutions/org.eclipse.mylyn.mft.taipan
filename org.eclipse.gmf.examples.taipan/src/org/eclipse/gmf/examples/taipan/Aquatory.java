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
package org.eclipse.gmf.examples.taipan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aquatory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.examples.taipan.Aquatory#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.eclipse.gmf.examples.taipan.Aquatory#getRoutes <em>Routes</em>}</li>
 *   <li>{@link org.eclipse.gmf.examples.taipan.Aquatory#getShips <em>Ships</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getAquatory()
 * @model
 * @generated
 */
public interface Aquatory extends EObject {

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.examples.taipan.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getAquatory_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Ships</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.examples.taipan.Ship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ships</em>' containment reference list.
	 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getAquatory_Ships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ship> getShips();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.examples.taipan.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getAquatory_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Aquatory
