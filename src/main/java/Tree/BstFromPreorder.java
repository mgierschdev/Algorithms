package Tree;

/*
 * Problem: Unknown (not documented in repository)
 * Goal: Unknown (not documented in repository)
 * Approach: Unknown (not documented in repository)
 * Time: Unknown (not documented in repository)
 * Space: Unknown (not documented in repository)
 */


import Util.TreeNode;

import java.util.Arrays;

public class BstFromPreorder {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0){
            return null;
        }else if(preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }

        TreeNode root = new TreeNode(preorder[0]);
        int end = 1;

        while(end < preorder.length && preorder[0] > preorder[end]){
            end++;
        }

        root.left = bstFromPreorder(Arrays.copyOfRange(preorder, 1, end));
        root.right = bstFromPreorder(Arrays.copyOfRange(preorder, end, preorder.length));

        return root;
    }
}
