import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrayIntoEqualPairsTest {

    @Test
    public void BaseCase(){
        DivideArrayIntoEqualPairs divideArrayIntoEqualPairs = new DivideArrayIntoEqualPairs();
        Assertions.assertTrue(divideArrayIntoEqualPairs.divideArray(new int []{3,2,3,2,2,2}));
    }

}