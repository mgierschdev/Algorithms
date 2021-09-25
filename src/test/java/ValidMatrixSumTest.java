import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidMatrixSumTest {
    @Test
    public void baseCase(){
        ValidMatrixSum c = new ValidMatrixSum();
        int[] rowSum = new int[]{3, 8};
        int[] colSum = new int[]{4, 7};
        int[][] validMatrix = new int[][]{{3, 0}, {1, 7}};
        int[][] output = c.restoreMatrix(rowSum, colSum);
        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                assertEquals(output[i][j], validMatrix[i][j]);
            }
        }
    }
}