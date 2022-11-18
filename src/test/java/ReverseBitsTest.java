import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseBitsTest {

    @Test
    public void TestBaseCase(){
        ReverseBits reverse = new ReverseBits();
        Assertions.assertEquals(reverse.reverseBits(3), -1073741824);
        Assertions.assertEquals(reverse.reverseBits(100), 637534208);
    }

}