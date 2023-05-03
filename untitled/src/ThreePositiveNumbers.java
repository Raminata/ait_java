public class ThreePositiveNumbers {
    public static void main(String[] args) {
        int a = 12;
        int b = -7;
        int c = 20;
        int result = threePositive(a, b, c);
        System.out.println(result);
        // нужно написать метод, который принимает три числа любых
        // метод считает, сколько из этих чисело положительные и
        // и возращает число(количество) положительных чисел
    }

    // здесь напишите этот метод
    public static int threePositive(int a, int b, int c) {
        int posNum = 0;
        if (a > 0) {
            System.out.println("Positive numbers " + a);
            posNum++;
        }
        if (b > 0) {
            System.out.println("Positive numbers " + b);
            posNum++;
        }
        if (c > 0) {
            System.out.println("Positive numbers" + c);
            posNum++;
        }
        return posNum;
    }

}

