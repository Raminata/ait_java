package algorithms;

public class Main {
    public static void main(String[] args) {
        drawTriangle(6);
        int n = 100;
        // for (int i = 0; i < n; i++) {
        // drawTriangle(6);
    }


    public int max(int[] ints, int n) {
        int max = ints[0];
        //еще до запуска цикла происходить его инициализация i=1, i<n  +2операции
        for (int i = 1; i < n; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        return max;
    }

    public boolean linSearch(int[] arr, int elementToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind)
                return true;
        }
        return false;
    }

    public int sum(int a, int b) {
        int res = a + b;
        return res;
    }

    public static void drawTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    //f(n) = n^2
}
