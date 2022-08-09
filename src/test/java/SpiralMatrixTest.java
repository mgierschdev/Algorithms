import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

    @Test
    public void BaseTest(){
        SpiralMatrix m = new SpiralMatrix();
        int[][] matrix =new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        List<Integer> result = m.spiralOrder(matrix);
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(4);
        list.add(5);

        for (int i = 0; i < result.size(); i++) {
            Assertions.assertEquals(result.get(i), list.get(i));
        }

        System.out.println(" ");

        int[][] matrix2 =new int[][]{
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}};
        m.spiralOrder(matrix2);
    }


}