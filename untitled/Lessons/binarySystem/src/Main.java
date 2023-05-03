public class Main {
    public static void main(String[] args) {
        //1582 -> 1000 + 500 + 80 + 2
        //432 -> 400 + 30 + 2 -> 4 * 10 + 3 * 10 + 2 * 1 -> 4 * 10^2 + 3 * 10^1 + 2 * 10^0
        String hundred = "100";
        System.out.println(hundred + 1);
        System.out.println(Integer.parseInt(hundred));
        int hundredNumber = Integer.parseInt(hundred);
        System.out.println(hundredNumber + 1);
        System.out.println(Integer.parseInt("100", 8));
        System.out.println(Integer.parseInt("100", 16));
        System.out.println(Integer.parseInt("100", 2));

        //перевод из десятичной 8, 16, и 2
        System.out.println(Integer.toOctalString(64));
        System.out.println(Integer.toHexString(256));
        System.out.println(Integer.toBinaryString(4));

        //запись двоичного, 8 и 16-ричных чисел в джаве
        int binary = 0b1100;
        int oct = 011;
        int hex = 0xff;

    }
}