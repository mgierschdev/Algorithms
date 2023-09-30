import StackQueue.SmallestSubsequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestSubsequenceTest {
    @Test
    public void baseCase(){
        SmallestSubsequence c = new SmallestSubsequence();
        Assertions.assertEquals(c.smallestSubsequence("bcabc"), "abc");
    }

    @Test
    public void secondCase(){
        SmallestSubsequence c = new SmallestSubsequence();
        Assertions.assertEquals(c.smallestSubsequence("oiasdnalsndlasndlsandklasndklnndndasdad"), "oiadklns");
    }
}