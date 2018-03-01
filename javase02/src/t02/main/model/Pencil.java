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
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pencil pencil = (Pencil) obj;
        if(getPrice() == pencil.getPrice() &&
                (getBrand() == pencil.getBrand() ||
                        (getBrand() != null && getBrand().equals(pencil.getBrand())))); {
            return true;
        }
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
