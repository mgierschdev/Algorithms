package Sort;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


/**
 @date: September 29 2023
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/guess-number-higher-or-lower

 Category: Binary search

 Space/Time Complexity:
 Space: O(1)
 Time: O(log(n))
 */
public class GuessNumber {
    public int guessNumber(int n) {

        int left = 1;
        int right = Integer.MAX_VALUE;

        while(left <= right){
            int mid = (left + right) >>> 1;
            int eval = 0;//guess(mid); Guess -predefined api what returns less == 1, greater = -1, equal = 0

            if(eval == 0){
                return mid;
            }else if(eval == -1){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return -1;
    }
}
