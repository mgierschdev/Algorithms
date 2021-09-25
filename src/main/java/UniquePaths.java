import java.util.Arrays;

/**
 @date: October 2, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/unique-paths
 Similar problem: Cracking the coding interview: Robot grid

 Complexity:
 Time: O(n * m) to process the memo matrix
 Space:  O(n * m) space required by the matrix
 */

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        Arrays.fill(memo[0], 1);
        for(int i = 0; i < m; i++){
            memo[i][0] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                memo[i][j] = memo[i - 1][j] +  memo[i][j - 1];
            }
        }
        return memo[m - 1][n - 1];
    }
}
