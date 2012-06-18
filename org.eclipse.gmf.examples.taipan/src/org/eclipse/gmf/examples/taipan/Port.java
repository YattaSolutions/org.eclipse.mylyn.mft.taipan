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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.examples.taipan.Port#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.gmf.examples.taipan.Port#getBuildings <em>Buildings</em>}</li>
 *   <li>{@link org.eclipse.gmf.examples.taipan.Port#getRegister <em>Register</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends Destination {

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getPort_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.examples.taipan.Port#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Buildings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.examples.taipan.Building}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buildings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildings</em>' containment reference list.
	 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getPort_Buildings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Building> getBuildings();

	/**
	 * Returns the value of the '<em><b>Register</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.examples.taipan.Ship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register</em>' reference list.
	 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getPort_Register()
	 * @model
	 * @generated
	 */
	EList<Ship> getRegister();

} // Port
