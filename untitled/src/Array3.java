public class Array3 {
    public static void main(String[] args) {
// arraySize
        int [] arr = new int[5]; // 1st inizialisation

        arr[3]=100500;
        System.out.println(arr[3]);

        arr[1]=arr[3]/100;
        System.out.println(arr[1]);

        int arraySize=arr.length;
        System.out.println("Length Array arr " +arraySize);

        // 2ns initialization
        //           0 1 2 3  4   5  6   - index
        int [] arr2={4,6,8,14,25,35,46}; // size 7
        System.out.println(arr2[3]);
        System.out.println("Length arr2 " + arr2.length);

        int i=0;
        System.out.println(arr2[i]);
        i++; //increment array index
        System.out.println(arr2[i]);
        i++; //
        System.out.println(arr2[i]);
        i++;
        System.out.println(arr2[i]);
        printArray(arr);
        //System.out.println();
        printArray(arr2);
        int[] arr3 = {34,35,456,12,32,23,45,456,567,-1222,234,-123};
        printArray(arr3);

        int [] arr4 = new int [20];

        fillArray(arr4,-5, 5);
        printArray(arr4);


    }
    //                                         минимальное и максимальное число
    public static void fillArray(int [] array, int min, int max){ // Метод который заполняет рандомными значениями все яйчейки массива
        for(int i=0; i<array.length; i++){ // Бежим по нашему массиву
            array[i]=(int) (min + Math.random()*(max+1-min)); // Кладем рандомное значение в текущюю ячейку
        }
    }

    public static void printArray(int [] array){ // Метод который выводит на консоль все эелементы нашего массива
        for(int i = 0; i<array.length; i++){   // i - Индекс запущенный в цикле от 0 до < размер массива
            System.out.print(array[i]+ " ");   // обращение к ячейке массива arr[i] и вывод на консоль
        }
        System.out.println();

    }
}




