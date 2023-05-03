package algorithms;

public class Algorithm {
    public static void main(String[] args) {
        /**
         * f(x) = x + 1;
         * y = x + 1
         * f(x) = x^2 + x + 4
         *
         * Логарифмы
         * 2^x = 1024
         * 2^10 = 1024
         * 10 - это логарифм 1024
         * log(1024) = 10
         * логарифм 1024 - это та степень, в которую надо возвести двойку чтобы
         * получить 1024
         *
         * log(64)
         * 2^x = 64 = 2^6
         *
         * Types of algorithm
         * 1. Brute Force - наиболее простой, лобовой подход решения(медленный)
         * 2. Recursive Algorithm - рекурсия процесс вызова методом самого себя
         * (копии с дрегими значениями)
         * 3. Backtracking -
         * 4. Searching algorithms - алгоритмы поиска предназначены для проверки
         * элемента или извлечения элемента из любой структуры данных, в которой
         * он хранится
         * Linear search - линейный поиск
         *
         */
        int[] ints = {1,3,6,8,9,14,28,32};
        System.out.println(binarySearch(1, ints));
        System.out.println(binarySearch(3, ints));
        System.out.println(binarySearch(6, ints));
        System.out.println(binarySearch(8, ints));
        System.out.println(binarySearch(9, ints));
        System.out.println(binarySearch(14, ints));
        System.out.println(binarySearch(28, ints));
        System.out.println(binarySearch(32, ints));
        System.out.println(binarySearch(47, ints));

    }

    public static int linearSearch(int[] arr, int element) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == element) {
                return index;
            }
        }
        return -1;
    }

    /**
     * Binary search -
     * Interval search -
     * <p>
     * 5. Sorting Algorithms - алгоритмы сортировки
     * сортируют данные по возраствнию или убыванию
     * 6. Hashing Algorithms - алгоритмы хеширования
     * 7. Divide and Conquer Algorithm - алгоритм "разделяй и властвуй"
     * 8. Greedy - жадные алгоритмы
     * 9. Dynamic Programming Algorithm -
     */

    //Binary search
    public static int binarySearch(int search, int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (search < array[middle]) {
                end = middle - 1;
            }
            if (search > array[middle]) {
                start = middle + 1;
            }
            if (search == array[middle]) {
                return middle;
            }
        }
        return  - 1;
    }
    //n = 32 32/2=16 ->8 ->4 ->2 ->1 = 5раз log(32)= 5
}
