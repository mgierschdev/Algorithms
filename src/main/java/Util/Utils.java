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

    public int hammingDistance(int a, int b){
        int count = 0 ;
        int c = a ^ b;

        while(c != 0){
            count += 1 & c;
            c >>= 1;
        }
        return count;
    }
}
