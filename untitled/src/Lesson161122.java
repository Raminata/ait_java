public class Lesson161122 {
    public static void main(String[] args) {
        // ArrayTools
        //System.out.println("Hello world!");
        int[] arr1 = new int[10];
        printArray(arr1);
        fillArray(arr1, -20, 20);
        printArray(arr1);
        int indexResult = search(arr1, 12);
        System.out.println("Index is " + indexResult);
        int maxDigitInArray = maxDigitInArray(arr1);
        System.out.println("Max digit " + maxDigitInArray);

        int indexOfMax = indexOfMaxInArray(arr1);
        System.out.println("Max index is " + indexOfMax);

    }
    //max Number in Array
    public static int indexOfMaxInArray(int [] array){
        int maxIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > array[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int maxDigitInArray(int [] array){
        int res = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > res){
                res = array [i];
            }
        }
        return res;
    }
    //max Index in Array



    // - пройти по массиву, найти заданное число и вернуть его индекс i
    public static int search(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {  //если текущая ячейка массива равна заданному числа
                return i;          //возвращаем индекс - ячейку в которой лежит это значение
            }
        }
        return -1;
    }

    public static void fillArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Arr [" + i + "]" + "=" + array[i]);
        }
        System.out.println("**********************");
    }
}



