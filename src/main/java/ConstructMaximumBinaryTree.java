import Util.TreeNode;

import java.util.Arrays;

public class ConstructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        int[] max = new int[2];
        max[0] = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (max[0] < nums[i]) {
                max[0] = nums[i];
                max[1] = i;
            }
        }

        TreeNode root = new TreeNode(max[0]);
        int[] right = Arrays.copyOfRange(nums, max[1] + 1, nums.length);
        int[] left = Arrays.copyOfRange(nums, 0, max[1]);

        root.right = constructMaximumBinaryTree(right);
        root.left = constructMaximumBinaryTree(left);

        return root;
    }
}
