package t05.main.java.group;

import t05.main.java.discipline.Discipline;
import t05.main.java.mark.Mark;
import t05.main.java.student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group<T extends Mark> {

    private String groupName;
    private Discipline subject;
    private Map<Student, Mark> journal = new HashMap<>();

    public Group(String groupName, Discipline subject) {
        this.groupName = groupName;
        this.subject = subject;
    }

    public void addStudent(Student student, T mark) {
        mark.setDiscipline(subject);
        journal.put(student, mark);
    }

    public Mark getMark(Student student) {
        return journal.get(student);
    }

    public Map<Student, Mark> getJournal() {
        return journal;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(journal.keySet());
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Discipline getSubject() {
        return subject;
    }
}
