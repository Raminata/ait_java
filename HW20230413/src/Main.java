public class Main {
    /**
     * Написать след-ие лямбды используя интерфайсы
     * 1. конкатинировать (соединить) строки а и b
     * 2. есть строка если ее длина равна 3 вернуть true иначе false
     * 3. есть сторока string, распечатать (вывести на экран)  строку в виде !string!
     */
    public static void main(String[] args) {
        StringConcate connect = ((a, b) -> "" + a + "" + b);
        System.out.println(connect.concat(5, 3));

        Checkable isThree = a -> a.length() == 3;
        System.out.println(isThree.check("hello"));

        Printable exclamation = s -> System.out.println("!" + s + "!");
        exclamation.print("Hello");
    }

}
