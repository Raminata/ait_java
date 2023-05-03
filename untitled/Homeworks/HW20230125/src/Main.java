public class Main {
    public static void main(String[] args) {
        int symbol = 'A';
        System.out.println("Symbol A is: " + symbol);
        symbol++;
        System.out.println("Symbol A++ is: " + symbol);
        int symbol2 = 'C';
        System.out.println("Symbol C is: " + symbol2);
        int sumOfsymbols = symbol - symbol2;
        System.out.println("Symbols A - C is: " + sumOfsymbols);
        System.out.print("and...\n");
        int sumOfsymbols2 = symbol2 - symbol;
        System.out.println("Symbols A - C is: " + sumOfsymbols2);
    }
}