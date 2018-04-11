package t04.test.java;

import org.junit.Test;
import t04.main.java.Actor;
import t04.main.java.App;
import t04.main.java.FilmCollection;
import t04.main.java.FilmUtil;
import t04.main.java.Movie;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
    public void addMovieShouldAddMovieToFilmCollection() {
        FilmCollection filmCollection = new FilmCollection();
        Actor testActor = new Actor("First", "For test");
        List<Actor> actors = new ArrayList<>();
        actors.add(testActor);
        Movie testMovie = new Movie("Test", actors);
        filmCollection.addMovie(testMovie);
        assertEquals(testMovie, filmCollection.getMovies().get(0));
    }
}
