package t01.main.java;

import java.math.BigDecimal;

import static t01.main.java.PenColor.*;

public class Main {
    public static void main(String[] args) {
        Pen black = new Pen("Pilot", GREEN, 0.461);
//        black.setInkColorAndPenSize(BLACK, 0.8);
        Pen blue = new Pen("Parker");
        blue.setInkColorAndPenSize(BLUE, 0.8);
//        System.out.println(black.equals(blue));
        System.out.println(black.toString());
        System.out.println(blue.toString());
    }
}
