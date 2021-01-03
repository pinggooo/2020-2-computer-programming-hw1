public class CharacterCounter {
    public static void countCharacter(String str) {
        char changeChar = 0;
        char[] str_char = new char[201];

        for(int i=0; i<str.length(); i++) {
            str_char[i] = str.charAt(i);
        }

        for(int j=0; j<str.length(); j++) {
            for(int k=0; k<str.length(); k++) {
                if(str_char[j] < str_char[k]){
                    changeChar = str_char[j];
                    str_char[j] = str_char[k];
                    str_char[k] = changeChar;
                }
            }
        }

        int p = 0;
        int temp = 0;
        int[] cnt = new int[201];
        char[] alphabet = new char[201];

        for(int i=0; i<str.length(); i++) {

            alphabet[p] = str_char[i];
            cnt[p] = cnt[p] + 1;

            if(str_char[i+1] == str_char[i]) {
                temp = 1;
            } else temp = 0;

            if(temp == 0) {
                p = p + 1;
            }
        }

        for(int i=0; i<p; i++){
            printCount(alphabet[i], cnt[i]);
        }
    }

    private static void printCount(char character, int count) {
        System.out.printf("%c: %d times\n", character, count);
    }
}