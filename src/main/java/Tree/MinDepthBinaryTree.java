package Tree;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 @date: October 22, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/minimum-depth-of-binary-tree/

 Space/Time Complexity:
 Space: O(n)
 Time: O(n)
 */

public class MinDepthBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int level = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            int size = queue.size();

            while(size -- > 0){

                TreeNode current = queue.poll();

                if(current.left == null && current.right == null){
                    return level;
                }

                if(current.left != null){
                    queue.add(current.left);
                }

                if(current.right != null){
                    queue.add(current.right);
                }
            }
            level++;
        }

        return level;
    }
}
