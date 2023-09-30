import Sort.SingleNonDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNonDuplicateTest {
    @Test
    public void baseCase() {
        SingleNonDuplicate s = new SingleNonDuplicate();
        Assertions.assertEquals(s.singleNonDuplicate(new int[] { 1, 1, 2, 3, 3, 4, 4, 8, 8 }), 2);
        Assertions.assertEquals(s.singleNonDuplicate(new int[] { 3, 3, 7, 7, 10, 11, 11 }), 10);
    }
}
