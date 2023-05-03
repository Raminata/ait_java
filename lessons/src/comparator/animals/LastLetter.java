package comparator.animals;

import java.util.Comparator;

public class LastLetter implements Comparator<Animal> {
    public int compare(Animal animal1, Animal animal2) {
        String animalName1 = animal1.getName();
        String animalName2 = animal1.getName();
        return animalName1.charAt(animalName1.length() - 1) - animalName2.charAt(animalName2.length() - 1);
        //Character.compare()
    }
}
