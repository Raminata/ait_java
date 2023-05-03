package geometric.figures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        Square square = new Square(5);
        Circle circle = new Circle(12);

        List<Shape> shapes = List.of(rectangle, square, circle);

        for (Shape s : shapes) {
            System.out.println(s.getName() + " has area of " + s.getArea());
        }

        // Homework 2023-03-21
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Square(1));
        shapeList.add(new Square(3));
        shapeList.add(new Square(5));
        shapeList.add(new Square(2));
        shapeList.add(new Square(7));
        shapeList.add(new Square(12));
        shapeList.add(new Circle(2));
        shapeList.add(new Square(3));
        shapeList.add(new Circle(4));
        shapeList.add(new Square(2));
        shapeList.add(new Circle(3));
        shapeList.add(new Square(5));
        shapeList.add(new Circle(6));
        shapeList.add(new Square(2));
        shapeList.add(new Circle(5));
        shapeList.add(new Square(5));
        shapeList.add(new Circle(6));
        shapeList.add(new Square(8));
        shapeList.add(new Circle(3));
        shapeList.add(new Square(1));
        shapeList.add(new Square(2));
        shapeList.add(new Square(4));
        shapeList.add(new Square(5));
        shapeList.add(new Square(6));

        Collections.sort(shapeList);

        for (Shape s : shapeList) {
            System.out.println(s.getArea());
        }
    }
}