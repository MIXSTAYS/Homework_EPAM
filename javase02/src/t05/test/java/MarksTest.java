package t05.test.java;

import org.junit.Before;
import org.junit.Test;
import t05.main.java.group.Group;
import t05.main.java.mark.IntMark;
import t05.main.java.mark.RealMark;
import t05.main.java.student.Student;

import static org.junit.Assert.assertEquals;
import static t05.main.java.discipline.Discipline.LITERATURE;
import static t05.main.java.discipline.Discipline.PHYSICS;

public class MarksTest {

    private IntMark intMark;
    private RealMark realMark;
    private Group<RealMark> physics;
    private Group<IntMark> literature;
    private Student st1;
    private Student st2;

    @Before
    public void setUp() {
        intMark = new IntMark(5);
        realMark = new RealMark(4.5);
        physics = new Group<>("Physics", PHYSICS);
        literature = new Group<>("Literature", LITERATURE);
        physics.addStudent(st1, realMark);
        literature.addStudent(st1, intMark);
    }

    @Test
    public void getValueShouldReturnValueOfMark() {
        assertEquals(5, intMark.getValue());
        assertEquals(4.5, realMark.getValue(), 0);
    }
}
