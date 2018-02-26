package t02.main.model;

import java.util.LinkedList;

public class EmployeeWorkplace {
    private String employeeName;
    private LinkedList<Stationery> kit;
    public EmployeeWorkplace(String employeeName){
        this.employeeName = employeeName;
        kit = new LinkedList<>();
    }
    public EmployeeWorkplace (String employeeName, LinkedList<Stationery> kit){
        this.employeeName = employeeName;
        this.kit = new LinkedList<>(kit);
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LinkedList<Stationery> getKit() {
        return kit;
    }

    public void addToKit(Stationery kit) {
        this.kit.add(kit);
    }

    public int stationeryPriceCounter(){
        int priceCounter = 0;
        for(Stationery kit : kit){
            priceCounter+= kit.getPrice();
        }
        return priceCounter;
    }
}
