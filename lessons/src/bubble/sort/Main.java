package bubble.sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]ints= {6,1,9,0,-3,456,345};
        System.out.println(Arrays.toString(ints));
        bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }
    /**
     * Сортировка пузырьком (Bubble sort)
     * -Алгоритм проссматривает массив и сравнивает каждую пару соседних элементов
     * Когда встречаются пара, расположеная не по порядку, происходит замена двух
     * элементов местами
     * 1й проход
     * 6 3 0 5 -> 3 6 0 5 -> 3 0 5 6
     * 2й проход
     * 3 0 5 6 -> 0 3 5 6
     * 3й проход
     * нужен для того чтобы удостоверится что все отсотировано и нужно останавливаться
     */
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        //3 0 5 6
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {//i=0
                if (array[i] > array[i + 1]) {//6>3
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
