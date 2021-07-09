package org.example;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    public static Properties getTestProperties() {
        try {
            Resource resource = new ClassPathResource("test.properties");
            return PropertiesLoaderUtils.loadProperties(resource);
        } catch (IOException e) {
            throw new RuntimeException("Unable to load properties", e);
        }
    }
}
