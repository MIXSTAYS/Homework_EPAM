package t02.main.java;

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
    @Override
    public boolean equals(Object obj) {
        return (super.equals(obj));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (getPrice() * 32);
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        return result;
    }
}
