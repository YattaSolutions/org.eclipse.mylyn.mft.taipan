/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.gmf.examples.taipan;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escort Ships Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.examples.taipan.EscortShipsOrder#getShips <em>Ships</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getEscortShipsOrder()
 * @model
 * @generated
 */
public interface EscortShipsOrder extends Order {

	/**
	 * Returns the value of the '<em><b>Ships</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.examples.taipan.Ship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ships</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ships</em>' reference list.
	 * @see org.eclipse.gmf.examples.taipan.TaiPanPackage#getEscortShipsOrder_Ships()
	 * @model required="true"
	 * @generated
	 */
	EList<Ship> getShips();

} // EscortShipsOrder
