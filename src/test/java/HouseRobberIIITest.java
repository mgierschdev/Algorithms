import DP.HouseRobberIII;
import Util.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HouseRobberIIITest {
    @Test
    public void baseCase(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(1);
        root.left.right = new TreeNode(3);
        HouseRobberIII s = new HouseRobberIII();
        assertEquals(s.rob(root), 7);
    }
}