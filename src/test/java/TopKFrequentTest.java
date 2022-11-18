import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TopKFrequentTest {

    @Test
    public void BaseCase(){
        TopKFrequent t = new TopKFrequent();
        Assertions.assertArrayEquals(t.FindTopKFrequent(new int[]{1,1,1,2,2,3}, 2), new int[]{1, 2});
        Assertions.assertArrayEquals(t.FindTopKFrequent(new int[]{1}, 1), new int[]{1});
        Assertions.assertArrayEquals(t.FindTopKFrequent(new int[]{1,1,1,2,2,3,3,3,3,3,3,9,9,9,9,9,9,9,9,9,9,9,9}, 2), new int[]{9, 3});
    }
}