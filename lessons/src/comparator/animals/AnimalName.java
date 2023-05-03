package comparator.animals;

import java.util.Comparator;

public class AnimalName implements Comparator<Animal> {
    public int compare(Animal a1, Animal a2) {

        return a1.name.compareTo(a2.name);
    }
}
