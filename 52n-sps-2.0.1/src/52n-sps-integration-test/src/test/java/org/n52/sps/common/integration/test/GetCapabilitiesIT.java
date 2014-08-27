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
package org.n52.sps.common.integration.test;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.junit.Before;
import org.junit.Test;
import org.n52.oxf.OXFException;
import org.n52.oxf.ows.ExceptionReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetCapabilitiesIT extends IntegrationTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(GetCapabilitiesIT.class);
	
	@Before
	public void setUp() {
	    super.setUp();
	}
	
	@Test
	public void shouldReceiveValidCapabilities() throws OXFException, XmlException, ExceptionReport, IOException {
//		ServiceInstance.getInstance().waitUntilAvailable();
//		
//		logger.info("Requesting Capabilities...");
//		
//		EnvelopeDocument response = requestCapabilities();
//		
//		logger.info("Response from SES: {}", response);
//		
//		Collection<XmlError> errors = XMLBeansParser.validate(response);
//		Assert.assertTrue("Capabilities are not valid!", errors.isEmpty());
	}

	
}
