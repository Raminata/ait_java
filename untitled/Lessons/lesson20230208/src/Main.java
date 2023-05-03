public class Main {
    public static void main(String[] args) {
        //continue with label
        outerloop:
        for (int i = 1; i < 10; i++) {
            //System.out.print("\nOut loop pass " + i + ", inner loop: ");
            for (int j = 0; j < 10; j++) {
                if (j == 5) continue outerloop;
                // System.out.print(j);
            }
        }
        //Arrays
        //type[] array-name = new type[size]
        int[] number = new int[10];
        number[0] = 23;
        number[1] = 2;
        for (int i = 2; i < 10; i++) {
            number[i] = i;
        }
        System.out.println("number [0] = " + number[0]);
        System.out.println("number [5] = " + number[5]);

        String[] strings = new String[4];
        strings[0] = "Apple";
        strings[1] = "Orange";
        strings[2] = "Pineapple";
        strings[3] = "Banana";
        System.out.println("strings[1] is " + strings[1]);

        //String[] names = new String[] {};
        String[] names = {"Raminata", "Marko", "Umita", "Bola"};
        int length = names.length;
        System.out.println("Length of 'names' array is: " + length);
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "]:" + names[i]);
        }
        names[0] = "John";
        //ArrayIndexOutOfException
        //System.out.println(names[10]);
        for (int i = 0; i < names.length; i++) {
            //    System.out.println(names[i]);
        }
        String[] newNames = new String[names.length + 2];
        for (int index = 0; index < newNames.length; index++) {
            newNames[index] = names[index];
        }
        newNames[newNames.length - 2] = "Evgeny";
        newNames[newNames.length - 1] = "Dmitry";
        System.out.println();
        System.out.println("Array 'newNames' after adding names");
        for (int i = 0; i < newNames.length; i++) {
            System.out.println("newNames[" + i + "]: " + newNames[i]);
        }
        names = newNames;
        for (int i = 0; i < names.length; i++) {
            System.out.println("names [" + i + "]: " + names[i]);
        }
        // Find max of the array
        int[] ints = {7, 2, 9, 0, 5};

        int max = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        System.out.println("Max element is " + max);

        // Find min element
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        System.out.println("Min elt is " + min);

        //Find sum of array elements

        //  int[] arr ={1,0,2,3,5,1};
        int[] arr = {1, 0, 2, 3, 5};

        int sum = 0;

        for (int index = 0; index < arr.length; index++) {
            sum = sum + arr[index];
        }
        System.out.println("Sum of all array elements is " + sum);

        double average = (double) sum / arr.length;
        System.out.println(average);

    }

    /*Написать метод, выводящий на экран все четные числа в диапазоне от 1
      до 10 с использованием цикла for и оператора continue  */
    public static void printEven() {
        for (int i = 0; i <= 10; i++) {

            if ((i % 2) != 0) continue;

            System.out.println(i);

        }
    }
}



