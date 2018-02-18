package main.java.employeeLab.model;

import java.util.Date;


public class Person {
    private String name;
    private String surname;

    private Date dateOfBirth;

    public Person(String name,String surname){
        this.name = name;
        this.surname = surname;
    }

    public Person(String name,String surname,Date dateOfBirth){
        this(name,surname);
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("%s %s",name,surname);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
