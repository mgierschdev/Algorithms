import Sort.MinNumberOfArrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinNumberOfArrowsTest {
    @Test
    public void baseCase(){
        MinNumberOfArrows c = new MinNumberOfArrows();
        Assertions.assertEquals(c.findMinArrowShots(new int[][]{{10, 16},{2, 8},{1, 6},{7, 12}}),2);
    }
    @Test
    public void secondCase(){
        MinNumberOfArrows c = new MinNumberOfArrows();
        Assertions.assertEquals(c.findMinArrowShots(new int[][]{{1, 2},{3, 4},{5, 6},{7, 8}}),4);
    }
    @Test
    public void emptyCase(){
        MinNumberOfArrows c = new MinNumberOfArrows();
        Assertions.assertEquals(c.findMinArrowShots(new int[][]{}),0);
    }
}