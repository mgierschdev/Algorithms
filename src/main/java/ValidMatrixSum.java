/**
 @date: October 7, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/

 Space/Time Complexity:
 Space: O(n * m)
 Time: O(n * m)
 */

public class ValidMatrixSum {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] output = new int[rowSum.length][colSum.length];

        for(int i = 0; i < rowSum.length; i++){
            for(int j = 0; j < colSum.length; j++){
                int row = rowSum[i], col = colSum[j];

                if(row == 0 || col == 0){
                    output[i][j] = 0;
                    continue;
                }

                if(row == col){
                    output[i][j] = row;
                    rowSum[i] = 0;
                    colSum[j] = 0;
                }else if(row > col){
                    output[i][j] = col;
                    colSum[j] = 0;
                    rowSum[i] = row - col;
                }else{
                    //rowSum[i] < colSum[j]
                    output[i][j] = row;
                    rowSum[i] = 0;
                    colSum[j] = col - row;
                }
            }
        }

        return output;
    }
}
