import Graph.PalindromePartition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class PalindromePartitionTest {

    @Test
    public void baseTestCase(){
        PalindromePartition partition = new PalindromePartition();
        List<List<String>> expected = new LinkedList<>();
        expected.add(new LinkedList<>(List.of("a","a","b")));
        expected.add(new LinkedList<>(List.of("aa", "b")));
        List<List<String>> result = partition.partition("aab");
        Assertions.assertEquals(expected, result);
    }
}