package t02.main.model;

public class Stationery {
    private String brand;
    private int price;

    public Stationery(){}
    public Stationery(String brand){
        this.brand = brand;
    }
    public Stationery(int price){
        this.price = price;
        brand = "Unknown";
    }
    public Stationery(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Stationery stationery = (Stationery) obj;
        return getPrice() == stationery.getPrice() &&
                (brand == stationery.brand ||
                        (brand != null && brand.equals(stationery.getBrand())));
    }
}
