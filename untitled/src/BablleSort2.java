import java.util.Scanner;

public class BablleSort2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rabotniki > ");
        int rabotniki = input.nextInt();

        int[] zaplata = new int[rabotniki];
        for (int i = 0; i < zaplata.length; i++) {
            System.out.println("Zaplata [" + i + "] > ");
            int zap = input.nextInt();
            zaplata[i] = zap;
        }

        int sum = 0;
        for (int i = 0; i < zaplata.length; i++) {
            sum += zaplata[i];
        }
        System.out.println("summa " + sum);


    }
}






