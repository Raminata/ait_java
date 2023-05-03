package our.interfaces.interfaces;

import our.interfaces.series.OurConstants;

import static our.interfaces.interfaces.OurConstants.error;

public class MyConstantsClass implements OurConstants {
    public static void main(String[] args) {
        int[] numbers = new int[Max];
        for(int i = MIN; i < 11; i++) {
            if(i > Max) System.out.println(error);
            else {
                numbers[i] = i;
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
