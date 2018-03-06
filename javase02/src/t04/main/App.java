package t04.main;

import t03.main.model.NewbieKit;
import t03.main.model.Paper;
import t03.main.model.PaperFormat;
import t03.main.model.Stationery;
import t03.main.model.writingStationery.*;
import t04.main.model.StationeryComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {
        Comparator<Stationery> comparator = new StationeryComparator();
        Comparator<Stationery> comparatorByBrand = new StationeryComparator.compareByBrand();
        Comparator<Stationery> comparatorByPriceAndBrand = new StationeryComparator.compareByPriceAndBrand();

        NewbieKit secondGuy = new NewbieKit("Pavel", new ArrayList<>());
        Pen pen = new Pen("Pilot", 30, Color.BLUE);
        Pen pen1 = new Pen("Pilot", 27, Color.RED);
        Pen pen2 = new Pen("Parker", 30, Color.BLACK);
        Pencil pencil = new Pencil("Koh-I-Noor", 20);
        Marker marker = new Marker("WaterShape", 60, Color.ORANGE, TypeOfMarker.WATER);
        Paper paper = new Paper(55, 150, PaperFormat.A4);

        secondGuy.addToKit(pen);
        secondGuy.addToKit(pen1);
        secondGuy.addToKit(pen2);
        secondGuy.addToKit(pencil);
        secondGuy.addToKit(marker);
        secondGuy.addToKit(paper);

        Collections.sort(secondGuy.getKit(), comparator);
        System.out.println("Sorted by price:");
        for (Stationery stationery : secondGuy.getKit()) {
            System.out.println(stationery);
        }

        Collections.sort(secondGuy.getKit(), comparatorByBrand);
        System.out.println("\nSorted by brand:");
        for (Stationery stationery : secondGuy.getKit()) {
            System.out.println(stationery);
        }

        Collections.sort(secondGuy.getKit(), comparatorByPriceAndBrand);
        System.out.println("\nSorted by price and brand:");
        for (Stationery stationery : secondGuy.getKit()) {
            System.out.println(stationery);
        }
    }
}
