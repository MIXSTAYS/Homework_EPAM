import exception.NoSuchKeyException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private static Properties properties;

    public static void propertyRead(String fileName) {
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


//    public static String propertyRead(String fileName, String key) {
//        try (FileInputStream readFile = new FileInputStream(fileName);) {
//            Properties properties = new Properties();
//
//            properties.load(readFile);
//            if (properties.getProperty(key) == null) {
//                throw new NoSuchKeyException("Key not found.");
//            } else {
//                return properties.getProperty(key);
//            }
//        } catch (NoSuchKeyException | FileNotFoundException e) {
//            e.printStackTrace();
//            System.exit(1);
//        } catch (IOException e) {
//            System.exit(1);
//            e.printStackTrace();
//        }
//        return "System.exit(1)";
//    }
}
