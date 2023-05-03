package geometric.figures;

public class Rectangle extends Figures {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    protected String getName() {
        return "Rectangle";
    }

}
