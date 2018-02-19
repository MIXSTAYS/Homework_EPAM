package musicalInstrument;

import melody.Melody;

abstract class StringedInstrument implements MusicalInstrument {
    private int numberOfStrings; // Encapsulation
    private String name;


    public StringedInstrument(String name){
        this.name = name;
    }

    public abstract void play(String melody); // Inheritance

    public abstract void description();

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
