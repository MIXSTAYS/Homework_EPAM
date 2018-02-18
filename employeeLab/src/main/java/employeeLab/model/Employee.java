package main.java.employeeLab.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Employee extends Person {

    Map<Skills, Integer> skills;

    public Employee(String name, String surname) {
        super(name, surname);
        skills = new HashMap<>();
    }

    public Employee(String name, String surname, Date dateOfBirth) {
        super(name, surname, dateOfBirth);
        skills = new HashMap<>();
    }

    public Employee(String name, String surname, Date dateOfBirth, Map<Skills, Integer> skills) {
        super(name, surname, dateOfBirth);
        this.skills = skills;
    }

    public int hasSkill(String skillName) {
        if (skillName == null) {
            return -1;
        }
        Skills skill = Skills.checkedValue(skillName);
        return skill == null || skills.get(skill) == null ? -1 : skills.get(skill);
    }

    /**
     * @param skill
     * @param level
     * @return boolean true if skill was added
     */
    public boolean addNewSkill(Skills skill, int level) {
        int value = hasSkill(skill.name());
        if (value != -1) {
            System.out.println(String.format("This skill already exists with %d level value", value));
            return false;
        }
        skills.put(skill,level);
        return true;
    }
}
