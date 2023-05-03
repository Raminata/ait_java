public class Main {
    public static void main(String[] args) {
       /*Задача 1 Написать метод, который проверяет равенство двух массивов
       целых чисел.
public static boolean areEqual( int[] numbers,int[]numbers1)
пример: {1,2,3} и {1,2,3} равны. {1,2,3} и {1,3,2} нет  */
        int[][] table = {{1,2,3}, {1,2,3}};
        boolean arrEq= areEqual(table[0], table[1]);
        System.out.println(arrEq);
    }

    public static boolean areEqual(int[] numbers, int[] numbers1) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != numbers1[i]) {
                return false;
            }
        }
        return true;
    }
}