import Array.CombinationSum;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {
    @Test
    public void baseCase(){
        CombinationSum c = new CombinationSum();
        int[] input = new int[]{2,3,6,7};
        List<List<Integer>> result = c.combinationSum(input, 7);
        Integer[][] output = new Integer[][]{{2,2,3}, {7}};
        int i = 0, j;

        for(List<Integer> l: result){
            j = 0;
            for(Integer k: l){
                assertEquals(k, output[i][j]);
                j++;
            }
            i++;
        }
    }
}