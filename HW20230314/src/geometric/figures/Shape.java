package geometric.figures;

public class Shape implements Comparable<Shape> {
    protected double getArea() {
        return 0;
    }

    protected String getName() {
        return "Shape";
    }

    @Override
    public int compareTo(Shape o) {
        // if this shape is SMALLER put it after (later in the list)
        if (getArea() < o.getArea()) {
            return -1;
        }

        // this shape is BIGGER than put it before
        else if (getArea() > o.getArea()){
            return 1;
        }

        // they are the same
        return 0;
    }
}
