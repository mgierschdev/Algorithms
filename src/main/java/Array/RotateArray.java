package Array;

/**
 @date: October 15, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/rotate-array/

 Space/Time Complexity:
 Space: O(1)
 Time: O(n)
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int pos = nums.length - (k % nums.length);
        reverse(nums, 0, pos - 1);
        reverse(nums, pos, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    //Reverse starting from 0 to index and to index-nums.length - 1
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
