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

package org.n52.delegate.gateway;

import net.opengis.sps.x20.SubmitDocument;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.n52.adapter.gateway.GatewayAdapter;
import org.n52.adapter.gateway.GatewayAdapterImpl;
import org.n52.delegate.DelegationHandler;
import org.n52.ows.exception.NoApplicableCodeException;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.sps.service.SensorPlanningService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GatewayXmlDelegate implements DelegationHandler {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(GatewayXmlDelegate.class);

	private SensorPlanningService service;

	private XmlObject request;

	public GatewayXmlDelegate(SensorPlanningService service, XmlObject request) {
		this.service = service;
		this.request = request;
	}

	XmlObject getRequest() {
		return request;
	}

	SensorPlanningService getService() {
		return service;
	}

	public XmlObject delegate() throws OwsException, OwsExceptionReport,
			XmlException {
		SchemaType schemaType = request.schemaType();
		GatewayAdapter gatewayAdapter = new GatewayAdapterImpl();
		if (schemaType == SubmitDocument.type) {
			SubmitDocument submit = (SubmitDocument) request;
			return gatewayAdapter.submit(submit);
		} else {
			LOGGER.error("No delegation handler for '{}' request.", schemaType);
			throw new NoApplicableCodeException(OwsException.BAD_REQUEST);
		}
	}
}