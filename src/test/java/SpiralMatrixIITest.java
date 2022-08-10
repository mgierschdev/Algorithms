import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpiralMatrixIITest {

    @Test
    public void BaseCase(){
        SpiralMatrixII m = new SpiralMatrixII();
        int[][] matrix = m.generateMatrix(3);
        int[][] expected = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        Assertions.assertArrayEquals(matrix, expected);
    }
}