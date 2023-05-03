package shapes;

public class Rectangle implements Shape {
    private String name = "Rectangle";
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPerimeter() {
        return (2 * a) + (2 * b);
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
