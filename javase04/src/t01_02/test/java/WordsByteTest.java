package t01_02.test.java;

import org.junit.Test;
import t01_02.main.java.Words_Byte;
import t01_02.main.java.Words_Byte;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class WordsByteTest {


    @Test
    public void readFile() {
        StringBuilder requiredStringBuilder = Words_Byte
                .readFile(
                        "C:\\Users\\Михаил\\IdeaProjects\\EPAMLessons\\javase04\\src\\t01\\test\\resources\\test_words.txt");
        StringBuilder expectedStringBuilder = new StringBuilder("horse\r\n" + "new\r\n" + "public\r\n" + "man");
        assertEquals(expectedStringBuilder.toString(), requiredStringBuilder.toString());
    }

    @Test
    public void isJavaWord() {
        Words_Byte.keyWords = new ArrayList<String>() {{
            add("new");
        }};
        assertTrue(Words_Byte.isJavaWord("new"));
        assertFalse(Words_Byte.isJavaWord("super"));
    }

    @Test
    public void analyseWords() {
        Words_Byte.keyWords = new ArrayList<String>() {{
            add("private");
            add("static");
            add("void");
        }};
        StringBuilder strTest = new StringBuilder("private static void main");
        HashMap<String, Integer> mapTest = Words_Byte.analyseWords(strTest);
        HashMap<String, Integer> expectedMap = new HashMap<String, Integer>() {{
            put("private", 1);
            put("static", 1);
            put("void", 1);
        }};
        assertEquals(mapTest, expectedMap);
    }
}