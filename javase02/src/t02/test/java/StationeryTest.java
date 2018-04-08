package t02.test.java;

import org.junit.Before;
import org.junit.Test;
import t02.main.java.Pen;
import t02.main.java.Pencil;
import t02.main.java.Ruler;

import static org.junit.Assert.assertEquals;
import static t02.main.java.Color.*;

public class StationeryTest {
    private Pen pen;
    private Pencil pencil;
    private Ruler ruler;

    @Before
    public void setUp(){
        pencil = new Pencil("Koh-I-Noor", 20);
        pen = new Pen("Senator", 470);
        ruler = new Ruler(60, 15);
    }

    @Test
    public void getPriceShouldReturnPrice(){
        assertEquals(20, pencil.getPrice());
        assertEquals(470, pen.getPrice());
        assertEquals(60, ruler.getPrice());
    }
    @Test
    public void getBrandShouldReturnBrand(){
        assertEquals("Koh-I-Noor", pencil.getBrand());
        assertEquals("Senator", pen.getBrand());
        assertEquals("Unknown", ruler.getBrand());
    }
    @Test
    public void getInkColorShouldReturnPenInkColor(){
        assertEquals(BLUE, pen.getInkColor());
    }
    @Test
    public void getLengthShouldReturnRulerLength(){
        assertEquals(15, ruler.getLength());
    }
    @Test
    public void setBrandShouldSetBrandToStationery(){
        pen.setBrand("Test");
        pencil.setBrand("Test");
        ruler.setBrand("Test");
        assertEquals("Test", pen.getBrand());
        assertEquals("Test", pencil.getBrand());
        assertEquals("Test", ruler.getBrand());
    }
    @Test
    public void setPriceShouldSetPriceToStationery(){
        pen.setPrice(777);
        pencil.setPrice(777);
        ruler.setPrice(777);
        assertEquals(777, pen.getPrice());
        assertEquals(777, pencil.getPrice());
        assertEquals(777, ruler.getPrice());
    }
    @Test
    public void brandShouldBeUnknownForEmptyConstructorField(){
        Pencil anotherPencil = new Pencil();
        Pen anotherPen = new Pen();
        Ruler anotherRuler = new Ruler();
        assertEquals("Unknown", anotherPen.getBrand());
        assertEquals("Unknown", anotherPencil.getBrand());
        assertEquals("Unknown", anotherRuler.getBrand());
    }
}
