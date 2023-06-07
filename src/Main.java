import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void print(Human h){
        System.out.println(h.getFirstName() + " " + h.getLastName() + " " + h.getAge() + " лет ");

    }
    public static void main(String[] args) {
        Human h1 = new Human(19, "Andrew", "Smirnov", LocalDate.of(2003, 3, 17), 68);
        Human h2 = new Human(21, "Jam", "Kirov", LocalDate.of(2001, 5, 17),77);
        Human h3 = new Human(33, "Ivan", "Ivanov", LocalDate.of(1989, 9, 17),79);
        Human h4 = new Human(15, "Masha", "Churkina", LocalDate.of(2008, 1, 17),59);
        List<Human> arr = new ArrayList<>();
        arr.add(h1);
        arr.add(h2);
        arr.add(h3);
        arr.add(h4);

        System.out.println("До сортировки: ");
        for(Human h : arr){
            System.out.println(h.getFirstName() + " " + h.getLastName() + " " + h.getAge() + " лет ");
        }

        System.out.println("\nПосле сортировки по возрасту: ");
        Stream<Human> stream = arr.stream();
        stream.sorted(Comparator.comparingInt(Human::getAge)).forEach(Main::print);

        System.out.println("\nПосле Фильтра: ");
        Stream<Human> stream2 = arr.stream();
        stream2.filter(Human -> Human.getFirstNameLetter() == 'A').forEach(Main::print);

        System.out.println("\nПосле сортировки по дате рождения: ");
        Stream<Human> stream3 = arr.stream();
        stream3.sorted(Comparator.comparing(Human::getBirthDate)).forEach(Main::print);

        System.out.println("\nПосле расчета среднего веса: ");
        Stream<Human> stream4 = arr.stream();
        Optional<Human> sum = stream4.reduce((a, b) -> new Human(a.getWeight() + b.getWeight()));
        System.out.println(sum.get().getWeight()/arr.size());
    }
}