package oop_getters_setters;

public class Main {
    public static void main(String[] args) {
        Person bill = new Person("Bill", 40, 80);
        System.out.println(bill.getName() + "'s parameters are:");
        System.out.println("age: " + bill.getAge());
        System.out.println("weight: " + bill.getWeight());
        System.out.println("Height: " + bill.getHeight());

        bill.setAge(-100);
        bill.setHeight(-0);
        bill.setWeight(0);
        System.out.println(bill.getName() + "'s parameters are:");
        System.out.println("age: " + bill.getAge());
        System.out.println("weight: " + bill.getWeight());
        System.out.println("Height: " + bill.getHeight());

        bill.setAge(45);
        bill.setWeight(70);
        bill.setHeight(175);

        System.out.println(bill.getName() + "'s parameters are:");
        System.out.println("age:" + bill.getAge());
        System.out.println("weight:" + bill.getWeight());
        System.out.println("height:" + bill.getHeight());

        /*
        John's parameters are:
age:45
weight:70
height:175

         */
        bill.setAge(-10);
        bill.setHeight(3);
        bill.setWeight(1);

        System.out.println(bill.getName() + "'s parameters are:");
        System.out.println("age:" + bill.getAge());
        System.out.println("weight:" + bill.getWeight());
        System.out.println("height:" + bill.getHeight());


        Person nick = new Person();
        System.out.println(nick.getName() + "'s parameters are:");
        System.out.println("age:" + nick.getAge());
        System.out.println("weight:" + nick.getWeight());
        System.out.println("height:" + nick.getHeight());

        Employee employee = new Employee("Andrew", 1200);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        employee.setSalary(2400);
        employee.setSalary(0);
        System.out.println(employee.getSalary());

        bill.move();
        bill.askName();
    }
    //Getters and setters
    /**
     * Геттеры и сетеры это методы, которые используются для защиты данных.
     * Геттер возвращает значение поля. Название геттера начинается со слова get
     * за которым следует имя переменной, значение которой он возвращает.
     *
     * Сеттер присваивает переменной новое значение. Сеттер начинается со
     * слова set, за которым следует название переменной, значение которой
     * он меняет.
     */
}
