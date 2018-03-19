package t01.main.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrazyLogger {

    private Date data;
    private StringBuilder stringBuilder = new StringBuilder();

    public void addMessage(String message) {
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-YYYY : HH-mm-ss");
        data = new Date();
        stringBuilder.append(dateFormat.format(data) + ". " + message + ";");
    }

    public void getMessage(String mes) {
        String[] messages = stringBuilder.toString().split(";");
        for (String elem : messages) {
            if (elem.contains(mes)) {
                System.out.println(elem);
            }
        }
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }
}
