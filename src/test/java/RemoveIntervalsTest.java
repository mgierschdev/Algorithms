import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveIntervalsTest {
    @Test
    public void baseCase(){
        RemoveIntervals c = new RemoveIntervals();
        Assertions.assertEquals(c.removeCoveredIntervals(new int[][]{{1, 4},{3, 6},{2, 8}}),2);
    }
    @Test
    public void simpleCase(){
        RemoveIntervals c = new RemoveIntervals();
        Assertions.assertEquals(c.removeCoveredIntervals(new int[][]{{1, 4},{2, 3}}),1);
    }
    @Test
    public void nonOverlappingCase(){
        RemoveIntervals c = new RemoveIntervals();
        Assertions.assertEquals(c.removeCoveredIntervals(new int[][]{{0, 10},{5, 12}}),2);
    }
    @Test
    public void inclusiveCase(){
        RemoveIntervals c = new RemoveIntervals();
        Assertions.assertEquals(c.removeCoveredIntervals(new int[][]{{3, 10},{4, 10},{5, 11}}),2);
    }
    @Test
    public void oneOverlappingCase(){
        RemoveIntervals c = new RemoveIntervals();
        Assertions.assertEquals(c.removeCoveredIntervals(new int[][]{{1, 2},{1, 4},{3, 4}}),1);
    }

}