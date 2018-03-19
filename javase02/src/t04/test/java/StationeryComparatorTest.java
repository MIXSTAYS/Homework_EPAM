package t04.test.java;

import org.junit.Before;
import org.junit.Test;
import t03.main.java.*;
import t03.main.java.writingStationery.*;
import t04.main.java.StationeryComparator;

import java.util.ArrayList;

import static java.util.Collections.sort;
import static org.junit.Assert.assertEquals;

public class StationeryComparatorTest {
    private StationeryComparator comparator;
    private StationeryComparator.compareByBrand comparatorByBrand;
    private StationeryComparator.compareByPrice comparatorByPrice;

    private NewbieKit testKit;

    private Pen pen;
    private Pen pen2;
    private Pencil pencil;
    private Marker marker;
    private EyeletPuncher eyeletPuncher;
    private Paper paper;

    private ArrayList<Stationery> sorted;
    private ArrayList<Stationery> sortedByBrand;
    private ArrayList<Stationery> sortedByPrice;

    @Before
    public void setUp(){
        comparator = new StationeryComparator();
        comparatorByBrand = new StationeryComparator.compareByBrand();
        comparatorByPrice = new StationeryComparator.compareByPrice();

        testKit = new NewbieKit("Test Guy", new ArrayList<>());

        pen = new Pen("Pilot", 40, Color.BLUE);
        eyeletPuncher = new EyeletPuncher(75);
        pen2 = new Pen("Parker", 130, Color.BLACK);
        pencil = new Pencil("Koh-I-Noor", 20);
        marker = new Marker("WaterShape", 55, Color.ORANGE, TypeOfMarker.WATER);
        paper = new Paper(96, 150, PaperFormat.A4);

        testKit.addToKit(pen);
        testKit.addToKit(paper);
        testKit.addToKit(pen2);
        testKit.addToKit(pencil);
        testKit.addToKit(eyeletPuncher);
        testKit.addToKit(marker);

        sorted = new ArrayList<>();
        sorted.add(pencil);
        sorted.add(pen);
        sorted.add(marker);
        sorted.add(eyeletPuncher);
        sorted.add(paper);
        sorted.add(pen2);

        sortedByBrand = new ArrayList<>();
        sortedByBrand.add(pencil);
        sortedByBrand.add(pen2);
        sortedByBrand.add(pen);
        sortedByBrand.add(paper);
        sortedByBrand.add(eyeletPuncher);
        sortedByBrand.add(marker);

        sortedByPrice = new ArrayList<>();
        sortedByPrice.add(pencil);
        sortedByPrice.add(pen);
        sortedByPrice.add(marker);
        sortedByPrice.add(eyeletPuncher);
        sortedByPrice.add(paper);
        sortedByPrice.add(pen2);

    }

    @Test
    public void comparatorShouldReturnArrayListSortedByPriceAndBrand() {
        testKit.getKit().sort(comparator);
        assertEquals(testKit.getKit(), sorted);
    }

    @Test
    public void comparatorByBrandShouldReturnArrayListSortedByBrand() {
        testKit.getKit().sort(comparatorByBrand);
        assertEquals(testKit.getKit(), sortedByBrand);
    }

    @Test
    public void comparatorByPriceShouldReturnEqualArrayList() {
        testKit.getKit().sort(comparatorByPrice);
        assertEquals(testKit.getKit(), sortedByPrice);
    }
}
