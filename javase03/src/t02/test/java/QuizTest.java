package t02.test.java;

import org.junit.Before;
import org.junit.Test;
import t02.main.java.Quiz;

import java.util.Locale;

import static org.junit.Assert.*;

public class QuizTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getLanguageShouldReturnLocale() {
        assertEquals(Locale.US, Quiz.getLanguage("1"));
        assertEquals(new Locale("ru", "RUS"), Quiz.getLanguage("2"));
    }

    @Test(expected = RuntimeException.class)
    public void getLanguageShouldReturnException() {
        Quiz.getLanguage("sdf");
    }
}