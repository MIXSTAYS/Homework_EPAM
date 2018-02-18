package musicalInstrument;

import melody.Melody;

public class Guitar extends StringedInstrument {
    private Melody guitarMelody = new Melody("Brenk-brenk");

    public Guitar (String name){
        super(name);
    }

    @Override
    public void information(String name, Melody melody) {  // Полиморфизм
        this.guitarMelody.setMelody(melody.getMelody());
        setNumberOfStrings(5);
        System.out.println("This guitar name - " + name + ". Playing " + guitarMelody.getMelody()
                + " by " + getNumberOfStrings() + " strings." );
    } // Polymorphism

    @Override
    public void description() {
        System.out.println("You can play: " + guitarMelody.getMelody());
    }

}
