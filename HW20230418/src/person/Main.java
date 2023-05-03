package person;

import person.Address;
import person.Person;

import java.util.List;
import java.util.stream.Collectors;


/**
 * Задача1
 * Есть класс person.Address с полями
 * String street
 * int houseNumber
 * <p>
 * и класс person.Person с полями
 * String name
 * int age
 * person.Address address
 * <p>
 * Используя стримы, написать метод, принимающий список
 * персонов и возвращающий список адресов тех, кто старше 17 лет.
 * List\<person.Address>getAddresses(List\<person.Person> input)
 */

public class Main {
    public static void main(String[] args) {
        Address a = new Address("Street1", 5);
        Person p = new Person("Jack", 21, a);

        Address a1 = new Address("Street2", 5);
        Person p1 = new Person("John", 17, a1);

        Address a2 = new Address("Street3", 5);
        Person a4 = new Person("Jack", 16, a2);

        List<Person> list = List.of(p, a4, p1);
        List<Address> addresses = getAddresses(list);
        System.out.println(addresses);
    }
    public static List<Address>getAddresses(List<Person> input) {
       return input.stream()
               .filter(p -> p.getAge() > 17)
               .map(p -> p.getAddress())
               .collect(Collectors.toList());

    }
}