package test.java.employeeLab.model;

import main.java.employeeLab.model.Employee;
import main.java.employeeLab.model.Skills;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Employee employee;
    private Employee cleverEmployee;
    private Map<Skills, Integer> skills;

    @Before
    public void setUp(){
        employee = new Employee("Tom", "Johnson");

        Date dateOfBirth = new Date();
        skills = new HashMap<>();
        skills.put(Skills.JAVA, 3);
        skills.put(Skills.TEAM_PLAYER, 2);
        cleverEmployee = new Employee("Timon", "Junior", new Date(), skills);

    }

    @Test
    public void hasSkillShouldReturnMinusOneForMissingSkill(){
        assertEquals(-1, employee.hasSkill("Cooking"));
    }
    @Test
    public void hasSkillShouldReturnMinusOneForNullSkill(){
        assertEquals(-1, employee.hasSkill(null));
    }
    @Test
    public void hasSkillShouldReturnSkillValue(){
        assertEquals(3, cleverEmployee.hasSkill("JAVA"));
        assertEquals(2, cleverEmployee.hasSkill("TEAM_PLAYER"));
    }
    @Test
    public void hasSkillShouldSkillValueIgnorCase(){
        assertEquals(3, cleverEmployee.hasSkill("java"));
        assertEquals(2, cleverEmployee.hasSkill("team_player"));
    }
    @Test
    public void addNewSkillShouldUpdateSkillsMapAndReturnTrue(){
        assertTrue(cleverEmployee.addNewSkill(Skills.ENGLISH, 4));
    }
}
