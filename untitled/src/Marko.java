public class Marko {
    public static void main(String[] args) {

        int index = 11;

        if (index <= 10){
            System.out.println("hey");
        }

        do {
            System.out.println(index);
            index++;
            // index = index + 1;
        } while (index <= 10);

        while (index <= 12){
            System.out.println("bok");
            break;
        }
    }
}