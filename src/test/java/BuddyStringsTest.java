import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BuddyStringsTest {
    @Test
    public void baseCase(){
        BuddyStrings c = new BuddyStrings();
        Assertions.assertEquals(c.buddyStrings("ab", "ba"), true);
    }
    @Test
    public void emptyCase(){
        BuddyStrings c = new BuddyStrings();
        Assertions.assertEquals(c.buddyStrings("", ""), false);
    }
    @Test
    public void equalStringsCaseSameCharactersCase(){
        BuddyStrings c = new BuddyStrings();
        Assertions.assertEquals(c.buddyStrings("aa", "aa"), true);
    }
    @Test
    public void falseCase(){
        BuddyStrings c = new BuddyStrings();
        Assertions.assertEquals(c.buddyStrings("aaasdkmsadlkasdwowo", "aaasdkmsadlkasdpopo"), false);
    }
}