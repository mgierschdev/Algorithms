package Util;

/*
Problem: Represent a binary tree node shared across tree-based algorithms.
Goal: Provide a minimal mutable container for value and left/right children.
Approach: Public fields with convenience constructors for quick assembly in tests and algorithms.
Time: O(1) per field access or mutation.
Space: O(1) per node instance.
Tags: tree, data-structure
*/
//Definition for a binary tree node.
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
