import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BesTimeVITest {
    @Test
    public void baseCase(){
        BesTimeVI b = new BesTimeVI();
        assertEquals(b.maxProfit(2, new int[]{3,2,6,5,0,3}), 7);
    }
}