package practice;

import com.sun.source.tree.BreakTree;

public class Rectangle {
    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    //A=a*b
    //U=2(a+b)
    public int rectangleArea() {
        // Площадь прямоугольника = длина*ширина
        // Периметр = 2*(длина + ширина)

        int area = length * width;
        return area;
    }
    public int rectanglePerimeter() {
        int perimeter = 2 * (length + width);
        return perimeter;
    }

}
