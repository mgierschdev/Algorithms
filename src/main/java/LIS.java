import java.util.Arrays;
/**
 @date: Nov 5, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference:

 Space/Time Complexity:
 Space: O(n * n): where n is the size of the input
 Time: O(n * n): where n is the size of the input
 */
public class LIS {

    public int findNumberOfLIS(int[] nums) {
        int[] count = new int[nums.length];
        int[] lis = new int[nums.length];
        Arrays.fill(lis, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    if(count[j] >= count[i]){
                        count[i] = count[j] + 1;
                        lis[i] = lis[j];
                    }else if(count[j] + 1 == count[i]){
                        lis[i] += lis[j];
                    }
                }
            }
        }

        int number = 0, longest = 0;
        for(int l : count){
            longest = Math.max(longest, l);
        }

        for(int k = 0; k < nums.length;  k++){
            if(count[k] == longest)
                number += lis[k];
        }

        return number;
    }
}