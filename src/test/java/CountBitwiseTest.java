import BitManipulation.CountBitwise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CountBitwiseTest {

    @Test
    void countBitwise() {
        CountBitwise c = new CountBitwise();
        Assertions.assertEquals(c.count(529), 4);
        Assertions.assertEquals(c.count(1041), 5);
        Assertions.assertEquals(c.count(32), 5);
    }

}