import Util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenTreeTest {
    @Test
    public void baseCase(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(9);
        root.right.left = new TreeNode(7);
        OddEvenTree s = new OddEvenTree();
        assertTrue(s.isEvenOddTree(root));
    }

    @Test
    public void falseCase(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(10);
        root.right.left = new TreeNode(7);
        OddEvenTree s = new OddEvenTree();
        assertFalse(s.isEvenOddTree(root));
    }
}