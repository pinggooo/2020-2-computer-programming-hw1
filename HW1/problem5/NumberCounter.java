public class NumberCounter {
    public static void countNumbers(String str0, String str1, String str2) {

        int num = Integer.parseInt(str0)*Integer.parseInt(str1)*Integer.parseInt(str2);
        String stringNumber = Integer.toString(num);

        char changeChar = 0;
        char[] number = new char[10];


        for(int i=0; i<stringNumber.length(); i++) {
            number[i] = stringNumber.charAt(i);
        }

        for(int j=0; j<stringNumber.length(); j++) {
            for(int k=0; k<stringNumber.length(); k++){
                if(number[j] < number[k]){
                    changeChar = number[j];
                    number[j] = number[k];
                    number[k] = changeChar;
                }
            }
        }

        int p = 0;
        int temp = 0;
        int[] cnt = new int[10];
        char[] numberList = new char[10];

        for(int i=0; i<stringNumber.length(); i++){
            numberList[p] = number[i];
            cnt[p] = cnt[p] + 1;

            if(number[i+1] == number[i]) temp = 1;
            else temp = 0;

            if(temp == 0) p = p + 1;
        }

        for(int i=0; i<p; i++){
            printNumberCount(numberList[i]-48, cnt[i]);
        }
    }

    private static void printNumberCount(int number, int count) {
        System.out.printf("%d: %d times\n", number, count);
    }
}
