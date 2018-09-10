package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static utils.Constants.CONFIG_PROPERTIES_DIRECTORY;

public class ReadConfigFile {

    protected InputStream inputStream = null;
    protected Properties properties = null;

    public ReadConfigFile() {
        try {
            System.out.println("Got to the ReadConigFile method.");
            inputStream = new FileInputStream(CONFIG_PROPERTIES_DIRECTORY);
            properties = new Properties();
            properties.load(inputStream);

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        if (properties.getProperty("browser") == null){
            return "";
        } else {
            return properties.getProperty("browser");
        }
    }
}
