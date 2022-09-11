import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindComplementTest {

    @Test
    public void BaseCase(){
        FindComplement f = new FindComplement();
        Assertions.assertEquals(f.findComplement(5), 2);
    }

}