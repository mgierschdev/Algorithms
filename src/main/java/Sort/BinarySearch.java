package Sort;

import java.util.Arrays;
/**
 @date: October 8, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/binary-search/

 Category: Binary search

 Space/Time Complexity:
 Space: O(1)
 Time: O(log(n))
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return  index < 0 ? -1 : index;
    }

    public int recursiveBS(int[] nums, int target){
        return searchUtil(nums, 0, nums.length - 1, target);
    }

    private int searchUtil(int[] nums, int left, int right, int target){
        if(left > right){
            return -1;
        }
        int mid = (left + right) >>> 1;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] < target){
            return searchUtil(nums, mid + 1, right, target);
        }else{
            return searchUtil(nums, left, mid - 1, target);
        }
    }

    public int iterativeBS(int[] nums, int target){
        int low = 0, high = nums.length -1, mid;
        while(low <= high){
            //To avoid sum overflow
            mid = (low + high) >>> 1;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                //search left
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}