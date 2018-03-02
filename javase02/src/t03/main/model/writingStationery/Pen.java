package t03.main.model.writingStationery;

import t03.main.model.Stationery;

import static t03.main.model.writingStationery.Color.*;

public class Pen extends Stationery implements WritingStationery {
    private Color inkColor;

    public Pen(Color inkColor) {
        this("Unknown", 0, inkColor);
    }
    public Pen(int price, Color inkColor) {
        this("Unknown", price, inkColor);
    }

    public Pen(String brand, Color inkColor) {
        this(brand, 0, inkColor);
    }

    public Pen(String brand, int price, Color inkColor) {
        super(brand, price);
        this.inkColor = inkColor;
    }

    public void setInkColor(Color inkColor) {
        this.inkColor = inkColor;
    }

    public Color getInkColor() {
        return inkColor;
    }

    @Override
    public void write(){
        System.out.println("Writes in a small handwriting");
    }

    @Override
    public String toString() {
        String formatted = String.format("Brand \"%s\". Color of the ink - %s", getBrand(), getInkColor());
        return formatted;
    }
}
