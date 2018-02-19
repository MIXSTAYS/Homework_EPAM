package musicalInstrument;

import melody.Melody;


public class Guitar extends StringedInstrument {
    private Melody guitarMelody = new Melody("Brenk-brenk");

    public Guitar (String name, int numberOfStrings){
        super(name);
        if(numberOfStrings == 6 || numberOfStrings == 7){
            setNumberOfStrings(numberOfStrings);
        } else {
            throw new RuntimeException("wrongNumberOfStrings");
        }

    }

    @Override
    public void play(String melody) {  // Полиморфизм
        guitarMelody.setMelody(melody);
        System.out.println("This guitar name - " + getName() + ". Playing " + guitarMelody.getMelody()
                + " by " + getNumberOfStrings() + " strings." );
    } // Polymorphism

    @Override
    public void description() {
        System.out.println("You can play: " + guitarMelody.getMelody());
    }

}
