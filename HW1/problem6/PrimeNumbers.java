public class PrimeNumbers {
    public static void printPrimeNumbers(int n) {
        int cnt = 0;
        int temp = 0;
        int number = 2;

        while(cnt != n){
            if(number == 2) {
                System.out.printf("%d ", number);
                number = number + 1;
                cnt = cnt + 1;
            }
            for(int i = 2; i < number; i++) {
                if(number % i == 0) temp = 1;
                else continue;
            }
            if(temp == 0) {
                System.out.printf("%d ", number);
                number = number + 1;
                cnt = cnt + 1;
            } else {
                number = number + 1;
                temp = 0;
            }
        }
    }
}
