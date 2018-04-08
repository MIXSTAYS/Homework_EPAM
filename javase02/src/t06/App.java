package t06;

import t06.main.java.AtomicBoat;

import java.util.ArrayList;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        AtomicBoat atomicBoat = new AtomicBoat();
        System.out.println(atomicBoat.getEngineStatus());
        System.out.println(atomicBoat.getBoatStatus() + "\n");

        atomicBoat.addEngine();
        System.out.println(atomicBoat.getEngineStatus());
        System.out.println(atomicBoat.getBoatStatus() + "\n");

        atomicBoat.engineRPM(1200);
        System.out.println(atomicBoat.getRPM());
        System.out.println(atomicBoat.getEngineStatus());
        System.out.println(atomicBoat.getBoatStatus() + "\n");

        atomicBoat.engineRPM(0);
        System.out.println(atomicBoat.getRPM());
        System.out.println(atomicBoat.getEngineStatus());
        System.out.println(atomicBoat.getBoatStatus());
    }
}