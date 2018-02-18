package main.java.employeeLab.model;

public enum Skills {
    JAVA("Can develop new using Java"),
    TEST("Can test an awful thing"),
    ENGLISH("Can speak"),
    TEAM_PLAYER("Can work with somebody");
    String description;
    Skills(String description) {
        this.description = description;
    }
    public static Skills checkedValue(String skillName){
        try{
            return valueOf(skillName.toUpperCase());
        } catch (IllegalArgumentException e){
            return null;
        }
    }
}
