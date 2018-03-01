package t03.main.model.writingStationery;

import t03.main.model.Stationery;

import static t03.main.model.writingStationery.Color.*;
import static t03.main.model.writingStationery.TypeOfMarker.*;

public class Marker extends Stationery implements WritingStationery {
    private Color inkColor = YELLOW;
    private TypeOfMarker typeOfMarker = WATER;

    public Marker() {
    }

    public Marker(String brand) {
        super(brand);
    }

    public Marker(int price) {
        super(price);
    }

    public Marker(String brand, int price) {
        super(brand, price);
    }

    public Marker(int price, Color inkColor) {
        super(price);
        this.inkColor = inkColor;
    }

    public Marker(String brand, int price, Color inkColor) {
        super(brand, price);
        this.inkColor = inkColor;
    }

    public Marker(TypeOfMarker typeOfMarker) {
        this.typeOfMarker = typeOfMarker;
    }

    public Marker(Color inkColor, TypeOfMarker typeOfMarker) {
        this.inkColor = inkColor;
        this.typeOfMarker = typeOfMarker;
    }

    public Marker(String brand, Color inkColor, TypeOfMarker typeOfMarker) {
        super(brand);
        this.inkColor = inkColor;
        this.typeOfMarker = typeOfMarker;
    }

    public Marker(int price, Color inkColor, TypeOfMarker typeOfMarker) {
        super(price);
        this.inkColor = inkColor;
        this.typeOfMarker = typeOfMarker;
    }

    public Marker(String brand, int price, TypeOfMarker typeOfMarker) {
        super(brand, price);
        this.typeOfMarker = typeOfMarker;
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
}
