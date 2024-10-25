package lec6;

import java.util.*;

/**
 * Перебір, фільтрація і відображення
 */
public class Ex7_2 {
    public static void main(String[] args) {

        //Створюємо список
        List<Person> persons = new ArrayList<>(5);

        //Заповнюємо його
        persons.add(new Person("Дмитро", "Гулак-Травін"));
        persons.add(new Person("Артем", "Гуcак"));
        persons.add(new Person("Галина", "Рудченко"));
        persons.add(new Person("Павло", "Дудар"));
        persons.add(new Person("Артем", "Семиніжка"));

        persons.stream()
                .filter(s -> s.getName().equals("Артем"))//Фільтрація
                .map(s->s.getSurname())//Відображення
                .forEach(s-> System.out.println(s.toUpperCase(Locale.ROOT)));//Перебір
    }
}
