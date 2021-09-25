import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MinMoveToChangeChipsTest {
    @Test
    public void baseCases(){
        MinMoveToChangeChips e = new MinMoveToChangeChips();
        assertEquals(e.minCostToMoveChips(new int[]{1, 2, 3}), 1);
        assertEquals(e.minCostToMoveChips(new int[]{2, 2, 2, 3, 3}), 2);
        assertEquals(e.minCostToMoveChips(new int[]{1, 1000000000}), 1);
    }
}