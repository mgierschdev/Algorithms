import DP.HouseRobberII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HouseRobberIITest {
    @Test
    public void baseCase(){
        HouseRobberII h = new HouseRobberII();
        Assertions.assertEquals(h.rob(new int[]{1,2,3,1}),4);
    }

    @Test
    public void oneCase(){
        HouseRobberII h = new HouseRobberII();
        Assertions.assertEquals(h.rob(new int[]{1}),1);
    }
}