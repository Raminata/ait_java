package stringbuilders;

public class Main {
    //StringBuilder class - в отличие от класса String создает изменяемый string
    /**
     * конструкторы
     * StringBuilder() - пустая стрингБилдер
     * StringBuilder(String str) - стрингБилдер со строкой str
     * StringBuilder(int length) - пустой, но с определенной длинной
     */
    public static void main(String[] args) {
        //append method - добавить
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder);
        stringBuilder.append(" World");
        System.out.println(stringBuilder);
        //insert() - вставлять
        stringBuilder.insert(1,"Java");
        System.out.println(stringBuilder);
        //replace - заменять
        stringBuilder.replace(1,3, "Algorithm");
        System.out.println(stringBuilder);
        //reverse - в обратную сторону (from "Hello" to "olleH")
        StringBuilder sb = new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);
    }
}
