package musicalInstrument;

import melody.Melody;

public class Trombone extends WindInstrument {
    private Melody tromboneMelody = new Melody("Bo-boo-bo-bo");

    public Trombone(String name) {
        super(name);
    }

    @Override
    public void play(String melody) {
        tromboneMelody.setMelody(melody);
        System.out.println("This trombone name - " + getName() + ". Playing " + tromboneMelody.getMelody());
    }

    public void play(String melody, int tone) {
        tromboneMelody.setMelody(melody);
        setTone(tone);
        System.out.println("This trombone name - " + getName() + ". Playing " + tromboneMelody.getMelody()
                + ". And tone is equal " + getTone());
    }

    @Override
    public void description() {
        System.out.println("You can play: " + tromboneMelody.getMelody());
    }
}
