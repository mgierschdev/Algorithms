import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSimilarItemsTest {


    @Test

    public void BaseTest(){
        MergeSimilarItems m = new MergeSimilarItems();
        int[][] items1 = new int[][]{{1,1},{4,5},{3,8}};
        int[][] items2 = new int[][]{{3,1},{1,5}};
        int[][] expected = new int[][]{{1,6},{3,9},{4,5}};

        List<List<Integer>> l = m.mergeSimilarItems(items1, items2);

        for(int i = 0; i < l.size(); i++){
            Assertions.assertEquals(l.get(i).get(0), expected[i][0]);
            Assertions.assertEquals(l.get(i).get(1), expected[i][1]);
        }
    }

}