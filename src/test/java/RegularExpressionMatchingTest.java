import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    @Test
    public void BaseTest(){
        RegularExpressionMatching r = new RegularExpressionMatching();
        Assertions.assertFalse(r.isMatch("aa", "a"));
        Assertions.assertTrue(r.isMatch("aa", "a*"));
        Assertions.assertTrue(r.isMatch("ab", ".*"));
    }

}