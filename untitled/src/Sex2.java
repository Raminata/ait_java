
public class Sex2 {
    public static void main(String[] args) {
        //создание массива
        int[] salaries = {100, 200, 300};
        //обратились к 2 элементу в массиве, которые лежит по индексу 1
        //результат 200
        int valueFromIndex1 = salaries[1];
        //*** перебор массива с помощью цикла while
        // инициализируем счетчик индексов
        //Перебор элементов массива arr
        int iAmIndex = 0;
        while (iAmIndex < salaries.length) {                          //Условие выполнения цикла. Если значение true, то тело цикла выполняется int value = arr[iAmIndex];
            int value = salaries[iAmIndex];    //Вытаскиваем элемент из массива по индексу. Где индекс это переменная iAmIndex
            //При первом проходе - iAmIndex = 0, второй проход = 1 и при 3 проходе = 2
            System.out.println(value);         //Выводим результат в консоль
            iAmIndex += 1;                     //Увеличиваем наш индекс на 1 (iAmIndex = iAmIndex + 1)
        }
        //индекс последнего жлемента в массиве
int lastIndex = salaries.length - 1;
        System.out.println("индекс последнего жлемента в массиве " + lastIndex);
        for (int i = 0; i < 5; i++) {
            int value = salaries[i];
            System.out.println(value);

        }
    }
}

