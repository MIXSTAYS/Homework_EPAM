package t01_02.test.java;

import org.junit.Test;
import t01_02.main.java.WordsByte;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class WordsTest {


    @Test
    public void readFile() {
        StringBuilder requiredStringBuilder = WordsByte
                .readFile(
                        "src\\t01_02\\test\\resources\\test_words.txt");
        StringBuilder expectedStringBuilder = new StringBuilder("horse\r\n" + "new\r\n" + "public\r\n" + "man");
        assertEquals(expectedStringBuilder.toString(), requiredStringBuilder.toString());
    }

    @Test
    public void isJavaWord() {
        WordsByte.keyWords = new ArrayList<String>() {{
            add("new");
        }};
        assertTrue(WordsByte.isJavaWord("new"));
        assertFalse(WordsByte.isJavaWord("super"));
    }

    @Test
    public void analyseWords() {
        WordsByte.keyWords = new ArrayList<String>() {{
            add("private");
            add("static");
            add("void");
        }};
        StringBuilder strTest = new StringBuilder("private static void main");
        HashMap<String, Integer> mapTest = WordsByte.analyseWords(strTest);
        HashMap<String, Integer> expectedMap = new HashMap<String, Integer>() {{
            put("private", 1);
            put("static", 1);
            put("void", 1);
        }};
        assertEquals(mapTest, expectedMap);
    }
}