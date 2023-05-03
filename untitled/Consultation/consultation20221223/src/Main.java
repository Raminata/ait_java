import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird();
        eagle.move();
        Fish nemo = new Fish();
        nemo.move();
        ArrayList<Animal> animals = new ArrayList<>();
        System.out.println(animals.size());
        animals.add(eagle);
        animals.add(nemo);
        System.out.println(animals.size());
        eagle.move();
    }
}