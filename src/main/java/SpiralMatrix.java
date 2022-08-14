// 54. Leetcode Spiral matrix
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    List<Integer> sol;
    int[][] matrix;

    public List<Integer> spiralOrder(int[][] matrix) {
        sol = new ArrayList<>();
        this.matrix = matrix;
        int m = matrix.length; // rows
        int n = matrix[0].length; // cols
        int layer = 0;

        while (sol.size() < m * n) {
            System.out.println("Layer "+layer+" "+sol.size());
            process(layer, m - 1 - layer, layer, n - 1 - layer); //row1 - row2, col1 - col2
            layer++;
        }

        return sol;
    }

    public void process(int row1, int row2, int col1, int col2) {
        for (int i = col1; i <= col2; i++) {
            sol.add(matrix[row1][i]);
        }

        if (row1 == row2) {
            return;
        }

        //right
        for (int i = row1 + 1; i <= row2; i++) {
            sol.add(matrix[i][col2]);
        }

        if (col1 == col2) {
            return;
        }

        //bot
        for (int i = col2 - 1; i >= col1; i--) {
            sol.add(matrix[row2][i]);
        }

        //left
        for (int i = row2 - 1; i > row1; i--) {
            sol.add(matrix[i][col1]);
        }
    }
}