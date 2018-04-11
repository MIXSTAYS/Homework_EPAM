package t04.main.java;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FilmCollection implements Serializable {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "FilmCollection: " + movies;
    }
}
