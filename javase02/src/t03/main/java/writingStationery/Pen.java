package t03.main.java.writingStationery;

import t03.main.java.Stationery;

public class Pen extends Stationery implements WritingStationery {
    private Color inkColor;

    public Pen(int price, Color inkColor) {
        super(price);
        this.inkColor = inkColor;
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
    public String write(){
        return "Writes in a small handwriting";
    }

    @Override
    public String toString() {
        return String.format("Brand \"%s\". Color of the ink - %s. Price: %d", getBrand(), getInkColor(), getPrice());
    }
}
