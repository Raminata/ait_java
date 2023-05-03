package stringBuilder_demo;

public class Demo {
    public static void main(String[] args) {
        //spead test
        long startTime = System.currentTimeMillis();
        concatString();
        System.out.println("Time taken by concatings with Strings " + (System.currentTimeMillis() - startTime + " ms"));

        long startTime1 = System.currentTimeMillis();
        concatStringBuilder();
        System.out.println("Time taken by concat with StringBuilder " + (System.currentTimeMillis() - startTime1 + " ms"));

        //hashcode test
        System.out.println("Hashcode test for String");
        String str = "Java";
        System.out.println(str.hashCode());
        str = str + "Hello";
        System.out.println(str.hashCode());

        System.out.println("Hashcode test for StringBuilder");
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.hashCode());
        sb.append(" Hello");
        System.out.println(sb.hashCode());
    }

    public static String concatString() {
        String str = "Hello";
        for (int i = 0; i < 10000; i++) {
            str = str + " World";
        }
        return str;
    }

    public static String concatStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            sb.append("world");
        }
        return sb.toString();
    }



}
