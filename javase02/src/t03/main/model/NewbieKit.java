package t03.main.model;

import java.util.ArrayList;
import java.util.List;

public class NewbieKit {

    private String newbieName;
    private List<Stationery> kit;

    public NewbieKit(String newbieName){
        this(newbieName, new ArrayList<>());
    }

    public NewbieKit(String newbieName, ArrayList<Stationery> kit) {
        this.newbieName = newbieName;
        this.kit = kit;
    }

    public String getNewbieName() {
        return newbieName;
    }

    public void setNewbieName(String newbieName) {
        this.newbieName = newbieName;
    }

    public void addToKit(Stationery stationery) {
        this.kit.add(stationery);
    }

    public void removeFromKit(Stationery stationery){
        this.kit.remove(stationery);
    }

    public List<Stationery> getKit() {
        return kit;
    }

    public int getSize() {
        return kit.size();
    }
}
