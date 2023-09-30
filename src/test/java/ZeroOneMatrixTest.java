import Array.ZeroOneMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZeroOneMatrixTest {
    @Test
    public void baseTestCase() {
        int[][] mat = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        ZeroOneMatrix obj = new ZeroOneMatrix();

        Assertions.assertArrayEquals(obj.calculate(mat), mat);
//
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[0].length; j++) {
//                Assertions.e
//            }
//        }
       // Assertions.assertEquals(obj.calculate(mat), mat);
    }

    @Test
    public void TestCaseTwo() {
        ZeroOneMatrix obj = new ZeroOneMatrix();
        int[][] test2 = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] expected = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};
        Assertions.assertArrayEquals(obj.calculate(test2), expected);
    }


    @Test
    public void TestCaseThree() {
        ZeroOneMatrix obj = new ZeroOneMatrix();
        int[][] test2 = new int[][]{{0, 0, 0, 0},
                                    {0, 1, 0, 0},
                                    {1, 1, 1, 0},
                                    {1, 1, 1, 0}};

        int[][] expected = new int[][]{{0, 0, 0, 0},
                                       {0, 1, 0, 0},
                                       {1, 2, 1, 0},
                                       {2, 2, 1, 0}};

        Assertions.assertArrayEquals(obj.calculate(test2), expected);
    }
}