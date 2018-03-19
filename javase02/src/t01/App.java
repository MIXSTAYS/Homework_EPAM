package t01;

import t01.main.java.Pen;

import static t01.main.java.PenColor.*;

public class App {
    public static void main(String[] args) {
        Pen black = new Pen("Pilot", GREEN, 0.461);
        Pen blue = new Pen("Parker");
        blue.setInkColorAndPenSize(BLUE, 0.8);
        System.out.println(black.toString());
        System.out.println(blue.toString());
    }
}
