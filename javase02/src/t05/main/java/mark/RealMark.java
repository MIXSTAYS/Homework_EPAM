package t05.main.java.mark;

import t05.main.java.discipline.Discipline;

import java.util.Objects;

public class RealMark implements Mark {

    private double value;
    private Discipline discipline;

    public RealMark(double value) {
        this.value = value;
    }

    public double getValue() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealMark realMark = (RealMark) o;
        return Double.compare(realMark.value, value) == 0;
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
