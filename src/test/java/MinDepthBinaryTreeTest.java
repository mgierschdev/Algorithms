import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinDepthBinaryTreeTest {
    @Test
    public void baseCase(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        MinDepthBinaryTree i = new MinDepthBinaryTree();
        assertEquals(i.minDepth(root), 2);
    }

    @Test
    public void secondCase(){
        TreeNode root = new TreeNode(4);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(1);
        root.right.right.right = new TreeNode(3);
        MinDepthBinaryTree i = new MinDepthBinaryTree();
        assertEquals(i.minDepth(root), 4);
    }
}