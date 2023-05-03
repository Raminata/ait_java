public class Main {
    public static void main(String[] args) {
        /**
         * Задача 1
         * Создать класс Student c полями (переменными) имя и номер.
         * Создать несколько обьектов этого класса
         */

        Student first = new Student();
        first.name = "Marko";
        first.number = 1;
        System.out.println("Name of student: " + first.name + " #" + first.number);

        Student second = new Student();
        second.name = "Daniel";
        second.number = 2;
        System.out.println("Name: " + second.name + " #" + second.number);

        /**
         * Задача 2
         * Добавить в класс Student конструктор с параметрами имя и номер.
         * Создать еще несколько обьектов класса с использованием этого конструктора
         */
        //Constructor
        Student a = new Student("John", 1);
        System.out.println("Name of student: " + a.name + " #" + a.number);

        Student b = new Student("Mike", 2);
        System.out.println("Name of student: " + b.name + " #" + b.number);


    }
}