import exception.NoSuchKeyException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static String propertyRead (String fileName, String key) throws IOException {

        Properties properties = new Properties();

        properties.load(new FileInputStream(fileName));
        if(properties.getProperty(key) == null) {
            throw new NoSuchKeyException("Key not found.");
        } else {
            return properties.getProperty(key);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(PropertyReader
                    .propertyRead(
                            "javase05\\t01\\main\\resources\\universal.property", "2"));
        } catch (NoSuchKeyException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
