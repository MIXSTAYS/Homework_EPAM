package t01.main.java;


import static t01.main.java.PenColor.BLACK;
import static t01.main.java.PenColor.BLUE;

public class Main {
    public static void main(String[] args) {
        Pen black = new Pen("Parker");
        black.setInkColorAndPenSize(BLACK, 0.815);
        Pen blue = new Pen("Parker");
        blue.setInkColorAndPenSize(BLUE, 0.8);
        System.out.println(black.equals(blue));
        System.out.println(black.toString());
    }
}
