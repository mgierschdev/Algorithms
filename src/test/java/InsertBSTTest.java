import Tree.InsertBST;
import Util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertBSTTest {
    @Test
    public void baseCase(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        InsertBST i = new InsertBST();
        TreeNode r = i.insertIntoBST(root, 5);
        assertTrue(i.checkIfBST(r));
    }
}