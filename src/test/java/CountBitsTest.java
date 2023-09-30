import BitManipulation.CountBits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class CountBitsTest {
    @Test
    public void baseCase(){
        CountBits c = new CountBits();
        Assertions.assertEquals(Arrays.equals(c.countBits(20),new int[]{0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1,2,2,3,2}), true);
    }
}