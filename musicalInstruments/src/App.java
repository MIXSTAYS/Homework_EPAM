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

        Trombone trombone1 = new Trombone("Trombone1");
        trombone1.description();
        trombone1.play("Trombone1 sound", 6);
        System.out.println();

        Drum drum = new Drum("Barabani", "Zhelezo");
        drum.description();
        drum.play("Drums bit");
        System.out.println();

        MusicalInstrument[] music = new MusicalInstrument[3];
        music[0] = guitar;
        music[1] = trombone;
        music[2] = drum;
        int i = 0;
        for (MusicalInstrument mus : music) {
            if (music[i] instanceof Drum) {
                music[i].description();
            } else if (music[i] instanceof Guitar) {
                music[i].description();
            } else if (music[i] instanceof Trombone) {
                music[i].description();
            } else {
                System.out.println(music[i] + " do not accept to musical instruments");
            }
            i++;
        }
    }
}
