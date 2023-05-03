/* Homework
minDigitInArray
     найти минимальное число в массиве
     *нати минимальное число с конца
indexOfMinInArray
     найти индекс минимального числа в массиве
     *найти индекс минимального числа с конца */

public class Homework5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillArray(array, -10, 10);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Arr[" + i + "] = " + array[i]);
        }

        int min = array[0];
        int index=0;
        for (int i = 1; i < array.length; i++) {
            int ninisni = array[i];
            if (ninisni < min) {
                min = ninisni;
                index=i;
            }
        }

//        for (int i = array.length - 1; i >= 0; i--) {
//            int ninisni = array[i];
//            if (ninisni < min) {
//                min = ninisni;
//                index=i;
//            }
//        }
        System.out.println("min Number " + min);
        System.out.println("min Index " + index);

    }

    public static void fillArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            // stavi broj X na poziciju i
            array[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }

}

















