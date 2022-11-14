import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {
    @Test
    public void baseCase(){
        EditDistance e = new EditDistance();
        assertEquals(e.minDistance("horse", "ros"),3);
        assertEquals(e.minDistanceRecursive("horse", "ros"), 3);
    }

    @Test
    public void emptyCase(){
        EditDistance e = new EditDistance();
        assertEquals(e.minDistance("", ""),0);
        assertEquals(e.minDistanceRecursive("", ""), 0);
    }

    @Test
    public void oneCharCase(){
        EditDistance e = new EditDistance();
        assertEquals(e.minDistance("1", "2"),1);
        assertEquals(e.minDistanceRecursive("1", "2"), 1);
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
        assertEquals(e.minDistanceRecursive("Germany", "Italy"), 5);
    }

    @Test
    public void equalCase(){
        EditDistance e = new EditDistance();
        assertEquals(e.minDistance("Germany", "Germany"),0);
        assertEquals(e.minDistanceRecursive("Germany", "Germany"), 0);
    }
}