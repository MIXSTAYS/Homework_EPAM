package t01_02.main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordsSymbol {

    private static List<String> keyWords = javaKeyWords("javase04/src/t01_02/main/resources/java_words.txt");

    public static StringBuilder readFile(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line + " ");
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

    public static ArrayList<String> javaKeyWords(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            ArrayList<String> list = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
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

    public static void writeInFile(HashMap<String, Integer> inputFile) {
        try (BufferedWriter bufferedWriter
                     = new BufferedWriter(new FileWriter("javase04/src/t01_02/main/resources/output_words.txt"))) {
            for (String b : inputFile.keySet()) {
                bufferedWriter.write(b + " : " + inputFile.get(b));
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HashMap map = analyseWords(
                readFile("javase04/src/t01_02/main/resources/words.txt"));
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
        writeInFile(map);
    }
}
