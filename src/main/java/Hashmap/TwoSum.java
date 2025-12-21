package Hashmap;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import java.util.HashMap;

public class TwoSum {
    public int[] TwoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(target - nums[i])){
                return new int[]{
                        map.get(target - nums[i]), i};
            }else{
                map.put(nums[i], i);
            }

        }

        return new int[]{-1, -1};
    }
}
