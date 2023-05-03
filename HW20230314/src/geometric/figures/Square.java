package geometric.figures;

public class Square extends Figures {
    public Square(double length) {
        super(length, length);
    }

    protected String getName() {
        return "Square";
    }
}
