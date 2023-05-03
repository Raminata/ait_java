public class Main {
    public static void main(String[] args) {
        /**
         * Перевести в десятичную систему:
         * 0100 = 4
         * 1001 = 9
         * 1110 = 14
         * 1000 = 8
         * 1000110111 = 567
         */
        String a = "0100";
        System.out.println(Integer.parseInt(a, 2));
        String b = "1001";
        System.out.println(Integer.parseInt(b, 2));
        String c = "1110";
        System.out.println(Integer.parseInt(c, 2));
        String d = "1000";
        System.out.println(Integer.parseInt(d, 2));
        String e = "1000110111";
        System.out.println(Integer.parseInt(e, 2));

        System.out.println("-------------------------------");
        /**
         * Перевести в двоичную систему:
         * 100 = 1100100
         * 35 = 100011
         * 6 = 480
         */
        int binNumber = 100;
        System.out.println(Integer.toBinaryString(binNumber));
        int binNumber1 = 35;
        System.out.println(Integer.toBinaryString(binNumber1));
        int binNumber2 = 6;
        System.out.println(Integer.toBinaryString(binNumber2));

        System.out.println(400 + 0120);


    }
}