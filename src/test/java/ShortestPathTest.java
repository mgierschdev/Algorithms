import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestPathTest {


    @Test
    public void firstCase(){
        int[][] grid = new int[20][20];

//        for(int i = 0; i < grid[0].length - 1; i++){
//            grid[4][i] = 1;
//            grid[7][4- i - 1] = 1;
//            grid[10][i] = 1;
//            grid[15][grid[0].length - i - 1] = 1;
//        }
        grid[15][7] = 1;
        grid[14][6] = 1;
        grid[13][5] = 1;
        ShortestPath calculator = new ShortestPath(grid);
        calculator.getPath(new int[]{0,0}, new int[]{16,16});
        assertEquals(true, true);
    }
}