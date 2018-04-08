import exception.NoSuchKeyException;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;


public class PropertyReaderTest {
    private PropertyReader propertyReader = new PropertyReader();

    @Test(expected = FileNotFoundException.class)
    public void propertyReadShouldThrowFileNotFoundException() {
        propertyReader.propertyRead("t01\\test\\resources\\universalTEST.property");
    }

    @Test(expected = NoSuchKeyException.class)
    public void propertyReadShouldThrowNoSuchKeyException() {
        propertyReader.propertyRead("t01\\test\\resources\\universal.property");
        propertyReader.propertyStringRead("5");
    }

    @Test
    public void propertyReaderShouldReturnString() {
        propertyReader.propertyRead("t01\\test\\resources\\universal.property");
        assertEquals("First", propertyReader.propertyStringRead("1"));
    }
}