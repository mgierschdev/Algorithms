import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @Test
    public void baseCase(){
        Prime p = new Prime();
        assertEquals(p.isPrime(9), false);
        assertEquals(p.isPrime(5), true);
        assertEquals(p.isPrime(25), false);
    }
}