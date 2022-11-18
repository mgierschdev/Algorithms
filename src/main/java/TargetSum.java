import java.util.Arrays;

// 494 target sum, leetcode
public class TargetSum {
    int count = 0;

    public int findTargetSumWays(int[] nums, int target) {
        //DFS(0, nums, target, 0);

        int total = Arrays.stream(nums).sum();
        int[][] dp = new int[nums.length][2 * total + 1];

        dp[0][nums[0] + total] = 1;
        dp[0][-nums[0] + total] += 1;

        for (int i = 1; i < nums.length; i++) {
            for (int sum = -total; sum <= total; sum++) {
                if (dp[i - 1][sum + total] > 0) {
                    dp[i][sum + nums[i] + total] += dp[i - 1][sum + total];
                    dp[i][sum - nums[i] + total] += dp[i - 1][sum + total];
                }
            }
        }

        return Math.abs(target) > total ? 0 : dp[nums.length - 1][target + total];
        // return count;
    }

    private void DFS(int index, int[] nums, int target, int sum) {
        if (sum == target && index == nums.length) {
            count++;
        }

        if (index >= nums.length) {
            return;
        }

        int tmp1 = sum - nums[index];
        int tmp2 = sum + nums[index];

        DFS(index + 1, nums, target, tmp2);
        DFS(index + 1, nums, target, tmp1);
    }
}
