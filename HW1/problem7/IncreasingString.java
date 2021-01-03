public class IncreasingString {
    public static void printLongestIncreasingSubstringLength(String inputString) {
        int cnt = 1;
        int[] saveCnt = new int[200];
        char[] strToChar = new char[200];

        for(int i=0; i<inputString.length(); i++) {
            strToChar[i] = inputString.charAt(i);
        }

        for(int j=0; j<inputString.length(); j++) {
            if(strToChar[j] >= strToChar[j+1]) {
                saveCnt[j] = cnt;
                cnt = 1;
            }
            else {
                cnt = cnt + 1;
            }
        }

        int max = 0;

        for(int k=0; k<inputString.length(); k++){
            max = maximum(saveCnt[k], max);
        }

        System.out.println(max);
    }

    private static int maximum(int a, int b){
        if(a>=b) return a;
        else return b;
    }
}
