import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    static Properties prop = new Properties();

    public static void main(String[] args) {
        getProperties();
        setProperties();
    }

    public static void getProperties() {
        try {
            InputStream input = new FileInputStream("src/main/resources/config.properties");
            prop.load(input);
            String browser = prop.getProperty("browser");
            System.out.println(browser);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setProperties() {
        try {
            OutputStream output = new FileOutputStream("src/main/resources/config.properties");
            prop.setProperty("browser2", "firefox");
            prop.store(output, null);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
