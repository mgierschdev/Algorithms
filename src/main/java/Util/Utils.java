package Util;

import java.time.temporal.Temporal;
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

    public static int hammingDistance(int a, int b){
        int count = 0 ;
        int c = a ^ b;

        while(c != 0){
            count += 1 & c;
            c >>= 1;
        }
        return count;
    }

    public static boolean treeCompare(TreeNode a, TreeNode b){
        if((a == null && b != null) || (b == null && a != null)){
            return false;
        }else if(a == null){
            return true;
        }

        if(a.val != b.val){
            return false;
        }
        return treeCompare(a.left, b.left) && treeCompare(a.right, a.right);
    }

    public static void printPreOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        System.out.println(node.val);
        printPreOrderTraversal(node.left);
        printPreOrderTraversal(node.right);
    }
}
