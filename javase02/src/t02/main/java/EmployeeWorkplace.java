package t02.main.java;

import java.util.LinkedList;
import java.util.List;

public class EmployeeWorkplace {
    private String employeeName;
    private List<Stationery> kit;
    public EmployeeWorkplace(String employeeName){
        this.employeeName = employeeName;
        kit = new LinkedList<>();
    }
    public EmployeeWorkplace (String employeeName, List<Stationery> kit){
        this.employeeName = employeeName;
        this.kit = new LinkedList<>(kit);
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Stationery> getKit() {
        return kit;
    }

    public void addToKit(Stationery stationery) {
        this.kit.add(stationery);
    }

    public int stationeryPriceCounter(){
        int priceCounter = 0;
        for(Stationery stationery : kit){
            priceCounter+= stationery.getPrice();
        }
        return priceCounter;
    }
}
