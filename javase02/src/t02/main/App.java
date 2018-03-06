package t02.main;

import t02.main.model.*;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List stationeries = new LinkedList();
        EmployeeWorkplace workplace = new EmployeeWorkplace("Misha", stationeries);
        Pen pen = new Pen("Pilot", 100, Color.GREEN);
        Pencil pencil = new Pencil("Koh-I-Noor", 15);
        Ruler ruler = new Ruler(80, 30);
        workplace.addToKit(pencil);
        workplace.addToKit(ruler);
        workplace.addToKit(pen);
        System.out.println(workplace.getKit());

        System.out.println(pen.equals(pencil));

        Pen anotherPen = new Pen("Pilot", 100, Color.GREEN);
        System.out.println(pen.hashCode() + "    " + anotherPen.hashCode());

        System.out.println(workplace.stationeryPriceCounter());
    }
}
