package our.interfaces;

public class Dog implements Runnable, Speakable {
    public void run() {
        System.out.println("Dog runs");
    }
    public void eat() {

    }


    @Override
    public void speak() {

    }
}
