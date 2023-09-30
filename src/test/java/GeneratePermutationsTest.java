import DP.GeneratePermutations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class GeneratePermutationsTest {

    @Test
    public void BaseTest(){
        GeneratePermutations g = new GeneratePermutations();
        int[] nums = new int[]{1,2,3};
        int[][] expected = new int[][]{{1,2,3},{1,3,2},{2,1,3},{2,3,1},{3,1,2},{3,2,1}};
        List<int[]> result = g.generatePermutations(nums);

        int index = 0;
        for(int[] i : result){
            Assertions.assertArrayEquals(i, expected[index++]);
        }
    }

}