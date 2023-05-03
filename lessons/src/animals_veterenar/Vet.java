package animals_veterenar;

public class Vet {
    String name;

    public Vet(String name) {
        this.name = name;
    }

    public void treatAnimal(Animal animal) {
        System.out.println(animal.name);
        animal.getDescription();
    }
}
