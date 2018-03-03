package t03.main.model;

public class Stationery {

    private String brand;
    private int price;

    public Stationery() {
        this("Unknown", 0);
    }

    public Stationery(String brand) {
        this(brand, 0);
    }

    public Stationery(int price) {
        this("Unknown", price);
    }

    public Stationery(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
