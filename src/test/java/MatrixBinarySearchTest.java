import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixBinarySearchTest {
    @Test
    public void baseCase(){
        MatrixBinarySearch m = new MatrixBinarySearch();
        assertEquals(m.searchMatrix(new int[][]{{1, 3, 4, 12},{13, 14, 16, 17},{20, 21, 32, 35},{40, 50, 60, 80}}, 50),true);
    }

    @Test
    public void falseCase(){
        MatrixBinarySearch m = new MatrixBinarySearch();
        assertEquals(m.searchMatrix(new int[][]{{1, 3, 4, 12},{13, 14, 16, 17},{20, 21, 32, 35},{40, 50, 60, 80}}, 51),false);
    }
}