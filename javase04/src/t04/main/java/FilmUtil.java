package t04.main.java;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FilmUtil {

    private static final String PATH = "javase04/src/t04/main/resources/filmCollection.txt";

    public static FilmCollection loadCollection() {
        FilmCollection filmCollection;
        try (FileInputStream fileIn = new FileInputStream(PATH);
             ObjectInputStream in = new ObjectInputStream(fileIn)){
            filmCollection = (FilmCollection) in.readObject();
            return filmCollection;
        } catch (IOException i) {
            i.printStackTrace();
            System.exit(1);
            return null;
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
            System.exit(1);
            return null;
        }
    }
    public static void saveCollection(FilmCollection filmCollection) {
        try (FileOutputStream fileOut = new FileOutputStream(PATH);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(filmCollection);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
