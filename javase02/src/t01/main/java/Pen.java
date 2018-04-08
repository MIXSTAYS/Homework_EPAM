package t01.main.java;

import static t01.main.java.PenColor.BLUE;

public class Pen {
    private String brand;
    private PenColor inkColor;
    private double penSize;

    public Pen(String brand) {
        this(brand, BLUE, 0.8);
    }

    public Pen(String brand, PenColor inkColor, double penSize) {
        this.brand = brand;
        this.inkColor = inkColor;
        this.penSize = penSize;
    }

    public void setInkColorAndPenSize(PenColor inkColor, double penSize) {

        this.penSize = penSize;
        this.inkColor = inkColor;
    }


    public PenColor getInkColor() {
        return inkColor;
    }

    public double getPenSize() {
        return penSize;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pen pen = (Pen) obj;
        return getPenSize() == pen.getPenSize() &&
                (brand == pen.brand ||
                        (brand != null && brand.equals(pen.getBrand()))) &&
                (inkColor == pen.inkColor ||
                        (inkColor != null && inkColor.equals(pen.getInkColor())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long longPenSize = Double.doubleToLongBits(penSize);
        result = prime * result + (int) (longPenSize - (longPenSize >>> 32));
        result = prime *result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((inkColor == null) ? 0 : inkColor.hashCode());
        return result;
    }

    @Override
    public String toString() {
        String formatted = String.format("Brand %s. Pen size: %.1f. Color of the ink - %s", brand, penSize, inkColor);
        return formatted;
    }
}
