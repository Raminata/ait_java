public class Main {
    public static void main(String[] args) {
        //For-Each Loop
        //for (type iteration-var:array)
        //statements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += numbers[i];
        }*/
        int sum = 0;
        for (int x : numbers) {
            sum += x;
            //System.out.println("x = " + x);
        }
        //System.out.println("sum of elements is " + sum);

        //break with for-each
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;
        for(int x : nums) {
            sum1 += x;
            System.out.println("x = " + x);
            if (x == 5) break;
        }
        //System.out.println("sum of elements is " + sum);
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        findElt(nums1, 5);
        //findElt(nums1, 34);

        //The for-each loop is read only
        int[] number1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5};
        System.out.println("numbers1 before");
        for (int x : number1) {
            System.out.print(x + " ");
            x = x * 10;
        }
        System.out.println();
        System.out.println("numbers1 after");
        for (int x : number1) {
            System.out.print(x + " ");
        }
        System.out.println();

        //Multidimensional arrays
        //int[][] table = new int [2][3];
        //table[0][0] = 10;

                       //table[0]  //table[1]
        int[][] table = {{1,2,3}, {4,5,6}};
        //table[0] = {1,2,3}
        //table[0][0] = 1
        //table[0][1] = 2
        //table[0][2] = 3

        //table[0] = {4,5,6}
        //table[0][0] = 4
        //table[0][1] = 5
        //table[0][2] = 6
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    //for-each to find a value
    //int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; value = 5
    public static void findElt(int[] ints, int value) {
        boolean found = false;
        for (int x : ints) {
            if (x == value) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Value found!");
    }
}