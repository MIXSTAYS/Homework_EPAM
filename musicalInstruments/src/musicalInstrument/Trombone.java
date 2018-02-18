package musicalInstrument;

import melody.Melody;

public class Trombone extends WindInstrument {
    private Melody tromboneMelody = new Melody("Bo-boo-bo-bo");

    public Trombone(String name){
        super(name);
    }

    @Override
    public void information(String name, Melody melody) {
        this.tromboneMelody.setMelody(melody.getMelody());
        this.setTone(10);
        System.out.println("This trombon name - " + getName() + ". Playing " + tromboneMelody.getMelody()
                + ". And tone is equal " + getTone());
    }

    @Override
    public void description() {
        System.out.println("You can play: " + tromboneMelody.getMelody());
    }
}
