package Array;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.Arrays;

/**
 @date: October 5, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

 Space/Time Complexity:
 Space: O(1)
 Time: O(n * log(n))
 */

public class SpecialArray {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 0;
        while(j < nums.length){
            if(i <= nums[j]){
                if(i == nums.length - j){
                    return i;
                }
                i++;
            }else{
                j++;
            }
        }
        return -1;
    }
}
