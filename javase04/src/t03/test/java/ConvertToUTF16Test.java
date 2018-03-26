package t03.test.java;

import org.junit.Test;
import t03.main.java.ConvertToUTF16;

import java.io.*;

import static org.junit.Assert.*;

public class ConvertToUTF16Test {

    @Test
    public void convert() {
        ConvertToUTF16.convert("C:\\Users\\Михаил\\IdeaProjects\\EPAMLessons" +
                                "\\javase04\\src\\t03\\test\\test_resources\\utf8_test.txt"
                , "C:\\Users\\Михаил\\IdeaProjects\\EPAMLessons" +
                                "\\javase04\\src\\t03\\test\\test_resources\\utf16_test.txt");
        String testedInput = "C:\\Users\\Михаил\\IdeaProjects\\EPAMLessons" +
                "\\javase04\\src\\t03\\test\\test_resources\\utf16_test.txt";
        InputStreamReader inFile = null;
        try {
            inFile = new InputStreamReader(new FileInputStream(testedInput), "UTF-16");
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        assertEquals("UTF-16", inFile.getEncoding());
    }
}