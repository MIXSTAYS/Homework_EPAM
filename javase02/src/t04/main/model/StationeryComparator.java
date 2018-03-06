package t04.main.model;

import t03.main.model.Stationery;

import java.util.Comparator;

public class StationeryComparator implements Comparator<Stationery> {

    @Override
    public int compare(Stationery stationery1, Stationery stationery2) {
        if (stationery1.getPrice() < stationery2.getPrice()) {
            return -1;
        } else if (stationery1.getPrice() > stationery2.getPrice()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static class compareByBrand implements Comparator<Stationery> {

        @Override
        public int compare(Stationery stationery1, Stationery stationery2) {
            return stationery1.getBrand().compareTo(stationery2.getBrand());
        }
    }

    public static class compareByPriceAndBrand implements Comparator<Stationery> {

        @Override
        public int compare(Stationery stationery1, Stationery stationery2) {
            if (stationery1.getPrice() < stationery2.getPrice()) {
                return -1;
            } else if (stationery1.getPrice() > stationery2.getPrice()) {
                return 1;
            } else {
                return stationery1.getBrand().compareTo(stationery2.getBrand());
            }
        }
    }
}
