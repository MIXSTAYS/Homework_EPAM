package t04.main.java;

import java.io.Serializable;

public class Actor implements Serializable {
    private String name;
    private String surname;

    public Actor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

}
