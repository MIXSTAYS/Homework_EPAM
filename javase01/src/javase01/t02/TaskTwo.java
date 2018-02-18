package javase01.t02;
import javase01.t06.Notebook;
import javase01.t06.RecordInNotebook;

import java.io.*;
import static java.lang.Math.*;

public class TaskTwo {
    public static void main(String[] args) throws Exception {
        double a = 1.0;
        int i = 1;
        System.out.println("Введите число e:");
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        Double e = Double.parseDouble(reader.readLine());
        do {
            a = 1 / pow(i + 1, 2);
            System.out.println("a[" + i + "] = " + a);
            i++;
        } while (a >= e);
        System.out.println(i - 1 + " - номер наименьшего элемента.");
    }
}
