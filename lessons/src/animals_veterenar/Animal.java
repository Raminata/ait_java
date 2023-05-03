package animals_veterenar;

public abstract class Animal {
    String name;

    public void makeNoise() {

    }

    public void eat() {

    }

    public void getDescription() {

    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //constructor
    public Animal(String name) {
        this.name = name;
    }
}
