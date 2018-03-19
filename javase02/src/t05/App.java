package t05;

import t05.main.java.discipline.Discipline;
import t05.main.java.group.Group;
import t05.main.java.group.University;
import t05.main.java.mark.IntMark;
import t05.main.java.mark.RealMark;
import t05.main.java.student.Student;

public class App {
    public static void main(String[] args) {
        University gorniy = new University();

        Student st1 = new Student("Mikhail", "Bystrov");
        Student st2 = new Student("Alexey", "Tabolin");
        Student st3 = new Student("Andrey", "Silin");
        Student st4 = new Student("Dmitriy", "Kindeev");
        Student st5 = new Student("Alexandr", "Kokarev");
        Student st6 = new Student("Vitaliy", "Irkov");
        Student st7 = new Student("Igor", "Davidov");

        Group <RealMark> math = new Group("MathMen", Discipline.MATHEMATICS);
        Group <IntMark> bio = new Group("Bio", Discipline.BIOLOGY);
        Group <IntMark> geo = new Group("Globus", Discipline.GEOGRAPHY);

        math.addStudent(st1, new RealMark(4.5));
        math.addStudent(st2, new RealMark(5));
        math.addStudent(st3, new RealMark(2.5));
        math.addStudent(st4, new RealMark(3.5));

        bio.addStudent(st1, new IntMark(4));
        bio.addStudent(st5, new IntMark(5));
        bio.addStudent(st6, new IntMark(2));
        bio.addStudent(st7, new IntMark(3));

        geo.addStudent(st1, new IntMark(7));

        gorniy.addGroup(math);
        gorniy.addGroup(bio);
        gorniy.addGroup(geo);

        gorniy.printMarks(st1);

        System.out.println(bio.getStudents());
    }
}
