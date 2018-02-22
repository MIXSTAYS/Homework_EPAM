package t01.main.java;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Pen black = new Pen("Parker");
        black.setInkColorAndPenSize("Black", 0.815);
        Pen blue = new Pen("Parker");
        blue.setInkColorAndPenSize("Blue", 0.8);
        System.out.println(black.equals(blue));
        System.out.println(black.toString());
    }
}
