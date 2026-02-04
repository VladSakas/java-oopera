package show;

import people.Actor;
import people.Director;

import java.util.ArrayList;
import java.util.Objects;

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

        if (listOfActors.contains(newActor)) {
            System.out.println("Ошибка! " + newActor.getSurname() + " не может заменить " + actorSurname +
                    "а,\nтак как " + newActor.getSurname() + " и так в списках этого шоу!");
            return;
        }
        for (Actor actor : listOfActors) {
            if (actorSurname.equals(actor.getSurname())) {
                listOfActors.set(listOfActors.indexOf(actor), newActor);
                actorFound = true;
                System.out.println("Произошла замена: " + newActor.getSurname() + " выступит вместо " + actorSurname);
                break;
            }
        }
        if (!actorFound) {
            System.out.println(actorSurname + " - актёр в списке не обнаружен, заменять некого!");
        }
    }

    public void printDirector() {
        System.out.println(director);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return duration == show.duration && Objects.equals(title, show.title) && Objects.equals(director, show.director)
                && Objects.equals(listOfActors, show.listOfActors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration, director, listOfActors);
    }
}

