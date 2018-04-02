package t01.main.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrazyLogger {

    private Date data = new Date();
    private StringBuilder stringBuilder = new StringBuilder();
    private DateFormat dateFormat = new SimpleDateFormat("dd-mm-YYYY : HH-mm-ss");
    private int notesCounter;

    public void addMessage(String message) {
        stringBuilder.append(dateFormat.format(data) + ". " + message + "\n");
    }

    public void getMessage(String mes) {
        String[] messages = stringBuilder.toString().split("\n");
        for (String elem : messages) {
            if (elem.contains(mes)) {
                notesCounter++;
                System.out.println(elem);
            }
        }
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public int getNotesCounter() {
        return notesCounter;
    }
}
