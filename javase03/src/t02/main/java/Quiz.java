package t02.main.java;

import java.util.*;

public class Quiz {
    private static int questionCounter;

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
        List<String> questionsList = QuizUtil.convertResourceBundleToList(questions);
        for (questionCounter = 0; questionCounter <= questionsList.size() - 1; questionCounter++) {
            System.out.println((questionCounter + 1) + ") " + questionsList.get(questionCounter));
        }
    }

    public static void main(String[] args) {
        System.out.println("Choose language: EN - 1/RU - 2");
        Scanner scanner = new Scanner(System.in);
        String inputLanguage = scanner.next();

        Locale locale = getLanguage(inputLanguage);

        showQuestions(locale);

        System.out.println(ResourceBundle.getBundle("UIMessages", locale).getString("choose_question")
                + " (" + 1 + " - " + (questionCounter) + "):");

        ResourceBundle answers = ResourceBundle.getBundle("Answers", locale);
        List<String> answersList = QuizUtil.convertResourceBundleToList(answers);

        Scanner numberOfAnswer = new Scanner(System.in);
        int inputNumber = numberOfAnswer.nextInt() - 1;
        if (inputNumber < answersList.size() & inputNumber > 0) {
            System.out.println(answersList.get(inputNumber));
        } else {
            System.out.println(ResourceBundle.getBundle("UIMessages", locale).getString("right_question"));
        }
    }
}
