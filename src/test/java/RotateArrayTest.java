import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class RotateArrayTest {
    @Test
    public void baseCase(){
        int[] input = new int[]{1,2,3,4,5,6,7};
        int[] output = new int[]{5,6,7,1,2,3,4};
        RotateArray r = new RotateArray();
        r.rotate(input, 3);
        Assertions.assertEquals(Arrays.equals(input, output), true);
    }
}