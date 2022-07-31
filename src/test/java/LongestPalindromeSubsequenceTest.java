import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeSubsequenceTest {
    @Test
    public void baseCase(){
        LongestPalindromeSubsequence r = new LongestPalindromeSubsequence();
        Assertions.assertEquals(r.longestPalindromeSubseq("bbbab"), 4);
    }
}