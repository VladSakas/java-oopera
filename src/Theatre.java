import people.Actor;
import people.Director;
import people.Gender;
import people.Person;
import show.Show;
import show.Ballet;
import show.Opera;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        // 1 создаём актёров
        Actor actor1 = new Actor("Александр", "Невский-Шварцнеггер", Gender.MALE, 250);
        Actor actor2 = new Actor("Райан", "Гослинг", Gender.MALE, 182);
        Actor actor3 = new Actor("Анна", "Де Армас", Gender.FEMALE, 168);

        // 1 создаём режиссёров
        Director director1 = new Director("Джеймс", "Кэмерон", Gender.MALE, 666);
        Director director2 = new Director("Гай", "Ричи", Gender.MALE, 696);

        // 1 создаём автора музыки и хореографа
        Person musicAuthor = new Person("Ханс", "Циммер", Gender.MALE);
        Person choreographer = new Person("Кристал", "Пайт", Gender.MALE);

        // 2 создаём три спектакля: обычный, оперный и балет
        Show ordinaryShow = new Show("Уот так уот", 140, director1, new ArrayList<Actor>());

        Opera opera = new Opera("Травиата", 160, director2, new ArrayList<Actor>(), musicAuthor,
                                "Молодой Альфред влюбляется в умирающую от чахотки куртизанку Виолетту,\n" +
                                        "они сбегают в загородный дом, но под давлением его отца\n" +
                                        "она жертвует счастьем ради репутации семьи,\n" +
                                        "что приводит к публичному скандалу, смертельной болезни\n" +
                                        "и их воссоединению лишь у её смертного одра.", 200);

        Ballet ballet = new Ballet("Лебединое озеро", 150, director1, new ArrayList<Actor>(), musicAuthor,
                                    "Принц Зигфрид влюбляется в заколдованную девушку-лебедя Одетту,\n" +
                                            "обманывается коварным двойником Одиллией и, осознав ошибку,\n" +
                                            "в финальной битве со злым волшебником освобождает возлюбленную\n" +
                                            "от чар ценой собственной жизни, соединяясь с ней в потустороннем мире.",
                                    choreographer);
        // 3 Распределяем актёров по спектаклям
        ordinaryShow.addActor(actor1);
        ordinaryShow.addActor(actor2);
        ordinaryShow.addActor(actor3);
        opera.addActor(actor1);
        opera.addActor(actor2);
        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // 4 выводим список актёров для каждого спектакля
        System.out.println("~ ".repeat(40));
        System.out.println("Список актёров '" + ordinaryShow.getTitle() + "':");
        System.out.println("~ ".repeat(40));
        ordinaryShow.printListOfActors();
        System.out.println("~ ".repeat(40));
        System.out.println("Список актёров '" + opera.getTitle() + "':");
        System.out.println("~ ".repeat(40));
        opera.printListOfActors();
        System.out.println("~ ".repeat(40));
        System.out.println("Список актёров '" + ballet.getTitle() + "':");
        System.out.println("~ ".repeat(40));
        ballet.printListOfActors();
        System.out.println("~ ".repeat(40));

        // 5 заменяем актёра в одном из спектаклей на существующего из другого спектакля и вывести список
        System.out.println("ЗАДАНИЕ С ЗАМЕНОЙ");
        System.out.println("# ".repeat(40));
        System.out.println("Попытка замены на существующего актёра...");
        opera.replaceActor(actor1, "Гослинг");
        System.out.println("# ".repeat(40));
        System.out.println("Актуальный список актёров '" + opera.getTitle() + "':");

        opera.printListOfActors();

        // 6 заменяем несуществующего актёра
        System.out.println("x ".repeat(40));
        System.out.println("Попытка замены секретного актёра...");
        ballet.replaceActor(actor2, "Безруков");
        System.out.println("x ".repeat(40));

        // 7 выводим либретто для балета и оперы
        System.out.println("= ".repeat(40));
        System.out.println("Либретто оперы '" + opera.getTitle() + "':");
        System.out.println("= ".repeat(40));
        opera.printLibrettoText();
        System.out.println("= ".repeat(40));
        System.out.println("Либретто балета '" + ballet.getTitle() + "':");
        System.out.println("= ".repeat(40));
        ballet.printLibrettoText();
    }
}
