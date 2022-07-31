import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class EvalRPNTest {

    @Test
    public void baseCase(){
        EvalRPN r = new EvalRPN();
        String[] input = new String[]{"2", "1", "+", "3", "*"};
        Assertions.assertEquals(r.RPN(input), 9);
    }
}