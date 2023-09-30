import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Math.ComplementBaseTen;

class ComplementBaseTenTest {
    @Test
    public void baseCase(){
        ComplementBaseTen c = new ComplementBaseTen();
        Assertions.assertEquals(c.bitwiseComplement(5),2);
    }

    @Test
    public void edgeCase(){
        ComplementBaseTen c = new ComplementBaseTen();
        Assertions.assertEquals(c.bitwiseComplement(1000000000),73741823);
    }

    @Test
    public void maxIntegerCase(){
        ComplementBaseTen c = new ComplementBaseTen();
        Assertions.assertEquals(c.bitwiseComplement(2147483646),1);
    }
}