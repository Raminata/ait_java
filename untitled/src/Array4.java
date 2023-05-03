public class Array4 {
    public static void main(String[] args) {
        int count = 0; // эта переменная покажет нам сколько будет элементов у будущего массива
        for (int i = 1; i <= 97; i+=2) {
//            System.out.println(i); // мы делали для себя - чтобы посмотреть
            count++; // каждый раз увеливаем на единицу
        }
      // System.out.println(count);  //мы посмотерли что получилось
        //System.out.println("______________________________________________");

        int[] oddNumbers = new int[count]; // создали массив - он заполнен нулями
//        oddNumbers[0] = 1; // написали вручную, чтобы понять какой принцип
//        oddNumbers[1] = 3;
//        oddNumbers[2] = 5;

        int index = 0;
        for(int i = 1; i <= 97; i++) {
            if (i % 2 != 0 ) {
                // в этой строке мы не печатаем значения массива - мы печатем переменную i
//                System.out.println(i); // это мы писали, чтобы самим посмотреть каие значения у нас есть
                // на каждой итерации записываются данные в массив
                // мы записываем по индексу в ячейку
                oddNumbers[index] = i;
                // мы распечатать то, что у нас лежит в массиве по индексу
                //System.out.println(oddNumbers[index]);
                index++;
            }
        }

        // отдельно выведем весь массив в печать
        for(int i = 0; i < oddNumbers.length; i++) {
          //  System.out.println(oddNumbers[i]);
        }
       // System.out.println("________________");
        // отдельно выведем массив в обратном порядке // мы не будем менять сам массив

        for(int i = oddNumbers.length-1; i >= 0; i--){
            System.out.println(oddNumbers[i]);
        }
//        int[] special = {3, 7, 8, 10};  // объяснение почему length -1
//        System.out.println(special.length);
//        System.out.println(special[special.length-1]);
    }
}
// ### Задание 1
//        Создайте массив нечетных чисел от 1 до 97.
//        После создания выведите все элементы массива в консоль.
//        После чего выведите этот же массив, но в обратном порядке.






