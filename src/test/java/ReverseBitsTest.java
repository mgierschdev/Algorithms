import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBitsTest {

    @Test
    public void TestBaseCase(){
        ReverseBits reverse = new ReverseBits();
        Assertions.assertEquals(reverse.reverseBits(3), 2);
        Assertions.assertEquals(reverse.reverseBits(100), 2);
    }

}