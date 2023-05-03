package cars;

public class PassengerCar extends Car {
    int numberOfSeats;

    public PassengerCar(String model, String color, int productionDate, int numberOfSeats) {
        super(model, color, productionDate);
        this.numberOfSeats = numberOfSeats;
    }
}
