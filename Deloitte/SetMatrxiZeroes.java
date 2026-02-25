import java.util.Arrays;

public class SetMatrxiZeroes {
    public static void main(String[] args) {
        int[][] matrix =    {{1, 1, 1},
                            {1, 0, 1},
                            {1, 1, 1}};
        System.out.println(Arrays.deepToString(setMatrixZeroes(matrix)));
    }

    public static int[][] setMatrixZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] row = new int[m];
        int[] column = new int[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    column[i] = 1;
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(row[i] == 1) {
                    matrix[i][j] = 0;
                }
                if(column[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }return matrix;
    }
}
