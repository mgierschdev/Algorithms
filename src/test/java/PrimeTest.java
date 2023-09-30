import org.junit.jupiter.api.Test;

import Math.Prime;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @Test
    public void baseCase(){
        Prime p = new Prime();
        assertFalse(p.isPrime(9));
        assertTrue(p.isPrime(5));
        assertFalse(p.isPrime(25));
    }
}