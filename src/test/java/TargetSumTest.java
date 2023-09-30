import DP.TargetSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TargetSumTest {


    @Test
    public void TestBaseCase(){
        TargetSum sum = new TargetSum();
        Assertions.assertEquals(sum.findTargetSumWays(new int[]{1,1,1,1,1}, 3), 5);
        Assertions.assertEquals(sum.findTargetSumWays(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 3), 0);
    }
}