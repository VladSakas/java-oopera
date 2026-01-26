package shows.musical_shows;

import persons.Actor;
import persons.Director;
import persons.Person;
import shows.MusicalShow;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
