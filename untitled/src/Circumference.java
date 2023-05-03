public class Circumference {
    public static void main(String[] args) {
        double radius = 35/2;
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("Длины окружности равна: " + circumference);
    }

}
