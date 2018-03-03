package t03;

import t03.main.model.EyeletPuncher;
import t03.main.model.NewbieKit;
import t03.main.model.Paper;
import t03.main.model.Stationery;
import t03.main.model.writingStationery.Color;
import t03.main.model.writingStationery.Pen;
import t03.main.model.writingStationery.Pencil;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Pen pen = new Pen("Pilot", Color.GREEN);
        Pen anotherPen = new Pen(Color.RED);
        Pencil pencil = new Pencil(15);
        Stationery paper = new Paper(250, 100);
        Stationery eyeletPuncher = new EyeletPuncher("NoNamePuncher", 200);


        NewbieKit noob = new NewbieKit("Vasya", new ArrayList<>());


        noob.addToKit(pencil);
        noob.addToKit(pen);
        noob.addToKit(paper);
        noob.addToKit(anotherPen);
        noob.addToKit(eyeletPuncher);


        System.out.println(noob.getKit());
    }
}
