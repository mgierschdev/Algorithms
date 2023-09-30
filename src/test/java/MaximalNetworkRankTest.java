import Graph.MaximalNetworkRank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximalNetworkRankTest {
    @Test
    public void baseCase(){
        MaximalNetworkRank c = new MaximalNetworkRank();
        Assertions.assertEquals(c.maximalNetworkRank(4, new int[][]{{0, 1},{0, 3},{1, 2},{1, 3}}), 4);
    }
}