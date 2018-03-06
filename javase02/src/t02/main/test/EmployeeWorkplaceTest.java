package t02.main.test;

import org.junit.Before;
import org.junit.Test;
import t02.main.model.*;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class EmployeeWorkplaceTest {
    private EmployeeWorkplace employeeWorkplace;
    private LinkedList<Stationery> stationeries;
    @Before
    public void setUp(){
        stationeries = new LinkedList<>();
        stationeries.add(new Pencil(50));
        stationeries.add(new Ruler(120, 30));
        stationeries.add(new Pen("Parker", 450));
        employeeWorkplace = new EmployeeWorkplace("Misha", stationeries);
    }

    @Test
    public void getEmployeeNameShouldReturnTrue(){
        assertEquals("Misha", employeeWorkplace.getEmployeeName());
    }
    @Test
    public void getKitShouldReturnKit(){
        assertEquals(stationeries, employeeWorkplace.getKit());
    }
    @Test
    public void stationeryPriceCounterShouldReturnSum(){
        assertEquals(620, employeeWorkplace.stationeryPriceCounter());
    }
}
