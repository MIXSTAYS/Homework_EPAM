package t03.main.model;

import t03.main.model.Stationery;

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
}
