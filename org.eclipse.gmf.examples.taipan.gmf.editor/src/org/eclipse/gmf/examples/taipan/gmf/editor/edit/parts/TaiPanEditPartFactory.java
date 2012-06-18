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
package org.eclipse.gmf.examples.taipan.gmf.editor.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.examples.taipan.gmf.editor.part.TaiPanVisualIDRegistry;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class TaiPanEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TaiPanVisualIDRegistry.getVisualID(view)) {

			case AquatoryEditPart.VISUAL_ID:
				return new AquatoryEditPart(view);

			case PortEditPart.VISUAL_ID:
				return new PortEditPart(view);

			case PortLocationEditPart.VISUAL_ID:
				return new PortLocationEditPart(view);

			case ShipEditPart.VISUAL_ID:
				return new ShipEditPart(view);

			case ShipNameEditPart.VISUAL_ID:
				return new ShipNameEditPart(view);

			case WarshipEditPart.VISUAL_ID:
				return new WarshipEditPart(view);

			case WarshipNameEditPart.VISUAL_ID:
				return new WarshipNameEditPart(view);

			case SmallItemsEditPart.VISUAL_ID:
				return new SmallItemsEditPart(view);

			case LargeItemEditPart.VISUAL_ID:
				return new LargeItemEditPart(view);

			case LargeItemArticleEditPart.VISUAL_ID:
				return new LargeItemArticleEditPart(view);

			case LargeItemWeightEditPart.VISUAL_ID:
				return new LargeItemWeightEditPart(view);

			case EmptyBoxEditPart.VISUAL_ID:
				return new EmptyBoxEditPart(view);

			case ShipSmallCargoEditPart.VISUAL_ID:
				return new ShipSmallCargoEditPart(view);

			case ShipLargeCargoEditPart.VISUAL_ID:
				return new ShipLargeCargoEditPart(view);

			case WarshipSmallCargoEditPart.VISUAL_ID:
				return new WarshipSmallCargoEditPart(view);

			case WarshipLargeCargoEditPart.VISUAL_ID:
				return new WarshipLargeCargoEditPart(view);

			case ShipDestinationEditPart.VISUAL_ID:
				return new ShipDestinationEditPart(view);

			case ShipDestinationMarkerEditPart.VISUAL_ID:
				return new ShipDestinationMarkerEditPart(view);

			case ReliableRouteEditPart.VISUAL_ID:
				return new ReliableRouteEditPart(view);

			case ReliableRouteDescEditPart.VISUAL_ID:
				return new ReliableRouteDescEditPart(view);

			case ReliableRouteRelbEditPart.VISUAL_ID:
				return new ReliableRouteRelbEditPart(view);

			case UnreliableRouteEditPart.VISUAL_ID:
				return new UnreliableRouteEditPart(view);

			case UnreliableRouteDescEditPart.VISUAL_ID:
				return new UnreliableRouteDescEditPart(view);

			case UnreliableRouteRelbEditPart.VISUAL_ID:
				return new UnreliableRouteRelbEditPart(view);

			case ShipRouteEditPart.VISUAL_ID:
				return new ShipRouteEditPart(view);

			case BesiegePortOrderEditPart.VISUAL_ID:
				return new BesiegePortOrderEditPart(view);

			case EscortShipsOrderEditPart.VISUAL_ID:
				return new EscortShipsOrderEditPart(view);

			case PortRegisterEditPart.VISUAL_ID:
				return new PortRegisterEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn() && getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
