package t03.main.java;

public class EyeletPuncher extends Stationery {

    public EyeletPuncher(String brand) {
        super(brand);
    }

    public EyeletPuncher(int price){
        super(price);
    }

    public EyeletPuncher(String brand, int price){
        super(brand, price);
    }

    @Override
    public String toString() {
        return String.format("Brand \"%s\". This eyelet-puncher cost %d", getBrand(), getPrice());
    }
}
