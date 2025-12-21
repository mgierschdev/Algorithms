package Sort;// Leetcode problem 540 Single element in a sorted array in Log(n)

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums){

        int left = 0, right = nums.length - 1;

        while(left < right){
            int mid = (left + right) / 2;

            if((mid % 2 == 0 && nums[mid] ==  nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])){
                left  = mid + 1;
            }else{
                right = mid;
            }
        }

        return nums[left];
    }
}
