import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UniquePathsTest {
    @Test
    public void baseCase(){
        UniquePaths c = new UniquePaths();
        Assertions.assertEquals(c.uniquePaths(3, 7),28);
    }

    @Test
    public void edgeCase(){
        UniquePaths c = new UniquePaths();
        Assertions.assertEquals(c.uniquePaths(100, 5),4421275);
    }

}