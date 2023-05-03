public class Homework09_11_22 {
    public static void main(String[] args) {
        int z = 10;
        while (z >= 1) {
            System.out.println(z);
            z--;
            if(z == 0){
                System.out.println("Boom!");
            } else if (z == 3) {
                System.out.println("Get ready!");
            }
        }

        // модифицировать этот цикл
        // когда доходит до нуля - вместо нуля выводит "Boom!"
        // когда он до трех - он выводит тройку и "Get ready!"
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

