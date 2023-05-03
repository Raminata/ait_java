package cars;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("VW", "Black", 2016);
        System.out.println("Model: " + car.model);
        System.out.println("Color: " + car.color);
        System.out.println("Production of date: " + car.productionDate);
        car.drive();
        car.stop();
        System.out.println();
        PassengerCar passengerCar = new PassengerCar("Audi", "White", 2018, 5);
        System.out.println("Model: " + passengerCar.model);
        System.out.println("Color: " + passengerCar.color);
        System.out.println("Production of date: " + passengerCar.productionDate);
        System.out.println("Number of seats: " + passengerCar.numberOfSeats);
        car.drive();
        car.stop();
        System.out.println();
        Track track = new Track("Audi", "black", 2020, 2);
        System.out.println("Model: " + track.model);
        System.out.println("Color: " + track.color);
        System.out.println("Production of date: " + track.productionDate);
        System.out.println("Load capacity: " + track.loadCapacity);
        car.drive();
        car.stop();

    }
}