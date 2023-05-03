package max.element;

/**
 * Создать класс MaxElementInArray, содержащий метод, который находит
 * максимальный элемент массива и возвращает его:
 * <p>
 * 1. создать класс MaxElementInArray, содержащую имя массива (private int[] ints)
 * 2. Создать конструктор , принимающий массив
 * public MaxElementInArray(int[] ints ){ this.ints = ints;}
 * 3. Написать метод, находящий максимальный элемент массива
 * 4. В классе Main: создать массив целых чисел, cоздать обьект (экземпляр)
 * класса MaxElementInArray для этого массива и вывести на экран значение
 * максимального элемента этого массива
 */
public class MaxElementArray {
    private int[] ints;

    public MaxElementArray(int[] ints) {
        this.ints = ints;
    }

    public int getMax() {
        int max = ints[0];
        for (int i : ints) {
            max = Math.max(max, i);
        }
        return max;
    }
}
