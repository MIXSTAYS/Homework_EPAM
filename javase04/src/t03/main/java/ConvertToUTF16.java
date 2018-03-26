package t03.main.java;

import java.io.*;

public class ConvertToUTF16 {

    public static void convert(String utf8, String utf16) {
        int textToConvert;
        try (InputStreamReader inFile = new InputStreamReader(new FileInputStream(utf8));
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(utf16), "UTF16")) {
            while ((textToConvert = inFile.read()) != -1) {
                    out.write(textToConvert);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
