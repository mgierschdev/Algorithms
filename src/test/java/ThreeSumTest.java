import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

import Array.ThreeSum;
import org.junit.jupiter.api.Test;

public class ThreeSumTest {

    @Test
    public void baseTest() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> expected = new LinkedList<List<Integer>>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        expected.add(Arrays.asList(0, 1, -1));
        int[] input = new int[] { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = threeSum.threeSum(input);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString() + " " + expected.get(i).toString());
            assertEquals(result.get(i).equals(expected.get(i)), true);
        }
    }
}
