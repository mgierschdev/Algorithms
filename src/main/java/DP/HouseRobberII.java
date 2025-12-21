package DP;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.Arrays;
/**
 @date: October 14, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/house-robber-ii/

 Space/Time Complexity:
 Space: O(n):
 Time: O(n):
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int[] first = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] second = Arrays.copyOfRange(nums, 1, nums.length);

        return Math.max(robUtil(first, first.length - 1, new Integer[nums.length]),
                robUtil(second, second.length - 1, new Integer[nums.length]));
    }

    private int robUtil(int[] nums, int n, Integer[] memo){
        if(n < 0){
            return 0;
        }

        if(memo[n] != null){
            return memo[n];
        }

        memo[n] = Math.max(nums[n] + robUtil(nums, n - 2, memo), robUtil(nums, n-1, memo));
        return memo[n];
    }
}
