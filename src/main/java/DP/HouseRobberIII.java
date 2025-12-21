package DP;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import Util.TreeNode;

/**
 @date: October 14, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/house-robber-iii/

 Space/Time Complexity:
 Space: O(n)
 Time: O(n)
 */

public class HouseRobberIII {
    public int rob(TreeNode root) {
        if(root == null){
            return 0;
        }
        int[] answer = robUtil(root);
        return Math.max(answer[0], answer[1]);
    }

    private int[] robUtil(TreeNode node){
        if(node == null){
            return new int[]{0, 0};
        }

        int[] left = robUtil(node.left);
        int[] right = robUtil(node.right);

        int rob = node.val + left[1] + right[1];
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{rob, notRob};
    }
}
