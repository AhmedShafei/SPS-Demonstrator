package org.n52.sps.common.integration.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntegrationTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(IntegrationTest.class);
    
    private static final String PROPERTIES_LOCATION = "/integration-test.properties";

    protected static final String PARAMETER_LOCAL_WEBAPP_DIRECTORY = "local.webapp.directory";
    
    protected static final String PARAMETER_INSTANCE_PORT = "sps.instance.port";

    protected static final String PARAMETER_SPS_INSTANCE = "sps.instance";
    
    protected Properties itConfig = new Properties();
    
    @Before
    public void setUp() {
        try {
            InputStream inputStream = getClass().getResourceAsStream(PROPERTIES_LOCATION);
            loadAndValidateConfigurationIntoProperties(inputStream);
            LOGGER.info("Integration test config: {}", itConfig);
        } catch (Exception e) {
            LOGGER.error("Could not read {}.", PROPERTIES_LOCATION, e);
        }
    }

    private void loadAndValidateConfigurationIntoProperties(InputStream stream) throws IOException {
        if (stream == null) {
            throw new NullPointerException(PROPERTIES_LOCATION + " not found!");
        } else {
            itConfig.load(stream);
            validateConfiguration();
        }
    }
    
    private void validateConfiguration() {
        // TODO Auto-generated method stub
        
    }

    @Test
    public void test() {
        
    }

}
