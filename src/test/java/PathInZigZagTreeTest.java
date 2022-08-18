import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class PathInZigZagTreeTest {
    @Test
    public void BaseCase(){
        PathInZigZagTree p = new PathInZigZagTree();
        List<Integer> result = p.pathInZigZagTree(14000);
        Integer[] res = new Integer[]{1,3,5,13,20,54,82,218,330,875,1321,3500,5287,14000};
        List<Integer> expected = new LinkedList<>(Arrays.asList(res));
        Assertions.assertEquals(expected, result);
    }
}