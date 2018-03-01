package t03;

import t03.main.model.NewbieKit;
import t03.main.model.Stationery;
import t03.main.model.Paper;
import t03.main.model.writingStationery.*;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {


        Pen pen = new Pen("Pilot", 100);
        Pen anotherPen = new Pen(110);
        Pencil pencil = new Pencil(15);
        Stationery paper = new Paper(250, 100);


        NewbieKit noob = new NewbieKit("Vasya", new ArrayList<>());


        noob.addToKit(pencil);
        noob.addToKit(pen);
        noob.addToKit(paper);
        noob.addToKit(anotherPen);


        System.out.println(noob.getKit());
    }
}
