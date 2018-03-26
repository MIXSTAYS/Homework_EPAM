package t01.test.java;

import org.junit.Test;
import t01.main.java.Words;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class WordsTest {


    @Test
    public void readFile() {
        StringBuilder requiredStringBuilder = Words
                .readFile(
                        "C:\\Users\\Михаил\\IdeaProjects\\EPAMLessons\\javase04\\src\\t01\\test\\resources\\test_words.txt");
        StringBuilder expectedStringBuilder = new StringBuilder("horse\r\n" + "new\r\n" + "public\r\n" + "man");
        assertEquals(expectedStringBuilder.toString(), requiredStringBuilder.toString());
    }

    @Test
    public void isJavaWord() {
        Words.keyWords = new ArrayList<String>() {{
            add("new");
        }};
        assertTrue(Words.isJavaWord("new"));
        assertFalse(Words.isJavaWord("super"));
    }

    @Test
    public void analyseWords() {
        Words.keyWords = new ArrayList<String>() {{
            add("private");
            add("static");
            add("void");
        }};
        StringBuilder strTest = new StringBuilder("private static void main");
        HashMap<String, Integer> mapTest = Words.analyseWords(strTest);
        HashMap<String, Integer> expectedMap = new HashMap<String, Integer>() {{
            put("private", 1);
            put("static", 1);
            put("void", 1);
        }};
        assertEquals(mapTest, expectedMap);
    }
}