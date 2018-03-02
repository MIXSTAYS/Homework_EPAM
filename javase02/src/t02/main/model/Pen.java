package t02.main.model;

import static t02.main.model.Color.*;

public class Pen extends Stationery{
    private Color inkColor = BLUE;
    public Pen (){
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
        if (!super.equals(obj)) return false;
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Pen pen = (Pen) obj;
        if (inkColor != pen.inkColor) return false;
        if (inkColor != null) return true;
        if (!inkColor.equals(pen.getInkColor())) return false;
        return true;
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
