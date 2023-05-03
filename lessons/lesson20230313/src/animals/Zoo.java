package animals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Lion lion = new Lion();
        lion.name = "Lion";
        System.out.println(lion.name);
        lion.animalSound();

        WildDog wildDog = new WildDog();
        wildDog.name = "Dingo";
        System.out.println(wildDog.name);
        wildDog.animalSound();

        Animal animal1 = new Animal();
        animal1.name = "Animal";
        System.out.println(animal1.name);
        animal1.animalSound();

        Animal kingLion = new Lion();
        kingLion.name = "King";
        Animal dingoDog = new WildDog();
        dingoDog.name = "Dingo";
        System.out.print(kingLion.name + " ");
        kingLion.animalSound();
        System.out.println();
        System.out.print(dingoDog.name + " ");
        dingoDog.animalSound();

        Lion lion1 = new Lion();
        //видны только все наследованные методы потому что,они наследуют
        // что имеет Lion
        System.out.println(lion1.name);
        lion1.animalSound();
        lion1.animalSound();
        Animal king1 = new Lion();
        //Animal king1 = new Lion(); у обьекта king1
        //доступны поля и методы класса Animal.
        System.out.println(king1.name);
        king1.animalSound();


        List<Integer> list = new ArrayList<>();
        LinkedList list1 = new LinkedList();
        List<Animal> animals = List.of(animal, kingLion, dingoDog, wildDog);

    }
}
