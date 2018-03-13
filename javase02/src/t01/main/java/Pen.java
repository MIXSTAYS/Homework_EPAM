package t01.main.java;

public class Pen {
    private String brand;
    private String inkColor = "not defined";
    private double penSize;

    public Pen(String brand) {
        this.brand = brand;
    }

    public void setInkColorAndPenSize(String inkColor, double penSize){
        try{
            if (String.valueOf(penSize).split("\\.")[1].length() > 1) {
                throw new IllegalArgumentException();
            } else {
                this.penSize = penSize;
                this.inkColor = inkColor;
            }
        } catch (IllegalArgumentException e){
            System.out.println("Ink color and pen size haven't been set");
        }
    }

    public String getInkColor() {
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
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        long longPenSize = Double.doubleToLongBits(penSize);
        result = prime * result + (int)(longPenSize - (longPenSize >>> 32));
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((inkColor == null) ? 0 : inkColor.hashCode());
        return result;
    }

    @Override
    public String toString(){
        return "Brand " + brand +
                ". Pen size: " + penSize +
                ". Color of the ink - " + inkColor;
    }
}
