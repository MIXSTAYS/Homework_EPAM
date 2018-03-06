package t04.main.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import t03.main.model.*;
import t03.main.model.writingStationery.*;
import t04.main.model.StationeryComparator;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class StationeryComparatorTest {
    private StationeryComparator comparator;
    private StationeryComparator.compareByBrand comparatorByBrand;
    private StationeryComparator.compareByPriceAndBrand comparatorByPriceAndBrand;

    private NewbieKit testKit;

    private Pen pen;
    private Pen pen2;
    private Pencil pencil;
    private Marker marker;
    private EyeletPuncher eyeletPuncher;
    private Paper paper;

    private ArrayList<Stationery> sortedByPrice;
    private ArrayList<Stationery> sortedByBrand;
    private ArrayList<Stationery> sortedByPriceAndBrand;

    @Before
    public void setUp(){
        comparator = new StationeryComparator();
        comparatorByBrand = new StationeryComparator.compareByBrand();
        comparatorByPriceAndBrand = new StationeryComparator.compareByPriceAndBrand();

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

        sortedByPrice = new ArrayList<>();
        sortedByPrice.add(pencil);
        sortedByPrice.add(pen);
        sortedByPrice.add(marker);
        sortedByPrice.add(eyeletPuncher);
        sortedByPrice.add(paper);
        sortedByPrice.add(pen2);

        sortedByBrand = new ArrayList<>();
        sortedByBrand.add(pencil);
        sortedByBrand.add(pen2);
        sortedByBrand.add(pen);
        sortedByBrand.add(paper);
        sortedByBrand.add(eyeletPuncher);
        sortedByBrand.add(marker);

        sortedByPriceAndBrand = new ArrayList<>();
        sortedByPriceAndBrand.add(pencil);
        sortedByPriceAndBrand.add(pen);
        sortedByPriceAndBrand.add(marker);
        sortedByPriceAndBrand.add(eyeletPuncher);
        sortedByPriceAndBrand.add(paper);
        sortedByPriceAndBrand.add(pen2);

    }

    @Test
    public void comparatorShouldReturnArrayListSortedByPrice() {
        sort(testKit.getKit(), comparator);
        Assert.assertEquals(testKit.getKit(), sortedByPrice);
    }

    @Test
    public void comparatorByBrandShouldReturnArrayListSortedByBrand() {
        sort(testKit.getKit(), comparatorByBrand);
        Assert.assertEquals(testKit.getKit(), sortedByBrand);
    }

    @Test
    public void comparatorByPriceAndBrandShouldReturnEqualArrayList() {
        sort(testKit.getKit(), comparatorByPriceAndBrand);
        Assert.assertEquals(testKit.getKit(), sortedByPriceAndBrand);
    }
}
