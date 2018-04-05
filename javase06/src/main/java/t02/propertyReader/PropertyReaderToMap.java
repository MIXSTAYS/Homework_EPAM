package t02.propertyReader;

import exception.NoSuchKeyException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyReaderToMap {

    private static Properties properties;
    private static HashMap<String, String> propertyNotes = new HashMap<>();

    public static void propertyRead (String fileName) {
        try (FileInputStream readFile = new FileInputStream(fileName)) {
            properties = new Properties();

            properties.load(readFile);

        } catch (NoSuchKeyException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IOException e) {
            System.exit(1);
            e.printStackTrace();
        }
    }

    public static String propertyStringRead (String key) {
        if (properties.getProperty(key) == null) {
            throw new NoSuchKeyException("Key not found.");
        } else {
            return properties.getProperty(key);
        }
    }

    public static Map<String, String> propertyReaderToMap (String key) throws IOException {
        propertyNotes.put(key, PropertyReaderToMap.propertyStringRead(key));
        return propertyNotes;
    }
}
