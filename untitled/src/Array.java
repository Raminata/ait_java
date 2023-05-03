public class Array {
    public static void main(String[] args) {
        // создали массивы
        int[] myNumbers = {6, 7, 8, 9, 10, 11};
        // .length - чтобы узнать длину массива
        System.out.println("Длина массива: " + myNumbers.length);
        // печатаем второй элемент массива (с индексом 1)
        System.out.println("Элемент под индексом 1: " + myNumbers[1]);

        System.out.println("Элемент с индексом 2 до: " + myNumbers[2]);
        // присвоить новое значение элементу массива под индексом 2
        myNumbers[2] = 22;
        System.out.println("Элемент с индексом 2 после: " + myNumbers[2]);
        int[] friends15 = new int[15]; // создали новый массив, но что в нем лежит?
        System.out.println("Что лежит в массиве по умолчанию? " + friends15[0]);
        System.out.println(friends15);

        System.out.println("__________________");
        String[] fruits = {"apple", "orange", "mango", "lemon", "banana"};
        // напишите цикл - который выводит значния массива в печать
        // вам поможет длинна массива - ее можно получить fruits.length
        // здесь пишите фор
        System.out.println(fruits.length);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits [i]);
        }

    }
}



