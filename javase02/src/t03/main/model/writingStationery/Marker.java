package t03.main.model.writingStationery;

import t03.main.model.Stationery;

import static t03.main.model.writingStationery.Color.*;
import static t03.main.model.writingStationery.TypeOfMarker.*;

public class Marker extends Stationery implements WritingStationery {
    private Color inkColor;
    private TypeOfMarker typeOfMarker;

    public Marker(Color inkColor, TypeOfMarker typeOfMarker) {
        this(0, inkColor, typeOfMarker);
    }

    public Marker(String brand, Color inkColor, TypeOfMarker typeOfMarker) {
        this(brand, 0, inkColor, typeOfMarker);
    }

    public Marker(int price, Color inkColor, TypeOfMarker typeOfMarker) {
        this("Unknown", price, inkColor, typeOfMarker);
    }

    public Marker(String brand, int price, Color inkColor, TypeOfMarker typeOfMarker) {
        super(brand, price);
        this.inkColor = inkColor;
        this.typeOfMarker = typeOfMarker;
    }

    public Color getInkColor() {
        return inkColor;
    }

    public void setInkColor(Color inkColor) {
        this.inkColor = inkColor;
    }

    public TypeOfMarker getTypeOfMarker() {
        return typeOfMarker;
    }

    public void setTypeOfMarker(TypeOfMarker typeOfMarker) {
        this.typeOfMarker = typeOfMarker;
    }

    @Override
    public void write(){
        System.out.println("Writes in a large handwriting");
    }

    @Override
    public String toString() {
        String formatted = String.format("Brand \"%s\". Marker type: %s. Color of the ink - %s", getBrand(), getTypeOfMarker(), getInkColor());
        return formatted;
    }
}
