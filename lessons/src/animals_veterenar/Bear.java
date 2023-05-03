package animals_veterenar;

public class Bear extends Animal {
    String bread; //порода

    //Конструктор
    public Bear(String name, String bread) {
        super(name);
        this.bread = bread;
    }

    public void makeNoise() {
        System.out.println("aaarrr");
    }

    public void eat() {
        System.out.println("Beer eating small animals");
    }

    public void getDescription() {
        System.out.println("Это подробное описание медведя");
    }

    @Override
    public String toString() {
        return "Bear{" +
                "bread='" + bread + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
