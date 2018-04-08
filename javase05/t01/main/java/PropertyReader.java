import exception.NoSuchKeyException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private static Properties properties;
    private static int opensCounter = 0;

    public void propertyRead(String fileName) {
        if (opensCounter > 0) {
            System.out.println("File already open");
        } else {
            try (FileInputStream readFile = new FileInputStream(fileName)) {
                properties = new Properties();
                properties.load(readFile);
                opensCounter++;
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
    }

    public String propertyStringRead (String key) {
        if (properties.getProperty(key) == null) {
            throw new NoSuchKeyException("Key not found.");
        } else {
            return properties.getProperty(key);
        }
    }
}
