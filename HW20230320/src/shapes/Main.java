package shapes;

public class Main {
    public static void main(String[] args) {

        Shape a = new Rectangle(3,4);
        Shape b = new Circle(20);

        System.out.println(a.getName());
        System.out.println("area " + a.getArea());
        System.out.println("perimeter " + a.getPerimeter());
        System.out.println();

        System.out.println(b.getName());
        System.out.println("area " + b.getArea());
        System.out.println("perimeter " + b.getPerimeter());

        /**
         * Rectangle
         * area 12.0
         * perimeter 14.0
         *
         * Circle
         * area 1256.6370614359173
         * perimeter 125.66370614359172
         */
    }
}