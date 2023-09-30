package Array;

/**
 @date: October 19, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/

 Space/Time Complexity:
 Space: O(1)
 Time: O(n)
 */

public class MinDominoRotation {
    public int minDominoRotations(int[] A, int[] B) {
        int n = 0;
        int rotationA = 0, rotationB = 0;
        int minRotations = Integer.MAX_VALUE;

        //piece number
        for(int i = 1; i <= 6; i++){
            rotationA = 0;
            rotationB = 0;
            int equal = 0;
            for(int j = 0; j < A.length; j++){
                //if it is not contained, we break
                if(A[j] != i && B[j] != i){
                    n++;
                    break;
                }else if(A[j] == i && B[j] != i){
                    rotationB++;
                }else if(B[j] == i && A[j] != i){
                    rotationA++;
                }else{
                    equal++;
                }
            }
            if(rotationA + equal == A.length || rotationB + equal == A.length || equal == A.length)
                return 0;
            if(rotationB + rotationA + equal == A.length)
                minRotations =  Math.min(minRotations, Math.min(rotationA, rotationB));
        }

        if(n == 6){
            return -1;
        }
        return minRotations;
    }
}