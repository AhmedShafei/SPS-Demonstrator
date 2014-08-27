/**
 * Copyright (C) 2012
 * by 52 North Initiative for Geospatial Open Source Software GmbH
 *
 * Contact: Andreas Wytzisk
 * 52 North Initiative for Geospatial Open Source Software GmbH
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * This program is free software; you can redistribute and/or modify it under
 * the terms of the GNU General Public License version 2 as published by the
 * Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program (see gnu-gpl v2.txt). If not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA or
 * visit the Free Software Foundation web page, http://www.fsf.org.
 */

package org.n52.delegate;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.n52.adapter.gateway.GatewayAdapter;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.sps.service.cancel.TaskCanceller;
import org.n52.sps.service.core.BasicSensorPlanner;
import org.n52.sps.service.core.SensorProvider;
import org.n52.sps.service.description.SensorDescriptionManager;
import org.n52.sps.service.feasibility.FeasibilityController;
import org.n52.sps.service.reservation.ReservationManager;
import org.n52.sps.service.update.TaskUpdater;

public interface DelegationHandler {

	/**
	 * Delegate request to corresponding internal SPS components or SPS Gateway
	 * 
	 * @return the service's response.
	 * @throws OwsException
	 * @see BasicSensorPlanner
	 * @see TaskUpdater
	 * @see TaskCanceller
	 * @see ReservationManager
	 * @see SensorDescriptionManager
	 * @see FeasibilityController
	 * @see SensorProvider
	 * @see GatewayAdapter
	 */
	public XmlObject delegate() throws OwsException, OwsExceptionReport,
			XmlException;

}
