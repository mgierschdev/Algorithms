import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SplitPalindromeTest {
    @Test
    public void baseCase(){
        SplitPalindrome c = new SplitPalindrome();
        Assertions.assertEquals(c.checkPalindromeFormation("ulacfd","jizalu"), true);
    }

    @Test
    public void falseCase(){
        SplitPalindrome c = new SplitPalindrome();
        Assertions.assertEquals(c.checkPalindromeFormation("xbdef","xecab"), false);
    }
}