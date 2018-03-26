package t01.main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Words {

    public static ArrayList<String> keyWords = javaKeyWords("javase04/src/t01/main/resources/java_words.txt");

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

    public static ArrayList<String> javaKeyWords(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            ArrayList<String> list = new ArrayList<>();
            int c;
            StringBuilder stringBuilder = new StringBuilder();
            while ((c = fileInputStream.read()) != -1) {
                stringBuilder.append((char) c);
            }
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

    public static void writeInFile(HashMap<String, Integer> inputFile) {
        try (FileOutputStream fileOutputStream
                     = new FileOutputStream("javase04/src/t01/main/resources/output_words.txt")) {
            inputFile.forEach((k, v) -> {
                try {
                    byte[] byteArray = (k + ": " + v).getBytes();
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
                readFile("javase04/src/t01/main/resources/words.txt"));
        map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
        writeInFile(map);

    }
}
