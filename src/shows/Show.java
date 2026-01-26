package shows;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String actorSurname) {
        boolean actorFound = false;
        for (Actor actor : listOfActors) {
           if (actorSurname.equals(actor.getSurname())) {
               listOfActors.set(listOfActors.indexOf(actor), newActor);
               actorFound = true;
               break;
           }
       }
       if (!actorFound) {
           System.out.println(actorSurname + " - актёр не обнаружен, заменять некого!");
       }
    }

    public String getTitle() {
        return title;
    }
}

