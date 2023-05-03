package oop_continue;

public class Main {
    Person person = new Person("John", 23);
    Person personVoid = new Person();

    public static void main(String[] args) {
        //Типы конструкторов
        /*1. Default Constructor конструктор по умолчанию, вставляется в код
        компилятором в процессе компиляции
        2. no-args constructor - конструктор без аргументовю public Person() {}
        parameterized constructor - конструктор с аргументами */
        //Поля класса инициализируются по умолчаниюю Обекты инициализируются null
        //а примитивные типы каждый значениями своего типа, в частности int 0,
        // boolean false
        Person personVoid = new Person();
        System.out.println("Person's name is " + personVoid.name);
        System.out.println("Person's age is " + personVoid.age);
        System.out.println("Person's is present is " + personVoid.isPresent);

        Person john = new Person("John", 23);
        john.move();

        Person bill = new Person("Bill", 60);
        bill.move();

        john.askName();
        System.out.println(john.letter);

        john.age = -34;
        System.out.println("Jon's age " + john.age);
        john.height = 0;
        john.weight = -12365;


    }
}