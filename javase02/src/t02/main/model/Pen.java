package t02.main.model;

public class Pen extends Stationery{
    private Color inkColor;
    public Pen(String brand) {
        super(brand);
    }
    public Pen(int price) {
        super(price);
    }
    public Pen(String brand, int price) {
        super(brand, price);
    }
    public Pen(int price, Color inkColor){
        super(price);
        this.inkColor = inkColor;
    }
    public Pen(String brand, int price, Color inkColor){
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
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pen pen = (Pen) obj;
        if(inkColor == pen.inkColor ||
                        (inkColor != null && inkColor.equals(pen.getInkColor()))); {
            return true;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (getPrice() * 32);
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((inkColor == null) ? 0 : inkColor.hashCode());
        return result;
    }
}
