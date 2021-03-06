package t02.propertyReader;

import t02.exception.NoSuchKeyException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyReaderToMap {

    private Properties properties;
    private Map<String, String> propertyNotes = new HashMap<>();
    private static Map<String, Properties> map = new HashMap<>();

    public void propertyRead(String fileName) {
        if (map.containsKey(fileName)) {
            System.out.println("File already open");
        }
        try (FileInputStream readFile = new FileInputStream(fileName)) {
            properties = new Properties();
            properties.load(readFile);
            map.put(fileName, properties);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IOException e) {
            System.exit(1);
            e.printStackTrace();
        }
    }

    public String propertyStringRead(String key) {
        try {
            if (propertyNotes.get(key) == null) {
                throw new NoSuchKeyException("Key not found.");
            }
            return propertyNotes.get(key);
        } catch (NoSuchKeyException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

    public void propertyReaderToMap() {
        Enumeration enumeration = properties.propertyNames();
        for (; enumeration.hasMoreElements(); ) {
            String key = (String) enumeration.nextElement();
            String value = properties.getProperty(key);
            propertyNotes.put(key, value);
        }
    }
}
