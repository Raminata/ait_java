package cars;

public class Track extends Car {
    double loadCapacity;

    public Track(String model, String color, int productionDate, double loadCapacity) {
        super(model, color, productionDate);
        this.loadCapacity = loadCapacity;
    }
}
