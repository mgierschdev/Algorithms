import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RepeatedSubstringPatternTest {
    @Test
    public void baseCase(){
        RepeatedSubstringPattern s = new RepeatedSubstringPattern();
        Assertions.assertTrue(s.repeatedSubstringPattern("abab"));
        Assertions.assertTrue(s.repeatedSubstringPattern("aba"));
    }
}