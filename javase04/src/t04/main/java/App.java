package t04.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static FilmCollection filmCollection;

    private static String getStringFromScanner(){
        return new Scanner(System.in).nextLine();
    }

    private static int getIntFromScanner(){
        return new Scanner(System.in).nextInt();
    }

    private static void startConsole() {
        System.out.println("Film App\n");
        printHelp();
        boolean work = true;
        while(work) {
            switch (getStringFromScanner()) {
                case "-h":
                    printHelp();
                    break;
                case "-sc":
                    System.out.println(filmCollection.getMovies());
                    break;
                case "-mn":
                    modifyName();
                    break;
                case "-af":
                    addFilm();
                    break;
                case "-exit":
                    FilmUtil.saveCollection(filmCollection);
                    work = false;
                    break;
                default:
                    System.out.println("No such command");
                    printHelp();
                    break;
            }
        }
    }

    private static void printHelp() {
        System.out.println("-h");
        System.out.println("-sc   To show collection");
        System.out.println("-mn   To modify film name");
        System.out.println("-af   To add new film");
        System.out.println("-exit   To exit");
    }

    private static void modifyName() {
        int count = 0;
        for (Movie movie : filmCollection.getMovies()) {
            System.out.println((++count) + ") " + movie.getTitle());
        }

        System.out.println("\nEntry number of film to modify");
        int filmNumber = getIntFromScanner() - 1;

        System.out.println("Entry new film name");
        filmCollection.getMovies().get(filmNumber).setTitle(getStringFromScanner());
        System.out.println(filmCollection.getMovies().get(filmNumber).getTitle() + " - new name.");
    }

    private static void addFilm() {
        System.out.println("Entry film name");
        String title = getStringFromScanner();

        System.out.println("Entry actors. To stop entry 'stop'");
        List<Actor> actors = new ArrayList<>();
        String message;
        while (!(message = getStringFromScanner()).equals("stop")) {
            String[] actor = message.split(" ");
            actors.add(new Actor(actor[0], actor[1]));
        }

        Movie movie = new Movie(title, actors);
        filmCollection.addMovie(movie);
    }

    public static void main(String[] args) {
        filmCollection = FilmUtil.loadCollection();
        startConsole();
    }
}
