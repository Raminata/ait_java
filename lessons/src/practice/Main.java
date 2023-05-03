package practice;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6,8);
        System.out.println("if rectangle length is: " + rectangle.getLength());
        System.out.println("and if rectangle width is: " + rectangle.getWidth());
        System.out.println("than the area of rectangle will: " + rectangle.rectangleArea());
        System.out.println("and the perimeter of rectangle is: " + rectangle.rectanglePerimeter());

        Rectangle rectangle1 = new Rectangle(3,5);
        System.out.println("if rectangle1 length is: " + rectangle1.getLength());
        System.out.println("and if rectangle1 width is: " + rectangle1.getWidth());
        System.out.println("than the area of rectangle will: " + rectangle1.rectangleArea());
        System.out.println("and the perimeter of rectangle is: " + rectangle1.rectanglePerimeter());
    }
}
