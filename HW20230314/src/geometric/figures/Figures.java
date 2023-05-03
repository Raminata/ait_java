package geometric.figures;

public class Figures extends Shape {
    private double length;
    private double width;

    public Figures(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    protected double getArea() {
        return length * width;
    }

    @Override
    protected String getName() {
        return "Figure";
    }
}
