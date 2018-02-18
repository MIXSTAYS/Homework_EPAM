package musicalInstrument;

import melody.Melody;

public class Drum extends PercussionInstrument {
    private Melody drumsBit = new Melody("Bom-bom-bam!");

    public Drum(String name, String material){
        super(name, material);
    }

    @Override
    public void information(String name, Melody melody) {
        this.drumsBit.setMelody(melody.getMelody());
        System.out.println("This drums name - " + getName() + ". Playing " + drumsBit.getMelody()
                + ". Material - " + getMaterial());
    }

    @Override
    public void description() {
        System.out.println("You can play: " + drumsBit.getMelody());
    }
}
