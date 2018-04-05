

import exception.NoSuchKeyException;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class PropertyReaderTest {

    @Test(expected = FileNotFoundException.class)
    public void propertyReadShouldThrowFileNotFoundException() {
        PropertyReader.propertyRead("t01\\test\\resources\\universalTEST.property");
    }

    @Test(expected = NoSuchKeyException.class)
    public void propertyReadShouldThrowNoSuchKeyException() {
        PropertyReader.propertyRead("t01\\test\\resources\\universal.property");
        PropertyReader.propertyStringRead("5");
    }

    @Test
    public void propertyReaderShouldReturnString() {
        PropertyReader.propertyRead("t01\\test\\resources\\universal.property");
        assertEquals("First", PropertyReader.propertyStringRead("1"));
    }
}