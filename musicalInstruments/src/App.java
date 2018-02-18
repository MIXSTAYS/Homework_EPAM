import melody.Melody;
import musicalInstrument.Drum;
import musicalInstrument.Guitar;
import musicalInstrument.Trombone;

public class App {
    public static void main(String[] args) {

        Melody melody = new Melody("song");

        Guitar guitar = new Guitar("Salaga");
        guitar.description();
        guitar.information(guitar.getName(), melody);

        Trombone trombone = new Trombone("Spooody");
        trombone.description();
        trombone.information(trombone.getName(), melody);

        Drum drum = new Drum("Barabani", "Zhelezo");
        drum.description();
        drum.information(drum.getName(), melody);
    }
}
