package wrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Wrapper classes (классы обертки)
        /**
         * boolean byte short char int long float double
         * Boolean Byte Short Character Integer Long Float Double
         * e.g List<Integer>list
         * list.add(5)
         */
        Integer object = new Integer(1);
        System.out.println(object);
        Integer object1 = Integer.valueOf(1);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        Integer number = 2; //autoboxing
        Integer value = 5;
        Integer value1 = Integer.valueOf(5);
        for(Integer i = 0; i < 10; i++){
            System.out.println(i);
        }
        String str = "aaa";
        str = "bbb";
        System.out.println(str);
        int a = 2;
        a = 3;
        System.out.println(a);
    }
}
