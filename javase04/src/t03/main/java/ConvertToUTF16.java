package t03.main.java;

import java.io.*;

public class ConvertToUTF16 {
    public static void convert(String utf8, String utf16) {
        String textToConvert;
        try (BufferedReader inFile = new BufferedReader(new FileReader(utf8));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(utf16), "UTF16"))) {
            while ((textToConvert = inFile.readLine()) != null) {
                    out.write(textToConvert);
                    out.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
