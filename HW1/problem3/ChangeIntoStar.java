public class ChangeIntoStar {
    public static void changeIntoStar(char[] inputChar, int inputI) {
        if(inputI != 1) {
            for(int i = 24-4*inputI; i<=15+4*inputI; i++) {
                inputChar[i] = '*';
            }
        }
    }
}