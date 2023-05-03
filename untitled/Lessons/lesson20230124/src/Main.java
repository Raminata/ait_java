import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //метод Math
        //абсолютное значение
        int abs = Math.abs(-10);
        System.out.println(abs);
        int x1 = 10;
        System.out.println(Math.abs(x1));

        //мин число
        int min = Math.min(10, 20);
        System.out.println(min);

        //максм. число
        int max = Math.max(10, 20);
        System.out.println(max);

        //рандомное число
        double random = Math.random();
        System.out.println(random);
        random = Math.random() * 100D;
        System.out.println(random);

        //округлить не целое рандомное число
        double round = Math.round(random);
        System.out.println("rounded random " + round);

        double roundUp = Math.round(24.8);
        double roundDown = Math.round(24.2);
        System.out.println("roundUp is: " + roundUp);
        System.out.println("roundDown is: " + roundDown);

        //возведение в степень
        double power = Math.pow(2,3);
        System.out.println(power);

        //чему равень корень из ...
        double sqrt = Math.sqrt(4);
        System.out.println("square root is " + sqrt);
    }
}