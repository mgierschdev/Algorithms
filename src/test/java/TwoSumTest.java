import Hashmap.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    @Test
    public void BaseCase(){
        TwoSum t = new TwoSum();
        Assertions.assertArrayEquals(t.TwoSum(new int[]{2,7,11,15}, 9), new int[]{0, 1});
        Assertions.assertArrayEquals(t.TwoSum(new int[]{3,2,4}, 7), new int[]{0, 2});
        Assertions.assertArrayEquals(t.TwoSum(new int[]{3,3}, 6), new int[]{0, 1});
    }
}
