package util;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    static Properties properties = new Properties();

    static {
        String fileName = "property.config";

        try (InputStream input = PropertyReader.class.getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                throw new RuntimeException("property.config file not found in classpath");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
