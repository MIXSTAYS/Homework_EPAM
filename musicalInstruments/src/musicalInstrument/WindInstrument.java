package musicalInstrument;

import melody.Melody;

abstract class WindInstrument implements MusicalInstrument {
    private int tone;
    private String name;

    public WindInstrument(String name){
        this.name = name;
    }

    public abstract void play(String melody);

    public abstract void description();

    public int getTone() {
        return tone;
    }

    public void setTone(int tone) {
        this.tone = tone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
