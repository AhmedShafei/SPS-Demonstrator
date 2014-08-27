/**
 * Contact: Ahmed Shafei
 * Siemens AG
 * Ahmed.Shafei@Siemens.com
 */
package org.n52.adapter.gateway;

import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import net.opengis.sps.x20.SubmitDocument;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GatewayAdapterImpl implements GatewayAdapter {

	private RestTemplate restTemplate;
	private HttpHeaders headers;
	HttpEntity<String> httpEntity;
	private String spsAdapterBaseURL;

	public GatewayAdapterImpl() {
		restTemplate = new RestTemplate();
		headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
		headers.setContentType(MediaType.APPLICATION_XML);
		Properties prop = new Properties();
		try {
			prop.load(GatewayAdapterImpl.class
					.getResourceAsStream("/spsadapter.properties"));
			spsAdapterBaseURL = (String) prop.get("sps.adapter.address");
		} catch (IOException e) {
		}
	}

	public XmlObject submit(SubmitDocument submit) throws XmlException {
		httpEntity = new HttpEntity<String>(submit.xmlText(), headers);
		ResponseEntity<String> response = restTemplate.exchange(
				spsAdapterBaseURL + "/tasks", HttpMethod.POST, httpEntity,
				String.class);
		return XmlObject.Factory.parse(response.getBody());
	}

	public XmlObject getTask(String taskID) throws XmlException {
		httpEntity = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(
				spsAdapterBaseURL + "/tasks/" + taskID, HttpMethod.GET,
				httpEntity, String.class);
		return XmlObject.Factory.parse(response.getBody());
	}

	public XmlObject getStatus(String taskID) throws XmlException {
		httpEntity = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange(
				spsAdapterBaseURL + "/tasks/" + taskID, HttpMethod.GET,
				httpEntity, String.class);
		return XmlObject.Factory.parse(response.getBody());
	}
}