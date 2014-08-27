/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.adapter.gateway;

import net.opengis.sps.x20.SubmitDocument;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

/**
 * Responsible for the communication with SPS Gateway
 */
public interface GatewayAdapter {

	public XmlObject submit(SubmitDocument submit) throws XmlException;

	public XmlObject getTask(String taskID) throws XmlException;

	public XmlObject getStatus(String taskID) throws XmlException;
}
