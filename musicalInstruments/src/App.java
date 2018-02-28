import musicalInstrument.Drum;
import musicalInstrument.Guitar;
import musicalInstrument.MusicalInstrument;
import musicalInstrument.Trombone;

public class App {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Salaga", 6);
        guitar.description();
        guitar.play("Guitar theme");
        System.out.println();

        Trombone trombone = new Trombone("Trombone");
        trombone.description();
        trombone.play("Trombone sound");
        System.out.println();

        Trombone anotherTrombone = new Trombone("Another Trombone");
        anotherTrombone.description();
        anotherTrombone.play("Another trombone's sound", 6);
        System.out.println();

        Drum drum = new Drum("Barabani", "Zhelezo");
        drum.description();
        drum.play("Drums bit");
        System.out.println();

        MusicalInstrument[] music = new MusicalInstrument[4];
        music[0] = guitar;
        music[1] = trombone;
        music[2] = anotherTrombone;
        music[3] = drum;
        for (MusicalInstrument mus : music) {
            mus.play("something");
            if (mus instanceof Drum) {
                drum.setBit(4);
                System.out.println("Bit: " + ((Drum)mus).getBit());
            } else if (mus instanceof Guitar) {
                System.out.println("This guitar have " + ((Guitar) mus).getNumberOfStrings() +
                        " strings.");
            } else if (mus instanceof Trombone) {
                System.out.println("Tone: " + ((Trombone)mus).getTone());
            } else {
                System.out.println(mus + " do not accept to musical instruments");
            }
        }
    }
}
