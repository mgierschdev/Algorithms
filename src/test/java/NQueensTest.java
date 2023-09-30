import Array.NQueens;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

class NQueensTest {

    @Test
    public void BaseTestCase(){
        NQueens n = new NQueens();
        List<List<String>> result = new LinkedList<>();
        List<String> l = new LinkedList<>();
        l.add(".Q..");
        l.add("...Q");
        l.add("Q...");
        l.add("..Q.");
        List<String> ll = new LinkedList<>();
        ll.add("..Q.");
        ll.add("Q...");
        ll.add("...Q");
        ll.add(".Q..");
        result.add((l));
        result.add(ll);

        List<List<String>> solution  = n.solveNQueens(4);

        Assertions.assertEquals(result.get(0), solution.get(0));
        Assertions.assertEquals(result.get(1), solution.get(1));
    }
}