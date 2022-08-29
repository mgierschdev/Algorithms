import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateAllSubsetsTest {

    @Test
    public void baseBitwiseCase(){
        GenerateAllSubsets c = new GenerateAllSubsets();
        List<List<Integer>> result = c.subsetsBitMasking(new int[]{1, 2, 3});
        Integer[][] output = new Integer[][]{{}, {1}, {2}, {1, 2}, {3}, {1, 3}, {2, 3}, {1, 2, 3}};
        for (int k = 0; k < result.size(); k++) {
            List<Integer> list = result.get(k);
            for (int l = 0; l < list.size(); l++) {
                assertEquals(result.get(k).get(l), output[k][l]);
            }
        }
    }

    @Test
    public void baseBacktrackingCase(){
        GenerateAllSubsets c = new GenerateAllSubsets();
        List<List<Integer>> result = c.subsetsBacktracking(new int[]{1, 2, 3});
        Integer[][] output = new Integer[][]{{}, {1}, {1,2}, {1, 2, 3}, {1, 3}, {2}, {2, 3}, {3}};

        for (int k = 0; k < result.size(); k++) {
            List<Integer> list = result.get(k);
            for (int l = 0; l < list.size(); l++) {
                assertEquals(result.get(k).get(l), output[k][l]);
            }
        }
    }

    @Test
    public void cascadingBaseCase(){
        GenerateAllSubsets c = new GenerateAllSubsets();
        List<List<Integer>> result = c.subsetsCascading(new int[]{1, 2, 3});
        Integer[][] output = new Integer[][]{{}, {1}, {1,2}, {1, 2, 3}, {1, 3}, {2}, {2, 3}, {3}};

        for (int k = 0; k < result.size(); k++) {
            List<Integer> list = result.get(k);
            System.out.println(list);
            for (int l = 0; l < list.size(); l++) {
                assertEquals(result.get(k).get(l), output[k][l]);
            }
        }
    }
}