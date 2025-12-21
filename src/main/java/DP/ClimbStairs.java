package DP;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


/**
 @date: October 2, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/climbing-stairs/
 Similar problem: Cracking the coding interview: Triple Step, page 134.

 Complexity:
 Time: O(n) since we are not re-processing already visited branches
 Space: O(n) for the memo array
 */

public class ClimbStairs {
    private Integer[] memo = new Integer[46];

    public int climbStairs(int n) {
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }

        if(memo[n] != null){
            return memo[n];
        }

        memo[n] = climbStairs(n - 1)  +  climbStairs(n - 2);
        return memo[n];
    }
}
