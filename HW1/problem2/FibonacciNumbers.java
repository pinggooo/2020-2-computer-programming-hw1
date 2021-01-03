public class FibonacciNumbers {
    public static void printFibonacciNumbers(int n) {
        int cnt = 0;
        int fib = 0;
        int fib1 = 0;
        int fib2 = 1;

        while(cnt < n){
            if(cnt == 0) fib = 0;
            else if(cnt == 1) fib = 1;
            else {
                fib = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib;
            }
            System.out.print(fib + " ");
            cnt++;
        }

    }
}
