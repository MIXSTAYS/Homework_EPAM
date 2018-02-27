package t02.main.model;

public class Pencil extends Stationery{
    public Pencil(){
    }
    public Pencil(String brand){
        super(brand);
    }
    public Pencil(int price){
        super(price);
    }
    public Pencil(String brand, int price){
        super(brand, price);
    }
}
