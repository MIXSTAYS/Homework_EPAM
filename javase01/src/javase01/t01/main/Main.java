package javase01.t01.main;

import javase01.t01.logic.Logic;

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println(logic.method());
        String s = "Это строка";
        Class t = s.getClass();
        System.out.println(t);
    }
}

