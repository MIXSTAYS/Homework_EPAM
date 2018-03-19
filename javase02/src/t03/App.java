package t03;

import t03.main.java.*;
import t03.main.java.writingStationery.Color;
import t03.main.java.writingStationery.Pen;
import t03.main.java.writingStationery.Pencil;

import java.util.ArrayList;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        Pen pen = new Pen("Pilot", 60, Color.GREEN);
        Pen anotherPen = new Pen(55, Color.RED);
        Pencil pencil = new Pencil("Coloursoft", 15);
        Stationery paper = new Paper(176, 100, PaperFormat.A4);
        Stationery eyeletPuncher = new EyeletPuncher("NoNamePuncher", 200);


        NewbieKit noob = new NewbieKit("Vasya", new ArrayList<>());


        noob.addToKit(pencil);
        noob.addToKit(pen);
        noob.addToKit(paper);
        noob.addToKit(anotherPen);
        noob.addToKit(eyeletPuncher);

        for (Stationery item : noob.getKit()) {
            System.out.println(item);
        }

        System.out.println("ПРОБЕЛ");

        Iterator<Stationery> iterator = noob.getKit().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
