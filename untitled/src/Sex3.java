
public class Sex3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int n = 10;

        for (int i = 0; i < n; i++) {
            int x = 0;
            for (int j = 0; j <= i; j++) {
                x = x + ((int) Math.pow(2, j)) * b;
            }
            int res = a + x;
            System.out.print(res + " ");
        }


        // 8 14 26 50 98
    }

}
