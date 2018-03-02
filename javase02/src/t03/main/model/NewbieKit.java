package t03.main.model;

import t03.main.model.writingStationery.Pen;

import java.util.ArrayList;
import java.util.List;

public class NewbieKit {
    private String newbieName;
    private List<Stationery> kit;
    public NewbieKit(String newbieName){
        this.newbieName = newbieName;
        kit = new ArrayList<>();
    }
    public NewbieKit(String newbieName, ArrayList<Stationery> kit) {
        this.newbieName = newbieName;
        this.kit = new ArrayList<>(kit.size());
    }

    public String getNewbieName() {
        return newbieName;
    }

    public void setNewbieName(String newbieName) {
        this.newbieName = newbieName;
    }

    public List<Stationery> getKit() {
        return kit;
    }

    public void addToKit(Stationery stationery) {
        this.kit.add(stationery);
    }
}
