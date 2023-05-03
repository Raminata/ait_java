package shapes;

public class Circle implements Shape {
    private double r;
    private String name = "Circle";

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * r;
    }

    @Override
    public double getArea() {
        return (r * r) * Math.PI;
    }

}
