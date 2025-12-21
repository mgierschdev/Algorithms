package Array;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


/**
 @date: September 29, 2023
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/equal-row-and-column-pairs/

 Category: Matrix comparison

 Space/Time Complexity:
 */
public class EqualPairs {
    public int equalPairs(int[][] grid) {

        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(valid(i, j, grid)){
                    count++;
                }
            }
        }

        return count;
    }

    public boolean valid(int row, int col, int[][] grid){

        for(int i = 0; i < grid.length; i++){
            if(grid[i][row] != grid[col][i]){
                return false;
            }
        }

        return true;
    }
}
