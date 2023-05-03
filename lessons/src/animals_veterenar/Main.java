package animals_veterenar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animals & doctor");
        Cat cat1 = new Cat("Cat", "Britige");
        cat1.makeNoise();
        cat1.eat();
        cat1.getDescription();

        Dog dog1 = new Dog("Dog", "Labrador");
        dog1.makeNoise();
        dog1.eat();
        dog1.getDescription();

        Bear bear1 = new Bear("Bear", "Greezle");
        bear1.makeNoise();
        bear1.eat();
        bear1.getDescription();

        Vet vet1 = new Vet("John");
        System.out.println();
        System.out.println("На прием пришла: ");
        vet1.treatAnimal(cat1);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat1);
        animalList.add(dog1);
        animalList.add(bear1);
        System.out.println(animalList);

        Scanner sc = new Scanner(System.in);
        String choice = "";
        int i = 0;

//        vet1.treatAnimal((Animal) animals.get(0));
//        vet1.treatAnimal((Animal) animals.get(1));

        while (true) {
            if (i < 3) {
                vet1.treatAnimal((Animal) animalList.get(i));
                i++;
            } else {
                System.out.println("Очередь из зверей закончилась.");
                break;
            }
            System.out.println("Следующий? y/n ");
            choice = String.valueOf(sc.nextLine());
            if (choice == "n") {
                break;
            }
        }

    }
}
