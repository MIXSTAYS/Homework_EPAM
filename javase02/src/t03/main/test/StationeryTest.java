package t03.main.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import t02.main.model.Ruler;
import t03.main.model.writingStationery.*;

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
        Assert.assertEquals(20, pencil.getPrice());
        Assert.assertEquals(470, pen.getPrice());
        Assert.assertEquals(60, ruler.getPrice());
    }

    @Test
    public void getBrandShouldReturnBrand() {
        Assert.assertEquals("Koh-I-Noor", pencil.getBrand());
        Assert.assertEquals("Senator", pen.getBrand());
        Assert.assertEquals("Unknown", ruler.getBrand());
    }

    @Test
    public void getInkColorShouldReturnPenInkColor() {
        Assert.assertEquals(BLACK, pen.getInkColor());
    }

    @Test
    public void getLengthShouldReturnRulerLength() {
        Assert.assertEquals(15, ruler.getLength());
    }

    @Test
    public void setBrandShouldSetBrandToStationery() {
        pen.setBrand("Test");
        pencil.setBrand("Test");
        ruler.setBrand("Test");
        Assert.assertEquals("Test", pen.getBrand());
        Assert.assertEquals("Test", pencil.getBrand());
        Assert.assertEquals("Test", ruler.getBrand());
    }

    @Test
    public void setPriceShouldSetPriceToStationery() {
        pen.setPrice(777);
        pencil.setPrice(777);
        ruler.setPrice(777);
        Assert.assertEquals(777, pen.getPrice());
        Assert.assertEquals(777, pencil.getPrice());
        Assert.assertEquals(777, ruler.getPrice());
    }

    @Test
    public void brandShouldBeUnknownForEmptyConstructorField() {
        Ruler anotherRuler = new Ruler();
        Assert.assertEquals("Unknown", anotherRuler.getBrand());
    }

    @Test
    public void methodWriteShouldPrintDifferentMessageForDifferentObjects() {
        Assert.assertEquals("You can clean it by eraser", pencil.write());
        Assert.assertEquals("Writes in a small handwriting", pen.write());
        Assert.assertEquals("Writes in a large handwriting", marker.write());
    }
}