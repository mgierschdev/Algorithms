import Tree.Codec;
import Util.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodecTest {
    @Test
    public void baseCase(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        Codec c = new Codec();
        String s = c.serialize(root);
        TreeNode copy = c.deserialize(s);
        assertTrue(checkTrees(root, copy));
    }

    public boolean checkTrees(TreeNode one, TreeNode two){
        if(one == null && two == null){
            return true;
        }else if ((one == null && two != null) || (one != null && two == null)){
             return false;
        }
        if(one.val != two.val){
            return false;
        }
        return checkTrees(one.left, two.left) && checkTrees(one.right, two.right);
    }
}