package Util;

import java.util.List;

public class Utils {

    public static void printMatrix(int[][] grid) {
        for (int[] i : grid) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public static List<Integer> preOrderList(TreeNode node, List<Integer> l){
        if(node == null){
            return l;
        }

        l.add(node.val);

         preOrderList(node.left, l);
         preOrderList(node.right, l);

         return l;
    }
}
