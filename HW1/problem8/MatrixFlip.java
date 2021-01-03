public class MatrixFlip {
    public static void printFlippedMatrix(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(matrix[(row-1)-i][(col-1)-j]);
            }
            System.out.print("\n");
        }
    }
}