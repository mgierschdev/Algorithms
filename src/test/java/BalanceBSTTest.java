import Util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static Util.Utils.treeCompare;

class BalanceBSTTest {

    @Test
    public void baseTest(){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.left.left = new TreeNode(4);

        BalanceBST b = new BalanceBST();
        TreeNode result = b.balanceBST(node);

        TreeNode expected = new TreeNode(3);
        expected.right = new TreeNode(4);
        expected.left = new TreeNode(1);
        expected.left.right = new TreeNode(2);

        Assertions.assertTrue(treeCompare(expected, result));
    }

}