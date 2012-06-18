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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.examples.taipan.Item#getArticle <em>Article</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends EObject {

	/**
	 * Returns the value of the '<em><b>Article</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Article</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Article</em>' attribute.
	 * @see #setArticle(String)
	 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getItem_Article()
	 * @model
	 * @generated
	 */
	String getArticle();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.examples.taipan.Item#getArticle <em>Article</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Article</em>' attribute.
	 * @see #getArticle()
	 * @generated
	 */
	void setArticle(String value);

} // Item
