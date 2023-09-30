import DP.ClimbStairs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClimbStairsTest {
    @Test
    public void baseCase(){
        ClimbStairs c = new ClimbStairs();
        Assertions.assertEquals(c.climbStairs(1),1);
    }

    @Test
    public void edgeCase(){
        ClimbStairs c = new ClimbStairs();
        Assertions.assertEquals(c.climbStairs(45),1836311903);
    }
}