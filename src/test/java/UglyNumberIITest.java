import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Math.UglyNumberII;

class UglyNumberIITest {

    @Test
    public void BaseTest(){
        UglyNumberII u = new UglyNumberII();
        int result = u.nthUglyNumber(100);
        assertEquals(result, 1536);
    }

}