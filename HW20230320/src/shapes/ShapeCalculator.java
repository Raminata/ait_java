package shapes;

import java.util.List;

public class ShapeCalculator {

    public static double totalSquare(List<Shape> shapes) {
        double result = 0;
        for (Shape s : shapes) {
            result += s.getArea();
        }
        return result;
    }

}
