import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindComplementTest {

    @Test
    public void BaseCase(){
        FindComplement f = new FindComplement();
        Assertions.assertEquals(f.findComplement(5), 2);
    }

}