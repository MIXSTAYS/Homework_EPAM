package t01.main.model;

import static t01.main.model.PenColor.*;

public class Main {
    public static void main(String[] args) {
        Pen black = new Pen("Pilot", GREEN, 0.461);
        Pen blue = new Pen("Parker");
        blue.setInkColorAndPenSize(BLUE, 0.8);
        System.out.println(black.toString());
        System.out.println(blue.toString());
    }
}
