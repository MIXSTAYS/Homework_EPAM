package t03.main.java.writingStationery;

import t03.main.java.Stationery;

public class Marker extends Stationery implements WritingStationery {
    private Color inkColor;
    private TypeOfMarker typeOfMarker;

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
    public String write(){
        return "Writes in a large handwriting";
    }

    @Override
    public String toString() {
        return String.format("Brand \"%s\". Marker type: %s. Color of the ink - %s. It costs %d",
                getBrand(), getTypeOfMarker(), getInkColor(), getPrice());
    }
}
