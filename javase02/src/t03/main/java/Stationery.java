package t03.main.java;

public class Stationery {

    private String brand = "Unknown";
    private int price;

    public Stationery() {
    }

    public Stationery(String brand) {
        this.brand = brand;
    }

    public Stationery(int price) {
        this.price = price;
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
