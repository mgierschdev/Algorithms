import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Util.Pair;
import java.util.HashSet;
import java.util.List;

class MergeSimilarItemsTest {

    @Test
    public void BaseTest(){
        MergeSimilarItems m = new MergeSimilarItems();
        int[][] items1 = new int[][]{{1,1},{4,5},{3,8}};
        int[][] items2 = new int[][]{{3,1},{1,5}};
        int[][] expected = new int[][]{{1,6},{3,9},{4,5}};

        HashSet<Pair<Integer, Integer>> set = new HashSet<>();
        set.add(new Pair<Integer, Integer>(1, 6));
        
        List<List<Integer>> l = m.mergeSimilarItems(items1, items2);

        for(int i = 0; i < l.size(); i++){

        }
    }
}