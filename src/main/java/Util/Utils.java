package Util;

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
}
