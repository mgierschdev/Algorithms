import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RecentCounterTest {

    @Test
    public void baseCase(){
        RecentCounter c = new RecentCounter();
        int[] input = new int[]{1, 100, 3001, 3002};
        int[] result = new int[]{1, 2, 3, 3};
        int resultIndex = 0;
        for(int i : input){
            assertEquals(c.ping(i),result[resultIndex++]);
        }
    }

    @Test
    public void edgeCase(){
        RecentCounter c = new RecentCounter();
        for(int i = 1; i < 302; i++){
            assertEquals(c.ping(i), i);
        }
    }
}