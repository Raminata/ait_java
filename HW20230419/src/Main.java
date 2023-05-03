import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Задача1
 * Есть класс Person с полями
 * String name
 * int age
 * String address
 * <p>
 * Используя стримы, написать метод, принимающий список персонов и
 * возвращающий мапу, где возраст является ключом, а список персонов этого
 * возраста значением
 * <p>
 * Задача2
 * Используя тот же класс Person, написать метод, принимающий список
 * персонов и возвращающий общий возраст тех, кто старше 17 лет.
 * <p>
 * Задача 3
 * Написать метод, принимающий список персонов и возвращающий имена тех,
 * кто является совершеннолетним в Германии (старше 18 лет).
 * Должна быть возвращена примерно следующая строка:
 * in Germany Jack and John are of legal age
 * (имена по вашему выбору, это пример)
 */

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Marko", 30, "Address 1");
        Person b = new Person("Darko", 17, "Address 2");
        Person c = new Person("Zarko", 25, "Address 3");
        Person d = new Person("Raminata", 38, "Address 4");
        Person e = new Person("Marija", 17, "Address 5");
        Person f = new Person("Durdatka", 54, "Address 6");

        List<Person> personList = List.of(a, b, c, d, e, f);

        Map<Integer, List<Person>> ageGroup = groupByAge(personList);
        System.out.println(ageGroup);

        Integer totalAgeOfAdults = getTotalAgeOfAdults(personList);
        System.out.println(totalAgeOfAdults);

        String result = getNamesOfLegalAge(personList);
        System.out.println(result);
    }

    public static Map<Integer, List<Person>> groupByAge(List<Person> personList) {
        return personList
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }

    public static Integer getTotalAgeOfAdults(List<Person> personList) {
        return personList
                .stream()
                .filter(p -> p.getAge() > 17)
                .collect(Collectors.summingInt(Person::getAge));
    }


    public static String getNamesOfLegalAge(List<Person> personList) {
        List<String> names = personList
                .stream()
                .filter(p -> p.getAge() > 17)
                .map(p -> p.getName())
                .collect(Collectors.toList());

        StringBuilder peopleNames = new StringBuilder();
        for(String s : names){
            peopleNames.append(s).append(" ");
        }

        return "in Germany " + peopleNames + "are of legal age";
    }

}