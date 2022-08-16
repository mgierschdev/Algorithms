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

    public static  int hammingDistance(int a, int b){
        String aa = Integer.toBinaryString(a);
        String bb = Integer.toBinaryString(b);
        int count = 0;

        aa = "0".repeat(32 - aa.length()) + aa;
        bb = "0".repeat(32 - bb.length()) + bb;

        for(int i = 0; i < 32; i++){
            if(aa.charAt(i) != bb.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
