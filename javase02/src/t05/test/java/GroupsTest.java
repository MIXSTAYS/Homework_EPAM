package t05.test.java;

import org.junit.Before;
import org.junit.Test;
import t05.main.java.group.Group;
import t05.main.java.mark.IntMark;
import t05.main.java.mark.RealMark;
import t05.main.java.student.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static t05.main.java.discipline.Discipline.LITERATURE;
import static t05.main.java.discipline.Discipline.PHYSICS;

public class GroupsTest {
    private IntMark intMark;
    private RealMark realMark;
    private Group<RealMark> physics;
    private Group<IntMark> literature;
    private Student st1 = new Student("TestName", "TestSurname");
    private Student st2 = new Student("TestName2", "TestSurname2");

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
    public void addStudentShouldAddIncreaseJournalSize() {
        assertEquals(1,physics.getJournal().size());
        physics.addStudent(st2, new RealMark(5.0));
        assertEquals(2,physics.getJournal().size());
    }

    @Test
    public void addStudentShouldAddDisciplineToTheMark() {
        assertEquals(LITERATURE, intMark.getDiscipline());
        assertEquals(PHYSICS, realMark.getDiscipline());
    }

    @Test
    public void getSubjectShouldReturnNameOfDiscipline() {
        assertEquals(LITERATURE, literature.getSubject());
        assertEquals(PHYSICS, physics.getSubject());
    }
}
