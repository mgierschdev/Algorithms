import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {
    @Test
    public void baseCase(){
        EditDistance e = new EditDistance();
        assertEquals(e.minDistance("horse", "ros"),3);
    }

    @Test
    public void minDistanceRecursive(){
        EditDistance e = new EditDistance();
        assertEquals(e.minDistanceRecursive("horse", "rot"), 3);
    }

    @Test
    public void emptyCase(){
        EditDistance e = new EditDistance();
        assertEquals(e.minDistance("", ""),0);
    }

    @Test
    public void oneCharCase(){
        EditDistance e = new EditDistance();
        assertEquals(e.minDistance("1", "2"),1);
    }

    @Test
    public void equalStringsCase(){
        EditDistance e = new EditDistance();
        assertEquals(e.minDistance("lsakdnlkasdnas", "lsakdnlkasdnas"),0);
    }

    @Test
    public void normalCase(){
        EditDistance e = new EditDistance();
        assertEquals(e.minDistance("Germany", "Italy"),5);
    }
}