import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] table = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int[][] table1 = new int[3][];
        table[0] = new int[]{1, 2, 3};
        table[1] = new int[]{2, 5};
        table[2] = new int[]{1, 2, 3, 5};
        int length = table.length;
        System.out.println("Table length " + length);
        System.out.println("Table[1] length " + table[1].length);

        //for-each two dimension arrays
        int sum = 0;
        for (int[] x : table) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("sum of all elements is " + sum);

        /* Написать метод, который проверяет есть ли заказаная машина в салоне.
        пример:String [] salon =
        {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};  */
        /*
        1. Создать метод public static void findCar (String[]cars, String
        carToFind)
        2. результат работы метода вывести на экран: carToFind is found or
        not found
        3. Алгоритм работы:
        завести переменную хранящую длину массива
        в цикле for сравнивать(через if) каждый элемент массива с машиной,
        которую ищем, если нашли выводим на экран соответствующее уведомление
        volvo == mazda
        volvo.equals
        */
        String[] salon = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter car type >> ");
       // findCar( "opel");
        Random random = new Random();

        //   int x = random.nextInt(30);
        //  int y =  random.nextInt(100);


        // System.out.println("random 30 " +random.nextInt(30));
        // System.out.println("random 100 " + y);
    }

    public static void findCar(String[] cars, String carToFind) {
        Random random = new Random();

        int length = cars.length;

        for (int i = 0; i < length; i++) {

            if (cars[i].equalsIgnoreCase(carToFind)) {
                System.out.println("this car is available");
                return;
            }

        }
        int index = random.nextInt(cars.length);
        System.out.println("this car is not available. Take " + cars[index]);


        //   for(String car: cars)
        //

    }
}


