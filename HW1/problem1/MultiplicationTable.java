public class MultiplicationTable {
    public static void printMultiplicationTable(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int k = i * j;
                printOneMultiplication(i, j, k);
            }
        }
    }

    private static void printOneMultiplication(int a, int b, int c) {
        System.out.printf("%d times %d = %d\n", a, b, c);
    }
}