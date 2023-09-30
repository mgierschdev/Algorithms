import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import String.BuddyStrings;

class BuddyStringsTest {
    @Test
    public void baseCase(){
        BuddyStrings c = new BuddyStrings();
        Assertions.assertTrue(c.buddyStrings("ab", "ba"));
    }
    @Test
    public void emptyCase(){
        BuddyStrings c = new BuddyStrings();
        Assertions.assertFalse(c.buddyStrings("", ""));
    }
    @Test
    public void equalStringsCaseSameCharactersCase(){
        BuddyStrings c = new BuddyStrings();
        Assertions.assertTrue(c.buddyStrings("aa", "aa"));
    }
    @Test
    public void falseCase(){
        BuddyStrings c = new BuddyStrings();
        Assertions.assertFalse(c.buddyStrings("aaasdkmsadlkasdwowo", "aaasdkmsadlkasdpopo"));
    }
}