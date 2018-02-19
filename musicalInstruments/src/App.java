import melody.Melody;
import musicalInstrument.Drum;
import musicalInstrument.Guitar;
import musicalInstrument.Trombone;

public class App {
    public static void main(String[] args) {

        Guitar guitar = new Guitar("Salaga", 6);
        guitar.description();
        guitar.information(guitar.getName(), "Guitar theme");

        Trombone trombone = new Trombone("Spooody");
        trombone.description();
        trombone.information(trombone.getName(), "Boo-oo");

        Drum drum = new Drum("Barabani", "Zhelezo");
        drum.description();
        drum.information(drum.getName(), "Drums bit");
    }
}
