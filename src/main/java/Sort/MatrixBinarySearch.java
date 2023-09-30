package Sort;

import java.util.Arrays;
/**
 @date: October 16, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/search-a-2d-matrix/

 Space/Time Complexity:
 Space: O(1)
 Time: O(n*(log(n)): where n is the number of rows
 */
public class MatrixBinarySearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        //check boundaries
        if(matrix.length == 0 ||
                matrix[0].length == 0 ||
                target < matrix[0][0] ||
                target > matrix[matrix.length - 1][matrix[0].length -1]){
            return false;
        }

        int i = 0;
        while(i < matrix.length){
            int leftBound = matrix[i][0];
            int rightBound = matrix[i][matrix[0].length - 1];

            if(target == leftBound || target == rightBound){
                return true;
            }else if(target > leftBound && target < rightBound){
                return Arrays.binarySearch(matrix[i], target) >= 0 ? true : false;
            }else{
                i++;
            }
        }
        return false;
    }
}
