package Tree;

import Util.TreeNode;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BalanceBST {
    List<Integer> list;

    public TreeNode balanceBST(TreeNode root) {
        list = new LinkedList<>();
        inOrderTraversal(root);
        int[] s = list.stream().mapToInt(i->i).toArray();
        return buildTree(s);

    }

    public TreeNode buildTree(int[] s){
        if(s.length == 0){
            return null;
        }else if(s.length == 1){
            return new TreeNode(s[0]);
        }

        int mid = s.length / 2;

        TreeNode root = new TreeNode(s[mid]);

        root.left = buildTree(Arrays.copyOfRange(s, 0, mid));
        root.right = buildTree(Arrays.copyOfRange(s, mid + 1, s.length));

        return root;
    }

    public void inOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }

        inOrderTraversal(node.left);
        list.add(node.val);
        inOrderTraversal(node.right);
    }
}
