import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class SpiralMatrixTest {

    @Test
    public void BaseTest() {
        SpiralMatrix m = new SpiralMatrix();
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        Integer[] r = new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5};
        List<Integer> list = new LinkedList<>(Arrays.asList(r));
        Assertions.assertEquals(m.spiralOrder(matrix), list);
    }

    @Test
    public void
    UnevenSidesTest() {
        SpiralMatrix m = new SpiralMatrix();
        Integer[] r = new Integer[]{1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11};
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}};
        List<Integer> list = new LinkedList<>(Arrays.asList(r));
        Assertions.assertEquals(m.spiralOrder(matrix), list);
    }

    @Test
    public void
    OneSide() {
        SpiralMatrix m = new SpiralMatrix();
        Integer[] r = new Integer[]{1, 2, 3, 4, 5, 6};
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5, 6}};
        List<Integer> list = new LinkedList<>(Arrays.asList(r));
        Assertions.assertEquals(m.spiralOrder(matrix), list);
    }

    @Test
    public void
    OutsideBoundsTest() {
        SpiralMatrix m = new SpiralMatrix();
        Integer[] r = new Integer[]{1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[][] matrix = new int[][]{{1, 11}, {2, 12}, {3, 13}, {4, 14}, {5, 15}, {6, 16}, {7, 17}, {8, 18}, {9, 19}, {10, 20}};
        List<Integer> list = new LinkedList<>(Arrays.asList(r));
        Assertions.assertEquals(m.spiralOrder(matrix), list);
    }
}