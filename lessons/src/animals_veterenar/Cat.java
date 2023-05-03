package animals_veterenar;

public class Cat extends Animal {
    String bread;

    public Cat(String name, String bread) {
        super(name);
        this.bread = bread;
    }

    public void makeNoise() {
        System.out.println("Mew - mew...");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    public void getDescription() {
        System.out.println("Description of cats");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "bread='" + bread + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
