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

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.examples.taipan.Route;
import org.eclipse.gmf.examples.taipan.TaiPanPackage;
import org.eclipse.gmf.examples.taipan.gmf.editor.expressions.TaiPanAbstractExpression;
import org.eclipse.gmf.examples.taipan.gmf.editor.expressions.TaiPanOCLFactory;
import org.eclipse.gmf.examples.taipan.gmf.editor.part.TaiPanDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Route_4002(Route instance) {
		try {
			Object value_0 = TaiPanOCLFactory.getExpression(2, TaiPanPackage.eINSTANCE.getRoute(), null).evaluate(instance);

			value_0 = TaiPanAbstractExpression.performCast(value_0, EcorePackage.eINSTANCE.getEDouble());
			instance.setReliability(((Double) value_0).doubleValue());
		} catch (RuntimeException e) {
			TaiPanDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Route_4003(Route instance) {
		try {
			Object value_0 = TaiPanOCLFactory.getExpression(4, TaiPanPackage.eINSTANCE.getRoute(), null).evaluate(instance);

			value_0 = TaiPanAbstractExpression.performCast(value_0, EcorePackage.eINSTANCE.getEDouble());
			instance.setReliability(((Double) value_0).doubleValue());
		} catch (RuntimeException e) {
			TaiPanDiagramEditorPlugin.getInstance().logError("Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = TaiPanDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			TaiPanDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}

}
