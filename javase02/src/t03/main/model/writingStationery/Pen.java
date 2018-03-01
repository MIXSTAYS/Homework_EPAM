package t03.main.model.writingStationery;

import t03.main.model.Stationery;

import static t03.main.model.writingStationery.Color.*;

public class Pen extends Stationery implements WritingStationery {
    private Color inkColor = BLUE;

    public Pen() {
    }

    public Pen(String brand) {
        super(brand);
    }

    public Pen(int price) {
        super(price);
    }

    public Pen(String brand, int price) {
        super(brand, price);
    }

    public Pen(int price, Color inkColor) {
        super(price);
        this.inkColor = inkColor;
    }

    public Pen(String brand, Color inkColor) {
        super(brand);
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
    public void write(){
        System.out.println("Writes in a small handwriting");
    }
}
