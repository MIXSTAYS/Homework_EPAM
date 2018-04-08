package t01_02.main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordsByte {

    private static List<String> keyWords = javaKeyWords("javase04/src/t01_02/main/resources/java_words.txt");

    public static StringBuilder readFile(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int c;
            StringBuilder stringBuilder = new StringBuilder();
            while ((c = fileInputStream.read()) != -1) {
                stringBuilder.append((char) c);
            }
            return stringBuilder;
        } catch (FileNotFoundException e) {
            System.out.println(String.format("File %s doesn't exist ", fileName));
            System.exit(1);
            return null;
        } catch (IOException e) {
            System.out.println("IO error");
            System.exit(1);
            return null;
        }
    }

    private static List<String> javaKeyWords(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            List<String> list = new ArrayList<>();
            StringBuilder stringBuilder = readFile(filePath);
            String[] split = stringBuilder.toString().split("\r\n");
            for (String word : split) {
                list.add(word);
            }
            return list;
        } catch (FileNotFoundException e) {
            System.out.println(String.format("File %s doesn't exist ", filePath));
            return null;
        } catch (IOException e) {
            System.out.println("IO error");
            return null;
        }
    }

    public static boolean isJavaWord(String word) {
        return keyWords.contains(word);
    }

    public static HashMap<String, Integer> analyseWords(StringBuilder stringBuilder) {
        String[] split = stringBuilder.toString().split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        int defaultWordsCounter = 1;
        for (String word : split) {
            if (isJavaWord(word)) {
                if (map.get(word) != null) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, defaultWordsCounter);
                }
            }
        }
        return map;
    }

    public static void writeInFile(HashMap<String, Integer> inputFile, String filePath) {
        try (FileOutputStream fileOutputStream
                     = new FileOutputStream(filePath)) {
            inputFile.forEach((key, value) -> {
                try {
                    byte[] byteArray = (key + ": " + value).getBytes();
                    for (byte b : byteArray) {
                        fileOutputStream.write(b);
                    }
                    fileOutputStream.write('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HashMap map = analyseWords(
                readFile("javase04/src/t01_02/main/resources/words.txt"));
        map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
        writeInFile(map,"javase04/src/t01_02/main/resources/output_words.txt");
    }
}
