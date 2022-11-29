import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class MergeSortedArrayTest {

    @Test
    public void baseCase() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        int[] expected = new int[] { 1, 2, 2, 3, 5, 6 };
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        Assertions.assertArrayEquals(nums1, expected);

        nums1 = new int[] { 0 };
        nums2 = new int[] { 1 };
        expected = new int[] { 1 };
        mergeSortedArray.merge(nums1, 0, nums2, 1);
        Assertions.assertArrayEquals(nums1, expected);
    }
}
