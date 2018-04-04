package t05.main.java.mark;

import t05.main.java.discipline.Discipline;

import java.util.Objects;

public class IntMark implements Mark {

    private int value;
    private Discipline discipline;

    public IntMark(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Discipline getDiscipline() {
        return discipline;
    }

    @Override
    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    @Override
    public double getRealValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntMark intMark = (IntMark) o;
        return value == intMark.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Mark: " + value + ", Discipline: " + discipline;
    }
}
