import DP.LongestCommonSubsequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceTest {

    @Test
    public void baseCase(){
        LongestCommonSubsequence r = new LongestCommonSubsequence();
        Assertions.assertEquals(r.longestCommonSubsequence("mzyawxu","xmjyauz"), 4);
    }
}