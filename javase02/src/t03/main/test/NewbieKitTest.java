package t03.main.test;

import org.junit.Before;
import org.junit.Test;
import t03.main.model.NewbieKit;
import t03.main.model.writingStationery.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewbieKitTest {

    private NewbieKit noob;
    private Pencil pencil;
    private Pen pen;
    private Marker marker;

    @Before
    public void setUp() {
        noob = new NewbieKit("Sasha", new ArrayList<>());
        pencil = new Pencil("Koh-I-Noor", 25);
        pen = new Pen(140, Color.RED);
        marker = new Marker("Promarker", 70, Color.YELLOW, TypeOfMarker.WATER);
        noob.addToKit(pencil);
        noob.addToKit(pen);
    }

    @Test
    public void addToKitShouldIncreaseListSize() {
        assertTrue(2 == noob.getSize());
        noob.addToKit(marker);
        assertTrue(3 == noob.getSize());
    }

    @Test
    public void removeFromKitShouldDeleteElement() {
        assertEquals(2, noob.getSize());
        noob.removeFromKit(pen);
        assertEquals(1, noob.getSize());
    }
}
