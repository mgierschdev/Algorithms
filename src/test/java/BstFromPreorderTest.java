import Util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Util.Utils.printPreOrderTraversal;
import static Util.Utils.treeCompare;

class BstFromPreorderTest {

    @Test
    public void baseTest(){
        BstFromPreorder p = new BstFromPreorder();
        int[] input = new int[]{8,5,1,7,10,12};
        TreeNode result = p.bstFromPreorder(input);
        printPreOrderTraversal(result);
        TreeNode expected = new TreeNode(8);
        expected.left = new TreeNode(5);
        expected.right = new TreeNode(10);
        expected.left.left = new TreeNode(1);
        expected.left.right = new TreeNode(7);
        expected.right.right = new TreeNode(12);
        Assertions.assertTrue(treeCompare(result, expected));
    }
}