package t04;

import t03.main.java.NewbieKit;
import t03.main.java.Paper;
import t03.main.java.PaperFormat;
import t03.main.java.Stationery;
import t03.main.java.writingStationery.*;
import t04.main.java.StationeryComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {
        Comparator<Stationery> comparator = new StationeryComparator();
        Comparator<Stationery> comparatorByBrand = new StationeryComparator.compareByBrand();
        Comparator<Stationery> comparatorByPrice = new StationeryComparator.compareByPrice();

        NewbieKit secondGuy = new NewbieKit("Pavel", new ArrayList<>());
        Pen pen = new Pen("Pilot", 30, Color.BLUE);
        Pen pen1 = new Pen("Pilot", 27, Color.RED);
        Pen pen2 = new Pen("Parker", 30, Color.BLACK);
        Pencil pencil = new Pencil("Koh-I-Noor", 20);
        Marker marker = new Marker("WaterShape", 40, Color.ORANGE, TypeOfMarker.WATER);
        Paper paper = new Paper(55, 150, PaperFormat.A4);

        secondGuy.addToKit(pen);
        secondGuy.addToKit(pen1);
        secondGuy.addToKit(pen2);
        secondGuy.addToKit(pencil);
        secondGuy.addToKit(marker);
        secondGuy.addToKit(paper);

        Collections.sort(secondGuy.getKit(), comparator);
        System.out.println("Sorted by price and brand:");
        for (Stationery stationery : secondGuy.getKit()) {
            System.out.println(stationery);
        }

        Collections.sort(secondGuy.getKit(), comparatorByBrand);
        System.out.println("\nSorted by brand:");
        for (Stationery stationery : secondGuy.getKit()) {
            System.out.println(stationery);
        }

        Collections.sort(secondGuy.getKit(), comparatorByPrice);
        System.out.println("\nSorted by price:");
        for (Stationery stationery : secondGuy.getKit()) {
            System.out.println(stationery);
        }
    }
}
