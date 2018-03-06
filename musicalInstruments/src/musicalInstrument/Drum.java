package musicalInstrument;

import melody.Melody;

public class Drum extends PercussionInstrument {
    private Melody drumsBit = new Melody("Bom-bom-bam!");
    private int bit;

    public Drum(String name, String material) {
        super(name, material);
    }

    public void setBit(int bit){
        this.bit = bit;
    }

    public int getBit(){
        return bit;
    }

    @Override
    public void play(String melody) {
        drumsBit.setMelody(melody);
        System.out.println("This drum name - " + getName() + ". Playing " + drumsBit.getMelody()
                + ". Material - " + getMaterial());
    }

    @Override
    public void description() {
        System.out.println("You can play: " + drumsBit.getMelody());
    }
}
