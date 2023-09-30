import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import String.SplitPalindrome;

class SplitPalindromeTest {
    @Test
    public void baseCase(){
        SplitPalindrome c = new SplitPalindrome();
        Assertions.assertTrue(c.checkPalindromeFormation("ulacfd","jizalu"));
    }

    @Test
    public void falseCase(){
        SplitPalindrome c = new SplitPalindrome();
        Assertions.assertFalse(c.checkPalindromeFormation("xbdef","xecab"));
    }
}