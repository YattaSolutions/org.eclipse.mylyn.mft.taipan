/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.eclipse.gmf.examples.taipan.figures;

import org.eclipse.draw2d.AnchorListener;
import org.eclipse.draw2d.ArrowLocator;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.DelegatingLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * Generic shape-based connection.
 * 
 * @author dstadnik
 */
public abstract class ShapeConnection extends Shape implements Connection, AnchorListener {

	private ConnectionAnchor startAnchor, endAnchor;

	private ConnectionRouter connectionRouter = ConnectionRouter.NULL;

	private RotatableDecoration startArrow, endArrow;

	private PointList points;

	public ShapeConnection() {
		setLayoutManager(new DelegatingLayout());
		points = new PointList();
		points.addPoint(new Point(0, 0));
		points.addPoint(new Point(100, 100));
	}

	protected Rectangle getShapeBounds() {
		return getPoints().getBounds().getExpanded(lineWidth / 2, lineWidth / 2);
	}

	public Rectangle getBounds() {
		if (bounds == null) {
			bounds = getShapeBounds();
			for (int i = 0; i < getChildren().size(); i++) {
				IFigure child = (IFigure) getChildren().get(i);
				bounds.union(child.getBounds());
			}
		}
		return bounds;
	}

	public void layout() {
		if (getSourceAnchor() != null && getTargetAnchor() != null)
			connectionRouter.route(this);

		Rectangle oldBounds = bounds;
		super.layout();
		bounds = null;

		if (!getBounds().contains(oldBounds)) {
			getParent().translateToParent(oldBounds);
			getUpdateManager().addDirtyRegion(getParent(), oldBounds);
		}

		repaint();
		fireFigureMoved();
	}

	public void revalidate() {
		super.revalidate();
		connectionRouter.invalidate(this);
	}

	public PointList getPoints() {
		return points;
	}

	public void setPoints(PointList points) {
		erase();
		this.points = points;
		bounds = null;
		firePropertyChange(Connection.PROPERTY_POINTS, null, points);
		repaint();
	}

	public void addNotify() {
		super.addNotify();
		hookSourceAnchor();
		hookTargetAnchor();
	}

	private void hookSourceAnchor() {
		if (getSourceAnchor() != null)
			getSourceAnchor().addAnchorListener(this);
	}

	private void hookTargetAnchor() {
		if (getTargetAnchor() != null)
			getTargetAnchor().addAnchorListener(this);
	}

	public void removeNotify() {
		unhookSourceAnchor();
		unhookTargetAnchor();
		connectionRouter.remove(this);
		super.removeNotify();
	}

	private void unhookSourceAnchor() {
		if (getSourceAnchor() != null)
			getSourceAnchor().removeAnchorListener(this);
	}

	private void unhookTargetAnchor() {
		if (getTargetAnchor() != null)
			getTargetAnchor().removeAnchorListener(this);
	}

	public void anchorMoved(ConnectionAnchor anchor) {
		revalidate();
	}

	public ConnectionRouter getConnectionRouter() {
		return connectionRouter;
	}

	public void setConnectionRouter(ConnectionRouter cr) {
		if (cr == null)
			cr = ConnectionRouter.NULL;
		ConnectionRouter oldRouter = getConnectionRouter();
		if (oldRouter != cr) {
			connectionRouter.remove(this);
			connectionRouter = cr;
			firePropertyChange(Connection.PROPERTY_CONNECTION_ROUTER, oldRouter, cr);
			revalidate();
		}
	}

	public Object getRoutingConstraint() {
		if (getConnectionRouter() != null)
			return getConnectionRouter().getConstraint(this);
		else
			return null;
	}

	public void setRoutingConstraint(Object cons) {
		if (connectionRouter != null)
			connectionRouter.setConstraint(this, cons);
		revalidate();
	}

	public ConnectionAnchor getSourceAnchor() {
		return startAnchor;
	}

	protected RotatableDecoration getSourceDecoration() {
		return startArrow;
	}

	public ConnectionAnchor getTargetAnchor() {
		return endAnchor;
	}

	protected RotatableDecoration getTargetDecoration() {
		return endArrow;
	}

	public void setSourceAnchor(ConnectionAnchor anchor) {
		if (anchor == startAnchor)
			return;
		unhookSourceAnchor();
		startAnchor = anchor;
		if (getParent() != null)
			hookSourceAnchor();
		revalidate();
	}

	public void setSourceDecoration(RotatableDecoration dec) {
		if (startArrow == dec)
			return;
		if (startArrow != null)
			remove(startArrow);
		startArrow = dec;
		if (startArrow != null)
			add(startArrow, new ArrowLocator(this, ConnectionLocator.SOURCE));
	}

	public void setTargetAnchor(ConnectionAnchor anchor) {
		if (anchor == endAnchor)
			return;
		unhookTargetAnchor();
		endAnchor = anchor;
		if (getParent() != null)
			hookTargetAnchor();
		revalidate();
	}

	public void setTargetDecoration(RotatableDecoration dec) {
		if (endArrow == dec)
			return;
		if (endArrow != null)
			remove(endArrow);
		endArrow = dec;
		if (endArrow != null)
			add(endArrow, new ArrowLocator(this, ConnectionLocator.TARGET));
	}
}
