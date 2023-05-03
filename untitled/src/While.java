public class While {
    public static void main(String[] args) {
        int a = 12;
        System.out.println("___________________");
        // мы бы хотели повторить три раза
        int i = 0;
        while (i < 10) { // если условие (предикат) истинно - выполняй код ниже
            System.out.println("Iteration number: " + i);
            System.out.println(a);
            i++; // инкремент
            // сюда мы пишем то, что хотим повторить
        }
        System.out.println("__________________");
        int j = 1; // пять раз вывел в консоль "Hi"
        while (j < 6) {
            System.out.println("Hi " + j);
            j++;
        }
        System.out.println("__________________");
        int z = 10;
        while (z >= 0) {
            System.out.println("z " + z);
            z--;
        }


    }
}
        /*
        синтаксический сахар
        a = a + 1  --> a += 1
        a = a + 2  --> a += 2
        a = a - 1  --> a -= 1
        a = a * 2  --> a *= 2
        a = a / 2  --> a /= 2
        b = b + "hehe" --> b +="hehe"
         */

