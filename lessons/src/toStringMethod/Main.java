package toStringMethod;

public class Main {
    //Method toString
    /**
     * Method toString яв-ся методом класса Object (класс Object яв-ся род-им
     * классом всех обьектов в Java, super class
     * Метод toString возвр-ет строковое представление обьекта и при выводе
     * обьекта на печпть метод toString не явно вызывается компелятором Java,
     * но возвр-ет в большенстве случает не устраивающее нас представление
     * обьекта
     */
    public static void main(String[] args) {
        Object object = new Object();

        Student jack = new Student(5, "Jack", "Berlin");
        Student jill = new Student(1, "Jill", "Bonn");
        System.out.println(jack);
        System.out.println(jill);
    }

}
