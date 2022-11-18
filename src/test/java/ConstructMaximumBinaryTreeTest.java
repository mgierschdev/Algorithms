import Util.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static Util.Utils.preOrderList;

class ConstructMaximumBinaryTreeTest {

    @Test
    public void BaseCase(){
        ConstructMaximumBinaryTree c = new ConstructMaximumBinaryTree();

        TreeNode root = c.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});

        List<Integer> l = new ArrayList<>();
        l = preOrderList(root, l);
        int[] result = new int[]{6,3,2,1,5,0};

        for (int i = 0; i < l.size(); i++) {
            Assertions.assertEquals(l.get(i), result[i]);
        }
    }

}