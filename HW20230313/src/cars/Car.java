package cars;

/**
 * Создать класс cars.Car, содержащий поля
 * model
 * colour
 * productionDate
 * а также конструктор и методы drive и stop.
 * Создать дочерние классы cars.PassengerCar и cars.Track. Класс cars.PassengerCar должен
 * также содержать поле numberOfSeats(количество мест) а Класс cars.Track поле
 * loadCapacity (грузоподьемность).
 * В методе main класса cars.Main создать несколько обьектов этих классов и вывести
 * в консоль их характеристики и результат работы методов
 */

public class Car {
    String model;
    String color;
    int productionDate;

    public Car(String model, String color, int productionDate) {
        this.model = model;
        this.color = color;
        this.productionDate = productionDate;
    }

    void drive() {
        System.out.println("Drive");
    }

    void stop() {
        System.out.println("Stop");
    }

}
