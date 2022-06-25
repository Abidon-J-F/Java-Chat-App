package R4.Utillity;

import java.io.*;
import java.util.Properties;

//Static class used to deliver sensitive string arguments to the program that arent meant to be hardcoded in to the base
public class ConfigLoader {

    private static final String PROPERTIES_PATH = "src/main/java/R4/config.properties";
    private static Properties properties = new Properties();
    private static InputStream input;

    static {
        try {
            input = new FileInputStream(PROPERTIES_PATH);
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String retrieveProperty(String propertyKey){
        return properties.getProperty(propertyKey);
    }

}
