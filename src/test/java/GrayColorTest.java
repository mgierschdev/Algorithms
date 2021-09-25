import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GrayColorTest {
    @Test
    public void baseCase(){
        GrayColor g = new GrayColor();
        assertEquals(g.minimumOneBitOperations(0), 0);
        assertEquals(g.minimumOneBitOperations(3), 2);
        assertEquals(g.minimumOneBitOperations(9), 14);
        assertEquals(g.minimumOneBitOperations(333), 393);
    }
}