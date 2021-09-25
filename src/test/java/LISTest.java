import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LISTest {
    @Test
    public void baseCase(){
        LIS c = new LIS();
        Assertions.assertEquals(c.findNumberOfLIS(new int[]{2,2,2,2,2}), 5);
    }
    @Test
    public void secondCase(){
        LIS c = new LIS();
        Assertions.assertEquals(c.findNumberOfLIS(new int[]{1,3,5,4,7}), 2);
    }
}