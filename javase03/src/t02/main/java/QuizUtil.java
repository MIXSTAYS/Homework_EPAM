package t02.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class QuizUtil {

    public static List<String> convertResourceBundleToList(ResourceBundle resourceBundle) {
        List<String> list = new ArrayList<>();
        resourceBundle.keySet().forEach(key ->
                list.add(resourceBundle.getString(key)));
        return list;
    }
}
