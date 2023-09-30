package Array;

import java.util.HashMap;
/**
 @date: October 3, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: <a href="https://leetcode.com/problems/k-diff-pairs-in-an-array/">...</a>

 Space/Time Complexity:
 Space: O(n): where n is the size of the input
 Time: O(n): where n is the size of the input

 Constraints:
 1 <= nums. Length <= 10^4
 -10^7 <= nums[i] <= 10^7
 0 <= k <= 107
 */
public class KDiffPairs {
    public int findPairs(int[] nums, int k) {
        if(k < 0){
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i : nums){

            if(map.containsKey(i)){
                if(k == 0 && map.get(i) == 1){
                    map.put(i, map.get(i) + 1);
                    count++;
                }
            }else{

                count += map.getOrDefault(i - k, 0);
                count += map.getOrDefault(i + k, 0);
                map.put(i, 1);
            }
        }
        return count;
    }
}
