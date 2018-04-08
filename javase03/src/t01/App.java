package t01;

import t01.main.java.CrazyLogger;

public class App {
    public static void main(String[] args) throws InterruptedException {
        CrazyLogger crazyLogger = new CrazyLogger();
        crazyLogger.addMessage("Mama mila ramu");
        Thread.sleep(1000);
        crazyLogger.addMessage("Ded zakinul nevod");
        Thread.sleep(1000);
        crazyLogger.addMessage("Shel silniy dozhd'");
        System.out.println(crazyLogger.getMessage("mila"));

    }
}
