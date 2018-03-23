package t02.main.java;

import java.util.*;

public class Quiz {
    private static ArrayList<String> convertResourceBundleToList(ResourceBundle resourceBundle) {
        ArrayList<String> list = new ArrayList<>();

        resourceBundle.keySet().forEach(key -> {
            list.add(resourceBundle.getString(key));
        });
        return list;
    }

    public static Locale getLanguage(String inputLanguage) {
        switch (inputLanguage) {
            case "1":
                return Locale.US;
            case "2":
                return new Locale("ru", "RUS");
            default:
                throw new RuntimeException();
        }
    }

    public static void showQuestions(Locale locale) {
        ResourceBundle questions = ResourceBundle.getBundle("Questions", locale);
        ArrayList<String> questionsList = convertResourceBundleToList(questions);
        int i = 1;
        for (String question : questionsList) {
            System.out.println(i++ + ") " + question);
        }
    }

    public static void main(String[] args) {
        System.out.println("Choose language: EN - 1/RU - 2");
        Scanner scanner = new Scanner(System.in);
        String inputLanguage = scanner.next();

        Locale locale = getLanguage(inputLanguage);

        showQuestions(locale);

        System.out.println(ResourceBundle.getBundle("UIMessages", locale).getString("choose_question"));

        ResourceBundle answers = ResourceBundle.getBundle("Answers", locale);
        ArrayList<String> answersList = convertResourceBundleToList(answers);

        Scanner numberOfAnswer = new Scanner(System.in);
        int inputNumber = numberOfAnswer.nextInt() - 1;
        System.out.println(answersList.get(inputNumber));
    }
}
