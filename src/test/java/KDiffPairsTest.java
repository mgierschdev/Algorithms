import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KDiffPairsTest {
    @Test
    public void baseCase(){
        KDiffPairs c = new KDiffPairs();
        Assertions.assertEquals(c.findPairs(new int[]{3, 1, 4, 1, 5}, 2),2);
    }

    @Test
    public void zeroCase(){
        KDiffPairs c = new KDiffPairs();
        Assertions.assertEquals(c.findPairs(new int[]{1,3,1,5,4}, 0),1);
    }

    @Test
    public void notUniqueCase(){
        KDiffPairs c = new KDiffPairs();
        Assertions.assertEquals(c.findPairs(new int[]{1,2,4,4,3,3,0,9,2,3}, 3),2);
    }
}