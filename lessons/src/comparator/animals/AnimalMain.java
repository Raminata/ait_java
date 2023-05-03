package comparator.animals;

import comparator.books.Author;
import comparator.books.PublishingYearComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AnimalMain {
    public static void main(String[] args) {
        /**
         * Создать класс Animal с полями String name, int weight, String color
         * Используя компораторы, в классе AnimalMain сщхдать и вывести на
         * экран список животных упорядоченный:
         * 1. по названию
         * 2. по весу
         * 3. список названий животных, упорядоченный по возрастанию последней
         * буквы имени [Wolf, Fox, Anaconda, Bear, Elephant] ->
         * Anaconda
         * Wolf
         * Bear
         * Elephant
         * Fox
         */

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Wolf", 80, "White"));
        animals.add(new Animal( "Fox", 30, "Ginger"));
        animals.add(new Animal("Anaconda", 200, "Grey"));
        animals.add(new Animal("Bear", 500, "Braun"));
        animals.add(new Animal("Elephant", 2000, "Grey"));
        System.out.println("Print before sorting:");
        System.out.println(animals);

        System.out.println();

        System.out.println("Sorting by name");
        Collections.sort(animals, new AnimalName());
        System.out.println(animals);

        System.out.println();

        System.out.println("Sorting by weight");
        Collections.sort(animals, new Weight());
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println();

        System.out.println("Sorting by last letter");
        Collections.sort(animals, new LastLetter());
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}
