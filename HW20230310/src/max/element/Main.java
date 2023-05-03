package max.element;

public class Main {
    public static void main(String[] args) {
        int[] ints = {-10,-5,-3};
        System.out.println("Array length is: " + ints.length);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        MaxElementArray maxElementArray = new MaxElementArray(ints);
        System.out.println();
        System.out.println("Max element of Array is: " + maxElementArray.getMax());
    }
}