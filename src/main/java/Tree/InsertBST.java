package Tree;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import Util.TreeNode;

/**
 @date: October 6, 2020
 @author: Maximiliam Gierschmann
 Leetcode reference: https://leetcode.com/problems/insert-into-a-binary-search-tree/

 Space/Time Complexity:
 Space: O(1)
 Time: O(log(n)) , where n is the number of nodes
 */
public class InsertBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(val > root.val){
            root.right = insertIntoBST(root.right, val);
        }else{
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }

    public boolean checkIfBST(TreeNode root){
        if(root == null){
            return true;
        }
        if(root.left != null && root.left.val > root.val){
            return false;
        }
        if(root.right != null && root.right.val < root.val){
            return false;
        }
        return checkIfBST(root.left) && checkIfBST(root.right);
    }
}