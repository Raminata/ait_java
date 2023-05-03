import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "There";
        String substr1 = str1.substring(1);
        String substr2 = str2.substring(1);
        String result = substr1 + substr2;
        System.out.println(result);
        // length
        int length = str1.length();
        System.out.println("First character: " + str1.charAt(0));
        System.out.println("Last character: " + str1.charAt(length - 1));

        //substring
        //Hello
        System.out.println(str1.substring(1, 4));

        //метод printf
        //Rules start with %
        System.out.printf("Hello %s!%n", "World");
        //в общем виде:
        //%[flags] [width]-ширина [.precision]- conversuion characters точность
        //основные символы:
        //s - форматирует строки
        //d - форматирует целые числа
        //f - форматирует числа с запятой
        //e - научное представление числа
        //t - форматирует дату время

        //форматирование строк с помощью %s
        //System.out.println("hello%nworld");
        System.out.printf("'%s'%n", "Hello");
        System.out.printf("'%S'%n", "Hello");
        //форматирование строк с использованием [width] - ширина
        System.out.printf("'%-15s' %n", "Hello");
        //[.precision]
        System.out.printf("%5.2s", "Hello");
        System.out.printf("%5.2s%n", "Hello");

        //char formatting
        System.out.printf("%c%n", 'a');
        System.out.printf("%C%n", 'a');

        //Number formatting
        //Integer formatting: %d
        System.out.printf("integer: %d%n", 1000);
        System.out.printf(Locale.US, "%,d %n", 10000);
        System.out.printf(Locale.GERMANY, "%,d %n", 10000);

        //float and double formatting %f
        System.out.printf("%f%n", 5.9876);
        //with precision (с округлением)
        System.out.printf("'%5.2f'%n", 5.9876);

        //scientific %e - научное представление числа
        System.out.printf("'%5.2e'%n", 5.9876);

        String name = "Evgeny";
        String b = "asdf";
        String name1 = new String("Evgeny");
        boolean equals = name.equals(name1);
        System.out.println("comparison with equals: " + equals);
        System.out.println("comparison with ==: " + (name == name1));

        //equals
        String string = "Hello";
        String string1 = "hello";
        System.out.println(string.equals(string1));
        System.out.println(string.equalsIgnoreCase(string1));

        //toUpperCase() method
        String string2 = new String("this is a new string");
        System.out.println("we convert all letters in the string to upper case: " + string2.toUpperCase());
        String string3 = new String("ThIs iS a New striNg");
        System.out.println(string3.toUpperCase());

        //toLowerCase() method
        string3 = new String("ThIs iS a New striNg");
        System.out.println("to lower case: " + string3.toLowerCase());

        //startsWith() - метод проверяет начинается ли строка с указанного
        //префикча - если да -- возращает true
        //- если нет -- false
        String string4 = "Hello";
        boolean startsWith = string4.startsWith("He");
        System.out.println("the word " + string4 + " starts with: " + startsWith);

        startsWith = string4.startsWith("Pe");
        System.out.println("the word " + string4 + " starts with: " + startsWith);

        //valueOf()
        int number = 99;
        //int test = String.valueOf(number);
        String test = String.valueOf(number);
        System.out.println(test);

        //indexOf() - находит индекс первого вхождения заданного символа в строке
        String string5 = "this is a string";
        System.out.println("Index of h in the string is: " + string5.indexOf('h'));
        System.out.println("Index of s in the string is: " + string5.indexOf('s'));
        System.out.println("Index of z in the string is: " + string5.indexOf('z'));
        System.out.println("Index of 'is' in the string is: " + string5.indexOf("is"));
        System.out.println("Index of h in the string is: " + string5.indexOf(" is "));

        int index = string5.indexOf('s');

    }
}