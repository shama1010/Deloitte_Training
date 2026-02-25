import java.util.*;

public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 0, 1, 1 }
        };
        System.out.println(numberOfIslands(matrix));
    }

    public static int numberOfIslands(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean[][] visited = new boolean[n][m];
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    List<Integer> shape = new ArrayList<>();
                    dfs(i, j, i, j, matrix, visited, shape);
                    set.add(shape);
                }
            }
        }
        return set.size();
    }

    public static void dfs(int row, int col, int baseRow, int baseCol, int[][] matrix, boolean[][] visited,
    List<Integer> shape) {

        visited[row][col] = true;

        shape.add(row - baseRow);
        shape.add(col - baseCol);

        int[] drow = { -1, 0, 1, 0 };
        int[] dcol = { 0, 1, 0, -1 };

        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];

            if (nrow >= 0 && nrow < matrix.length
                    && ncol >= 0 && ncol < matrix[0].length
                    && matrix[nrow][ncol] == 1
                    && !visited[nrow][ncol]) {

                dfs(nrow, ncol, baseRow, baseCol,
                        matrix, visited, shape);
            }
        }
    }
}