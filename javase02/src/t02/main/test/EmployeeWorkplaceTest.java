package t02.main.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import t02.main.model.*;

import java.util.LinkedList;

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
        Assert.assertTrue("Misha" == employeeWorkplace.getEmployeeName());
    }
    @Test
    public void getKitShouldReturnKit(){
        Assert.assertEquals(stationeries, employeeWorkplace.getKit());
    }
    @Test
    public void stationeryPriceCounterShouldReturnSum(){
        Assert.assertEquals(620, employeeWorkplace.stationeryPriceCounter());
    }
}
