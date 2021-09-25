import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @Test
    public void baseCase(){
       BinarySearch s = new BinarySearch();
       int[] arr = new int[]{-1,0,3,5,9,12};
        assertEquals(s.search(arr, 9), 4);
        assertEquals(s.iterativeBS(arr, 9), 4);
        assertEquals(s.recursiveBS(arr, 9), 4);
    }

    @Test
    public void notFoundCase(){
        BinarySearch s = new BinarySearch();
        int[] arr = new int[]{-1,0,3,5,9,12};
        assertEquals(s.search(arr, 10), -1);
        assertEquals(s.iterativeBS(arr, 10), -1);
        assertEquals(s.recursiveBS(arr, 10), -1);
    }
}