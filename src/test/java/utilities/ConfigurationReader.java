package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties configFile;

    static {
        try {
            String path = System.getProperty("user.dir") + "\\configuration.properties";
            FileInputStream fis = new FileInputStream(path);
            configFile = new Properties();
            configFile.load(fis);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties file!");
        }

    }


    public static String getProperty(String key) {
        return configFile.getProperty(key);
    }
}
