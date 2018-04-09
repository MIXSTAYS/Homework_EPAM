package t04.main.java;

import java.io.Serializable;
import java.util.List;

public class Movie implements Serializable {
    private String title;
    private List<Actor> actors;

    public Movie(String title, List<Actor> actors) {
        this.title = title;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < actors.size(); i++) {
            sb.append(actors.get(i) + ", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return "Movie " + title + ", actors " + sb;
    }
}
