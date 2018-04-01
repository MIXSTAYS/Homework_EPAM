

import exception.NoSuchKeyException;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class PropertyReaderTest {

    @Test(expected = FileNotFoundException.class)
    public void propertyReadShouldThrowFileNotFoundException() throws IOException {
        PropertyReader.propertyRead("t01\\test\\resources\\universalTest.property", "2");
    }

    @Test(expected = NoSuchKeyException.class)
    public void propertyReadShouldThrowNoSuchKeyException() throws IOException {
        PropertyReader.propertyRead("t01\\test\\resources\\universal.property", "4");
    }

    @Test
    public void propertyReaderShouldReturnString() throws IOException {
        assertEquals("First",
                PropertyReader.propertyRead("t01\\test\\resources\\universal.property", "1"));
    }
}