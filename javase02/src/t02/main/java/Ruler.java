package t02.main.java;

public class Ruler extends Stationery {
    private int length = 10;
    public Ruler (){
    }
    public Ruler(String brand){
        super(brand);
    }
    public Ruler(int price){
        super(price);
    }
    public Ruler(String brand, int price){
        super(brand, price);
    }
    public Ruler (int price, int length){
        super(price);
        this.length = length;
    }
    public Ruler(String brand, int price, int length){
        super(brand, price);
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Ruler ruler = (Ruler) obj;
        if (length != ruler.length) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (getPrice() * 32);
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + (getLength() * 32);
        return result;
    }
}
