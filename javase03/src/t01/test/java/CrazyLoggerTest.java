package t01.test.java;

import org.junit.Before;
import org.junit.Test;
import t01.main.java.CrazyLogger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class CrazyLoggerTest {
    private CrazyLogger crazyLogger = new CrazyLogger();
    private Date data;
    private String message;
    private StringBuilder stringBuilder = new StringBuilder();

    @Before
    public void setUp() {
        message = "Test message (first)";
        crazyLogger.addMessage(message);
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-YYYY : HH-mm-ss");
        data = new Date();
        stringBuilder.append(dateFormat.format(data) + ". " + message + ";");
    }

    @Test
    public void addMessageShouldAppendMessageToTheCrazyLogger() {
        assertEquals(44, crazyLogger.getStringBuilder().length());
        crazyLogger.addMessage("Second msg.");
        assertEquals(79, crazyLogger.getStringBuilder().length());
    }
}
