package t05.main.java.group;

import t05.main.java.mark.Mark;
import t05.main.java.marksComparator.MarksComparator;
import t05.main.java.student.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class University {

    private List<Group> groups = new ArrayList<>();

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void printMarks(Student student) {
        List<Mark> buffMarks = new ArrayList<>();
        groups.forEach(group -> {
            Mark mark = group.getMark(student);
            if (mark != null) {
                buffMarks.add(mark);
            }
        });
        Collections.sort(buffMarks, new MarksComparator());
        System.out.println("Student: " + student.getName() + " " + student.getSurname());
        buffMarks.forEach(System.out::println);
    }
}
