public class Main {
    public static void main(String[] args) {
        int productA = 1000;
        int productB = 500;
        int products = productA + productB;
        int discount = 100;
        int productsWithDiscount = products - discount;
        //System.out.println(productsWithDiscount);

        /*задача 2
        Написать программу конвертирующую температуру из градусов
        фаренгейта в градусы цельсия
        С = (°F − 32) × 5/9 */
        double pi = 3.14;
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        //System.out.println("for radius of " + radius + " Perimeter is " + perimeter + " and Area is " + area);

        /* задача 3
         */
        double farenheit = 35;
        double celsius = (farenheit - 32) * 5/9.0;
        // System.out.println(celsius);

        /*задача 4
        В банкомате есть банкноты 1,5,10 долларов. Посчитать минимальное кол-во банкнот
        необходимых для выдачи суммы денег n */
        int sum = 23;

        int dollar10 = sum / 10;
        int sumB = sum % 10;
        int dollar5 = sumB / 5;
        int sumC =  sumB % 5;

        System.out.println("Dollar 10 noti: " + dollar10);
        System.out.println("Dollar 5 noti: " + dollar5);
        System.out.println("Dollar 1 noti: " + sumC);


    }
}