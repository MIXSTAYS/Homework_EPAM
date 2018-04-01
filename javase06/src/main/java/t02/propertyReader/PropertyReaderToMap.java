package t02.propertyReader;

import exception.NoSuchKeyException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyReaderToMap {

    private static HashMap<String, String> propertyNotes = new HashMap<>();

    private static String propertyRead (String fileName, String key) throws IOException {

        Properties properties = new Properties();

        properties.load(new FileInputStream(fileName));
        if(properties.getProperty(key) == null) {
            throw new NoSuchKeyException("Key not found.");
        } else {
            return properties.getProperty(key);
        }
    }

    public static Map<String, String> propertyReaderToMap (String fileName, String key) throws IOException {
        propertyNotes.put(key, PropertyReaderToMap.propertyRead(fileName, key));
        return propertyNotes;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(propertyReaderToMap(
                "javase06\\src\\main\\java\\t02\\resources\\property.property", "1"));
        System.out.println(propertyReaderToMap(
                "javase06\\src\\main\\java\\t02\\resources\\property.property", "2"));
        System.out.println(propertyReaderToMap(
                "javase06\\src\\main\\java\\t02\\resources\\property.property", "3"));

        //При добавлении элемента с ключом, который уже присутствует, прошлый ключ перезаписывается
    }
}
