package t03.main.model.writingStationery;

import t03.main.model.Stationery;

public class Pencil extends Stationery implements WritingStationery {

    public Pencil(String brand, int price) {
        super(brand, price);
    }

    @Override
    public String write(){
        return "You can clean it by eraser";
    }

    @Override
    public String toString() {
        return String.format("Brand \"%s\". Pencil price is: %d", getBrand(), getPrice());
    }
}
