import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class SpiralMatrixTest {

    @Test
    public void BaseTest(){
        SpiralMatrix m = new SpiralMatrix();
        int[][] matrix =new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        Integer[] r = new Integer[]{1,2,3,6,9,8,7,4,5};
        List<Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(r));
        Assertions.assertEquals(m.spiralOrder(matrix), list);
    }

    @Test
    public void
    UnevenSidesTest(){
        SpiralMatrix m = new SpiralMatrix();
        List<Integer> list = new LinkedList<>();
        Integer[] r = new Integer[]{1,2,3,4,5,6,12,18,17,16,15,14,13,7,8,9,10,11};
        int[][] matrix =new int[][]{
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}};
        list.addAll(Arrays.asList(r));
        Assertions.assertEquals(m.spiralOrder(matrix), list);
    }

    @Test
    public void
    OneSide(){
        SpiralMatrix m = new SpiralMatrix();
        List<Integer> list = new LinkedList<>();
        Integer[] r = new Integer[]{1,2,3,4,5,6};
        int[][] matrix =new int[][]{
                {1, 2, 3, 4, 5, 6}};
        list.addAll(Arrays.asList(r));
        Assertions.assertEquals(m.spiralOrder(matrix), list);
    }


}