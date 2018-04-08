package t01.main.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrazyLogger {

    private Date data;
    private StringBuilder stringBuilder = new StringBuilder();
    private final DateFormat dateFormat = new SimpleDateFormat("dd-mm-YYYY : HH-mm-ss");

    public void addMessage(String message) {
        data = new Date();
        stringBuilder.append(dateFormat.format(data) + " - " + message + "; ;");
    }

    public List<String> getMessage(String mes) {
        String[] messages = stringBuilder.toString().split(" ;");
        List<String> foundedMessage = new ArrayList<>();
        for (String elem : messages) {
            if (elem.contains(mes)) {
                foundedMessage.add(elem);
            }
        }
        return foundedMessage;
    }

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }
}
