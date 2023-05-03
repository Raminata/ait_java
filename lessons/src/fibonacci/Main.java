package fibonacci;

public class Main {
    public static void main(String[] args) {
        //0,+1,+=1,+2,+=3,+=5,+=8,+=13,+=21,+=34,+=55+=89=144
        /**
         * current = 1
         * next = 2
         * sum = current+ next = 3
         * step 2
         * current = next = 2
         * next = sum = 3
         * sum = current + next = 5
         */
        fibonacci(0);
        System.out.println(fibonacci(0));//0 это индекс числа Фибоначчи
        System.out.println(fibonacci(1));//1 это индекс числа Фибоначчи
        System.out.println(fibonacci(2));//1 это индекс числа Фибоначчи
        System.out.println(fibonacci(3));//2 это индекс числа Фибоначчи
        System.out.println(fibonacci(4));//3 это индекс числа Фибоначчи
        System.out.println(fibonacci(5));//5 это индекс числа Фибоначчи

        System.out.println("Via Fibonacci");
        //System.out.println(fibViaArray(0));
        //System.out.println(fibViaArray(1));
        //System.out.println(fibViaArray(2));
        System.out.println(fibViaArray(3));
        //System.out.println(fibViaArray(4));
        //System.out.println(fibViaArray(5));

        System.out.println("fib recursive");
        System.out.println(fibRecursive(0));
        System.out.println(fibRecursive(1));
        System.out.println(fibRecursive(2));
        System.out.println(fibRecursive(3));
        System.out.println(fibRecursive(4));
        System.out.println(fibRecursive(5));

    }

    public static long fibonacci(int n) {//1
        int current = 0;
        int next = 1;

        for (int i = 0; i < n; i++) {//1
            System.out.println("current = " + current);
            System.out.println("next = " + next);
            System.out.println();
            int newFibonacci = current + next;// newFibonacci = 1+1=2
            current = next;//current = 1
            next = newFibonacci;//next = 2
        }
        return current;
    }

    public static long fibViaArray(int n) {
        long[] cache = new long[n + 1];
        if (n < 2)
            return n;
        cache[0] = 0;
        cache[1] = 1;
        for (int i = 2; i < cache.length; i++) {
            cache[i] = cache[i - 2] + cache[i - 1];
            System.out.println("cache[i-2]= " + cache[i]);
            System.out.println("cache[i-1]= " + cache[i]);
            System.out.println("cache[i]= " + cache[i]);
        }
        return cache[n];
    }
    public static int fibRecursive(int n) {
        if (n <= 1)
            return n;
        return fibRecursive(n -1) + fibRecursive(n -2);
    }
}
