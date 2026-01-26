package shows;

import persons.Actor;
import persons.Director;
import persons.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {
    
    private final String librettoText;

    // КОНСТРУКТОР
    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.librettoText = librettoText;
    }

    // МЕТОДЫ

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

}
