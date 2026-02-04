package show;

import people.Actor;
import people.Director;
import people.Person;

import java.util.ArrayList;
import java.util.Objects;

public class MusicalShow extends Show {
    
    private final String librettoText;
    private final Person musicAuthor;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MusicalShow that = (MusicalShow) o;
        return Objects.equals(librettoText, that.librettoText) && Objects.equals(musicAuthor, that.musicAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), librettoText, musicAuthor);
    }
}