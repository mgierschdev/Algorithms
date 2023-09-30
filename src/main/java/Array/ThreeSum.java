package Array;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length < 3 || nums == null) {
            return result;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            int l = i + 1;
            int k = nums.length - 1;

            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (l < k) {

                int sum = nums[i] + nums[l] + nums[k];
                if (sum == 0) {

                    List<Integer> triplet = new LinkedList<>();

                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[k]);
                    result.add(triplet);

                    while (k > l && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    while (l < k && nums[l] == nums[l + 1]) {
                        l++;
                    }

                    k--;
                    l++;

                } else if (sum <= 0) {
                    l++;
                } else if (sum >= 0) {
                    k--;
                }
            }
        }

        return result;
    }
}
