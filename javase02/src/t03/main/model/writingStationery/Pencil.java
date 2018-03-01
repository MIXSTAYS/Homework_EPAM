package t03.main.model.writingStationery;

import t03.main.model.Stationery;

public class Pencil extends Stationery implements WritingStationery {
    public Pencil() {
    }

    public Pencil(String brand) {
        super(brand);
    }

    public Pencil(int price) {
        super(price);
    }

    public Pencil(String brand, int price) {
        super(brand, price);
    }

    @Override
    public void write(){
        System.out.println("You can clean it by eraser");
    }
}
