package t03.main.test;

import org.junit.Before;
import org.junit.Test;
import t02.main.model.Ruler;
import t03.main.model.writingStationery.*;

import static org.junit.Assert.assertEquals;
import static t03.main.model.writingStationery.Color.BLACK;
import static t03.main.model.writingStationery.Color.YELLOW;

public class StationeryTest {
    private Pen pen;
    private Pencil pencil;
    private Ruler ruler;
    private Marker marker;

    @Before
    public void setUp() {
        pencil = new Pencil("Koh-I-Noor", 20);
        pen = new Pen("Senator", 470, Color.BLACK);
        ruler = new Ruler(60, 15);
        marker = new Marker(67, YELLOW, TypeOfMarker.WATER);
    }

    @Test
    public void getPriceShouldReturnPrice() {
        assertEquals(20, pencil.getPrice());
        assertEquals(470, pen.getPrice());
        assertEquals(60, ruler.getPrice());
    }

    @Test
    public void getBrandShouldReturnBrand() {
        assertEquals("Koh-I-Noor", pencil.getBrand());
        assertEquals("Senator", pen.getBrand());
        assertEquals("Unknown", ruler.getBrand());
    }

    @Test
    public void getInkColorShouldReturnPenInkColor() {
        assertEquals(BLACK, pen.getInkColor());
    }

    @Test
    public void getLengthShouldReturnRulerLength() {
        assertEquals(15, ruler.getLength());
    }

    @Test
    public void setBrandShouldSetBrandToStationery() {
        pen.setBrand("Test");
        pencil.setBrand("Test");
        ruler.setBrand("Test");
        assertEquals("Test", pen.getBrand());
        assertEquals("Test", pencil.getBrand());
        assertEquals("Test", ruler.getBrand());
    }

    @Test
    public void setPriceShouldSetPriceToStationery() {
        pen.setPrice(777);
        pencil.setPrice(777);
        ruler.setPrice(777);
        assertEquals(777, pen.getPrice());
        assertEquals(777, pencil.getPrice());
        assertEquals(777, ruler.getPrice());
    }

    @Test
    public void brandShouldBeUnknownForEmptyConstructorField() {
        Ruler anotherRuler = new Ruler();
        assertEquals("Unknown", anotherRuler.getBrand());
    }

    @Test
    public void methodWriteShouldPrintDifferentMessageForDifferentObjects() {
        assertEquals("You can clean it by eraser", pencil.write());
        assertEquals("Writes in a small handwriting", pen.write());
        assertEquals("Writes in a large handwriting", marker.write());
    }
}